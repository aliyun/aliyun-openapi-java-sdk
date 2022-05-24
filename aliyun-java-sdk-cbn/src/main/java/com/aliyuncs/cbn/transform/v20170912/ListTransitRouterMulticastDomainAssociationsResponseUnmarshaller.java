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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainAssociationsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterMulticastDomainAssociationsResponseUnmarshaller {

	public static ListTransitRouterMulticastDomainAssociationsResponse unmarshall(ListTransitRouterMulticastDomainAssociationsResponse listTransitRouterMulticastDomainAssociationsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterMulticastDomainAssociationsResponse.setRequestId(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.RequestId"));
		listTransitRouterMulticastDomainAssociationsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterMulticastDomainAssociationsResponse.TotalCount"));
		listTransitRouterMulticastDomainAssociationsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterMulticastDomainAssociationsResponse.MaxResults"));
		listTransitRouterMulticastDomainAssociationsResponse.setNextToken(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.NextToken"));

		List<TransitRouterMulticastAssociation> transitRouterMulticastAssociations = new ArrayList<TransitRouterMulticastAssociation>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations.Length"); i++) {
			TransitRouterMulticastAssociation transitRouterMulticastAssociation = new TransitRouterMulticastAssociation();
			transitRouterMulticastAssociation.setTransitRouterMulticastDomainId(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].TransitRouterMulticastDomainId"));
			transitRouterMulticastAssociation.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].TransitRouterAttachmentId"));
			transitRouterMulticastAssociation.setVSwitchId(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].VSwitchId"));
			transitRouterMulticastAssociation.setStatus(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].Status"));
			transitRouterMulticastAssociation.setResourceType(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].ResourceType"));
			transitRouterMulticastAssociation.setResourceOwnerId(_ctx.longValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].ResourceOwnerId"));
			transitRouterMulticastAssociation.setResourceId(_ctx.stringValue("ListTransitRouterMulticastDomainAssociationsResponse.TransitRouterMulticastAssociations["+ i +"].ResourceId"));

			transitRouterMulticastAssociations.add(transitRouterMulticastAssociation);
		}
		listTransitRouterMulticastDomainAssociationsResponse.setTransitRouterMulticastAssociations(transitRouterMulticastAssociations);
	 
	 	return listTransitRouterMulticastDomainAssociationsResponse;
	}
}