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

import com.aliyuncs.cbn.model.v20170912.DescribePublishedRouteEntriesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribePublishedRouteEntriesResponse.PublishedRouteEntry;
import com.aliyuncs.cbn.model.v20170912.DescribePublishedRouteEntriesResponse.PublishedRouteEntry.Conflict;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePublishedRouteEntriesResponseUnmarshaller {

	public static DescribePublishedRouteEntriesResponse unmarshall(DescribePublishedRouteEntriesResponse describePublishedRouteEntriesResponse, UnmarshallerContext context) {
		
		describePublishedRouteEntriesResponse.setRequestId(context.stringValue("DescribePublishedRouteEntriesResponse.RequestId"));
		describePublishedRouteEntriesResponse.setPageNumber(context.integerValue("DescribePublishedRouteEntriesResponse.PageNumber"));
		describePublishedRouteEntriesResponse.setTotalCount(context.integerValue("DescribePublishedRouteEntriesResponse.TotalCount"));
		describePublishedRouteEntriesResponse.setPageSize(context.integerValue("DescribePublishedRouteEntriesResponse.PageSize"));

		List<PublishedRouteEntry> publishedRouteEntries = new ArrayList<PublishedRouteEntry>();
		for (int i = 0; i < context.lengthValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries.Length"); i++) {
			PublishedRouteEntry publishedRouteEntry = new PublishedRouteEntry();
			publishedRouteEntry.setDestinationCidrBlock(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].DestinationCidrBlock"));
			publishedRouteEntry.setChildInstanceRouteTableId(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].ChildInstanceRouteTableId"));
			publishedRouteEntry.setNextHopType(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].NextHopType"));
			publishedRouteEntry.setRouteType(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].RouteType"));
			publishedRouteEntry.setNextHopId(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].NextHopId"));
			publishedRouteEntry.setOperationalMode(context.booleanValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].OperationalMode"));
			publishedRouteEntry.setPublishStatus(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].PublishStatus"));

			List<Conflict> conflicts = new ArrayList<Conflict>();
			for (int j = 0; j < context.lengthValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].Conflicts.Length"); j++) {
				Conflict conflict = new Conflict();
				conflict.setDestinationCidrBlock(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].Conflicts["+ j +"].DestinationCidrBlock"));
				conflict.setRegionId(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].Conflicts["+ j +"].RegionId"));
				conflict.setInstanceId(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].Conflicts["+ j +"].InstanceId"));
				conflict.setInstanceType(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].Conflicts["+ j +"].InstanceType"));
				conflict.setStatus(context.stringValue("DescribePublishedRouteEntriesResponse.PublishedRouteEntries["+ i +"].Conflicts["+ j +"].Status"));

				conflicts.add(conflict);
			}
			publishedRouteEntry.setConflicts(conflicts);

			publishedRouteEntries.add(publishedRouteEntry);
		}
		describePublishedRouteEntriesResponse.setPublishedRouteEntries(publishedRouteEntries);
	 
	 	return describePublishedRouteEntriesResponse;
	}
}