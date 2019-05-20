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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyUserResponseUnmarshaller {

	public static ModifyUserResponse unmarshall(ModifyUserResponse modifyUserResponse, UnmarshallerContext context) {
		
		modifyUserResponse.setRequestId(context.stringValue("ModifyUserResponse.RequestId"));
		modifyUserResponse.setSuccess(context.booleanValue("ModifyUserResponse.Success"));
		modifyUserResponse.setCode(context.stringValue("ModifyUserResponse.Code"));
		modifyUserResponse.setMessage(context.stringValue("ModifyUserResponse.Message"));
		modifyUserResponse.setHttpStatusCode(context.integerValue("ModifyUserResponse.HttpStatusCode"));
	 
	 	return modifyUserResponse;
	}
}