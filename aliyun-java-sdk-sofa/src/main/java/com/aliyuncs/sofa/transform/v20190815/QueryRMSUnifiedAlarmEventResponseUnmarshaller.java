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

import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmEventResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventListItem;
import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventListItem.AlarmHistoryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRMSUnifiedAlarmEventResponseUnmarshaller {

	public static QueryRMSUnifiedAlarmEventResponse unmarshall(QueryRMSUnifiedAlarmEventResponse queryRMSUnifiedAlarmEventResponse, UnmarshallerContext _ctx) {
		
		queryRMSUnifiedAlarmEventResponse.setRequestId(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.RequestId"));
		queryRMSUnifiedAlarmEventResponse.setCurrentPage(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.CurrentPage"));
		queryRMSUnifiedAlarmEventResponse.setResultMessage(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.ResultMessage"));
		queryRMSUnifiedAlarmEventResponse.setResultCode(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.ResultCode"));
		queryRMSUnifiedAlarmEventResponse.setPageSize(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.PageSize"));
		queryRMSUnifiedAlarmEventResponse.setTotalCount(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.TotalCount"));

		List<UnifiedAlarmEventListItem> unifiedAlarmEventList = new ArrayList<UnifiedAlarmEventListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList.Length"); i++) {
			UnifiedAlarmEventListItem unifiedAlarmEventListItem = new UnifiedAlarmEventListItem();
			unifiedAlarmEventListItem.setStatus(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].Status"));
			unifiedAlarmEventListItem.setAlarmTargetType(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmTargetType"));
			unifiedAlarmEventListItem.setAlarmStartTime(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmStartTime"));
			unifiedAlarmEventListItem.setSilenceRemainTime(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].SilenceRemainTime"));
			unifiedAlarmEventListItem.setDataSourceName(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].DataSourceName"));
			unifiedAlarmEventListItem.setAlarmType(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmType"));
			unifiedAlarmEventListItem.setAlarmRecoverTime(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmRecoverTime"));
			unifiedAlarmEventListItem.setAlarmRuleId(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmRuleId"));
			unifiedAlarmEventListItem.setAlarmHistoryId(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryId"));
			unifiedAlarmEventListItem.setAlarmContent(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmContent"));
			unifiedAlarmEventListItem.setAlarmUrl(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmUrl"));
			unifiedAlarmEventListItem.setAlarmUrlWithDomain(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmUrlWithDomain"));
			unifiedAlarmEventListItem.setAlarmTargetDeleted(_ctx.booleanValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmTargetDeleted"));
			unifiedAlarmEventListItem.setAlarmLevel(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmLevel"));
			unifiedAlarmEventListItem.setAlarmEventId(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmEventId"));
			unifiedAlarmEventListItem.setAlarmTarget(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmTarget"));

			List<AlarmHistoryListItem> alarmHistoryList = new ArrayList<AlarmHistoryListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList.Length"); j++) {
				AlarmHistoryListItem alarmHistoryListItem = new AlarmHistoryListItem();
				alarmHistoryListItem.setAlarmTargetType(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmTargetType"));
				alarmHistoryListItem.setStatus(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].Status"));
				alarmHistoryListItem.setDataSourceName(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].DataSourceName"));
				alarmHistoryListItem.setAlarmType(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmType"));
				alarmHistoryListItem.setGmtModified(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].GmtModified"));
				alarmHistoryListItem.setEventId(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].EventId"));
				alarmHistoryListItem.setWorkspaceId(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].WorkspaceId"));
				alarmHistoryListItem.setUniqueIdentity(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].UniqueIdentity"));
				alarmHistoryListItem.setAlarmTime(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmTime"));
				alarmHistoryListItem.setAlarmRuleId(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmRuleId"));
				alarmHistoryListItem.setGmtCreate(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].GmtCreate"));
				alarmHistoryListItem.setAlarmDetail(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmDetail"));
				alarmHistoryListItem.setAlarmUrl(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmUrl"));
				alarmHistoryListItem.setAlarmContent(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmContent"));
				alarmHistoryListItem.setAlarmUrlWithDomain(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmUrlWithDomain"));
				alarmHistoryListItem.setAlarmTargetDeleted(_ctx.booleanValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmTargetDeleted"));
				alarmHistoryListItem.setAlarmLevel(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmLevel"));
				alarmHistoryListItem.setId(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].Id"));
				alarmHistoryListItem.setTenantId(_ctx.longValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].TenantId"));
				alarmHistoryListItem.setAlarmTarget(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmTarget"));
				alarmHistoryListItem.setAlarmRuleName(_ctx.stringValue("QueryRMSUnifiedAlarmEventResponse.UnifiedAlarmEventList["+ i +"].AlarmHistoryList["+ j +"].AlarmRuleName"));

				alarmHistoryList.add(alarmHistoryListItem);
			}
			unifiedAlarmEventListItem.setAlarmHistoryList(alarmHistoryList);

			unifiedAlarmEventList.add(unifiedAlarmEventListItem);
		}
		queryRMSUnifiedAlarmEventResponse.setUnifiedAlarmEventList(unifiedAlarmEventList);
	 
	 	return queryRMSUnifiedAlarmEventResponse;
	}
}