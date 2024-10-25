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

import com.aliyuncs.vpc.model.v20160428.ModifyTunnelAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.ModifyTunnelAttributeResponse.TunnelBgpConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyTunnelAttributeResponse.TunnelIkeConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyTunnelAttributeResponse.TunnelIpsecConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTunnelAttributeResponseUnmarshaller {

	public static ModifyTunnelAttributeResponse unmarshall(ModifyTunnelAttributeResponse modifyTunnelAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyTunnelAttributeResponse.setRequestId(_ctx.stringValue("ModifyTunnelAttributeResponse.RequestId"));
		modifyTunnelAttributeResponse.setTunnelId(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelId"));
		modifyTunnelAttributeResponse.setEnableNatTraversal(_ctx.booleanValue("ModifyTunnelAttributeResponse.EnableNatTraversal"));
		modifyTunnelAttributeResponse.setEnableDpd(_ctx.booleanValue("ModifyTunnelAttributeResponse.EnableDpd"));
		modifyTunnelAttributeResponse.setRemoteCaCertificate(_ctx.stringValue("ModifyTunnelAttributeResponse.RemoteCaCertificate"));
		modifyTunnelAttributeResponse.setCustomerGatewayId(_ctx.stringValue("ModifyTunnelAttributeResponse.CustomerGatewayId"));
		modifyTunnelAttributeResponse.setRole(_ctx.stringValue("ModifyTunnelAttributeResponse.Role"));
		modifyTunnelAttributeResponse.setZoneNo(_ctx.stringValue("ModifyTunnelAttributeResponse.ZoneNo"));
		modifyTunnelAttributeResponse.setInternetIp(_ctx.stringValue("ModifyTunnelAttributeResponse.InternetIp"));
		modifyTunnelAttributeResponse.setState(_ctx.stringValue("ModifyTunnelAttributeResponse.State"));

		TunnelIkeConfig tunnelIkeConfig = new TunnelIkeConfig();
		tunnelIkeConfig.setIkeAuthAlg(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.IkeAuthAlg"));
		tunnelIkeConfig.setIkeEncAlg(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.IkeEncAlg"));
		tunnelIkeConfig.setIkeLifetime(_ctx.longValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.IkeLifetime"));
		tunnelIkeConfig.setIkeMode(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.IkeMode"));
		tunnelIkeConfig.setIkePfs(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.IkePfs"));
		tunnelIkeConfig.setIkeVersion(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.IkeVersion"));
		tunnelIkeConfig.setLocalId(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.LocalId"));
		tunnelIkeConfig.setPsk(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.Psk"));
		tunnelIkeConfig.setRemoteId(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIkeConfig.RemoteId"));
		modifyTunnelAttributeResponse.setTunnelIkeConfig(tunnelIkeConfig);

		TunnelIpsecConfig tunnelIpsecConfig = new TunnelIpsecConfig();
		tunnelIpsecConfig.setIpsecAuthAlg(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIpsecConfig.IpsecAuthAlg"));
		tunnelIpsecConfig.setIpsecEncAlg(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIpsecConfig.IpsecEncAlg"));
		tunnelIpsecConfig.setIpsecLifetime(_ctx.longValue("ModifyTunnelAttributeResponse.TunnelIpsecConfig.IpsecLifetime"));
		tunnelIpsecConfig.setIpsecPfs(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelIpsecConfig.IpsecPfs"));
		modifyTunnelAttributeResponse.setTunnelIpsecConfig(tunnelIpsecConfig);

		TunnelBgpConfig tunnelBgpConfig = new TunnelBgpConfig();
		tunnelBgpConfig.setEnableBgp(_ctx.booleanValue("ModifyTunnelAttributeResponse.TunnelBgpConfig.EnableBgp"));
		tunnelBgpConfig.setLocalAsn(_ctx.longValue("ModifyTunnelAttributeResponse.TunnelBgpConfig.LocalAsn"));
		tunnelBgpConfig.setLocalBgpIp(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelBgpConfig.LocalBgpIp"));
		tunnelBgpConfig.setPeerAsn(_ctx.longValue("ModifyTunnelAttributeResponse.TunnelBgpConfig.PeerAsn"));
		tunnelBgpConfig.setPeerBgpIp(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelBgpConfig.PeerBgpIp"));
		tunnelBgpConfig.setTunnelCidr(_ctx.stringValue("ModifyTunnelAttributeResponse.TunnelBgpConfig.TunnelCidr"));
		modifyTunnelAttributeResponse.setTunnelBgpConfig(tunnelBgpConfig);
	 
	 	return modifyTunnelAttributeResponse;
	}
}