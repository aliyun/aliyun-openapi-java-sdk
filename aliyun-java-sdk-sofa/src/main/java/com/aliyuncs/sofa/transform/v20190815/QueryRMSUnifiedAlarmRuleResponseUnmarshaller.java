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

import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmRuleResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRMSUnifiedAlarmRuleResponse.AlarmRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRMSUnifiedAlarmRuleResponseUnmarshaller {

	public static QueryRMSUnifiedAlarmRuleResponse unmarshall(QueryRMSUnifiedAlarmRuleResponse queryRMSUnifiedAlarmRuleResponse, UnmarshallerContext _ctx) {
		
		queryRMSUnifiedAlarmRuleResponse.setRequestId(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.RequestId"));
		queryRMSUnifiedAlarmRuleResponse.setCurrentPage(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.CurrentPage"));
		queryRMSUnifiedAlarmRuleResponse.setResultMessage(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.ResultMessage"));
		queryRMSUnifiedAlarmRuleResponse.setResultCode(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.ResultCode"));
		queryRMSUnifiedAlarmRuleResponse.setPageSize(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.PageSize"));
		queryRMSUnifiedAlarmRuleResponse.setTotalCount(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.TotalCount"));

		List<AlarmRulesItem> alarmRules = new ArrayList<AlarmRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules.Length"); i++) {
			AlarmRulesItem alarmRulesItem = new AlarmRulesItem();
			alarmRulesItem.setStatus(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Status"));
			alarmRulesItem.setNotifyTplId(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].NotifyTplId"));
			alarmRulesItem.setChannels(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Channels"));
			alarmRulesItem.setNotifyFiring(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].NotifyFiring"));
			alarmRulesItem.setGmtModified(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].GmtModified"));
			alarmRulesItem.setNotifyEmpty(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].NotifyEmpty"));
			alarmRulesItem.setCreator(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Creator"));
			alarmRulesItem.setNotifyTimeFilter(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].NotifyTimeFilter"));
			alarmRulesItem.setModifier(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Modifier"));
			alarmRulesItem.setNotifyRecovered(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].NotifyRecovered"));
			alarmRulesItem.setSuspendedStartTime(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].SuspendedStartTime"));
			alarmRulesItem.setDeleted(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Deleted"));
			alarmRulesItem.setSuspendedReason(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].SuspendedReason"));
			alarmRulesItem.setPendingHit(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].PendingHit"));
			alarmRulesItem.setName(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Name"));
			alarmRulesItem.setRecoveredHit(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].RecoveredHit"));
			alarmRulesItem.setAlarmEmpty(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].AlarmEmpty"));
			alarmRulesItem.setSilenceTime(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].SilenceTime"));
			alarmRulesItem.setAlarmStatus(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].AlarmStatus"));
			alarmRulesItem.setEmergency(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Emergency"));
			alarmRulesItem.setSourceId(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].SourceId"));
			alarmRulesItem.setSuspendedEndTime(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].SuspendedEndTime"));
			alarmRulesItem.setStep(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Step"));
			alarmRulesItem.setWorkspaceId(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].WorkspaceId"));
			alarmRulesItem.setUniqueIdentity(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].UniqueIdentity"));
			alarmRulesItem.setTimeZone(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].TimeZone"));
			alarmRulesItem.setEmergencyUrl(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].EmergencyUrl"));
			alarmRulesItem.setGmtCreate(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].GmtCreate"));
			alarmRulesItem.setCategory(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Category"));
			alarmRulesItem.setLevel(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Level"));
			alarmRulesItem.setId(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].Id"));
			alarmRulesItem.setTenantId(_ctx.longValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].TenantId"));
			alarmRulesItem.setRuleConfig(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].RuleConfig"));

			List<String> conditionsDes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].ConditionsDes.Length"); j++) {
				conditionsDes.add(_ctx.stringValue("QueryRMSUnifiedAlarmRuleResponse.AlarmRules["+ i +"].ConditionsDes["+ j +"]"));
			}
			alarmRulesItem.setConditionsDes(conditionsDes);

			alarmRules.add(alarmRulesItem);
		}
		queryRMSUnifiedAlarmRuleResponse.setAlarmRules(alarmRules);
	 
	 	return queryRMSUnifiedAlarmRuleResponse;
	}
}