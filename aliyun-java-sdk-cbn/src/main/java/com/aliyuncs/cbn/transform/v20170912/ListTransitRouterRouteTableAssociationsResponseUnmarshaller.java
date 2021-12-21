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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteTableAssociationsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterRouteTableAssociationsResponseUnmarshaller {

	public static ListTransitRouterRouteTableAssociationsResponse unmarshall(ListTransitRouterRouteTableAssociationsResponse listTransitRouterRouteTableAssociationsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterRouteTableAssociationsResponse.setRequestId(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.RequestId"));
		listTransitRouterRouteTableAssociationsResponse.setNextToken(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.NextToken"));
		listTransitRouterRouteTableAssociationsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterRouteTableAssociationsResponse.TotalCount"));
		listTransitRouterRouteTableAssociationsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterRouteTableAssociationsResponse.MaxResults"));

		List<TransitRouterAssociation> transitRouterAssociations = new ArrayList<TransitRouterAssociation>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociations.Length"); i++) {
			TransitRouterAssociation transitRouterAssociation = new TransitRouterAssociation();
			transitRouterAssociation.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociations["+ i +"].TransitRouterAttachmentId"));
			transitRouterAssociation.setStatus(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociations["+ i +"].Status"));
			transitRouterAssociation.setResourceType(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociations["+ i +"].ResourceType"));
			transitRouterAssociation.setResourceId(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociations["+ i +"].ResourceId"));
			transitRouterAssociation.setTransitRouterRouteTableId(_ctx.stringValue("ListTransitRouterRouteTableAssociationsResponse.TransitRouterAssociations["+ i +"].TransitRouterRouteTableId"));

			transitRouterAssociations.add(transitRouterAssociation);
		}
		listTransitRouterRouteTableAssociationsResponse.setTransitRouterAssociations(transitRouterAssociations);
	 
	 	return listTransitRouterRouteTableAssociationsResponse;
	}
}