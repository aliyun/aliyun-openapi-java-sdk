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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ModifyACLRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyACLRuleResponseUnmarshaller {

	public static ModifyACLRuleResponse unmarshall(ModifyACLRuleResponse modifyACLRuleResponse, UnmarshallerContext _ctx) {
		
		modifyACLRuleResponse.setRequestId(_ctx.stringValue("ModifyACLRuleResponse.RequestId"));
		modifyACLRuleResponse.setPolicy(_ctx.stringValue("ModifyACLRuleResponse.Policy"));
		modifyACLRuleResponse.setDescription(_ctx.stringValue("ModifyACLRuleResponse.Description"));
		modifyACLRuleResponse.setSourcePortRange(_ctx.stringValue("ModifyACLRuleResponse.SourcePortRange"));
		modifyACLRuleResponse.setSourceCidr(_ctx.stringValue("ModifyACLRuleResponse.SourceCidr"));
		modifyACLRuleResponse.setPriority(_ctx.integerValue("ModifyACLRuleResponse.Priority"));
		modifyACLRuleResponse.setAclId(_ctx.stringValue("ModifyACLRuleResponse.AclId"));
		modifyACLRuleResponse.setAcrId(_ctx.stringValue("ModifyACLRuleResponse.AcrId"));
		modifyACLRuleResponse.setDestPortRange(_ctx.stringValue("ModifyACLRuleResponse.DestPortRange"));
		modifyACLRuleResponse.setDirection(_ctx.stringValue("ModifyACLRuleResponse.Direction"));
		modifyACLRuleResponse.setName(_ctx.stringValue("ModifyACLRuleResponse.Name"));
		modifyACLRuleResponse.setGmtCreate(_ctx.longValue("ModifyACLRuleResponse.GmtCreate"));
		modifyACLRuleResponse.setDestCidr(_ctx.stringValue("ModifyACLRuleResponse.DestCidr"));
		modifyACLRuleResponse.setIpProtocol(_ctx.stringValue("ModifyACLRuleResponse.IpProtocol"));

		List<String> dpiSignatureIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyACLRuleResponse.DpiSignatureIds.Length"); i++) {
			dpiSignatureIds.add(_ctx.stringValue("ModifyACLRuleResponse.DpiSignatureIds["+ i +"]"));
		}
		modifyACLRuleResponse.setDpiSignatureIds(dpiSignatureIds);

		List<String> dpiGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyACLRuleResponse.DpiGroupIds.Length"); i++) {
			dpiGroupIds.add(_ctx.stringValue("ModifyACLRuleResponse.DpiGroupIds["+ i +"]"));
		}
		modifyACLRuleResponse.setDpiGroupIds(dpiGroupIds);
	 
	 	return modifyACLRuleResponse;
	}
}