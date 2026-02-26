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

import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplateRulesApplyResultResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplateRulesApplyResultResponse.InstanceApplyFirewallTemplateRulesResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFirewallTemplateRulesApplyResultResponseUnmarshaller {

	public static DescribeFirewallTemplateRulesApplyResultResponse unmarshall(DescribeFirewallTemplateRulesApplyResultResponse describeFirewallTemplateRulesApplyResultResponse, UnmarshallerContext _ctx) {
		
		describeFirewallTemplateRulesApplyResultResponse.setRequestId(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.RequestId"));

		List<InstanceApplyFirewallTemplateRulesResult> data = new ArrayList<InstanceApplyFirewallTemplateRulesResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFirewallTemplateRulesApplyResultResponse.data.Length"); i++) {
			InstanceApplyFirewallTemplateRulesResult instanceApplyFirewallTemplateRulesResult = new InstanceApplyFirewallTemplateRulesResult();
			instanceApplyFirewallTemplateRulesResult.setRuleProtocol(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].RuleProtocol"));
			instanceApplyFirewallTemplateRulesResult.setPort(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].Port"));
			instanceApplyFirewallTemplateRulesResult.setSourceCidrIp(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].SourceCidrIp"));
			instanceApplyFirewallTemplateRulesResult.setRemark(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].Remark"));
			instanceApplyFirewallTemplateRulesResult.setSuccess(_ctx.booleanValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].Success"));
			instanceApplyFirewallTemplateRulesResult.setErrorCode(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].ErrorCode"));
			instanceApplyFirewallTemplateRulesResult.setErrorInfo(_ctx.stringValue("DescribeFirewallTemplateRulesApplyResultResponse.data["+ i +"].ErrorInfo"));

			data.add(instanceApplyFirewallTemplateRulesResult);
		}
		describeFirewallTemplateRulesApplyResultResponse.setData(data);
	 
	 	return describeFirewallTemplateRulesApplyResultResponse;
	}
}