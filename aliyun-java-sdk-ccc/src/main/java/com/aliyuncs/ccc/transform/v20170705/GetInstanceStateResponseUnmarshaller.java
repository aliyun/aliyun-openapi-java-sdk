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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceStateResponseUnmarshaller {

	public static GetInstanceStateResponse unmarshall(GetInstanceStateResponse getInstanceStateResponse, UnmarshallerContext _ctx) {
		
		getInstanceStateResponse.setRequestId(_ctx.stringValue("GetInstanceStateResponse.RequestId"));
		getInstanceStateResponse.setSuccess(_ctx.booleanValue("GetInstanceStateResponse.Success"));
		getInstanceStateResponse.setCode(_ctx.stringValue("GetInstanceStateResponse.Code"));
		getInstanceStateResponse.setMessage(_ctx.stringValue("GetInstanceStateResponse.Message"));
		getInstanceStateResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceStateResponse.HttpStatusCode"));

		RealTimeInstanceState realTimeInstanceState = new RealTimeInstanceState();

		List<AgentStateCount> agentStateDistributions = new ArrayList<AgentStateCount>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceStateResponse.RealTimeInstanceState.AgentStateDistributions.Length"); i++) {
			AgentStateCount agentStateCount = new AgentStateCount();
			agentStateCount.setState(_ctx.stringValue("GetInstanceStateResponse.RealTimeInstanceState.AgentStateDistributions["+ i +"].State"));
			agentStateCount.setCount(_ctx.longValue("GetInstanceStateResponse.RealTimeInstanceState.AgentStateDistributions["+ i +"].Count"));

			agentStateDistributions.add(agentStateCount);
		}
		realTimeInstanceState.setAgentStateDistributions(agentStateDistributions);
		getInstanceStateResponse.setRealTimeInstanceState(realTimeInstanceState);
	 
	 	return getInstanceStateResponse;
	}
}