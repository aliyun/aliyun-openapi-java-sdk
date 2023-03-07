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

package com.aliyuncs.iotcc.transform.v20210513;

import com.aliyuncs.iotcc.model.v20210513.UpdateGroupIpMappingRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGroupIpMappingRuleResponseUnmarshaller {

	public static UpdateGroupIpMappingRuleResponse unmarshall(UpdateGroupIpMappingRuleResponse updateGroupIpMappingRuleResponse, UnmarshallerContext _ctx) {
		
		updateGroupIpMappingRuleResponse.setRequestId(_ctx.stringValue("UpdateGroupIpMappingRuleResponse.RequestId"));
		updateGroupIpMappingRuleResponse.setIoTCloudConnectorGroupId(_ctx.stringValue("UpdateGroupIpMappingRuleResponse.IoTCloudConnectorGroupId"));
		updateGroupIpMappingRuleResponse.setAuthorizationRuleId(_ctx.stringValue("UpdateGroupIpMappingRuleResponse.AuthorizationRuleId"));
	 
	 	return updateGroupIpMappingRuleResponse;
	}
}