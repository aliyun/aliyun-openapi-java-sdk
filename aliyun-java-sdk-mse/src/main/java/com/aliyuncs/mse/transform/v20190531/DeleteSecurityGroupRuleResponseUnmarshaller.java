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

import com.aliyuncs.mse.model.v20190531.DeleteSecurityGroupRuleResponse;
import com.aliyuncs.mse.model.v20190531.DeleteSecurityGroupRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSecurityGroupRuleResponseUnmarshaller {

	public static DeleteSecurityGroupRuleResponse unmarshall(DeleteSecurityGroupRuleResponse deleteSecurityGroupRuleResponse, UnmarshallerContext _ctx) {
		
		deleteSecurityGroupRuleResponse.setRequestId(_ctx.stringValue("DeleteSecurityGroupRuleResponse.RequestId"));
		deleteSecurityGroupRuleResponse.setHttpStatusCode(_ctx.integerValue("DeleteSecurityGroupRuleResponse.HttpStatusCode"));
		deleteSecurityGroupRuleResponse.setMessage(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Message"));
		deleteSecurityGroupRuleResponse.setCode(_ctx.integerValue("DeleteSecurityGroupRuleResponse.Code"));
		deleteSecurityGroupRuleResponse.setSuccess(_ctx.booleanValue("DeleteSecurityGroupRuleResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteSecurityGroupRuleResponse.Data.Id"));
		data.setSecurityGroupId(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.SecurityGroupId"));
		data.setGatewayUniqueId(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.GatewayUniqueId"));
		data.setPortRange(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.PortRange"));
		data.setIpProtocol(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.IpProtocol"));
		data.setGatewayId(_ctx.longValue("DeleteSecurityGroupRuleResponse.Data.GatewayId"));
		data.setGmtCreate(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.GmtModified"));
		data.setDescription(_ctx.stringValue("DeleteSecurityGroupRuleResponse.Data.Description"));
		deleteSecurityGroupRuleResponse.setData(data);
	 
	 	return deleteSecurityGroupRuleResponse;
	}
}