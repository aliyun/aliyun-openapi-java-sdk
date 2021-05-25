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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.SetBackendServersResponse;
import com.aliyuncs.ens.model.v20171110.SetBackendServersResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetBackendServersResponseUnmarshaller {

	public static SetBackendServersResponse unmarshall(SetBackendServersResponse setBackendServersResponse, UnmarshallerContext _ctx) {
		
		setBackendServersResponse.setRequestId(_ctx.stringValue("SetBackendServersResponse.RequestId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("SetBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(_ctx.stringValue("SetBackendServersResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setWeight(_ctx.integerValue("SetBackendServersResponse.BackendServers["+ i +"].Weight"));
			backendServer.setType(_ctx.stringValue("SetBackendServersResponse.BackendServers["+ i +"].Type"));
			backendServer.setIp(_ctx.stringValue("SetBackendServersResponse.BackendServers["+ i +"].Ip"));
			backendServer.setPort(_ctx.integerValue("SetBackendServersResponse.BackendServers["+ i +"].Port"));

			backendServers.add(backendServer);
		}
		setBackendServersResponse.setBackendServers(backendServers);
	 
	 	return setBackendServersResponse;
	}
}