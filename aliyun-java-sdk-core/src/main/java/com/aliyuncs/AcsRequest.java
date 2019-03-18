package com.aliyuncs;

import com.aliyuncs.auth.*;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.UserAgentConfig;
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
    private UserAgentConfig userAgentConfig;
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
    protected String strToSign;

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

    /**
     * @deprecated : Use setSysEndpoint instead of this
     */
    @Deprecated
    public void setEndpoint(String endpoint) {
        ProductDomain productDomain = new ProductDomain(product, endpoint);
        setProductDomain(productDomain);
    }

    /**
     * @deprecated : Use getSysVersion instead of this
     */
    @Deprecated
    public String getVersion() {
        return version;
    }

    /**
     * @deprecated : Use setSysVersion instead of this
     */
    @Deprecated
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @deprecated : Use getSysProduct instead of this
     */
    @Deprecated
    public String getProduct() {
        return product;
    }

    /**
     * @deprecated : Use getSysActionName instead of this
     */
    @Deprecated
    public String getActionName() {
        return actionName;
    }

    /**
     * @deprecated : Use setSysActionName instead of this
     */
    @Deprecated
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * @deprecated : Use getSysRegionId instead of this
     */
    @Deprecated
    public String getRegionId() {
        return regionId;
    }

    /**
     * @deprecated : Use setSysRegionId instead of this
     */
    @Deprecated
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * @deprecated : Use getSysSecurityToken instead of this
     */
    @Deprecated
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * @deprecated : Use setSysSecurityToken instead of this
     */
    @Deprecated
    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        putQueryParameter("SecurityToken", securityToken);
    }

    /**
     * @deprecated : Use getSysAcceptFormat instead of this
     */
    @Deprecated
    public FormatType getAcceptFormat() {
        return acceptFormat;
    }

    /**
     * @deprecated : Use setSysAcceptFormat instead of this
     */
    @Deprecated
    public void setAcceptFormat(FormatType acceptFormat) {
        this.acceptFormat = acceptFormat;
        this.putHeaderParameter("Accept", FormatType.mapFormatToAccept(acceptFormat));
    }

    /**
     * @deprecated : Use getSysProtocol instead of this
     */
    @Deprecated
    public ProtocolType getProtocol() {
        return protocol;
    }

    /**
     * @deprecated : Use setSysProtocol instead of this
     */
    @Deprecated
    public void setProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }

    /**
     * @deprecated : Use getSysQueryParameters instead of this
     */
    @Deprecated
    public Map<String, String> getQueryParameters() {
        return Collections.unmodifiableMap(queryParameters);
    }

    public Map<String, String> getSysQueryParameters() {
        return Collections.unmodifiableMap(queryParameters);
    }

    public <K> void putQueryParameter(String name, K value) {
        setParameter(this.queryParameters, name, value);
    }

    protected void putQueryParameter(String name, String value) {
        setParameter(this.queryParameters, name, value);
    }

    /**
     * @deprecated : Use getSysDomainParameters instead of this
     */
    @Deprecated
    public Map<String, String> getDomainParameters() {
        return Collections.unmodifiableMap(domainParameters);
    }

    public Map<String, String> getSysDomainParameters() {
        return Collections.unmodifiableMap(domainParameters);
    }

    protected void putDomainParameter(String name, Object value) {
        setParameter(this.domainParameters, name, value);
    }

    /**
     * @deprecated : Use getSysBodyParameters instead of this
     */
    @Deprecated
    public Map<String, String> getBodyParameters() {
        return Collections.unmodifiableMap(bodyParameters);
    }

    public Map<String, String> getSysBodyParameters() {
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

    /**
     * @deprecated : Use getSysLocationProduct instead of this
     */
    @Deprecated
    public String getLocationProduct() {
        return locationProduct;
    }

    /**
     * @deprecated : Use setSysLocationProduct instead of this
     */
    @Deprecated
    public void setLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
        putQueryParameter("ServiceCode", locationProduct);
    }

    /**
     * @deprecated : Use getSysEndpointType instead of this
     */
    @Deprecated
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * @deprecated : Use setSysEndpointType instead of this
     */
    @Deprecated
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        putQueryParameter("Type", endpointType);
    }

    /**
     * @deprecated : Use getSysProductDomain instead of this
     */
    @Deprecated
    public ProductDomain getProductDomain() {
        return productDomain;
    }

    /**
     * @deprecated : Use setSysProductDomain instead of this
     */
    @Deprecated
    public void setProductDomain(ProductDomain productDomain) {
        this.productDomain = productDomain;
    }

    public abstract HttpRequest signRequest(Signer signer, AlibabaCloudCredentials credentials, FormatType format,
            ProductDomain domain)
            throws InvalidKeyException, IllegalStateException, UnsupportedEncodingException, NoSuchAlgorithmException;

    public abstract String composeUrl(String endpoint, Map<String, String> queries) throws UnsupportedEncodingException;

    public abstract Class<T> getResponseClass();

    public String getSysVersion() {
        return version;
    }

    public void setSysVersion(String version) {
        this.version = version;
    }

    public String getSysProduct() {
        return product;
    }

    public String getSysActionName() {
        return actionName;
    }

    public void setSysActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getSysRegionId() {
        return regionId;
    }

    public void setSysRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getSysSecurityToken() {
        return securityToken;
    }

    public void setSysSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        putQueryParameter("SecurityToken", securityToken);
    }

    public FormatType getSysAcceptFormat() {
        return acceptFormat;
    }

    public void setSysAcceptFormat(FormatType acceptFormat) {
        this.acceptFormat = acceptFormat;
        this.putHeaderParameter("Accept", FormatType.mapFormatToAccept(acceptFormat));
    }

    public ProtocolType getSysProtocol() {
        return protocol;
    }

    public void setSysProtocol(ProtocolType protocol) {
        this.protocol = protocol;
    }

    public void setSysEndpoint(String endpoint) {
        ProductDomain productDomain = new ProductDomain(product, endpoint);
        setSysProductDomain(productDomain);
    }

    public String getSysLocationProduct() {
        return locationProduct;
    }

    public void setSysLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
        putQueryParameter("ServiceCode", locationProduct);
    }

    public String getSysEndpointType() {
        return endpointType;
    }

    public void setSysEndpointType(String endpointType) {
        this.endpointType = endpointType;
        putQueryParameter("Type", endpointType);
    }

    public ProductDomain getSysProductDomain() {
        return productDomain;
    }

    public void setSysProductDomain(ProductDomain productDomain) {
        this.productDomain = productDomain;
    }

    public UserAgentConfig getSysUserAgentConfig() {
        return userAgentConfig;
    }

    public void appendUserAgent(String key, String value) {
        if (this.userAgentConfig == null) {
            this.userAgentConfig = new UserAgentConfig();
        }
        this.userAgentConfig.append(key, value);
    }
}
