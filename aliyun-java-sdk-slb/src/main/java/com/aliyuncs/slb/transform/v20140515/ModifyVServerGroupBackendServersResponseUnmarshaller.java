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

import com.aliyuncs.slb.model.v20140515.ModifyVServerGroupBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.ModifyVServerGroupBackendServersResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyVServerGroupBackendServersResponseUnmarshaller {

	public static ModifyVServerGroupBackendServersResponse unmarshall(ModifyVServerGroupBackendServersResponse modifyVServerGroupBackendServersResponse, UnmarshallerContext context) {
		
		modifyVServerGroupBackendServersResponse.setRequestId(context.stringValue("ModifyVServerGroupBackendServersResponse.RequestId"));
		modifyVServerGroupBackendServersResponse.setVServerGroupId(context.stringValue("ModifyVServerGroupBackendServersResponse.VServerGroupId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("ModifyVServerGroupBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("ModifyVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(context.integerValue("ModifyVServerGroupBackendServersResponse.BackendServers["+ i +"].Port"));
			backendServer.setWeight(context.integerValue("ModifyVServerGroupBackendServersResponse.BackendServers["+ i +"].Weight"));

			backendServers.add(backendServer);
		}
		modifyVServerGroupBackendServersResponse.setBackendServers(backendServers);
	 
	 	return modifyVServerGroupBackendServersResponse;
	}
}