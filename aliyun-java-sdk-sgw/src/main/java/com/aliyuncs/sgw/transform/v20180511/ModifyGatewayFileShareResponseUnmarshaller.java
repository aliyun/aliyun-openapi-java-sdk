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

import com.aliyuncs.sgw.model.v20180511.ModifyGatewayFileShareResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyGatewayFileShareResponseUnmarshaller {

	public static ModifyGatewayFileShareResponse unmarshall(ModifyGatewayFileShareResponse modifyGatewayFileShareResponse, UnmarshallerContext _ctx) {
		
		modifyGatewayFileShareResponse.setRequestId(_ctx.stringValue("ModifyGatewayFileShareResponse.RequestId"));
		modifyGatewayFileShareResponse.setSuccess(_ctx.booleanValue("ModifyGatewayFileShareResponse.Success"));
		modifyGatewayFileShareResponse.setCode(_ctx.stringValue("ModifyGatewayFileShareResponse.Code"));
		modifyGatewayFileShareResponse.setMessage(_ctx.stringValue("ModifyGatewayFileShareResponse.Message"));
		modifyGatewayFileShareResponse.setTaskId(_ctx.stringValue("ModifyGatewayFileShareResponse.TaskId"));
	 
	 	return modifyGatewayFileShareResponse;
	}
}