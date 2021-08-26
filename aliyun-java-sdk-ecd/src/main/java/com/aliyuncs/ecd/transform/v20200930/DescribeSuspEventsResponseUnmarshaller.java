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
		describeSuspEventsResponse.setCurrentPage(_ctx.integerValue("DescribeSuspEventsResponse.CurrentPage"));
		describeSuspEventsResponse.setPageSize(_ctx.stringValue("DescribeSuspEventsResponse.PageSize"));
		describeSuspEventsResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventsResponse.TotalCount"));

		List<SuspEvent> suspEvents = new ArrayList<SuspEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents.Length"); i++) {
			SuspEvent suspEvent = new SuspEvent();
			suspEvent.setDataSource(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DataSource"));
			suspEvent.setEventSubType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventSubType"));
			suspEvent.setDesktopName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DesktopName"));
			suspEvent.setDesktopId(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DesktopId"));
			suspEvent.setOccurrenceTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTime"));
			suspEvent.setAlarmEventTypeDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventTypeDisplay"));
			suspEvent.setAlarmUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			suspEvent.setDesc(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Desc"));
			suspEvent.setAlarmEventNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventNameDisplay"));
			suspEvent.setCanCancelFault(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanCancelFault"));
			suspEvent.setLastTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTime"));
			suspEvent.setOperateMsg(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateMsg"));
			suspEvent.setCanBeDealOnLine(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			suspEvent.setAlarmEventType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventType"));
			suspEvent.setEventStatus(_ctx.integerValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventStatus"));
			suspEvent.setOperateErrorCode(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateErrorCode"));
			suspEvent.setAlarmEventName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventName"));
			suspEvent.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Name"));
			suspEvent.setUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].UniqueInfo"));
			suspEvent.setLevel(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Level"));
			suspEvent.setId(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Id"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();
				detail.setType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Type"));
				detail.setValue(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Value"));
				detail.setNameDisplay(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].NameDisplay"));
				detail.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Details["+ j +"].Name"));
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