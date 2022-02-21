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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteRetryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayRouteRetryResponseUnmarshaller {

	public static UpdateGatewayRouteRetryResponse unmarshall(UpdateGatewayRouteRetryResponse updateGatewayRouteRetryResponse, UnmarshallerContext _ctx) {
		
		updateGatewayRouteRetryResponse.setRequestId(_ctx.stringValue("UpdateGatewayRouteRetryResponse.RequestId"));
		updateGatewayRouteRetryResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayRouteRetryResponse.HttpStatusCode"));
		updateGatewayRouteRetryResponse.setMessage(_ctx.stringValue("UpdateGatewayRouteRetryResponse.Message"));
		updateGatewayRouteRetryResponse.setCode(_ctx.integerValue("UpdateGatewayRouteRetryResponse.Code"));
		updateGatewayRouteRetryResponse.setSuccess(_ctx.booleanValue("UpdateGatewayRouteRetryResponse.Success"));
		updateGatewayRouteRetryResponse.setData(_ctx.longValue("UpdateGatewayRouteRetryResponse.Data"));
	 
	 	return updateGatewayRouteRetryResponse;
	}
}