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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.AuthorizeBaaSResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthorizeBaaSResponseUnmarshaller {

	public static AuthorizeBaaSResponse unmarshall(AuthorizeBaaSResponse authorizeBaaSResponse, UnmarshallerContext _ctx) {
		
		authorizeBaaSResponse.setRequestId(_ctx.stringValue("AuthorizeBaaSResponse.RequestId"));
		authorizeBaaSResponse.setCode(_ctx.stringValue("AuthorizeBaaSResponse.Code"));
		authorizeBaaSResponse.setHttpStatusCode(_ctx.integerValue("AuthorizeBaaSResponse.HttpStatusCode"));
		authorizeBaaSResponse.setMessage(_ctx.stringValue("AuthorizeBaaSResponse.Message"));
		authorizeBaaSResponse.setSuccess(_ctx.booleanValue("AuthorizeBaaSResponse.Success"));
	 
	 	return authorizeBaaSResponse;
	}
}