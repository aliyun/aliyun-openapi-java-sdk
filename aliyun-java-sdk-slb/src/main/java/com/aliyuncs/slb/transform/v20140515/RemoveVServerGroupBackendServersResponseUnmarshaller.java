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

import com.aliyuncs.slb.model.v20140515.RemoveVServerGroupBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.RemoveVServerGroupBackendServersResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveVServerGroupBackendServersResponseUnmarshaller {

	public static RemoveVServerGroupBackendServersResponse unmarshall(RemoveVServerGroupBackendServersResponse removeVServerGroupBackendServersResponse, UnmarshallerContext _ctx) {
		
		removeVServerGroupBackendServersResponse.setRequestId(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.RequestId"));
		removeVServerGroupBackendServersResponse.setVServerGroupId(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.VServerGroupId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("RemoveVServerGroupBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(_ctx.integerValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].Port"));
			backendServer.setWeight(_ctx.integerValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].Weight"));
			backendServer.setType(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].Type"));
			backendServer.setServerIp(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setDescription(_ctx.stringValue("RemoveVServerGroupBackendServersResponse.BackendServers["+ i +"].Description"));

			backendServers.add(backendServer);
		}
		removeVServerGroupBackendServersResponse.setBackendServers(backendServers);
	 
	 	return removeVServerGroupBackendServersResponse;
	}
}