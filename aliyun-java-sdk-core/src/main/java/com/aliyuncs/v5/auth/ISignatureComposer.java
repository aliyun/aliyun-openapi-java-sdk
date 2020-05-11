package com.aliyuncs.v5.auth;

import com.aliyuncs.v5.http.FormatType;
import com.aliyuncs.v5.http.MethodType;

import java.util.Map;

public interface ISignatureComposer {

           Map<String, String> refreshSignParameters(Map<String, String> parameters, Signer signer, String accessKeyId,
            FormatType format);

           String composeStringToSign(MethodType method, String uriPattern, Signer signer, Map<String, String> queries,
            Map<String, String> headers, Map<String, String> paths);
}
