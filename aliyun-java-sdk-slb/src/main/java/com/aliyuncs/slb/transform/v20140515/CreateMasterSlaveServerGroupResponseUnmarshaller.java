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

import com.aliyuncs.slb.model.v20140515.CreateMasterSlaveServerGroupResponse;
import com.aliyuncs.slb.model.v20140515.CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMasterSlaveServerGroupResponseUnmarshaller {

	public static CreateMasterSlaveServerGroupResponse unmarshall(CreateMasterSlaveServerGroupResponse createMasterSlaveServerGroupResponse, UnmarshallerContext _ctx) {
		
		createMasterSlaveServerGroupResponse.setRequestId(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.RequestId"));
		createMasterSlaveServerGroupResponse.setMasterSlaveServerGroupId(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveServerGroupId"));

		List<MasterSlaveBackendServer> masterSlaveBackendServers = new ArrayList<MasterSlaveBackendServer>();
		for (int i = 0; i < _ctx.lengthValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers.Length"); i++) {
			MasterSlaveBackendServer masterSlaveBackendServer = new MasterSlaveBackendServer();
			masterSlaveBackendServer.setServerId(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].ServerId"));
			masterSlaveBackendServer.setPort(_ctx.integerValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].Port"));
			masterSlaveBackendServer.setWeight(_ctx.integerValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].Weight"));
			masterSlaveBackendServer.setServerType(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].ServerType"));
			masterSlaveBackendServer.setType(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].Type"));
			masterSlaveBackendServer.setServerIp(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].ServerIp"));
			masterSlaveBackendServer.setVpcId(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].VpcId"));
			masterSlaveBackendServer.setDescription(_ctx.stringValue("CreateMasterSlaveServerGroupResponse.MasterSlaveBackendServers["+ i +"].Description"));

			masterSlaveBackendServers.add(masterSlaveBackendServer);
		}
		createMasterSlaveServerGroupResponse.setMasterSlaveBackendServers(masterSlaveBackendServers);
	 
	 	return createMasterSlaveServerGroupResponse;
	}
}