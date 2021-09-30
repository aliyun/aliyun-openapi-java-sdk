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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection.VcoHealthCheck;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection.VpnBgpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnConnectionsResponseUnmarshaller {

	public static DescribeVpnConnectionsResponse unmarshall(DescribeVpnConnectionsResponse describeVpnConnectionsResponse, UnmarshallerContext _ctx) {
		
		describeVpnConnectionsResponse.setRequestId(_ctx.stringValue("DescribeVpnConnectionsResponse.RequestId"));
		describeVpnConnectionsResponse.setPageSize(_ctx.integerValue("DescribeVpnConnectionsResponse.PageSize"));
		describeVpnConnectionsResponse.setPageNumber(_ctx.integerValue("DescribeVpnConnectionsResponse.PageNumber"));
		describeVpnConnectionsResponse.setTotalCount(_ctx.integerValue("DescribeVpnConnectionsResponse.TotalCount"));

		List<VpnConnection> vpnConnections = new ArrayList<VpnConnection>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnConnectionsResponse.VpnConnections.Length"); i++) {
			VpnConnection vpnConnection = new VpnConnection();
			vpnConnection.setStatus(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].Status"));
			vpnConnection.setEnableNatTraversal(_ctx.booleanValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].EnableNatTraversal"));
			vpnConnection.setRemoteCaCertificate(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].RemoteCaCertificate"));
			vpnConnection.setCreateTime(_ctx.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].CreateTime"));
			vpnConnection.setEffectImmediately(_ctx.booleanValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].EffectImmediately"));
			vpnConnection.setVpnGatewayId(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnGatewayId"));
			vpnConnection.setLocalSubnet(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].LocalSubnet"));
			vpnConnection.setVpnConnectionId(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnConnectionId"));
			vpnConnection.setRemoteSubnet(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].RemoteSubnet"));
			vpnConnection.setCustomerGatewayId(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].CustomerGatewayId"));
			vpnConnection.setName(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].Name"));
			vpnConnection.setEnableDpd(_ctx.booleanValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].EnableDpd"));

			IkeConfig ikeConfig = new IkeConfig();
			ikeConfig.setRemoteId(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.RemoteId"));
			ikeConfig.setIkeLifetime(_ctx.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeLifetime"));
			ikeConfig.setIkeEncAlg(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeEncAlg"));
			ikeConfig.setLocalId(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.LocalId"));
			ikeConfig.setIkeMode(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeMode"));
			ikeConfig.setIkeVersion(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeVersion"));
			ikeConfig.setIkePfs(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkePfs"));
			ikeConfig.setPsk(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.Psk"));
			ikeConfig.setIkeAuthAlg(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeAuthAlg"));
			vpnConnection.setIkeConfig(ikeConfig);

			IpsecConfig ipsecConfig = new IpsecConfig();
			ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecAuthAlg"));
			ipsecConfig.setIpsecLifetime(_ctx.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecLifetime"));
			ipsecConfig.setIpsecEncAlg(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecEncAlg"));
			ipsecConfig.setIpsecPfs(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecPfs"));
			vpnConnection.setIpsecConfig(ipsecConfig);

			VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
			vcoHealthCheck.setStatus(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VcoHealthCheck.Status"));
			vcoHealthCheck.setDip(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VcoHealthCheck.Dip"));
			vcoHealthCheck.setInterval(_ctx.integerValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VcoHealthCheck.Interval"));
			vcoHealthCheck.setRetry(_ctx.integerValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VcoHealthCheck.Retry"));
			vcoHealthCheck.setSip(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VcoHealthCheck.Sip"));
			vcoHealthCheck.setEnable(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VcoHealthCheck.Enable"));
			vpnConnection.setVcoHealthCheck(vcoHealthCheck);

			VpnBgpConfig vpnBgpConfig = new VpnBgpConfig();
			vpnBgpConfig.setStatus(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.Status"));
			vpnBgpConfig.setPeerBgpIp(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.PeerBgpIp"));
			vpnBgpConfig.setTunnelCidr(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.TunnelCidr"));
			vpnBgpConfig.setLocalBgpIp(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.LocalBgpIp"));
			vpnBgpConfig.setPeerAsn(_ctx.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.PeerAsn"));
			vpnBgpConfig.setLocalAsn(_ctx.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.LocalAsn"));
			vpnBgpConfig.setAuthKey(_ctx.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnBgpConfig.AuthKey"));
			vpnConnection.setVpnBgpConfig(vpnBgpConfig);

			vpnConnections.add(vpnConnection);
		}
		describeVpnConnectionsResponse.setVpnConnections(vpnConnections);
	 
	 	return describeVpnConnectionsResponse;
	}
}