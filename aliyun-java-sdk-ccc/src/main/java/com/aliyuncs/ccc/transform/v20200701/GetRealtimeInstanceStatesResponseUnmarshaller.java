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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetRealtimeInstanceStatesResponse;
import com.aliyuncs.ccc.model.v20200701.GetRealtimeInstanceStatesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealtimeInstanceStatesResponseUnmarshaller {

	public static GetRealtimeInstanceStatesResponse unmarshall(GetRealtimeInstanceStatesResponse getRealtimeInstanceStatesResponse, UnmarshallerContext _ctx) {
		
		getRealtimeInstanceStatesResponse.setRequestId(_ctx.stringValue("GetRealtimeInstanceStatesResponse.RequestId"));
		getRealtimeInstanceStatesResponse.setCode(_ctx.stringValue("GetRealtimeInstanceStatesResponse.Code"));
		getRealtimeInstanceStatesResponse.setHttpStatusCode(_ctx.integerValue("GetRealtimeInstanceStatesResponse.HttpStatusCode"));
		getRealtimeInstanceStatesResponse.setMessage(_ctx.stringValue("GetRealtimeInstanceStatesResponse.Message"));

		Data data = new Data();
		data.setBreakingAgents(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.BreakingAgents"));
		data.setInstanceId(_ctx.stringValue("GetRealtimeInstanceStatesResponse.Data.InstanceId"));
		data.setInteractiveCalls(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.InteractiveCalls"));
		data.setLoggedInAgents(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.LoggedInAgents"));
		data.setLongestCall(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.LongestCall"));
		data.setReadyAgents(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.ReadyAgents"));
		data.setTalkingAgents(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.TalkingAgents"));
		data.setTotalAgents(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.TotalAgents"));
		data.setWaitingCalls(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.WaitingCalls"));
		data.setWorkingAgents(_ctx.longValue("GetRealtimeInstanceStatesResponse.Data.WorkingAgents"));
		getRealtimeInstanceStatesResponse.setData(data);
	 
	 	return getRealtimeInstanceStatesResponse;
	}
}