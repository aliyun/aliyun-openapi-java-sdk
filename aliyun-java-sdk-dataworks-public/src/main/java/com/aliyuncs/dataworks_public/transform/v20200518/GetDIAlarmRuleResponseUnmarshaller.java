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

import com.aliyuncs.dataworks_public.model.v20200518.GetDIAlarmRuleResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIAlarmRuleResponse.DIAlarmRule;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationChannel;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationReceiver;
import com.aliyuncs.dataworks_public.model.v20200518.GetDIAlarmRuleResponse.DIAlarmRule.TriggerCondition;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDIAlarmRuleResponseUnmarshaller {

	public static GetDIAlarmRuleResponse unmarshall(GetDIAlarmRuleResponse getDIAlarmRuleResponse, UnmarshallerContext _ctx) {
		
		getDIAlarmRuleResponse.setRequestId(_ctx.stringValue("GetDIAlarmRuleResponse.RequestId"));

		DIAlarmRule dIAlarmRule = new DIAlarmRule();
		dIAlarmRule.setDIAlarmRuleId(_ctx.longValue("GetDIAlarmRuleResponse.DIAlarmRule.DIAlarmRuleId"));
		dIAlarmRule.setDIJobId(_ctx.longValue("GetDIAlarmRuleResponse.DIAlarmRule.DIJobId"));
		dIAlarmRule.setDescription(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.Description"));
		dIAlarmRule.setMetricType(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.MetricType"));
		dIAlarmRule.setEnabled(_ctx.booleanValue("GetDIAlarmRuleResponse.DIAlarmRule.Enabled"));
		dIAlarmRule.setCreatedUid(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.CreatedUid"));
		dIAlarmRule.setCreatedTime(_ctx.longValue("GetDIAlarmRuleResponse.DIAlarmRule.CreatedTime"));
		dIAlarmRule.setUpdatedUid(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.UpdatedUid"));
		dIAlarmRule.setUpdatedTime(_ctx.longValue("GetDIAlarmRuleResponse.DIAlarmRule.UpdatedTime"));

		NotificationSettings notificationSettings = new NotificationSettings();
		notificationSettings.setInhibitionInterval(_ctx.integerValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.InhibitionInterval"));

		List<NotificationChannel> notificationChannels = new ArrayList<NotificationChannel>();
		for (int i = 0; i < _ctx.lengthValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationChannels.Length"); i++) {
			NotificationChannel notificationChannel = new NotificationChannel();
			notificationChannel.setSeverity(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationChannels["+ i +"].Severity"));

			List<String> channels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationChannels["+ i +"].Channels.Length"); j++) {
				channels.add(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationChannels["+ i +"].Channels["+ j +"]"));
			}
			notificationChannel.setChannels(channels);

			notificationChannels.add(notificationChannel);
		}
		notificationSettings.setNotificationChannels(notificationChannels);

		List<NotificationReceiver> notificationReceivers = new ArrayList<NotificationReceiver>();
		for (int i = 0; i < _ctx.lengthValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationReceivers.Length"); i++) {
			NotificationReceiver notificationReceiver = new NotificationReceiver();
			notificationReceiver.setReceiverType(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationReceivers["+ i +"].ReceiverType"));

			List<String> receiverValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationReceivers["+ i +"].ReceiverValues.Length"); j++) {
				receiverValues.add(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.NotificationSettings.NotificationReceivers["+ i +"].ReceiverValues["+ j +"]"));
			}
			notificationReceiver.setReceiverValues(receiverValues);

			notificationReceivers.add(notificationReceiver);
		}
		notificationSettings.setNotificationReceivers(notificationReceivers);
		dIAlarmRule.setNotificationSettings(notificationSettings);

		List<TriggerCondition> triggerConditions = new ArrayList<TriggerCondition>();
		for (int i = 0; i < _ctx.lengthValue("GetDIAlarmRuleResponse.DIAlarmRule.TriggerConditions.Length"); i++) {
			TriggerCondition triggerCondition = new TriggerCondition();
			triggerCondition.setSeverity(_ctx.stringValue("GetDIAlarmRuleResponse.DIAlarmRule.TriggerConditions["+ i +"].Severity"));
			triggerCondition.setDuration(_ctx.longValue("GetDIAlarmRuleResponse.DIAlarmRule.TriggerConditions["+ i +"].Duration"));
			triggerCondition.setThreshold(_ctx.longValue("GetDIAlarmRuleResponse.DIAlarmRule.TriggerConditions["+ i +"].Threshold"));

			triggerConditions.add(triggerCondition);
		}
		dIAlarmRule.setTriggerConditions(triggerConditions);
		getDIAlarmRuleResponse.setDIAlarmRule(dIAlarmRule);
	 
	 	return getDIAlarmRuleResponse;
	}
}