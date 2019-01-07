package com.aliyuncs.ft.model;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.HmacSHA1Signer;
import com.aliyuncs.auth.Signer;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.utils.ParameterHelper;

public class RpcDubboApiRequest extends RpcAcsRequest<RpcDubboApiResponse> {

    private String requiredValue = "testSignatureV2ForSDK";

    private String success = "true";

    public RpcDubboApiRequest() {
        super("Ft", "2015-01-01", "RpcDubboApi");
        putQueryParameter("RequiredValue", this.requiredValue);
        putQueryParameter("Success", this.success);
    }

    public String getRequiredValue() {
        return requiredValue;
    }

    public void setRequiredValue(String requiredValue) {
        this.requiredValue = requiredValue;
        putQueryParameter("RequiredValue", this.requiredValue);
    }

    public String getSuccess() {
        return this.success;
    }

    public void setSuccess(String success) {
        this.success = success;
        putQueryParameter("Success", this.success);
    }

    @Override
    public HttpRequest signRequest(Signer signer, AlibabaCloudCredentials credentials, FormatType format, ProductDomain domain)
            throws InvalidKeyException, IllegalStateException, UnsupportedEncodingException {

        signer = new HmacSHA1Signer();
        Map<String, String> imutableMap = new HashMap<String, String>(this.getQueryParameters());
        if (null != signer && null != credentials) {
            String accessKeyId = credentials.getAccessKeyId();

            if (credentials instanceof BasicSessionCredentials) {
                BasicSessionCredentials basicSessionCredentials = (BasicSessionCredentials) credentials;
                if (basicSessionCredentials.getSessionToken() != null) {
                    this.putQueryParameter("SecurityToken", basicSessionCredentials.getSessionToken());
                }
            }
            imutableMap = this.composer.refreshSignParameters(this.getQueryParameters(), signer, accessKeyId, format);
            imutableMap.put("RegionId", getRegionId());
            Map<String, String> paramsToSign = new HashMap<String, String>(imutableMap);
            Map<String, String> bodyParams = this.getBodyParameters();
            if (bodyParams != null && !bodyParams.isEmpty()) {
                byte[] data;
                if (FormatType.JSON == this.getHttpContentType()) {
                    data = ParameterHelper.getJsonData(bodyParams);
                } else if (FormatType.XML == this.getHttpContentType()) {
                    data = ParameterHelper.getXmlData(bodyParams);
                } else {
                    data = ParameterHelper.getFormData(bodyParams);
                }
                this.setHttpContent(data, "UTF-8", this.getHttpContentType());
                paramsToSign.putAll(bodyParams);
            }
            String strToSign = this.composer.composeStringToSign(this.getMethod(), null, signer, paramsToSign, null,
                    null);
            String signature = signer.signString(strToSign, credentials.getAccessKeySecret());
            imutableMap.put("Signature", signature);
        }
        setUrl(this.composeUrl(domain.getDomianName(), imutableMap));
        return this;
    }

    @Override
    public Class<RpcDubboApiResponse> getResponseClass() {
        return RpcDubboApiResponse.class;
    }

}
