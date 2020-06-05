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

import com.aliyuncs.sgw.model.v20180511.ModifyGatewayClassResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyGatewayClassResponseUnmarshaller {

	public static ModifyGatewayClassResponse unmarshall(ModifyGatewayClassResponse modifyGatewayClassResponse, UnmarshallerContext _ctx) {
		
		modifyGatewayClassResponse.setRequestId(_ctx.stringValue("ModifyGatewayClassResponse.RequestId"));
		modifyGatewayClassResponse.setSuccess(_ctx.booleanValue("ModifyGatewayClassResponse.Success"));
		modifyGatewayClassResponse.setCode(_ctx.stringValue("ModifyGatewayClassResponse.Code"));
		modifyGatewayClassResponse.setMessage(_ctx.stringValue("ModifyGatewayClassResponse.Message"));
		modifyGatewayClassResponse.setTaskId(_ctx.stringValue("ModifyGatewayClassResponse.TaskId"));
		modifyGatewayClassResponse.setBuyURL(_ctx.stringValue("ModifyGatewayClassResponse.BuyURL"));
	 
	 	return modifyGatewayClassResponse;
	}
}