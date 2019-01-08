package com.aliyuncs;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.OssSignatureComposer;
import com.aliyuncs.auth.RoaSignatureComposer;
import com.aliyuncs.auth.Signer;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.regions.ProductDomain;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public abstract class OssAcsRequest<T extends AcsResponse>
        extends RoaAcsRequest<T> {

    private String bucketName = null;

    public OssAcsRequest(String product, String actionName) {
        super(product);
        this.setSysActionName(actionName);
        this.composer = OssSignatureComposer.getComposer();
    }

    @Override
    public void setVersion(String version) {
    }

    @Override
    public String composeUrl(String endpoint, Map<String, String> queries) throws UnsupportedEncodingException {
        Map<String, String> mapQueries = queries == null ? this.getSysQueryParameters() : queries;
        StringBuilder urlBuilder = new StringBuilder("");
        urlBuilder.append(this.getSysProtocol().toString());
        urlBuilder.append("://");
        if (null != this.bucketName) {
            urlBuilder.append(this.bucketName).append(".");
        }
        urlBuilder.append(endpoint);
        if (null != this.uriPattern) {
            urlBuilder.append(
                    RoaSignatureComposer.replaceOccupiedParameters
                            (uriPattern, this.getPathParameters()));
        }
        if (-1 == urlBuilder.indexOf("?")) {
            urlBuilder.append("?");
        }
        String query = concatQueryString(mapQueries);

        return urlBuilder.append(query).toString();
    }

    @Override
    public HttpRequest signRequest(Signer signer, AlibabaCloudCredentials credentials, FormatType format,
                                   ProductDomain domain) throws InvalidKeyException, IllegalStateException,
            UnsupportedEncodingException, NoSuchAlgorithmException {
        Map<String, String> imutableMap = new HashMap<String, String>(this.getHeaders());
        if (null != signer && null != credentials) {
            String accessKeyId = credentials.getAccessKeyId();
            imutableMap = this.composer.refreshSignParameters
                    (this.getSysHeaders(), signer, accessKeyId, format);
            String uri = this.uriPattern;
            if (null != this.bucketName) {
                uri = "/" + bucketName + uri;
            }
            String strToSign = this.composer.composeStringToSign(this.getSysMethod(), uri, signer,
                    this.getSysQueryParameters(), imutableMap, this.getPathParameters());
            String signature = signer.signString(strToSign, credentials);
            imutableMap.put("Authorization", "OSS " + accessKeyId + ":" + signature);
        }
        HttpRequest request = new HttpRequest(
                this.composeUrl(domain.getDomianName(), this.getSysQueryParameters()), imutableMap);
        request.setSysMethod(this.getSysMethod());
        request.setHttpContent(this.getHttpContent(), this.getSysEncoding(), this.getHttpContentType());

        return request;
    }

    @Override
    public abstract Class<T> getResponseClass();
}
