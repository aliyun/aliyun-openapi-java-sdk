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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.CcConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.HttpHeaderConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.RangeConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.RefererConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainConfigsResponse.DomainConfigs.WafConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainConfigsResponseUnmarshaller {

	public static DescribeDomainConfigsResponse unmarshall(DescribeDomainConfigsResponse describeDomainConfigsResponse, UnmarshallerContext context) {
		
		describeDomainConfigsResponse.setRequestId(context.stringValue("DescribeDomainConfigsResponse.RequestId"));

		DomainConfigs domainConfigs = new DomainConfigs();

		CcConfig ccConfig = new CcConfig();
		ccConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.Enable"));
		ccConfig.setAllowIps(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.AllowIps"));
		ccConfig.setBlockIps(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CcConfig.BlockIps"));
		domainConfigs.setCcConfig(ccConfig);

		ErrorPageConfig errorPageConfig = new ErrorPageConfig();
		errorPageConfig.setErrorCode(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.ErrorCode"));
		errorPageConfig.setPageType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.PageType"));
		errorPageConfig.setCustomPageUrl(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ErrorPageConfig.CustomPageUrl"));
		domainConfigs.setErrorPageConfig(errorPageConfig);

		OptimizeConfig optimizeConfig = new OptimizeConfig();
		optimizeConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.OptimizeConfig.Enable"));
		domainConfigs.setOptimizeConfig(optimizeConfig);

		PageCompressConfig pageCompressConfig = new PageCompressConfig();
		pageCompressConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.PageCompressConfig.Enable"));
		domainConfigs.setPageCompressConfig(pageCompressConfig);

		IgnoreQueryStringConfig ignoreQueryStringConfig = new IgnoreQueryStringConfig();
		ignoreQueryStringConfig.setHashKeyArgs(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.HashKeyArgs"));
		ignoreQueryStringConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.IgnoreQueryStringConfig.Enable"));
		domainConfigs.setIgnoreQueryStringConfig(ignoreQueryStringConfig);

		RangeConfig rangeConfig = new RangeConfig();
		rangeConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RangeConfig.Enable"));
		domainConfigs.setRangeConfig(rangeConfig);

		RefererConfig refererConfig = new RefererConfig();
		refererConfig.setReferType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ReferType"));
		refererConfig.setReferList(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.ReferList"));
		refererConfig.setAllowEmpty(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.RefererConfig.AllowEmpty"));
		domainConfigs.setRefererConfig(refererConfig);

		ReqAuthConfig reqAuthConfig = new ReqAuthConfig();
		reqAuthConfig.setAuthType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.AuthType"));
		reqAuthConfig.setKey1(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Key1"));
		reqAuthConfig.setKey2(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.ReqAuthConfig.Key2"));
		domainConfigs.setReqAuthConfig(reqAuthConfig);

		SrcHostConfig srcHostConfig = new SrcHostConfig();
		srcHostConfig.setDomainName(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.SrcHostConfig.DomainName"));
		domainConfigs.setSrcHostConfig(srcHostConfig);

		VideoSeekConfig videoSeekConfig = new VideoSeekConfig();
		videoSeekConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.VideoSeekConfig.Enable"));
		domainConfigs.setVideoSeekConfig(videoSeekConfig);

		WafConfig wafConfig = new WafConfig();
		wafConfig.setEnable(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.WafConfig.Enable"));
		domainConfigs.setWafConfig(wafConfig);

		List<CacheExpiredConfig> cacheExpiredConfigs = new ArrayList<CacheExpiredConfig>();
		for (int i = 0; i < context.lengthValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs.Length"); i++) {
			CacheExpiredConfig cacheExpiredConfig = new CacheExpiredConfig();
			cacheExpiredConfig.setConfigId(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].ConfigId"));
			cacheExpiredConfig.setCacheType(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].CacheType"));
			cacheExpiredConfig.setCacheContent(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].CacheContent"));
			cacheExpiredConfig.setTTL(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].TTL"));
			cacheExpiredConfig.setStatus(context.stringValue("DescribeDomainConfigsResponse.DomainConfigs.CacheExpiredConfigs["+ i +"].Status"));

			cacheExpiredConfigs.add(cacheExpiredConfig);
		}
		domainConfigs.setCacheExpiredConfigs(cacheExpiredConfigs);

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
		describeDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDomainConfigsResponse;
	}
}