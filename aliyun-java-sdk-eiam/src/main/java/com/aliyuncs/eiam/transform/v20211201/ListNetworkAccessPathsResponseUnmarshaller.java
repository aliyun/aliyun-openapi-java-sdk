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

import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessPathsResponse;
import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessPathsResponse.NetworkAccessPath;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkAccessPathsResponseUnmarshaller {

	public static ListNetworkAccessPathsResponse unmarshall(ListNetworkAccessPathsResponse listNetworkAccessPathsResponse, UnmarshallerContext _ctx) {
		
		listNetworkAccessPathsResponse.setRequestId(_ctx.stringValue("ListNetworkAccessPathsResponse.RequestId"));

		List<NetworkAccessPath> networkAccessPaths = new ArrayList<NetworkAccessPath>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkAccessPathsResponse.NetworkAccessPaths.Length"); i++) {
			NetworkAccessPath networkAccessPath = new NetworkAccessPath();
			networkAccessPath.setInstanceId(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].InstanceId"));
			networkAccessPath.setNetworkAccessEndpointId(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].NetworkAccessEndpointId"));
			networkAccessPath.setNetworkAccessPathId(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].NetworkAccessPathId"));
			networkAccessPath.setNetworkInterfaceId(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].NetworkInterfaceId"));
			networkAccessPath.setVSwitchId(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].VSwitchId"));
			networkAccessPath.setPrivateIpAddress(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].PrivateIpAddress"));
			networkAccessPath.setStatus(_ctx.stringValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].Status"));
			networkAccessPath.setCreateTime(_ctx.longValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].CreateTime"));
			networkAccessPath.setUpdateTime(_ctx.longValue("ListNetworkAccessPathsResponse.NetworkAccessPaths["+ i +"].UpdateTime"));

			networkAccessPaths.add(networkAccessPath);
		}
		listNetworkAccessPathsResponse.setNetworkAccessPaths(networkAccessPaths);
	 
	 	return listNetworkAccessPathsResponse;
	}
}