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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListSecurityGroupRuleResponse;
import com.aliyuncs.mse.model.v20190531.ListSecurityGroupRuleResponse.Rules;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityGroupRuleResponseUnmarshaller {

	public static ListSecurityGroupRuleResponse unmarshall(ListSecurityGroupRuleResponse listSecurityGroupRuleResponse, UnmarshallerContext _ctx) {
		
		listSecurityGroupRuleResponse.setRequestId(_ctx.stringValue("ListSecurityGroupRuleResponse.RequestId"));
		listSecurityGroupRuleResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityGroupRuleResponse.HttpStatusCode"));
		listSecurityGroupRuleResponse.setMessage(_ctx.stringValue("ListSecurityGroupRuleResponse.Message"));
		listSecurityGroupRuleResponse.setCode(_ctx.integerValue("ListSecurityGroupRuleResponse.Code"));
		listSecurityGroupRuleResponse.setSuccess(_ctx.booleanValue("ListSecurityGroupRuleResponse.Success"));

		List<Rules> data = new ArrayList<Rules>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityGroupRuleResponse.Data.Length"); i++) {
			Rules rules = new Rules();
			rules.setId(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].Id"));
			rules.setSecurityGroupId(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].SecurityGroupId"));
			rules.setPortRange(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].PortRange"));
			rules.setIpProtocol(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].IpProtocol"));
			rules.setGatewayId(_ctx.longValue("ListSecurityGroupRuleResponse.Data["+ i +"].GatewayId"));
			rules.setGatewayUniqueId(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].GatewayUniqueId"));
			rules.setGmtCreate(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].GmtCreate"));
			rules.setGmtModified(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].GmtModified"));
			rules.setDescription(_ctx.stringValue("ListSecurityGroupRuleResponse.Data["+ i +"].Description"));

			data.add(rules);
		}
		listSecurityGroupRuleResponse.setData(data);
	 
	 	return listSecurityGroupRuleResponse;
	}
}