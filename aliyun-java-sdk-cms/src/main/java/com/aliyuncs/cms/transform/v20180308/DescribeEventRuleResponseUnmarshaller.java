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

import com.aliyuncs.cms.model.v20180308.DescribeEventRuleResponse;
import com.aliyuncs.cms.model.v20180308.DescribeEventRuleResponse.Result;
import com.aliyuncs.cms.model.v20180308.DescribeEventRuleResponse.Result.EventPattern;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventRuleResponseUnmarshaller {

	public static DescribeEventRuleResponse unmarshall(DescribeEventRuleResponse describeEventRuleResponse, UnmarshallerContext context) {
		
		describeEventRuleResponse.setRequestId(context.stringValue("DescribeEventRuleResponse.RequestId"));
		describeEventRuleResponse.setSuccess(context.booleanValue("DescribeEventRuleResponse.Success"));
		describeEventRuleResponse.setCode(context.stringValue("DescribeEventRuleResponse.Code"));
		describeEventRuleResponse.setMessage(context.stringValue("DescribeEventRuleResponse.Message"));

		Result result = new Result();
		result.setDescription(context.stringValue("DescribeEventRuleResponse.Result.Description"));
		result.setName(context.stringValue("DescribeEventRuleResponse.Result.Name"));
		result.setEventType(context.stringValue("DescribeEventRuleResponse.Result.EventType"));
		result.setGroupId(context.stringValue("DescribeEventRuleResponse.Result.GroupId"));
		result.setState(context.stringValue("DescribeEventRuleResponse.Result.State"));

		EventPattern eventPattern = new EventPattern();
		eventPattern.setProduct(context.stringValue("DescribeEventRuleResponse.Result.EventPattern.Product"));

		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleResponse.Result.EventPattern.NameList.Length"); i++) {
			nameList.add(context.stringValue("DescribeEventRuleResponse.Result.EventPattern.NameList["+ i +"]"));
		}
		eventPattern.setNameList(nameList);

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleResponse.Result.EventPattern.StatusList.Length"); i++) {
			statusList.add(context.stringValue("DescribeEventRuleResponse.Result.EventPattern.StatusList["+ i +"]"));
		}
		eventPattern.setStatusList(statusList);

		List<String> levelList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleResponse.Result.EventPattern.LevelList.Length"); i++) {
			levelList.add(context.stringValue("DescribeEventRuleResponse.Result.EventPattern.LevelList["+ i +"]"));
		}
		eventPattern.setLevelList(levelList);
		result.setEventPattern(eventPattern);
		describeEventRuleResponse.setResult(result);
	 
	 	return describeEventRuleResponse;
	}
}