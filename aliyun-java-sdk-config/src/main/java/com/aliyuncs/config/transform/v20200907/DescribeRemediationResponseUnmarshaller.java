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

package com.aliyuncs.config.transform.v20200907;

import com.aliyuncs.config.model.v20200907.DescribeRemediationResponse;
import com.aliyuncs.config.model.v20200907.DescribeRemediationResponse.Remediation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRemediationResponseUnmarshaller {

	public static DescribeRemediationResponse unmarshall(DescribeRemediationResponse describeRemediationResponse, UnmarshallerContext _ctx) {
		
		describeRemediationResponse.setRequestId(_ctx.stringValue("DescribeRemediationResponse.RequestId"));

		Remediation remediation = new Remediation();
		remediation.setLastSuccessfulInvocationType(_ctx.stringValue("DescribeRemediationResponse.Remediation.LastSuccessfulInvocationType"));
		remediation.setRemediationTemplateId(_ctx.stringValue("DescribeRemediationResponse.Remediation.RemediationTemplateId"));
		remediation.setRemediationDynamicParams(_ctx.stringValue("DescribeRemediationResponse.Remediation.RemediationDynamicParams"));
		remediation.setRemediationOriginParams(_ctx.stringValue("DescribeRemediationResponse.Remediation.RemediationOriginParams"));
		remediation.setRemediationId(_ctx.stringValue("DescribeRemediationResponse.Remediation.RemediationId"));
		remediation.setRemediationSourceType(_ctx.stringValue("DescribeRemediationResponse.Remediation.RemediationSourceType"));
		remediation.setRemediationType(_ctx.stringValue("DescribeRemediationResponse.Remediation.RemediationType"));
		remediation.setLastSuccessfulInvocationId(_ctx.stringValue("DescribeRemediationResponse.Remediation.LastSuccessfulInvocationId"));
		remediation.setAccountId(_ctx.longValue("DescribeRemediationResponse.Remediation.AccountId"));
		remediation.setInvokeType(_ctx.stringValue("DescribeRemediationResponse.Remediation.InvokeType"));
		remediation.setConfigRuleId(_ctx.stringValue("DescribeRemediationResponse.Remediation.ConfigRuleId"));
		remediation.setLastSuccessfulInvocationTime(_ctx.longValue("DescribeRemediationResponse.Remediation.LastSuccessfulInvocationTime"));
		describeRemediationResponse.setRemediation(remediation);
	 
	 	return describeRemediationResponse;
	}
}