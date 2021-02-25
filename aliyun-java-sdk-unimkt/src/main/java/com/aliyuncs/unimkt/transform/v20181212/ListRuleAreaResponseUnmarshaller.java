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

import com.aliyuncs.unimkt.model.v20181212.ListRuleAreaResponse;
import com.aliyuncs.unimkt.model.v20181212.ListRuleAreaResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleAreaResponseUnmarshaller {

	public static ListRuleAreaResponse unmarshall(ListRuleAreaResponse listRuleAreaResponse, UnmarshallerContext _ctx) {
		
		listRuleAreaResponse.setRequestId(_ctx.stringValue("ListRuleAreaResponse.RequestId"));
		listRuleAreaResponse.setCode(_ctx.stringValue("ListRuleAreaResponse.Code"));
		listRuleAreaResponse.setSuccess(_ctx.booleanValue("ListRuleAreaResponse.Success"));
		listRuleAreaResponse.setMessage(_ctx.stringValue("ListRuleAreaResponse.Message"));
		listRuleAreaResponse.setPageNumber(_ctx.integerValue("ListRuleAreaResponse.PageNumber"));
		listRuleAreaResponse.setPageSize(_ctx.integerValue("ListRuleAreaResponse.PageSize"));
		listRuleAreaResponse.setTotal(_ctx.longValue("ListRuleAreaResponse.Total"));

		List<Rule> model = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListRuleAreaResponse.Model.Length"); i++) {
			Rule rule = new Rule();
			rule.setRecordId(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].RecordId"));
			rule.setTenantId(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].TenantId"));
			rule.setRuleName(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].RuleName"));
			rule.setRuleId(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].RuleId"));
			rule.setRuleType(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].RuleType"));
			rule.setMediaId(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].MediaId"));
			rule.setMediaName(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].MediaName"));
			rule.setAdSlotId(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].AdSlotId"));
			rule.setAdSlotName(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].AdSlotName"));
			rule.setStatus(_ctx.stringValue("ListRuleAreaResponse.Model["+ i +"].Status"));

			model.add(rule);
		}
		listRuleAreaResponse.setModel(model);
	 
	 	return listRuleAreaResponse;
	}
}