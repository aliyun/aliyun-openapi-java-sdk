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

package com.aliyuncs.dms_dg.transform.v20230914;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_dg.model.v20230914.GetUserGatewayInstancesResponse;
import com.aliyuncs.dms_dg.model.v20230914.GetUserGatewayInstancesResponse.GatewayInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGatewayInstancesResponseUnmarshaller {

	public static GetUserGatewayInstancesResponse unmarshall(GetUserGatewayInstancesResponse getUserGatewayInstancesResponse, UnmarshallerContext _ctx) {
		
		getUserGatewayInstancesResponse.setRequestId(_ctx.stringValue("GetUserGatewayInstancesResponse.RequestId"));
		getUserGatewayInstancesResponse.setCode(_ctx.stringValue("GetUserGatewayInstancesResponse.Code"));
		getUserGatewayInstancesResponse.setErrorMsg(_ctx.stringValue("GetUserGatewayInstancesResponse.ErrorMsg"));
		getUserGatewayInstancesResponse.setSuccess(_ctx.booleanValue("GetUserGatewayInstancesResponse.Success"));

		List<GatewayInstance> gatewayInstanceList = new ArrayList<GatewayInstance>();
		for (int i = 0; i < _ctx.lengthValue("GetUserGatewayInstancesResponse.GatewayInstanceList.Length"); i++) {
			GatewayInstance gatewayInstance = new GatewayInstance();
			gatewayInstance.setGatewayInstanceId(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].GatewayInstanceId"));
			gatewayInstance.setGatewayId(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].GatewayId"));
			gatewayInstance.setLastUpdateTime(_ctx.longValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].LastUpdateTime"));
			gatewayInstance.setLocalIP(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].LocalIP"));
			gatewayInstance.setOutputIP(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].OutputIP"));
			gatewayInstance.setMessage(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].Message"));
			gatewayInstance.setEndPoint(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].EndPoint"));
			gatewayInstance.setCurrentDaemonVersion(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].CurrentDaemonVersion"));
			gatewayInstance.setCurrentVersion(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].CurrentVersion"));
			gatewayInstance.setRegionId(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].RegionId"));
			gatewayInstance.setConnectEndpointType(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].ConnectEndpointType"));
			gatewayInstance.setGatewayInstanceStatus(_ctx.stringValue("GetUserGatewayInstancesResponse.GatewayInstanceList["+ i +"].GatewayInstanceStatus"));

			gatewayInstanceList.add(gatewayInstance);
		}
		getUserGatewayInstancesResponse.setGatewayInstanceList(gatewayInstanceList);
	 
	 	return getUserGatewayInstancesResponse;
	}
}