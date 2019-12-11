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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.CreateMonitoringAgentProcessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMonitoringAgentProcessResponseUnmarshaller {

	public static CreateMonitoringAgentProcessResponse unmarshall(CreateMonitoringAgentProcessResponse createMonitoringAgentProcessResponse, UnmarshallerContext _ctx) {
		
		createMonitoringAgentProcessResponse.setRequestId(_ctx.stringValue("CreateMonitoringAgentProcessResponse.RequestId"));
		createMonitoringAgentProcessResponse.setCode(_ctx.stringValue("CreateMonitoringAgentProcessResponse.Code"));
		createMonitoringAgentProcessResponse.setMessage(_ctx.stringValue("CreateMonitoringAgentProcessResponse.Message"));
		createMonitoringAgentProcessResponse.setSuccess(_ctx.booleanValue("CreateMonitoringAgentProcessResponse.Success"));
		createMonitoringAgentProcessResponse.setId(_ctx.longValue("CreateMonitoringAgentProcessResponse.Id"));
	 
	 	return createMonitoringAgentProcessResponse;
	}
}