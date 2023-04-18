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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteAuthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayRouteAuthResponseUnmarshaller {

	public static UpdateGatewayRouteAuthResponse unmarshall(UpdateGatewayRouteAuthResponse updateGatewayRouteAuthResponse, UnmarshallerContext _ctx) {
		
		updateGatewayRouteAuthResponse.setRequestId(_ctx.stringValue("UpdateGatewayRouteAuthResponse.RequestId"));
		updateGatewayRouteAuthResponse.setSuccess(_ctx.booleanValue("UpdateGatewayRouteAuthResponse.Success"));
		updateGatewayRouteAuthResponse.setCode(_ctx.integerValue("UpdateGatewayRouteAuthResponse.Code"));
		updateGatewayRouteAuthResponse.setErrorCode(_ctx.stringValue("UpdateGatewayRouteAuthResponse.ErrorCode"));
		updateGatewayRouteAuthResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayRouteAuthResponse.HttpStatusCode"));
		updateGatewayRouteAuthResponse.setMessage(_ctx.stringValue("UpdateGatewayRouteAuthResponse.Message"));
		updateGatewayRouteAuthResponse.setDynamicCode(_ctx.stringValue("UpdateGatewayRouteAuthResponse.DynamicCode"));
		updateGatewayRouteAuthResponse.setDynamicMessage(_ctx.stringValue("UpdateGatewayRouteAuthResponse.DynamicMessage"));
		updateGatewayRouteAuthResponse.setData(_ctx.longValue("UpdateGatewayRouteAuthResponse.Data"));
	 
	 	return updateGatewayRouteAuthResponse;
	}
}