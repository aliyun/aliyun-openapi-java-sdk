package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.utils.ParameterHelper;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MethodSignatureComposer implements ISignatureComposer {
    private static ISignatureComposer composer = null;

    public static ISignatureComposer getComposer() {
        if (null == composer) {
            composer = new MethodSignatureComposer();
        }
        return composer;
    }

    @Override
    public Map<String, String> refreshSignParameters(Map<String, String> parameters, Signer signer, String accessKeyId, FormatType format) {
        Map<String, String> immutableMap = new HashMap(parameters);
        immutableMap.put("Date", ParameterHelper.getRFC2616Date(new Date()));
        if (null == format) {
            format = FormatType.JSON;
        }

        immutableMap.put("Accept", FormatType.mapFormatToAccept(format));
        immutableMap.put("x-acs-signature-method", signer.getSignerName());
        immutableMap.put("x-acs-signature-version", signer.getSignerVersion());
        immutableMap.put("x-acs-signature-nonce", ParameterHelper.getUniqueNonce());
        if (signer.getSignerType() != null) {
            immutableMap.put("x-acs-signature-type", signer.getSignerType());
        }

        return immutableMap;
    }

    @Override
    public String composeStringToSign(MethodType method, String uriPattern, Signer signer, Map<String, String> queries, Map<String, String> headers, Map<String, String> paths) {
        String[] sortedKeys = (String[])queries.keySet().toArray(new String[0]);
        Arrays.sort(sortedKeys);
        StringBuilder canonicalizedQueryString = new StringBuilder();

        try {
            String[] var9 = sortedKeys;
            int var10 = sortedKeys.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                String key = var9[var11];
                canonicalizedQueryString.append("&").append(AcsURLEncoder.percentEncode(key)).append("=").append(AcsURLEncoder.percentEncode((String)queries.get(key)));
            }

            StringBuilder stringToSign = new StringBuilder();
            stringToSign.append(method.toString());
            stringToSign.append("&");
            stringToSign.append(AcsURLEncoder.percentEncode("/"));
            stringToSign.append("&");
            stringToSign.append(AcsURLEncoder.percentEncode(canonicalizedQueryString.toString().substring(1)));
            return stringToSign.toString();
        } catch (UnsupportedEncodingException var13) {
            throw new RuntimeException("UTF-8 encoding is not supported.");
        }
    }

}
