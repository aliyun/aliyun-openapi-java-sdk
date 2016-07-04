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

		private List<HttpHeaderConfig> httpHeaderConfigs;

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

		public List<CacheExpiredConfig> getCacheExpiredConfigs() {
			return this.cacheExpiredConfigs;
		}

		public void setCacheExpiredConfigs(List<CacheExpiredConfig> cacheExpiredConfigs) {
			this.cacheExpiredConfigs = cacheExpiredConfigs;
		}

		public List<HttpHeaderConfig> getHttpHeaderConfigs() {
			return this.httpHeaderConfigs;
		}

		public void setHttpHeaderConfigs(List<HttpHeaderConfig> httpHeaderConfigs) {
			this.httpHeaderConfigs = httpHeaderConfigs;
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

		public static class CcConfig {

			private String enable;

			private String allowIps;

			private String blockIps;

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
		}

		public static class ErrorPageConfig {

			private String errorCode;

			private String pageType;

			private String customPageUrl;

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
		}

		public static class OptimizeConfig {

			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}
		}

		public static class PageCompressConfig {

			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}
		}

		public static class IgnoreQueryStringConfig {

			private String hashKeyArgs;

			private String enable;

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
		}

		public static class RangeConfig {

			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}
		}

		public static class RefererConfig {

			private String referType;

			private String referList;

			private String allowEmpty;

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
		}

		public static class ReqAuthConfig {

			private String authType;

			private String key1;

			private String key2;

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
		}

		public static class SrcHostConfig {

			private String domainName;

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}
		}

		public static class VideoSeekConfig {

			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}
		}

		public static class WafConfig {

			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
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

			private String enable;

			private String schemeOrigin;

			private String schemeOriginPort;

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
		}
	}

	@Override
	public DescribeDomainConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
