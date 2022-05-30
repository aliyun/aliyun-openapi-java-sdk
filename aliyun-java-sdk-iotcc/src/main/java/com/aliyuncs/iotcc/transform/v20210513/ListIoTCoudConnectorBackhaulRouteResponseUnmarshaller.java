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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListIoTCoudConnectorBackhaulRouteResponse;
import com.aliyuncs.iotcc.model.v20210513.ListIoTCoudConnectorBackhaulRouteResponse.RouteEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIoTCoudConnectorBackhaulRouteResponseUnmarshaller {

	public static ListIoTCoudConnectorBackhaulRouteResponse unmarshall(ListIoTCoudConnectorBackhaulRouteResponse listIoTCoudConnectorBackhaulRouteResponse, UnmarshallerContext _ctx) {
		
		listIoTCoudConnectorBackhaulRouteResponse.setRequestId(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.RequestId"));
		listIoTCoudConnectorBackhaulRouteResponse.setTotalCount(_ctx.integerValue("ListIoTCoudConnectorBackhaulRouteResponse.TotalCount"));
		listIoTCoudConnectorBackhaulRouteResponse.setNextToken(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.NextToken"));
		listIoTCoudConnectorBackhaulRouteResponse.setMaxResults(_ctx.integerValue("ListIoTCoudConnectorBackhaulRouteResponse.MaxResults"));

		List<RouteEntry> routes = new ArrayList<RouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListIoTCoudConnectorBackhaulRouteResponse.Routes.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setDestinationCidrBlock(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.Routes["+ i +"].DestinationCidrBlock"));
			routeEntry.setNextHopId(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.Routes["+ i +"].NextHopId"));
			routeEntry.setNextHopType(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.Routes["+ i +"].NextHopType"));
			routeEntry.setStatus(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.Routes["+ i +"].Status"));
			routeEntry.setDescription(_ctx.stringValue("ListIoTCoudConnectorBackhaulRouteResponse.Routes["+ i +"].Description"));

			routes.add(routeEntry);
		}
		listIoTCoudConnectorBackhaulRouteResponse.setRoutes(routes);
	 
	 	return listIoTCoudConnectorBackhaulRouteResponse;
	}
}