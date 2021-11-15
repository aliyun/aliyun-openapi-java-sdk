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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListRuleResponse;
import com.aliyuncs.unimkt.model.v20181212.ListRuleResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleResponseUnmarshaller {

	public static ListRuleResponse unmarshall(ListRuleResponse listRuleResponse, UnmarshallerContext _ctx) {
		
		listRuleResponse.setRequestId(_ctx.stringValue("ListRuleResponse.RequestId"));
		listRuleResponse.setSuccess(_ctx.booleanValue("ListRuleResponse.Success"));
		listRuleResponse.setCode(_ctx.stringValue("ListRuleResponse.Code"));
		listRuleResponse.setMessage(_ctx.stringValue("ListRuleResponse.Message"));
		listRuleResponse.setPageNumber(_ctx.integerValue("ListRuleResponse.PageNumber"));
		listRuleResponse.setPageSize(_ctx.integerValue("ListRuleResponse.PageSize"));
		listRuleResponse.setTotal(_ctx.longValue("ListRuleResponse.Total"));

		List<Rule> model = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListRuleResponse.Model.Length"); i++) {
			Rule rule = new Rule();
			rule.setStatus(_ctx.stringValue("ListRuleResponse.Model["+ i +"].Status"));
			rule.setRuleType(_ctx.stringValue("ListRuleResponse.Model["+ i +"].RuleType"));
			rule.setCreateTime(_ctx.longValue("ListRuleResponse.Model["+ i +"].CreateTime"));
			rule.setRuleRId(_ctx.stringValue("ListRuleResponse.Model["+ i +"].RuleRId"));
			rule.setRelatedAdSlots(_ctx.stringValue("ListRuleResponse.Model["+ i +"].RelatedAdSlots"));
			rule.setExtInfo(_ctx.stringValue("ListRuleResponse.Model["+ i +"].ExtInfo"));
			rule.setRuleName(_ctx.stringValue("ListRuleResponse.Model["+ i +"].RuleName"));
			rule.setRuleId(_ctx.stringValue("ListRuleResponse.Model["+ i +"].RuleId"));
			rule.setVersion(_ctx.longValue("ListRuleResponse.Model["+ i +"].Version"));
			rule.setModifyTime(_ctx.longValue("ListRuleResponse.Model["+ i +"].ModifyTime"));
			rule.setTenantId(_ctx.stringValue("ListRuleResponse.Model["+ i +"].TenantId"));
			rule.setRuleConfig(_ctx.stringValue("ListRuleResponse.Model["+ i +"].RuleConfig"));

			model.add(rule);
		}
		listRuleResponse.setModel(model);
	 
	 	return listRuleResponse;
	}
}