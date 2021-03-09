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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ModifyUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyUserResponseUnmarshaller {

	public static ModifyUserResponse unmarshall(ModifyUserResponse modifyUserResponse, UnmarshallerContext _ctx) {
		
		modifyUserResponse.setRequestId(_ctx.stringValue("ModifyUserResponse.RequestId"));
		modifyUserResponse.setSuccess(_ctx.booleanValue("ModifyUserResponse.Success"));
		modifyUserResponse.setCode(_ctx.stringValue("ModifyUserResponse.Code"));
		modifyUserResponse.setMessage(_ctx.stringValue("ModifyUserResponse.Message"));
		modifyUserResponse.setHttpStatusCode(_ctx.integerValue("ModifyUserResponse.HttpStatusCode"));
	 
	 	return modifyUserResponse;
	}
}