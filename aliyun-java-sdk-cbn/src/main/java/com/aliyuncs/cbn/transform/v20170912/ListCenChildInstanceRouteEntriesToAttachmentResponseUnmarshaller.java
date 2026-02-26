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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListCenChildInstanceRouteEntriesToAttachmentResponse;
import com.aliyuncs.cbn.model.v20170912.ListCenChildInstanceRouteEntriesToAttachmentResponse.TransitRouterAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCenChildInstanceRouteEntriesToAttachmentResponseUnmarshaller {

	public static ListCenChildInstanceRouteEntriesToAttachmentResponse unmarshall(ListCenChildInstanceRouteEntriesToAttachmentResponse listCenChildInstanceRouteEntriesToAttachmentResponse, UnmarshallerContext _ctx) {
		
		listCenChildInstanceRouteEntriesToAttachmentResponse.setRequestId(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RequestId"));
		listCenChildInstanceRouteEntriesToAttachmentResponse.setNextToken(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.NextToken"));

		List<TransitRouterAssociation> routeEntry = new ArrayList<TransitRouterAssociation>();
		for (int i = 0; i < _ctx.lengthValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry.Length"); i++) {
			TransitRouterAssociation transitRouterAssociation = new TransitRouterAssociation();
			transitRouterAssociation.setCenId(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].CenId"));
			transitRouterAssociation.setTransitRouterAttachmentId(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].TransitRouterAttachmentId"));
			transitRouterAssociation.setStatus(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].Status"));
			transitRouterAssociation.setServiceType(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].ServiceType"));
			transitRouterAssociation.setDestinationCidrBlock(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].DestinationCidrBlock"));
			transitRouterAssociation.setChildInstanceRouteTableId(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].ChildInstanceRouteTableId"));
			transitRouterAssociation.setChildInstanceId(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].ChildInstanceId"));
			transitRouterAssociation.setChildInstanceRouteNextHopType(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].ChildInstanceRouteNextHopType"));
			transitRouterAssociation.setChildInstanceRouteNextHopInstanceId(_ctx.stringValue("ListCenChildInstanceRouteEntriesToAttachmentResponse.RouteEntry["+ i +"].ChildInstanceRouteNextHopInstanceId"));

			routeEntry.add(transitRouterAssociation);
		}
		listCenChildInstanceRouteEntriesToAttachmentResponse.setRouteEntry(routeEntry);
	 
	 	return listCenChildInstanceRouteEntriesToAttachmentResponse;
	}
}