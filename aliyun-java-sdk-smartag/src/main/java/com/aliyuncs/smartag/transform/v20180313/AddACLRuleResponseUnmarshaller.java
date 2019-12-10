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

	public static AddACLRuleResponse unmarshall(AddACLRuleResponse addACLRuleResponse, UnmarshallerContext _ctx) {
		
		addACLRuleResponse.setRequestId(_ctx.stringValue("AddACLRuleResponse.RequestId"));
		addACLRuleResponse.setAcrId(_ctx.stringValue("AddACLRuleResponse.AcrId"));
		addACLRuleResponse.setAclId(_ctx.stringValue("AddACLRuleResponse.AclId"));
		addACLRuleResponse.setDescription(_ctx.stringValue("AddACLRuleResponse.Description"));
		addACLRuleResponse.setDirection(_ctx.stringValue("AddACLRuleResponse.Direction"));
		addACLRuleResponse.setSourceCidr(_ctx.stringValue("AddACLRuleResponse.SourceCidr"));
		addACLRuleResponse.setDestCidr(_ctx.stringValue("AddACLRuleResponse.DestCidr"));
		addACLRuleResponse.setIpProtocol(_ctx.stringValue("AddACLRuleResponse.IpProtocol"));
		addACLRuleResponse.setSourcePortRange(_ctx.stringValue("AddACLRuleResponse.SourcePortRange"));
		addACLRuleResponse.setDestPortRange(_ctx.stringValue("AddACLRuleResponse.DestPortRange"));
		addACLRuleResponse.setPolicy(_ctx.stringValue("AddACLRuleResponse.Policy"));
		addACLRuleResponse.setPriority(_ctx.integerValue("AddACLRuleResponse.Priority"));
		addACLRuleResponse.setGmtCreate(_ctx.longValue("AddACLRuleResponse.GmtCreate"));
		addACLRuleResponse.setType(_ctx.stringValue("AddACLRuleResponse.Type"));
		addACLRuleResponse.setName(_ctx.stringValue("AddACLRuleResponse.Name"));
	 
	 	return addACLRuleResponse;
	}
}