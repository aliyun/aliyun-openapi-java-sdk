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

import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventsResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCCNEventsResponse.Event;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCCNEventsResponseUnmarshaller {

	public static InnerListCCNEventsResponse unmarshall(InnerListCCNEventsResponse innerListCCNEventsResponse, UnmarshallerContext context) {
		
		innerListCCNEventsResponse.setRequestId(context.stringValue("InnerListCCNEventsResponse.RequestId"));
		innerListCCNEventsResponse.setTotal(context.integerValue("InnerListCCNEventsResponse.Total"));
		innerListCCNEventsResponse.setPageNumber(context.integerValue("InnerListCCNEventsResponse.PageNumber"));
		innerListCCNEventsResponse.setPageSize(context.integerValue("InnerListCCNEventsResponse.PageSize"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("InnerListCCNEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setId(context.longValue("InnerListCCNEventsResponse.Events["+ i +"].Id"));
			event.setRegionNo(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].RegionNo"));
			event.setInstanceId(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].InstanceId"));
			event.setNamespace(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].Namespace"));
			event.setSourceInstanceId(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].SourceInstanceId"));
			event.setSourceNamespace(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].SourceNamespace"));
			event.setSchedulerIp(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].SchedulerIp"));
			event.setHandlerIp(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].HandlerIp"));
			event.setState(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].State"));
			event.setScheduleState(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].ScheduleState"));
			event.setMessage(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].Message"));
			event.setData(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].Data"));
			event.setDataSchemaNamespace(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].DataSchemaNamespace"));
			event.setGmtCreate(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].GmtCreate"));
			event.setGmtModify(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].GmtModify"));
			event.setGmtScheduled(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].GmtScheduled"));
			event.setTimeoutRetryPolicy(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].TimeoutRetryPolicy"));
			event.setDelayPolicy(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].DelayPolicy"));
			event.setContext(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].Context"));
			event.setPriority(context.stringValue("InnerListCCNEventsResponse.Events["+ i +"].Priority"));
			event.setHandledTimes(context.longValue("InnerListCCNEventsResponse.Events["+ i +"].HandledTimes"));
			event.setMaxHandleTimes(context.longValue("InnerListCCNEventsResponse.Events["+ i +"].MaxHandleTimes"));

			events.add(event);
		}
		innerListCCNEventsResponse.setEvents(events);
	 
	 	return innerListCCNEventsResponse;
	}
}