package com.aliyuncs;

import com.aliyuncs.auth.*;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.ParameterHelper;
import com.aliyuncs.utils.StringUtils;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class CommonRequest {

    private final Map<String, String> queryParameters = new HashMap<String, String>();
    private final Map<String, String> bodyParameters = new HashMap<String, String>();
    private final Map<String, String> headParameters = new HashMap<String, String>();
    private String version = null;
    private String product = null;
    private String action = null;
    private String locationProduct = null;
    private String endpointType = null;
    private String regionId = null;
    private ProtocolType protocol = null;
    private Integer connectTimeout = null;
    private Integer readTimeout = null;
    private MethodType method = null;
    private FormatType httpContentType = null;
    private byte[] httpContent = null;
    private String encoding = null;
    private FormatType accept = FormatType.JSON;
    protected ISignatureComposer composer = null;
    private String uriPattern = null;
    private Map<String, String> pathParameters = new HashMap<String, String>();

    private String domain = null;

    @SuppressWarnings("rawtypes")
    public AcsRequest buildRequest() {
        if (uriPattern != null) {
            CommonRoaRequest request = new CommonRoaRequest(product);
            request.setSysUriPattern(uriPattern);
            for (String pathParamKey : pathParameters.keySet()) {
                request.putPathParameter(pathParamKey, pathParameters.get(pathParamKey));
            }
            fillParams(request);

            return request;
        } else {
            CommonRpcRequest request = new CommonRpcRequest(product);
            fillParams(request);

            return request;
        }
    }

    @SuppressWarnings(("rawtypes"))
    public Map<String, ?> methodRequest(Signer signer, AlibabaCloudCredentials credentials, FormatType format) throws Exception {
        Map<String, String> bodyMap = this.getSysBodyParameters();
        if (bodyMap != null && !bodyMap.isEmpty()) {
            byte[] data;
            if (FormatType.JSON == this.getHttpContentType()) {
                data = ParameterHelper.getJsonData(bodyMap);
            } else if (FormatType.XML == this.getHttpContentType()) {
                data = ParameterHelper.getXmlData(bodyMap);
            } else {
                data = ParameterHelper.getFormData(bodyMap);
            }

            this.setHttpContent(data, "UTF-8", (FormatType) null);
        }
        if (null == this.composer) {
            this.composer = MethodSignatureComposer.getComposer();
        }
        Map<String, String> imutableMap = this.composer.refreshSignParameters(this.getSysQueryParameters(), signer, (String) null, format);
        if (imutableMap.get("RegionId") == null && this.getSysRegionId() != null && !this.getSysRegionId().equals("") && (bodyParameters == null || bodyParameters.get("RegionId") == null)) {
            imutableMap.put("RegionId", this.getSysRegionId());
        }

        if (null != credentials && !(credentials instanceof AnonymousCredentials)) {
            String accessKeyId = credentials.getAccessKeyId();
            String accessSecret = credentials.getAccessKeySecret();
            String bearerToken;
            if (credentials instanceof BasicSessionCredentials) {
                bearerToken = ((BasicSessionCredentials) credentials).getSessionToken();
                if (null != bearerToken) {
                    imutableMap.put("SecurityToken", bearerToken);
                }
            }
            if (credentials instanceof BearerTokenCredentials) {
                bearerToken = ((BearerTokenCredentials) credentials).getBearerToken();
                if (null != ((BearerTokenCredentials) credentials).getBearerToken()) {
                    imutableMap.put("BearerToken", bearerToken);
                }
            }
            Map<String, String> paramsToSign = new HashMap();
            paramsToSign.putAll(bodyMap);
            imutableMap.put("AccessKeyId", accessKeyId);
            paramsToSign.putAll(imutableMap);
            String strToSign = this.composer.composeStringToSign(this.getSysMethod(), (String) null, signer, paramsToSign, (Map) null, (Map) null);
            String signature;
            if (credentials instanceof BasicCredentials) {
                signature = signer.signString(strToSign, credentials);
            } else {
                signature = signer.signString(strToSign, accessSecret + "&");
            }

            imutableMap.put("Signature", signature);
            String signatureAlgorithm = imutableMap.get("Signature");
            String hashedRequestPayload = AuthUtils.hexEncode(AuthUtils.hash(com.aliyun.teautil.Common.toBytes(""), signatureAlgorithm));
            imutableMap.put("Authorization", CommonRequest.getAuthorization(this, signatureAlgorithm, hashedRequestPayload, accessKeyId, accessSecret));

            return imutableMap;
        }
        return null;
    }

    private static String getAuthorization(CommonRequest request, String signAlgorithm, String payload, String accessKey, String secret) throws Exception {
        if (request == null) {
            return null;
        } else if (secret == null) {
            throw new Exception("Need secret!");
        } else if (StringUtils.isEmpty(signAlgorithm)) {
            throw new Exception("Need signAlgorithm!");
        } else {
            String canonicalURI = request.pathParameters.get("URI");
            if (canonicalURI == null || StringUtils.isEmpty(canonicalURI) || "".equals(canonicalURI.trim())) {
                canonicalURI = "/";
            }

            String method = request.getMethod().toString();
            Map<String, String> headers = request.headParameters;
            Map<String, String> query = request.queryParameters;
            Map<String, String> cannoicalHeaders = AuthUtils.getCanonicalizedHeadersMap(headers);
            String signedHeaders = (String) cannoicalHeaders.get("signedHeaders");

            StringBuilder sb = new StringBuilder(method);
            sb.append("\n").append(canonicalURI).append("\n").append(query).append("\n").append((String) cannoicalHeaders.get("canonicalHeaders")).append("\n").append(signedHeaders).append("\n").append(payload);
            String hex = AuthUtils.hexEncode(AuthUtils.hash(sb.toString().getBytes("UTF-8"), signAlgorithm));
            String stringToSign = signAlgorithm + "\n" + hex;
            String signature = AuthUtils.hexEncode(SignatureMethod(stringToSign, secret, signAlgorithm));
            String auth = signAlgorithm + " Credential=" + accessKey + ",SignedHeaders=" + signedHeaders + ",Signature=" + signature;
            return auth;
        }
    }

    private static byte[] SignatureMethod(String stringToSign, String secret, String signAlgorithm) throws Exception {
        if (stringToSign != null && secret != null && signAlgorithm != null) {
            byte[] bytes = null;
            if (signAlgorithm.equals("ACS3-HMAC-SHA256")) {
                Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
                SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
                sha256_HMAC.init(secret_key);
                bytes = sha256_HMAC.doFinal(stringToSign.getBytes());
                return bytes;
            } else {
                byte[] inputBytes;
                if (signAlgorithm.equals("ACS3-RSA-SHA256")) {
                    secret = AuthUtils.checkRSASecret(secret);
                    Signature rsaSign = Signature.getInstance("SHA256withRSA");
                    KeyFactory kf = KeyFactory.getInstance("RSA");
                    System.out.println(secret);
                    inputBytes = Base64.decodeBase64(secret);
                    PrivateKey privateKey = kf.generatePrivate(new PKCS8EncodedKeySpec(inputBytes));
                    rsaSign.initSign(privateKey);
                    rsaSign.update(stringToSign.getBytes("UTF-8"));
                    bytes = rsaSign.sign();
                } else if (signAlgorithm.equals("ACS3-HMAC-SM3")) {
                    SecretKey key = new SecretKeySpec(secret.getBytes("UTF-8"), "HMAC-SM3");
                    HMac mac = new HMac(new SM3Digest());
                    bytes = new byte[mac.getMacSize()];
                    inputBytes = stringToSign.getBytes("UTF-8");
                    mac.init(new KeyParameter(key.getEncoded()));
                    mac.update(inputBytes, 0, inputBytes.length);
                    mac.doFinal(bytes, 0);
                }

                return bytes;
            }
        } else {
            return null;
        }
    }

    @SuppressWarnings("rawtypes")
    private void fillParams(AcsRequest request) {
        request.putHeaderParameter("x-sdk-invoke-type", "common");

        if (version != null) {
            request.setSysVersion(version);
        }
        if (action != null) {
            request.setSysActionName(action);
        }
        if (regionId != null) {
            request.setSysRegionId(regionId);
        }
        if (locationProduct != null) {
            request.setSysLocationProduct(locationProduct);
        }
        if (endpointType != null) {
            request.setSysEndpointType(endpointType);
        }
        if (connectTimeout != null) {
            request.setSysConnectTimeout(connectTimeout);
        }
        if (readTimeout != null) {
            request.setSysReadTimeout(readTimeout);
        }
        if (method != null) {
            request.setSysMethod(method);
        }
        if (protocol != null) {
            request.setSysProtocol(protocol);
        }
        request.setSysAcceptFormat(accept);
        if (domain != null) {
            ProductDomain productDomain = new ProductDomain(product, domain);
            request.setSysProductDomain(productDomain);
        }
        if (bodyParameters.size() > 0 && httpContentType != null) {
            request.setHttpContentType(httpContentType);
        }
        if (httpContent != null) {
            request.setHttpContent(httpContent, encoding, httpContentType);
        }
        for (String queryParamKey : queryParameters.keySet()) {
            request.putQueryParameter(queryParamKey, queryParameters.get(queryParamKey));
        }
        for (String bodyParamKey : bodyParameters.keySet()) {
            request.putBodyParameter(bodyParamKey, bodyParameters.get(bodyParamKey));
        }
        for (String headParamKey : headParameters.keySet()) {
            request.putHeaderParameter(headParamKey, headParameters.get(headParamKey));
        }
    }

    /**
     * @Deprecated : Use getSysVersion instead of this
     */
    @Deprecated
    public String getVersion() {
        return version;
    }

    /**
     * @Deprecated : Use setSysVersion instead of this
     */
    @Deprecated
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @Deprecated : Use getSysProduct instead of this
     */
    @Deprecated
    public String getProduct() {
        return product;
    }

    /**
     * @Deprecated : Use setSysProduct instead of this
     */
    @Deprecated
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @Deprecated : Use getSysAction instead of this
     */
    @Deprecated
    public String getAction() {
        return action;
    }

    /**
     * @Deprecated : Use setSysAction instead of this
     */
    @Deprecated
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @Deprecated : Use getSysLocationProduct instead of this
     */
    @Deprecated
    public String getLocationProduct() {
        return locationProduct;
    }

    /**
     * @Deprecated : Use setSysLocationProduct instead of this
     */
    @Deprecated
    public void setLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
    }

    /**
     * @Deprecated : Use getSysEndpointType instead of this
     */
    @Deprecated
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * @Deprecated : Use setSysEndpointType instead of this
     */
    @Deprecated
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * @Deprecated : Use getSysRegionId instead of this
     */
    @Deprecated
    public String getRegionId() {
        return regionId;
    }

    /**
     * @Deprecated : Use setSysRegionId instead of this
     */
    @Deprecated
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * @Deprecated : Use getSysProtocol instead of this
     */
    @Deprecated
    public ProtocolType getProtocol() {
        return protocol;
    }

    /**
     * @Deprecated : Use setSysProtocol instead of this
     */
    @Deprecated
    public void setProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }

    public void putBodyParameter(String name, Object value) {
        setParameter(this.bodyParameters, name, value);
    }

    public void putQueryParameter(String name, String value) {
        setParameter(this.queryParameters, name, value);
    }

    public void putHeadParameter(String name, String value) {
        setParameter(this.headParameters, name, value);
    }

    private void setParameter(Map<String, String> map, String name, Object value) {
        if (null == map || name == null || value == null) {
            return;
        }
        map.put(name, String.valueOf(value));
    }

    /**
     * @Deprecated : Use getSysConnectTimeout instead of this
     */
    @Deprecated
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * @Deprecated : Use setSysConnectTimeout instead of this
     */
    @Deprecated
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * @Deprecated : Use getSysReadTimeout instead of this
     */
    @Deprecated
    public Integer getReadTimeout() {
        return readTimeout;
    }

    /**
     * @Deprecated : Use setSysReadTimeout instead of this
     */
    @Deprecated
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * @Deprecated : Use getSysMethod instead of this
     */
    @Deprecated
    public MethodType getMethod() {
        return method;
    }

    /**
     * @Deprecated : Use setSysMethod instead of this
     */
    @Deprecated
    public void setMethod(MethodType method) {
        this.method = method;
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

    public void putPathParameter(String name, String value) {
        setParameter(this.pathParameters, name, value);
    }

    /**
     * @Deprecated : Use getSysDomain instead of this
     */
    @Deprecated
    public String getDomain() {
        return domain;
    }

    /**
     * @Deprecated : Use setSysDomain instead of this
     */
    @Deprecated
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public FormatType getHttpContentType() {
        return httpContentType;
    }

    public void setHttpContentType(FormatType type) {
        this.httpContentType = type;
    }

    public byte[] getHttpContent() {
        return httpContent;
    }

    /**
     * @Deprecated : Use getSysEncoding instead of this
     */
    @Deprecated
    public String getEncoding() {
        return encoding;
    }

    /**
     * @Deprecated : Use getSysQueryParameters instead of this
     */
    @Deprecated
    public Map<String, String> getQueryParameters() {
        return queryParameters;
    }

    /**
     * @Deprecated : Use getSysBodyParameters instead of this
     */
    @Deprecated
    public Map<String, String> getBodyParameters() {
        return bodyParameters;
    }

    /**
     * @Deprecated : Use getSysHeadParameters instead of this
     */
    @Deprecated
    public Map<String, String> getHeadParameters() {
        return headParameters;
    }

    /**
     * @Deprecated : Use getSysPathParameters instead of this
     */
    @Deprecated
    public Map<String, String> getPathParameters() {
        return pathParameters;
    }

    public void setHttpContent(byte[] content, String encoding, FormatType format) {
        if (content == null || encoding == null || format == null) {
            return;
        }
        this.httpContent = content;
        this.httpContentType = format;
        this.encoding = encoding;
    }

    public String getSysVersion() {
        return version;
    }

    public void setSysVersion(String version) {
        this.version = version;
    }

    public String getSysProduct() {
        return product;
    }

    public void setSysProduct(String product) {
        this.product = product;
    }

    public String getSysAction() {
        return action;
    }

    public void setSysAction(String action) {
        this.action = action;
    }

    public String getSysLocationProduct() {
        return locationProduct;
    }

    public void setSysLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
    }

    public String getSysEndpointType() {
        return endpointType;
    }

    public void setSysEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    public String getSysRegionId() {
        return regionId;
    }

    public void setSysRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ProtocolType getSysProtocol() {
        return protocol;
    }

    public void setSysProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }


    public Integer getSysConnectTimeout() {
        return connectTimeout;
    }

    public void setSysConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getSysReadTimeout() {
        return readTimeout;
    }

    public void setSysReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public MethodType getSysMethod() {
        return method;
    }

    public void setSysMethod(MethodType method) {
        this.method = method;
    }

    public String getSysUriPattern() {
        return uriPattern;
    }

    public void setSysUriPattern(String uriPattern) {
        this.uriPattern = uriPattern;
    }

    public String getSysDomain() {
        return domain;
    }

    public void setSysDomain(String domain) {
        this.domain = domain;
    }

    public String getSysEncoding() {
        return encoding;
    }

    public Map<String, String> getSysQueryParameters() {
        return queryParameters;
    }

    public Map<String, String> getSysBodyParameters() {
        return bodyParameters;
    }

    public Map<String, String> getSysHeadParameters() {
        return headParameters;
    }

    public Map<String, String> getSysPathParameters() {
        return pathParameters;
    }

    public void setSysAccept(FormatType type) {
        this.accept = type;
    }

    public FormatType getSysAccept() {
        return this.accept;
    }
}
