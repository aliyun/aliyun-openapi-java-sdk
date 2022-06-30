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

import com.aliyuncs.ccc.model.v20200701.ListAgentStatesResponse;
import com.aliyuncs.ccc.model.v20200701.ListAgentStatesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListAgentStatesResponse.Data.RealTimeAgentState;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentStatesResponseUnmarshaller {

	public static ListAgentStatesResponse unmarshall(ListAgentStatesResponse listAgentStatesResponse, UnmarshallerContext _ctx) {
		
		listAgentStatesResponse.setRequestId(_ctx.stringValue("ListAgentStatesResponse.RequestId"));
		listAgentStatesResponse.setHttpStatusCode(_ctx.integerValue("ListAgentStatesResponse.HttpStatusCode"));
		listAgentStatesResponse.setCode(_ctx.stringValue("ListAgentStatesResponse.Code"));
		listAgentStatesResponse.setMessage(_ctx.stringValue("ListAgentStatesResponse.Message"));
		listAgentStatesResponse.setSuccess(_ctx.booleanValue("ListAgentStatesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListAgentStatesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAgentStatesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListAgentStatesResponse.Data.TotalCount"));

		List<RealTimeAgentState> list = new ArrayList<RealTimeAgentState>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentStatesResponse.Data.List.Length"); i++) {
			RealTimeAgentState realTimeAgentState = new RealTimeAgentState();
			realTimeAgentState.setLoginName(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].LoginName"));
			realTimeAgentState.setDn(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].Dn"));
			realTimeAgentState.setStateDuration(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].StateDuration"));
			realTimeAgentState.setState(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].State"));
			realTimeAgentState.setAgentId(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].AgentId"));
			realTimeAgentState.setAgentName(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].AgentName"));
			realTimeAgentState.setInstanceId(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].InstanceId"));
			realTimeAgentState.setBreakCode(_ctx.stringValue("ListAgentStatesResponse.Data.List["+ i +"].BreakCode"));

			list.add(realTimeAgentState);
		}
		data.setList(list);
		listAgentStatesResponse.setData(data);
	 
	 	return listAgentStatesResponse;
	}
}