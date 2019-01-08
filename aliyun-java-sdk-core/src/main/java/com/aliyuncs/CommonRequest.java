package com.aliyuncs;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.regions.ProductDomain;

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
        if (domain != null) {
            ProductDomain productDomain = new ProductDomain(product, domain);
            request.setSysProductDomain(productDomain);
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
    public void setProduct(String product) {
        this.product = product;
    }

    @Deprecated
    public String getAction() {
        return action;
    }

    @Deprecated
    public void setAction(String action) {
        this.action = action;
    }

    @Deprecated
    public String getLocationProduct() {
        return locationProduct;
    }

    @Deprecated
    public void setLocationProduct(String locationProduct) {
        this.locationProduct = locationProduct;
    }

    @Deprecated
    public String getEndpointType() {
        return endpointType;
    }

    @Deprecated
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
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
    public ProtocolType getProtocol() {
        return protocol;
    }

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
        if (null == map || null == name || null == value) {
            return;
        }
        map.put(name, String.valueOf(value));
    }

    @Deprecated
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    @Deprecated
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    @Deprecated
    public Integer getReadTimeout() {
        return readTimeout;
    }

    @Deprecated
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    @Deprecated
    public MethodType getMethod() {
        return method;
    }

    @Deprecated
    public void setMethod(MethodType method) {
        this.method = method;
    }

    @Deprecated
    public String getUriPattern() {
        return uriPattern;
    }

    @Deprecated
    public void setUriPattern(String uriPattern) {
        this.uriPattern = uriPattern;
    }

    public void putPathParameter(String name, String value) {
        setParameter(this.pathParameters, name, value);
    }

    @Deprecated
    public String getDomain() {
        return domain;
    }

    @Deprecated
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public FormatType getHttpContentType() {
        return httpContentType;
    }

    public byte[] getHttpContent() {
        return httpContent;
    }

    @Deprecated
    public String getEncoding() {
        return encoding;
    }

    @Deprecated
    public Map<String, String> getQueryParameters() {
        return queryParameters;
    }

    @Deprecated
    public Map<String, String> getBodyParameters() {
        return bodyParameters;
    }

    @Deprecated
    public Map<String, String> getHeadParameters() {
        return headParameters;
    }

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

}
