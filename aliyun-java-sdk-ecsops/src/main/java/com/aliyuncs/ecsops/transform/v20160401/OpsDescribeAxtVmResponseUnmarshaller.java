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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAxtVmResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAxtVmResponse.CloudAssistantStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeAxtVmResponseUnmarshaller {

	public static OpsDescribeAxtVmResponse unmarshall(OpsDescribeAxtVmResponse opsDescribeAxtVmResponse, UnmarshallerContext _ctx) {
		
		opsDescribeAxtVmResponse.setRequestId(_ctx.stringValue("OpsDescribeAxtVmResponse.RequestId"));

		List<CloudAssistantStatus> cloudAssistantStatusArray = new ArrayList<CloudAssistantStatus>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeAxtVmResponse.CloudAssistantStatusArray.Length"); i++) {
			CloudAssistantStatus cloudAssistantStatus = new CloudAssistantStatus();
			cloudAssistantStatus.setAgentVersion(_ctx.stringValue("OpsDescribeAxtVmResponse.CloudAssistantStatusArray["+ i +"].AgentVersion"));
			cloudAssistantStatus.setStatus(_ctx.stringValue("OpsDescribeAxtVmResponse.CloudAssistantStatusArray["+ i +"].Status"));
			cloudAssistantStatus.setInstanceId(_ctx.stringValue("OpsDescribeAxtVmResponse.CloudAssistantStatusArray["+ i +"].InstanceId"));
			cloudAssistantStatus.setAgentStatus(_ctx.stringValue("OpsDescribeAxtVmResponse.CloudAssistantStatusArray["+ i +"].AgentStatus"));
			cloudAssistantStatus.setReportTime(_ctx.stringValue("OpsDescribeAxtVmResponse.CloudAssistantStatusArray["+ i +"].ReportTime"));

			cloudAssistantStatusArray.add(cloudAssistantStatus);
		}
		opsDescribeAxtVmResponse.setCloudAssistantStatusArray(cloudAssistantStatusArray);
	 
	 	return opsDescribeAxtVmResponse;
	}
}