package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.utils.ParameterHelper;
import com.aliyuncs.utils.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.*;

import static com.aliyuncs.auth.AcsURLEncoder.percentEncode;

public class V3SignatureComposer implements ISignatureComposer {

    protected final static String QUERY_SEPARATOR = "&";
    protected final static String HEADER_SEPARATOR = "\n";
    private final static String DELIMITER = ";";
    private final static String UTF8 = "UTF-8";
    private static ISignatureComposer composer = null;
    private final static String SIGNED_HEADERS = "signedHeaders";
    private final static String CANONICAL_HEADERS = "canonicalHeaders";
    private final static String prefix = "x-acs-";
    private final static String CONTENT_TYPE = "content-type";
    private final static String HOST = "host";

    public static ISignatureComposer getComposer() {
        if (null == composer) {
            composer = new V3SignatureComposer();
        }
        return composer;
    }

    public static String replaceOccupiedParameters(String url, Map<String, String> paths) {
        String result = url;
        for (Map.Entry<String, String> entry : paths.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String target = "[" + key + "]";
            result = result.replace(target, value);
        }
        return result;
    }

    @Override
    public Map<String, String> refreshSignParameters(Map<String, String> parameters, Signer signer, String accessKeyId,
                                                     FormatType format) {
        Map<String, String> immutableMap = new HashMap<String, String>(parameters);
        immutableMap.put("x-acs-date", ParameterHelper.getISO8601UTCTime(new Date()));
        immutableMap.put("x-acs-signature-nonce", ParameterHelper.getUniqueNonce());
        return immutableMap;
    }

    private Map<String, String> getCanonicalizedHeadersMap(Map<String, String> headers) {
        Map<String, String> result = new HashMap<String, String>();
        String[] keys = headers.keySet().toArray(new String[headers.size()]);
        Arrays.sort(keys);
        List<String> canonicalizedKeys = new ArrayList<String>();
        Map<String, String> valueMap = new HashMap<String, String>();
        for (String key : keys) {
            String lowerKey = key.toLowerCase();
            if (lowerKey.startsWith(prefix) || lowerKey.equals(HOST)
                    || lowerKey.equals(CONTENT_TYPE)) {
                if (!canonicalizedKeys.contains(lowerKey)) {
                    canonicalizedKeys.add(lowerKey);
                }
                valueMap.put(lowerKey, !StringUtils.isEmpty(headers.get(key)) ? headers.get(key).trim() : null);
            }
        }
        String[] canonicalizedKeysArray = canonicalizedKeys.toArray(new String[canonicalizedKeys.size()]);
        String signedHeaders = StringUtils.join(DELIMITER, Arrays.asList(canonicalizedKeysArray));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < canonicalizedKeysArray.length; i++) {
            String key = canonicalizedKeysArray[i];
            sb.append(key);
            sb.append(":");
            sb.append(valueMap.get(key));
            sb.append("\n");
        }
        result.put(CANONICAL_HEADERS, sb.toString());
        result.put(SIGNED_HEADERS, signedHeaders);
        return result;
    }

    private String getCanonicalizedResource(Map<String, String> query) {
        if (query == null || query.size() == 0) {
            return "";
        }
        String[] keys = query.keySet().toArray(new String[query.size()]);
        Arrays.sort(keys);
        StringBuilder queryString = new StringBuilder();
        try {
            for (int i = 0; i < keys.length; i++) {
                queryString.append(percentEncode(keys[i]));
                queryString.append("=");
                if (!StringUtils.isEmpty(query.get(keys[i]))) {
                    queryString.append(percentEncode(query.get(keys[i])));
                }
                queryString.append(QUERY_SEPARATOR);
            }
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.toString());
        }

        return queryString.length() > 0 ? queryString.deleteCharAt(queryString.length() - 1).toString() : "";
    }

    @Override
    public String composeStringToSign(MethodType method, String uriPattern, Signer signer, Map<String, String> queries,
                                      Map<String, String> headers, Map<String, String> paths) {
        String canonicalURI = replaceOccupiedParameters(uriPattern, paths);
        if (StringUtils.isEmpty(canonicalURI)) {
            canonicalURI = "/";
        }
        Map<String, String> cannoicalHeaders = getCanonicalizedHeadersMap(headers);
        String queryString = getCanonicalizedResource(queries);
        StringBuilder sb = new StringBuilder(String.valueOf(method));
        sb.append("\n").append(canonicalURI)
                .append("\n").append(queryString)
                .append("\n").append(cannoicalHeaders.get(CANONICAL_HEADERS))
                .append("\n").append(cannoicalHeaders.get(SIGNED_HEADERS));
        return sb.toString();
    }

    @Override
    public String getAuthorization(Signer signer, String accessKeyId, String signature) {
        return signer.getSignerName() + " Credential=" + accessKeyId + ",Signature=" + signature;
    }
}
