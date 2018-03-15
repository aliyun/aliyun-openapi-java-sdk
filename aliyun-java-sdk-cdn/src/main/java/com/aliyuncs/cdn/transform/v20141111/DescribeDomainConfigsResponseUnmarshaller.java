/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.CcConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.DynamicConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.NotifyUrlConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.RangeConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.RedirectTypeConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.RefererConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.WafConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainConfigsResponseUnmarshaller {

	public static DescribeDomainConfigsResponse unmarshall(DescribeDomainConfigsResponse describeDomainConfigsResponse, UnmarshallerContext context) {
		
		describeDomainConfigsResponse.setRequestId(context.stringValue("DescribeDomainConfigsResponse.RequestId"));

		DomainConfigs domainConfigs = new DomainConfigs();

		CcConfig ccConfig = new CcConfig();
		ccConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.ConfigId"));
		ccConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.Enable"));
		ccConfig.setAllowIps(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.AllowIps"));
		ccConfig.setBlockIps(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.BlockIps"));
		ccConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.Status"));
		domainConfigs.setCcConfig(ccConfig);

		ErrorPageConfig errorPageConfig = new ErrorPageConfig();
		errorPageConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.ConfigId"));
		errorPageConfig.setErrorCode(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.ErrorCode"));
		errorPageConfig.setPageType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.PageType"));
		errorPageConfig.setCustomPageUrl(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.CustomPageUrl"));
		errorPageConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.Status"));
		domainConfigs.setErrorPageConfig(errorPageConfig);

		OptimizeConfig optimizeConfig = new OptimizeConfig();
		optimizeConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.ConfigId"));
		optimizeConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.Enable"));
		optimizeConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.Status"));
		domainConfigs.setOptimizeConfig(optimizeConfig);

		PageCompressConfig pageCompressConfig = new PageCompressConfig();
		pageCompressConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.ConfigId"));
		pageCompressConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.Enable"));
		pageCompressConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.Status"));
		domainConfigs.setPageCompressConfig(pageCompressConfig);

		IgnoreQueryStringConfig ignoreQueryStringConfig = new IgnoreQueryStringConfig();
		ignoreQueryStringConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.ConfigId"));
		ignoreQueryStringConfig.setHashKeyArgs(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.HashKeyArgs"));
		ignoreQueryStringConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.Enable"));
		ignoreQueryStringConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.Status"));
		domainConfigs.setIgnoreQueryStringConfig(ignoreQueryStringConfig);

		RangeConfig rangeConfig = new RangeConfig();
		rangeConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.ConfigId"));
		rangeConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.Enable"));
		rangeConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.Status"));
		domainConfigs.setRangeConfig(rangeConfig);

		RefererConfig refererConfig = new RefererConfig();
		refererConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ConfigId"));
		refererConfig.setReferType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ReferType"));
		refererConfig.setReferList(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ReferList"));
		refererConfig.setAllowEmpty(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.AllowEmpty"));
		refererConfig.setDisableAst(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.DisableAst"));
		refererConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.Status"));
		domainConfigs.setRefererConfig(refererConfig);

		ReqAuthConfig reqAuthConfig = new ReqAuthConfig();
		reqAuthConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.ConfigId"));
		reqAuthConfig.setAuthType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthType"));
		reqAuthConfig.setKey1(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Key1"));
		reqAuthConfig.setKey2(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Key2"));
		reqAuthConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Status"));
		reqAuthConfig.setAliAuthWhiteList(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AliAuthWhiteList"));
		reqAuthConfig.setAuthM3u8(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthM3u8"));
		reqAuthConfig.setAuthAddr(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthAddr"));
		reqAuthConfig.setAuthRemoteDesc(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthRemoteDesc"));
		reqAuthConfig.setTimeOut(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.TimeOut"));
		domainConfigs.setReqAuthConfig(reqAuthConfig);

		SrcHostConfig srcHostConfig = new SrcHostConfig();
		srcHostConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.ConfigId"));
		srcHostConfig.setDomainName(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.DomainName"));
		srcHostConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.Status"));
		domainConfigs.setSrcHostConfig(srcHostConfig);

		VideoSeekConfig videoSeekConfig = new VideoSeekConfig();
		videoSeekConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.ConfigId"));
		videoSeekConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.Enable"));
		videoSeekConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.Status"));
		domainConfigs.setVideoSeekConfig(videoSeekConfig);

		WafConfig wafConfig = new WafConfig();
		wafConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.ConfigId"));
		wafConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.Enable"));
		wafConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.Status"));
		domainConfigs.setWafConfig(wafConfig);

		NotifyUrlConfig notifyUrlConfig = new NotifyUrlConfig();
		notifyUrlConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.NotifyUrlConfig.Enable"));
		notifyUrlConfig.setNotifyUrl(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.NotifyUrlConfig.NotifyUrl"));
		domainConfigs.setNotifyUrlConfig(notifyUrlConfig);

		RedirectTypeConfig redirectTypeConfig = new RedirectTypeConfig();
		redirectTypeConfig.setRedirectType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RedirectTypeConfig.RedirectType"));
		domainConfigs.setRedirectTypeConfig(redirectTypeConfig);

		ForwardSchemeConfig forwardSchemeConfig = new ForwardSchemeConfig();
		forwardSchemeConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.ConfigId"));
		forwardSchemeConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.Enable"));
		forwardSchemeConfig.setSchemeOrigin(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.SchemeOrigin"));
		forwardSchemeConfig.setSchemeOriginPort(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.SchemeOriginPort"));
		forwardSchemeConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.Status"));
		domainConfigs.setForwardSchemeConfig(forwardSchemeConfig);

		RemoveQueryStringConfig removeQueryStringConfig = new RemoveQueryStringConfig();
		removeQueryStringConfig.setAliRemoveArgs(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig.AliRemoveArgs"));
		removeQueryStringConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig.ConfigId"));
		removeQueryStringConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig.Status"));
		domainConfigs.setRemoveQueryStringConfig(removeQueryStringConfig);

		L2OssKeyConfig l2OssKeyConfig = new L2OssKeyConfig();
		l2OssKeyConfig.setPrivateOssAuth(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig.PrivateOssAuth"));
		l2OssKeyConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig.ConfigId"));
		l2OssKeyConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig.Status"));
		domainConfigs.setL2OssKeyConfig(l2OssKeyConfig);

		MacServiceConfig macServiceConfig = new MacServiceConfig();
		macServiceConfig.setAppList(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.AppList"));
		macServiceConfig.setEnabled(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.Enabled"));
		macServiceConfig.setProcessResult(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.ProcessResult"));
		macServiceConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.ConfigId"));
		macServiceConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.Status"));
		domainConfigs.setMacServiceConfig(macServiceConfig);

		GreenManagerConfig greenManagerConfig = new GreenManagerConfig();
		greenManagerConfig.setEnabled(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig.Enabled"));
		greenManagerConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig.ConfigId"));
		greenManagerConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig.Status"));
		domainConfigs.setGreenManagerConfig(greenManagerConfig);

		HttpsOptionConfig httpsOptionConfig = new HttpsOptionConfig();
		httpsOptionConfig.setHttp2(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig.Http2"));
		httpsOptionConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig.ConfigId"));
		httpsOptionConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig.Status"));
		domainConfigs.setHttpsOptionConfig(httpsOptionConfig);

		AliBusinessConfig aliBusinessConfig = new AliBusinessConfig();
		aliBusinessConfig.setAliBusinessTable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.AliBusinessTable"));
		aliBusinessConfig.setAliBusinessType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.AliBusinessType"));
		aliBusinessConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.ConfigId"));
		aliBusinessConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.Status"));
		domainConfigs.setAliBusinessConfig(aliBusinessConfig);

		IpAllowListConfig ipAllowListConfig = new IpAllowListConfig();
		ipAllowListConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.ConfigId"));
		ipAllowListConfig.setIpList(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.IpList"));
		ipAllowListConfig.setIpAclXfwd(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.IpAclXfwd"));
		ipAllowListConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.Status"));
		domainConfigs.setIpAllowListConfig(ipAllowListConfig);

		List<CacheExpiredConfig> cacheExpiredConfigs = new ArrayList<CacheExpiredConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs.Length"); i++) {
			CacheExpiredConfig cacheExpiredConfig = new CacheExpiredConfig();
			cacheExpiredConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].ConfigId"));
			cacheExpiredConfig.setCacheType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].CacheType"));
			cacheExpiredConfig.setCacheContent(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].CacheContent"));
			cacheExpiredConfig.setTTL(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].TTL"));
			cacheExpiredConfig.setWeight(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].Weight"));
			cacheExpiredConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].Status"));

			cacheExpiredConfigs.add(cacheExpiredConfig);
		}
		domainConfigs.setCacheExpiredConfigs(cacheExpiredConfigs);

		List<HttpErrorPageConfig> httpErrorPageConfigs = new ArrayList<HttpErrorPageConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs.Length"); i++) {
			HttpErrorPageConfig httpErrorPageConfig = new HttpErrorPageConfig();
			httpErrorPageConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].ConfigId"));
			httpErrorPageConfig.setErrorCode(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].ErrorCode"));
			httpErrorPageConfig.setPageUrl(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].PageUrl"));
			httpErrorPageConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].Status"));

			httpErrorPageConfigs.add(httpErrorPageConfig);
		}
		domainConfigs.setHttpErrorPageConfigs(httpErrorPageConfigs);

		List<HttpHeaderConfig> httpHeaderConfigs = new ArrayList<HttpHeaderConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs.Length"); i++) {
			HttpHeaderConfig httpHeaderConfig = new HttpHeaderConfig();
			httpHeaderConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].ConfigId"));
			httpHeaderConfig.setHeaderKey(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].HeaderKey"));
			httpHeaderConfig.setHeaderValue(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].HeaderValue"));
			httpHeaderConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].Status"));

			httpHeaderConfigs.add(httpHeaderConfig);
		}
		domainConfigs.setHttpHeaderConfigs(httpHeaderConfigs);

		List<DynamicConfig> dynamicConfigs = new ArrayList<DynamicConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs.Length"); i++) {
			DynamicConfig dynamicConfig = new DynamicConfig();
			dynamicConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].ConfigId"));
			dynamicConfig.setDynamicOrigin(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].DynamicOrigin"));
			dynamicConfig.setStaticType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].StaticType"));
			dynamicConfig.setStaticUri(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].StaticUri"));
			dynamicConfig.setStaticPath(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].StaticPath"));
			dynamicConfig.setDynamicCacheControl(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].DynamicCacheControl"));
			dynamicConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].Status"));

			dynamicConfigs.add(dynamicConfig);
		}
		domainConfigs.setDynamicConfigs(dynamicConfigs);

		List<ReqHeaderConfig> reqHeaderConfigs = new ArrayList<ReqHeaderConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs.Length"); i++) {
			ReqHeaderConfig reqHeaderConfig = new ReqHeaderConfig();
			reqHeaderConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].ConfigId"));
			reqHeaderConfig.setKey(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].Key"));
			reqHeaderConfig.setValue(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].Value"));
			reqHeaderConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].Status"));

			reqHeaderConfigs.add(reqHeaderConfig);
		}
		domainConfigs.setReqHeaderConfigs(reqHeaderConfigs);

		List<SetVarsConfig> setVarsConfigs = new ArrayList<SetVarsConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs.Length"); i++) {
			SetVarsConfig setVarsConfig = new SetVarsConfig();
			setVarsConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].ConfigId"));
			setVarsConfig.setVarName(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].VarName"));
			setVarsConfig.setVarValue(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].VarValue"));
			setVarsConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].Status"));

			setVarsConfigs.add(setVarsConfig);
		}
		domainConfigs.setSetVarsConfigs(setVarsConfigs);
		describeDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDomainConfigsResponse;
	}
}