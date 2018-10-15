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

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupStatesResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupStatesResponse.Data;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupStatesResponse.Data.RealTimeSkillGroupState;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupStatesResponseUnmarshaller {

	public static ListSkillGroupStatesResponse unmarshall(ListSkillGroupStatesResponse listSkillGroupStatesResponse, UnmarshallerContext context) {
		
		listSkillGroupStatesResponse.setRequestId(context.stringValue("ListSkillGroupStatesResponse.RequestId"));
		listSkillGroupStatesResponse.setSuccess(context.booleanValue("ListSkillGroupStatesResponse.Success"));
		listSkillGroupStatesResponse.setCode(context.stringValue("ListSkillGroupStatesResponse.Code"));
		listSkillGroupStatesResponse.setMessage(context.stringValue("ListSkillGroupStatesResponse.Message"));
		listSkillGroupStatesResponse.setHttpStatusCode(context.integerValue("ListSkillGroupStatesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListSkillGroupStatesResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListSkillGroupStatesResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListSkillGroupStatesResponse.Data.PageSize"));

		List<RealTimeSkillGroupState> list = new ArrayList<RealTimeSkillGroupState>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupStatesResponse.Data.List.Length"); i++) {
			RealTimeSkillGroupState realTimeSkillGroupState = new RealTimeSkillGroupState();
			realTimeSkillGroupState.setInstanceId(context.stringValue("ListSkillGroupStatesResponse.Data.List["+ i +"].InstanceId"));
			realTimeSkillGroupState.setSkillGroupId(context.stringValue("ListSkillGroupStatesResponse.Data.List["+ i +"].SkillGroupId"));
			realTimeSkillGroupState.setSkillGroupName(context.stringValue("ListSkillGroupStatesResponse.Data.List["+ i +"].SkillGroupName"));
			realTimeSkillGroupState.setWaitingCalls(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WaitingCalls"));
			realTimeSkillGroupState.setLongestCall(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].LongestCall"));
			realTimeSkillGroupState.setLoggedInAgents(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].LoggedInAgents"));
			realTimeSkillGroupState.setReadyAgents(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].ReadyAgents"));
			realTimeSkillGroupState.setBreakingAgents(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].BreakingAgents"));
			realTimeSkillGroupState.setTalkingAgents(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].TalkingAgents"));
			realTimeSkillGroupState.setWorkingAgents(context.longValue("ListSkillGroupStatesResponse.Data.List["+ i +"].WorkingAgents"));

			list.add(realTimeSkillGroupState);
		}
		data.setList(list);
		listSkillGroupStatesResponse.setData(data);
	 
	 	return listSkillGroupStatesResponse;
	}
}