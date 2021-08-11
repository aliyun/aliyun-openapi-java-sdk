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

import com.aliyuncs.sgw.model.v20180511.UpdateGatewayFileShareResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayFileShareResponseUnmarshaller {

	public static UpdateGatewayFileShareResponse unmarshall(UpdateGatewayFileShareResponse updateGatewayFileShareResponse, UnmarshallerContext _ctx) {
		
		updateGatewayFileShareResponse.setRequestId(_ctx.stringValue("UpdateGatewayFileShareResponse.RequestId"));
		updateGatewayFileShareResponse.setTaskId(_ctx.stringValue("UpdateGatewayFileShareResponse.TaskId"));
		updateGatewayFileShareResponse.setMessage(_ctx.stringValue("UpdateGatewayFileShareResponse.Message"));
		updateGatewayFileShareResponse.setCode(_ctx.stringValue("UpdateGatewayFileShareResponse.Code"));
		updateGatewayFileShareResponse.setSuccess(_ctx.booleanValue("UpdateGatewayFileShareResponse.Success"));
	 
	 	return updateGatewayFileShareResponse;
	}
}