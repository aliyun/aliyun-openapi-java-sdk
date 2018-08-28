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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.AddBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.AddBackendServersResponse.BackendServer;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBackendServersResponseUnmarshaller {

	public static AddBackendServersResponse unmarshall(AddBackendServersResponse addBackendServersResponse, UnmarshallerContext context) {
		
		addBackendServersResponse.setRequestId(context.stringValue("AddBackendServersResponse.RequestId"));
		addBackendServersResponse.setLoadBalancerId(context.stringValue("AddBackendServersResponse.LoadBalancerId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("AddBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("AddBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(context.stringValue("AddBackendServersResponse.BackendServers["+ i +"].Weight"));
			backendServer.setServerIp(context.stringValue("AddBackendServersResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(context.stringValue("AddBackendServersResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setEniHost(context.stringValue("AddBackendServersResponse.BackendServers["+ i +"].EniHost"));
			backendServer.setType(context.stringValue("AddBackendServersResponse.BackendServers["+ i +"].Type"));

			backendServers.add(backendServer);
		}
		addBackendServersResponse.setBackendServers(backendServers);
	 
	 	return addBackendServersResponse;
	}
}