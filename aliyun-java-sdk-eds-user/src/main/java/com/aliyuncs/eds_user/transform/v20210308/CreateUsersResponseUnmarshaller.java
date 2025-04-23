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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.CreateUsersResponse;
import com.aliyuncs.eds_user.model.v20210308.CreateUsersResponse.CreateResult;
import com.aliyuncs.eds_user.model.v20210308.CreateUsersResponse.CreateResult.CreatedUsersItem;
import com.aliyuncs.eds_user.model.v20210308.CreateUsersResponse.CreateResult.FailedUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUsersResponseUnmarshaller {

	public static CreateUsersResponse unmarshall(CreateUsersResponse createUsersResponse, UnmarshallerContext _ctx) {
		
		createUsersResponse.setRequestId(_ctx.stringValue("CreateUsersResponse.RequestId"));

		CreateResult createResult = new CreateResult();

		List<CreatedUsersItem> createdUsers = new ArrayList<CreatedUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateUsersResponse.CreateResult.CreatedUsers.Length"); i++) {
			CreatedUsersItem createdUsersItem = new CreatedUsersItem();
			createdUsersItem.setEndUserId(_ctx.stringValue("CreateUsersResponse.CreateResult.CreatedUsers["+ i +"].EndUserId"));
			createdUsersItem.setEmail(_ctx.stringValue("CreateUsersResponse.CreateResult.CreatedUsers["+ i +"].Email"));
			createdUsersItem.setPhone(_ctx.stringValue("CreateUsersResponse.CreateResult.CreatedUsers["+ i +"].Phone"));
			createdUsersItem.setRemark(_ctx.stringValue("CreateUsersResponse.CreateResult.CreatedUsers["+ i +"].Remark"));
			createdUsersItem.setRealNickName(_ctx.stringValue("CreateUsersResponse.CreateResult.CreatedUsers["+ i +"].RealNickName"));

			createdUsers.add(createdUsersItem);
		}
		createResult.setCreatedUsers(createdUsers);

		List<FailedUsersItem> failedUsers = new ArrayList<FailedUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateUsersResponse.CreateResult.FailedUsers.Length"); i++) {
			FailedUsersItem failedUsersItem = new FailedUsersItem();
			failedUsersItem.setEndUserId(_ctx.stringValue("CreateUsersResponse.CreateResult.FailedUsers["+ i +"].EndUserId"));
			failedUsersItem.setEmail(_ctx.stringValue("CreateUsersResponse.CreateResult.FailedUsers["+ i +"].Email"));
			failedUsersItem.setPhone(_ctx.stringValue("CreateUsersResponse.CreateResult.FailedUsers["+ i +"].Phone"));
			failedUsersItem.setErrorCode(_ctx.stringValue("CreateUsersResponse.CreateResult.FailedUsers["+ i +"].ErrorCode"));
			failedUsersItem.setErrorMessage(_ctx.stringValue("CreateUsersResponse.CreateResult.FailedUsers["+ i +"].ErrorMessage"));

			failedUsers.add(failedUsersItem);
		}
		createResult.setFailedUsers(failedUsers);
		createUsersResponse.setCreateResult(createResult);
	 
	 	return createUsersResponse;
	}
}