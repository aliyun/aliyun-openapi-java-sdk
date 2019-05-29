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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.ModifyACLRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyACLRuleResponseUnmarshaller {

	public static ModifyACLRuleResponse unmarshall(ModifyACLRuleResponse modifyACLRuleResponse, UnmarshallerContext context) {
		
		modifyACLRuleResponse.setRequestId(context.stringValue("ModifyACLRuleResponse.RequestId"));
		modifyACLRuleResponse.setAcrId(context.stringValue("ModifyACLRuleResponse.AcrId"));
		modifyACLRuleResponse.setAclId(context.stringValue("ModifyACLRuleResponse.AclId"));
		modifyACLRuleResponse.setDescription(context.stringValue("ModifyACLRuleResponse.Description"));
		modifyACLRuleResponse.setDirection(context.stringValue("ModifyACLRuleResponse.Direction"));
		modifyACLRuleResponse.setSourceCidr(context.stringValue("ModifyACLRuleResponse.SourceCidr"));
		modifyACLRuleResponse.setDestCidr(context.stringValue("ModifyACLRuleResponse.DestCidr"));
		modifyACLRuleResponse.setIpProtocol(context.stringValue("ModifyACLRuleResponse.IpProtocol"));
		modifyACLRuleResponse.setSourcePortRange(context.stringValue("ModifyACLRuleResponse.SourcePortRange"));
		modifyACLRuleResponse.setDestPortRange(context.stringValue("ModifyACLRuleResponse.DestPortRange"));
		modifyACLRuleResponse.setPolicy(context.stringValue("ModifyACLRuleResponse.Policy"));
		modifyACLRuleResponse.setPriority(context.integerValue("ModifyACLRuleResponse.Priority"));
		modifyACLRuleResponse.setGmtCreate(context.longValue("ModifyACLRuleResponse.GmtCreate"));
	 
	 	return modifyACLRuleResponse;
	}
}