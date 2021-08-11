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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.AuthorizeDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthorizeDeviceResponseUnmarshaller {

	public static AuthorizeDeviceResponse unmarshall(AuthorizeDeviceResponse authorizeDeviceResponse, UnmarshallerContext _ctx) {
		
		authorizeDeviceResponse.setRequestId(_ctx.stringValue("AuthorizeDeviceResponse.RequestId"));
		authorizeDeviceResponse.setCode(_ctx.integerValue("AuthorizeDeviceResponse.Code"));
		authorizeDeviceResponse.setSuccess(_ctx.booleanValue("AuthorizeDeviceResponse.Success"));
		authorizeDeviceResponse.setMessage(_ctx.stringValue("AuthorizeDeviceResponse.Message"));
		authorizeDeviceResponse.setData(_ctx.stringValue("AuthorizeDeviceResponse.Data"));
	 
	 	return authorizeDeviceResponse;
	}
}