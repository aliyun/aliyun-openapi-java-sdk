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

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteEntriesResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterRouteEntriesResponseUnmarshaller {

	public static ListTransitRouterRouteEntriesResponse unmarshall(ListTransitRouterRouteEntriesResponse listTransitRouterRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterRouteEntriesResponse.setRequestId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.RequestId"));
		listTransitRouterRouteEntriesResponse.setMaxResults(_ctx.integerValue("ListTransitRouterRouteEntriesResponse.MaxResults"));
		listTransitRouterRouteEntriesResponse.setNextToken(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.NextToken"));
		listTransitRouterRouteEntriesResponse.setTotalCount(_ctx.integerValue("ListTransitRouterRouteEntriesResponse.TotalCount"));

		List<TransitRouterRouteEntry> transitRouterRouteEntries = new ArrayList<TransitRouterRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries.Length"); i++) {
			TransitRouterRouteEntry transitRouterRouteEntry = new TransitRouterRouteEntry();
			transitRouterRouteEntry.setTransitRouterRouteEntryDescription(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryDescription"));
			transitRouterRouteEntry.setTransitRouterRouteEntryDestinationCidrBlock(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryDestinationCidrBlock"));
			transitRouterRouteEntry.setTransitRouterRouteEntryId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryId"));
			transitRouterRouteEntry.setTransitRouterRouteEntryName(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryName"));
			transitRouterRouteEntry.setTransitRouterRouteEntryNextHopId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryNextHopId"));
			transitRouterRouteEntry.setTransitRouterRouteEntryNextHopType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryNextHopType"));
			transitRouterRouteEntry.setTransitRouterRouteEntryStatus(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryStatus"));
			transitRouterRouteEntry.setTransitRouterRouteEntryType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryType"));
			transitRouterRouteEntry.setCreateTime(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].CreateTime"));

			transitRouterRouteEntries.add(transitRouterRouteEntry);
		}
		listTransitRouterRouteEntriesResponse.setTransitRouterRouteEntries(transitRouterRouteEntries);
	 
	 	return listTransitRouterRouteEntriesResponse;
	}
}