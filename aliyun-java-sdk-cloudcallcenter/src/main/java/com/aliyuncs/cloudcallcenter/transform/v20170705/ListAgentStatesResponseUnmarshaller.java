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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentStatesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentStatesResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentStatesResponse.Data.RealTimeAgentState;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentStatesResponseUnmarshaller {

	public static ListAgentStatesResponse unmarshall(ListAgentStatesResponse listAgentStatesResponse, UnmarshallerContext context) {
		
		listAgentStatesResponse.setRequestId(context.stringValue("ListAgentStatesResponse.RequestId"));
		listAgentStatesResponse.setSuccess(context.booleanValue("ListAgentStatesResponse.Success"));
		listAgentStatesResponse.setCode(context.stringValue("ListAgentStatesResponse.Code"));
		listAgentStatesResponse.setMessage(context.stringValue("ListAgentStatesResponse.Message"));
		listAgentStatesResponse.setHttpStatusCode(context.integerValue("ListAgentStatesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListAgentStatesResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListAgentStatesResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListAgentStatesResponse.Data.PageSize"));

		List<RealTimeAgentState> list = new ArrayList<RealTimeAgentState>();
		for (int i = 0; i < context.lengthValue("ListAgentStatesResponse.Data.List.Length"); i++) {
			RealTimeAgentState realTimeAgentState = new RealTimeAgentState();
			realTimeAgentState.setInstanceId(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].InstanceId"));
			realTimeAgentState.setAgentId(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].AgentId"));
			realTimeAgentState.setLoginName(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].LoginName"));
			realTimeAgentState.setAgentName(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].AgentName"));
			realTimeAgentState.setState(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].State"));
			realTimeAgentState.setDn(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].Dn"));
			realTimeAgentState.setStateDuration(context.stringValue("ListAgentStatesResponse.Data.List["+ i +"].StateDuration"));

			list.add(realTimeAgentState);
		}
		data.setList(list);
		listAgentStatesResponse.setData(data);
	 
	 	return listAgentStatesResponse;
	}
}