package com.aliyuncs;

import com.aliyuncs.auth.*;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.utils.ParameterHelper;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class RoaAcsRequest<T extends AcsResponse> extends AcsRequest<T> {

    protected String uriPattern = null;
    private Map<String, String> pathParameters = new HashMap<String, String>();

    public RoaAcsRequest(String product) {
        super(product);
        initialize();
    }

    public RoaAcsRequest(String product, String version, String action) {
        super(product);
        this.setSysVersion(version);
        this.setSysActionName(action);
        initialize();
    }

    public RoaAcsRequest(String product, String version, String action, String locationProduct) {
        super(product);
        this.setSysVersion(version);
        this.setSysActionName(action);
        this.setSysLocationProduct(locationProduct);
        initialize();
    }

    public RoaAcsRequest(String product, String version, String action, String locationProduct, String endpointType) {
        super(product);
        this.setSysVersion(version);
        this.setSysActionName(action);
        this.setSysLocationProduct(locationProduct);
        this.setSysEndpointType(endpointType);
        initialize();
    }

    private void initialize() {
        this.composer = RoaSignatureComposer.getComposer();
        this.setHttpContentType(FormatType.FORM);
        this.setHttpContent(new byte[0], "utf-8", null);
    }

    @Override
    public void setVersion(String version) {
        super.setVersion(version);
        this.putHeaderParameter("x-acs-version", version);
    }

    @Override
    public void setSecurityToken(String securityToken) {
        super.setSecurityToken(securityToken);
        this.putHeaderParameter("x-acs-security-token", securityToken);
    }

    @Override
    public void setSysVersion(String version) {
        super.setSysVersion(version);
        this.putHeaderParameter("x-acs-version", version);
    }

    public Map<String, String> getPathParameters() {
        return Collections.unmodifiableMap(pathParameters);
    }

    protected void putPathParameter(String name, Object value) {
        setParameter(this.pathParameters, name, value);
    }

    protected void putPathParameter(String name, String value) {
        setParameter(this.pathParameters, name, value);
    }

    @Override
    public String composeUrl(String endpoint, Map<String, String> queries) throws UnsupportedEncodingException {
        Map<String, String> mapQueries = (queries == null) ? this.getSysQueryParameters() : queries;
        StringBuilder urlBuilder = new StringBuilder("");
        urlBuilder.append(this.getSysProtocol().toString());
        urlBuilder.append("://").append(endpoint);
        if (null != this.uriPattern) {
            urlBuilder.append(RoaSignatureComposer.replaceOccupiedParameters(uriPattern, this.getPathParameters()));
        }
        if (-1 == urlBuilder.indexOf("?")) {
            urlBuilder.append("?");
        } else if (!urlBuilder.toString().endsWith("?")) {
            urlBuilder.append("&");
        }
        String query = concatQueryString(mapQueries);
        String url = urlBuilder.append(query).toString();
        if (url.endsWith("?") || url.endsWith("&")) {
            url = url.substring(0, url.length() - 1);
        }
        return url;
    }

    /**
     * @Deprecated : Use getSysUriPattern instead of this
     */
    @Deprecated
    public String getUriPattern() {
        return uriPattern;
    }

    /**
     * @Deprecated : Use setSysUriPattern instead of this
     */
    @Deprecated
    public void setUriPattern(String uriPattern) {
        this.uriPattern = uriPattern;
    }

    public String getSysUriPattern() {
        return uriPattern;
    }

    public void setSysUriPattern(String uriPattern) {
        this.uriPattern = uriPattern;
    }

    @Override
    public HttpRequest signRequest(Signer signer, AlibabaCloudCredentials credentials, FormatType format,
                                   ProductDomain domain) throws InvalidKeyException, IllegalStateException,
            UnsupportedEncodingException, NoSuchAlgorithmException {
        Map<String, String> bodyParams = this.getSysBodyParameters();
        if (bodyParams != null && !bodyParams.isEmpty()) {
            byte[] data;
            if (FormatType.JSON == this.getHttpContentType()) {
                data = ParameterHelper.getJsonData(bodyParams);
            } else if (FormatType.XML == this.getHttpContentType()) {
                data = ParameterHelper.getXmlData(bodyParams);
            } else {
                // For contentType RAW and Form, the actual data format will be form
                data = ParameterHelper.getFormData(bodyParams);
            }
            this.setHttpContent(data, "UTF-8", null);
        }

        Map<String, String> imutableMap = new HashMap<String, String>(this.getSysHeaders());
        if (null != signer && null != credentials) {
            String accessKeyId = credentials.getAccessKeyId();
            imutableMap = this.composer.refreshSignParameters(this.getSysHeaders(), signer, accessKeyId, format);
            imutableMap.put("RegionId", this.getSysRegionId());
            if (credentials instanceof BasicSessionCredentials) {
                String sessionToken = ((BasicSessionCredentials) credentials).getSessionToken();
                if (null != sessionToken) {
                    imutableMap.put("x-acs-security-token", sessionToken);
                }
            }
            if (credentials instanceof BearerTokenCredentials) {
                String bearerToken = ((BearerTokenCredentials) credentials).getBearerToken();
                if (null != ((BearerTokenCredentials) credentials).getBearerToken()) {
                    imutableMap.put("x-acs-bearer-token", bearerToken);
                }
            }
            String strToSign = this.composer.composeStringToSign(this.getSysMethod(), this.getSysUriPattern(), signer,
                    this.getSysQueryParameters(), imutableMap, this.getPathParameters());
            String signature = signer.signString(strToSign, credentials);
            imutableMap.put("Authorization", "acs " + accessKeyId + ":" + signature);
        }
        this.setSysUrl(this.composeUrl(domain.getDomainName(), this.getSysQueryParameters()));
        this.headers = imutableMap;
        return this;
    }
}
