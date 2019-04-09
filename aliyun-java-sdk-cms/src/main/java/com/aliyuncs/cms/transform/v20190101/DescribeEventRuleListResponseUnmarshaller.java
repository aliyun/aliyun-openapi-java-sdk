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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeEventRuleListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleListResponse.EventRule;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleListResponse.EventRule.EventPatternItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventRuleListResponseUnmarshaller {

	public static DescribeEventRuleListResponse unmarshall(DescribeEventRuleListResponse describeEventRuleListResponse, UnmarshallerContext context) {
		
		describeEventRuleListResponse.setRequestId(context.stringValue("DescribeEventRuleListResponse.RequestId"));
		describeEventRuleListResponse.setSuccess(context.booleanValue("DescribeEventRuleListResponse.Success"));
		describeEventRuleListResponse.setCode(context.stringValue("DescribeEventRuleListResponse.Code"));
		describeEventRuleListResponse.setMessage(context.stringValue("DescribeEventRuleListResponse.Message"));
		describeEventRuleListResponse.setTotal(context.integerValue("DescribeEventRuleListResponse.Total"));

		List<EventRule> eventRules = new ArrayList<EventRule>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleListResponse.EventRules.Length"); i++) {
			EventRule eventRule = new EventRule();
			eventRule.setName(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].Name"));
			eventRule.setGroupId(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].GroupId"));
			eventRule.setEventType(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventType"));
			eventRule.setState(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].State"));
			eventRule.setDescription(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].Description"));

			List<EventPatternItem> eventPattern = new ArrayList<EventPatternItem>();
			for (int j = 0; j < context.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern.Length"); j++) {
				EventPatternItem eventPatternItem = new EventPatternItem();
				eventPatternItem.setProduct(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].Product"));

				List<String> nameList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].NameList.Length"); k++) {
					nameList.add(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].NameList["+ k +"]"));
				}
				eventPatternItem.setNameList(nameList);

				List<String> levelList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].LevelList.Length"); k++) {
					levelList.add(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].LevelList["+ k +"]"));
				}
				eventPatternItem.setLevelList(levelList);

				List<String> eventTypeList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].EventTypeList.Length"); k++) {
					eventTypeList.add(context.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].EventTypeList["+ k +"]"));
				}
				eventPatternItem.setEventTypeList(eventTypeList);

				eventPattern.add(eventPatternItem);
			}
			eventRule.setEventPattern(eventPattern);

			eventRules.add(eventRule);
		}
		describeEventRuleListResponse.setEventRules(eventRules);
	 
	 	return describeEventRuleListResponse;
	}
}