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

package com.aliyuncs.quickbi_public.transform.v20201111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20201111.ListDataLevelPermissionWhiteListResponse;
import com.aliyuncs.quickbi_public.model.v20201111.ListDataLevelPermissionWhiteListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20201111.ListDataLevelPermissionWhiteListResponse.Result.UsersModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataLevelPermissionWhiteListResponseUnmarshaller {

	public static ListDataLevelPermissionWhiteListResponse unmarshall(ListDataLevelPermissionWhiteListResponse listDataLevelPermissionWhiteListResponse, UnmarshallerContext _ctx) {
		
		listDataLevelPermissionWhiteListResponse.setRequestId(_ctx.stringValue("ListDataLevelPermissionWhiteListResponse.RequestId"));
		listDataLevelPermissionWhiteListResponse.setSuccess(_ctx.booleanValue("ListDataLevelPermissionWhiteListResponse.Success"));

		Result result = new Result();
		result.setCubeId(_ctx.stringValue("ListDataLevelPermissionWhiteListResponse.Result.CubeId"));
		result.setRuleType(_ctx.stringValue("ListDataLevelPermissionWhiteListResponse.Result.RuleType"));

		UsersModel usersModel = new UsersModel();

		List<String> userGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDataLevelPermissionWhiteListResponse.Result.UsersModel.UserGroups.Length"); i++) {
			userGroups.add(_ctx.stringValue("ListDataLevelPermissionWhiteListResponse.Result.UsersModel.UserGroups["+ i +"]"));
		}
		usersModel.setUserGroups(userGroups);

		List<String> users = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDataLevelPermissionWhiteListResponse.Result.UsersModel.Users.Length"); i++) {
			users.add(_ctx.stringValue("ListDataLevelPermissionWhiteListResponse.Result.UsersModel.Users["+ i +"]"));
		}
		usersModel.setUsers(users);
		result.setUsersModel(usersModel);
		listDataLevelPermissionWhiteListResponse.setResult(result);
	 
	 	return listDataLevelPermissionWhiteListResponse;
	}
}