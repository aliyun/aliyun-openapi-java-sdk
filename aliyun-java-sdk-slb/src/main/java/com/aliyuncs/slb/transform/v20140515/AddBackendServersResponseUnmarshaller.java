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
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBackendServersResponseUnmarshaller {

	public static AddBackendServersResponse unmarshall(AddBackendServersResponse addBackendServersResponse, UnmarshallerContext _ctx) {
		
		addBackendServersResponse.setRequestId(_ctx.stringValue("AddBackendServersResponse.RequestId"));
		addBackendServersResponse.setLoadBalancerId(_ctx.stringValue("AddBackendServersResponse.LoadBalancerId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("AddBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(_ctx.stringValue("AddBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(_ctx.stringValue("AddBackendServersResponse.BackendServers["+ i +"].Weight"));
			backendServer.setServerIp(_ctx.stringValue("AddBackendServersResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(_ctx.stringValue("AddBackendServersResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setType(_ctx.stringValue("AddBackendServersResponse.BackendServers["+ i +"].Type"));
			backendServer.setDescription(_ctx.stringValue("AddBackendServersResponse.BackendServers["+ i +"].Description"));

			backendServers.add(backendServer);
		}
		addBackendServersResponse.setBackendServers(backendServers);
	 
	 	return addBackendServersResponse;
	}
}