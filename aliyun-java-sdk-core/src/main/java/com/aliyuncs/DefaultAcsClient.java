package com.aliyuncs;

import com.aliyuncs.auth.*;
import com.aliyuncs.auth.signers.SignatureAlgorithm;
import com.aliyuncs.endpoint.DefaultEndpointResolver;
import com.aliyuncs.endpoint.EndpointResolver;
import com.aliyuncs.endpoint.ResolveEndpointRequest;
import com.aliyuncs.exceptions.*;
import com.aliyuncs.http.*;
import com.aliyuncs.policy.retry.RetryPolicy;
import com.aliyuncs.policy.retry.RetryPolicyContext;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.reader.Reader;
import com.aliyuncs.reader.ReaderFactory;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.transform.UnmarshallerContext;
import com.aliyuncs.unmarshaller.Unmarshaller;
import com.aliyuncs.unmarshaller.UnmarshallerFactory;
import com.aliyuncs.utils.*;
import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.propagation.Format;
import io.opentracing.tag.Tags;
import io.opentracing.util.GlobalTracer;
import org.slf4j.Logger;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("deprecation")
public class DefaultAcsClient implements IAcsClient {

    // Now maxRetryNumber and autoRetry has no effect.
    private int maxRetryNumber = 3;
    private boolean autoRetry = true;
    private IClientProfile clientProfile;
    private AlibabaCloudCredentialsProvider credentialsProvider;

    private IHttpClient httpClient;
    private EndpointResolver endpointResolver;
    private static final String SIGNATURE_BEGIN = "string to sign is:";
    private final UserAgentConfig userAgentConfig = new UserAgentConfig();
    private SignatureVersion signatureVersion = SignatureVersion.V1;
    private SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ACS3_HMAC_SHA256;
    private final String SEPARATOR = "::";
    private RetryPolicy retryPolicy = RetryPolicy.none();


    /**
     * @Deprecated : Use DefaultAcsClient(String regionId) instead of this
     */
    @Deprecated
    public DefaultAcsClient() throws ClientException {
        this.clientProfile = DefaultProfile.getProfile();
        this.httpClient = HttpClientFactory.buildClient(this.clientProfile);
    }

    public DefaultAcsClient(String regionId) throws ClientException {
        this.clientProfile = DefaultProfile.getProfile(regionId);
        this.httpClient = HttpClientFactory.buildClient(this.clientProfile);
        this.credentialsProvider = new DefaultCredentialsProvider();
        this.endpointResolver = new DefaultEndpointResolver(this);
        this.appendUserAgent("HTTPClient", this.httpClient.getClass().getSimpleName());
    }

    public DefaultAcsClient(IClientProfile profile) {
        this.clientProfile = profile;
        AlibabaCloudCredentialsProvider provider = profile.getCredentialsProvider();
        if (provider != null) {
            this.credentialsProvider = provider;
        } else {
            this.credentialsProvider = new StaticCredentialsProvider(profile);
        }
        this.httpClient = HttpClientFactory.buildClient(profile);
        this.endpointResolver = new DefaultEndpointResolver(this, profile);
        this.appendUserAgent("HTTPClient", this.httpClient.getClass().getSimpleName());
    }

    public DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentials credentials) {
        this(profile, new StaticCredentialsProvider(credentials));
    }

    public DefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) {
        this.clientProfile = profile;
        this.credentialsProvider = credentialsProvider;
        this.clientProfile.setCredentialsProvider(this.credentialsProvider);
        this.httpClient = HttpClientFactory.buildClient(this.clientProfile);
        this.endpointResolver = new DefaultEndpointResolver(this, profile);
        this.appendUserAgent("HTTPClient", this.httpClient.getClass().getSimpleName());
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request)
            throws ClientException, ServerException {
        return this.doAction(request, autoRetry, maxRetryNumber, this.clientProfile);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry, int maxRetryCounts)
            throws ClientException, ServerException {
        return this.doAction(request, autoRetry, maxRetryCounts, this.clientProfile);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, IClientProfile profile)
            throws ClientException, ServerException {
        return this.doAction(request, this.autoRetry, this.maxRetryNumber, profile);
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, String regionId, Credential credential)
            throws ClientException, ServerException {
        if (null == request.getSysSignatureVersion()) {
            request.setSysSignatureVersion(this.signatureVersion);
        }
        if (null == request.getSysSignatureAlgorithm()) {
            request.setSysSignatureAlgorithm(this.signatureAlgorithm);
        }
        Signer signer = Signer.getSigner(new LegacyCredentials(credential), request.getSysSignatureVersion(), request.getSysSignatureAlgorithm());
        if (null == request.getSysRegionId()) {
            request.setSysRegionId(regionId);
        }
        return doAction(request, regionId, new LegacyCredentials(credential), signer, null);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request) throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request);
        return parseAcsResponse(request, baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, boolean autoRetry, int maxRetryCounts)
            throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request, autoRetry, maxRetryCounts);
        return parseAcsResponse(request, baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, IClientProfile profile)
            throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request, profile);
        return parseAcsResponse(request, baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, String regionId, Credential credential)
            throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request, regionId, credential);
        return parseAcsResponse(request, baseResponse);
    }

    @Override
    public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, String regionId)
            throws ServerException, ClientException {
        if (null == request.getSysRegionId()) {
            request.setSysRegionId(regionId);
        }
        HttpResponse baseResponse = this.doAction(request);
        return parseAcsResponse(request, baseResponse);
    }

    @SuppressWarnings("unchecked")
    @Override
    public CommonResponse getCommonResponse(CommonRequest request) throws ServerException, ClientException {
        HttpResponse baseResponse = this.doAction(request.buildRequest());
        if (baseResponse.isSuccess()) {
            String stringContent = baseResponse.getHttpContentString();
            CommonResponse response = new CommonResponse();
            response.setData(stringContent);
            response.setHttpStatus(baseResponse.getStatus());
            response.setHttpResponse(baseResponse);
            return response;
        } else {
            FormatType format = baseResponse.getHttpContentType();
            AcsError error = readError(baseResponse, format);
            if (500 <= baseResponse.getStatus()) {
                throw new ServerException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
            } else {
                throw new ClientException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId(), error.getErrorDescription(), error.getAccessDeniedDetail());
            }
        }
    }

    @Override
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry, int maxRetryCounts,
                                                         IClientProfile profile) throws ClientException, ServerException {
        if (null == profile) {
            throw new ClientException("SDK.InvalidProfile", "No active profile found.");
        }
        String region = profile.getRegionId();
        if (null == request.getSysRegionId()) {
            request.setSysRegionId(region);
        }
        AlibabaCloudCredentials credentials;
        if (null == credentialsProvider) {
            credentials = new AnonymousCredentials();
        } else {
            credentials = this.credentialsProvider.getCredentials();
        }
        if (null == request.getSysSignatureVersion()) {
            request.setSysSignatureVersion(this.signatureVersion);
        }
        if (null == request.getSysSignatureAlgorithm()) {
            request.setSysSignatureAlgorithm(this.signatureAlgorithm);
        }
        Signer signer = Signer.getSigner(credentials, request.getSysSignatureVersion(), request.getSysSignatureAlgorithm());
        FormatType format = profile.getFormat();

        return this.doAction(request, request.getSysRegionId(), credentials, signer, format);
    }

    private <T extends AcsResponse> T parseAcsResponse(AcsRequest<T> request, HttpResponse baseResponse)
            throws ServerException, ClientException {
        FormatType format = baseResponse.getHttpContentType();
        if (FormatType.JSON != format && FormatType.XML != format) {
            throw new ClientException(String.format("Server response has a bad format type: %s;\nThe original return is: %s;\n" +
                            "The original header is: %s;",
                    format, baseResponse.getHttpContentString(), baseResponse.getSysHeaders().toString()));
        }
        if (baseResponse.isSuccess()) {
            return readResponse(request.getResponseClass(), baseResponse, format);
        } else {
            AcsError error = readError(baseResponse, format);
            if (500 <= baseResponse.getStatus()) {
                throw new ServerException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
            } else if (400 == baseResponse.getStatus() && ("IncompleteSignature".equals(error.getErrorCode())
                    || "SignatureDoesNotMatch".equals(error.getErrorCode()))) {
                String errorMessage = error.getErrorMessage();
                Pattern startPattern = Pattern.compile(SIGNATURE_BEGIN);
                Matcher startMatcher = startPattern.matcher(errorMessage);
                if (startMatcher.find()) {
                    int start = startMatcher.end();
                    String errorStrToSign = errorMessage.substring(start);
                    if (request.strToSign.equals(errorStrToSign)) {
                        throw new ClientException("SDK.InvalidAccessKeySecret",
                                "Specified Access Key Secret is not valid.", error.getRequestId());
                    }
                }
            }
            throw new ClientException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId(), error.getErrorDescription(), error.getAccessDeniedDetail());
        }
    }

    /**
     * @Deprecated : Use other overload methods
     */
    @Deprecated
    public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry, int maxRetryNumber,
                                                         String regionId, Credential credential, Signer signer, FormatType format)
            throws ClientException, ServerException {
        return doAction(request, regionId, new LegacyCredentials(credential), signer,
                format);
    }

    public ProductDomain getDomain(AcsRequest request, String regionId)
            throws ClientException {
        ProductDomain domain;
        if (request.getSysProductDomain() != null) {
            domain = request.getSysProductDomain();
        } else {
            ResolveEndpointRequest resolveEndpointRequest = new ResolveEndpointRequest(regionId,
                    request.getSysProduct(), request.getSysLocationProduct(), request.getSysEndpointType());
            resolveEndpointRequest.setProductEndpointMap(request.productEndpointMap);
            resolveEndpointRequest.setProductEndpointRegional(request.productEndpointRegional);
            resolveEndpointRequest.setProductNetwork(request.productNetwork);
            resolveEndpointRequest.setProductSuffix(request.productSuffix);
            String endpoint = endpointResolver.resolve(resolveEndpointRequest);
            domain = new ProductDomain(request.getSysProduct(), endpoint);

            if (endpoint.endsWith("endpoint-test.exception.com")) {
                // For endpoint testability, if the endpoint is xxxx.endpoint-test.special.com
                // throw a client exception with this endpoint
                throw new ClientException(ErrorCodeConstant.SDK_ENDPOINT_TESTABILITY, endpoint);
            }
        }

        return domain;
    }

    private <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request,
                                                          String regionId, AlibabaCloudCredentials credentials, Signer signer, FormatType format)
            throws ClientException, ServerException {
        if (!GlobalTracer.isRegistered() || clientProfile.isCloseTrace()) {
            return doRealAction(request, regionId, credentials, signer, format);
        }

        Tracer tracer = GlobalTracer.get();
        Span activeSpan = tracer.activeSpan();
        Tracer.SpanBuilder sb = tracer.buildSpan(request.getSysUrl());
        if (activeSpan != null) {
            sb.asChildOf(activeSpan);
        }
        Span span = sb.withTag(Tags.COMPONENT.getKey(), "aliyunApi")
                .withTag("actionName", request.getSysActionName())
                .withTag("queryParam", MapUtils.getMapString(request.getQueryParameters()))
                .start();
        tracer.inject(span.context(), Format.Builtin.HTTP_HEADERS, new HttpHeadersInjectAdapter(request));
        try {
            HttpResponse response = doRealAction(request, regionId, credentials, signer, format);
            span.setTag("status", response.getStatus());
            span.setTag("ReasonPhrase", response.getReasonPhrase());
            return response;
        } catch (ClientException ex) {
            TraceUtils.onError(ex, span);
            throw ex;
        } finally {
            span.finish();
        }

    }

    private <T extends AcsResponse> HttpResponse doRealAction(AcsRequest<T> request,
                                                              String regionId, AlibabaCloudCredentials credentials, Signer signer, FormatType format)
            throws ClientException, ServerException {

        doActionWithProxy(request.getSysProtocol(), System.getenv("HTTPS_PROXY"), System.getenv("HTTP_PROXY"));
        doActionWithIgnoreSSL(request, X509TrustAll.ignoreSSLCerts);

        Logger logger = clientProfile.getLogger();
        String startTime = "";
        String timeCost = "";
        HttpResponse response = null;
        String errorMessage = "";
        try {
            FormatType requestFormatType = request.getSysAcceptFormat();
            if (null != requestFormatType) {
                format = requestFormatType;
            }

            ProductDomain domain = getDomain(request, regionId);

            if (request.getSysProtocol() == null) {
                request.setSysProtocol(this.clientProfile.getHttpClientConfig().getProtocolType());
            }
            request.putHeaderParameter("User-Agent",
                    UserAgentConfig.resolve(request.getSysUserAgentConfig(), this.userAgentConfig));
            request.putHeaderParameter("x-acs-version", request.getSysVersion());
            if (null != request.getSysActionName()) {
                request.putHeaderParameter("x-acs-action", request.getSysActionName());
            }
            String coordinate = credentials.getAccessKeyId() == null ? "" : credentials.getAccessKeyId()
                    + SEPARATOR + request.getSysProduct()
                    + SEPARATOR + request.getSysVersion()
                    + SEPARATOR + request.getSysActionName()
                    + SEPARATOR + request.getSysRegionId();
            RetryPolicy retryPolicy = request.getSysRetryPolicy() != null ? request.getSysRetryPolicy() :
                    this.retryPolicy != null ? this.retryPolicy : RetryPolicy.none();
            int retriesAttempted = 0;
            RetryPolicyContext context = RetryPolicyContext.builder()
                    .coordinate(coordinate)
                    .retriesAttempted(retriesAttempted)
                    .build();
            if (retryPolicy.enableAliyunThrottlingControl()) {
                request.putHeaderParameter("x-sdk-throttling-control", "enable");
            }
            while (retryPolicy.shouldRetry(context)) {
                TimeUnit.MILLISECONDS.sleep(retryPolicy.getBackoffDelay(context));
                HttpRequest httpRequest = request.signRequest(signer, credentials, format, domain);
                Exception ex;
                try {
                    HttpUtil.debugHttpRequest(httpRequest);
                    startTime = LogUtils.localeNow();
                    long start = System.nanoTime();
                    response = this.httpClient.syncInvoke(httpRequest);
                    long end = System.nanoTime();
                    timeCost = TimeUnit.NANOSECONDS.toMillis(end - start) + "ms";
                    HttpUtil.debugHttpResponse(response);
                    if (response.isSuccess()) {
                        return response;
                    } else {
                        FormatType responseFormat = response.getHttpContentType();
                        AcsError error = readError(response, responseFormat);
                        if (500 <= response.getStatus()) {
                            ex = new ServerException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
                        } else {
                            ex = new ClientException(error.getErrorCode(), error.getErrorMessage(), error.getRequestId(), error.getErrorDescription(), error.getAccessDeniedDetail());
                        }
                    }
                } catch (SocketTimeoutException exp) {
                    ex = exp;
                } catch (IOException exp) {
                    ex = exp;
                }
                context = RetryPolicyContext.builder()
                        .coordinate(coordinate)
                        .retriesAttempted(++retriesAttempted)
                        .httpResponse(response)
                        .exception(ex)
                        .build();
            }
            if (context.httpResponse() != null) {
                return context.httpResponse();
            }
            if (context.exception() != null) {
                throw context.exception();
            }
            errorMessage = "Some errors occurred. Maybe the client triggered throttling policy.";
            throw new ClientException("SDK.RequestTryOrRetryFailed", errorMessage, context.exception());
        } catch (InterruptedException exp) {
            errorMessage = exp.getMessage();
            throw new ClientException("SDK.InterruptedException",
                    "Client has been interrupted: connection " + request.getSysUrl() + " failed", exp);
        } catch (InvalidKeyException exp) {
            errorMessage = exp.getMessage();
            throw new ClientException("SDK.InvalidAccessSecret", "Specified access secret is not valid.", exp);
        } catch (NoSuchAlgorithmException exp) {
            errorMessage = exp.getMessage();
            throw new ClientException("SDK.InvalidMD5Algorithm", "MD5 hash is not supported by client side.", exp);
        } catch (UnsupportedEncodingException exp) {
            errorMessage = exp.getMessage();
            throw new ClientException("SDK.UnsupportedEncodingException", "UTF-8 encoding is not supported by client side.", exp);
        } catch (Throwable exp) {
            errorMessage = exp.getMessage();
            if (SocketTimeoutException.class.isAssignableFrom(exp.getClass())) {
                throw new ClientException("SDK.ReadTimeout",
                        "SocketTimeoutException has occurred on a socket read or accept.The url is " +
                                request.getSysUrl(), exp);
            } else if (IOException.class.isAssignableFrom(exp.getClass())) {
                throw new ClientException("SDK.ServerUnreachable",
                        "Server unreachable: connection " + request.getSysUrl() + " failed", exp);
            } else if (ServerException.class.isAssignableFrom(exp.getClass())) {
                throw (ServerException) exp;
            } else if (ThrottlingException.class.isAssignableFrom(exp.getClass())) {
                throw new ClientException("SDK.RequestTryOrRetryFailed", errorMessage, exp);
            } else if (ClientException.class.isAssignableFrom(exp.getClass())) {
                throw (ClientException) exp;
            } else {
                throw new ClientException("SDK.RequestTryOrRetryFailed",
                        "Some errors occurred. Error message for latest request is " + exp.getMessage(), exp);
            }
        } finally {
            if (null != logger) {
                try {
                    LogUtils.LogUnit logUnit = LogUtils.createLogUnit(request, response);
                    logUnit.setStartTime(startTime);
                    logUnit.setCost(timeCost);
                    logUnit.setError(errorMessage);
                    String logContent = LogUtils.fillContent(clientProfile.getLogFormat(), logUnit);
                    logger.info(logContent);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 2019-01-03 change access control from private to protected, then subClass can
     * override it and rewrite httpResponse processing
     */
    protected <T extends AcsResponse> T readResponse(Class<T> clazz, HttpResponse httpResponse, FormatType format)
            throws ClientException {
        // new version response contains "@XmlRootElement" annotation
        if (clazz.isAnnotationPresent(XmlRootElement.class)
                && !clientProfile.getHttpClientConfig().isCompatibleMode()) {
            Unmarshaller unmarshaller = UnmarshallerFactory.getUnmarshaller(format);
            return unmarshaller.unmarshal(clazz, httpResponse.getHttpContentString());
        } else {
            Reader reader = ReaderFactory.createInstance(format);
            UnmarshallerContext context = new UnmarshallerContext();
            T response;
            String stringContent = httpResponse.getHttpContentString();

            if (stringContent == null) {
                throw new ClientException(ErrorCodeConstant.SDK_INVALID_SERVER_RESPONSE,
                        ErrorMessageConstant.SERVER_RESPONSE_HTTP_BODY_EMPTY);
            }

            try {
                response = clazz.newInstance();
            } catch (Exception e) {
                throw new ClientException("SDK.InvalidResponseClass",
                        "Unable to allocate " + clazz.getName() + " class");
            }

            String responseEndpoint = clazz.getName().substring(clazz.getName().lastIndexOf(".") + 1);
            if (response.checkShowJsonItemName()) {
                context.setResponseMap(reader.read(stringContent, responseEndpoint));
            } else {
                context.setResponseMap(reader.readForHideArrayItem(stringContent, responseEndpoint));
            }

            context.setHttpResponse(httpResponse);
            response.getInstance(context);
            return response;
        }
    }

    private AcsError readError(HttpResponse httpResponse, FormatType format) throws ClientException {
        AcsError error = new AcsError();
        String stringContent = httpResponse.getHttpContentString();
        if (stringContent == null) {
            error.setErrorCode("(null)");
            error.setErrorMessage("(null)");
            error.setRequestId("(null)");
            error.setStatusCode(httpResponse.getStatus());
            return error;
        } else {
            try {
                String responseEndpoint = "Error";
                Reader reader = ReaderFactory.createInstance(format);
                UnmarshallerContext context = new UnmarshallerContext();
                context.setResponseMap(reader.read(stringContent, responseEndpoint));
                return error.getInstance(context);
            } catch (Exception e) {
                stringContent = "Server response has a bad format type: " + format + ";\nThe original return is: \n" + stringContent;
                error.setErrorCode("(null)");
                error.setErrorMessage(stringContent);
                error.setRequestId("(null)");
                error.setStatusCode(httpResponse.getStatus());
                return error;
            }
        }
    }

    /**
     * Compatible with previous versions of proxy Settings
     */
    public void doActionWithProxy(ProtocolType protocolType, String httpsProxy, String httpProxy) {
        HttpClientConfig config = this.clientProfile.getHttpClientConfig();
        if (protocolType == ProtocolType.HTTP && httpProxy != null) {
            config.setHttpProxy(httpProxy);
            return;
        }
        if (protocolType == ProtocolType.HTTPS && httpsProxy != null) {
            config.setHttpsProxy(httpsProxy);
            return;
        }
        return;
    }

    /**
     * Compatible with previous versions of SSL Settings
     */
    public void doActionWithIgnoreSSL(AcsRequest request, boolean isIgnore) {
        if (isIgnore) {
            request.setIgnoreSSLCerts(true);
        }
    }

    @Deprecated
    public boolean isAutoRetry() {
        return autoRetry;
    }

    @Deprecated
    public void setAutoRetry(boolean autoRetry) {
        this.autoRetry = autoRetry;
    }

    @Deprecated
    public int getMaxRetryNumber() {
        return maxRetryNumber;
    }

    @Deprecated
    public void setMaxRetryNumber(int maxRetryNumber) {
        this.maxRetryNumber = maxRetryNumber;
    }

    @Override
    public void restoreSSLCertificate() {
        this.httpClient.restoreSSLCertificate();
    }

    @Override
    public void ignoreSSLCertificate() {
        this.httpClient.ignoreSSLCertificate();
    }

    public void setEndpointResolver(EndpointResolver resolver) {
        endpointResolver = resolver;
    }

    @Override
    public void shutdown() {
        if (!this.httpClient.isSingleton()) {
            IOUtils.closeQuietly(this.httpClient);
            this.httpClient = null;
        }
    }

    public DefaultProfile getProfile() {
        return (DefaultProfile) clientProfile;
    }

    public void appendUserAgent(String key, String value) {
        this.userAgentConfig.append(key, value);
    }

    public UserAgentConfig getUserAgentConfig() {
        return userAgentConfig;
    }

    public IHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(IHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public AlibabaCloudCredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    @Override
    public SignatureVersion getSignatureVersion() {
        return signatureVersion;
    }

    @Override
    public void setSignatureVersion(SignatureVersion signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    @Override
    public SignatureAlgorithm getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    @Override
    public void setSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    @Override
    public RetryPolicy getSysRetryPolicy() {
        return this.retryPolicy;
    }

    @Override
    public void setSysRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

}
