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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateUserGroupResponse;
import com.aliyuncs.vcs.model.v20200515.CreateUserGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserGroupResponseUnmarshaller {

	public static CreateUserGroupResponse unmarshall(CreateUserGroupResponse createUserGroupResponse, UnmarshallerContext _ctx) {
		
		createUserGroupResponse.setRequestId(_ctx.stringValue("CreateUserGroupResponse.RequestId"));
		createUserGroupResponse.setMessage(_ctx.stringValue("CreateUserGroupResponse.Message"));
		createUserGroupResponse.setCode(_ctx.stringValue("CreateUserGroupResponse.Code"));

		Data data = new Data();
		data.setUserGroupName(_ctx.stringValue("CreateUserGroupResponse.Data.UserGroupName"));
		data.setUserGroupId(_ctx.longValue("CreateUserGroupResponse.Data.UserGroupId"));
		data.setIsvSubId(_ctx.stringValue("CreateUserGroupResponse.Data.IsvSubId"));
		createUserGroupResponse.setData(data);
	 
	 	return createUserGroupResponse;
	}
}