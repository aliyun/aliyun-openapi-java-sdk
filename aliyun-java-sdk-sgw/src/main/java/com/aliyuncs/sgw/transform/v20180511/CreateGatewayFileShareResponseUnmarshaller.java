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

import com.aliyuncs.sgw.model.v20180511.CreateGatewayFileShareResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGatewayFileShareResponseUnmarshaller {

	public static CreateGatewayFileShareResponse unmarshall(CreateGatewayFileShareResponse createGatewayFileShareResponse, UnmarshallerContext _ctx) {
		
		createGatewayFileShareResponse.setRequestId(_ctx.stringValue("CreateGatewayFileShareResponse.RequestId"));
		createGatewayFileShareResponse.setTaskId(_ctx.stringValue("CreateGatewayFileShareResponse.TaskId"));
		createGatewayFileShareResponse.setMessage(_ctx.stringValue("CreateGatewayFileShareResponse.Message"));
		createGatewayFileShareResponse.setCode(_ctx.stringValue("CreateGatewayFileShareResponse.Code"));
		createGatewayFileShareResponse.setSuccess(_ctx.booleanValue("CreateGatewayFileShareResponse.Success"));
	 
	 	return createGatewayFileShareResponse;
	}
}