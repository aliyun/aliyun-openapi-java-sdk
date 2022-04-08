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

import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies.GroupRule;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies.MatchingRulesItem;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies.MatchingRulesItem.MatchingConditionsItem;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies.NotifyRule;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies.NotifyRule.NotifyObjectsItem;
import com.aliyuncs.arms.model.v20190808.ListNotificationPoliciesResponse.PageBean.Policies.NotifyTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotificationPoliciesResponseUnmarshaller {

	public static ListNotificationPoliciesResponse unmarshall(ListNotificationPoliciesResponse listNotificationPoliciesResponse, UnmarshallerContext _ctx) {
		
		listNotificationPoliciesResponse.setRequestId(_ctx.stringValue("ListNotificationPoliciesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.Size"));

		List<Policies> notificationPolicies = new ArrayList<Policies>();
		for (int i = 0; i < _ctx.lengthValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies.Length"); i++) {
			Policies policies = new Policies();
			policies.setId(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].Id"));
			policies.setName(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].Name"));
			policies.setSendRecoverMessage(_ctx.booleanValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].SendRecoverMessage"));
			policies.setRepeat(_ctx.booleanValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].Repeat"));
			policies.setRepeatInterval(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].RepeatInterval"));
			policies.setEscalationPolicyId(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].EscalationPolicyId"));
			policies.setIntegrationId(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].IntegrationId"));

			GroupRule groupRule = new GroupRule();
			groupRule.setGroupWait(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].GroupRule.GroupWait"));
			groupRule.setGroupInterval(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].GroupRule.GroupInterval"));

			List<String> groupingFields = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].GroupRule.GroupingFields.Length"); j++) {
				groupingFields.add(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].GroupRule.GroupingFields["+ j +"]"));
			}
			groupRule.setGroupingFields(groupingFields);
			policies.setGroupRule(groupRule);

			NotifyRule notifyRule = new NotifyRule();
			notifyRule.setNotifyStartTime(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyStartTime"));
			notifyRule.setNotifyEndTime(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyEndTime"));

			List<String> notifyChannels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyChannels.Length"); j++) {
				notifyChannels.add(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyChannels["+ j +"]"));
			}
			notifyRule.setNotifyChannels(notifyChannels);

			List<NotifyObjectsItem> notifyObjects = new ArrayList<NotifyObjectsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyObjects.Length"); j++) {
				NotifyObjectsItem notifyObjectsItem = new NotifyObjectsItem();
				notifyObjectsItem.setNotifyObjectType(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyObjects["+ j +"].NotifyObjectType"));
				notifyObjectsItem.setNotifyObjectId(_ctx.longValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyObjects["+ j +"].NotifyObjectId"));
				notifyObjectsItem.setNotifyObjectName(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyRule.NotifyObjects["+ j +"].NotifyObjectName"));

				notifyObjects.add(notifyObjectsItem);
			}
			notifyRule.setNotifyObjects(notifyObjects);
			policies.setNotifyRule(notifyRule);

			NotifyTemplate notifyTemplate = new NotifyTemplate();
			notifyTemplate.setEmailTitle(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.EmailTitle"));
			notifyTemplate.setEmailContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.EmailContent"));
			notifyTemplate.setEmailRecoverTitle(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.EmailRecoverTitle"));
			notifyTemplate.setEmailRecoverContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.EmailRecoverContent"));
			notifyTemplate.setSmsContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.SmsContent"));
			notifyTemplate.setSmsRecoverContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.SmsRecoverContent"));
			notifyTemplate.setTtsContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.TtsContent"));
			notifyTemplate.setTtsRecoverContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.TtsRecoverContent"));
			notifyTemplate.setRobotContent(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].NotifyTemplate.RobotContent"));
			policies.setNotifyTemplate(notifyTemplate);

			List<MatchingRulesItem> matchingRules = new ArrayList<MatchingRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].MatchingRules.Length"); j++) {
				MatchingRulesItem matchingRulesItem = new MatchingRulesItem();

				List<MatchingConditionsItem> matchingConditions = new ArrayList<MatchingConditionsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions.Length"); k++) {
					MatchingConditionsItem matchingConditionsItem = new MatchingConditionsItem();
					matchingConditionsItem.setKey(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions["+ k +"].Key"));
					matchingConditionsItem.setValue(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions["+ k +"].Value"));
					matchingConditionsItem.setOperator(_ctx.stringValue("ListNotificationPoliciesResponse.PageBean.NotificationPolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions["+ k +"].Operator"));

					matchingConditions.add(matchingConditionsItem);
				}
				matchingRulesItem.setMatchingConditions(matchingConditions);

				matchingRules.add(matchingRulesItem);
			}
			policies.setMatchingRules(matchingRules);

			notificationPolicies.add(policies);
		}
		pageBean.setNotificationPolicies(notificationPolicies);
		listNotificationPoliciesResponse.setPageBean(pageBean);
	 
	 	return listNotificationPoliciesResponse;
	}
}