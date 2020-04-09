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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainBasicConfigsResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainBasicConfigsResponse.DomainConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainBasicConfigsResponseUnmarshaller {

	public static DescribeDomainBasicConfigsResponse unmarshall(DescribeDomainBasicConfigsResponse describeDomainBasicConfigsResponse, UnmarshallerContext _ctx) {
		
		describeDomainBasicConfigsResponse.setRequestId(_ctx.stringValue("DescribeDomainBasicConfigsResponse.RequestId"));
		describeDomainBasicConfigsResponse.setTotalCount(_ctx.integerValue("DescribeDomainBasicConfigsResponse.TotalCount"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainBasicConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setOwner(_ctx.stringValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].Owner"));
			domainConfig.setWafStatus(_ctx.integerValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].WafStatus"));
			domainConfig.setCcStatus(_ctx.integerValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].CcStatus"));
			domainConfig.setCcMode(_ctx.integerValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].CcMode"));
			domainConfig.setAclStatus(_ctx.integerValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].AclStatus"));
			domainConfig.setWafMode(_ctx.integerValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].WafMode"));
			domainConfig.setVersion(_ctx.longValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].Version"));
			domainConfig.setDomain(_ctx.stringValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].Domain"));
			domainConfig.setStatus(_ctx.integerValue("DescribeDomainBasicConfigsResponse.DomainConfigs["+ i +"].Status"));

			domainConfigs.add(domainConfig);
		}
		describeDomainBasicConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDomainBasicConfigsResponse;
	}
}