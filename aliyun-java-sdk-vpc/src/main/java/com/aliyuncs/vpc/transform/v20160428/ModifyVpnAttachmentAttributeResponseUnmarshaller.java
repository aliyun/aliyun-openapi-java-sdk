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

import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.TunnelOptions;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.TunnelOptions.TunnelBgpConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.TunnelOptions.TunnelIkeConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.TunnelOptions.TunnelIpsecConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.VcoHealthCheck;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnAttachmentAttributeResponse.VpnBgpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyVpnAttachmentAttributeResponseUnmarshaller {

	public static ModifyVpnAttachmentAttributeResponse unmarshall(ModifyVpnAttachmentAttributeResponse modifyVpnAttachmentAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyVpnAttachmentAttributeResponse.setRequestId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.RequestId"));
		modifyVpnAttachmentAttributeResponse.setVpnConnectionId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnConnectionId"));
		modifyVpnAttachmentAttributeResponse.setCustomerGatewayId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.CustomerGatewayId"));
		modifyVpnAttachmentAttributeResponse.setVpnGatewayId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnGatewayId"));
		modifyVpnAttachmentAttributeResponse.setName(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.Name"));
		modifyVpnAttachmentAttributeResponse.setDescription(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.Description"));
		modifyVpnAttachmentAttributeResponse.setLocalSubnet(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.LocalSubnet"));
		modifyVpnAttachmentAttributeResponse.setRemoteSubnet(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.RemoteSubnet"));
		modifyVpnAttachmentAttributeResponse.setCreateTime(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.CreateTime"));
		modifyVpnAttachmentAttributeResponse.setEffectImmediately(_ctx.booleanValue("ModifyVpnAttachmentAttributeResponse.EffectImmediately"));
		modifyVpnAttachmentAttributeResponse.setStatus(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.Status"));
		modifyVpnAttachmentAttributeResponse.setEnableDpd(_ctx.booleanValue("ModifyVpnAttachmentAttributeResponse.EnableDpd"));
		modifyVpnAttachmentAttributeResponse.setEnableNatTraversal(_ctx.booleanValue("ModifyVpnAttachmentAttributeResponse.EnableNatTraversal"));
		modifyVpnAttachmentAttributeResponse.setAttachType(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.AttachType"));
		modifyVpnAttachmentAttributeResponse.setNetworkType(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.NetworkType"));
		modifyVpnAttachmentAttributeResponse.setAttachInstanceId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.AttachInstanceId"));
		modifyVpnAttachmentAttributeResponse.setSpec(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.Spec"));
		modifyVpnAttachmentAttributeResponse.setResourceGroupId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.ResourceGroupId"));
		modifyVpnAttachmentAttributeResponse.setEnableTunnelsBgp(_ctx.booleanValue("ModifyVpnAttachmentAttributeResponse.EnableTunnelsBgp"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setPsk(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.Psk"));
		ikeConfig.setIkeVersion(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkeMode(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeEncAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setIkeAuthAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.IkeAuthAlg"));
		ikeConfig.setIkePfs(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.IkePfs"));
		ikeConfig.setIkeLifetime(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setLocalId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.LocalId"));
		ikeConfig.setRemoteId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IkeConfig.RemoteId"));
		modifyVpnAttachmentAttributeResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.IpsecConfig.IpsecPfs"));
		ipsecConfig.setIpsecLifetime(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.IpsecConfig.IpsecLifetime"));
		modifyVpnAttachmentAttributeResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setEnable(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VcoHealthCheck.Enable"));
		vcoHealthCheck.setSip(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setDip(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(_ctx.integerValue("ModifyVpnAttachmentAttributeResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(_ctx.integerValue("ModifyVpnAttachmentAttributeResponse.VcoHealthCheck.Retry"));
		vcoHealthCheck.setPolicy(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VcoHealthCheck.Policy"));
		modifyVpnAttachmentAttributeResponse.setVcoHealthCheck(vcoHealthCheck);

		VpnBgpConfig vpnBgpConfig = new VpnBgpConfig();
		vpnBgpConfig.setEnableBgp(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.EnableBgp"));
		vpnBgpConfig.setTunnelCidr(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.TunnelCidr"));
		vpnBgpConfig.setLocalBgpIp(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.LocalBgpIp"));
		vpnBgpConfig.setPeerBgpIp(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.PeerBgpIp"));
		vpnBgpConfig.setLocalAsn(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.LocalAsn"));
		vpnBgpConfig.setPeerAsn(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.PeerAsn"));
		vpnBgpConfig.setStatus(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.VpnBgpConfig.Status"));
		modifyVpnAttachmentAttributeResponse.setVpnBgpConfig(vpnBgpConfig);

		List<TunnelOptions> tunnelOptionsSpecification = new ArrayList<TunnelOptions>();
		for (int i = 0; i < _ctx.lengthValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification.Length"); i++) {
			TunnelOptions tunnelOptions = new TunnelOptions();
			tunnelOptions.setCustomerGatewayId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].CustomerGatewayId"));
			tunnelOptions.setEnableDpd(_ctx.booleanValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].EnableDpd"));
			tunnelOptions.setEnableNatTraversal(_ctx.booleanValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].EnableNatTraversal"));
			tunnelOptions.setInternetIp(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].InternetIp"));
			tunnelOptions.setRemoteCaCertificate(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].RemoteCaCertificate"));
			tunnelOptions.setRole(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].Role"));
			tunnelOptions.setTunnelId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelId"));
			tunnelOptions.setTunnelIndex(_ctx.integerValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIndex"));
			tunnelOptions.setState(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].State"));

			TunnelBgpConfig tunnelBgpConfig = new TunnelBgpConfig();
			tunnelBgpConfig.setLocalAsn(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.LocalAsn"));
			tunnelBgpConfig.setLocalBgpIp(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.LocalBgpIp"));
			tunnelBgpConfig.setPeerAsn(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.PeerAsn"));
			tunnelBgpConfig.setPeerBgpIp(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.PeerBgpIp"));
			tunnelBgpConfig.setTunnelCidr(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.TunnelCidr"));
			tunnelOptions.setTunnelBgpConfig(tunnelBgpConfig);

			TunnelIkeConfig tunnelIkeConfig = new TunnelIkeConfig();
			tunnelIkeConfig.setIkeAuthAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeAuthAlg"));
			tunnelIkeConfig.setIkeEncAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeEncAlg"));
			tunnelIkeConfig.setIkeLifetime(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeLifetime"));
			tunnelIkeConfig.setIkeMode(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeMode"));
			tunnelIkeConfig.setIkePfs(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkePfs"));
			tunnelIkeConfig.setIkeVersion(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeVersion"));
			tunnelIkeConfig.setLocalId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.LocalId"));
			tunnelIkeConfig.setPsk(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.Psk"));
			tunnelIkeConfig.setRemoteId(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.RemoteId"));
			tunnelOptions.setTunnelIkeConfig(tunnelIkeConfig);

			TunnelIpsecConfig tunnelIpsecConfig = new TunnelIpsecConfig();
			tunnelIpsecConfig.setIpsecAuthAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecAuthAlg"));
			tunnelIpsecConfig.setIpsecEncAlg(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecEncAlg"));
			tunnelIpsecConfig.setIpsecLifetime(_ctx.longValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecLifetime"));
			tunnelIpsecConfig.setIpsecPfs(_ctx.stringValue("ModifyVpnAttachmentAttributeResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecPfs"));
			tunnelOptions.setTunnelIpsecConfig(tunnelIpsecConfig);

			tunnelOptionsSpecification.add(tunnelOptions);
		}
		modifyVpnAttachmentAttributeResponse.setTunnelOptionsSpecification(tunnelOptionsSpecification);
	 
	 	return modifyVpnAttachmentAttributeResponse;
	}
}