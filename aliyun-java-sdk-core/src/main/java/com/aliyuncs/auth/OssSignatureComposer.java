package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.utils.ParameterHelper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class OssSignatureComposer extends RoaSignatureComposer {
    private static ISignatureComposer composer = null;

    public static ISignatureComposer getComposer() {
        if (null == composer) {
            composer = new OssSignatureComposer();
        }
        return composer;
    }

    @Override
    public Map<String, String> refreshSignParameters(Map<String, String> parameters, Signer signer, String accessKeyId,
            FormatType format) {
        Map<String, String> immutableMap = new HashMap<String, String>(parameters);
        immutableMap.put("Date", ParameterHelper.getRFC2616Date(new Date()));
        return immutableMap;
    }

    private String buildQueryString(String uri, Map<String, String> queries) {
        StringBuilder queryBuilder = new StringBuilder(uri);
        if (0 < queries.size()) {
            queryBuilder.append("?");
        }
        for (Map.Entry<String, String> e : queries.entrySet()) {
            queryBuilder.append(e.getKey());
            if (null != e.getValue()) {
                queryBuilder.append("=").append(e.getValue());
            }
            queryBuilder.append(QUERY_SEPARATOR);
        }
        String queryString = queryBuilder.toString();
        if (queryString.endsWith(QUERY_SEPARATOR)) {
            queryString = queryString.substring(0, queryString.length() - 1);
        }

        return queryString;
    }

    @Override
    public String composeStringToSign(MethodType method, String uriPattern, Signer signer, Map<String, String> queries,
            Map<String, String> headers, Map<String, String> paths) {
        StringBuilder sb = new StringBuilder();
        sb.append(method).append(HEADER_SEPARATOR);
        if (headers.get("Content-MD5") != null) {
            sb.append(headers.get("Content-MD5"));
        }
        sb.append(HEADER_SEPARATOR);
        if (headers.get("Content-Type") != null) {
            sb.append(headers.get("Content-Type"));
        }
        sb.append(HEADER_SEPARATOR);
        if (headers.get("Date") != null) {
            sb.append(headers.get("Date"));
        }
        sb.append(HEADER_SEPARATOR);
        sb.append(buildCanonicalHeaders(headers, "x-oss-"));
        sb.append(buildQueryString(uriPattern, queries));
        return sb.toString();
    }
}
