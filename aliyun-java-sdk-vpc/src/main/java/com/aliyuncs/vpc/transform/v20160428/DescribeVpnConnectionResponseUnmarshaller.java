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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.Tag;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.TunnelOptions;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.TunnelOptions.TunnelBgpConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.TunnelOptions.TunnelIkeConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.TunnelOptions.TunnelIpsecConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.VcoHealthCheck;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.VpnBgpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnConnectionResponseUnmarshaller {

	public static DescribeVpnConnectionResponse unmarshall(DescribeVpnConnectionResponse describeVpnConnectionResponse, UnmarshallerContext _ctx) {
		
		describeVpnConnectionResponse.setRequestId(_ctx.stringValue("DescribeVpnConnectionResponse.RequestId"));
		describeVpnConnectionResponse.setStatus(_ctx.stringValue("DescribeVpnConnectionResponse.Status"));
		describeVpnConnectionResponse.setRemoteCaCertificate(_ctx.stringValue("DescribeVpnConnectionResponse.RemoteCaCertificate"));
		describeVpnConnectionResponse.setEnableNatTraversal(_ctx.booleanValue("DescribeVpnConnectionResponse.EnableNatTraversal"));
		describeVpnConnectionResponse.setCreateTime(_ctx.longValue("DescribeVpnConnectionResponse.CreateTime"));
		describeVpnConnectionResponse.setEffectImmediately(_ctx.booleanValue("DescribeVpnConnectionResponse.EffectImmediately"));
		describeVpnConnectionResponse.setVpnGatewayId(_ctx.stringValue("DescribeVpnConnectionResponse.VpnGatewayId"));
		describeVpnConnectionResponse.setLocalSubnet(_ctx.stringValue("DescribeVpnConnectionResponse.LocalSubnet"));
		describeVpnConnectionResponse.setVpnConnectionId(_ctx.stringValue("DescribeVpnConnectionResponse.VpnConnectionId"));
		describeVpnConnectionResponse.setRemoteSubnet(_ctx.stringValue("DescribeVpnConnectionResponse.RemoteSubnet"));
		describeVpnConnectionResponse.setCustomerGatewayId(_ctx.stringValue("DescribeVpnConnectionResponse.CustomerGatewayId"));
		describeVpnConnectionResponse.setName(_ctx.stringValue("DescribeVpnConnectionResponse.Name"));
		describeVpnConnectionResponse.setEnableDpd(_ctx.booleanValue("DescribeVpnConnectionResponse.EnableDpd"));
		describeVpnConnectionResponse.setAttachType(_ctx.stringValue("DescribeVpnConnectionResponse.AttachType"));
		describeVpnConnectionResponse.setNetworkType(_ctx.stringValue("DescribeVpnConnectionResponse.NetworkType"));
		describeVpnConnectionResponse.setAttachInstanceId(_ctx.stringValue("DescribeVpnConnectionResponse.AttachInstanceId"));
		describeVpnConnectionResponse.setSpec(_ctx.stringValue("DescribeVpnConnectionResponse.Spec"));
		describeVpnConnectionResponse.setState(_ctx.stringValue("DescribeVpnConnectionResponse.State"));
		describeVpnConnectionResponse.setZoneNo(_ctx.stringValue("DescribeVpnConnectionResponse.ZoneNo"));
		describeVpnConnectionResponse.setInternetIp(_ctx.stringValue("DescribeVpnConnectionResponse.InternetIp"));
		describeVpnConnectionResponse.setTransitRouterId(_ctx.stringValue("DescribeVpnConnectionResponse.TransitRouterId"));
		describeVpnConnectionResponse.setTransitRouterName(_ctx.stringValue("DescribeVpnConnectionResponse.TransitRouterName"));
		describeVpnConnectionResponse.setCrossAccountAuthorized(_ctx.booleanValue("DescribeVpnConnectionResponse.CrossAccountAuthorized"));
		describeVpnConnectionResponse.setEnableTunnelsBgp(_ctx.booleanValue("DescribeVpnConnectionResponse.EnableTunnelsBgp"));
		describeVpnConnectionResponse.setResourceGroupId(_ctx.stringValue("DescribeVpnConnectionResponse.ResourceGroupId"));
		describeVpnConnectionResponse.setTunnelBandwidth(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelBandwidth"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setRemoteId(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.RemoteId"));
		ikeConfig.setIkeLifetime(_ctx.longValue("DescribeVpnConnectionResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setIkeEncAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setLocalId(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.LocalId"));
		ikeConfig.setIkeMode(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeVersion(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkePfs(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkePfs"));
		ikeConfig.setPsk(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.Psk"));
		ikeConfig.setIkeAuthAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeAuthAlg"));
		describeVpnConnectionResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecLifetime(_ctx.longValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecLifetime"));
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecPfs"));
		describeVpnConnectionResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setStatus(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Status"));
		vcoHealthCheck.setDip(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(_ctx.integerValue("DescribeVpnConnectionResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(_ctx.integerValue("DescribeVpnConnectionResponse.VcoHealthCheck.Retry"));
		vcoHealthCheck.setSip(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setEnable(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Enable"));
		vcoHealthCheck.setPolicy(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Policy"));
		describeVpnConnectionResponse.setVcoHealthCheck(vcoHealthCheck);

		VpnBgpConfig vpnBgpConfig = new VpnBgpConfig();
		vpnBgpConfig.setStatus(_ctx.stringValue("DescribeVpnConnectionResponse.VpnBgpConfig.Status"));
		vpnBgpConfig.setPeerBgpIp(_ctx.stringValue("DescribeVpnConnectionResponse.VpnBgpConfig.PeerBgpIp"));
		vpnBgpConfig.setTunnelCidr(_ctx.stringValue("DescribeVpnConnectionResponse.VpnBgpConfig.TunnelCidr"));
		vpnBgpConfig.setEnableBgp(_ctx.stringValue("DescribeVpnConnectionResponse.VpnBgpConfig.EnableBgp"));
		vpnBgpConfig.setLocalBgpIp(_ctx.stringValue("DescribeVpnConnectionResponse.VpnBgpConfig.LocalBgpIp"));
		vpnBgpConfig.setPeerAsn(_ctx.longValue("DescribeVpnConnectionResponse.VpnBgpConfig.PeerAsn"));
		vpnBgpConfig.setLocalAsn(_ctx.longValue("DescribeVpnConnectionResponse.VpnBgpConfig.LocalAsn"));
		vpnBgpConfig.setAuthKey(_ctx.stringValue("DescribeVpnConnectionResponse.VpnBgpConfig.AuthKey"));
		describeVpnConnectionResponse.setVpnBgpConfig(vpnBgpConfig);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnConnectionResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeVpnConnectionResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeVpnConnectionResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeVpnConnectionResponse.setTags(tags);

		List<TunnelOptions> tunnelOptionsSpecification = new ArrayList<TunnelOptions>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification.Length"); i++) {
			TunnelOptions tunnelOptions = new TunnelOptions();
			tunnelOptions.setTunnelId(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelId"));
			tunnelOptions.setCustomerGatewayId(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].CustomerGatewayId"));
			tunnelOptions.setEnableDpd(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].EnableDpd"));
			tunnelOptions.setEnableNatTraversal(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].EnableNatTraversal"));
			tunnelOptions.setInternetIp(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].InternetIp"));
			tunnelOptions.setRemoteCaCertificate(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].RemoteCaCertificate"));
			tunnelOptions.setRole(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].Role"));
			tunnelOptions.setTunnelIndex(_ctx.integerValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIndex"));
			tunnelOptions.setState(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].State"));
			tunnelOptions.setStatus(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].Status"));
			tunnelOptions.setZoneNo(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].ZoneNo"));

			TunnelBgpConfig tunnelBgpConfig = new TunnelBgpConfig();
			tunnelBgpConfig.setBgpStatus(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.BgpStatus"));
			tunnelBgpConfig.setLocalAsn(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.LocalAsn"));
			tunnelBgpConfig.setLocalBgpIp(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.LocalBgpIp"));
			tunnelBgpConfig.setPeerAsn(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.PeerAsn"));
			tunnelBgpConfig.setPeerBgpIp(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.PeerBgpIp"));
			tunnelBgpConfig.setTunnelCidr(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelBgpConfig.TunnelCidr"));
			tunnelOptions.setTunnelBgpConfig(tunnelBgpConfig);

			TunnelIkeConfig tunnelIkeConfig = new TunnelIkeConfig();
			tunnelIkeConfig.setIkeAuthAlg(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeAuthAlg"));
			tunnelIkeConfig.setIkeEncAlg(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeEncAlg"));
			tunnelIkeConfig.setIkeLifetime(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeLifetime"));
			tunnelIkeConfig.setIkeMode(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeMode"));
			tunnelIkeConfig.setIkePfs(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkePfs"));
			tunnelIkeConfig.setIkeVersion(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.IkeVersion"));
			tunnelIkeConfig.setLocalId(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.LocalId"));
			tunnelIkeConfig.setPsk(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.Psk"));
			tunnelIkeConfig.setRemoteId(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIkeConfig.RemoteId"));
			tunnelOptions.setTunnelIkeConfig(tunnelIkeConfig);

			TunnelIpsecConfig tunnelIpsecConfig = new TunnelIpsecConfig();
			tunnelIpsecConfig.setIpsecAuthAlg(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecAuthAlg"));
			tunnelIpsecConfig.setIpsecEncAlg(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecEncAlg"));
			tunnelIpsecConfig.setIpsecLifetime(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecLifetime"));
			tunnelIpsecConfig.setIpsecPfs(_ctx.stringValue("DescribeVpnConnectionResponse.TunnelOptionsSpecification["+ i +"].TunnelIpsecConfig.IpsecPfs"));
			tunnelOptions.setTunnelIpsecConfig(tunnelIpsecConfig);

			tunnelOptionsSpecification.add(tunnelOptions);
		}
		describeVpnConnectionResponse.setTunnelOptionsSpecification(tunnelOptionsSpecification);
	 
	 	return describeVpnConnectionResponse;
	}
}