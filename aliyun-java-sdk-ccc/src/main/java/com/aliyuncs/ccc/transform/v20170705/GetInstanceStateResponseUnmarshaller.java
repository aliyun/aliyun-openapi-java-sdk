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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetInstanceStateResponse;
import com.aliyuncs.ccc.model.v20170705.GetInstanceStateResponse.RealTimeInstanceState;
import com.aliyuncs.ccc.model.v20170705.GetInstanceStateResponse.RealTimeInstanceState.AgentStateCount;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceStateResponseUnmarshaller {

	public static GetInstanceStateResponse unmarshall(GetInstanceStateResponse getInstanceStateResponse, UnmarshallerContext context) {
		
		getInstanceStateResponse.setRequestId(context.stringValue("GetInstanceStateResponse.RequestId"));
		getInstanceStateResponse.setSuccess(context.booleanValue("GetInstanceStateResponse.Success"));
		getInstanceStateResponse.setCode(context.stringValue("GetInstanceStateResponse.Code"));
		getInstanceStateResponse.setMessage(context.stringValue("GetInstanceStateResponse.Message"));
		getInstanceStateResponse.setHttpStatusCode(context.integerValue("GetInstanceStateResponse.HttpStatusCode"));

		RealTimeInstanceState realTimeInstanceState = new RealTimeInstanceState();

		List<AgentStateCount> agentStateDistributions = new ArrayList<AgentStateCount>();
		for (int i = 0; i < context.lengthValue("GetInstanceStateResponse.RealTimeInstanceState.AgentStateDistributions.Length"); i++) {
			AgentStateCount agentStateCount = new AgentStateCount();
			agentStateCount.setState(context.stringValue("GetInstanceStateResponse.RealTimeInstanceState.AgentStateDistributions["+ i +"].State"));
			agentStateCount.setCount(context.longValue("GetInstanceStateResponse.RealTimeInstanceState.AgentStateDistributions["+ i +"].Count"));

			agentStateDistributions.add(agentStateCount);
		}
		realTimeInstanceState.setAgentStateDistributions(agentStateDistributions);
		getInstanceStateResponse.setRealTimeInstanceState(realTimeInstanceState);
	 
	 	return getInstanceStateResponse;
	}
}