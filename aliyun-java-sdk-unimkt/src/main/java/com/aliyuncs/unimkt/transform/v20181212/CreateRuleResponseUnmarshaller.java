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

import com.aliyuncs.unimkt.model.v20181212.CreateRuleResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateRuleResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRuleResponseUnmarshaller {

	public static CreateRuleResponse unmarshall(CreateRuleResponse createRuleResponse, UnmarshallerContext _ctx) {
		
		createRuleResponse.setRequestId(_ctx.stringValue("CreateRuleResponse.RequestId"));
		createRuleResponse.setCode(_ctx.stringValue("CreateRuleResponse.Code"));
		createRuleResponse.setMessage(_ctx.stringValue("CreateRuleResponse.Message"));
		createRuleResponse.setSuccess(_ctx.booleanValue("CreateRuleResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("CreateRuleResponse.Model.Status"));
		model.setRuleType(_ctx.stringValue("CreateRuleResponse.Model.RuleType"));
		model.setCreateTime(_ctx.longValue("CreateRuleResponse.Model.CreateTime"));
		model.setRuleRId(_ctx.stringValue("CreateRuleResponse.Model.RuleRId"));
		model.setRelatedAdSlots(_ctx.stringValue("CreateRuleResponse.Model.RelatedAdSlots"));
		model.setExtInfo(_ctx.stringValue("CreateRuleResponse.Model.ExtInfo"));
		model.setRuleId(_ctx.stringValue("CreateRuleResponse.Model.RuleId"));
		model.setRuleName(_ctx.stringValue("CreateRuleResponse.Model.RuleName"));
		model.setVersion(_ctx.longValue("CreateRuleResponse.Model.Version"));
		model.setAccessStatus(_ctx.stringValue("CreateRuleResponse.Model.AccessStatus"));
		model.setModifyTime(_ctx.longValue("CreateRuleResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("CreateRuleResponse.Model.TenantId"));
		model.setRuleConfig(_ctx.stringValue("CreateRuleResponse.Model.RuleConfig"));
		createRuleResponse.setModel(model);
	 
	 	return createRuleResponse;
	}
}