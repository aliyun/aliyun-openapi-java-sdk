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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplatesResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplatesResponse.FirewallTemplate;
import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplatesResponse.FirewallTemplate.FirewallTemplateRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFirewallTemplatesResponseUnmarshaller {

	public static DescribeFirewallTemplatesResponse unmarshall(DescribeFirewallTemplatesResponse describeFirewallTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeFirewallTemplatesResponse.setRequestId(_ctx.stringValue("DescribeFirewallTemplatesResponse.RequestId"));
		describeFirewallTemplatesResponse.setTotalCount(_ctx.integerValue("DescribeFirewallTemplatesResponse.TotalCount"));
		describeFirewallTemplatesResponse.setPageNumber(_ctx.integerValue("DescribeFirewallTemplatesResponse.PageNumber"));
		describeFirewallTemplatesResponse.setPageSize(_ctx.integerValue("DescribeFirewallTemplatesResponse.PageSize"));

		List<FirewallTemplate> firewallTemplates = new ArrayList<FirewallTemplate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFirewallTemplatesResponse.FirewallTemplates.Length"); i++) {
			FirewallTemplate firewallTemplate = new FirewallTemplate();
			firewallTemplate.setFirewallTemplateId(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateId"));
			firewallTemplate.setCreationTime(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].CreationTime"));
			firewallTemplate.setName(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].Name"));
			firewallTemplate.setDescription(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].Description"));
			firewallTemplate.setCreateTime(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].CreateTime"));

			List<FirewallTemplateRule> firewallTemplateRules = new ArrayList<FirewallTemplateRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateRules.Length"); j++) {
				FirewallTemplateRule firewallTemplateRule = new FirewallTemplateRule();
				firewallTemplateRule.setFirewallTemplateRuleId(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateRules["+ j +"].FirewallTemplateRuleId"));
				firewallTemplateRule.setRuleProtocol(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateRules["+ j +"].RuleProtocol"));
				firewallTemplateRule.setPort(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateRules["+ j +"].Port"));
				firewallTemplateRule.setSourceCidrIp(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateRules["+ j +"].SourceCidrIp"));
				firewallTemplateRule.setRemark(_ctx.stringValue("DescribeFirewallTemplatesResponse.FirewallTemplates["+ i +"].FirewallTemplateRules["+ j +"].Remark"));

				firewallTemplateRules.add(firewallTemplateRule);
			}
			firewallTemplate.setFirewallTemplateRules(firewallTemplateRules);

			firewallTemplates.add(firewallTemplate);
		}
		describeFirewallTemplatesResponse.setFirewallTemplates(firewallTemplates);
	 
	 	return describeFirewallTemplatesResponse;
	}
}