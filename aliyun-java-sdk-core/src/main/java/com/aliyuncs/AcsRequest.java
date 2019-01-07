package com.aliyuncs;

import com.aliyuncs.auth.*;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.regions.ProductDomain;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("deprecation")
public abstract class AcsRequest<T extends AcsResponse> extends HttpRequest {

    private final Map<String, String> queryParameters = new HashMap<String, String>();
    private final Map<String, String> domainParameters = new HashMap<String, String>();
    private final Map<String, String> bodyParameters = new HashMap<String, String>();
    protected ISignatureComposer composer = null;
    private String version = null;
    private String product = null;
    private String actionName = null;
    private String regionId = null;
    private String securityToken = null;
    private FormatType acceptFormat = null;
    private ProtocolType protocol = null;
    private String locationProduct;
    private String endpointType;
    private ProductDomain productDomain = null;

    public AcsRequest(String product) {
        super(null);
        this.headers.put("x-sdk-client", "Java/2.0.0");
        this.headers.put("x-sdk-invoke-type", "normal");
        this.product = product;
    }

    public static String concatQueryString(Map<String, String> parameters) throws UnsupportedEncodingException {
        if (null == parameters) {
            return null;
        }

        StringBuilder urlBuilder = new StringBuilder("");
        for (Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            urlBuilder.append(AcsURLEncoder.encode(key));
            if (val != null) {
                urlBuilder.append("=").append(AcsURLEncoder.encode(val));
            }
            urlBuilder.append("&");
        }

        int strIndex = urlBuilder.length();
        if (parameters.size() > 0) {
            urlBuilder.deleteCharAt(strIndex - 1);
        }

        return urlBuilder.toString();
    }

    @Deprecated
    public void setEndpoint(String endpoint) {
        ProductDomain productDomain = new ProductDomain(product, endpoint);
        setProductDomain(productDomain);
    }

    @Deprecated
    public String getVersion() {
        return version;
    }

    @Deprecated
    public void setVersion(String version) {
        this.version = version;
    }

    @Deprecated
    public String getProduct() {
        return product;
    }

    @Deprecated
    public String getActionName() {
        return actionName;
    }

    @Deprecated
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Deprecated
    public String getRegionId() {
        return regionId;
    }

    @Deprecated
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Deprecated
    public String getSecurityToken() {
        return securityToken;
    }

    @Deprecated
    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        putQueryParameter("SecurityToken", securityToken);
    }

    @Deprecated
    public FormatType getAcceptFormat() {
        return acceptFormat;
    }

    @Deprecated
    public void setAcceptFormat(FormatType acceptFormat) {
        this.acceptFormat = acceptFormat;
        this.putHeaderParameter("Accept",
                FormatType.mapFormatToAccept(acceptFormat));
    }

    @Deprecated
    public ProtocolType getProtocol() {
        return protocol;
    }

    @Deprecated
    public void setProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }

    @Deprecated
    public Map<String, String> getQueryParameters() {
        return Collections.unmodifiableMap(queryParameters);
    }

    public Map<String, String> getBizQueryParameters() {
        return Collections.unmodifiableMap(queryParameters);
    }

    public <K> void putQueryParameter(String name, K value) {
        setParameter(this.queryParameters, name, value);
    }

    protected void putQueryParameter(String name, String value) {
        setParameter(this.queryParameters, name, value);
    }

    @Deprecated
    public Map<String, String> getDomainParameters() {
        return Collections.unmodifiableMap(domainParameters);
    }

    public Map<String, String> getBizDomainParameters() {
        return Collections.unmodifiableMap(domainParameters);
    }

    protected void putDomainParameter(String name, Object value) {
        setParameter(this.domainParameters, name, value);
    }

    @Deprecated
    public Map<String, String> getBodyParameters() {
        return Collections.unmodifiableMap(bodyParameters);
    }

    public Map<String, String> getBizBodyParameters() {
        return Collections.unmodifiableMap(bodyParameters);
    }

    protected void putDomainParameter(String name, String value) {
        setParameter(this.domainParameters, name, value);
    }

    protected void putBodyParameter(String name, Object value) {
        setParameter(this.bodyParameters, name, value);
    }

    protected void setParameter(Map<String, String> map, String name, Object value) {
        if (null == map || null == name || null == value) {
            return;
        }
        map.put(name, String.valueOf(value));
    }

    @Deprecated
    public String getLocationProduct() {
        return locationProduct;
    }

    @Deprecated
    public void setLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
        putQueryParameter("ServiceCode", locationProduct);
    }

    @Deprecated
    public String getEndpointType() {
        return endpointType;
    }

    @Deprecated
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        putQueryParameter("Type", endpointType);
    }

    @Deprecated
    public ProductDomain getProductDomain() {
        return productDomain;
    }

    @Deprecated
    public void setProductDomain(ProductDomain productDomain) {
        this.productDomain = productDomain;
    }

    public HttpRequest signRequest(Signer signer, Credential credential,
                                   FormatType format, ProductDomain domain)
            throws InvalidKeyException, IllegalStateException,
            UnsupportedEncodingException, NoSuchAlgorithmException {
        return signRequest(signer, new LegacyCredentials(credential), format, domain);
    }

    public abstract HttpRequest signRequest(Signer signer, AlibabaCloudCredentials credentials,
                                            FormatType format, ProductDomain domain)
            throws InvalidKeyException, IllegalStateException,
            UnsupportedEncodingException, NoSuchAlgorithmException;

    public abstract String composeUrl(String endpoint, Map<String, String> queries)
            throws UnsupportedEncodingException;

    public abstract Class<T> getResponseClass();

    public String getBizVersion() {
        return version;
    }

    public void setSysVersion(String version) {
        this.version = version;
    }

    public String getBizProduct() {
        return product;
    }

    public String getBizActionName() {
        return actionName;
    }

    public void setSysActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getBizRegionId() {
        return regionId;
    }

    public void setSysRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getBizSecurityToken() {
        return securityToken;
    }

    public void setSysSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        putQueryParameter("SecurityToken", securityToken);
    }

    public FormatType getBizAcceptFormat() {
        return acceptFormat;
    }

    public void setSysAcceptFormat(FormatType acceptFormat) {
        this.acceptFormat = acceptFormat;
        this.putHeaderParameter("Accept",
                FormatType.mapFormatToAccept(acceptFormat));
    }

    public ProtocolType getBizProtocol() {
        return protocol;
    }

    public void setSysProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }

    public void setSysEndpoint(String endpoint) {
        ProductDomain productDomain = new ProductDomain(product, endpoint);
        setSysProductDomain(productDomain);
    }

    public String getBizLocationProduct() {
        return locationProduct;
    }

    public void setSysLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
        putQueryParameter("ServiceCode", locationProduct);
    }

    public String getBizEndpointType() {
        return endpointType;
    }

    public void setSysEndpointType(String endpointType) {
        this.endpointType = endpointType;
        putQueryParameter("Type", endpointType);
    }

    public ProductDomain getBizProductDomain() {
        return productDomain;
    }

    public void setSysProductDomain(ProductDomain productDomain) {
        this.productDomain = productDomain;
    }

}
