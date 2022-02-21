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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayRouteResponse;
import com.aliyuncs.mse.model.v20190531.DeleteGatewayRouteResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayRouteResponseUnmarshaller {

	public static DeleteGatewayRouteResponse unmarshall(DeleteGatewayRouteResponse deleteGatewayRouteResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayRouteResponse.setRequestId(_ctx.stringValue("DeleteGatewayRouteResponse.RequestId"));
		deleteGatewayRouteResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayRouteResponse.HttpStatusCode"));
		deleteGatewayRouteResponse.setMessage(_ctx.stringValue("DeleteGatewayRouteResponse.Message"));
		deleteGatewayRouteResponse.setCode(_ctx.integerValue("DeleteGatewayRouteResponse.Code"));
		deleteGatewayRouteResponse.setSuccess(_ctx.booleanValue("DeleteGatewayRouteResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteGatewayRouteResponse.Data.Id"));
		data.setName(_ctx.stringValue("DeleteGatewayRouteResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("DeleteGatewayRouteResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("DeleteGatewayRouteResponse.Data.GatewayId"));
		data.setPredicates(_ctx.stringValue("DeleteGatewayRouteResponse.Data.Predicates"));
		data.setDefaultServiceId(_ctx.longValue("DeleteGatewayRouteResponse.Data.DefaultServiceId"));
		data.setRouteOrder(_ctx.integerValue("DeleteGatewayRouteResponse.Data.RouteOrder"));
		data.setStatus(_ctx.integerValue("DeleteGatewayRouteResponse.Data.Status"));
		data.setGmtCreate(_ctx.stringValue("DeleteGatewayRouteResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DeleteGatewayRouteResponse.Data.GmtModified"));
		deleteGatewayRouteResponse.setData(data);
	 
	 	return deleteGatewayRouteResponse;
	}
}