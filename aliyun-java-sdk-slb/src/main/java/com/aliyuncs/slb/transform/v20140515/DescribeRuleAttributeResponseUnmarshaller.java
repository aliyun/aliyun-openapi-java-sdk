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
package com.aliyuncs.slb.transform.v20140515;

import com.aliyuncs.slb.model.v20140515.DescribeRuleAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleAttributeResponseUnmarshaller {

	public static DescribeRuleAttributeResponse unmarshall(DescribeRuleAttributeResponse describeRuleAttributeResponse, UnmarshallerContext context) {
		
		describeRuleAttributeResponse.setRequestId(context.stringValue("DescribeRuleAttributeResponse.RequestId"));
		describeRuleAttributeResponse.setRuleName(context.stringValue("DescribeRuleAttributeResponse.RuleName"));
		describeRuleAttributeResponse.setLoadBalancerId(context.stringValue("DescribeRuleAttributeResponse.LoadBalancerId"));
		describeRuleAttributeResponse.setListenerPort(context.stringValue("DescribeRuleAttributeResponse.ListenerPort"));
		describeRuleAttributeResponse.setDomain(context.stringValue("DescribeRuleAttributeResponse.Domain"));
		describeRuleAttributeResponse.setUrl(context.stringValue("DescribeRuleAttributeResponse.Url"));
		describeRuleAttributeResponse.setVServerGroupId(context.stringValue("DescribeRuleAttributeResponse.VServerGroupId"));
	 
	 	return describeRuleAttributeResponse;
	}
}