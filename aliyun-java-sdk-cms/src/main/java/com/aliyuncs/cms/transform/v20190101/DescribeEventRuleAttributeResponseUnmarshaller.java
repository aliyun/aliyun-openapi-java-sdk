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

import com.aliyuncs.cms.model.v20190101.DescribeEventRuleAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleAttributeResponse.Result;
import com.aliyuncs.cms.model.v20190101.DescribeEventRuleAttributeResponse.Result.EventPattern;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventRuleAttributeResponseUnmarshaller {

	public static DescribeEventRuleAttributeResponse unmarshall(DescribeEventRuleAttributeResponse describeEventRuleAttributeResponse, UnmarshallerContext context) {
		
		describeEventRuleAttributeResponse.setRequestId(context.stringValue("DescribeEventRuleAttributeResponse.RequestId"));
		describeEventRuleAttributeResponse.setSuccess(context.booleanValue("DescribeEventRuleAttributeResponse.Success"));
		describeEventRuleAttributeResponse.setCode(context.stringValue("DescribeEventRuleAttributeResponse.Code"));
		describeEventRuleAttributeResponse.setMessage(context.stringValue("DescribeEventRuleAttributeResponse.Message"));

		Result result = new Result();
		result.setDescription(context.stringValue("DescribeEventRuleAttributeResponse.Result.Description"));
		result.setName(context.stringValue("DescribeEventRuleAttributeResponse.Result.Name"));
		result.setEventType(context.stringValue("DescribeEventRuleAttributeResponse.Result.EventType"));
		result.setGroupId(context.stringValue("DescribeEventRuleAttributeResponse.Result.GroupId"));
		result.setState(context.stringValue("DescribeEventRuleAttributeResponse.Result.State"));

		EventPattern eventPattern = new EventPattern();
		eventPattern.setProduct(context.stringValue("DescribeEventRuleAttributeResponse.Result.EventPattern.Product"));

		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleAttributeResponse.Result.EventPattern.NameList.Length"); i++) {
			nameList.add(context.stringValue("DescribeEventRuleAttributeResponse.Result.EventPattern.NameList["+ i +"]"));
		}
		eventPattern.setNameList(nameList);

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleAttributeResponse.Result.EventPattern.StatusList.Length"); i++) {
			statusList.add(context.stringValue("DescribeEventRuleAttributeResponse.Result.EventPattern.StatusList["+ i +"]"));
		}
		eventPattern.setStatusList(statusList);

		List<String> levelList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEventRuleAttributeResponse.Result.EventPattern.LevelList.Length"); i++) {
			levelList.add(context.stringValue("DescribeEventRuleAttributeResponse.Result.EventPattern.LevelList["+ i +"]"));
		}
		eventPattern.setLevelList(levelList);
		result.setEventPattern(eventPattern);
		describeEventRuleAttributeResponse.setResult(result);
	 
	 	return describeEventRuleAttributeResponse;
	}
}