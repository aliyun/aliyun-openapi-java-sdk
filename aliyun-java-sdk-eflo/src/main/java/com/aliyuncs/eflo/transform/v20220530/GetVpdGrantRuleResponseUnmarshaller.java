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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.GetVpdGrantRuleResponse;
import com.aliyuncs.eflo.model.v20220530.GetVpdGrantRuleResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpdGrantRuleResponseUnmarshaller {

	public static GetVpdGrantRuleResponse unmarshall(GetVpdGrantRuleResponse getVpdGrantRuleResponse, UnmarshallerContext _ctx) {
		
		getVpdGrantRuleResponse.setRequestId(_ctx.stringValue("GetVpdGrantRuleResponse.RequestId"));
		getVpdGrantRuleResponse.setCode(_ctx.integerValue("GetVpdGrantRuleResponse.Code"));
		getVpdGrantRuleResponse.setMessage(_ctx.stringValue("GetVpdGrantRuleResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.RegionId"));
		content.setTenantId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.TenantId"));
		content.setInstanceId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.InstanceId"));
		content.setInstanceName(_ctx.stringValue("GetVpdGrantRuleResponse.Content.InstanceName"));
		content.setProduct(_ctx.stringValue("GetVpdGrantRuleResponse.Content.Product"));
		content.setErId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.ErId"));
		content.setGrantTenantId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.GrantTenantId"));
		content.setUsed(_ctx.booleanValue("GetVpdGrantRuleResponse.Content.Used"));
		content.setCreateTime(_ctx.stringValue("GetVpdGrantRuleResponse.Content.CreateTime"));
		content.setGrantRuleId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.GrantRuleId"));
		content.setResourceGroupId(_ctx.stringValue("GetVpdGrantRuleResponse.Content.ResourceGroupId"));
		getVpdGrantRuleResponse.setContent(content);
	 
	 	return getVpdGrantRuleResponse;
	}
}