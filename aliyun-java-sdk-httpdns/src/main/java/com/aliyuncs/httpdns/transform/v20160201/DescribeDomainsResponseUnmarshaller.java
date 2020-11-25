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

package com.aliyuncs.httpdns.transform.v20160201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.httpdns.model.v20160201.DescribeDomainsResponse;
import com.aliyuncs.httpdns.model.v20160201.DescribeDomainsResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsResponseUnmarshaller {

	public static DescribeDomainsResponse unmarshall(DescribeDomainsResponse describeDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDomainsResponse.setRequestId(_ctx.stringValue("DescribeDomainsResponse.RequestId"));
		describeDomainsResponse.setTotalCount(_ctx.longValue("DescribeDomainsResponse.TotalCount"));
		describeDomainsResponse.setPageNumber(_ctx.longValue("DescribeDomainsResponse.PageNumber"));
		describeDomainsResponse.setPageSize(_ctx.longValue("DescribeDomainsResponse.PageSize"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].DomainName"));

			domains.add(domain);
		}
		describeDomainsResponse.setDomains(domains);
	 
	 	return describeDomainsResponse;
	}
}