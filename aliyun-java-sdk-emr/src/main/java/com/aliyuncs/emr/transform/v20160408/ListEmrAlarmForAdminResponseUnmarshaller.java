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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListEmrAlarmForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListEmrAlarmForAdminResponse.AlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrAlarmForAdminResponseUnmarshaller {

	public static ListEmrAlarmForAdminResponse unmarshall(ListEmrAlarmForAdminResponse listEmrAlarmForAdminResponse, UnmarshallerContext context) {
		
		listEmrAlarmForAdminResponse.setRequestId(context.stringValue("ListEmrAlarmForAdminResponse.RequestId"));
		listEmrAlarmForAdminResponse.setTotalCount(context.integerValue("ListEmrAlarmForAdminResponse.TotalCount"));
		listEmrAlarmForAdminResponse.setPageNumber(context.integerValue("ListEmrAlarmForAdminResponse.PageNumber"));
		listEmrAlarmForAdminResponse.setPageSize(context.integerValue("ListEmrAlarmForAdminResponse.PageSize"));

		List<AlarmHistory> alarmHistoryList = new ArrayList<AlarmHistory>();
		for (int i = 0; i < context.lengthValue("ListEmrAlarmForAdminResponse.AlarmHistoryList.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setId(context.longValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].Id"));
			alarmHistory.setEventType(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].EventType"));
			alarmHistory.setTopic(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].Topic"));
			alarmHistory.setUniqueKey(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].UniqueKey"));
			alarmHistory.setEntityId(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].EntityId"));
			alarmHistory.setPriority(context.integerValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].Priority"));
			alarmHistory.setBody(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].Body"));
			alarmHistory.setStatus(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].Status"));
			alarmHistory.setClusterBizId(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].ClusterBizId"));
			alarmHistory.setGmtCreate(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].GmtCreate"));
			alarmHistory.setGmtModified(context.stringValue("ListEmrAlarmForAdminResponse.AlarmHistoryList["+ i +"].GmtModified"));

			alarmHistoryList.add(alarmHistory);
		}
		listEmrAlarmForAdminResponse.setAlarmHistoryList(alarmHistoryList);
	 
	 	return listEmrAlarmForAdminResponse;
	}
}