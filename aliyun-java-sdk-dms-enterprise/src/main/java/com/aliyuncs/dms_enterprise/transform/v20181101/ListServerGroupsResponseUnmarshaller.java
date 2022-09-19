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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListServerGroupsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListServerGroupsResponse.Server;
import com.aliyuncs.dms_enterprise.model.v20181101.ListServerGroupsResponse.Server.MasterServer;
import com.aliyuncs.dms_enterprise.model.v20181101.ListServerGroupsResponse.Server.SlaveServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerGroupsResponseUnmarshaller {

	public static ListServerGroupsResponse unmarshall(ListServerGroupsResponse listServerGroupsResponse, UnmarshallerContext _ctx) {
		
		listServerGroupsResponse.setRequestId(_ctx.stringValue("ListServerGroupsResponse.RequestId"));
		listServerGroupsResponse.setErrorCode(_ctx.stringValue("ListServerGroupsResponse.ErrorCode"));
		listServerGroupsResponse.setErrorMessage(_ctx.stringValue("ListServerGroupsResponse.ErrorMessage"));
		listServerGroupsResponse.setSuccess(_ctx.booleanValue("ListServerGroupsResponse.Success"));
		listServerGroupsResponse.setTotalCount(_ctx.integerValue("ListServerGroupsResponse.TotalCount"));

		List<Server> serverGroupList = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("ListServerGroupsResponse.ServerGroupList.Length"); i++) {
			Server server = new Server();
			server.setId(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].Id"));
			server.setGroupName(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].GroupName"));

			MasterServer masterServer = new MasterServer();
			masterServer.setId(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].MasterServer.Id"));
			masterServer.setServerName(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].MasterServer.ServerName"));
			masterServer.setIp(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].MasterServer.Ip"));
			masterServer.setSshPort(_ctx.integerValue("ListServerGroupsResponse.ServerGroupList["+ i +"].MasterServer.SshPort"));
			masterServer.setUser(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].MasterServer.User"));
			masterServer.setPassword(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].MasterServer.Password"));
			server.setMasterServer(masterServer);

			List<SlaveServer> slaveServerList = new ArrayList<SlaveServer>();
			for (int j = 0; j < _ctx.lengthValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList.Length"); j++) {
				SlaveServer slaveServer = new SlaveServer();
				slaveServer.setId(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList["+ j +"].Id"));
				slaveServer.setServerName(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList["+ j +"].ServerName"));
				slaveServer.setIp(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList["+ j +"].Ip"));
				slaveServer.setSshPort(_ctx.integerValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList["+ j +"].SshPort"));
				slaveServer.setUser(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList["+ j +"].User"));
				slaveServer.setPassword(_ctx.stringValue("ListServerGroupsResponse.ServerGroupList["+ i +"].SlaveServerList["+ j +"].Password"));

				slaveServerList.add(slaveServer);
			}
			server.setSlaveServerList(slaveServerList);

			serverGroupList.add(server);
		}
		listServerGroupsResponse.setServerGroupList(serverGroupList);
	 
	 	return listServerGroupsResponse;
	}
}