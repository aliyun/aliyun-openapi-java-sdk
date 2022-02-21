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

import com.aliyuncs.mse.model.v20190531.AddGatewayRouteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGatewayRouteResponseUnmarshaller {

	public static AddGatewayRouteResponse unmarshall(AddGatewayRouteResponse addGatewayRouteResponse, UnmarshallerContext _ctx) {
		
		addGatewayRouteResponse.setRequestId(_ctx.stringValue("AddGatewayRouteResponse.RequestId"));
		addGatewayRouteResponse.setHttpStatusCode(_ctx.integerValue("AddGatewayRouteResponse.HttpStatusCode"));
		addGatewayRouteResponse.setMessage(_ctx.stringValue("AddGatewayRouteResponse.Message"));
		addGatewayRouteResponse.setCode(_ctx.integerValue("AddGatewayRouteResponse.Code"));
		addGatewayRouteResponse.setSuccess(_ctx.booleanValue("AddGatewayRouteResponse.Success"));
		addGatewayRouteResponse.setData(_ctx.longValue("AddGatewayRouteResponse.Data"));
	 
	 	return addGatewayRouteResponse;
	}
}