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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListCcnRouteEntriesResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCcnRouteEntriesResponse.RouteEntry;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCcnRouteEntriesResponseUnmarshaller {

	public static InnerListCcnRouteEntriesResponse unmarshall(InnerListCcnRouteEntriesResponse innerListCcnRouteEntriesResponse, UnmarshallerContext context) {
		
		innerListCcnRouteEntriesResponse.setRequestId(context.stringValue("InnerListCcnRouteEntriesResponse.RequestId"));
		innerListCcnRouteEntriesResponse.setTotal(context.integerValue("InnerListCcnRouteEntriesResponse.Total"));
		innerListCcnRouteEntriesResponse.setPageNumber(context.integerValue("InnerListCcnRouteEntriesResponse.PageNumber"));
		innerListCcnRouteEntriesResponse.setPageSize(context.integerValue("InnerListCcnRouteEntriesResponse.PageSize"));

		List<RouteEntry> routeEnties = new ArrayList<RouteEntry>();
		for (int i = 0; i < context.lengthValue("InnerListCcnRouteEntriesResponse.RouteEnties.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setRouteTableId(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].RouteTableId"));
			routeEntry.setSourceInstanceId(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].SourceInstanceId"));
			routeEntry.setSourceInstanceType(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].SourceInstanceType"));
			routeEntry.setDstCidr(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].DstCidr"));
			routeEntry.setTunnelId(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].TunnelId"));
			routeEntry.setNextHop(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].NextHop"));
			routeEntry.setNextHopRegion(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].NextHopRegion"));
			routeEntry.setRateLimitId(context.stringValue("InnerListCcnRouteEntriesResponse.RouteEnties["+ i +"].RateLimitId"));

			routeEnties.add(routeEntry);
		}
		innerListCcnRouteEntriesResponse.setRouteEnties(routeEnties);
	 
	 	return innerListCcnRouteEntriesResponse;
	}
}