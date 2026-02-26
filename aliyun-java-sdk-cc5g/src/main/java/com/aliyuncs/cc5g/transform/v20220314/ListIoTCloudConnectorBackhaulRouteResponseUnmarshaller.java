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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListIoTCloudConnectorBackhaulRouteResponse;
import com.aliyuncs.cc5g.model.v20220314.ListIoTCloudConnectorBackhaulRouteResponse.RouteEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIoTCloudConnectorBackhaulRouteResponseUnmarshaller {

	public static ListIoTCloudConnectorBackhaulRouteResponse unmarshall(ListIoTCloudConnectorBackhaulRouteResponse listIoTCloudConnectorBackhaulRouteResponse, UnmarshallerContext _ctx) {
		
		listIoTCloudConnectorBackhaulRouteResponse.setRequestId(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.RequestId"));
		listIoTCloudConnectorBackhaulRouteResponse.setNetLinkId(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.NetLinkId"));

		List<RouteEntry> routes = new ArrayList<RouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListIoTCloudConnectorBackhaulRouteResponse.Routes.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setDestinationCidrBlock(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.Routes["+ i +"].DestinationCidrBlock"));
			routeEntry.setNextHopId(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.Routes["+ i +"].NextHopId"));
			routeEntry.setNextHopType(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.Routes["+ i +"].NextHopType"));
			routeEntry.setDescription(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.Routes["+ i +"].Description"));
			routeEntry.setStatus(_ctx.stringValue("ListIoTCloudConnectorBackhaulRouteResponse.Routes["+ i +"].Status"));

			routes.add(routeEntry);
		}
		listIoTCloudConnectorBackhaulRouteResponse.setRoutes(routes);
	 
	 	return listIoTCloudConnectorBackhaulRouteResponse;
	}
}