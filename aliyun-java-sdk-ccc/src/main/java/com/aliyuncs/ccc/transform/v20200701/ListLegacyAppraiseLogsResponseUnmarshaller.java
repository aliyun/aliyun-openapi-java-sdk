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

import com.aliyuncs.ccc.model.v20200701.ListLegacyAppraiseLogsResponse;
import com.aliyuncs.ccc.model.v20200701.ListLegacyAppraiseLogsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListLegacyAppraiseLogsResponse.Data.AgentStatusLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLegacyAppraiseLogsResponseUnmarshaller {

	public static ListLegacyAppraiseLogsResponse unmarshall(ListLegacyAppraiseLogsResponse listLegacyAppraiseLogsResponse, UnmarshallerContext _ctx) {
		
		listLegacyAppraiseLogsResponse.setRequestId(_ctx.stringValue("ListLegacyAppraiseLogsResponse.RequestId"));
		listLegacyAppraiseLogsResponse.setHttpStatusCode(_ctx.integerValue("ListLegacyAppraiseLogsResponse.HttpStatusCode"));
		listLegacyAppraiseLogsResponse.setCode(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Code"));
		listLegacyAppraiseLogsResponse.setMessage(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Message"));
		listLegacyAppraiseLogsResponse.setSuccess(_ctx.booleanValue("ListLegacyAppraiseLogsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListLegacyAppraiseLogsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListLegacyAppraiseLogsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListLegacyAppraiseLogsResponse.Data.TotalCount"));

		List<AgentStatusLog> list = new ArrayList<AgentStatusLog>();
		for (int i = 0; i < _ctx.lengthValue("ListLegacyAppraiseLogsResponse.Data.List.Length"); i++) {
			AgentStatusLog agentStatusLog = new AgentStatusLog();
			agentStatusLog.setId(_ctx.longValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].Id"));
			agentStatusLog.setAcid(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].Acid"));
			agentStatusLog.setContactType(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].ContactType"));
			agentStatusLog.setRamId(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].RamId"));
			agentStatusLog.setStatisticDate(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].StatisticDate"));
			agentStatusLog.setSkillGroupId(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].SkillGroupId"));
			agentStatusLog.setInstanceId(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].InstanceId"));
			agentStatusLog.setPressKey(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].PressKey"));
			agentStatusLog.setNote(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].Note"));
			agentStatusLog.setParentNote(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].ParentNote"));
			agentStatusLog.setType(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].Type"));
			agentStatusLog.setKeyMarkRelation(_ctx.stringValue("ListLegacyAppraiseLogsResponse.Data.List["+ i +"].KeyMarkRelation"));

			list.add(agentStatusLog);
		}
		data.setList(list);
		listLegacyAppraiseLogsResponse.setData(data);
	 
	 	return listLegacyAppraiseLogsResponse;
	}
}