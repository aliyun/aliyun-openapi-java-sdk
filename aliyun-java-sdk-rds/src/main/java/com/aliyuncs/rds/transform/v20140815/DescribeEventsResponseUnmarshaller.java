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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeEventsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeEventsResponse.EventItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext _ctx) {
		
		describeEventsResponse.setRequestId(_ctx.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setTotalRecordCount(_ctx.integerValue("DescribeEventsResponse.TotalRecordCount"));
		describeEventsResponse.setPageSize(_ctx.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setPageNumber(_ctx.integerValue("DescribeEventsResponse.PageNumber"));

		List<EventItemsItem> eventItems = new ArrayList<EventItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventsResponse.EventItems.Length"); i++) {
			EventItemsItem eventItemsItem = new EventItemsItem();
			eventItemsItem.setEventId(_ctx.integerValue("DescribeEventsResponse.EventItems["+ i +"].EventId"));
			eventItemsItem.setEventType(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventType"));
			eventItemsItem.setEventName(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventName"));
			eventItemsItem.setEventTime(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventTime"));
			eventItemsItem.setResourceType(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].ResourceType"));
			eventItemsItem.setResourceName(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].ResourceName"));
			eventItemsItem.setRegionId(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].RegionId"));
			eventItemsItem.setEventUserType(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventUserType"));
			eventItemsItem.setEventReason(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventReason"));
			eventItemsItem.setEventPayload(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventPayload"));
			eventItemsItem.setEventRecordTime(_ctx.stringValue("DescribeEventsResponse.EventItems["+ i +"].EventRecordTime"));

			eventItems.add(eventItemsItem);
		}
		describeEventsResponse.setEventItems(eventItems);
	 
	 	return describeEventsResponse;
	}
}