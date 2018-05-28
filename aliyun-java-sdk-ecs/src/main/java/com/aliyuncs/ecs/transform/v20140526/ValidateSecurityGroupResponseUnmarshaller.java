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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.ValidateSecurityGroupResponse;
import com.aliyuncs.ecs.model.v20140526.ValidateSecurityGroupResponse.TriggeredGroupRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateSecurityGroupResponseUnmarshaller {

	public static ValidateSecurityGroupResponse unmarshall(ValidateSecurityGroupResponse validateSecurityGroupResponse, UnmarshallerContext context) {
		
		validateSecurityGroupResponse.setRequestId(context.stringValue("ValidateSecurityGroupResponse.RequestId"));
		validateSecurityGroupResponse.setPolicy(context.stringValue("ValidateSecurityGroupResponse.Policy"));

		TriggeredGroupRule triggeredGroupRule = new TriggeredGroupRule();
		triggeredGroupRule.setIpProtocol(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.IpProtocol"));
		triggeredGroupRule.setPortRange(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.PortRange"));
		triggeredGroupRule.setSourceGroupId(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.SourceGroupId"));
		triggeredGroupRule.setSourceGroupName(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.SourceGroupName"));
		triggeredGroupRule.setSourceCidrIp(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.SourceCidrIp"));
		triggeredGroupRule.setPolicy(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.Policy"));
		triggeredGroupRule.setNicType(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.NicType"));
		triggeredGroupRule.setSourceGroupOwnerAccount(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.SourceGroupOwnerAccount"));
		triggeredGroupRule.setDestGroupId(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.DestGroupId"));
		triggeredGroupRule.setDestGroupName(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.DestGroupName"));
		triggeredGroupRule.setDestCidrIp(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.DestCidrIp"));
		triggeredGroupRule.setDestGroupOwnerAccount(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.DestGroupOwnerAccount"));
		triggeredGroupRule.setPriority(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.Priority"));
		triggeredGroupRule.setDirection(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.Direction"));
		triggeredGroupRule.setDescription(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.Description"));
		triggeredGroupRule.setCreateTime(context.stringValue("ValidateSecurityGroupResponse.TriggeredGroupRule.CreateTime"));
		validateSecurityGroupResponse.setTriggeredGroupRule(triggeredGroupRule);
	 
	 	return validateSecurityGroupResponse;
	}
}