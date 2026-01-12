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

import com.aliyuncs.xrengine.model.v20221111.LoginAppResponse;
import com.aliyuncs.xrengine.model.v20221111.LoginAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoginAppResponseUnmarshaller {

	public static LoginAppResponse unmarshall(LoginAppResponse loginAppResponse, UnmarshallerContext _ctx) {
		
		loginAppResponse.setRequestId(_ctx.stringValue("LoginAppResponse.RequestId"));
		loginAppResponse.setSuccess(_ctx.booleanValue("LoginAppResponse.Success"));
		loginAppResponse.setCode(_ctx.stringValue("LoginAppResponse.Code"));
		loginAppResponse.setMessage(_ctx.stringValue("LoginAppResponse.Message"));
		loginAppResponse.setErrorName(_ctx.stringValue("LoginAppResponse.ErrorName"));
		loginAppResponse.setHttpCode(_ctx.integerValue("LoginAppResponse.HttpCode"));

		Data data = new Data();
		data.setJwtToken(_ctx.stringValue("LoginAppResponse.Data.JwtToken"));
		data.setUid(_ctx.stringValue("LoginAppResponse.Data.Uid"));
		data.setNickname(_ctx.stringValue("LoginAppResponse.Data.Nickname"));
		loginAppResponse.setData(data);
	 
	 	return loginAppResponse;
	}
}