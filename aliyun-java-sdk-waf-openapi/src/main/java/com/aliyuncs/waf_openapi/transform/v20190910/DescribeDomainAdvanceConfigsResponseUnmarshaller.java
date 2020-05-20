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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainAdvanceConfigsResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainAdvanceConfigsResponse.DomainConfig;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeDomainAdvanceConfigsResponse.DomainConfig.Profile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainAdvanceConfigsResponseUnmarshaller {

	public static DescribeDomainAdvanceConfigsResponse unmarshall(DescribeDomainAdvanceConfigsResponse describeDomainAdvanceConfigsResponse, UnmarshallerContext _ctx) {
		
		describeDomainAdvanceConfigsResponse.setRequestId(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setDomain(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Domain"));

			Profile profile = new Profile();
			profile.setCname(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Cname"));
			profile.setResolvedType(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.ResolvedType"));
			profile.setVipServiceStatus(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.VipServiceStatus"));
			profile.setCertStatus(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.CertStatus"));
			profile.setExclusiveVipStatus(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.ExclusiveVipStatus"));
			profile.setIpv6Status(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Ipv6Status"));
			profile.setHttpPort(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.HttpPort"));
			profile.setHttpsPort(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.HttpsPort"));
			profile.setHttp2Port(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Http2Port"));
			profile.setRs(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.Rs"));
			profile.setClusterType(_ctx.integerValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.ClusterType"));
			profile.setGSLBStatus(_ctx.stringValue("DescribeDomainAdvanceConfigsResponse.DomainConfigs["+ i +"].Profile.GSLBStatus"));
			domainConfig.setProfile(profile);

			domainConfigs.add(domainConfig);
		}
		describeDomainAdvanceConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDomainAdvanceConfigsResponse;
	}
}