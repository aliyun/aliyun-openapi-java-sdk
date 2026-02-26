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

import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.TunnelOptions;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.TunnelOptions.TunnelBgpConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.TunnelOptions.TunnelIkeConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.TunnelOptions.TunnelIpsecConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.VcoHealthCheck;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.VpnBgpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyVpnConnectionAttributeResponseUnmarshaller {

	public static ModifyVpnConnectionAttributeResponse unmarshall(ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyVpnConnectionAttributeResponse.setRequestId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.RequestId"));
		modifyVpnConnectionAttributeResponse.setEnableNatTraversal(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EnableNatTraversal"));
		modifyVpnConnectionAttributeResponse.setCreateTime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.CreateTime"));
		modifyVpnConnectionAttributeResponse.setEffectImmediately(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EffectImmediately"));
		modifyVpnConnectionAttributeResponse.setVpnGatewayId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnGatewayId"));
		modifyVpnConnectionAttributeResponse.setLocalSubnet(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.LocalSubnet"));
		modifyVpnConnectionAttributeResponse.setVpnConnectionId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnConnectionId"));
		modifyVpnConnectionAttributeResponse.setDescription(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.Description"));
		modifyVpnConnectionAttributeResponse.setRemoteSubnet(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.RemoteSubnet"));
		modifyVpnConnectionAttributeResponse.setCustomerGatewayId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.CustomerGatewayId"));
		modifyVpnConnectionAttributeResponse.setName(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.Name"));
		modifyVpnConnectionAttributeResponse.setEnableDpd(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EnableDpd"));
		modifyVpnConnectionAttributeResponse.setEnableTunnelsBgp(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EnableTunnelsBgp"));
		modifyVpnConnectionAttributeResponse.setResourceGroupId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.ResourceGroupId"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setRemoteId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.RemoteId"));
		ikeConfig.setIkeLifetime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setIkeEncAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setLocalId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.LocalId"));
		ikeConfig.setIkeMode(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeVersion(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkePfs(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkePfs"));
		ikeConfig.setPsk(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.Psk"));
		ikeConfig.setIkeAuthAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeAuthAlg"));
		modifyVpnConnectionAttributeResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecLifetime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecLifetime"));
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecPfs"));
		modifyVpnConnectionAttributeResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setDip(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(_ctx.integerValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(_ctx.integerValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Retry"));
		vcoHealthCheck.setSip(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setEnable(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Enable"));
		modifyVpnConnectionAttributeResponse.setVcoHealthCheck(vcoHealthCheck);

		VpnBgpConfig vpnBgpConfig = new VpnBgpConfig();
		vpnBgpConfig.setStatus(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.Status"));
		vpnBgpConfig.setPeerBgpIp(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.PeerBgpIp"));
		vpnBgpConfig.setTunnelCidr(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.TunnelCidr"));
		vpnBgpConfig.setEnableBgp(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.EnableBgp"));
		vpnBgpConfig.setLocalBgpIp(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.LocalBgpIp"));
		vpnBgpConfig.setPeerAsn(_ctx.integerValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.PeerAsn"));
		vpnBgpConfig.setLocalAsn(_ctx.integerValue("ModifyVpnConnectionAttributeResponse.VpnBgpConfig.LocalAsn"));
		modifyVpnConnectionAttributeResponse.setVpnBgpConfig(vpnBgpConfig);

		List<TunnelOptions> tunnelOptionsSpecification = new ArrayList<TunnelOptions>();
		for (int i = 0; i < _ctx.lengthValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification.Length"); i++) {
			TunnelOptions tunnelOptions = new TunnelOptions();
			tunnelOptions.setCustomerGatewayId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].CustomerGatewayId"));
			tunnelOptions.setEnableDpd(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].EnableDpd"));
			tunnelOptions.setEnableNatTraversal(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].EnableNatTraversal"));
			tunnelOptions.setInternetIp(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].InternetIp"));
			tunnelOptions.setRemoteCaCertificate(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].RemoteCaCertificate"));
			tunnelOptions.setRole(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].Role"));
			tunnelOptions.setState(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].State"));
			tunnelOptions.setTunnelId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelId"));
			tunnelOptions.setZoneNo(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].ZoneNo"));

			TunnelBgpConfig tunnelBgpConfig = new TunnelBgpConfig();
			tunnelBgpConfig.setLocalAsn(_ctx.longValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.LocalAsn"));
			tunnelBgpConfig.setLocalBgpIp(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.LocalBgpIp"));
			tunnelBgpConfig.setPeerAsn(_ctx.longValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.PeerAsn"));
			tunnelBgpConfig.setPeerBgpIp(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.PeerBgpIp"));
			tunnelBgpConfig.setTunnelCidr(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.TunnelCidr"));
			tunnelOptions.setTunnelBgpConfig(tunnelBgpConfig);

			TunnelIkeConfig tunnelIkeConfig = new TunnelIkeConfig();
			tunnelIkeConfig.setIkeAuthAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeAuthAlg"));
			tunnelIkeConfig.setIkeEncAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeEncAlg"));
			tunnelIkeConfig.setIkeLifetime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeLifetime"));
			tunnelIkeConfig.setIkeMode(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeMode"));
			tunnelIkeConfig.setIkePfs(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkePfs"));
			tunnelIkeConfig.setIkeVersion(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeVersion"));
			tunnelIkeConfig.setLocalId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.LocalId"));
			tunnelIkeConfig.setPsk(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.Psk"));
			tunnelIkeConfig.setRemoteId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.RemoteId"));
			tunnelOptions.setTunnelIkeConfig(tunnelIkeConfig);

			TunnelIpsecConfig tunnelIpsecConfig = new TunnelIpsecConfig();
			tunnelIpsecConfig.setIpsecAuthAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecAuthAlg"));
			tunnelIpsecConfig.setIpsecEncAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecEncAlg"));
			tunnelIpsecConfig.setIpsecLifetime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecLifetime"));
			tunnelIpsecConfig.setIpsecPfs(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecPfs"));
			tunnelOptions.setTunnelIpsecConfig(tunnelIpsecConfig);

			tunnelOptionsSpecification.add(tunnelOptions);
		}
		modifyVpnConnectionAttributeResponse.setTunnelOptionsSpecification(tunnelOptionsSpecification);
	 
	 	return modifyVpnConnectionAttributeResponse;
	}
}