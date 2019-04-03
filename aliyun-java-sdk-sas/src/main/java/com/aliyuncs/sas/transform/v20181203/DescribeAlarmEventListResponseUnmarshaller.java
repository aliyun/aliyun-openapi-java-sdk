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

import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse.SuspEventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmEventListResponseUnmarshaller {

	public static DescribeAlarmEventListResponse unmarshall(DescribeAlarmEventListResponse describeAlarmEventListResponse, UnmarshallerContext context) {
		
		describeAlarmEventListResponse.setRequestId(context.stringValue("DescribeAlarmEventListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(context.integerValue("DescribeAlarmEventListResponse.PageInfo.Count"));
		pageInfo.setPageSize(context.integerValue("DescribeAlarmEventListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(context.integerValue("DescribeAlarmEventListResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(context.integerValue("DescribeAlarmEventListResponse.PageInfo.CurrentPage"));
		describeAlarmEventListResponse.setPageInfo(pageInfo);

		List<SuspEventsItem> suspEvents = new ArrayList<SuspEventsItem>();
		for (int i = 0; i < context.lengthValue("DescribeAlarmEventListResponse.SuspEvents.Length"); i++) {
			SuspEventsItem suspEventsItem = new SuspEventsItem();
			suspEventsItem.setAlarmUniqueInfo(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			suspEventsItem.setSolution(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Solution"));
			suspEventsItem.setLevel(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Level"));
			suspEventsItem.setCanBeDealOnLine(context.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			suspEventsItem.setDescription(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Description"));
			suspEventsItem.setStartTime(context.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].StartTime"));
			suspEventsItem.setEndTime(context.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].EndTime"));
			suspEventsItem.setAlarmEventType(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventType"));
			suspEventsItem.setSuspiciousEventCount(context.integerValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SuspiciousEventCount"));
			suspEventsItem.setUuid(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Uuid"));
			suspEventsItem.setInstanceName(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InstanceName"));
			suspEventsItem.setInternetIp(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InternetIp"));
			suspEventsItem.setIntranetIp(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].IntranetIp"));
			suspEventsItem.setAlarmEventName(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventName"));
			suspEventsItem.setSaleVersion(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SaleVersion"));
			suspEventsItem.setDataSource(context.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].DataSource"));
			suspEventsItem.setCanCancelFault(context.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].CanCancelFault"));

			suspEvents.add(suspEventsItem);
		}
		describeAlarmEventListResponse.setSuspEvents(suspEvents);
	 
	 	return describeAlarmEventListResponse;
	}
}