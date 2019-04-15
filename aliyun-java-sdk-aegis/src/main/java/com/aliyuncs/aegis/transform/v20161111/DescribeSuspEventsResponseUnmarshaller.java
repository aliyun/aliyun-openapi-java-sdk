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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventsResponse.WarningSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventsResponseUnmarshaller {

	public static DescribeSuspEventsResponse unmarshall(DescribeSuspEventsResponse describeSuspEventsResponse, UnmarshallerContext context) {
		
		describeSuspEventsResponse.setRequestId(context.stringValue("DescribeSuspEventsResponse.RequestId"));
		describeSuspEventsResponse.setCount(context.integerValue("DescribeSuspEventsResponse.Count"));
		describeSuspEventsResponse.setPageSize(context.integerValue("DescribeSuspEventsResponse.PageSize"));
		describeSuspEventsResponse.setTotalCount(context.integerValue("DescribeSuspEventsResponse.TotalCount"));
		describeSuspEventsResponse.setCurrentPage(context.integerValue("DescribeSuspEventsResponse.CurrentPage"));

		List<WarningSummary> suspEvents = new ArrayList<WarningSummary>();
		for (int i = 0; i < context.lengthValue("DescribeSuspEventsResponse.SuspEvents.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setLastTime(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].LastTime"));
			warningSummary.setOccurrenceTime(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OccurrenceTime"));
			warningSummary.setId(context.longValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Id"));
			warningSummary.setInstanceName(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InstanceName"));
			warningSummary.setInternetIp(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].InternetIp"));
			warningSummary.setIntranetIp(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].IntranetIp"));
			warningSummary.setUuid(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Uuid"));
			warningSummary.setName(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Name"));
			warningSummary.setEventSubType(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventSubType"));
			warningSummary.setLevel(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Level"));
			warningSummary.setEventStatus(context.integerValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].EventStatus"));
			warningSummary.setDesc(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].Desc"));
			warningSummary.setOperateMsg(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].OperateMsg"));
			warningSummary.setDataSource(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].DataSource"));
			warningSummary.setCanBeDealOnLine(context.booleanValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			warningSummary.setSaleVersion(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].SaleVersion"));
			warningSummary.setAlarmEventType(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventType"));
			warningSummary.setAlarmEventName(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmEventName"));
			warningSummary.setAlarmUniqueInfo(context.stringValue("DescribeSuspEventsResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));

			suspEvents.add(warningSummary);
		}
		describeSuspEventsResponse.setSuspEvents(suspEvents);
	 
	 	return describeSuspEventsResponse;
	}
}