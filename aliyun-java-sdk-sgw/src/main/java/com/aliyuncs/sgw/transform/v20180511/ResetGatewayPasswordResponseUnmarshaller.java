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

import com.aliyuncs.sgw.model.v20180511.ResetGatewayPasswordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetGatewayPasswordResponseUnmarshaller {

	public static ResetGatewayPasswordResponse unmarshall(ResetGatewayPasswordResponse resetGatewayPasswordResponse, UnmarshallerContext _ctx) {
		
		resetGatewayPasswordResponse.setRequestId(_ctx.stringValue("ResetGatewayPasswordResponse.RequestId"));
		resetGatewayPasswordResponse.setSuccess(_ctx.booleanValue("ResetGatewayPasswordResponse.Success"));
		resetGatewayPasswordResponse.setCode(_ctx.stringValue("ResetGatewayPasswordResponse.Code"));
		resetGatewayPasswordResponse.setMessage(_ctx.stringValue("ResetGatewayPasswordResponse.Message"));
		resetGatewayPasswordResponse.setTaskId(_ctx.stringValue("ResetGatewayPasswordResponse.TaskId"));
	 
	 	return resetGatewayPasswordResponse;
	}
}