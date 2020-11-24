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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCacheConfigsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCacheConfigsResponse.CacheConfig;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCacheConfigsResponse.CacheConfig.CustomRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebCacheConfigsResponseUnmarshaller {

	public static DescribeWebCacheConfigsResponse unmarshall(DescribeWebCacheConfigsResponse describeWebCacheConfigsResponse, UnmarshallerContext _ctx) {
		
		describeWebCacheConfigsResponse.setRequestId(_ctx.stringValue("DescribeWebCacheConfigsResponse.RequestId"));

		List<CacheConfig> domainCacheConfigs = new ArrayList<CacheConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs.Length"); i++) {
			CacheConfig cacheConfig = new CacheConfig();
			cacheConfig.setMode(_ctx.stringValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].Mode"));
			cacheConfig.setEnable(_ctx.integerValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].Enable"));
			cacheConfig.setDomain(_ctx.stringValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].Domain"));

			List<CustomRule> customRules = new ArrayList<CustomRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].CustomRules.Length"); j++) {
				CustomRule customRule = new CustomRule();
				customRule.setMode(_ctx.stringValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].CustomRules["+ j +"].Mode"));
				customRule.setName(_ctx.stringValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].CustomRules["+ j +"].Name"));
				customRule.setCacheTtl(_ctx.longValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].CustomRules["+ j +"].CacheTtl"));
				customRule.setUri(_ctx.stringValue("DescribeWebCacheConfigsResponse.DomainCacheConfigs["+ i +"].CustomRules["+ j +"].Uri"));

				customRules.add(customRule);
			}
			cacheConfig.setCustomRules(customRules);

			domainCacheConfigs.add(cacheConfig);
		}
		describeWebCacheConfigsResponse.setDomainCacheConfigs(domainCacheConfigs);
	 
	 	return describeWebCacheConfigsResponse;
	}
}