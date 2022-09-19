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

import com.aliyuncs.dms_enterprise.model.v20181101.ListServersResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListServersResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServersResponseUnmarshaller {

	public static ListServersResponse unmarshall(ListServersResponse listServersResponse, UnmarshallerContext _ctx) {
		
		listServersResponse.setRequestId(_ctx.stringValue("ListServersResponse.RequestId"));
		listServersResponse.setErrorCode(_ctx.stringValue("ListServersResponse.ErrorCode"));
		listServersResponse.setErrorMessage(_ctx.stringValue("ListServersResponse.ErrorMessage"));
		listServersResponse.setSuccess(_ctx.booleanValue("ListServersResponse.Success"));
		listServersResponse.setTotalCount(_ctx.integerValue("ListServersResponse.TotalCount"));

		List<Server> serverList = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("ListServersResponse.ServerList.Length"); i++) {
			Server server = new Server();
			server.setId(_ctx.stringValue("ListServersResponse.ServerList["+ i +"].Id"));
			server.setServerName(_ctx.stringValue("ListServersResponse.ServerList["+ i +"].ServerName"));
			server.setIp(_ctx.stringValue("ListServersResponse.ServerList["+ i +"].Ip"));
			server.setSshPort(_ctx.integerValue("ListServersResponse.ServerList["+ i +"].SshPort"));
			server.setUser(_ctx.stringValue("ListServersResponse.ServerList["+ i +"].User"));
			server.setPassword(_ctx.stringValue("ListServersResponse.ServerList["+ i +"].Password"));

			serverList.add(server);
		}
		listServersResponse.setServerList(serverList);
	 
	 	return listServersResponse;
	}
}