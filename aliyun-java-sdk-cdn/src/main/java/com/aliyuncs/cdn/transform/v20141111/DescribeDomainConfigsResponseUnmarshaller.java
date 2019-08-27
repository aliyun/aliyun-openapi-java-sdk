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

	public static DescribeDomainConfigsResponse unmarshall(DescribeDomainConfigsResponse describeDomainConfigsResponse, UnmarshallerContext _ctx) {
		
		describeDomainConfigsResponse.setRequestId(_ctx.stringValue("DescribeDomainConfigsResponse.RequestId"));

		DomainConfigs domainConfigs = new DomainConfigs();

		CcConfig ccConfig = new CcConfig();
		ccConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.ConfigId"));
		ccConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.Enable"));
		ccConfig.setAllowIps(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.AllowIps"));
		ccConfig.setBlockIps(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.BlockIps"));
		ccConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.Status"));
		domainConfigs.setCcConfig(ccConfig);

		ErrorPageConfig errorPageConfig = new ErrorPageConfig();
		errorPageConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.ConfigId"));
		errorPageConfig.setErrorCode(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.ErrorCode"));
		errorPageConfig.setPageType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.PageType"));
		errorPageConfig.setCustomPageUrl(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.CustomPageUrl"));
		errorPageConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.Status"));
		domainConfigs.setErrorPageConfig(errorPageConfig);

		OptimizeConfig optimizeConfig = new OptimizeConfig();
		optimizeConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.ConfigId"));
		optimizeConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.Enable"));
		optimizeConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.Status"));
		domainConfigs.setOptimizeConfig(optimizeConfig);

		PageCompressConfig pageCompressConfig = new PageCompressConfig();
		pageCompressConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.ConfigId"));
		pageCompressConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.Enable"));
		pageCompressConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.Status"));
		domainConfigs.setPageCompressConfig(pageCompressConfig);

		IgnoreQueryStringConfig ignoreQueryStringConfig = new IgnoreQueryStringConfig();
		ignoreQueryStringConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.ConfigId"));
		ignoreQueryStringConfig.setHashKeyArgs(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.HashKeyArgs"));
		ignoreQueryStringConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.Enable"));
		ignoreQueryStringConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.Status"));
		domainConfigs.setIgnoreQueryStringConfig(ignoreQueryStringConfig);

		RangeConfig rangeConfig = new RangeConfig();
		rangeConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.ConfigId"));
		rangeConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.Enable"));
		rangeConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.Status"));
		domainConfigs.setRangeConfig(rangeConfig);

		RefererConfig refererConfig = new RefererConfig();
		refererConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ConfigId"));
		refererConfig.setReferType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ReferType"));
		refererConfig.setReferList(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ReferList"));
		refererConfig.setAllowEmpty(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.AllowEmpty"));
		refererConfig.setDisableAst(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.DisableAst"));
		refererConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.Status"));
		domainConfigs.setRefererConfig(refererConfig);

		ReqAuthConfig reqAuthConfig = new ReqAuthConfig();
		reqAuthConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.ConfigId"));
		reqAuthConfig.setAuthType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthType"));
		reqAuthConfig.setKey1(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Key1"));
		reqAuthConfig.setKey2(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Key2"));
		reqAuthConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Status"));
		reqAuthConfig.setAliAuthWhiteList(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AliAuthWhiteList"));
		reqAuthConfig.setAuthM3u8(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthM3u8"));
		reqAuthConfig.setAuthAddr(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthAddr"));
		reqAuthConfig.setAuthRemoteDesc(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthRemoteDesc"));
		reqAuthConfig.setTimeOut(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.TimeOut"));
		domainConfigs.setReqAuthConfig(reqAuthConfig);

		SrcHostConfig srcHostConfig = new SrcHostConfig();
		srcHostConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.ConfigId"));
		srcHostConfig.setDomainName(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.DomainName"));
		srcHostConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.Status"));
		domainConfigs.setSrcHostConfig(srcHostConfig);

		VideoSeekConfig videoSeekConfig = new VideoSeekConfig();
		videoSeekConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.ConfigId"));
		videoSeekConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.Enable"));
		videoSeekConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.Status"));
		domainConfigs.setVideoSeekConfig(videoSeekConfig);

		WafConfig wafConfig = new WafConfig();
		wafConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.ConfigId"));
		wafConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.Enable"));
		wafConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.Status"));
		domainConfigs.setWafConfig(wafConfig);

		NotifyUrlConfig notifyUrlConfig = new NotifyUrlConfig();
		notifyUrlConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.NotifyUrlConfig.Enable"));
		notifyUrlConfig.setNotifyUrl(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.NotifyUrlConfig.NotifyUrl"));
		domainConfigs.setNotifyUrlConfig(notifyUrlConfig);

		RedirectTypeConfig redirectTypeConfig = new RedirectTypeConfig();
		redirectTypeConfig.setRedirectType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RedirectTypeConfig.RedirectType"));
		domainConfigs.setRedirectTypeConfig(redirectTypeConfig);

		ForwardSchemeConfig forwardSchemeConfig = new ForwardSchemeConfig();
		forwardSchemeConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.ConfigId"));
		forwardSchemeConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.Enable"));
		forwardSchemeConfig.setSchemeOrigin(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.SchemeOrigin"));
		forwardSchemeConfig.setSchemeOriginPort(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.SchemeOriginPort"));
		forwardSchemeConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ForwardSchemeConfig.Status"));
		domainConfigs.setForwardSchemeConfig(forwardSchemeConfig);

		RemoveQueryStringConfig removeQueryStringConfig = new RemoveQueryStringConfig();
		removeQueryStringConfig.setAliRemoveArgs(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig.AliRemoveArgs"));
		removeQueryStringConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig.ConfigId"));
		removeQueryStringConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RemoveQueryStringConfig.Status"));
		domainConfigs.setRemoveQueryStringConfig(removeQueryStringConfig);

		L2OssKeyConfig l2OssKeyConfig = new L2OssKeyConfig();
		l2OssKeyConfig.setPrivateOssAuth(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig.PrivateOssAuth"));
		l2OssKeyConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig.ConfigId"));
		l2OssKeyConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.L2OssKeyConfig.Status"));
		domainConfigs.setL2OssKeyConfig(l2OssKeyConfig);

		MacServiceConfig macServiceConfig = new MacServiceConfig();
		macServiceConfig.setAppList(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.AppList"));
		macServiceConfig.setEnabled(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.Enabled"));
		macServiceConfig.setProcessResult(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.ProcessResult"));
		macServiceConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.ConfigId"));
		macServiceConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.MacServiceConfig.Status"));
		domainConfigs.setMacServiceConfig(macServiceConfig);

		GreenManagerConfig greenManagerConfig = new GreenManagerConfig();
		greenManagerConfig.setEnabled(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig.Enabled"));
		greenManagerConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig.ConfigId"));
		greenManagerConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.GreenManagerConfig.Status"));
		domainConfigs.setGreenManagerConfig(greenManagerConfig);

		HttpsOptionConfig httpsOptionConfig = new HttpsOptionConfig();
		httpsOptionConfig.setHttp2(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig.Http2"));
		httpsOptionConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig.ConfigId"));
		httpsOptionConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpsOptionConfig.Status"));
		domainConfigs.setHttpsOptionConfig(httpsOptionConfig);

		AliBusinessConfig aliBusinessConfig = new AliBusinessConfig();
		aliBusinessConfig.setAliBusinessTable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.AliBusinessTable"));
		aliBusinessConfig.setAliBusinessType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.AliBusinessType"));
		aliBusinessConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.ConfigId"));
		aliBusinessConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.AliBusinessConfig.Status"));
		domainConfigs.setAliBusinessConfig(aliBusinessConfig);

		IpAllowListConfig ipAllowListConfig = new IpAllowListConfig();
		ipAllowListConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.ConfigId"));
		ipAllowListConfig.setIpList(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.IpList"));
		ipAllowListConfig.setIpAclXfwd(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.IpAclXfwd"));
		ipAllowListConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IpAllowListConfig.Status"));
		domainConfigs.setIpAllowListConfig(ipAllowListConfig);

		List<CacheExpiredConfig> cacheExpiredConfigs = new ArrayList<CacheExpiredConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs.Length"); i++) {
			CacheExpiredConfig cacheExpiredConfig = new CacheExpiredConfig();
			cacheExpiredConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].ConfigId"));
			cacheExpiredConfig.setCacheType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].CacheType"));
			cacheExpiredConfig.setCacheContent(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].CacheContent"));
			cacheExpiredConfig.setTTL(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].TTL"));
			cacheExpiredConfig.setWeight(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].Weight"));
			cacheExpiredConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].Status"));

			cacheExpiredConfigs.add(cacheExpiredConfig);
		}
		domainConfigs.setCacheExpiredConfigs(cacheExpiredConfigs);

		List<HttpErrorPageConfig> httpErrorPageConfigs = new ArrayList<HttpErrorPageConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs.Length"); i++) {
			HttpErrorPageConfig httpErrorPageConfig = new HttpErrorPageConfig();
			httpErrorPageConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].ConfigId"));
			httpErrorPageConfig.setErrorCode(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].ErrorCode"));
			httpErrorPageConfig.setPageUrl(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].PageUrl"));
			httpErrorPageConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpErrorPageConfigs["+ i +"].Status"));

			httpErrorPageConfigs.add(httpErrorPageConfig);
		}
		domainConfigs.setHttpErrorPageConfigs(httpErrorPageConfigs);

		List<HttpHeaderConfig> httpHeaderConfigs = new ArrayList<HttpHeaderConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs.Length"); i++) {
			HttpHeaderConfig httpHeaderConfig = new HttpHeaderConfig();
			httpHeaderConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].ConfigId"));
			httpHeaderConfig.setHeaderKey(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].HeaderKey"));
			httpHeaderConfig.setHeaderValue(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].HeaderValue"));
			httpHeaderConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfigs["+ i +"].Status"));

			httpHeaderConfigs.add(httpHeaderConfig);
		}
		domainConfigs.setHttpHeaderConfigs(httpHeaderConfigs);

		List<DynamicConfig> dynamicConfigs = new ArrayList<DynamicConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs.Length"); i++) {
			DynamicConfig dynamicConfig = new DynamicConfig();
			dynamicConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].ConfigId"));
			dynamicConfig.setEnable(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].Enable"));
			dynamicConfig.setDynamicOrigin(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].DynamicOrigin"));
			dynamicConfig.setStaticType(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].StaticType"));
			dynamicConfig.setStaticUri(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].StaticUri"));
			dynamicConfig.setStaticPath(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].StaticPath"));
			dynamicConfig.setDynamicCacheControl(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].DynamicCacheControl"));
			dynamicConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.DynamicConfigs["+ i +"].Status"));

			dynamicConfigs.add(dynamicConfig);
		}
		domainConfigs.setDynamicConfigs(dynamicConfigs);

		List<ReqHeaderConfig> reqHeaderConfigs = new ArrayList<ReqHeaderConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs.Length"); i++) {
			ReqHeaderConfig reqHeaderConfig = new ReqHeaderConfig();
			reqHeaderConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].ConfigId"));
			reqHeaderConfig.setKey(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].Key"));
			reqHeaderConfig.setValue(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].Value"));
			reqHeaderConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqHeaderConfigs["+ i +"].Status"));

			reqHeaderConfigs.add(reqHeaderConfig);
		}
		domainConfigs.setReqHeaderConfigs(reqHeaderConfigs);

		List<SetVarsConfig> setVarsConfigs = new ArrayList<SetVarsConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs.Length"); i++) {
			SetVarsConfig setVarsConfig = new SetVarsConfig();
			setVarsConfig.setConfigId(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].ConfigId"));
			setVarsConfig.setVarName(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].VarName"));
			setVarsConfig.setVarValue(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].VarValue"));
			setVarsConfig.setStatus(_ctx.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SetVarsConfigs["+ i +"].Status"));

			setVarsConfigs.add(setVarsConfig);
		}
		domainConfigs.setSetVarsConfigs(setVarsConfigs);
		describeDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDomainConfigsResponse;
	}
}