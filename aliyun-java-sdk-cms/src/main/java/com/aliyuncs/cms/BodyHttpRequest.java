package com.aliyuncs.cms;


import com.aliyuncs.AcsResponse;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.regions.ProductDomain;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fray.yangb-然诺 on 16/4/26.
 */
public abstract class BodyHttpRequest<T extends AcsResponse> extends RpcAcsRequest<T> {

    private Map<String, String> bodyParameter = new HashMap<String, String>();

    public BodyHttpRequest(String product) {
        super(product);
    }

    public BodyHttpRequest(String product, String version) {
        super(product, version);
    }

    public BodyHttpRequest(String product, String version, String action) {
        super(product, version, action);
    }
    
    public BodyHttpRequest(String product, String version, String action, String serviceCode) {
        super(product, version, action, serviceCode);
    }

    public Map<String, String> getBodyParameter() {
        return bodyParameter;
    }

    public void setBodyParameter(Map<String, String> bodyParameter) {
        this.bodyParameter = bodyParameter;
    }

    public void putBodyParameter(String key, String value) {
        this.bodyParameter.put(key, value);
    }


    public HttpRequest signRequest(ISigner signer, Credential credential, FormatType format, ProductDomain domain) throws InvalidKeyException, IllegalStateException, UnsupportedEncodingException {
        Map<String, String> imutableMap = new HashMap<String, String>(getQueryParameters());
        imutableMap.remove("Signature");
        imutableMap.putAll(this.getBodyParameter());
        if (null != signer && null != credential) {
            String accessKeyId = credential.getAccessKeyId();
            String accessSecret = credential.getAccessSecret();
            imutableMap = this.composer.refreshSignParameters
                    (imutableMap, signer, accessKeyId, format);
            imutableMap.put("RegionId", getRegionId());
            String strToSign = this.composer.composeStringToSign
                    (this.getMethod(), null, signer, imutableMap, null, null);
            String signature = signer.signString(strToSign, accessSecret + "&");
            imutableMap.put("Signature", signature);
        }
        this.setBodyParameter(imutableMap);
        setUrl(this.getProtocol().toString() + "://" + domain.getDomianName());
        return this;
    }
}
