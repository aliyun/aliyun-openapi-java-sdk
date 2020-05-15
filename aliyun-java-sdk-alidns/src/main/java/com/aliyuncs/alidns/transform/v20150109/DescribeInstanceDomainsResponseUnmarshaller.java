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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeInstanceDomainsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeInstanceDomainsResponse.InstanceDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceDomainsResponseUnmarshaller {

	public static DescribeInstanceDomainsResponse unmarshall(DescribeInstanceDomainsResponse describeInstanceDomainsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceDomainsResponse.setRequestId(_ctx.stringValue("DescribeInstanceDomainsResponse.RequestId"));
		describeInstanceDomainsResponse.setTotalItems(_ctx.integerValue("DescribeInstanceDomainsResponse.TotalItems"));
		describeInstanceDomainsResponse.setPageNumber(_ctx.integerValue("DescribeInstanceDomainsResponse.PageNumber"));
		describeInstanceDomainsResponse.setPageSize(_ctx.integerValue("DescribeInstanceDomainsResponse.PageSize"));
		describeInstanceDomainsResponse.setTotalPages(_ctx.integerValue("DescribeInstanceDomainsResponse.TotalPages"));

		List<InstanceDomain> instanceDomains = new ArrayList<InstanceDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceDomainsResponse.InstanceDomains.Length"); i++) {
			InstanceDomain instanceDomain = new InstanceDomain();
			instanceDomain.setDomainName(_ctx.stringValue("DescribeInstanceDomainsResponse.InstanceDomains["+ i +"].DomainName"));
			instanceDomain.setCreateTime(_ctx.stringValue("DescribeInstanceDomainsResponse.InstanceDomains["+ i +"].CreateTime"));
			instanceDomain.setCreateTimestamp(_ctx.longValue("DescribeInstanceDomainsResponse.InstanceDomains["+ i +"].CreateTimestamp"));

			instanceDomains.add(instanceDomain);
		}
		describeInstanceDomainsResponse.setInstanceDomains(instanceDomains);
	 
	 	return describeInstanceDomainsResponse;
	}
}