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

import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmNotifyHistoryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistoriesItem;
import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifySubsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRMSUnifiedAlarmNotifyHistoryResponseUnmarshaller {

	public static QueryRMSUnifiedAlarmNotifyHistoryResponse unmarshall(QueryRMSUnifiedAlarmNotifyHistoryResponse queryRMSUnifiedAlarmNotifyHistoryResponse, UnmarshallerContext _ctx) {
		
		queryRMSUnifiedAlarmNotifyHistoryResponse.setRequestId(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.RequestId"));
		queryRMSUnifiedAlarmNotifyHistoryResponse.setCurrentPage(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.CurrentPage"));
		queryRMSUnifiedAlarmNotifyHistoryResponse.setResultMessage(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.ResultMessage"));
		queryRMSUnifiedAlarmNotifyHistoryResponse.setResultCode(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.ResultCode"));
		queryRMSUnifiedAlarmNotifyHistoryResponse.setPageSize(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.PageSize"));
		queryRMSUnifiedAlarmNotifyHistoryResponse.setTotalCount(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.TotalCount"));

		List<AlarmNotifyHistoriesItem> alarmNotifyHistories = new ArrayList<AlarmNotifyHistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories.Length"); i++) {
			AlarmNotifyHistoriesItem alarmNotifyHistoriesItem = new AlarmNotifyHistoriesItem();
			alarmNotifyHistoriesItem.setAlarmSilenceTime(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmSilenceTime"));
			alarmNotifyHistoriesItem.setStatus(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].Status"));
			alarmNotifyHistoriesItem.setErrorMessage(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].ErrorMessage"));
			alarmNotifyHistoriesItem.setAlarmType(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmType"));
			alarmNotifyHistoriesItem.setGmtModified(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].GmtModified"));
			alarmNotifyHistoriesItem.setNotifyContent(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].NotifyContent"));
			alarmNotifyHistoriesItem.setAlarmRuleId(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmRuleId"));
			alarmNotifyHistoriesItem.setSubscriber(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].Subscriber"));
			alarmNotifyHistoriesItem.setChannel(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].Channel"));
			alarmNotifyHistoriesItem.setAlarmTargetDeleted(_ctx.booleanValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmTargetDeleted"));
			alarmNotifyHistoriesItem.setAlarmLevel(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmLevel"));
			alarmNotifyHistoriesItem.setAlarmEventId(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmEventId"));
			alarmNotifyHistoriesItem.setAlarmRuleName(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmRuleName"));
			alarmNotifyHistoriesItem.setSubscriberType(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].SubscriberType"));
			alarmNotifyHistoriesItem.setAlarmStatus(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmStatus"));
			alarmNotifyHistoriesItem.setDataSourceName(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].DataSourceName"));
			alarmNotifyHistoriesItem.setWorkspaceId(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].WorkspaceId"));
			alarmNotifyHistoriesItem.setSubscriberSource(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].SubscriberSource"));
			alarmNotifyHistoriesItem.setAlarmTime(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmTime"));
			alarmNotifyHistoriesItem.setAggCount(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AggCount"));
			alarmNotifyHistoriesItem.setAlarmHistoryId(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmHistoryId"));
			alarmNotifyHistoriesItem.setGmtCreate(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].GmtCreate"));
			alarmNotifyHistoriesItem.setAlarmUrl(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmUrl"));
			alarmNotifyHistoriesItem.setAlarmUrlWithDomain(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].AlarmUrlWithDomain"));
			alarmNotifyHistoriesItem.setTraceId(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].TraceId"));
			alarmNotifyHistoriesItem.setId(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].Id"));
			alarmNotifyHistoriesItem.setTenantId(_ctx.longValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].TenantId"));
			alarmNotifyHistoriesItem.setSubscriberName(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifyHistories["+ i +"].SubscriberName"));

			alarmNotifyHistories.add(alarmNotifyHistoriesItem);
		}
		queryRMSUnifiedAlarmNotifyHistoryResponse.setAlarmNotifyHistories(alarmNotifyHistories);

		List<AlarmNotifySubsItem> alarmNotifySubs = new ArrayList<AlarmNotifySubsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifySubs.Length"); i++) {
			AlarmNotifySubsItem alarmNotifySubsItem = new AlarmNotifySubsItem();
			alarmNotifySubsItem.setSubscriber(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifySubs["+ i +"].Subscriber"));
			alarmNotifySubsItem.setSubscriberSource(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifySubs["+ i +"].SubscriberSource"));
			alarmNotifySubsItem.setSubscriberType(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifySubs["+ i +"].SubscriberType"));
			alarmNotifySubsItem.setSubscriberName(_ctx.stringValue("QueryRMSUnifiedAlarmNotifyHistoryResponse.AlarmNotifySubs["+ i +"].SubscriberName"));

			alarmNotifySubs.add(alarmNotifySubsItem);
		}
		queryRMSUnifiedAlarmNotifyHistoryResponse.setAlarmNotifySubs(alarmNotifySubs);
	 
	 	return queryRMSUnifiedAlarmNotifyHistoryResponse;
	}
}