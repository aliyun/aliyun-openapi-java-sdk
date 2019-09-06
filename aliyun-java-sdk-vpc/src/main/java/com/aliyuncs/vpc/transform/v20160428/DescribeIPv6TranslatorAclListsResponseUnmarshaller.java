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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeIPv6TranslatorAclListsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIPv6TranslatorAclListsResponse.IPv6TranslatorAcl;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIPv6TranslatorAclListsResponseUnmarshaller {

	public static DescribeIPv6TranslatorAclListsResponse unmarshall(DescribeIPv6TranslatorAclListsResponse describeIPv6TranslatorAclListsResponse, UnmarshallerContext _ctx) {
		
		describeIPv6TranslatorAclListsResponse.setRequestId(_ctx.stringValue("DescribeIPv6TranslatorAclListsResponse.RequestId"));
		describeIPv6TranslatorAclListsResponse.setTotalCount(_ctx.integerValue("DescribeIPv6TranslatorAclListsResponse.TotalCount"));
		describeIPv6TranslatorAclListsResponse.setPageNumber(_ctx.integerValue("DescribeIPv6TranslatorAclListsResponse.PageNumber"));
		describeIPv6TranslatorAclListsResponse.setPageSize(_ctx.integerValue("DescribeIPv6TranslatorAclListsResponse.PageSize"));

		List<IPv6TranslatorAcl> ipv6TranslatorAcls = new ArrayList<IPv6TranslatorAcl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIPv6TranslatorAclListsResponse.Ipv6TranslatorAcls.Length"); i++) {
			IPv6TranslatorAcl iPv6TranslatorAcl = new IPv6TranslatorAcl();
			iPv6TranslatorAcl.setAclId(_ctx.stringValue("DescribeIPv6TranslatorAclListsResponse.Ipv6TranslatorAcls["+ i +"].AclId"));
			iPv6TranslatorAcl.setAclName(_ctx.stringValue("DescribeIPv6TranslatorAclListsResponse.Ipv6TranslatorAcls["+ i +"].AclName"));

			ipv6TranslatorAcls.add(iPv6TranslatorAcl);
		}
		describeIPv6TranslatorAclListsResponse.setIpv6TranslatorAcls(ipv6TranslatorAcls);
	 
	 	return describeIPv6TranslatorAclListsResponse;
	}
}