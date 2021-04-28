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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetUserResponse;
import com.aliyuncs.ccc.model.v20200701.GetUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setCode(_ctx.stringValue("GetUserResponse.Code"));
		getUserResponse.setHttpStatusCode(_ctx.integerValue("GetUserResponse.HttpStatusCode"));
		getUserResponse.setMessage(_ctx.stringValue("GetUserResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetUserResponse.Params["+ i +"]"));
		}
		getUserResponse.setParams(params);

		Data data = new Data();
		data.setDisplayName(_ctx.stringValue("GetUserResponse.Data.DisplayName"));
		data.setEmail(_ctx.stringValue("GetUserResponse.Data.Email"));
		data.setExtension(_ctx.stringValue("GetUserResponse.Data.Extension"));
		data.setInstanceId(_ctx.stringValue("GetUserResponse.Data.InstanceId"));
		data.setLoginName(_ctx.stringValue("GetUserResponse.Data.LoginName"));
		data.setMobile(_ctx.stringValue("GetUserResponse.Data.Mobile"));
		data.setRoleId(_ctx.stringValue("GetUserResponse.Data.RoleId"));
		data.setRoleName(_ctx.stringValue("GetUserResponse.Data.RoleName"));
		data.setUserId(_ctx.stringValue("GetUserResponse.Data.UserId"));
		data.setWorkMode(_ctx.stringValue("GetUserResponse.Data.WorkMode"));
		getUserResponse.setData(data);
	 
	 	return getUserResponse;
	}
}