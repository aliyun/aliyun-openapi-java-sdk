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

	public static DescribeIPv6TranslatorAclListAttributesResponse unmarshall(DescribeIPv6TranslatorAclListAttributesResponse describeIPv6TranslatorAclListAttributesResponse, UnmarshallerContext context) {
		
		describeIPv6TranslatorAclListAttributesResponse.setRequestId(context.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.RequestId"));
		describeIPv6TranslatorAclListAttributesResponse.setAclId(context.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclId"));
		describeIPv6TranslatorAclListAttributesResponse.setAclName(context.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclName"));
		describeIPv6TranslatorAclListAttributesResponse.setTotalCount(context.integerValue("DescribeIPv6TranslatorAclListAttributesResponse.TotalCount"));
		describeIPv6TranslatorAclListAttributesResponse.setPageNumber(context.integerValue("DescribeIPv6TranslatorAclListAttributesResponse.PageNumber"));
		describeIPv6TranslatorAclListAttributesResponse.setPageSize(context.integerValue("DescribeIPv6TranslatorAclListAttributesResponse.PageSize"));

		List<AclEntry> aclEntries = new ArrayList<AclEntry>();
		for (int i = 0; i < context.lengthValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setAclEntryId(context.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries["+ i +"].AclEntryId"));
			aclEntry.setAclEntryIp(context.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries["+ i +"].AclEntryIp"));
			aclEntry.setAclEntryComment(context.stringValue("DescribeIPv6TranslatorAclListAttributesResponse.AclEntries["+ i +"].AclEntryComment"));

			aclEntries.add(aclEntry);
		}
		describeIPv6TranslatorAclListAttributesResponse.setAclEntries(aclEntries);
	 
	 	return describeIPv6TranslatorAclListAttributesResponse;
	}
}