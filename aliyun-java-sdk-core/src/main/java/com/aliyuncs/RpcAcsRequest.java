package com.aliyuncs;

import com.aliyuncs.auth.*;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.utils.ParameterHelper;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

public abstract class RpcAcsRequest<T extends AcsResponse> extends AcsRequest<T> {

    public RpcAcsRequest(String product) {
        super(product);
        initialize();
    }

    public RpcAcsRequest(String product, String version, String action) {
        super(product);
        this.setSysVersion(version);
        this.setSysActionName(action);
        initialize();
    }

    public RpcAcsRequest(String product, String version, String action, String locationProduct) {
        super(product);
        this.setSysVersion(version);
        this.setSysActionName(action);
        this.setSysLocationProduct(locationProduct);
        initialize();
    }

    public RpcAcsRequest(String product, String version, String action, String locationProduct, String endpointType) {
        super(product);
        this.setSysVersion(version);
        this.setSysActionName(action);
        this.setSysLocationProduct(locationProduct);
        this.setSysEndpointType(endpointType);
        initialize();
    }

    private void initialize() {
        this.setSysMethod(MethodType.GET);
        this.setSysAcceptFormat(FormatType.JSON);
        this.setHttpContentType(FormatType.FORM);
        this.composer = RpcSignatureComposer.getComposer();
    }

    @Override
    public void setActionName(String actionName) {
        super.setActionName(actionName);
        this.putQueryParameter("Action", actionName);
    }

    @Override
    public void setVersion(String version) {
        super.setVersion(version);
        this.putQueryParameter("Version", version);
    }

    @Override
    public void setSecurityToken(String securityToken) {
        super.setSecurityToken(securityToken);
        this.putQueryParameter("SecurityToken", securityToken);
    }

    @Override
    public void setAcceptFormat(FormatType acceptFormat) {
        super.setAcceptFormat(acceptFormat);
        this.putQueryParameter("Format", acceptFormat.toString());
    }

    @Override
    public void setSysActionName(String actionName) {
        super.setSysActionName(actionName);
        this.putQueryParameter("Action", actionName);
    }

    @Override
    public void setSysVersion(String version) {
        super.setSysVersion(version);
        this.putQueryParameter("Version", version);
    }

    @Override
    public void setSysAcceptFormat(FormatType acceptFormat) {
        super.setSysAcceptFormat(acceptFormat);
        this.putQueryParameter("Format", acceptFormat.toString());
    }

    @Override
    public void setSysSecurityToken(String securityToken) {
        super.setSysSecurityToken(securityToken);
        this.putQueryParameter("SecurityToken", securityToken);
    }

    @Override
    public String composeUrl(String endpoint, Map<String, String> queries) throws UnsupportedEncodingException {
        Map<String, String> mapQueries = (queries == null) ? this.getSysQueryParameters() : queries;
        StringBuilder urlBuilder = new StringBuilder("");
        urlBuilder.append(this.getSysProtocol().toString());
        urlBuilder.append("://").append(endpoint);
        if (-1 == urlBuilder.indexOf("?")) {
            urlBuilder.append("/?");
        }
        String query = concatQueryString(mapQueries);
        return urlBuilder.append(query).toString();
    }

    @Override
    public HttpRequest signRequest(Signer signer, AlibabaCloudCredentials credentials, FormatType format,
            ProductDomain domain) throws InvalidKeyException, IllegalStateException, UnsupportedEncodingException {

        Map<String, String> imutableMap = new HashMap<String, String>(this.getSysQueryParameters());
        if (null != signer && null != credentials) {
            String accessKeyId = credentials.getAccessKeyId();
            String accessSecret = credentials.getAccessKeySecret();
            if (credentials instanceof BasicSessionCredentials) {
                String sessionToken = ((BasicSessionCredentials) credentials).getSessionToken();
                if (null != sessionToken) {
                    this.putQueryParameter("SecurityToken", sessionToken);
                }
            }
            if (credentials instanceof BearerTokenCredentials) {
                String bearerToken = ((BearerTokenCredentials) credentials).getBearerToken();
                if (null != ((BearerTokenCredentials) credentials).getBearerToken()) {
                    this.putQueryParameter("BearerToken", bearerToken);
                }
            }
            imutableMap = this.composer.refreshSignParameters(this.getSysQueryParameters(), signer, accessKeyId, format);
            imutableMap.put("RegionId", getSysRegionId());

            Map<String, String> paramsToSign = new HashMap<String, String>(imutableMap);
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
                paramsToSign.putAll(bodyParams);
            }
            String strToSign = this.composer.composeStringToSign(
                    this.getSysMethod(), null, signer, paramsToSign, null, null);
            String signature;
            if (credentials instanceof KeyPairCredentials) {
                signature = signer.signString(strToSign, credentials);
            } else {
                signature = signer.signString(strToSign, accessSecret + "&");
            }
            imutableMap.put("Signature", signature);
            this.strToSign = strToSign;
        }
        setSysUrl(this.composeUrl(domain.getDomainName(), imutableMap));
        return this;
    }
}
