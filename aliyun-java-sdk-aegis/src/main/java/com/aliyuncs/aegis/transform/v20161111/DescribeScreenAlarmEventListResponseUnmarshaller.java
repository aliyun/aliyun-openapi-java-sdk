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

import com.aliyuncs.aegis.model.v20161111.DescribeScreenAlarmEventListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenAlarmEventListResponse.PageInfo;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenAlarmEventListResponse.SuspEventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenAlarmEventListResponseUnmarshaller {

	public static DescribeScreenAlarmEventListResponse unmarshall(DescribeScreenAlarmEventListResponse describeScreenAlarmEventListResponse, UnmarshallerContext context) {
		
		describeScreenAlarmEventListResponse.setRequestId(context.stringValue("DescribeScreenAlarmEventListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(context.integerValue("DescribeScreenAlarmEventListResponse.PageInfo.Count"));
		pageInfo.setPageSize(context.integerValue("DescribeScreenAlarmEventListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(context.integerValue("DescribeScreenAlarmEventListResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(context.integerValue("DescribeScreenAlarmEventListResponse.PageInfo.CurrentPage"));
		describeScreenAlarmEventListResponse.setPageInfo(pageInfo);

		List<SuspEventsItem> suspEvents = new ArrayList<SuspEventsItem>();
		for (int i = 0; i < context.lengthValue("DescribeScreenAlarmEventListResponse.SuspEvents.Length"); i++) {
			SuspEventsItem suspEventsItem = new SuspEventsItem();
			suspEventsItem.setAlarmUniqueInfo(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			suspEventsItem.setSolution(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].Solution"));
			suspEventsItem.setLevel(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].Level"));
			suspEventsItem.setCanBeDealOnLine(context.booleanValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			suspEventsItem.setDescription(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].Description"));
			suspEventsItem.setStartTime(context.longValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].StartTime"));
			suspEventsItem.setEndTime(context.longValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].EndTime"));
			suspEventsItem.setAlarmEventType(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventType"));
			suspEventsItem.setSuspiciousEventCount(context.integerValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].SuspiciousEventCount"));
			suspEventsItem.setUuid(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].Uuid"));
			suspEventsItem.setInstanceName(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].InstanceName"));
			suspEventsItem.setInternetIp(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].InternetIp"));
			suspEventsItem.setIntranetIp(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].IntranetIp"));
			suspEventsItem.setAlarmEventName(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventName"));
			suspEventsItem.setSaleVersion(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].SaleVersion"));
			suspEventsItem.setDataSource(context.stringValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].DataSource"));
			suspEventsItem.setCanCancelFault(context.booleanValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].CanCancelFault"));
			suspEventsItem.setDealed(context.booleanValue("DescribeScreenAlarmEventListResponse.SuspEvents["+ i +"].Dealed"));

			suspEvents.add(suspEventsItem);
		}
		describeScreenAlarmEventListResponse.setSuspEvents(suspEvents);
	 
	 	return describeScreenAlarmEventListResponse;
	}
}