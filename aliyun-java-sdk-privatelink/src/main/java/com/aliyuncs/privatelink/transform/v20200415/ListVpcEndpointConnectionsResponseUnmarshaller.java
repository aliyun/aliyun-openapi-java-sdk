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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointConnectionsResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointConnectionsResponse.Connection;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointConnectionsResponse.Connection.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointConnectionsResponseUnmarshaller {

	public static ListVpcEndpointConnectionsResponse unmarshall(ListVpcEndpointConnectionsResponse listVpcEndpointConnectionsResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointConnectionsResponse.setRequestId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.RequestId"));
		listVpcEndpointConnectionsResponse.setNextToken(_ctx.stringValue("ListVpcEndpointConnectionsResponse.NextToken"));
		listVpcEndpointConnectionsResponse.setMaxResults(_ctx.integerValue("ListVpcEndpointConnectionsResponse.MaxResults"));

		List<Connection> connections = new ArrayList<Connection>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointConnectionsResponse.Connections.Length"); i++) {
			Connection connection = new Connection();
			connection.setResourceOwner(_ctx.booleanValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ResourceOwner"));
			connection.setModifiedTime(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ModifiedTime"));
			connection.setBandwidth(_ctx.integerValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Bandwidth"));
			connection.setEndpointOwnerId(_ctx.longValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].EndpointOwnerId"));
			connection.setServiceId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ServiceId"));
			connection.setConnectionStatus(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ConnectionStatus"));
			connection.setEndpointId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].EndpointId"));
			connection.setEndpointVpcId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].EndpointVpcId"));
			connection.setResourceGroupId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ResourceGroupId"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setVSwitchId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].VSwitchId"));
				zone.setZoneId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ZoneId"));
				zone.setResourceId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ResourceId"));
				zone.setEniId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].EniId"));
				zone.setZoneDomain(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ZoneDomain"));
				zone.setZoneStatus(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ZoneStatus"));
				zone.setReplacedResourceId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ReplacedResourceId"));
				zone.setReplacedEniId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ReplacedEniId"));
				zone.setStatusInfo(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].StatusInfo"));
				zone.setConnectionId(_ctx.longValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ConnectionId"));
				zone.setConnectionStringId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ConnectionStringId"));

				zones.add(zone);
			}
			connection.setZones(zones);

			connections.add(connection);
		}
		listVpcEndpointConnectionsResponse.setConnections(connections);
	 
	 	return listVpcEndpointConnectionsResponse;
	}
}