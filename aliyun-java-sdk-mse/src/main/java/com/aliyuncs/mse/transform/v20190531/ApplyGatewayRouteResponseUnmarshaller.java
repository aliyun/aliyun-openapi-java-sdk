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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.ApplyGatewayRouteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyGatewayRouteResponseUnmarshaller {

	public static ApplyGatewayRouteResponse unmarshall(ApplyGatewayRouteResponse applyGatewayRouteResponse, UnmarshallerContext _ctx) {
		
		applyGatewayRouteResponse.setRequestId(_ctx.stringValue("ApplyGatewayRouteResponse.RequestId"));
		applyGatewayRouteResponse.setHttpStatusCode(_ctx.integerValue("ApplyGatewayRouteResponse.HttpStatusCode"));
		applyGatewayRouteResponse.setMessage(_ctx.stringValue("ApplyGatewayRouteResponse.Message"));
		applyGatewayRouteResponse.setCode(_ctx.integerValue("ApplyGatewayRouteResponse.Code"));
		applyGatewayRouteResponse.setSuccess(_ctx.booleanValue("ApplyGatewayRouteResponse.Success"));
		applyGatewayRouteResponse.setData(_ctx.booleanValue("ApplyGatewayRouteResponse.Data"));
	 
	 	return applyGatewayRouteResponse;
	}
}