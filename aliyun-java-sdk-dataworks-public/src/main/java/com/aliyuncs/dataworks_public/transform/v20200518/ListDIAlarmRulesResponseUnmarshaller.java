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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse.DIAlarmRulePaging;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRule;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRule.NotificationSettings;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRule.NotificationSettings.NotificationChannel;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRule.NotificationSettings.NotificationReceiver;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRule.TriggerCondition;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDIAlarmRulesResponseUnmarshaller {

	public static ListDIAlarmRulesResponse unmarshall(ListDIAlarmRulesResponse listDIAlarmRulesResponse, UnmarshallerContext _ctx) {
		
		listDIAlarmRulesResponse.setRequestId(_ctx.stringValue("ListDIAlarmRulesResponse.RequestId"));

		DIAlarmRulePaging dIAlarmRulePaging = new DIAlarmRulePaging();
		dIAlarmRulePaging.setTotalCount(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.TotalCount"));
		dIAlarmRulePaging.setPageNumber(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.PageNumber"));
		dIAlarmRulePaging.setPageSize(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.PageSize"));

		List<DIJobAlarmRule> dIJobAlarmRules = new ArrayList<DIJobAlarmRule>();
		for (int i = 0; i < _ctx.lengthValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules.Length"); i++) {
			DIJobAlarmRule dIJobAlarmRule = new DIJobAlarmRule();
			dIJobAlarmRule.setDIAlarmRuleId(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].DIAlarmRuleId"));
			dIJobAlarmRule.setDIJobId(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].DIJobId"));
			dIJobAlarmRule.setDescription(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].Description"));
			dIJobAlarmRule.setMetricType(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].MetricType"));
			dIJobAlarmRule.setEnabled(_ctx.booleanValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].Enabled"));

			NotificationSettings notificationSettings = new NotificationSettings();
			notificationSettings.setInhibitionInterval(_ctx.integerValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.InhibitionInterval"));

			List<NotificationChannel> notificationChannels = new ArrayList<NotificationChannel>();
			for (int j = 0; j < _ctx.lengthValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationChannels.Length"); j++) {
				NotificationChannel notificationChannel = new NotificationChannel();
				notificationChannel.setSeverity(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationChannels["+ j +"].Severity"));

				List<String> channels = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationChannels["+ j +"].Channels.Length"); k++) {
					channels.add(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationChannels["+ j +"].Channels["+ k +"]"));
				}
				notificationChannel.setChannels(channels);

				notificationChannels.add(notificationChannel);
			}
			notificationSettings.setNotificationChannels(notificationChannels);

			List<NotificationReceiver> notificationReceivers = new ArrayList<NotificationReceiver>();
			for (int j = 0; j < _ctx.lengthValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationReceivers.Length"); j++) {
				NotificationReceiver notificationReceiver = new NotificationReceiver();
				notificationReceiver.setReceiverType(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationReceivers["+ j +"].ReceiverType"));

				List<String> receiverValues = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationReceivers["+ j +"].ReceiverValues.Length"); k++) {
					receiverValues.add(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].NotificationSettings.NotificationReceivers["+ j +"].ReceiverValues["+ k +"]"));
				}
				notificationReceiver.setReceiverValues(receiverValues);

				notificationReceivers.add(notificationReceiver);
			}
			notificationSettings.setNotificationReceivers(notificationReceivers);
			dIJobAlarmRule.setNotificationSettings(notificationSettings);

			List<TriggerCondition> triggerConditions = new ArrayList<TriggerCondition>();
			for (int j = 0; j < _ctx.lengthValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].TriggerConditions.Length"); j++) {
				TriggerCondition triggerCondition = new TriggerCondition();
				triggerCondition.setSeverity(_ctx.stringValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].TriggerConditions["+ j +"].Severity"));
				triggerCondition.setDuration(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].TriggerConditions["+ j +"].Duration"));
				triggerCondition.setThreshold(_ctx.longValue("ListDIAlarmRulesResponse.DIAlarmRulePaging.DIJobAlarmRules["+ i +"].TriggerConditions["+ j +"].Threshold"));

				triggerConditions.add(triggerCondition);
			}
			dIJobAlarmRule.setTriggerConditions(triggerConditions);

			dIJobAlarmRules.add(dIJobAlarmRule);
		}
		dIAlarmRulePaging.setDIJobAlarmRules(dIJobAlarmRules);
		listDIAlarmRulesResponse.setDIAlarmRulePaging(dIAlarmRulePaging);
	 
	 	return listDIAlarmRulesResponse;
	}
}