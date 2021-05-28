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

import com.aliyuncs.sgw.model.v20180511.CreateElasticGatewayPrivateZoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateElasticGatewayPrivateZoneResponseUnmarshaller {

	public static CreateElasticGatewayPrivateZoneResponse unmarshall(CreateElasticGatewayPrivateZoneResponse createElasticGatewayPrivateZoneResponse, UnmarshallerContext _ctx) {
		
		createElasticGatewayPrivateZoneResponse.setRequestId(_ctx.stringValue("CreateElasticGatewayPrivateZoneResponse.RequestId"));
		createElasticGatewayPrivateZoneResponse.setSuccess(_ctx.booleanValue("CreateElasticGatewayPrivateZoneResponse.Success"));
		createElasticGatewayPrivateZoneResponse.setCode(_ctx.stringValue("CreateElasticGatewayPrivateZoneResponse.Code"));
		createElasticGatewayPrivateZoneResponse.setMessage(_ctx.stringValue("CreateElasticGatewayPrivateZoneResponse.Message"));
		createElasticGatewayPrivateZoneResponse.setTaskId(_ctx.stringValue("CreateElasticGatewayPrivateZoneResponse.TaskId"));
	 
	 	return createElasticGatewayPrivateZoneResponse;
	}
}