package com.aliyuncs.http;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.ParameterHelper;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class HttpMessage {

    protected static final String CONTENT_TYPE = "Content-Type";
    protected static final String CONTENT_MD5 = "Content-MD5";
    protected static final String CONTENT_LENGTH = "Content-Length";
    protected FormatType httpContentType = null;
    protected byte[] httpContent = null;
    protected String encoding = null;
    protected Map<String, String> headers = new HashMap<String, String>();
    protected Integer connectTimeout = null;
    protected Integer readTimeout = null;
    private String url = null;
    private MethodType method = null;

    public HttpMessage(String strUrl) {
        this.url = strUrl;
    }

    public HttpMessage() {
    }

    @Deprecated
    public String getUrl() {
        return url;
    }

    @Deprecated
    protected void setUrl(String url) {
        this.url = url;
    }

    @Deprecated
    public MethodType getMethod() {
        return method;
    }

    @Deprecated
    public void setMethod(MethodType method) {
        this.method = method;
        //This is the pop rule and the put method accepts only json data
        if (MethodType.PUT == method) {
            setHttpContentType(FormatType.JSON);
        }
    }

    public FormatType getHttpContentType() {
        return httpContentType;
    }

    public void setHttpContentType(FormatType httpContentType) {
        this.httpContentType = httpContentType;
        if (null != this.httpContent || null != httpContentType) {
            this.headers.put(CONTENT_TYPE, getContentTypeValue(this.httpContentType, this.encoding));
        } else {
            this.headers.remove(CONTENT_TYPE);
        }
    }

    public byte[] getHttpContent() {
        return httpContent;
    }

    public void setHttpContent(byte[] content, String encoding, FormatType format) {
        if (null == content) {
            this.headers.remove(CONTENT_MD5);
            this.headers.put(CONTENT_LENGTH, "0");
            this.headers.remove(CONTENT_TYPE);
            this.httpContentType = null;
            this.httpContent = null;
            this.encoding = null;
            return;
        }

        // for GET HEADER DELETE OPTION method, sdk should ignore the content
        if(getSysMethod() != null && !getSysMethod().hasContent()){
            content = new byte[0];
        }

        this.httpContent = content;
        this.encoding = encoding;
        String contentLen = String.valueOf(content.length);
        String strMd5 = ParameterHelper.md5Sum(content);
        this.headers.put(CONTENT_MD5, strMd5);
        this.headers.put(CONTENT_LENGTH, contentLen);
        if (null != format) {
            this.headers.put(CONTENT_TYPE, FormatType.mapFormatToAccept(format));
        }
    }

    @Deprecated
    public String getEncoding() {
        return encoding;
    }

    @Deprecated
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void putHeaderParameter(String name, String value) {
        if (null != name && null != value) {
            this.headers.put(name, value);
        }
    }

    public String getHeaderValue(String name) {
        return this.headers.get(name);
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
    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    public String getContentTypeValue(FormatType contentType, String encoding) {
        if (null != contentType && null != encoding) {
            return FormatType.mapFormatToAccept(contentType) +
                    ";charset=" + encoding.toLowerCase();
        } else if (null != contentType) {
            return FormatType.mapFormatToAccept(contentType);
        }
        return null;
    }

    public String getHttpContentString() throws ClientException {
        String stringContent = "";
        if (this.httpContent != null) {
            try {
                if (this.encoding == null) {
                    stringContent = new String(this.httpContent);
                } else {
                    stringContent = new String(this.httpContent, this.encoding);
                }
            } catch (UnsupportedEncodingException exp) {
                throw new ClientException("SDK.UnsupportedEncoding", "Can not parse response due to unsupported encoding.");
            }
        }

        return stringContent;
    }


    public String getSysUrl() {
        return url;
    }

    protected void setSysUrl(String url) {
        this.url = url;
    }

    public MethodType getSysMethod() {
        return method;
    }

    public void setSysMethod(MethodType method) {
        this.method = method;
        //This is the pop rule and the put method accepts only json data
        if (MethodType.PUT == method) {
            setHttpContentType(FormatType.JSON);
        }
    }

    public String getSysEncoding() {
        return encoding;
    }

    public void setSysEncoding(String encoding) {
        this.encoding = encoding;
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

    public Map<String, String> getSysHeaders() {
        return Collections.unmodifiableMap(headers);
    }
}
