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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListIpsecServersResponse;
import com.aliyuncs.vpc.model.v20160428.ListIpsecServersResponse.IpsecServer;
import com.aliyuncs.vpc.model.v20160428.ListIpsecServersResponse.IpsecServer.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.ListIpsecServersResponse.IpsecServer.IpsecConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIpsecServersResponseUnmarshaller {

	public static ListIpsecServersResponse unmarshall(ListIpsecServersResponse listIpsecServersResponse, UnmarshallerContext _ctx) {
		
		listIpsecServersResponse.setRequestId(_ctx.stringValue("ListIpsecServersResponse.RequestId"));
		listIpsecServersResponse.setNextToken(_ctx.stringValue("ListIpsecServersResponse.NextToken"));
		listIpsecServersResponse.setMaxResults(_ctx.integerValue("ListIpsecServersResponse.MaxResults"));
		listIpsecServersResponse.setTotalCount(_ctx.integerValue("ListIpsecServersResponse.TotalCount"));

		List<IpsecServer> ipsecServers = new ArrayList<IpsecServer>();
		for (int i = 0; i < _ctx.lengthValue("ListIpsecServersResponse.IpsecServers.Length"); i++) {
			IpsecServer ipsecServer = new IpsecServer();
			ipsecServer.setRegionId(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].RegionId"));
			ipsecServer.setIpsecServerId(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IpsecServerId"));
			ipsecServer.setIpsecServerName(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IpsecServerName"));
			ipsecServer.setVpnGatewayId(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].VpnGatewayId"));
			ipsecServer.setLocalSubnet(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].LocalSubnet"));
			ipsecServer.setClientIpPool(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].ClientIpPool"));
			ipsecServer.setEffectImmediately(_ctx.booleanValue("ListIpsecServersResponse.IpsecServers["+ i +"].EffectImmediately"));
			ipsecServer.setPskEnabled(_ctx.booleanValue("ListIpsecServersResponse.IpsecServers["+ i +"].PskEnabled"));
			ipsecServer.setMultiFactorAuthEnabled(_ctx.booleanValue("ListIpsecServersResponse.IpsecServers["+ i +"].MultiFactorAuthEnabled"));
			ipsecServer.setPsk(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].Psk"));
			ipsecServer.setIDaaSInstanceId(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IDaaSInstanceId"));
			ipsecServer.setOnlineClientCount(_ctx.integerValue("ListIpsecServersResponse.IpsecServers["+ i +"].OnlineClientCount"));
			ipsecServer.setMaxConnections(_ctx.integerValue("ListIpsecServersResponse.IpsecServers["+ i +"].MaxConnections"));
			ipsecServer.setCreationTime(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].CreationTime"));
			ipsecServer.setInternetIp(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].InternetIp"));

			IkeConfig ikeConfig = new IkeConfig();
			ikeConfig.setIkeVersion(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.IkeVersion"));
			ikeConfig.setIkeMode(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.IkeMode"));
			ikeConfig.setIkeEncAlg(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.IkeEncAlg"));
			ikeConfig.setIkeAuthAlg(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.IkeAuthAlg"));
			ikeConfig.setIkePfs(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.IkePfs"));
			ikeConfig.setIkeLifetime(_ctx.longValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.IkeLifetime"));
			ikeConfig.setLocalId(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.LocalId"));
			ikeConfig.setRemoteId(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IkeConfig.RemoteId"));
			ipsecServer.setIkeConfig(ikeConfig);

			IpsecConfig ipsecConfig = new IpsecConfig();
			ipsecConfig.setIpsecEncAlg(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IpsecConfig.IpsecEncAlg"));
			ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IpsecConfig.IpsecAuthAlg"));
			ipsecConfig.setIpsecPfs(_ctx.stringValue("ListIpsecServersResponse.IpsecServers["+ i +"].IpsecConfig.IpsecPfs"));
			ipsecConfig.setIpsecLifetime(_ctx.longValue("ListIpsecServersResponse.IpsecServers["+ i +"].IpsecConfig.IpsecLifetime"));
			ipsecServer.setIpsecConfig(ipsecConfig);

			ipsecServers.add(ipsecServer);
		}
		listIpsecServersResponse.setIpsecServers(ipsecServers);
	 
	 	return listIpsecServersResponse;
	}
}