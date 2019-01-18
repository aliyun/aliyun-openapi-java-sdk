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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.GetUserLicenseResponse;
import com.aliyuncs.linkwan.model.v20181230.GetUserLicenseResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserLicenseResponseUnmarshaller {

	public static GetUserLicenseResponse unmarshall(GetUserLicenseResponse getUserLicenseResponse, UnmarshallerContext context) {
		
		getUserLicenseResponse.setRequestId(context.stringValue("GetUserLicenseResponse.RequestId"));
		getUserLicenseResponse.setSuccess(context.booleanValue("GetUserLicenseResponse.Success"));

		Data data = new Data();
		data.setOui(context.stringValue("GetUserLicenseResponse.Data.Oui"));
		data.setGatewayTupleLimit(context.longValue("GetUserLicenseResponse.Data.GatewayTupleLimit"));
		data.setGatewayTupleCount(context.longValue("GetUserLicenseResponse.Data.GatewayTupleCount"));
		data.setNodeTupleLimit(context.longValue("GetUserLicenseResponse.Data.NodeTupleLimit"));
		data.setNodeTupleCount(context.longValue("GetUserLicenseResponse.Data.NodeTupleCount"));
		data.setGatewayLimit(context.longValue("GetUserLicenseResponse.Data.GatewayLimit"));
		data.setGatewayCount(context.longValue("GetUserLicenseResponse.Data.GatewayCount"));
		data.setLocalJoinPermissionLimit(context.longValue("GetUserLicenseResponse.Data.LocalJoinPermissionLimit"));
		data.setLocalJoinPermissionCount(context.longValue("GetUserLicenseResponse.Data.LocalJoinPermissionCount"));
		data.setNodeLimit(context.longValue("GetUserLicenseResponse.Data.NodeLimit"));
		data.setNodeCount(context.longValue("GetUserLicenseResponse.Data.NodeCount"));
		data.setRoamingJoinPermissionLimit(context.longValue("GetUserLicenseResponse.Data.RoamingJoinPermissionLimit"));
		data.setRoamingJoinPermissionCount(context.longValue("GetUserLicenseResponse.Data.RoamingJoinPermissionCount"));
		data.setGatewayTupleFreeLimit(context.longValue("GetUserLicenseResponse.Data.GatewayTupleFreeLimit"));
		data.setNodeTupleFreeLimit(context.longValue("GetUserLicenseResponse.Data.NodeTupleFreeLimit"));
		data.setGatewayFreeLimit(context.longValue("GetUserLicenseResponse.Data.GatewayFreeLimit"));
		data.setLocalJoinPermissionFreeLimit(context.longValue("GetUserLicenseResponse.Data.LocalJoinPermissionFreeLimit"));
		data.setRoamingJoinPermissionFreeLimit(context.longValue("GetUserLicenseResponse.Data.RoamingJoinPermissionFreeLimit"));
		data.setNodeFreeLimit(context.longValue("GetUserLicenseResponse.Data.NodeFreeLimit"));
		getUserLicenseResponse.setData(data);
	 
	 	return getUserLicenseResponse;
	}
}