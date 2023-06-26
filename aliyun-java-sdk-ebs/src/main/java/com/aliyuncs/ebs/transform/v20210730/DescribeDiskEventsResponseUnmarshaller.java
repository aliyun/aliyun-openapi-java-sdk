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

package com.aliyuncs.ebs.transform.v20210730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ebs.model.v20210730.DescribeDiskEventsResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeDiskEventsResponse.DiskEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskEventsResponseUnmarshaller {

	public static DescribeDiskEventsResponse unmarshall(DescribeDiskEventsResponse describeDiskEventsResponse, UnmarshallerContext _ctx) {
		
		describeDiskEventsResponse.setRequestId(_ctx.stringValue("DescribeDiskEventsResponse.RequestId"));
		describeDiskEventsResponse.setTotalCount(_ctx.longValue("DescribeDiskEventsResponse.TotalCount"));
		describeDiskEventsResponse.setNextToken(_ctx.stringValue("DescribeDiskEventsResponse.NextToken"));

		List<DiskEvent> diskEvents = new ArrayList<DiskEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskEventsResponse.DiskEvents.Length"); i++) {
			DiskEvent diskEvent = new DiskEvent();
			diskEvent.setType(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].Type"));
			diskEvent.setDiskId(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].DiskId"));
			diskEvent.setStatus(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].Status"));
			diskEvent.setTimestamp(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].Timestamp"));
			diskEvent.setDescription(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].Description"));
			diskEvent.setRecommendAction(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].RecommendAction"));
			diskEvent.setRegionId(_ctx.stringValue("DescribeDiskEventsResponse.DiskEvents["+ i +"].RegionId"));

			diskEvents.add(diskEvent);
		}
		describeDiskEventsResponse.setDiskEvents(diskEvents);
	 
	 	return describeDiskEventsResponse;
	}
}