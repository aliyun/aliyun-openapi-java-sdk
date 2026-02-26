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

import com.aliyuncs.eflo.model.v20220530.GetVccGrantRuleResponse;
import com.aliyuncs.eflo.model.v20220530.GetVccGrantRuleResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVccGrantRuleResponseUnmarshaller {

	public static GetVccGrantRuleResponse unmarshall(GetVccGrantRuleResponse getVccGrantRuleResponse, UnmarshallerContext _ctx) {
		
		getVccGrantRuleResponse.setRequestId(_ctx.stringValue("GetVccGrantRuleResponse.RequestId"));
		getVccGrantRuleResponse.setCode(_ctx.integerValue("GetVccGrantRuleResponse.Code"));
		getVccGrantRuleResponse.setMessage(_ctx.stringValue("GetVccGrantRuleResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetVccGrantRuleResponse.Content.RegionId"));
		content.setTenantId(_ctx.stringValue("GetVccGrantRuleResponse.Content.TenantId"));
		content.setInstanceId(_ctx.stringValue("GetVccGrantRuleResponse.Content.InstanceId"));
		content.setInstanceName(_ctx.stringValue("GetVccGrantRuleResponse.Content.InstanceName"));
		content.setProduct(_ctx.stringValue("GetVccGrantRuleResponse.Content.Product"));
		content.setErId(_ctx.stringValue("GetVccGrantRuleResponse.Content.ErId"));
		content.setGrantTenantId(_ctx.stringValue("GetVccGrantRuleResponse.Content.GrantTenantId"));
		content.setUsed(_ctx.booleanValue("GetVccGrantRuleResponse.Content.Used"));
		content.setCreateTime(_ctx.stringValue("GetVccGrantRuleResponse.Content.CreateTime"));
		content.setGrantRuleId(_ctx.stringValue("GetVccGrantRuleResponse.Content.GrantRuleId"));
		content.setResourceGroupId(_ctx.stringValue("GetVccGrantRuleResponse.Content.ResourceGroupId"));
		getVccGrantRuleResponse.setContent(content);
	 
	 	return getVccGrantRuleResponse;
	}
}