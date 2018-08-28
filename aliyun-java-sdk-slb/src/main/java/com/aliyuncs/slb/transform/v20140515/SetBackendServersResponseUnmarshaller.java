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

import com.aliyuncs.slb.model.v20140515.SetBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.SetBackendServersResponse.BackendServer;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetBackendServersResponseUnmarshaller {

	public static SetBackendServersResponse unmarshall(SetBackendServersResponse setBackendServersResponse, UnmarshallerContext context) {
		
		setBackendServersResponse.setRequestId(context.stringValue("SetBackendServersResponse.RequestId"));
		setBackendServersResponse.setLoadBalancerId(context.stringValue("SetBackendServersResponse.LoadBalancerId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("SetBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("SetBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(context.stringValue("SetBackendServersResponse.BackendServers["+ i +"].Weight"));
			backendServer.setServerIp(context.stringValue("SetBackendServersResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(context.stringValue("SetBackendServersResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setEniHost(context.stringValue("SetBackendServersResponse.BackendServers["+ i +"].EniHost"));
			backendServer.setType(context.stringValue("SetBackendServersResponse.BackendServers["+ i +"].Type"));

			backendServers.add(backendServer);
		}
		setBackendServersResponse.setBackendServers(backendServers);
	 
	 	return setBackendServersResponse;
	}
}