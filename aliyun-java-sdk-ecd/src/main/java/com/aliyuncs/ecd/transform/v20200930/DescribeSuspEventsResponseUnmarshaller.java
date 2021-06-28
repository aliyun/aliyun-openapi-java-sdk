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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeSuspEventsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeSuspEventsResponse.SuspEvent;
import com.aliyuncs.ecd.model.v20200930.DescribeSuspEventsResponse.SuspEvent.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventsResponseUnmarshaller {

	public static DescribeSuspEventsResponse unmarshall(DescribeSuspEventsResponse describeSuspEventsResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventsResponse.setRequestId(_ctx.stringValue("DescribeSuspEventsResponse.RequestId"));
		describeSuspEventsResponse.setPageSize(_ctx.stringValue("DescribeSuspEventsResponse.PageSize"));
		describeSuspEventsResponse.setCurrentPage(_ctx.integerValue("DescribeSuspEventsResponse.CurrentPage"));
		describeSuspEventsResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventsResponse.TotalCount"));

		List<SuspEvent> suspEvents = new ArrayList<SuspEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents.Length"); i++) {
			SuspEvent suspEvent = new SuspEvent();
			suspEvent.setId(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Id"));
			suspEvent.setDesktopId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DesktopId"));
			suspEvent.setDesktopName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DesktopName"));
			suspEvent.setLastTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTime"));
			suspEvent.setOccurrenceTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTime"));
			suspEvent.setUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].UniqueInfo"));
			suspEvent.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Name"));
			suspEvent.setEventSubType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventSubType"));
			suspEvent.setLevel(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Level"));
			suspEvent.setEventStatus(_ctx.integerValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventStatus"));
			suspEvent.setDesc(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Desc"));
			suspEvent.setOperateMsg(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateMsg"));
			suspEvent.setDataSource(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DataSource"));
			suspEvent.setOperateErrorCode(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateErrorCode"));
			suspEvent.setCanCancelFault(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanCancelFault"));
			suspEvent.setCanBeDealOnLine(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			suspEvent.setAlarmEventType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventType"));
			suspEvent.setAlarmEventName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventName"));
			suspEvent.setAlarmUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			suspEvent.setAlarmEventNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventNameDisplay"));
			suspEvent.setAlarmEventTypeDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventTypeDisplay"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();
				detail.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Name"));
				detail.setNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].NameDisplay"));
				detail.setType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Type"));
				detail.setValue(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Value"));
				detail.setValueDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].ValueDisplay"));

				details.add(detail);
			}
			suspEvent.setDetails(details);

			suspEvents.add(suspEvent);
		}
		describeSuspEventsResponse.setSuspEvents(suspEvents);
	 
	 	return describeSuspEventsResponse;
	}
}