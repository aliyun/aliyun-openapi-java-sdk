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

	public static DescribeVpnConnectionResponse unmarshall(DescribeVpnConnectionResponse describeVpnConnectionResponse, UnmarshallerContext _ctx) {
		
		describeVpnConnectionResponse.setRequestId(_ctx.stringValue("DescribeVpnConnectionResponse.RequestId"));
		describeVpnConnectionResponse.setVpnConnectionId(_ctx.stringValue("DescribeVpnConnectionResponse.VpnConnectionId"));
		describeVpnConnectionResponse.setCustomerGatewayId(_ctx.stringValue("DescribeVpnConnectionResponse.CustomerGatewayId"));
		describeVpnConnectionResponse.setVpnGatewayId(_ctx.stringValue("DescribeVpnConnectionResponse.VpnGatewayId"));
		describeVpnConnectionResponse.setName(_ctx.stringValue("DescribeVpnConnectionResponse.Name"));
		describeVpnConnectionResponse.setLocalSubnet(_ctx.stringValue("DescribeVpnConnectionResponse.LocalSubnet"));
		describeVpnConnectionResponse.setRemoteSubnet(_ctx.stringValue("DescribeVpnConnectionResponse.RemoteSubnet"));
		describeVpnConnectionResponse.setCreateTime(_ctx.longValue("DescribeVpnConnectionResponse.CreateTime"));
		describeVpnConnectionResponse.setEffectImmediately(_ctx.booleanValue("DescribeVpnConnectionResponse.EffectImmediately"));
		describeVpnConnectionResponse.setStatus(_ctx.stringValue("DescribeVpnConnectionResponse.Status"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setPsk(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.Psk"));
		ikeConfig.setIkeVersion(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeVersion"));
		ikeConfig.setIkeMode(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeMode"));
		ikeConfig.setIkeEncAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeEncAlg"));
		ikeConfig.setIkeAuthAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkeAuthAlg"));
		ikeConfig.setIkePfs(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.IkePfs"));
		ikeConfig.setIkeLifetime(_ctx.longValue("DescribeVpnConnectionResponse.IkeConfig.IkeLifetime"));
		ikeConfig.setLocalId(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.LocalId"));
		ikeConfig.setRemoteId(_ctx.stringValue("DescribeVpnConnectionResponse.IkeConfig.RemoteId"));
		describeVpnConnectionResponse.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecPfs"));
		ipsecConfig.setIpsecLifetime(_ctx.longValue("DescribeVpnConnectionResponse.IpsecConfig.IpsecLifetime"));
		describeVpnConnectionResponse.setIpsecConfig(ipsecConfig);

		VcoHealthCheck vcoHealthCheck = new VcoHealthCheck();
		vcoHealthCheck.setEnable(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Enable"));
		vcoHealthCheck.setSip(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Sip"));
		vcoHealthCheck.setDip(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Dip"));
		vcoHealthCheck.setInterval(_ctx.integerValue("DescribeVpnConnectionResponse.VcoHealthCheck.Interval"));
		vcoHealthCheck.setRetry(_ctx.integerValue("DescribeVpnConnectionResponse.VcoHealthCheck.Retry"));
		vcoHealthCheck.setStatus(_ctx.stringValue("DescribeVpnConnectionResponse.VcoHealthCheck.Status"));
		describeVpnConnectionResponse.setVcoHealthCheck(vcoHealthCheck);
	 
	 	return describeVpnConnectionResponse;
	}
}