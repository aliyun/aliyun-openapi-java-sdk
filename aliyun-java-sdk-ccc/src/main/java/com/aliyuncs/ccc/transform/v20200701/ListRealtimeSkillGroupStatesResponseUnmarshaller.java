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

import com.aliyuncs.ccc.model.v20200701.ListRealtimeSkillGroupStatesResponse;
import com.aliyuncs.ccc.model.v20200701.ListRealtimeSkillGroupStatesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListRealtimeSkillGroupStatesResponse.Data.SkillGroupState;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRealtimeSkillGroupStatesResponseUnmarshaller {

	public static ListRealtimeSkillGroupStatesResponse unmarshall(ListRealtimeSkillGroupStatesResponse listRealtimeSkillGroupStatesResponse, UnmarshallerContext _ctx) {
		
		listRealtimeSkillGroupStatesResponse.setRequestId(_ctx.stringValue("ListRealtimeSkillGroupStatesResponse.RequestId"));
		listRealtimeSkillGroupStatesResponse.setCode(_ctx.stringValue("ListRealtimeSkillGroupStatesResponse.Code"));
		listRealtimeSkillGroupStatesResponse.setHttpStatusCode(_ctx.integerValue("ListRealtimeSkillGroupStatesResponse.HttpStatusCode"));
		listRealtimeSkillGroupStatesResponse.setMessage(_ctx.stringValue("ListRealtimeSkillGroupStatesResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListRealtimeSkillGroupStatesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListRealtimeSkillGroupStatesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListRealtimeSkillGroupStatesResponse.Data.TotalCount"));

		List<SkillGroupState> list = new ArrayList<SkillGroupState>();
		for (int i = 0; i < _ctx.lengthValue("ListRealtimeSkillGroupStatesResponse.Data.List.Length"); i++) {
			SkillGroupState skillGroupState = new SkillGroupState();
			skillGroupState.setBreakingAgents(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].BreakingAgents"));
			skillGroupState.setInstanceId(_ctx.stringValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].InstanceId"));
			skillGroupState.setLoggedInAgents(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].LoggedInAgents"));
			skillGroupState.setLongestWaitingTime(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].LongestWaitingTime"));
			skillGroupState.setReadyAgents(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].ReadyAgents"));
			skillGroupState.setSkillGroupId(_ctx.stringValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].SkillGroupId"));
			skillGroupState.setSkillGroupName(_ctx.stringValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].SkillGroupName"));
			skillGroupState.setTalkingAgents(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].TalkingAgents"));
			skillGroupState.setWaitingCalls(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].WaitingCalls"));
			skillGroupState.setWorkingAgents(_ctx.longValue("ListRealtimeSkillGroupStatesResponse.Data.List["+ i +"].WorkingAgents"));

			list.add(skillGroupState);
		}
		data.setList(list);
		listRealtimeSkillGroupStatesResponse.setData(data);
	 
	 	return listRealtimeSkillGroupStatesResponse;
	}
}