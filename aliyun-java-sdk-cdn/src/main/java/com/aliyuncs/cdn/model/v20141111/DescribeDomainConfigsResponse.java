/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainConfigsResponse extends AcsResponse {

	private String requestId;

	private DomainConfigs domainConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DomainConfigs getDomainConfigs() {
		return this.domainConfigs;
	}

	public void setDomainConfigs(DomainConfigs domainConfigs) {
		this.domainConfigs = domainConfigs;
	}

	public static class DomainConfigs {

		private List<CacheExpiredConfig> cacheExpiredConfigs;

		private List<HttpErrorPageConfig> httpErrorPageConfigs;

		private List<HttpHeaderConfig> httpHeaderConfigs;

		private List<DynamicConfig> dynamicConfigs;

		private List<ReqHeaderConfig> reqHeaderConfigs;

		private CcConfig ccConfig;

		private ErrorPageConfig errorPageConfig;

		private OptimizeConfig optimizeConfig;

		private PageCompressConfig pageCompressConfig;

		private IgnoreQueryStringConfig ignoreQueryStringConfig;

		private RangeConfig rangeConfig;

		private RefererConfig refererConfig;

		private ReqAuthConfig reqAuthConfig;

		private SrcHostConfig srcHostConfig;

		private VideoSeekConfig videoSeekConfig;

		private WafConfig wafConfig;

		private NotifyUrlConfig notifyUrlConfig;

		private RedirectTypeConfig redirectTypeConfig;

		private ForwardSchemeConfig forwardSchemeConfig;

		private RemoveQueryStringConfig removeQueryStringConfig;

		private L2OssKeyConfig l2OssKeyConfig;

		private MacServiceConfig macServiceConfig;

		public List<CacheExpiredConfig> getCacheExpiredConfigs() {
			return this.cacheExpiredConfigs;
		}

		public void setCacheExpiredConfigs(List<CacheExpiredConfig> cacheExpiredConfigs) {
			this.cacheExpiredConfigs = cacheExpiredConfigs;
		}

		public List<HttpErrorPageConfig> getHttpErrorPageConfigs() {
			return this.httpErrorPageConfigs;
		}

		public void setHttpErrorPageConfigs(List<HttpErrorPageConfig> httpErrorPageConfigs) {
			this.httpErrorPageConfigs = httpErrorPageConfigs;
		}

		public List<HttpHeaderConfig> getHttpHeaderConfigs() {
			return this.httpHeaderConfigs;
		}

		public void setHttpHeaderConfigs(List<HttpHeaderConfig> httpHeaderConfigs) {
			this.httpHeaderConfigs = httpHeaderConfigs;
		}

		public List<DynamicConfig> getDynamicConfigs() {
			return this.dynamicConfigs;
		}

		public void setDynamicConfigs(List<DynamicConfig> dynamicConfigs) {
			this.dynamicConfigs = dynamicConfigs;
		}

		public List<ReqHeaderConfig> getReqHeaderConfigs() {
			return this.reqHeaderConfigs;
		}

		public void setReqHeaderConfigs(List<ReqHeaderConfig> reqHeaderConfigs) {
			this.reqHeaderConfigs = reqHeaderConfigs;
		}

		public CcConfig getCcConfig() {
			return this.ccConfig;
		}

		public void setCcConfig(CcConfig ccConfig) {
			this.ccConfig = ccConfig;
		}

		public ErrorPageConfig getErrorPageConfig() {
			return this.errorPageConfig;
		}

		public void setErrorPageConfig(ErrorPageConfig errorPageConfig) {
			this.errorPageConfig = errorPageConfig;
		}

		public OptimizeConfig getOptimizeConfig() {
			return this.optimizeConfig;
		}

		public void setOptimizeConfig(OptimizeConfig optimizeConfig) {
			this.optimizeConfig = optimizeConfig;
		}

		public PageCompressConfig getPageCompressConfig() {
			return this.pageCompressConfig;
		}

		public void setPageCompressConfig(PageCompressConfig pageCompressConfig) {
			this.pageCompressConfig = pageCompressConfig;
		}

		public IgnoreQueryStringConfig getIgnoreQueryStringConfig() {
			return this.ignoreQueryStringConfig;
		}

		public void setIgnoreQueryStringConfig(IgnoreQueryStringConfig ignoreQueryStringConfig) {
			this.ignoreQueryStringConfig = ignoreQueryStringConfig;
		}

		public RangeConfig getRangeConfig() {
			return this.rangeConfig;
		}

		public void setRangeConfig(RangeConfig rangeConfig) {
			this.rangeConfig = rangeConfig;
		}

		public RefererConfig getRefererConfig() {
			return this.refererConfig;
		}

		public void setRefererConfig(RefererConfig refererConfig) {
			this.refererConfig = refererConfig;
		}

		public ReqAuthConfig getReqAuthConfig() {
			return this.reqAuthConfig;
		}

		public void setReqAuthConfig(ReqAuthConfig reqAuthConfig) {
			this.reqAuthConfig = reqAuthConfig;
		}

		public SrcHostConfig getSrcHostConfig() {
			return this.srcHostConfig;
		}

		public void setSrcHostConfig(SrcHostConfig srcHostConfig) {
			this.srcHostConfig = srcHostConfig;
		}

		public VideoSeekConfig getVideoSeekConfig() {
			return this.videoSeekConfig;
		}

		public void setVideoSeekConfig(VideoSeekConfig videoSeekConfig) {
			this.videoSeekConfig = videoSeekConfig;
		}

		public WafConfig getWafConfig() {
			return this.wafConfig;
		}

		public void setWafConfig(WafConfig wafConfig) {
			this.wafConfig = wafConfig;
		}

		public NotifyUrlConfig getNotifyUrlConfig() {
			return this.notifyUrlConfig;
		}

		public void setNotifyUrlConfig(NotifyUrlConfig notifyUrlConfig) {
			this.notifyUrlConfig = notifyUrlConfig;
		}

		public RedirectTypeConfig getRedirectTypeConfig() {
			return this.redirectTypeConfig;
		}

		public void setRedirectTypeConfig(RedirectTypeConfig redirectTypeConfig) {
			this.redirectTypeConfig = redirectTypeConfig;
		}

		public ForwardSchemeConfig getForwardSchemeConfig() {
			return this.forwardSchemeConfig;
		}

		public void setForwardSchemeConfig(ForwardSchemeConfig forwardSchemeConfig) {
			this.forwardSchemeConfig = forwardSchemeConfig;
		}

		public RemoveQueryStringConfig getRemoveQueryStringConfig() {
			return this.removeQueryStringConfig;
		}

		public void setRemoveQueryStringConfig(RemoveQueryStringConfig removeQueryStringConfig) {
			this.removeQueryStringConfig = removeQueryStringConfig;
		}

		public L2OssKeyConfig getL2OssKeyConfig() {
			return this.l2OssKeyConfig;
		}

		public void setL2OssKeyConfig(L2OssKeyConfig l2OssKeyConfig) {
			this.l2OssKeyConfig = l2OssKeyConfig;
		}

		public MacServiceConfig getMacServiceConfig() {
			return this.macServiceConfig;
		}

		public void setMacServiceConfig(MacServiceConfig macServiceConfig) {
			this.macServiceConfig = macServiceConfig;
		}

		public static class CacheExpiredConfig {

			private String configId;

			private String cacheType;

			private String cacheContent;

			private String tTL;

			private String weight;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getCacheType() {
				return this.cacheType;
			}

			public void setCacheType(String cacheType) {
				this.cacheType = cacheType;
			}

			public String getCacheContent() {
				return this.cacheContent;
			}

			public void setCacheContent(String cacheContent) {
				this.cacheContent = cacheContent;
			}

			public String getTTL() {
				return this.tTL;
			}

			public void setTTL(String tTL) {
				this.tTL = tTL;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class HttpErrorPageConfig {

			private String configId;

			private String errorCode;

			private String pageUrl;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getPageUrl() {
				return this.pageUrl;
			}

			public void setPageUrl(String pageUrl) {
				this.pageUrl = pageUrl;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class HttpHeaderConfig {

			private String configId;

			private String headerKey;

			private String headerValue;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getHeaderKey() {
				return this.headerKey;
			}

			public void setHeaderKey(String headerKey) {
				this.headerKey = headerKey;
			}

			public String getHeaderValue() {
				return this.headerValue;
			}

			public void setHeaderValue(String headerValue) {
				this.headerValue = headerValue;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class DynamicConfig {

			private String configId;

			private String dynamicOrigin;

			private String staticType;

			private String staticUri;

			private String staticPath;

			private String dynamicCacheControl;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getDynamicOrigin() {
				return this.dynamicOrigin;
			}

			public void setDynamicOrigin(String dynamicOrigin) {
				this.dynamicOrigin = dynamicOrigin;
			}

			public String getStaticType() {
				return this.staticType;
			}

			public void setStaticType(String staticType) {
				this.staticType = staticType;
			}

			public String getStaticUri() {
				return this.staticUri;
			}

			public void setStaticUri(String staticUri) {
				this.staticUri = staticUri;
			}

			public String getStaticPath() {
				return this.staticPath;
			}

			public void setStaticPath(String staticPath) {
				this.staticPath = staticPath;
			}

			public String getDynamicCacheControl() {
				return this.dynamicCacheControl;
			}

			public void setDynamicCacheControl(String dynamicCacheControl) {
				this.dynamicCacheControl = dynamicCacheControl;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class ReqHeaderConfig {

			private String configId;

			private String key;

			private String value;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class CcConfig {

			private String configId;

			private String enable;

			private String allowIps;

			private String blockIps;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getAllowIps() {
				return this.allowIps;
			}

			public void setAllowIps(String allowIps) {
				this.allowIps = allowIps;
			}

			public String getBlockIps() {
				return this.blockIps;
			}

			public void setBlockIps(String blockIps) {
				this.blockIps = blockIps;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class ErrorPageConfig {

			private String configId;

			private String errorCode;

			private String pageType;

			private String customPageUrl;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getPageType() {
				return this.pageType;
			}

			public void setPageType(String pageType) {
				this.pageType = pageType;
			}

			public String getCustomPageUrl() {
				return this.customPageUrl;
			}

			public void setCustomPageUrl(String customPageUrl) {
				this.customPageUrl = customPageUrl;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class OptimizeConfig {

			private String configId;

			private String enable;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class PageCompressConfig {

			private String configId;

			private String enable;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class IgnoreQueryStringConfig {

			private String configId;

			private String hashKeyArgs;

			private String enable;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getHashKeyArgs() {
				return this.hashKeyArgs;
			}

			public void setHashKeyArgs(String hashKeyArgs) {
				this.hashKeyArgs = hashKeyArgs;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class RangeConfig {

			private String configId;

			private String enable;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class RefererConfig {

			private String configId;

			private String referType;

			private String referList;

			private String allowEmpty;

			private String disableAst;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getReferType() {
				return this.referType;
			}

			public void setReferType(String referType) {
				this.referType = referType;
			}

			public String getReferList() {
				return this.referList;
			}

			public void setReferList(String referList) {
				this.referList = referList;
			}

			public String getAllowEmpty() {
				return this.allowEmpty;
			}

			public void setAllowEmpty(String allowEmpty) {
				this.allowEmpty = allowEmpty;
			}

			public String getDisableAst() {
				return this.disableAst;
			}

			public void setDisableAst(String disableAst) {
				this.disableAst = disableAst;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class ReqAuthConfig {

			private String configId;

			private String authType;

			private String key1;

			private String key2;

			private String status;

			private String aliAuthWhiteList;

			private String authM3u8;

			private String authAddr;

			private String authRemoteDesc;

			private String timeOut;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}

			public String getKey1() {
				return this.key1;
			}

			public void setKey1(String key1) {
				this.key1 = key1;
			}

			public String getKey2() {
				return this.key2;
			}

			public void setKey2(String key2) {
				this.key2 = key2;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getAliAuthWhiteList() {
				return this.aliAuthWhiteList;
			}

			public void setAliAuthWhiteList(String aliAuthWhiteList) {
				this.aliAuthWhiteList = aliAuthWhiteList;
			}

			public String getAuthM3u8() {
				return this.authM3u8;
			}

			public void setAuthM3u8(String authM3u8) {
				this.authM3u8 = authM3u8;
			}

			public String getAuthAddr() {
				return this.authAddr;
			}

			public void setAuthAddr(String authAddr) {
				this.authAddr = authAddr;
			}

			public String getAuthRemoteDesc() {
				return this.authRemoteDesc;
			}

			public void setAuthRemoteDesc(String authRemoteDesc) {
				this.authRemoteDesc = authRemoteDesc;
			}

			public String getTimeOut() {
				return this.timeOut;
			}

			public void setTimeOut(String timeOut) {
				this.timeOut = timeOut;
			}
		}

		public static class SrcHostConfig {

			private String configId;

			private String domainName;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class VideoSeekConfig {

			private String configId;

			private String enable;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class WafConfig {

			private String configId;

			private String enable;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class NotifyUrlConfig {

			private String enable;

			private String notifyUrl;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getNotifyUrl() {
				return this.notifyUrl;
			}

			public void setNotifyUrl(String notifyUrl) {
				this.notifyUrl = notifyUrl;
			}
		}

		public static class RedirectTypeConfig {

			private String redirectType;

			public String getRedirectType() {
				return this.redirectType;
			}

			public void setRedirectType(String redirectType) {
				this.redirectType = redirectType;
			}
		}

		public static class ForwardSchemeConfig {

			private String configId;

			private String enable;

			private String schemeOrigin;

			private String schemeOriginPort;

			private String status;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getSchemeOrigin() {
				return this.schemeOrigin;
			}

			public void setSchemeOrigin(String schemeOrigin) {
				this.schemeOrigin = schemeOrigin;
			}

			public String getSchemeOriginPort() {
				return this.schemeOriginPort;
			}

			public void setSchemeOriginPort(String schemeOriginPort) {
				this.schemeOriginPort = schemeOriginPort;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class RemoveQueryStringConfig {

			private String aliRemoveArgs;

			private String configId;

			private String status;

			public String getAliRemoveArgs() {
				return this.aliRemoveArgs;
			}

			public void setAliRemoveArgs(String aliRemoveArgs) {
				this.aliRemoveArgs = aliRemoveArgs;
			}

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class L2OssKeyConfig {

			private String privateOssAuth;

			private String configId;

			private String status;

			public String getPrivateOssAuth() {
				return this.privateOssAuth;
			}

			public void setPrivateOssAuth(String privateOssAuth) {
				this.privateOssAuth = privateOssAuth;
			}

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class MacServiceConfig {

			private String appList;

			private String enabled;

			private String processResult;

			private String configId;

			private String status;

			public String getAppList() {
				return this.appList;
			}

			public void setAppList(String appList) {
				this.appList = appList;
			}

			public String getEnabled() {
				return this.enabled;
			}

			public void setEnabled(String enabled) {
				this.enabled = enabled;
			}

			public String getProcessResult() {
				return this.processResult;
			}

			public void setProcessResult(String processResult) {
				this.processResult = processResult;
			}

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeDomainConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
