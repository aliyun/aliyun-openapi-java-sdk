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

import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.ModifyVpnConnectionAttributeResponse.VcoHealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyVpnConnectionAttributeResponseUnmarshaller {

	public static ModifyVpnConnectionAttributeResponse unmarshall(ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyVpnConnectionAttributeResponse.setRequestId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.RequestId"));
		modifyVpnConnectionAttributeResponse.setVpnConnectionId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnConnectionId"));
		modifyVpnConnectionAttributeResponse.setCustomerGatewayId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.CustomerGatewayId"));
		modifyVpnConnectionAttributeResponse.setVpnGatewayId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VpnGatewayId"));
		modifyVpnConnectionAttributeResponse.setName(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.Name"));
		modifyVpnConnectionAttributeResponse.setDescription(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.Description"));
		modifyVpnConnectionAttributeResponse.setLocalSubnet(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.LocalSubnet"));
		modifyVpnConnectionAttributeResponse.setRemoteSubnet(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.RemoteSubnet"));
		modifyVpnConnectionAttributeResponse.setCreateTime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.CreateTime"));
		modifyVpnConnectionAttributeResponse.setEffectImmediately(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EffectImmediately"));
		modifyVpnConnectionAttributeResponse.setEnableDpd(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EnableDpd"));
		modifyVpnConnectionAttributeResponse.setEnableNatTraversal(_ctx.booleanValue("ModifyVpnConnectionAttributeResponse.EnableNatTraversal"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setPsk(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.Psk"));
		ikeConfig.setIkeVersion(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkeMode(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeEncAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setIkeAuthAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeAuthAlg"));
		ikeConfig.setIkePfs(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkePfs"));
		ikeConfig.setIkeLifetime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setLocalId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.LocalId"));
		ikeConfig.setRemoteId(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.RemoteId"));
		modifyVpnConnectionAttributeResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecPfs"));
		ipsecConfig.setIpsecLifetime(_ctx.longValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecLifetime"));
		modifyVpnConnectionAttributeResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setEnable(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Enable"));
		vcoHealthCheck.setSip(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setDip(_ctx.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(_ctx.integerValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(_ctx.integerValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Retry"));
		modifyVpnConnectionAttributeResponse.setVcoHealthCheck(vcoHealthCheck);
	 
	 	return modifyVpnConnectionAttributeResponse;
	}
}