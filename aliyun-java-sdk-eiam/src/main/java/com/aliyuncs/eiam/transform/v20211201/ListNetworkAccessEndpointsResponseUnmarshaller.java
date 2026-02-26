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

import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessEndpointsResponse;
import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessEndpointsResponse.NetworkAccessEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkAccessEndpointsResponseUnmarshaller {

	public static ListNetworkAccessEndpointsResponse unmarshall(ListNetworkAccessEndpointsResponse listNetworkAccessEndpointsResponse, UnmarshallerContext _ctx) {
		
		listNetworkAccessEndpointsResponse.setRequestId(_ctx.stringValue("ListNetworkAccessEndpointsResponse.RequestId"));
		listNetworkAccessEndpointsResponse.setTotalCount(_ctx.longValue("ListNetworkAccessEndpointsResponse.TotalCount"));
		listNetworkAccessEndpointsResponse.setNextToken(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NextToken"));

		List<NetworkAccessEndpoint> networkAccessEndpoints = new ArrayList<NetworkAccessEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints.Length"); i++) {
			NetworkAccessEndpoint networkAccessEndpoint = new NetworkAccessEndpoint();
			networkAccessEndpoint.setInstanceId(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].InstanceId"));
			networkAccessEndpoint.setNetworkAccessEndpointId(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].NetworkAccessEndpointId"));
			networkAccessEndpoint.setNetworkAccessEndpointName(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].NetworkAccessEndpointName"));
			networkAccessEndpoint.setVpcId(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].VpcId"));
			networkAccessEndpoint.setVpcRegionId(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].VpcRegionId"));
			networkAccessEndpoint.setSecurityGroupId(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].SecurityGroupId"));
			networkAccessEndpoint.setStatus(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].Status"));
			networkAccessEndpoint.setNetworkAccessEndpointType(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].NetworkAccessEndpointType"));
			networkAccessEndpoint.setCreateTime(_ctx.longValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].CreateTime"));
			networkAccessEndpoint.setUpdateTime(_ctx.longValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].UpdateTime"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("ListNetworkAccessEndpointsResponse.NetworkAccessEndpoints["+ i +"].VSwitchIds["+ j +"]"));
			}
			networkAccessEndpoint.setVSwitchIds(vSwitchIds);

			networkAccessEndpoints.add(networkAccessEndpoint);
		}
		listNetworkAccessEndpointsResponse.setNetworkAccessEndpoints(networkAccessEndpoints);
	 
	 	return listNetworkAccessEndpointsResponse;
	}
}