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

	public static DescribeEventRuleListResponse unmarshall(DescribeEventRuleListResponse describeEventRuleListResponse, UnmarshallerContext _ctx) {
		
		describeEventRuleListResponse.setRequestId(_ctx.stringValue("DescribeEventRuleListResponse.RequestId"));
		describeEventRuleListResponse.setSuccess(_ctx.booleanValue("DescribeEventRuleListResponse.Success"));
		describeEventRuleListResponse.setCode(_ctx.stringValue("DescribeEventRuleListResponse.Code"));
		describeEventRuleListResponse.setMessage(_ctx.stringValue("DescribeEventRuleListResponse.Message"));
		describeEventRuleListResponse.setTotal(_ctx.integerValue("DescribeEventRuleListResponse.Total"));

		List<EventRule> eventRules = new ArrayList<EventRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventRuleListResponse.EventRules.Length"); i++) {
			EventRule eventRule = new EventRule();
			eventRule.setName(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].Name"));
			eventRule.setGroupId(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].GroupId"));
			eventRule.setEventType(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventType"));
			eventRule.setState(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].State"));
			eventRule.setDescription(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].Description"));

			List<EventPatternItem> eventPattern = new ArrayList<EventPatternItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern.Length"); j++) {
				EventPatternItem eventPatternItem = new EventPatternItem();
				eventPatternItem.setProduct(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].Product"));

				List<String> nameList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].NameList.Length"); k++) {
					nameList.add(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].NameList["+ k +"]"));
				}
				eventPatternItem.setNameList(nameList);

				List<String> levelList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].LevelList.Length"); k++) {
					levelList.add(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].LevelList["+ k +"]"));
				}
				eventPatternItem.setLevelList(levelList);

				List<String> eventTypeList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].EventTypeList.Length"); k++) {
					eventTypeList.add(_ctx.stringValue("DescribeEventRuleListResponse.EventRules["+ i +"].EventPattern["+ j +"].EventTypeList["+ k +"]"));
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