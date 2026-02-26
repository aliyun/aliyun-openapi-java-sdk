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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeEventsResponse;
import com.aliyuncs.cs.model.v20151215.DescribeEventsResponse.Event;
import com.aliyuncs.cs.model.v20151215.DescribeEventsResponse.Event.Data;
import com.aliyuncs.cs.model.v20151215.DescribeEventsResponse.Page_info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext _ctx) {
		

		Page_info page_info = new Page_info();
		page_info.setPage_size(_ctx.longValue("DescribeEventsResponse.page_info.page_size"));
		page_info.setPage_number(_ctx.longValue("DescribeEventsResponse.page_info.page_number"));
		page_info.setTotal_count(_ctx.longValue("DescribeEventsResponse.page_info.total_count"));
		describeEventsResponse.setPage_info(page_info);

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventsResponse.events.Length"); i++) {
			Event event = new Event();
			event.setEvent_id(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].event_id"));
			event.setType(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].type"));
			event.setSource(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].source"));
			event.setSubject(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].subject"));
			event.setTime(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].time"));
			event.setCluster_id(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].cluster_id"));

			Data data = new Data();
			data.setLevel(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].data.level"));
			data.setReason(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].data.reason"));
			data.setMessage(_ctx.stringValue("DescribeEventsResponse.events["+ i +"].data.message"));
			event.setData(data);

			events.add(event);
		}
		describeEventsResponse.setEvents(events);
	 
	 	return describeEventsResponse;
	}
}