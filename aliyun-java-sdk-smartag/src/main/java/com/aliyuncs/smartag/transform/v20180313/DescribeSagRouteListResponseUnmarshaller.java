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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagRouteListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagRouteListResponse.Route;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagRouteListResponseUnmarshaller {

	public static DescribeSagRouteListResponse unmarshall(DescribeSagRouteListResponse describeSagRouteListResponse, UnmarshallerContext _ctx) {
		
		describeSagRouteListResponse.setRequestId(_ctx.stringValue("DescribeSagRouteListResponse.RequestId"));

		List<Route> routes = new ArrayList<Route>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagRouteListResponse.Routes.Length"); i++) {
			Route route = new Route();
			route.setNextHop(_ctx.stringValue("DescribeSagRouteListResponse.Routes["+ i +"].NextHop"));
			route.setDestinationCidr(_ctx.stringValue("DescribeSagRouteListResponse.Routes["+ i +"].DestinationCidr"));
			route.setCost(_ctx.stringValue("DescribeSagRouteListResponse.Routes["+ i +"].Cost"));
			route.setPortName(_ctx.stringValue("DescribeSagRouteListResponse.Routes["+ i +"].PortName"));
			route.setRouteProtocol(_ctx.stringValue("DescribeSagRouteListResponse.Routes["+ i +"].RouteProtocol"));

			List<String> conflictCidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSagRouteListResponse.Routes["+ i +"].ConflictCidrs.Length"); j++) {
				conflictCidrs.add(_ctx.stringValue("DescribeSagRouteListResponse.Routes["+ i +"].ConflictCidrs["+ j +"]"));
			}
			route.setConflictCidrs(conflictCidrs);

			routes.add(route);
		}
		describeSagRouteListResponse.setRoutes(routes);
	 
	 	return describeSagRouteListResponse;
	}
}