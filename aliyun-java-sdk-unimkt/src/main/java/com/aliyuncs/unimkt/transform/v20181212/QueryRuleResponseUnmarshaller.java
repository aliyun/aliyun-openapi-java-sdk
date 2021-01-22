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

import com.aliyuncs.unimkt.model.v20181212.QueryRuleResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryRuleResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRuleResponseUnmarshaller {

	public static QueryRuleResponse unmarshall(QueryRuleResponse queryRuleResponse, UnmarshallerContext _ctx) {
		
		queryRuleResponse.setRequestId(_ctx.stringValue("QueryRuleResponse.RequestId"));
		queryRuleResponse.setCode(_ctx.stringValue("QueryRuleResponse.Code"));
		queryRuleResponse.setSuccess(_ctx.booleanValue("QueryRuleResponse.Success"));
		queryRuleResponse.setMessage(_ctx.stringValue("QueryRuleResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("QueryRuleResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("QueryRuleResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QueryRuleResponse.Model.TenantId"));
		model.setRuleName(_ctx.stringValue("QueryRuleResponse.Model.RuleName"));
		model.setRuleRId(_ctx.stringValue("QueryRuleResponse.Model.RuleRId"));
		model.setRuleType(_ctx.stringValue("QueryRuleResponse.Model.RuleType"));
		model.setRelatedAdSlots(_ctx.stringValue("QueryRuleResponse.Model.RelatedAdSlots"));
		model.setRuleConfig(_ctx.stringValue("QueryRuleResponse.Model.RuleConfig"));
		model.setStatus(_ctx.stringValue("QueryRuleResponse.Model.Status"));
		model.setAccessStatus(_ctx.stringValue("QueryRuleResponse.Model.AccessStatus"));
		model.setExtInfo(_ctx.stringValue("QueryRuleResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("QueryRuleResponse.Model.Version"));
		queryRuleResponse.setModel(model);
	 
	 	return queryRuleResponse;
	}
}