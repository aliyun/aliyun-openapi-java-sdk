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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvInstanceHealthResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth;
import com.aliyuncs.webplus.model.v20190320.DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.InstanceHealth;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppEnvInstanceHealthResponseUnmarshaller {

	public static DescribeAppEnvInstanceHealthResponse unmarshall(DescribeAppEnvInstanceHealthResponse describeAppEnvInstanceHealthResponse, UnmarshallerContext _ctx) {
		
		describeAppEnvInstanceHealthResponse.setRequestId(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.RequestId"));
		describeAppEnvInstanceHealthResponse.setCode(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.Code"));
		describeAppEnvInstanceHealthResponse.setMessage(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.Message"));

		EnvInstanceHealth envInstanceHealth = new EnvInstanceHealth();
		envInstanceHealth.setEnvId(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.EnvId"));
		envInstanceHealth.setEnvName(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.EnvName"));

		List<InstanceHealth> instanceHealthList = new ArrayList<InstanceHealth>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.InstanceHealthList.Length"); i++) {
			InstanceHealth instanceHealth = new InstanceHealth();
			instanceHealth.setInstanceId(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.InstanceHealthList["+ i +"].InstanceId"));
			instanceHealth.setAgentStatus(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.InstanceHealthList["+ i +"].AgentStatus"));
			instanceHealth.setAppStatus(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.InstanceHealthList["+ i +"].AppStatus"));
			instanceHealth.setDisconnectedTime(_ctx.stringValue("DescribeAppEnvInstanceHealthResponse.EnvInstanceHealth.InstanceHealthList["+ i +"].DisconnectedTime"));

			instanceHealthList.add(instanceHealth);
		}
		envInstanceHealth.setInstanceHealthList(instanceHealthList);
		describeAppEnvInstanceHealthResponse.setEnvInstanceHealth(envInstanceHealth);
	 
	 	return describeAppEnvInstanceHealthResponse;
	}
}