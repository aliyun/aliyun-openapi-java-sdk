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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueTasksResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueTasksResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueTasksResponse.Data.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGovernanceIssueTasksResponseUnmarshaller {

	public static ListGovernanceIssueTasksResponse unmarshall(ListGovernanceIssueTasksResponse listGovernanceIssueTasksResponse, UnmarshallerContext _ctx) {
		
		listGovernanceIssueTasksResponse.setRequestId(_ctx.stringValue("ListGovernanceIssueTasksResponse.RequestId"));
		listGovernanceIssueTasksResponse.setSuccess(_ctx.booleanValue("ListGovernanceIssueTasksResponse.Success"));
		listGovernanceIssueTasksResponse.setErrorCode(_ctx.stringValue("ListGovernanceIssueTasksResponse.ErrorCode"));
		listGovernanceIssueTasksResponse.setErrorMessage(_ctx.stringValue("ListGovernanceIssueTasksResponse.ErrorMessage"));
		listGovernanceIssueTasksResponse.setHttpStatusCode(_ctx.integerValue("ListGovernanceIssueTasksResponse.HttpStatusCode"));
		listGovernanceIssueTasksResponse.setDynamicErrorCode(_ctx.stringValue("ListGovernanceIssueTasksResponse.DynamicErrorCode"));
		listGovernanceIssueTasksResponse.setDynamicErrorMessage(_ctx.stringValue("ListGovernanceIssueTasksResponse.DynamicErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListGovernanceIssueTasksResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGovernanceIssueTasksResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListGovernanceIssueTasksResponse.Data.TotalCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListGovernanceIssueTasksResponse.Data.Tasks.Length"); i++) {
			Task task = new Task();
			task.setNodeName(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].NodeName"));
			task.setNodeId(_ctx.longValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].NodeId"));
			task.setNodeType(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].NodeType"));
			task.setRuleId(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].RuleId"));
			task.setRuleCategory(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].RuleCategory"));
			task.setProjectId(_ctx.longValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].ProjectId"));
			task.setOwnerId(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].OwnerId"));
			task.setBizDate(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].BizDate"));
			task.setProperties(_ctx.stringValue("ListGovernanceIssueTasksResponse.Data.Tasks["+ i +"].Properties"));

			tasks.add(task);
		}
		data.setTasks(tasks);
		listGovernanceIssueTasksResponse.setData(data);
	 
	 	return listGovernanceIssueTasksResponse;
	}
}