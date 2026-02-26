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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetNetworkAccessEndpointResponse;
import com.aliyuncs.eiam.model.v20211201.GetNetworkAccessEndpointResponse.NetworkAccessEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetworkAccessEndpointResponseUnmarshaller {

	public static GetNetworkAccessEndpointResponse unmarshall(GetNetworkAccessEndpointResponse getNetworkAccessEndpointResponse, UnmarshallerContext _ctx) {
		
		getNetworkAccessEndpointResponse.setRequestId(_ctx.stringValue("GetNetworkAccessEndpointResponse.RequestId"));

		NetworkAccessEndpoint networkAccessEndpoint = new NetworkAccessEndpoint();
		networkAccessEndpoint.setInstanceId(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.InstanceId"));
		networkAccessEndpoint.setNetworkAccessEndpointId(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.NetworkAccessEndpointId"));
		networkAccessEndpoint.setNetworkAccessEndpointName(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.NetworkAccessEndpointName"));
		networkAccessEndpoint.setVpcId(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.VpcId"));
		networkAccessEndpoint.setVpcRegionId(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.VpcRegionId"));
		networkAccessEndpoint.setSecurityGroupId(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.SecurityGroupId"));
		networkAccessEndpoint.setStatus(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.Status"));
		networkAccessEndpoint.setNetworkAccessEndpointType(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.NetworkAccessEndpointType"));
		networkAccessEndpoint.setCreateTime(_ctx.longValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.CreateTime"));
		networkAccessEndpoint.setUpdateTime(_ctx.longValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.UpdateTime"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.VSwitchIds["+ i +"]"));
		}
		networkAccessEndpoint.setVSwitchIds(vSwitchIds);

		List<String> egressPublicIpAddresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.EgressPublicIpAddresses.Length"); i++) {
			egressPublicIpAddresses.add(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.EgressPublicIpAddresses["+ i +"]"));
		}
		networkAccessEndpoint.setEgressPublicIpAddresses(egressPublicIpAddresses);

		List<String> egressPrivateIpAddresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.EgressPrivateIpAddresses.Length"); i++) {
			egressPrivateIpAddresses.add(_ctx.stringValue("GetNetworkAccessEndpointResponse.NetworkAccessEndpoint.EgressPrivateIpAddresses["+ i +"]"));
		}
		networkAccessEndpoint.setEgressPrivateIpAddresses(egressPrivateIpAddresses);
		getNetworkAccessEndpointResponse.setNetworkAccessEndpoint(networkAccessEndpoint);
	 
	 	return getNetworkAccessEndpointResponse;
	}
}