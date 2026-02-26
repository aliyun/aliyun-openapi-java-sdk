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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterPrefixListAssociationResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterPrefixListAssociationResponse.PrefixList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterPrefixListAssociationResponseUnmarshaller {

	public static ListTransitRouterPrefixListAssociationResponse unmarshall(ListTransitRouterPrefixListAssociationResponse listTransitRouterPrefixListAssociationResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterPrefixListAssociationResponse.setRequestId(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.RequestId"));
		listTransitRouterPrefixListAssociationResponse.setTotalCount(_ctx.integerValue("ListTransitRouterPrefixListAssociationResponse.TotalCount"));
		listTransitRouterPrefixListAssociationResponse.setPageSize(_ctx.integerValue("ListTransitRouterPrefixListAssociationResponse.PageSize"));
		listTransitRouterPrefixListAssociationResponse.setPageNumber(_ctx.integerValue("ListTransitRouterPrefixListAssociationResponse.PageNumber"));

		List<PrefixList> prefixLists = new ArrayList<PrefixList>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists.Length"); i++) {
			PrefixList prefixList = new PrefixList();
			prefixList.setPrefixListId(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].PrefixListId"));
			prefixList.setOwnerUid(_ctx.longValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].OwnerUid"));
			prefixList.setStatus(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].Status"));
			prefixList.setNextHop(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].NextHop"));
			prefixList.setNextHopInstanceId(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].NextHopInstanceId"));
			prefixList.setNextHopType(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].NextHopType"));
			prefixList.setTransitRouterTableId(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].TransitRouterTableId"));
			prefixList.setTransitRouterId(_ctx.stringValue("ListTransitRouterPrefixListAssociationResponse.PrefixLists["+ i +"].TransitRouterId"));

			prefixLists.add(prefixList);
		}
		listTransitRouterPrefixListAssociationResponse.setPrefixLists(prefixLists);
	 
	 	return listTransitRouterPrefixListAssociationResponse;
	}
}