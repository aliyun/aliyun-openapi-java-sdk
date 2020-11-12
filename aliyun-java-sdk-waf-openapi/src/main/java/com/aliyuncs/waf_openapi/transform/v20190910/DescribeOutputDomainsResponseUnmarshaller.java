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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeOutputDomainsResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeOutputDomainsResponse.DomainListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOutputDomainsResponseUnmarshaller {

	public static DescribeOutputDomainsResponse unmarshall(DescribeOutputDomainsResponse describeOutputDomainsResponse, UnmarshallerContext _ctx) {
		
		describeOutputDomainsResponse.setRequestId(_ctx.stringValue("DescribeOutputDomainsResponse.RequestId"));
		describeOutputDomainsResponse.setWafTaskId(_ctx.stringValue("DescribeOutputDomainsResponse.WafTaskId"));
		describeOutputDomainsResponse.setTaskStatus(_ctx.integerValue("DescribeOutputDomainsResponse.TaskStatus"));
		describeOutputDomainsResponse.setTotal(_ctx.integerValue("DescribeOutputDomainsResponse.Total"));

		List<DomainListItem> domainList = new ArrayList<DomainListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOutputDomainsResponse.DomainList.Length"); i++) {
			DomainListItem domainListItem = new DomainListItem();
			domainListItem.setStatus(_ctx.integerValue("DescribeOutputDomainsResponse.DomainList["+ i +"].Status"));
			domainListItem.setDomain(_ctx.stringValue("DescribeOutputDomainsResponse.DomainList["+ i +"].Domain"));
			domainListItem.setWafStatus(_ctx.integerValue("DescribeOutputDomainsResponse.DomainList["+ i +"].WafStatus"));
			domainListItem.setCcStatus(_ctx.integerValue("DescribeOutputDomainsResponse.DomainList["+ i +"].CcStatus"));
			domainListItem.setAclStatus(_ctx.integerValue("DescribeOutputDomainsResponse.DomainList["+ i +"].AclStatus"));

			domainList.add(domainListItem);
		}
		describeOutputDomainsResponse.setDomainList(domainList);
	 
	 	return describeOutputDomainsResponse;
	}
}