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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionResponse.VcoHealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnConnectionResponseUnmarshaller {

	public static DescribeVpnConnectionResponse unmarshall(DescribeVpnConnectionResponse describeVpnConnectionResponse, UnmarshallerContext context) {
		
		describeVpnConnectionResponse.setRequestId(context.stringValue("DescribeVpnConnectionResponse.RequestId"));
		describeVpnConnectionResponse.setVpnConnectionId(context.stringValue("DescribeVpnConnectionResponse.VpnConnectionId"));
		describeVpnConnectionResponse.setCustomerGatewayId(context.stringValue("DescribeVpnConnectionResponse.CustomerGatewayId"));
		describeVpnConnectionResponse.setVpnGatewayId(context.stringValue("DescribeVpnConnectionResponse.VpnGatewayId"));
		describeVpnConnectionResponse.setName(context.stringValue("DescribeVpnConnectionResponse.Name"));
		describeVpnConnectionResponse.setLocalSubnet(context.stringValue("DescribeVpnConnectionResponse.LocalSubnet"));
		describeVpnConnectionResponse.setRemoteSubnet(context.stringValue("DescribeVpnConnectionResponse.RemoteSubnet"));
		describeVpnConnectionResponse.setCreateTime(context.longValue("DescribeVpnConnectionResponse.CreateTime"));
		describeVpnConnectionResponse.setEffectImmediately(context.booleanValue("DescribeVpnConnectionResponse.EffectImmediately"));
		describeVpnConnectionResponse.setStatus(context.stringValue("DescribeVpnConnectionResponse.Status"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setPsk(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.Psk"));
		ikeConfig.setIkeVersion(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkeMode(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeEncAlg(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setIkeAuthAlg(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeAuthAlg"));
		ikeConfig.setIkePfs(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkePfs"));
		ikeConfig.setIkeLifetime(context.longValue("DescribeVpnConnectionResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setLocalId(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.LocalId"));
		ikeConfig.setRemoteId(context.stringValue("DescribeVpnConnectionResponse.IkeConfig.RemoteId"));
		describeVpnConnectionResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecEncAlg(context.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecAuthAlg(context.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecPfs(context.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecPfs"));
		ipsecConfig.setIpsecLifetime(context.longValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecLifetime"));
		describeVpnConnectionResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setEnable(context.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Enable"));
		vcoHealthCheck.setSip(context.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setDip(context.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(context.integerValue("DescribeVpnConnectionResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(context.integerValue("DescribeVpnConnectionResponse.VcoHealthCheck.Retry"));
		vcoHealthCheck.setStatus(context.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Status"));
		describeVpnConnectionResponse.setVcoHealthCheck(vcoHealthCheck);
	 
	 	return describeVpnConnectionResponse;
	}
}