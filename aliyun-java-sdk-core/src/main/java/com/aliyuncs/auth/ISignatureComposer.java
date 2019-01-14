package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;

import java.util.Map;

public interface ISignatureComposer {

    public Map<String, String> refreshSignParameters(Map<String, String> parameters, Signer signer, String accessKeyId,
            FormatType format);

    public String composeStringToSign(MethodType method, String uriPattern, Signer signer, Map<String, String> queries,
            Map<String, String> headers, Map<String, String> paths);
}
