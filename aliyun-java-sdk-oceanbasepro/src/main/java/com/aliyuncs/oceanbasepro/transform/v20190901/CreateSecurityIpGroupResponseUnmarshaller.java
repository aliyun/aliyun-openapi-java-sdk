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

import com.aliyuncs.oceanbasepro.model.v20190901.CreateSecurityIpGroupResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateSecurityIpGroupResponse.SecurityIpGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSecurityIpGroupResponseUnmarshaller {

	public static CreateSecurityIpGroupResponse unmarshall(CreateSecurityIpGroupResponse createSecurityIpGroupResponse, UnmarshallerContext _ctx) {
		
		createSecurityIpGroupResponse.setRequestId(_ctx.stringValue("CreateSecurityIpGroupResponse.RequestId"));

		SecurityIpGroup securityIpGroup = new SecurityIpGroup();
		securityIpGroup.setInstanceId(_ctx.stringValue("CreateSecurityIpGroupResponse.SecurityIpGroup.InstanceId"));
		securityIpGroup.setSecurityIpGroupName(_ctx.stringValue("CreateSecurityIpGroupResponse.SecurityIpGroup.SecurityIpGroupName"));
		securityIpGroup.setSecurityIps(_ctx.stringValue("CreateSecurityIpGroupResponse.SecurityIpGroup.SecurityIps"));
		createSecurityIpGroupResponse.setSecurityIpGroup(securityIpGroup);
	 
	 	return createSecurityIpGroupResponse;
	}
}