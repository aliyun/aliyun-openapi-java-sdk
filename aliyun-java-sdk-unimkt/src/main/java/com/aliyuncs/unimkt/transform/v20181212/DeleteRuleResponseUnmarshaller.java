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

import com.aliyuncs.unimkt.model.v20181212.DeleteRuleResponse;
import com.aliyuncs.unimkt.model.v20181212.DeleteRuleResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRuleResponseUnmarshaller {

	public static DeleteRuleResponse unmarshall(DeleteRuleResponse deleteRuleResponse, UnmarshallerContext _ctx) {
		
		deleteRuleResponse.setRequestId(_ctx.stringValue("DeleteRuleResponse.RequestId"));
		deleteRuleResponse.setCode(_ctx.stringValue("DeleteRuleResponse.Code"));
		deleteRuleResponse.setMessage(_ctx.stringValue("DeleteRuleResponse.Message"));
		deleteRuleResponse.setSuccess(_ctx.booleanValue("DeleteRuleResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("DeleteRuleResponse.Model.Status"));
		model.setRuleType(_ctx.stringValue("DeleteRuleResponse.Model.RuleType"));
		model.setCreateTime(_ctx.longValue("DeleteRuleResponse.Model.CreateTime"));
		model.setRuleRId(_ctx.stringValue("DeleteRuleResponse.Model.RuleRId"));
		model.setRelatedAdSlots(_ctx.stringValue("DeleteRuleResponse.Model.RelatedAdSlots"));
		model.setExtInfo(_ctx.stringValue("DeleteRuleResponse.Model.ExtInfo"));
		model.setRuleName(_ctx.stringValue("DeleteRuleResponse.Model.RuleName"));
		model.setRuleId(_ctx.stringValue("DeleteRuleResponse.Model.RuleId"));
		model.setVersion(_ctx.longValue("DeleteRuleResponse.Model.Version"));
		model.setModifyTime(_ctx.longValue("DeleteRuleResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("DeleteRuleResponse.Model.TenantId"));
		model.setRuleConfig(_ctx.stringValue("DeleteRuleResponse.Model.RuleConfig"));
		deleteRuleResponse.setModel(model);
	 
	 	return deleteRuleResponse;
	}
}