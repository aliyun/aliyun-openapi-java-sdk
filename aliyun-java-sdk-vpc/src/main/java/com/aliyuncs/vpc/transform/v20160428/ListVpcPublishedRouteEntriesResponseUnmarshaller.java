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

import com.aliyuncs.vpc.model.v20160428.ListVpcPublishedRouteEntriesResponse;
import com.aliyuncs.vpc.model.v20160428.ListVpcPublishedRouteEntriesResponse.RouteEntry;
import com.aliyuncs.vpc.model.v20160428.ListVpcPublishedRouteEntriesResponse.RouteEntry.RoutePublishTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcPublishedRouteEntriesResponseUnmarshaller {

	public static ListVpcPublishedRouteEntriesResponse unmarshall(ListVpcPublishedRouteEntriesResponse listVpcPublishedRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		listVpcPublishedRouteEntriesResponse.setRequestId(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RequestId"));
		listVpcPublishedRouteEntriesResponse.setNextToken(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.NextToken"));

		List<RouteEntry> routeEntries = new ArrayList<RouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcPublishedRouteEntriesResponse.RouteEntries.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setRouteEntryId(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].RouteEntryId"));
			routeEntry.setDestinationCidrBlock(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].DestinationCidrBlock"));
			routeEntry.setRouteTableId(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].RouteTableId"));

			List<RoutePublishTarget> routePublishTargets = new ArrayList<RoutePublishTarget>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].RoutePublishTargets.Length"); j++) {
				RoutePublishTarget routePublishTarget = new RoutePublishTarget();
				routePublishTarget.setPublishStatus(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].RoutePublishTargets["+ j +"].PublishStatus"));
				routePublishTarget.setPublishTargetType(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].RoutePublishTargets["+ j +"].PublishTargetType"));
				routePublishTarget.setPublishTargetInstanceId(_ctx.stringValue("ListVpcPublishedRouteEntriesResponse.RouteEntries["+ i +"].RoutePublishTargets["+ j +"].PublishTargetInstanceId"));

				routePublishTargets.add(routePublishTarget);
			}
			routeEntry.setRoutePublishTargets(routePublishTargets);

			routeEntries.add(routeEntry);
		}
		listVpcPublishedRouteEntriesResponse.setRouteEntries(routeEntries);
	 
	 	return listVpcPublishedRouteEntriesResponse;
	}
}