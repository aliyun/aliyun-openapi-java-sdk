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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryServerListOfZoneResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryServerListOfZoneResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryServerListOfZoneResponseUnmarshaller {

	public static OpsQueryServerListOfZoneResponse unmarshall(OpsQueryServerListOfZoneResponse opsQueryServerListOfZoneResponse, UnmarshallerContext _ctx) {
		
		opsQueryServerListOfZoneResponse.setRequestId(_ctx.stringValue("OpsQueryServerListOfZoneResponse.RequestId"));
		opsQueryServerListOfZoneResponse.setPageSize(_ctx.longValue("OpsQueryServerListOfZoneResponse.PageSize"));
		opsQueryServerListOfZoneResponse.setTotal(_ctx.longValue("OpsQueryServerListOfZoneResponse.Total"));
		opsQueryServerListOfZoneResponse.setPageNo(_ctx.longValue("OpsQueryServerListOfZoneResponse.PageNo"));

		List<Server> servers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryServerListOfZoneResponse.Servers.Length"); i++) {
			Server server = new Server();
			server.setType(_ctx.stringValue("OpsQueryServerListOfZoneResponse.Servers["+ i +"].Type"));
			server.setStatus(_ctx.stringValue("OpsQueryServerListOfZoneResponse.Servers["+ i +"].Status"));
			server.setIp(_ctx.stringValue("OpsQueryServerListOfZoneResponse.Servers["+ i +"].Ip"));
			server.setHostname(_ctx.stringValue("OpsQueryServerListOfZoneResponse.Servers["+ i +"].Hostname"));

			servers.add(server);
		}
		opsQueryServerListOfZoneResponse.setServers(servers);
	 
	 	return opsQueryServerListOfZoneResponse;
	}
}