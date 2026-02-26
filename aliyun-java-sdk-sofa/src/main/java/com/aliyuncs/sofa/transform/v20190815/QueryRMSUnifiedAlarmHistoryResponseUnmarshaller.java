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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmHistoryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmHistoryResponse.AlarmHistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRMSUnifiedAlarmHistoryResponseUnmarshaller {

	public static QueryRMSUnifiedAlarmHistoryResponse unmarshall(QueryRMSUnifiedAlarmHistoryResponse queryRMSUnifiedAlarmHistoryResponse, UnmarshallerContext _ctx) {
		
		queryRMSUnifiedAlarmHistoryResponse.setRequestId(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.RequestId"));
		queryRMSUnifiedAlarmHistoryResponse.setCurrentPage(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.CurrentPage"));
		queryRMSUnifiedAlarmHistoryResponse.setResultMessage(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.ResultMessage"));
		queryRMSUnifiedAlarmHistoryResponse.setResultCode(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.ResultCode"));
		queryRMSUnifiedAlarmHistoryResponse.setPageSize(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.PageSize"));
		queryRMSUnifiedAlarmHistoryResponse.setTotalCount(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.TotalCount"));

		List<AlarmHistoriesItem> alarmHistories = new ArrayList<AlarmHistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories.Length"); i++) {
			AlarmHistoriesItem alarmHistoriesItem = new AlarmHistoriesItem();
			alarmHistoriesItem.setAlarmTargetType(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmTargetType"));
			alarmHistoriesItem.setStatus(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].Status"));
			alarmHistoriesItem.setDataSourceName(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].DataSourceName"));
			alarmHistoriesItem.setAlarmType(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmType"));
			alarmHistoriesItem.setGmtModified(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].GmtModified"));
			alarmHistoriesItem.setEventId(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].EventId"));
			alarmHistoriesItem.setWorkspaceId(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].WorkspaceId"));
			alarmHistoriesItem.setUniqueIdentity(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].UniqueIdentity"));
			alarmHistoriesItem.setAlarmTime(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmTime"));
			alarmHistoriesItem.setAlarmRuleId(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmRuleId"));
			alarmHistoriesItem.setGmtCreate(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].GmtCreate"));
			alarmHistoriesItem.setAlarmDetail(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmDetail"));
			alarmHistoriesItem.setAlarmUrl(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmUrl"));
			alarmHistoriesItem.setAlarmContent(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmContent"));
			alarmHistoriesItem.setAlarmUrlWithDomain(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmUrlWithDomain"));
			alarmHistoriesItem.setAlarmTargetDeleted(_ctx.booleanValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmTargetDeleted"));
			alarmHistoriesItem.setAlarmLevel(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmLevel"));
			alarmHistoriesItem.setId(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].Id"));
			alarmHistoriesItem.setTenantId(_ctx.longValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].TenantId"));
			alarmHistoriesItem.setAlarmTarget(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmTarget"));
			alarmHistoriesItem.setAlarmRuleName(_ctx.stringValue("QueryRMSUnifiedAlarmHistoryResponse.AlarmHistories["+ i +"].AlarmRuleName"));

			alarmHistories.add(alarmHistoriesItem);
		}
		queryRMSUnifiedAlarmHistoryResponse.setAlarmHistories(alarmHistories);
	 
	 	return queryRMSUnifiedAlarmHistoryResponse;
	}
}