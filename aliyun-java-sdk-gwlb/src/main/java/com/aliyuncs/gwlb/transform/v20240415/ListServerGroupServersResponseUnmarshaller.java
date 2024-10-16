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

package com.aliyuncs.gwlb.transform.v20240415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gwlb.model.v20240415.ListServerGroupServersResponse;
import com.aliyuncs.gwlb.model.v20240415.ListServerGroupServersResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerGroupServersResponseUnmarshaller {

	public static ListServerGroupServersResponse unmarshall(ListServerGroupServersResponse listServerGroupServersResponse, UnmarshallerContext _ctx) {
		
		listServerGroupServersResponse.setRequestId(_ctx.stringValue("ListServerGroupServersResponse.RequestId"));
		listServerGroupServersResponse.setMaxResults(_ctx.integerValue("ListServerGroupServersResponse.MaxResults"));
		listServerGroupServersResponse.setNextToken(_ctx.stringValue("ListServerGroupServersResponse.NextToken"));
		listServerGroupServersResponse.setTotalCount(_ctx.integerValue("ListServerGroupServersResponse.TotalCount"));

		List<Server> servers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("ListServerGroupServersResponse.Servers.Length"); i++) {
			Server server = new Server();
			server.setPort(_ctx.integerValue("ListServerGroupServersResponse.Servers["+ i +"].Port"));
			server.setServerGroupId(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerGroupId"));
			server.setServerId(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerId"));
			server.setServerIp(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerIp"));
			server.setServerType(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerType"));
			server.setStatus(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].Status"));

			servers.add(server);
		}
		listServerGroupServersResponse.setServers(servers);
	 
	 	return listServerGroupServersResponse;
	}
}