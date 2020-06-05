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

import com.aliyuncs.sgw.model.v20180511.ModifyGatewayBlockVolumeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyGatewayBlockVolumeResponseUnmarshaller {

	public static ModifyGatewayBlockVolumeResponse unmarshall(ModifyGatewayBlockVolumeResponse modifyGatewayBlockVolumeResponse, UnmarshallerContext _ctx) {
		
		modifyGatewayBlockVolumeResponse.setRequestId(_ctx.stringValue("ModifyGatewayBlockVolumeResponse.RequestId"));
		modifyGatewayBlockVolumeResponse.setSuccess(_ctx.booleanValue("ModifyGatewayBlockVolumeResponse.Success"));
		modifyGatewayBlockVolumeResponse.setCode(_ctx.stringValue("ModifyGatewayBlockVolumeResponse.Code"));
		modifyGatewayBlockVolumeResponse.setMessage(_ctx.stringValue("ModifyGatewayBlockVolumeResponse.Message"));
		modifyGatewayBlockVolumeResponse.setTaskId(_ctx.stringValue("ModifyGatewayBlockVolumeResponse.TaskId"));
	 
	 	return modifyGatewayBlockVolumeResponse;
	}
}