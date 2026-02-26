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

import com.aliyuncs.vpc.model.v20160428.DiagnoseVpnConnectionsResponse;
import com.aliyuncs.vpc.model.v20160428.DiagnoseVpnConnectionsResponse.VpnConnection;
import com.aliyuncs.transform.UnmarshallerContext;


public class DiagnoseVpnConnectionsResponseUnmarshaller {

	public static DiagnoseVpnConnectionsResponse unmarshall(DiagnoseVpnConnectionsResponse diagnoseVpnConnectionsResponse, UnmarshallerContext _ctx) {
		
		diagnoseVpnConnectionsResponse.setRequestId(_ctx.stringValue("DiagnoseVpnConnectionsResponse.RequestId"));
		diagnoseVpnConnectionsResponse.setPageNumber(_ctx.integerValue("DiagnoseVpnConnectionsResponse.PageNumber"));
		diagnoseVpnConnectionsResponse.setPageSize(_ctx.integerValue("DiagnoseVpnConnectionsResponse.PageSize"));
		diagnoseVpnConnectionsResponse.setTotalCount(_ctx.integerValue("DiagnoseVpnConnectionsResponse.TotalCount"));

		List<VpnConnection> vpnConnections = new ArrayList<VpnConnection>();
		for (int i = 0; i < _ctx.lengthValue("DiagnoseVpnConnectionsResponse.VpnConnections.Length"); i++) {
			VpnConnection vpnConnection = new VpnConnection();
			vpnConnection.setMismatchRemoteParam(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].MismatchRemoteParam"));
			vpnConnection.setMismatchLocalParam(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].MismatchLocalParam"));
			vpnConnection.setVpnConnectionId(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].VpnConnectionId"));
			vpnConnection.setSourceLog(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].SourceLog"));
			vpnConnection.setFailedReasonCode(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].FailedReasonCode"));
			vpnConnection.setFailedTime(_ctx.longValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].FailedTime"));
			vpnConnection.setFailedReason(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].FailedReason"));
			vpnConnection.setSeverity(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].Severity"));
			vpnConnection.setTunnelId(_ctx.stringValue("DiagnoseVpnConnectionsResponse.VpnConnections["+ i +"].TunnelId"));

			vpnConnections.add(vpnConnection);
		}
		diagnoseVpnConnectionsResponse.setVpnConnections(vpnConnections);
	 
	 	return diagnoseVpnConnectionsResponse;
	}
}