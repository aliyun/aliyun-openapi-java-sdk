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

import com.aliyuncs.vpc.model.v20160428.DescribeIPv6TranslatorAclListAttributesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIPv6TranslatorAclListAttributesResponse.AclEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIPv6TranslatorAclListAttributesResponseUnmarshaller {

	public static DescribeIPv6TranslatorAclListAttributesResponse unmarshall(DescribeIPv6TranslatorAclListAttributesResponse describeIPv6TranslatorAclListAttributesResponse, UnmarshallerContext _ctx) {
		
		describeIPv6TranslatorAclListAttributesResponse.setRequestId(_ctx.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.RequestId"));
		describeIPv6TranslatorAclListAttributesResponse.setAclId(_ctx.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclId"));
		describeIPv6TranslatorAclListAttributesResponse.setAclName(_ctx.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclName"));
		describeIPv6TranslatorAclListAttributesResponse.setTotalCount(_ctx.integerValue("DescribeIPv6TranslatorAclListAttributesResponse.TotalCount"));
		describeIPv6TranslatorAclListAttributesResponse.setPageNumber(_ctx.integerValue("DescribeIPv6TranslatorAclListAttributesResponse.PageNumber"));
		describeIPv6TranslatorAclListAttributesResponse.setPageSize(_ctx.integerValue("DescribeIPv6TranslatorAclListAttributesResponse.PageSize"));

		List<AclEntry> aclEntries = new ArrayList<AclEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setAclEntryId(_ctx.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries["+ i +"].AclEntryId"));
			aclEntry.setAclEntryIp(_ctx.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries["+ i +"].AclEntryIp"));
			aclEntry.setAclEntryComment(_ctx.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries["+ i +"].AclEntryComment"));

			aclEntries.add(aclEntry);
		}
		describeIPv6TranslatorAclListAttributesResponse.setAclEntries(aclEntries);
	 
	 	return describeIPv6TranslatorAclListAttributesResponse;
	}
}