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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.UpgradeSitePairResponse;
import com.aliyuncs.hdr.model.v20170925.UpgradeSitePairResponse.Gateway;
import com.aliyuncs.hdr.model.v20170925.UpgradeSitePairResponse.Server;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeSitePairResponseUnmarshaller {

	public static UpgradeSitePairResponse unmarshall(UpgradeSitePairResponse upgradeSitePairResponse, UnmarshallerContext _ctx) {
		
		upgradeSitePairResponse.setRequestId(_ctx.stringValue("UpgradeSitePairResponse.RequestId"));
		upgradeSitePairResponse.setSuccess(_ctx.booleanValue("UpgradeSitePairResponse.Success"));
		upgradeSitePairResponse.setCode(_ctx.stringValue("UpgradeSitePairResponse.Code"));
		upgradeSitePairResponse.setMessage(_ctx.stringValue("UpgradeSitePairResponse.Message"));
		upgradeSitePairResponse.setResult(_ctx.booleanValue("UpgradeSitePairResponse.Result"));

		List<Gateway> gateways = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("UpgradeSitePairResponse.Gateways.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGatewayId(_ctx.stringValue("UpgradeSitePairResponse.Gateways["+ i +"].GatewayId"));
			gateway.setErrno(_ctx.stringValue("UpgradeSitePairResponse.Gateways["+ i +"].Errno"));

			gateways.add(gateway);
		}
		upgradeSitePairResponse.setGateways(gateways);

		List<Server> servers = new ArrayList<Server>();
		for (int i = 0; i < _ctx.lengthValue("UpgradeSitePairResponse.Servers.Length"); i++) {
			Server server = new Server();
			server.setServerId(_ctx.stringValue("UpgradeSitePairResponse.Servers["+ i +"].ServerId"));
			server.setErrno(_ctx.stringValue("UpgradeSitePairResponse.Servers["+ i +"].Errno"));

			servers.add(server);
		}
		upgradeSitePairResponse.setServers(servers);
	 
	 	return upgradeSitePairResponse;
	}
}