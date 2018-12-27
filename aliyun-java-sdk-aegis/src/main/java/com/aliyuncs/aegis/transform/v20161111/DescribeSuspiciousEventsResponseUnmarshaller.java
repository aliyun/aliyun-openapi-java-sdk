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

import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousEventsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousEventsResponse.LogListItem;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousEventsResponse.LogListItem.DetailListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspiciousEventsResponseUnmarshaller {

	public static DescribeSuspiciousEventsResponse unmarshall(DescribeSuspiciousEventsResponse describeSuspiciousEventsResponse, UnmarshallerContext context) {
		
		describeSuspiciousEventsResponse.setRequestId(context.stringValue("DescribeSuspiciousEventsResponse.RequestId"));
		describeSuspiciousEventsResponse.setPageSize(context.integerValue("DescribeSuspiciousEventsResponse.PageSize"));
		describeSuspiciousEventsResponse.setTotalCount(context.integerValue("DescribeSuspiciousEventsResponse.TotalCount"));
		describeSuspiciousEventsResponse.setCurrentPage(context.integerValue("DescribeSuspiciousEventsResponse.CurrentPage"));

		List<LogListItem> logList = new ArrayList<LogListItem>();
		for (int i = 0; i < context.lengthValue("DescribeSuspiciousEventsResponse.LogList.Length"); i++) {
			LogListItem logListItem = new LogListItem();
			logListItem.setAliasEventType(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].AliasEventType"));
			logListItem.setLastTime(context.longValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].LastTime"));
			logListItem.setLevel(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].Level"));
			logListItem.setInstanceName(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].InstanceName"));
			logListItem.setGroupId(context.longValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].GroupId"));
			logListItem.setIp(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].Ip"));
			logListItem.setEventType(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].EventType"));
			logListItem.setUuid(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].Uuid"));
			logListItem.setFirstTime(context.longValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].FirstTime"));
			logListItem.setInstanceId(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].InstanceId"));
			logListItem.setTag(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].Tag"));
			logListItem.setAliasEventName(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].AliasEventName"));
			logListItem.setOsVersion(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].OsVersion"));
			logListItem.setClientIp(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].ClientIp"));
			logListItem.setEventName(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].EventName"));

			List<DetailListItem> detailList = new ArrayList<DetailListItem>();
			for (int j = 0; j < context.lengthValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].DetailList.Length"); j++) {
				DetailListItem detailListItem = new DetailListItem();
				detailListItem.setName(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].DetailList["+ j +"].Name"));
				detailListItem.setType(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].DetailList["+ j +"].Type"));
				detailListItem.setValue(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].DetailList["+ j +"].Value"));
				detailListItem.setInfoType(context.stringValue("DescribeSuspiciousEventsResponse.LogList["+ i +"].DetailList["+ j +"].InfoType"));

				detailList.add(detailListItem);
			}
			logListItem.setDetailList(detailList);

			logList.add(logListItem);
		}
		describeSuspiciousEventsResponse.setLogList(logList);
	 
	 	return describeSuspiciousEventsResponse;
	}
}