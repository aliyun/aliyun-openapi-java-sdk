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

import com.aliyuncs.slb.model.v20140515.SetVServerGroupAttributeResponse;
import com.aliyuncs.slb.model.v20140515.SetVServerGroupAttributeResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetVServerGroupAttributeResponseUnmarshaller {

	public static SetVServerGroupAttributeResponse unmarshall(SetVServerGroupAttributeResponse setVServerGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		setVServerGroupAttributeResponse.setRequestId(_ctx.stringValue("SetVServerGroupAttributeResponse.RequestId"));
		setVServerGroupAttributeResponse.setVServerGroupId(_ctx.stringValue("SetVServerGroupAttributeResponse.VServerGroupId"));
		setVServerGroupAttributeResponse.setVServerGroupName(_ctx.stringValue("SetVServerGroupAttributeResponse.VServerGroupName"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("SetVServerGroupAttributeResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(_ctx.stringValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(_ctx.integerValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].Port"));
			backendServer.setWeight(_ctx.integerValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].Weight"));
			backendServer.setType(_ctx.stringValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].Type"));
			backendServer.setServerIp(_ctx.stringValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(_ctx.stringValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setDescription(_ctx.stringValue("SetVServerGroupAttributeResponse.BackendServers["+ i +"].Description"));

			backendServers.add(backendServer);
		}
		setVServerGroupAttributeResponse.setBackendServers(backendServers);
	 
	 	return setVServerGroupAttributeResponse;
	}
}