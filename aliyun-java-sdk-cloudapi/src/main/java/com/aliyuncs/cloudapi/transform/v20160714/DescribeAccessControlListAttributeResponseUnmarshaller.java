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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeAccessControlListAttributeResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAccessControlListAttributeResponse.AclEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessControlListAttributeResponseUnmarshaller {

	public static DescribeAccessControlListAttributeResponse unmarshall(DescribeAccessControlListAttributeResponse describeAccessControlListAttributeResponse, UnmarshallerContext _ctx) {
		
		describeAccessControlListAttributeResponse.setRequestId(_ctx.stringValue("DescribeAccessControlListAttributeResponse.RequestId"));
		describeAccessControlListAttributeResponse.setAclId(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclId"));
		describeAccessControlListAttributeResponse.setAclName(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclName"));

		List<AclEntry> aclEntrys = new ArrayList<AclEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessControlListAttributeResponse.AclEntrys.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setAclEntryIp(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryIp"));
			aclEntry.setAclEntryComment(_ctx.stringValue("DescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryComment"));

			aclEntrys.add(aclEntry);
		}
		describeAccessControlListAttributeResponse.setAclEntrys(aclEntrys);
	 
	 	return describeAccessControlListAttributeResponse;
	}
}