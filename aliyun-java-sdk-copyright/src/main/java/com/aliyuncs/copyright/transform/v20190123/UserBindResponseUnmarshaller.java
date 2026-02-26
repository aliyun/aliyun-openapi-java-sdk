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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.UserBindResponse;
import com.aliyuncs.copyright.model.v20190123.UserBindResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class UserBindResponseUnmarshaller {

	public static UserBindResponse unmarshall(UserBindResponse userBindResponse, UnmarshallerContext _ctx) {
		
		userBindResponse.setRequestId(_ctx.stringValue("UserBindResponse.RequestId"));
		userBindResponse.setHttpStatusCode(_ctx.integerValue("UserBindResponse.HttpStatusCode"));
		userBindResponse.setDynamicCode(_ctx.stringValue("UserBindResponse.DynamicCode"));
		userBindResponse.setDynamicMessage(_ctx.stringValue("UserBindResponse.DynamicMessage"));
		userBindResponse.setErrorMsg(_ctx.stringValue("UserBindResponse.ErrorMsg"));
		userBindResponse.setErrorCode(_ctx.stringValue("UserBindResponse.ErrorCode"));
		userBindResponse.setSuccess(_ctx.booleanValue("UserBindResponse.Success"));
		userBindResponse.setAllowRetry(_ctx.booleanValue("UserBindResponse.AllowRetry"));
		userBindResponse.setAppName(_ctx.stringValue("UserBindResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UserBindResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UserBindResponse.ErrorArgs["+ i +"]"));
		}
		userBindResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setChainUserId(_ctx.stringValue("UserBindResponse.Module.ChainUserId"));
		userBindResponse.setModule(module);
	 
	 	return userBindResponse;
	}
}