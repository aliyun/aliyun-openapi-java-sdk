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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetRuleResponse;
import com.aliyuncs.iot.model.v20180120.GetRuleResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleResponseUnmarshaller {

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext _ctx) {
		
		getRuleResponse.setRequestId(_ctx.stringValue("GetRuleResponse.RequestId"));
		getRuleResponse.setSuccess(_ctx.booleanValue("GetRuleResponse.Success"));
		getRuleResponse.setCode(_ctx.stringValue("GetRuleResponse.Code"));
		getRuleResponse.setErrorMessage(_ctx.stringValue("GetRuleResponse.ErrorMessage"));

		RuleInfo ruleInfo = new RuleInfo();
		ruleInfo.setId(_ctx.longValue("GetRuleResponse.RuleInfo.Id"));
		ruleInfo.setSelect(_ctx.stringValue("GetRuleResponse.RuleInfo.Select"));
		ruleInfo.setTopic(_ctx.stringValue("GetRuleResponse.RuleInfo.Topic"));
		ruleInfo.setShortTopic(_ctx.stringValue("GetRuleResponse.RuleInfo.ShortTopic"));
		ruleInfo.setWhere(_ctx.stringValue("GetRuleResponse.RuleInfo.Where"));
		ruleInfo.setStatus(_ctx.stringValue("GetRuleResponse.RuleInfo.Status"));
		ruleInfo.setCreateUserId(_ctx.longValue("GetRuleResponse.RuleInfo.CreateUserId"));
		ruleInfo.setProductKey(_ctx.stringValue("GetRuleResponse.RuleInfo.ProductKey"));
		ruleInfo.setName(_ctx.stringValue("GetRuleResponse.RuleInfo.Name"));
		ruleInfo.setRuleDesc(_ctx.stringValue("GetRuleResponse.RuleInfo.RuleDesc"));
		ruleInfo.setDataType(_ctx.stringValue("GetRuleResponse.RuleInfo.DataType"));
		ruleInfo.setCreated(_ctx.stringValue("GetRuleResponse.RuleInfo.Created"));
		ruleInfo.setUtcCreated(_ctx.stringValue("GetRuleResponse.RuleInfo.UtcCreated"));
		ruleInfo.setModified(_ctx.stringValue("GetRuleResponse.RuleInfo.Modified"));
		ruleInfo.setUtcModified(_ctx.stringValue("GetRuleResponse.RuleInfo.UtcModified"));
		ruleInfo.setTopicType(_ctx.integerValue("GetRuleResponse.RuleInfo.TopicType"));
		getRuleResponse.setRuleInfo(ruleInfo);
	 
	 	return getRuleResponse;
	}
}