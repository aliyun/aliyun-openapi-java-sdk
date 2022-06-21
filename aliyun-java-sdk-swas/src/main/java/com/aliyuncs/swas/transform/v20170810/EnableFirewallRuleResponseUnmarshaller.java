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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.EnableFirewallRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableFirewallRuleResponseUnmarshaller {

	public static EnableFirewallRuleResponse unmarshall(EnableFirewallRuleResponse enableFirewallRuleResponse, UnmarshallerContext _ctx) {
		
		enableFirewallRuleResponse.setRequestId(_ctx.stringValue("EnableFirewallRuleResponse.RequestId"));
		enableFirewallRuleResponse.setCode(_ctx.stringValue("EnableFirewallRuleResponse.Code"));
		enableFirewallRuleResponse.setData(_ctx.booleanValue("EnableFirewallRuleResponse.Data"));
		enableFirewallRuleResponse.setIsSuccess(_ctx.booleanValue("EnableFirewallRuleResponse.IsSuccess"));
	 
	 	return enableFirewallRuleResponse;
	}
}