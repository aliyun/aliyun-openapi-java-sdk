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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvStatusResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvStatusResponse.EnvStatus;
import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvStatusResponse.EnvStatus.InstanceAgentStatus;
import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvStatusResponse.EnvStatus.InstanceAppStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppEnvStatusResponseUnmarshaller {

	public static DescribeAppEnvStatusResponse unmarshall(DescribeAppEnvStatusResponse describeAppEnvStatusResponse, UnmarshallerContext _ctx) {
		
		describeAppEnvStatusResponse.setRequestId(_ctx.stringValue("DescribeAppEnvStatusResponse.RequestId"));
		describeAppEnvStatusResponse.setCode(_ctx.stringValue("DescribeAppEnvStatusResponse.Code"));
		describeAppEnvStatusResponse.setMessage(_ctx.stringValue("DescribeAppEnvStatusResponse.Message"));

		EnvStatus envStatus = new EnvStatus();
		envStatus.setEnvId(_ctx.stringValue("DescribeAppEnvStatusResponse.EnvStatus.EnvId"));
		envStatus.setEnvName(_ctx.stringValue("DescribeAppEnvStatusResponse.EnvStatus.EnvName"));
		envStatus.setEnvStatus(_ctx.stringValue("DescribeAppEnvStatusResponse.EnvStatus.EnvStatus"));
		envStatus.setLastEnvStatus(_ctx.stringValue("DescribeAppEnvStatusResponse.EnvStatus.LastEnvStatus"));
		envStatus.setApplyingChange(_ctx.booleanValue("DescribeAppEnvStatusResponse.EnvStatus.ApplyingChange"));
		envStatus.setAbortingChange(_ctx.booleanValue("DescribeAppEnvStatusResponse.EnvStatus.AbortingChange"));
		envStatus.setLatestChangeId(_ctx.stringValue("DescribeAppEnvStatusResponse.EnvStatus.LatestChangeId"));
		envStatus.setChangeBanner(_ctx.stringValue("DescribeAppEnvStatusResponse.EnvStatus.ChangeBanner"));

		InstanceAppStatus instanceAppStatus = new InstanceAppStatus();
		instanceAppStatus.setHealthyInstances(_ctx.integerValue("DescribeAppEnvStatusResponse.EnvStatus.InstanceAppStatus.HealthyInstances"));
		instanceAppStatus.setUnhealthyInstances(_ctx.integerValue("DescribeAppEnvStatusResponse.EnvStatus.InstanceAppStatus.UnhealthyInstances"));
		instanceAppStatus.setUnknownInstances(_ctx.integerValue("DescribeAppEnvStatusResponse.EnvStatus.InstanceAppStatus.UnknownInstances"));
		instanceAppStatus.setStoppedInstances(_ctx.integerValue("DescribeAppEnvStatusResponse.EnvStatus.InstanceAppStatus.StoppedInstances"));
		envStatus.setInstanceAppStatus(instanceAppStatus);

		InstanceAgentStatus instanceAgentStatus = new InstanceAgentStatus();
		instanceAgentStatus.setConnectedInstances(_ctx.integerValue("DescribeAppEnvStatusResponse.EnvStatus.InstanceAgentStatus.ConnectedInstances"));
		instanceAgentStatus.setDisconnectedInstances(_ctx.integerValue("DescribeAppEnvStatusResponse.EnvStatus.InstanceAgentStatus.DisconnectedInstances"));
		envStatus.setInstanceAgentStatus(instanceAgentStatus);
		describeAppEnvStatusResponse.setEnvStatus(envStatus);
	 
	 	return describeAppEnvStatusResponse;
	}
}