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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListRolesResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext context) {
		
		listRolesResponse.setRequestId(context.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setSuccess(context.booleanValue("ListRolesResponse.Success"));
		listRolesResponse.setCode(context.stringValue("ListRolesResponse.Code"));
		listRolesResponse.setMessage(context.stringValue("ListRolesResponse.Message"));

		List<Role> data = new ArrayList<Role>();
		for (int i = 0; i < context.lengthValue("ListRolesResponse.Data.Length"); i++) {
			Role role = new Role();
			role.setId(context.longValue("ListRolesResponse.Data["+ i +"].Id"));
			role.setName(context.stringValue("ListRolesResponse.Data["+ i +"].Name"));
			role.setDisplayName(context.stringValue("ListRolesResponse.Data["+ i +"].DisplayName"));
			role.setLevel(context.integerValue("ListRolesResponse.Data["+ i +"].Level"));
			role.setCreateTime(context.stringValue("ListRolesResponse.Data["+ i +"].CreateTime"));
			role.setUpdateTime(context.stringValue("ListRolesResponse.Data["+ i +"].UpdateTime"));

			data.add(role);
		}
		listRolesResponse.setData(data);
	 
	 	return listRolesResponse;
	}
}