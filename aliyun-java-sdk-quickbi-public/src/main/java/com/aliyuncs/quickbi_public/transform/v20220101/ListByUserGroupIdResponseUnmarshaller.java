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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListByUserGroupIdResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListByUserGroupIdResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListByUserGroupIdResponse.Result.UserGroupModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListByUserGroupIdResponseUnmarshaller {

	public static ListByUserGroupIdResponse unmarshall(ListByUserGroupIdResponse listByUserGroupIdResponse, UnmarshallerContext _ctx) {
		
		listByUserGroupIdResponse.setRequestId(_ctx.stringValue("ListByUserGroupIdResponse.RequestId"));
		listByUserGroupIdResponse.setSuccess(_ctx.booleanValue("ListByUserGroupIdResponse.Success"));

		Result result = new Result();

		List<String> failedUserGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListByUserGroupIdResponse.Result.FailedUserGroupIds.Length"); i++) {
			failedUserGroupIds.add(_ctx.stringValue("ListByUserGroupIdResponse.Result.FailedUserGroupIds["+ i +"]"));
		}
		result.setFailedUserGroupIds(failedUserGroupIds);

		List<UserGroupModelsItem> userGroupModels = new ArrayList<UserGroupModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListByUserGroupIdResponse.Result.UserGroupModels.Length"); i++) {
			UserGroupModelsItem userGroupModelsItem = new UserGroupModelsItem();
			userGroupModelsItem.setCreateTime(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].CreateTime"));
			userGroupModelsItem.setCreateUser(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].CreateUser"));
			userGroupModelsItem.setIdentifiedPath(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].IdentifiedPath"));
			userGroupModelsItem.setModifiedTime(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].ModifiedTime"));
			userGroupModelsItem.setModifyUser(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].ModifyUser"));
			userGroupModelsItem.setParentUsergroupId(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].ParentUsergroupId"));
			userGroupModelsItem.setUsergroupDesc(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].UsergroupDesc"));
			userGroupModelsItem.setUsergroupId(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].UsergroupId"));
			userGroupModelsItem.setUsergroupName(_ctx.stringValue("ListByUserGroupIdResponse.Result.UserGroupModels["+ i +"].UsergroupName"));

			userGroupModels.add(userGroupModelsItem);
		}
		result.setUserGroupModels(userGroupModels);
		listByUserGroupIdResponse.setResult(result);
	 
	 	return listByUserGroupIdResponse;
	}
}