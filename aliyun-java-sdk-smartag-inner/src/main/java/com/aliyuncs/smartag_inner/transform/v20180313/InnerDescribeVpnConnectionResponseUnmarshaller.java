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

package com.aliyuncs.smartag_inner.transform.v20180313;

import com.aliyuncs.smartag_inner.model.v20180313.InnerDescribeVpnConnectionResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerDescribeVpnConnectionResponse.VpnConnnection;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeVpnConnectionResponseUnmarshaller {

	public static InnerDescribeVpnConnectionResponse unmarshall(InnerDescribeVpnConnectionResponse innerDescribeVpnConnectionResponse, UnmarshallerContext context) {
		
		innerDescribeVpnConnectionResponse.setRequestId(context.stringValue("InnerDescribeVpnConnectionResponse.RequestId"));

		VpnConnnection vpnConnnection = new VpnConnnection();
		vpnConnnection.setSmartAccessGatewayId(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.SmartAccessGatewayId"));
		vpnConnnection.setRouteTableId(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.RouteTableId"));
		vpnConnnection.setInBandwidth(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.InBandwidth"));
		vpnConnnection.setOutBandwidth(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.OutBandwidth"));
		vpnConnnection.setMasterAgwIp(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.MasterAgwIp"));
		vpnConnnection.setSlaveAgwIp(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.SlaveAgwIp"));
		vpnConnnection.setCurrentVersion(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.CurrentVersion"));
		vpnConnnection.setTargetVersion(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.TargetVersion"));
		vpnConnnection.setState(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.State"));
		vpnConnnection.setMasterAgwId(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.MasterAgwId"));
		vpnConnnection.setSlaveAgwId(context.stringValue("InnerDescribeVpnConnectionResponse.VpnConnnection.SlaveAgwId"));
		innerDescribeVpnConnectionResponse.setVpnConnnection(vpnConnnection);
	 
	 	return innerDescribeVpnConnectionResponse;
	}
}