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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.GroupRule;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRulesItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRulesItem.MatchingConditionsItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyObjectsItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateNotificationPolicyResponseUnmarshaller {

	public static CreateOrUpdateNotificationPolicyResponse unmarshall(CreateOrUpdateNotificationPolicyResponse createOrUpdateNotificationPolicyResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateNotificationPolicyResponse.setRequestId(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.RequestId"));

		NotificationPolicy notificationPolicy = new NotificationPolicy();
		notificationPolicy.setId(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.Id"));
		notificationPolicy.setName(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.Name"));
		notificationPolicy.setSendRecoverMessage(_ctx.booleanValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.SendRecoverMessage"));
		notificationPolicy.setEscalationPolicyId(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.EscalationPolicyId"));
		notificationPolicy.setRepeat(_ctx.booleanValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.Repeat"));
		notificationPolicy.setRepeatInterval(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.RepeatInterval"));
		notificationPolicy.setIntegrationId(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.IntegrationId"));

		GroupRule groupRule = new GroupRule();
		groupRule.setGroupWait(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.GroupRule.GroupWait"));
		groupRule.setGroupInterval(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.GroupRule.GroupInterval"));

		List<String> groupingFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.GroupRule.GroupingFields.Length"); i++) {
			groupingFields.add(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.GroupRule.GroupingFields["+ i +"]"));
		}
		groupRule.setGroupingFields(groupingFields);
		notificationPolicy.setGroupRule(groupRule);

		NotifyRule notifyRule = new NotifyRule();
		notifyRule.setNotifyStartTime(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyStartTime"));
		notifyRule.setNotifyEndTime(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyEndTime"));

		List<String> notifyChannels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyChannels.Length"); i++) {
			notifyChannels.add(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyChannels["+ i +"]"));
		}
		notifyRule.setNotifyChannels(notifyChannels);

		List<NotifyObjectsItem> notifyObjects = new ArrayList<NotifyObjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyObjects.Length"); i++) {
			NotifyObjectsItem notifyObjectsItem = new NotifyObjectsItem();
			notifyObjectsItem.setNotifyObjectType(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyObjects["+ i +"].NotifyObjectType"));
			notifyObjectsItem.setNotifyObjectId(_ctx.longValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyObjects["+ i +"].NotifyObjectId"));
			notifyObjectsItem.setNotifyObjectName(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyRule.NotifyObjects["+ i +"].NotifyObjectName"));

			notifyObjects.add(notifyObjectsItem);
		}
		notifyRule.setNotifyObjects(notifyObjects);
		notificationPolicy.setNotifyRule(notifyRule);

		NotifyTemplate notifyTemplate = new NotifyTemplate();
		notifyTemplate.setEmailTitle(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.EmailTitle"));
		notifyTemplate.setEmailContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.EmailContent"));
		notifyTemplate.setEmailRecoverTitle(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.EmailRecoverTitle"));
		notifyTemplate.setEmailRecoverContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.EmailRecoverContent"));
		notifyTemplate.setSmsContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.SmsContent"));
		notifyTemplate.setSmsRecoverContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.SmsRecoverContent"));
		notifyTemplate.setTtsContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.TtsContent"));
		notifyTemplate.setTtsRecoverContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.TtsRecoverContent"));
		notifyTemplate.setRobotContent(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.NotifyTemplate.RobotContent"));
		notificationPolicy.setNotifyTemplate(notifyTemplate);

		List<MatchingRulesItem> matchingRules = new ArrayList<MatchingRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRules.Length"); i++) {
			MatchingRulesItem matchingRulesItem = new MatchingRulesItem();

			List<MatchingConditionsItem> matchingConditions = new ArrayList<MatchingConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRules["+ i +"].MatchingConditions.Length"); j++) {
				MatchingConditionsItem matchingConditionsItem = new MatchingConditionsItem();
				matchingConditionsItem.setKey(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRules["+ i +"].MatchingConditions["+ j +"].Key"));
				matchingConditionsItem.setValue(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRules["+ i +"].MatchingConditions["+ j +"].Value"));
				matchingConditionsItem.setOperator(_ctx.stringValue("CreateOrUpdateNotificationPolicyResponse.NotificationPolicy.MatchingRules["+ i +"].MatchingConditions["+ j +"].Operator"));

				matchingConditions.add(matchingConditionsItem);
			}
			matchingRulesItem.setMatchingConditions(matchingConditions);

			matchingRules.add(matchingRulesItem);
		}
		notificationPolicy.setMatchingRules(matchingRules);
		createOrUpdateNotificationPolicyResponse.setNotificationPolicy(notificationPolicy);
	 
	 	return createOrUpdateNotificationPolicyResponse;
	}
}