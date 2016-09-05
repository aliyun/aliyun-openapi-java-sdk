package com.aliyuncs.cms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.aliyuncs.AcsRequest;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.ProductDomain;

/**
 * Created by fray.yangb-然诺 on 16/4/26.
 */
public class CmsPostClient extends DefaultAcsClient {

	public CmsPostClient() {
		super();
	}

	public CmsPostClient(IClientProfile profile) {
		super(profile);
	}

	public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry, int maxRetryNumber,
			String regionId, Credential credential, ISigner signer, FormatType format, List<Endpoint> endpoints)
			throws ClientException, ServerException {
		try {
			FormatType requestFormatType = request.getAcceptFormat();
			if (null != requestFormatType) {
				format = requestFormatType;
			}
			if (null == request.getRegionId()) {
				request.setRegionId(regionId);
			}
			ProductDomain domain = Endpoint.findProductDomain(regionId, request.getProduct(), endpoints);
			if (null == domain) {
				throw new ClientException("SDK.InvalidRegionId", "Can not find endpoint to access.");
			}
			HttpRequest httpRequest = request.signRequest(signer, credential, format, domain);
			int retryTimes = 1;
			HttpResponse response = getResponse(httpRequest, (BodyHttpRequest) request);
			while (500 <= response.getStatus() && autoRetry && retryTimes < maxRetryNumber) {
				httpRequest = request.signRequest(signer, credential, format, domain);
				response = getResponse(httpRequest, (BodyHttpRequest) request);
				retryTimes++;
			}
			return response;
		} catch (InvalidKeyException exp) {
			throw new ClientException("SDK.InvalidAccessSecret", "Speicified access secret is not valid.");
		} catch (SocketTimeoutException exp) {
			throw new ClientException("SDK.ServerUnreachable",
					"SocketTimeoutException has occurred on a socket read or accept.");
		} catch (IOException exp) {
			throw new ClientException("SDK.ServerUnreachable", "Speicified endpoint or uri is not valid.");
		} catch (NoSuchAlgorithmException exp) {
			throw new ClientException("SDK.InvalidMD5Algorithm", "MD5 hash is not supported by client side.");
		}
	}

	public HttpResponse getResponse(HttpRequest httpRequest, BodyHttpRequest request) throws IOException {
		HttpResponse response = null;

		HttpURLConnection conn = this.getConnection(request.getUrl());
		Map<String, String> parameter = request.getBodyParameter();
		this.post(conn, parameter);
		int statusCode = conn.getResponseCode();
		response = new HttpResponse(httpRequest.getUrl());
		response.setStatus(statusCode);
		for (String name : conn.getHeaderFields().keySet()) {
			response.putHeaderParameter(name, conn.getHeaderField(name));
		}
		String type = response.getHeaderValue("Content-Type");
		if (null != type) {
			response.setEncoding("UTF-8");
			String[] split = type.split(";");
			response.setContentType(FormatType.mapAcceptToFormat(split[0].trim()));
			if (split.length > 1 && split[1].contains("=")) {
				String[] codings = split[1].split("=");
				response.setEncoding(codings[1].trim().toUpperCase());
			}
		}
		byte[] body = this.readBytes(conn);
		response.setContent(body, response.getEncoding(), response.getContentType());
		return response;
	}

	private void post(HttpURLConnection conn, Map<String, String> params) throws IOException {
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setDoInput(true);
		StringBuilder builder = new StringBuilder();
		for (Entry<String, String> entry : params.entrySet()) {
			String key = URLEncoder.encode(entry.getKey(), "utf-8");
			String value = URLEncoder.encode(entry.getValue(), "utf-8");
			builder.append(key);
			builder.append("=");
			builder.append(value);
			builder.append("&");
		}
		builder.deleteCharAt(builder.length() - 1);
		byte[] bytes = builder.toString().getBytes("utf-8");
		BufferedOutputStream out = null;
		try {
			out = new BufferedOutputStream(conn.getOutputStream());
			out.write(bytes);
			out.flush();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private HttpURLConnection getConnection(String url) throws IOException {
		HttpURLConnection conn = null;
		URL conurl = this.getURL(url);
		conn = (HttpURLConnection) conurl.openConnection();
		conn.setConnectTimeout(5000);
		conn.setReadTimeout(5000);
		return conn;
	}

	private URL getURL(String url) {
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	public byte[] readBytes(HttpURLConnection conn) throws IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream(8 * 1024);
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(conn.getInputStream());
			int i = -1;
			while ((i = in.read()) != -1) {
				buffer.write(i);
			}
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return buffer.toByteArray();
	}
}
