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

import com.aliyuncs.cms.model.v20190101.UninstallMonitoringAgentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UninstallMonitoringAgentResponseUnmarshaller {

	public static UninstallMonitoringAgentResponse unmarshall(UninstallMonitoringAgentResponse uninstallMonitoringAgentResponse, UnmarshallerContext _ctx) {
		
		uninstallMonitoringAgentResponse.setRequestId(_ctx.stringValue("UninstallMonitoringAgentResponse.RequestId"));
		uninstallMonitoringAgentResponse.setCode(_ctx.stringValue("UninstallMonitoringAgentResponse.Code"));
		uninstallMonitoringAgentResponse.setMessage(_ctx.stringValue("UninstallMonitoringAgentResponse.Message"));
		uninstallMonitoringAgentResponse.setSuccess(_ctx.booleanValue("UninstallMonitoringAgentResponse.Success"));
	 
	 	return uninstallMonitoringAgentResponse;
	}
}