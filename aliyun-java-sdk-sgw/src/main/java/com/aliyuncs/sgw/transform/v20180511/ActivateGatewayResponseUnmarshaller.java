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

import com.aliyuncs.sgw.model.v20180511.ActivateGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateGatewayResponseUnmarshaller {

	public static ActivateGatewayResponse unmarshall(ActivateGatewayResponse activateGatewayResponse, UnmarshallerContext _ctx) {
		
		activateGatewayResponse.setRequestId(_ctx.stringValue("ActivateGatewayResponse.RequestId"));
		activateGatewayResponse.setSuccess(_ctx.booleanValue("ActivateGatewayResponse.Success"));
		activateGatewayResponse.setCode(_ctx.stringValue("ActivateGatewayResponse.Code"));
		activateGatewayResponse.setMessage(_ctx.stringValue("ActivateGatewayResponse.Message"));
		activateGatewayResponse.setGatewayId(_ctx.stringValue("ActivateGatewayResponse.GatewayId"));
		activateGatewayResponse.setRegionId(_ctx.stringValue("ActivateGatewayResponse.RegionId"));
	 
	 	return activateGatewayResponse;
	}
}