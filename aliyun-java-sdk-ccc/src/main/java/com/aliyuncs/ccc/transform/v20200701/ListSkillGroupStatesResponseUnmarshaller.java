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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListSkillGroupStatesResponse;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupStatesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupStatesResponse.Data.RealTimeSkillGroupState;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupStatesResponseUnmarshaller {

	public static ListSkillGroupStatesResponse unmarshall(ListSkillGroupStatesResponse listSkillGroupStatesResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupStatesResponse.setRequestId(_ctx.stringValue("ListSkillGroupStatesResponse.RequestId"));
		listSkillGroupStatesResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupStatesResponse.HttpStatusCode"));
		listSkillGroupStatesResponse.setCode(_ctx.stringValue("ListSkillGroupStatesResponse.Code"));
		listSkillGroupStatesResponse.setMessage(_ctx.stringValue("ListSkillGroupStatesResponse.Message"));
		listSkillGroupStatesResponse.setSuccess(_ctx.booleanValue("ListSkillGroupStatesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListSkillGroupStatesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListSkillGroupStatesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListSkillGroupStatesResponse.Data.TotalCount"));

		List<RealTimeSkillGroupState> list = new ArrayList<RealTimeSkillGroupState>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupStatesResponse.Data.List.Length"); i++) {
			RealTimeSkillGroupState realTimeSkillGroupState = new RealTimeSkillGroupState();
			realTimeSkillGroupState.setWorkingAgents(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WorkingAgents"));
			realTimeSkillGroupState.setLoggedInAgents(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].LoggedInAgents"));
			realTimeSkillGroupState.setBreakingAgents(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].BreakingAgents"));
			realTimeSkillGroupState.setLongestCall(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].LongestCall"));
			realTimeSkillGroupState.setWaitingCalls(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WaitingCalls"));
			realTimeSkillGroupState.setTalkingAgents(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].TalkingAgents"));
			realTimeSkillGroupState.setSkillGroupName(_ctx.stringValue("ListSkillGroupStatesResponse.Data.List["+ i +"].SkillGroupName"));
			realTimeSkillGroupState.setSkillGroupId(_ctx.stringValue("ListSkillGroupStatesResponse.Data.List["+ i +"].SkillGroupId"));
			realTimeSkillGroupState.setReadyAgents(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].ReadyAgents"));
			realTimeSkillGroupState.setInstanceId(_ctx.stringValue("ListSkillGroupStatesResponse.Data.List["+ i +"].InstanceId"));
			realTimeSkillGroupState.setAverageWaitingTime(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].AverageWaitingTime"));
			realTimeSkillGroupState.setWaitingCallsLevel10(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WaitingCallsLevel10"));
			realTimeSkillGroupState.setWaitingCallsLevel20(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WaitingCallsLevel20"));
			realTimeSkillGroupState.setWaitingCallsLevel30(_ctx.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WaitingCallsLevel30"));

			list.add(realTimeSkillGroupState);
		}
		data.setList(list);
		listSkillGroupStatesResponse.setData(data);
	 
	 	return listSkillGroupStatesResponse;
	}
}