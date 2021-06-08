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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListAclsResponse;
import com.aliyuncs.alb.model.v20200616.ListAclsResponse.Acl;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAclsResponseUnmarshaller {

	public static ListAclsResponse unmarshall(ListAclsResponse listAclsResponse, UnmarshallerContext _ctx) {
		
		listAclsResponse.setRequestId(_ctx.stringValue("ListAclsResponse.RequestId"));
		listAclsResponse.setMaxResults(_ctx.integerValue("ListAclsResponse.MaxResults"));
		listAclsResponse.setNextToken(_ctx.stringValue("ListAclsResponse.NextToken"));
		listAclsResponse.setTotalCount(_ctx.integerValue("ListAclsResponse.TotalCount"));

		List<Acl> acls = new ArrayList<Acl>();
		for (int i = 0; i < _ctx.lengthValue("ListAclsResponse.Acls.Length"); i++) {
			Acl acl = new Acl();
			acl.setAclId(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AclId"));
			acl.setAclName(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AclName"));
			acl.setAclStatus(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AclStatus"));
			acl.setAddressIPVersion(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AddressIPVersion"));
			acl.setResourceGroupId(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].ResourceGroupId"));

			acls.add(acl);
		}
		listAclsResponse.setAcls(acls);
	 
	 	return listAclsResponse;
	}
}