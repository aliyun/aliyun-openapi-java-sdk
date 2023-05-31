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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.GetTaskWorkforceResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskWorkforceResponse.WorkforceItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskWorkforceResponse.WorkforceItem.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskWorkforceResponseUnmarshaller {

	public static GetTaskWorkforceResponse unmarshall(GetTaskWorkforceResponse getTaskWorkforceResponse, UnmarshallerContext _ctx) {
		
		getTaskWorkforceResponse.setRequestId(_ctx.stringValue("GetTaskWorkforceResponse.RequestId"));
		getTaskWorkforceResponse.setCode(_ctx.integerValue("GetTaskWorkforceResponse.Code"));
		getTaskWorkforceResponse.setMessage(_ctx.stringValue("GetTaskWorkforceResponse.Message"));
		getTaskWorkforceResponse.setDetails(_ctx.stringValue("GetTaskWorkforceResponse.Details"));
		getTaskWorkforceResponse.setSuccess(_ctx.booleanValue("GetTaskWorkforceResponse.Success"));
		getTaskWorkforceResponse.setErrorCode(_ctx.stringValue("GetTaskWorkforceResponse.ErrorCode"));

		List<WorkforceItem> workforce = new ArrayList<WorkforceItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskWorkforceResponse.Workforce.Length"); i++) {
			WorkforceItem workforceItem = new WorkforceItem();
			workforceItem.setNodeType(_ctx.stringValue("GetTaskWorkforceResponse.Workforce["+ i +"].NodeType"));
			workforceItem.setWorkNodeId(_ctx.integerValue("GetTaskWorkforceResponse.Workforce["+ i +"].WorkNodeId"));

			List<UsersItem> users = new ArrayList<UsersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskWorkforceResponse.Workforce["+ i +"].Users.Length"); j++) {
				UsersItem usersItem = new UsersItem();
				usersItem.setUserId(_ctx.longValue("GetTaskWorkforceResponse.Workforce["+ i +"].Users["+ j +"].UserId"));
				usersItem.setAccountType(_ctx.stringValue("GetTaskWorkforceResponse.Workforce["+ i +"].Users["+ j +"].AccountType"));
				usersItem.setAccountNo(_ctx.stringValue("GetTaskWorkforceResponse.Workforce["+ i +"].Users["+ j +"].AccountNo"));
				usersItem.setUserName(_ctx.stringValue("GetTaskWorkforceResponse.Workforce["+ i +"].Users["+ j +"].UserName"));
				usersItem.setRole(_ctx.stringValue("GetTaskWorkforceResponse.Workforce["+ i +"].Users["+ j +"].Role"));

				users.add(usersItem);
			}
			workforceItem.setUsers(users);

			workforce.add(workforceItem);
		}
		getTaskWorkforceResponse.setWorkforce(workforce);
	 
	 	return getTaskWorkforceResponse;
	}
}