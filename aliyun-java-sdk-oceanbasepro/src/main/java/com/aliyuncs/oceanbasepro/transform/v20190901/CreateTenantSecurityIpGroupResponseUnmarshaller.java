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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantSecurityIpGroupResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantSecurityIpGroupResponse.SecurityIpGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTenantSecurityIpGroupResponseUnmarshaller {

	public static CreateTenantSecurityIpGroupResponse unmarshall(CreateTenantSecurityIpGroupResponse createTenantSecurityIpGroupResponse, UnmarshallerContext _ctx) {
		
		createTenantSecurityIpGroupResponse.setRequestId(_ctx.stringValue("CreateTenantSecurityIpGroupResponse.RequestId"));

		SecurityIpGroup securityIpGroup = new SecurityIpGroup();
		securityIpGroup.setInstanceId(_ctx.stringValue("CreateTenantSecurityIpGroupResponse.SecurityIpGroup.InstanceId"));
		securityIpGroup.setTenantId(_ctx.stringValue("CreateTenantSecurityIpGroupResponse.SecurityIpGroup.TenantId"));
		securityIpGroup.setSecurityIpGroupName(_ctx.stringValue("CreateTenantSecurityIpGroupResponse.SecurityIpGroup.SecurityIpGroupName"));
		securityIpGroup.setSecurityIps(_ctx.stringValue("CreateTenantSecurityIpGroupResponse.SecurityIpGroup.SecurityIps"));
		createTenantSecurityIpGroupResponse.setSecurityIpGroup(securityIpGroup);
	 
	 	return createTenantSecurityIpGroupResponse;
	}
}