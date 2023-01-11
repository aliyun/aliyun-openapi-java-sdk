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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListServerGroupServersResponse;
import com.aliyuncs.nlb.model.v20220430.ListServerGroupServersResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerGroupServersResponseUnmarshaller {

	public static ListServerGroupServersResponse unmarshall(ListServerGroupServersResponse listServerGroupServersResponse, UnmarshallerContext _ctx) {
		
		listServerGroupServersResponse.setRequestId(_ctx.stringValue("ListServerGroupServersResponse.RequestId"));
		listServerGroupServersResponse.setSuccess(_ctx.booleanValue("ListServerGroupServersResponse.Success"));
		listServerGroupServersResponse.setCode(_ctx.stringValue("ListServerGroupServersResponse.Code"));
		listServerGroupServersResponse.setMessage(_ctx.stringValue("ListServerGroupServersResponse.Message"));
		listServerGroupServersResponse.setHttpStatusCode(_ctx.integerValue("ListServerGroupServersResponse.HttpStatusCode"));
		listServerGroupServersResponse.setDynamicCode(_ctx.stringValue("ListServerGroupServersResponse.DynamicCode"));
		listServerGroupServersResponse.setDynamicMessage(_ctx.stringValue("ListServerGroupServersResponse.DynamicMessage"));
		listServerGroupServersResponse.setTotalCount(_ctx.integerValue("ListServerGroupServersResponse.TotalCount"));
		listServerGroupServersResponse.setNextToken(_ctx.stringValue("ListServerGroupServersResponse.NextToken"));
		listServerGroupServersResponse.setMaxResults(_ctx.integerValue("ListServerGroupServersResponse.MaxResults"));

		List<Server> servers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("ListServerGroupServersResponse.Servers.Length"); i++) {
			Server server = new Server();
			server.setServerId(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerId"));
			server.setServerType(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerType"));
			server.setServerIp(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerIp"));
			server.setPort(_ctx.integerValue("ListServerGroupServersResponse.Servers["+ i +"].Port"));
			server.setWeight(_ctx.integerValue("ListServerGroupServersResponse.Servers["+ i +"].Weight"));
			server.setServerGroupId(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ServerGroupId"));
			server.setDescription(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].Description"));
			server.setZoneId(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].ZoneId"));
			server.setStatus(_ctx.stringValue("ListServerGroupServersResponse.Servers["+ i +"].Status"));

			servers.add(server);
		}
		listServerGroupServersResponse.setServers(servers);
	 
	 	return listServerGroupServersResponse;
	}
}