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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventsResponse.WarningSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventsResponseUnmarshaller {

	public static DescribeSuspEventsResponse unmarshall(DescribeSuspEventsResponse describeSuspEventsResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventsResponse.setRequestId(_ctx.stringValue("DescribeSuspEventsResponse.RequestId"));
		describeSuspEventsResponse.setCount(_ctx.integerValue("DescribeSuspEventsResponse.Count"));
		describeSuspEventsResponse.setPageSize(_ctx.integerValue("DescribeSuspEventsResponse.PageSize"));
		describeSuspEventsResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventsResponse.TotalCount"));
		describeSuspEventsResponse.setCurrentPage(_ctx.integerValue("DescribeSuspEventsResponse.CurrentPage"));

		List<WarningSummary> suspEvents = new ArrayList<WarningSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventsResponse.SuspEvents.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setLastTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTime"));
			warningSummary.setOccurrenceTime(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTime"));
			warningSummary.setId(_ctx.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Id"));
			warningSummary.setUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].UniqueInfo"));
			warningSummary.setInstanceName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InstanceName"));
			warningSummary.setInternetIp(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InternetIp"));
			warningSummary.setIntranetIp(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].IntranetIp"));
			warningSummary.setUuid(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Uuid"));
			warningSummary.setName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Name"));
			warningSummary.setEventSubType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventSubType"));
			warningSummary.setLevel(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Level"));
			warningSummary.setEventStatus(_ctx.integerValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventStatus"));
			warningSummary.setDesc(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Desc"));
			warningSummary.setOperateMsg(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateMsg"));
			warningSummary.setDataSource(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DataSource"));
			warningSummary.setCanBeDealOnLine(_ctx.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			warningSummary.setSaleVersion(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].SaleVersion"));
			warningSummary.setAlarmEventType(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventType"));
			warningSummary.setAlarmEventName(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventName"));
			warningSummary.setAlarmUniqueInfo(_ctx.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));

			suspEvents.add(warningSummary);
		}
		describeSuspEventsResponse.setSuspEvents(suspEvents);
	 
	 	return describeSuspEventsResponse;
	}
}