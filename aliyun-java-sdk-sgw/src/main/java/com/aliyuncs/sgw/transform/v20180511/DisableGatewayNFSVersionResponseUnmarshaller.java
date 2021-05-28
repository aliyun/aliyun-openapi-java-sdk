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

import com.aliyuncs.sgw.model.v20180511.DisableGatewayNFSVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableGatewayNFSVersionResponseUnmarshaller {

	public static DisableGatewayNFSVersionResponse unmarshall(DisableGatewayNFSVersionResponse disableGatewayNFSVersionResponse, UnmarshallerContext _ctx) {
		
		disableGatewayNFSVersionResponse.setRequestId(_ctx.stringValue("DisableGatewayNFSVersionResponse.RequestId"));
		disableGatewayNFSVersionResponse.setSuccess(_ctx.booleanValue("DisableGatewayNFSVersionResponse.Success"));
		disableGatewayNFSVersionResponse.setCode(_ctx.stringValue("DisableGatewayNFSVersionResponse.Code"));
		disableGatewayNFSVersionResponse.setMessage(_ctx.stringValue("DisableGatewayNFSVersionResponse.Message"));
		disableGatewayNFSVersionResponse.setTaskId(_ctx.stringValue("DisableGatewayNFSVersionResponse.TaskId"));
	 
	 	return disableGatewayNFSVersionResponse;
	}
}