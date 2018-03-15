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

import com.aliyuncs.slb.model.v20140515.RemoveBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.RemoveBackendServersResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveBackendServersResponseUnmarshaller {

	public static RemoveBackendServersResponse unmarshall(RemoveBackendServersResponse removeBackendServersResponse, UnmarshallerContext context) {
		
		removeBackendServersResponse.setRequestId(context.stringValue("RemoveBackendServersResponse.RequestId"));
		removeBackendServersResponse.setLoadBalancerId(context.stringValue("RemoveBackendServersResponse.LoadBalancerId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("RemoveBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("RemoveBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(context.integerValue("RemoveBackendServersResponse.BackendServers["+ i +"].Weight"));

			backendServers.add(backendServer);
		}
		removeBackendServersResponse.setBackendServers(backendServers);
	 
	 	return removeBackendServersResponse;
	}
}