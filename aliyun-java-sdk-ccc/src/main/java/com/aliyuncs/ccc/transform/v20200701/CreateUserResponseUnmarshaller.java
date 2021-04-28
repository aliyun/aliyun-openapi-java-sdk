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

import com.aliyuncs.ccc.model.v20200701.CreateUserResponse;
import com.aliyuncs.ccc.model.v20200701.CreateUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));
		createUserResponse.setCode(_ctx.stringValue("CreateUserResponse.Code"));
		createUserResponse.setHttpStatusCode(_ctx.integerValue("CreateUserResponse.HttpStatusCode"));
		createUserResponse.setMessage(_ctx.stringValue("CreateUserResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateUserResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("CreateUserResponse.Params["+ i +"]"));
		}
		createUserResponse.setParams(params);

		Data data = new Data();
		data.setDisplayName(_ctx.stringValue("CreateUserResponse.Data.DisplayName"));
		data.setEmail(_ctx.stringValue("CreateUserResponse.Data.Email"));
		data.setExtension(_ctx.stringValue("CreateUserResponse.Data.Extension"));
		data.setLoginName(_ctx.stringValue("CreateUserResponse.Data.LoginName"));
		data.setMobile(_ctx.stringValue("CreateUserResponse.Data.Mobile"));
		data.setUserId(_ctx.stringValue("CreateUserResponse.Data.UserId"));
		data.setWorkMode(_ctx.stringValue("CreateUserResponse.Data.WorkMode"));
		createUserResponse.setData(data);
	 
	 	return createUserResponse;
	}
}