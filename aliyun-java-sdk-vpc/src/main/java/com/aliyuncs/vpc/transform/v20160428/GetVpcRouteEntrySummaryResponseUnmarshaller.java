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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.GetVpcRouteEntrySummaryResponse;
import com.aliyuncs.vpc.model.v20160428.GetVpcRouteEntrySummaryResponse.RouteEntrySummarysItem;
import com.aliyuncs.vpc.model.v20160428.GetVpcRouteEntrySummaryResponse.RouteEntrySummarysItem.EntrySummarysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcRouteEntrySummaryResponseUnmarshaller {

	public static GetVpcRouteEntrySummaryResponse unmarshall(GetVpcRouteEntrySummaryResponse getVpcRouteEntrySummaryResponse, UnmarshallerContext _ctx) {
		
		getVpcRouteEntrySummaryResponse.setRequestId(_ctx.stringValue("GetVpcRouteEntrySummaryResponse.RequestId"));

		List<RouteEntrySummarysItem> routeEntrySummarys = new ArrayList<RouteEntrySummarysItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcRouteEntrySummaryResponse.RouteEntrySummarys.Length"); i++) {
			RouteEntrySummarysItem routeEntrySummarysItem = new RouteEntrySummarysItem();
			routeEntrySummarysItem.setRouteTableId(_ctx.stringValue("GetVpcRouteEntrySummaryResponse.RouteEntrySummarys["+ i +"].RouteTableId"));

			List<EntrySummarysItem> entrySummarys = new ArrayList<EntrySummarysItem>();
			for (int j = 0; j < _ctx.lengthValue("GetVpcRouteEntrySummaryResponse.RouteEntrySummarys["+ i +"].EntrySummarys.Length"); j++) {
				EntrySummarysItem entrySummarysItem = new EntrySummarysItem();
				entrySummarysItem.setRouteEntryType(_ctx.stringValue("GetVpcRouteEntrySummaryResponse.RouteEntrySummarys["+ i +"].EntrySummarys["+ j +"].RouteEntryType"));
				entrySummarysItem.setCount(_ctx.integerValue("GetVpcRouteEntrySummaryResponse.RouteEntrySummarys["+ i +"].EntrySummarys["+ j +"].Count"));

				entrySummarys.add(entrySummarysItem);
			}
			routeEntrySummarysItem.setEntrySummarys(entrySummarys);

			routeEntrySummarys.add(routeEntrySummarysItem);
		}
		getVpcRouteEntrySummaryResponse.setRouteEntrySummarys(routeEntrySummarys);
	 
	 	return getVpcRouteEntrySummaryResponse;
	}
}