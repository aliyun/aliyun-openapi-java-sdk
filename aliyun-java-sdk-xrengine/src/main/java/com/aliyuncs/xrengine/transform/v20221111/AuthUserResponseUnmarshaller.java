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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.AuthUserResponse;
import com.aliyuncs.xrengine.model.v20221111.AuthUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthUserResponseUnmarshaller {

	public static AuthUserResponse unmarshall(AuthUserResponse authUserResponse, UnmarshallerContext _ctx) {
		
		authUserResponse.setRequestId(_ctx.stringValue("AuthUserResponse.RequestId"));
		authUserResponse.setSuccess(_ctx.booleanValue("AuthUserResponse.Success"));
		authUserResponse.setCode(_ctx.stringValue("AuthUserResponse.Code"));
		authUserResponse.setMessage(_ctx.stringValue("AuthUserResponse.Message"));
		authUserResponse.setErrorName(_ctx.stringValue("AuthUserResponse.ErrorName"));
		authUserResponse.setHttpCode(_ctx.integerValue("AuthUserResponse.HttpCode"));

		Data data = new Data();
		data.setJwtToken(_ctx.stringValue("AuthUserResponse.Data.JwtToken"));
		data.setType(_ctx.stringValue("AuthUserResponse.Data.Type"));
		authUserResponse.setData(data);
	 
	 	return authUserResponse;
	}
}