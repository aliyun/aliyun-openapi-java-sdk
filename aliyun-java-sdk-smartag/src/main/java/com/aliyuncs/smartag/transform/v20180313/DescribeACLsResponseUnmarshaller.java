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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeACLsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeACLsResponse.Acl;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeACLsResponseUnmarshaller {

	public static DescribeACLsResponse unmarshall(DescribeACLsResponse describeACLsResponse, UnmarshallerContext context) {
		
		describeACLsResponse.setRequestId(context.stringValue("DescribeACLsResponse.RequestId"));
		describeACLsResponse.setTotalCount(context.integerValue("DescribeACLsResponse.TotalCount"));
		describeACLsResponse.setPageNumber(context.integerValue("DescribeACLsResponse.PageNumber"));
		describeACLsResponse.setPageSize(context.integerValue("DescribeACLsResponse.PageSize"));

		List<Acl> acls = new ArrayList<Acl>();
		for (int i = 0; i < context.lengthValue("DescribeACLsResponse.Acls.Length"); i++) {
			Acl acl = new Acl();
			acl.setAclId(context.stringValue("DescribeACLsResponse.Acls["+ i +"].AclId"));
			acl.setName(context.stringValue("DescribeACLsResponse.Acls["+ i +"].Name"));
			acl.setSagCount(context.stringValue("DescribeACLsResponse.Acls["+ i +"].SagCount"));

			acls.add(acl);
		}
		describeACLsResponse.setAcls(acls);
	 
	 	return describeACLsResponse;
	}
}