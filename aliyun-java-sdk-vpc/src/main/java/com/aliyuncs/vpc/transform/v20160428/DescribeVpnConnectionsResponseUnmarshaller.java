/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnConnectionsResponse.VpnConnection.IpsecConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnConnectionsResponseUnmarshaller {

	public static DescribeVpnConnectionsResponse unmarshall(DescribeVpnConnectionsResponse describeVpnConnectionsResponse, UnmarshallerContext context) {
		
		describeVpnConnectionsResponse.setRequestId(context.stringValue("DescribeVpnConnectionsResponse.RequestId"));
		describeVpnConnectionsResponse.setTotalCount(context.integerValue("DescribeVpnConnectionsResponse.TotalCount"));
		describeVpnConnectionsResponse.setPageNumber(context.integerValue("DescribeVpnConnectionsResponse.PageNumber"));
		describeVpnConnectionsResponse.setPageSize(context.integerValue("DescribeVpnConnectionsResponse.PageSize"));

		List<VpnConnection> vpnConnections = new ArrayList<VpnConnection>();
		for (int i = 0; i < context.lengthValue("DescribeVpnConnectionsResponse.VpnConnections.Length"); i++) {
			VpnConnection vpnConnection = new VpnConnection();
			vpnConnection.setVpnConnectionId(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnConnectionId"));
			vpnConnection.setCustomerGatewayId(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].CustomerGatewayId"));
			vpnConnection.setVpnGatewayId(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].VpnGatewayId"));
			vpnConnection.setName(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].Name"));
			vpnConnection.setDescription(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].Description"));
			vpnConnection.setLocalSubnet(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].LocalSubnet"));
			vpnConnection.setRemoteSubnet(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].RemoteSubnet"));
			vpnConnection.setCreateTime(context.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].CreateTime"));
			vpnConnection.setEffectImmediately(context.booleanValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].EffectImmediately"));
			vpnConnection.setStatus(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].Status"));

			IkeConfig ikeConfig = new IkeConfig();
			ikeConfig.setPsk(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.Psk"));
			ikeConfig.setIkeVersion(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeVersion"));
			ikeConfig.setIkeMode(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeMode"));
			ikeConfig.setIkeEncAlg(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeEncAlg"));
			ikeConfig.setIkeAuthAlg(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeAuthAlg"));
			ikeConfig.setIkePfs(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkePfs"));
			ikeConfig.setIkeLifetime(context.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.IkeLifetime"));
			ikeConfig.setLocalId(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.LocalId"));
			ikeConfig.setRemoteId(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IkeConfig.RemoteId"));
			vpnConnection.setIkeConfig(ikeConfig);

			IpsecConfig ipsecConfig = new IpsecConfig();
			ipsecConfig.setIpsecEncAlg(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecEncAlg"));
			ipsecConfig.setIpsecAuthAlg(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecAuthAlg"));
			ipsecConfig.setIpsecPfs(context.stringValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecPfs"));
			ipsecConfig.setIpsecLifetime(context.longValue("DescribeVpnConnectionsResponse.VpnConnections["+ i +"].IpsecConfig.IpsecLifetime"));
			vpnConnection.setIpsecConfig(ipsecConfig);

			vpnConnections.add(vpnConnection);
		}
		describeVpnConnectionsResponse.setVpnConnections(vpnConnections);
	 
	 	return describeVpnConnectionsResponse;
	}
}