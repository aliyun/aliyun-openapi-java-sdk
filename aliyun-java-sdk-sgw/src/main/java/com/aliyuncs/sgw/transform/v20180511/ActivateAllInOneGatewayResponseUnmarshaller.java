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

import com.aliyuncs.sgw.model.v20180511.ActivateAllInOneGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateAllInOneGatewayResponseUnmarshaller {

	public static ActivateAllInOneGatewayResponse unmarshall(ActivateAllInOneGatewayResponse activateAllInOneGatewayResponse, UnmarshallerContext _ctx) {
		
		activateAllInOneGatewayResponse.setRequestId(_ctx.stringValue("ActivateAllInOneGatewayResponse.RequestId"));
		activateAllInOneGatewayResponse.setMessage(_ctx.stringValue("ActivateAllInOneGatewayResponse.Message"));
		activateAllInOneGatewayResponse.setRegionId(_ctx.stringValue("ActivateAllInOneGatewayResponse.RegionId"));
		activateAllInOneGatewayResponse.setGatewayId(_ctx.stringValue("ActivateAllInOneGatewayResponse.GatewayId"));
		activateAllInOneGatewayResponse.setLicenseContent(_ctx.stringValue("ActivateAllInOneGatewayResponse.LicenseContent"));
		activateAllInOneGatewayResponse.setCode(_ctx.stringValue("ActivateAllInOneGatewayResponse.Code"));
		activateAllInOneGatewayResponse.setSuccess(_ctx.booleanValue("ActivateAllInOneGatewayResponse.Success"));
	 
	 	return activateAllInOneGatewayResponse;
	}
}