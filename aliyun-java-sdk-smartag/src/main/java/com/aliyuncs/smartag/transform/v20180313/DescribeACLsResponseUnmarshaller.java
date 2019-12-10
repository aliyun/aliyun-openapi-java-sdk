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

	public static DescribeACLsResponse unmarshall(DescribeACLsResponse describeACLsResponse, UnmarshallerContext _ctx) {
		
		describeACLsResponse.setRequestId(_ctx.stringValue("DescribeACLsResponse.RequestId"));
		describeACLsResponse.setTotalCount(_ctx.integerValue("DescribeACLsResponse.TotalCount"));
		describeACLsResponse.setPageNumber(_ctx.integerValue("DescribeACLsResponse.PageNumber"));
		describeACLsResponse.setPageSize(_ctx.integerValue("DescribeACLsResponse.PageSize"));

		List<Acl> acls = new ArrayList<Acl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeACLsResponse.Acls.Length"); i++) {
			Acl acl = new Acl();
			acl.setAclId(_ctx.stringValue("DescribeACLsResponse.Acls["+ i +"].AclId"));
			acl.setName(_ctx.stringValue("DescribeACLsResponse.Acls["+ i +"].Name"));
			acl.setSagCount(_ctx.stringValue("DescribeACLsResponse.Acls["+ i +"].SagCount"));

			acls.add(acl);
		}
		describeACLsResponse.setAcls(acls);
	 
	 	return describeACLsResponse;
	}
}