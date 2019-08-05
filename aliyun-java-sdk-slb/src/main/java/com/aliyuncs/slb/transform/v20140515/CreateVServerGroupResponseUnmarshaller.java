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

import com.aliyuncs.slb.model.v20140515.CreateVServerGroupResponse;
import com.aliyuncs.slb.model.v20140515.CreateVServerGroupResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVServerGroupResponseUnmarshaller {

	public static CreateVServerGroupResponse unmarshall(CreateVServerGroupResponse createVServerGroupResponse, UnmarshallerContext _ctx) {
		
		createVServerGroupResponse.setRequestId(_ctx.stringValue("CreateVServerGroupResponse.RequestId"));
		createVServerGroupResponse.setVServerGroupId(_ctx.stringValue("CreateVServerGroupResponse.VServerGroupId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("CreateVServerGroupResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(_ctx.stringValue("CreateVServerGroupResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(_ctx.integerValue("CreateVServerGroupResponse.BackendServers["+ i +"].Port"));
			backendServer.setWeight(_ctx.integerValue("CreateVServerGroupResponse.BackendServers["+ i +"].Weight"));
			backendServer.setType(_ctx.stringValue("CreateVServerGroupResponse.BackendServers["+ i +"].Type"));
			backendServer.setServerIp(_ctx.stringValue("CreateVServerGroupResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(_ctx.stringValue("CreateVServerGroupResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setDescription(_ctx.stringValue("CreateVServerGroupResponse.BackendServers["+ i +"].Description"));

			backendServers.add(backendServer);
		}
		createVServerGroupResponse.setBackendServers(backendServers);
	 
	 	return createVServerGroupResponse;
	}
}