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

	public static ModifyVpnConnectionAttributeResponse unmarshall(ModifyVpnConnectionAttributeResponse modifyVpnConnectionAttributeResponse, UnmarshallerContext context) {
		
		modifyVpnConnectionAttributeResponse.setRequestId(context.stringValue("ModifyVpnConnectionAttributeResponse.RequestId"));
		modifyVpnConnectionAttributeResponse.setVpnConnectionId(context.stringValue("ModifyVpnConnectionAttributeResponse.VpnConnectionId"));
		modifyVpnConnectionAttributeResponse.setCustomerGatewayId(context.stringValue("ModifyVpnConnectionAttributeResponse.CustomerGatewayId"));
		modifyVpnConnectionAttributeResponse.setVpnGatewayId(context.stringValue("ModifyVpnConnectionAttributeResponse.VpnGatewayId"));
		modifyVpnConnectionAttributeResponse.setName(context.stringValue("ModifyVpnConnectionAttributeResponse.Name"));
		modifyVpnConnectionAttributeResponse.setDescription(context.stringValue("ModifyVpnConnectionAttributeResponse.Description"));
		modifyVpnConnectionAttributeResponse.setLocalSubnet(context.stringValue("ModifyVpnConnectionAttributeResponse.LocalSubnet"));
		modifyVpnConnectionAttributeResponse.setRemoteSubnet(context.stringValue("ModifyVpnConnectionAttributeResponse.RemoteSubnet"));
		modifyVpnConnectionAttributeResponse.setCreateTime(context.longValue("ModifyVpnConnectionAttributeResponse.CreateTime"));
		modifyVpnConnectionAttributeResponse.setEffectImmediately(context.booleanValue("ModifyVpnConnectionAttributeResponse.EffectImmediately"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setPsk(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.Psk"));
		ikeConfig.setIkeVersion(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkeMode(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeEncAlg(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setIkeAuthAlg(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeAuthAlg"));
		ikeConfig.setIkePfs(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkePfs"));
		ikeConfig.setIkeLifetime(context.longValue("ModifyVpnConnectionAttributeResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setLocalId(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.LocalId"));
		ikeConfig.setRemoteId(context.stringValue("ModifyVpnConnectionAttributeResponse.IkeConfig.RemoteId"));
		modifyVpnConnectionAttributeResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecEncAlg(context.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecAuthAlg(context.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecPfs(context.stringValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecPfs"));
		ipsecConfig.setIpsecLifetime(context.longValue("ModifyVpnConnectionAttributeResponse.IpsecConfig.IpsecLifetime"));
		modifyVpnConnectionAttributeResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setEnable(context.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Enable"));
		vcoHealthCheck.setSip(context.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setDip(context.stringValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(context.integerValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(context.integerValue("ModifyVpnConnectionAttributeResponse.VcoHealthCheck.Retry"));
		modifyVpnConnectionAttributeResponse.setVcoHealthCheck(vcoHealthCheck);
	 
	 	return modifyVpnConnectionAttributeResponse;
	}
}