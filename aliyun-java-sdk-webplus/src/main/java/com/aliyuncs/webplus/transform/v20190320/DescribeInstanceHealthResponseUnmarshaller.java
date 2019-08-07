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

import com.aliyuncs.webplus.model.v20190320.DescribeInstanceHealthResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeInstanceHealthResponse.InstanceHealth;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceHealthResponseUnmarshaller {

	public static DescribeInstanceHealthResponse unmarshall(DescribeInstanceHealthResponse describeInstanceHealthResponse, UnmarshallerContext _ctx) {
		
		describeInstanceHealthResponse.setRequestId(_ctx.stringValue("DescribeInstanceHealthResponse.RequestId"));
		describeInstanceHealthResponse.setCode(_ctx.stringValue("DescribeInstanceHealthResponse.Code"));
		describeInstanceHealthResponse.setMessage(_ctx.stringValue("DescribeInstanceHealthResponse.Message"));

		InstanceHealth instanceHealth = new InstanceHealth();
		instanceHealth.setInstanceId(_ctx.stringValue("DescribeInstanceHealthResponse.InstanceHealth.InstanceId"));
		instanceHealth.setAgentStatus(_ctx.stringValue("DescribeInstanceHealthResponse.InstanceHealth.AgentStatus"));
		instanceHealth.setAppStatus(_ctx.stringValue("DescribeInstanceHealthResponse.InstanceHealth.AppStatus"));
		instanceHealth.setDisconnectedTime(_ctx.longValue("DescribeInstanceHealthResponse.InstanceHealth.DisconnectedTime"));
		describeInstanceHealthResponse.setInstanceHealth(instanceHealth);
	 
	 	return describeInstanceHealthResponse;
	}
}