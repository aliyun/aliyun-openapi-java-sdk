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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetUserResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));

		Data data = new Data();
		data.setUserType(_ctx.stringValue("GetUserResponse.Data.UserType"));
		data.setUserStatus(_ctx.stringValue("GetUserResponse.Data.UserStatus"));
		data.setModifiedTime(_ctx.stringValue("GetUserResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("GetUserResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("GetUserResponse.Data.CreateTime"));
		getUserResponse.setData(data);
	 
	 	return getUserResponse;
	}
}