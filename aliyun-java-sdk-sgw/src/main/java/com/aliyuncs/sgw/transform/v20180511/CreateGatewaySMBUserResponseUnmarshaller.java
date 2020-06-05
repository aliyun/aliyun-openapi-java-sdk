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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.CreateGatewaySMBUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGatewaySMBUserResponseUnmarshaller {

	public static CreateGatewaySMBUserResponse unmarshall(CreateGatewaySMBUserResponse createGatewaySMBUserResponse, UnmarshallerContext _ctx) {
		
		createGatewaySMBUserResponse.setRequestId(_ctx.stringValue("CreateGatewaySMBUserResponse.RequestId"));
		createGatewaySMBUserResponse.setSuccess(_ctx.booleanValue("CreateGatewaySMBUserResponse.Success"));
		createGatewaySMBUserResponse.setCode(_ctx.stringValue("CreateGatewaySMBUserResponse.Code"));
		createGatewaySMBUserResponse.setMessage(_ctx.stringValue("CreateGatewaySMBUserResponse.Message"));
		createGatewaySMBUserResponse.setTaskId(_ctx.stringValue("CreateGatewaySMBUserResponse.TaskId"));
	 
	 	return createGatewaySMBUserResponse;
	}
}