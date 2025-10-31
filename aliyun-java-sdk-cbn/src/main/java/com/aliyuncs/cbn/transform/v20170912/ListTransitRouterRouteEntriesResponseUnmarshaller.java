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
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntry.PathAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterRouteEntriesResponseUnmarshaller {

	public static ListTransitRouterRouteEntriesResponse unmarshall(ListTransitRouterRouteEntriesResponse listTransitRouterRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterRouteEntriesResponse.setRequestId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.RequestId"));
		listTransitRouterRouteEntriesResponse.setNextToken(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.NextToken"));
		listTransitRouterRouteEntriesResponse.setTotalCount(_ctx.integerValue("ListTransitRouterRouteEntriesResponse.TotalCount"));
		listTransitRouterRouteEntriesResponse.setMaxResults(_ctx.integerValue("ListTransitRouterRouteEntriesResponse.MaxResults"));

		List<TransitRouterRouteEntry> transitRouterRouteEntries = new ArrayList<TransitRouterRouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries.Length"); i++) {
			TransitRouterRouteEntry transitRouterRouteEntry = new TransitRouterRouteEntry();
			transitRouterRouteEntry.setTransitRouterRouteEntryId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryId"));
			transitRouterRouteEntry.setTransitRouterRouteEntryDestinationCidrBlock(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryDestinationCidrBlock"));
			transitRouterRouteEntry.setTransitRouterRouteEntryType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryType"));
			transitRouterRouteEntry.setCreateTime(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].CreateTime"));
			transitRouterRouteEntry.setTransitRouterRouteEntryName(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryName"));
			transitRouterRouteEntry.setTransitRouterRouteEntryStatus(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryStatus"));
			transitRouterRouteEntry.setTransitRouterRouteEntryNextHopType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryNextHopType"));
			transitRouterRouteEntry.setTransitRouterRouteEntryNextHopId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryNextHopId"));
			transitRouterRouteEntry.setTransitRouterRouteEntryDescription(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryDescription"));
			transitRouterRouteEntry.setOperationalMode(_ctx.booleanValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].OperationalMode"));
			transitRouterRouteEntry.setTag(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].Tag"));
			transitRouterRouteEntry.setTransitRouterRouteEntryNextHopResourceId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryNextHopResourceId"));
			transitRouterRouteEntry.setTransitRouterRouteEntryNextHopResourceType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryNextHopResourceType"));
			transitRouterRouteEntry.setTransitRouterRouteEntryOriginResourceType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryOriginResourceType"));
			transitRouterRouteEntry.setTransitRouterRouteEntryOriginResourceId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].TransitRouterRouteEntryOriginResourceId"));
			transitRouterRouteEntry.setPrefixListId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PrefixListId"));
			transitRouterRouteEntry.setPreference(_ctx.integerValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].Preference"));
			transitRouterRouteEntry.setVpnTunnelIp(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].VpnTunnelIp"));

			List<String> communities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].Communities.Length"); j++) {
				communities.add(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].Communities["+ j +"]"));
			}
			transitRouterRouteEntry.setCommunities(communities);

			List<String> asPaths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].AsPaths.Length"); j++) {
				asPaths.add(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].AsPaths["+ j +"]"));
			}
			transitRouterRouteEntry.setAsPaths(asPaths);

			PathAttributes pathAttributes = new PathAttributes();
			pathAttributes.setOriginInstanceId(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.OriginInstanceId"));
			pathAttributes.setOriginInstanceType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.OriginInstanceType"));
			pathAttributes.setOriginRouteType(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.OriginRouteType"));
			pathAttributes.setPreference(_ctx.integerValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.Preference"));
			pathAttributes.setMed(_ctx.longValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.Med"));

			List<String> communities1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.Communities.Length"); j++) {
				communities1.add(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.Communities["+ j +"]"));
			}
			pathAttributes.setCommunities1(communities1);

			List<String> asPaths2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.AsPaths.Length"); j++) {
				asPaths2.add(_ctx.stringValue("ListTransitRouterRouteEntriesResponse.TransitRouterRouteEntries["+ i +"].PathAttributes.AsPaths["+ j +"]"));
			}
			pathAttributes.setAsPaths2(asPaths2);
			transitRouterRouteEntry.setPathAttributes(pathAttributes);

			transitRouterRouteEntries.add(transitRouterRouteEntry);
		}
		listTransitRouterRouteEntriesResponse.setTransitRouterRouteEntries(transitRouterRouteEntries);
	 
	 	return listTransitRouterRouteEntriesResponse;
	}
}