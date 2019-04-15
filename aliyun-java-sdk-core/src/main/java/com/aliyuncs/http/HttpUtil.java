package com.aliyuncs.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.StringUtils;

public class HttpUtil {

    private final static Log log = LogFactory.getLog(HttpUtil.class);

    private static Boolean isHttpDebug;

    private static Boolean isHttpContentDebug;

    static {
        Boolean flag = "sdk".equalsIgnoreCase(System.getenv("DEBUG"));
        isHttpDebug = flag;
        isHttpContentDebug = flag;
    }

    public static Boolean getIsHttpDebug() {
        return isHttpDebug;
    }

    public static void setIsHttpDebug(Boolean isHttpDebug) {
        HttpUtil.isHttpDebug = isHttpDebug;
    }

    public static Boolean getIsHttpContentDebug() {
        return isHttpContentDebug;
    }

    public static void setIsHttpContentDebug(Boolean isHttpContentDebug) {
        HttpUtil.isHttpContentDebug = isHttpContentDebug;
    }

    public static String debugHttpRequest(HttpRequest request) {
        if (isHttpDebug) {
            StringBuilder debugString = new StringBuilder();

            String sysUrl = request.getSysUrl();
            URL url = null;
            try {
                url = new URL(sysUrl);
                debugString.append("> " + request.getSysMethod() + " " + url.getProtocol().toUpperCase() + "/1.1\n> ");
                debugString.append("Host : " + url.getHost() + "\n> ");
            } catch (MalformedURLException e) {
                debugString.append("> " + request.getSysMethod() + " " + sysUrl + "\n> ");
                debugString.append("Host : " + sysUrl + "\n> ");
            }
            Map<String, String> requestHeaders = request.getSysHeaders();
            for (Entry<String, String> entry : requestHeaders.entrySet()) {
                debugString.append(entry.getKey() + " : " + entry.getValue() + "\n> ");
            }
            debugString.append("Request URL : " + sysUrl + "\n> ");
            if (isHttpContentDebug) {
                try {
                    debugString.append("\n" + request.getHttpContentString());
                } catch (ClientException e) {
                    debugString.append("\n" + "Can not parse response due to unsupported encoding : " + request
                            .getSysEncoding());
                }
            }
            log.info("\n" + debugString);
            return debugString.toString();
        } else {
            return null;
        }
    }

    public static String debugHttpResponse(HttpResponse response) {
        if (isHttpDebug) {
            StringBuilder debugString = new StringBuilder();
            String protocol = "HTTP/1.1";
            debugString.append("< " + protocol + " " + response.getStatus() + "\n< ");
            Map<String, String> responseHeaders = response.getSysHeaders();
            for (Entry<String, String> entry : responseHeaders.entrySet()) {
                debugString.append(entry.getKey() + " : " + entry.getValue() + "\n< ");
            }
            if (isHttpContentDebug) {
                try {
                    debugString.append("\n" + response.getHttpContentString());
                } catch (ClientException e) {
                    debugString.append("\n" + "Can not parse response due to unsupported encoding : " + response
                            .getSysEncoding());
                }
            }
            log.info("\n" + debugString);
            return debugString.toString();
        } else {
            return null;
        }
    }

    public static Proxy getJDKProxy(String clientProxy, String envProxy, HttpRequest request) throws ClientException {
        Proxy proxy = Proxy.NO_PROXY;
        try {
            String proxyStr = (!StringUtils.isEmpty(clientProxy) ? clientProxy : envProxy);
            if (StringUtils.isEmpty(proxyStr)) {
                return proxy;
            }
            URL proxyUrl = new URL(proxyStr);

            String userInfo = proxyUrl.getUserInfo();
            if (userInfo != null) {
                byte[] bytes = userInfo.getBytes("UTF-8");
                String auth = DatatypeConverter.printBase64Binary(bytes);
                request.putHeaderParameter("Proxy-Authorization", "Basic " + auth);
            }
            String hostname = proxyUrl.getHost();
            int port = proxyUrl.getPort();
            if (port == -1) {
                port = proxyUrl.getDefaultPort();
            }
            SocketAddress addr = new InetSocketAddress(hostname, port);
            proxy = new Proxy(Proxy.Type.HTTP, addr);

        } catch (IOException e) {
            throw new ClientException("SDK.InvalidProxy", "proxy url is invalid");
        }
        return proxy;
    }

    public static HttpHost getApacheProxy(String clientProxy, String envProxy, HttpRequest request)
            throws ClientException {
        try {
            String proxyStr = (!StringUtils.isEmpty(clientProxy) ? clientProxy : envProxy);
            if (StringUtils.isEmpty(proxyStr)) {
                return null;
            }
            URL proxyUrl = new URL(proxyStr);
            String userInfo = proxyUrl.getUserInfo();
            if (userInfo != null) {
                byte[] bytes = userInfo.getBytes("UTF-8");
                String auth = DatatypeConverter.printBase64Binary(bytes);
                request.putHeaderParameter("Proxy-Authorization", "Basic " + auth);
            }
            return new HttpHost(proxyUrl.getHost(), proxyUrl.getPort(), proxyUrl.getProtocol());

        } catch (IOException e) {
            throw new ClientException("SDK.InvalidProxy", "proxy url is invalid");
        }
    }

    public static boolean needProxy(String targetHost, String clientNoProxyList, String envNoProxyList) {
        String noProxyList = (!StringUtils.isEmpty(clientNoProxyList) ? clientNoProxyList : envNoProxyList);
        if (StringUtils.isEmpty(noProxyList)) {
            return true;
        }
        String[] noProxyArr = noProxyList.split(",");
        for (String host : noProxyArr) {
            if (host.equals(targetHost)) {
                return false;
            }
        }
        return true;
    }
}
