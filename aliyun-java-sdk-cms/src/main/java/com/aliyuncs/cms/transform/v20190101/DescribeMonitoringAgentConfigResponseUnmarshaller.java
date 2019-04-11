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

import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitoringAgentConfigResponseUnmarshaller {

	public static DescribeMonitoringAgentConfigResponse unmarshall(DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfigResponse, UnmarshallerContext context) {
		
		describeMonitoringAgentConfigResponse.setRequestId(context.stringValue("DescribeMonitoringAgentConfigResponse.RequestId"));
		describeMonitoringAgentConfigResponse.setCode(context.stringValue("DescribeMonitoringAgentConfigResponse.Code"));
		describeMonitoringAgentConfigResponse.setMessage(context.stringValue("DescribeMonitoringAgentConfigResponse.Message"));
		describeMonitoringAgentConfigResponse.setSuccess(context.booleanValue("DescribeMonitoringAgentConfigResponse.Success"));
		describeMonitoringAgentConfigResponse.setAutoInstall(context.booleanValue("DescribeMonitoringAgentConfigResponse.AutoInstall"));
		describeMonitoringAgentConfigResponse.setEnableInstallAgentNewECS(context.booleanValue("DescribeMonitoringAgentConfigResponse.EnableInstallAgentNewECS"));
		describeMonitoringAgentConfigResponse.setEnableActiveAlert(context.stringValue("DescribeMonitoringAgentConfigResponse.EnableActiveAlert"));
	 
	 	return describeMonitoringAgentConfigResponse;
	}
}