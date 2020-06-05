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

import com.aliyuncs.sgw.model.v20180511.CreateGatewayBlockVolumeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGatewayBlockVolumeResponseUnmarshaller {

	public static CreateGatewayBlockVolumeResponse unmarshall(CreateGatewayBlockVolumeResponse createGatewayBlockVolumeResponse, UnmarshallerContext _ctx) {
		
		createGatewayBlockVolumeResponse.setRequestId(_ctx.stringValue("CreateGatewayBlockVolumeResponse.RequestId"));
		createGatewayBlockVolumeResponse.setSuccess(_ctx.booleanValue("CreateGatewayBlockVolumeResponse.Success"));
		createGatewayBlockVolumeResponse.setCode(_ctx.stringValue("CreateGatewayBlockVolumeResponse.Code"));
		createGatewayBlockVolumeResponse.setMessage(_ctx.stringValue("CreateGatewayBlockVolumeResponse.Message"));
		createGatewayBlockVolumeResponse.setTaskId(_ctx.stringValue("CreateGatewayBlockVolumeResponse.TaskId"));
	 
	 	return createGatewayBlockVolumeResponse;
	}
}