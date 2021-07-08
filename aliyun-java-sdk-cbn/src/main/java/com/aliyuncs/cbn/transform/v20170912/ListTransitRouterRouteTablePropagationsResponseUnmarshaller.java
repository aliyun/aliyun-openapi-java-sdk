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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteTablePropagationsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterRouteTablePropagationsResponseUnmarshaller {

	public static ListTransitRouterRouteTablePropagationsResponse unmarshall(ListTransitRouterRouteTablePropagationsResponse listTransitRouterRouteTablePropagationsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterRouteTablePropagationsResponse.setRequestId(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.RequestId"));
		listTransitRouterRouteTablePropagationsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterRouteTablePropagationsResponse.TotalCount"));
		listTransitRouterRouteTablePropagationsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterRouteTablePropagationsResponse.MaxResults"));
		listTransitRouterRouteTablePropagationsResponse.setNextToken(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.NextToken"));

		List<TransitRouterPropagation> transitRouterPropagations = new ArrayList<TransitRouterPropagation>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagations.Length"); i++) {
			TransitRouterPropagation transitRouterPropagation = new TransitRouterPropagation();
			transitRouterPropagation.setStatus(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagations["+ i +"].Status"));
			transitRouterPropagation.setTransitRouterAttachmentId(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagations["+ i +"].TransitRouterAttachmentId"));
			transitRouterPropagation.setTransitRouterRouteTableId(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagations["+ i +"].TransitRouterRouteTableId"));
			transitRouterPropagation.setResourceId(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagations["+ i +"].ResourceId"));
			transitRouterPropagation.setResourceType(_ctx.stringValue("ListTransitRouterRouteTablePropagationsResponse.TransitRouterPropagations["+ i +"].ResourceType"));

			transitRouterPropagations.add(transitRouterPropagation);
		}
		listTransitRouterRouteTablePropagationsResponse.setTransitRouterPropagations(transitRouterPropagations);
	 
	 	return listTransitRouterRouteTablePropagationsResponse;
	}
}