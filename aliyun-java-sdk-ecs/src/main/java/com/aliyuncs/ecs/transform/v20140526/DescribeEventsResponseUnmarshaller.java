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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeEventsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeEventsResponse.Events;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext context) {
		
		describeEventsResponse.setRequestId(context.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setPageNo(context.integerValue("DescribeEventsResponse.PageNo"));
		describeEventsResponse.setPageSize(context.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setTotal(context.integerValue("DescribeEventsResponse.Total"));

		List<Events> data = new ArrayList<Events>();
		for (int i = 0; i < context.lengthValue("DescribeEventsResponse.Data.Length"); i++) {
			Events events = new Events();
			events.setResourceId(context.stringValue("DescribeEventsResponse.Data["+ i +"].ResourceId"));
			events.setEventType(context.stringValue("DescribeEventsResponse.Data["+ i +"].EventType"));
			events.setEventCategory(context.stringValue("DescribeEventsResponse.Data["+ i +"].EventCategory"));
			events.setStatus(context.stringValue("DescribeEventsResponse.Data["+ i +"].Status"));
			events.setSupportModify(context.stringValue("DescribeEventsResponse.Data["+ i +"].SupportModify"));
			events.setPlanTime(context.stringValue("DescribeEventsResponse.Data["+ i +"].PlanTime"));
			events.setExpireTime(context.stringValue("DescribeEventsResponse.Data["+ i +"].ExpireTime"));
			events.setEventId(context.stringValue("DescribeEventsResponse.Data["+ i +"].EventId"));

			data.add(events);
		}
		describeEventsResponse.setData(data);
	 
	 	return describeEventsResponse;
	}
}