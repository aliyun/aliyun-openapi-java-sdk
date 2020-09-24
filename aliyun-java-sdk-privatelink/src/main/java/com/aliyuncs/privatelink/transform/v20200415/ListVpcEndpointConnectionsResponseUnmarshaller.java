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
		listVpcEndpointConnectionsResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointConnectionsResponse.MaxResults"));
		listVpcEndpointConnectionsResponse.setNextToken(_ctx.stringValue("ListVpcEndpointConnectionsResponse.NextToken"));

		List<Connection> connections = new ArrayList<Connection>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointConnectionsResponse.Connections.Length"); i++) {
			Connection connection = new Connection();
			connection.setServiceId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ServiceId"));
			connection.setEndpointId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].EndpointId"));
			connection.setEndpointOwnerId(_ctx.longValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].EndpointOwnerId"));
			connection.setConnectionStatus(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ConnectionStatus"));
			connection.setEndpointVpcId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].EndpointVpcId"));
			connection.setBandwidth(_ctx.integerValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Bandwidth"));
			connection.setModifiedTime(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].ModifiedTime"));

			List<Zone> zones = new ArrayList<Zone>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones.Length"); j++) {
				Zone zone = new Zone();
				zone.setZoneId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ZoneId"));
				zone.setEniId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].EniId"));
				zone.setZoneDomain(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ZoneDomain"));
				zone.setVSwitchId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].VSwitchId"));
				zone.setResourceId(_ctx.stringValue("ListVpcEndpointConnectionsResponse.Connections["+ i +"].Zones["+ j +"].ResourceId"));

				zones.add(zone);
			}
			connection.setZones(zones);

			connections.add(connection);
		}
		listVpcEndpointConnectionsResponse.setConnections(connections);
	 
	 	return listVpcEndpointConnectionsResponse;
	}
}