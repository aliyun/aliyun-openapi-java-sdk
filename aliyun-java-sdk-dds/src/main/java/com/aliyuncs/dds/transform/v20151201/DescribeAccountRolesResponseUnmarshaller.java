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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAccountRolesResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAccountRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountRolesResponseUnmarshaller {

	public static DescribeAccountRolesResponse unmarshall(DescribeAccountRolesResponse describeAccountRolesResponse, UnmarshallerContext _ctx) {
		
		describeAccountRolesResponse.setRequestId(_ctx.stringValue("DescribeAccountRolesResponse.RequestId"));

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountRolesResponse.Roles.Length"); i++) {
			Role role = new Role();
			role.setRole(_ctx.stringValue("DescribeAccountRolesResponse.Roles["+ i +"].Role"));
			role.setDBName(_ctx.stringValue("DescribeAccountRolesResponse.Roles["+ i +"].DBName"));

			roles.add(role);
		}
		describeAccountRolesResponse.setRoles(roles);
	 
	 	return describeAccountRolesResponse;
	}
}