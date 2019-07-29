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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainDetailResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainDetailResponse.DomainConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainDetailResponseUnmarshaller {

	public static DescribeVsDomainDetailResponse unmarshall(DescribeVsDomainDetailResponse describeVsDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeVsDomainDetailResponse.RequestId"));

		DomainConfig domainConfig = new DomainConfig();
		domainConfig.setGmtCreated(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.GmtCreated"));
		domainConfig.setGmtModified(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.GmtModified"));
		domainConfig.setDomainStatus(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.DomainStatus"));
		domainConfig.setCname(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.Cname"));
		domainConfig.setDomainName(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.DomainName"));
		domainConfig.setDomainType(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.DomainType"));
		domainConfig.setRegion(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.Region"));
		domainConfig.setDescription(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.Description"));
		domainConfig.setSSLProtocol(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.SSLProtocol"));
		domainConfig.setScope(_ctx.stringValue("DescribeVsDomainDetailResponse.DomainConfig.Scope"));
		describeVsDomainDetailResponse.setDomainConfig(domainConfig);
	 
	 	return describeVsDomainDetailResponse;
	}
}