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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.GetUserLicenseResponse;
import com.aliyuncs.linkwan.model.v20190301.GetUserLicenseResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserLicenseResponseUnmarshaller {

	public static GetUserLicenseResponse unmarshall(GetUserLicenseResponse getUserLicenseResponse, UnmarshallerContext _ctx) {
		
		getUserLicenseResponse.setRequestId(_ctx.stringValue("GetUserLicenseResponse.RequestId"));
		getUserLicenseResponse.setSuccess(_ctx.booleanValue("GetUserLicenseResponse.Success"));

		Data data = new Data();
		data.setOui(_ctx.stringValue("GetUserLicenseResponse.Data.Oui"));
		data.setGatewayTupleLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleLimit"));
		data.setGatewayTupleCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleCount"));
		data.setNodeTupleLimit(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleLimit"));
		data.setNodeTupleCount(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleCount"));
		data.setGatewayLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayLimit"));
		data.setGatewayCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayCount"));
		data.setLocalJoinPermissionLimit(_ctx.longValue("GetUserLicenseResponse.Data.LocalJoinPermissionLimit"));
		data.setLocalJoinPermissionCount(_ctx.longValue("GetUserLicenseResponse.Data.LocalJoinPermissionCount"));
		data.setNodeLimit(_ctx.longValue("GetUserLicenseResponse.Data.NodeLimit"));
		data.setNodeCount(_ctx.longValue("GetUserLicenseResponse.Data.NodeCount"));
		data.setRoamingJoinPermissionLimit(_ctx.longValue("GetUserLicenseResponse.Data.RoamingJoinPermissionLimit"));
		data.setRoamingJoinPermissionCount(_ctx.longValue("GetUserLicenseResponse.Data.RoamingJoinPermissionCount"));
		data.setGatewayTupleFreeLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleFreeLimit"));
		data.setNodeTupleFreeLimit(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleFreeLimit"));
		data.setGatewayFreeLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayFreeLimit"));
		data.setLocalJoinPermissionFreeLimit(_ctx.longValue("GetUserLicenseResponse.Data.LocalJoinPermissionFreeLimit"));
		data.setRoamingJoinPermissionFreeLimit(_ctx.longValue("GetUserLicenseResponse.Data.RoamingJoinPermissionFreeLimit"));
		data.setNodeFreeLimit(_ctx.longValue("GetUserLicenseResponse.Data.NodeFreeLimit"));
		data.setRelayLimit(_ctx.longValue("GetUserLicenseResponse.Data.RelayLimit"));
		data.setRelayCount(_ctx.longValue("GetUserLicenseResponse.Data.RelayCount"));
		data.setGatewayPrePayCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayPrePayCount"));
		data.setNodeTupleRelayLimit(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleRelayLimit"));
		data.setNodeTupleRelayCount(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleRelayCount"));
		data.setNodeTupleStandardLimit(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleStandardLimit"));
		data.setNodeTupleStandardCount(_ctx.longValue("GetUserLicenseResponse.Data.NodeTupleStandardCount"));
		data.setGatewayTupleHybridLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleHybridLimit"));
		data.setGatewayTupleHybridCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleHybridCount"));
		data.setGatewayTupleSingleChannelLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleSingleChannelLimit"));
		data.setGatewayTupleSingleChannelCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleSingleChannelCount"));
		data.setGatewayTupleStandardLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleStandardLimit"));
		data.setGatewayTupleStandardCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayTupleStandardCount"));
		data.setGatewayDingTalkCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayDingTalkCount"));
		data.setGatewayDingTalkLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayDingTalkLimit"));
		data.setGatewayProfessionalCount(_ctx.longValue("GetUserLicenseResponse.Data.GatewayProfessionalCount"));
		data.setGatewayProfessionalLimit(_ctx.longValue("GetUserLicenseResponse.Data.GatewayProfessionalLimit"));
		getUserLicenseResponse.setData(data);
	 
	 	return getUserLicenseResponse;
	}
}