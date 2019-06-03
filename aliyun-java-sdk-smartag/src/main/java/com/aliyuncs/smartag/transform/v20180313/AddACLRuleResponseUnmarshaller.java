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

import com.aliyuncs.smartag.model.v20180313.AddACLRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddACLRuleResponseUnmarshaller {

	public static AddACLRuleResponse unmarshall(AddACLRuleResponse addACLRuleResponse, UnmarshallerContext context) {
		
		addACLRuleResponse.setRequestId(context.stringValue("AddACLRuleResponse.RequestId"));
		addACLRuleResponse.setAcrId(context.stringValue("AddACLRuleResponse.AcrId"));
		addACLRuleResponse.setAclId(context.stringValue("AddACLRuleResponse.AclId"));
		addACLRuleResponse.setDescription(context.stringValue("AddACLRuleResponse.Description"));
		addACLRuleResponse.setDirection(context.stringValue("AddACLRuleResponse.Direction"));
		addACLRuleResponse.setSourceCidr(context.stringValue("AddACLRuleResponse.SourceCidr"));
		addACLRuleResponse.setDestCidr(context.stringValue("AddACLRuleResponse.DestCidr"));
		addACLRuleResponse.setIpProtocol(context.stringValue("AddACLRuleResponse.IpProtocol"));
		addACLRuleResponse.setSourcePortRange(context.stringValue("AddACLRuleResponse.SourcePortRange"));
		addACLRuleResponse.setDestPortRange(context.stringValue("AddACLRuleResponse.DestPortRange"));
		addACLRuleResponse.setPolicy(context.stringValue("AddACLRuleResponse.Policy"));
		addACLRuleResponse.setPriority(context.integerValue("AddACLRuleResponse.Priority"));
		addACLRuleResponse.setGmtCreate(context.longValue("AddACLRuleResponse.GmtCreate"));
	 
	 	return addACLRuleResponse;
	}
}