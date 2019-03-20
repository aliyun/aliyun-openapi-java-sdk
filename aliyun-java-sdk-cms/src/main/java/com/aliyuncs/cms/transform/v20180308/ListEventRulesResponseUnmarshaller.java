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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListEventRulesResponse;
import com.aliyuncs.cms.model.v20180308.ListEventRulesResponse.EventRule;
import com.aliyuncs.cms.model.v20180308.ListEventRulesResponse.EventRule.EventPatternItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventRulesResponseUnmarshaller {

	public static ListEventRulesResponse unmarshall(ListEventRulesResponse listEventRulesResponse, UnmarshallerContext context) {
		
		listEventRulesResponse.setRequestId(context.stringValue("ListEventRulesResponse.RequestId"));
		listEventRulesResponse.setSuccess(context.booleanValue("ListEventRulesResponse.Success"));
		listEventRulesResponse.setCode(context.stringValue("ListEventRulesResponse.Code"));
		listEventRulesResponse.setMessage(context.stringValue("ListEventRulesResponse.Message"));
		listEventRulesResponse.setTotal(context.integerValue("ListEventRulesResponse.Total"));
		listEventRulesResponse.setCurrentPage(context.integerValue("ListEventRulesResponse.CurrentPage"));
		listEventRulesResponse.setNextToken(context.stringValue("ListEventRulesResponse.NextToken"));

		List<EventRule> datapoints = new ArrayList<EventRule>();
		for (int i = 0; i < context.lengthValue("ListEventRulesResponse.Datapoints.Length"); i++) {
			EventRule eventRule = new EventRule();
			eventRule.setName(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].Name"));
			eventRule.setGroupId(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].GroupId"));
			eventRule.setEventType(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].EventType"));
			eventRule.setState(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].State"));
			eventRule.setDescription(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].Description"));

			List<EventPatternItem> eventPattern = new ArrayList<EventPatternItem>();
			for (int j = 0; j < context.lengthValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern.Length"); j++) {
				EventPatternItem eventPatternItem = new EventPatternItem();
				eventPatternItem.setProduct(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].Product"));

				List<String> nameList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].NameList.Length"); k++) {
					nameList.add(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].NameList["+ k +"]"));
				}
				eventPatternItem.setNameList(nameList);

				List<String> statusList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].StatusList.Length"); k++) {
					statusList.add(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].StatusList["+ k +"]"));
				}
				eventPatternItem.setStatusList(statusList);

				List<String> levelList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].LevelList.Length"); k++) {
					levelList.add(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].LevelList["+ k +"]"));
				}
				eventPatternItem.setLevelList(levelList);

				List<String> eventTypeList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].EventTypeList.Length"); k++) {
					eventTypeList.add(context.stringValue("ListEventRulesResponse.Datapoints["+ i +"].EventPattern["+ j +"].EventTypeList["+ k +"]"));
				}
				eventPatternItem.setEventTypeList(eventTypeList);

				eventPattern.add(eventPatternItem);
			}
			eventRule.setEventPattern(eventPattern);

			datapoints.add(eventRule);
		}
		listEventRulesResponse.setDatapoints(datapoints);
	 
	 	return listEventRulesResponse;
	}
}