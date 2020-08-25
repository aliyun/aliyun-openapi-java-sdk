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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowTaskResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowTaskResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkelinkflowLinkflowTaskResponseUnmarshaller {

	public static QueryLinkelinkflowLinkflowTaskResponse unmarshall(QueryLinkelinkflowLinkflowTaskResponse queryLinkelinkflowLinkflowTaskResponse, UnmarshallerContext _ctx) {
		
		queryLinkelinkflowLinkflowTaskResponse.setRequestId(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.RequestId"));
		queryLinkelinkflowLinkflowTaskResponse.setResultCode(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.ResultCode"));
		queryLinkelinkflowLinkflowTaskResponse.setResultMessage(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.ResultMessage"));
		queryLinkelinkflowLinkflowTaskResponse.setCurrent(_ctx.longValue("QueryLinkelinkflowLinkflowTaskResponse.Current"));
		queryLinkelinkflowLinkflowTaskResponse.setErrorCode(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.ErrorCode"));
		queryLinkelinkflowLinkflowTaskResponse.setErrorMsg(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.ErrorMsg"));
		queryLinkelinkflowLinkflowTaskResponse.setPageSize(_ctx.longValue("QueryLinkelinkflowLinkflowTaskResponse.PageSize"));
		queryLinkelinkflowLinkflowTaskResponse.setResponseStatusCode(_ctx.longValue("QueryLinkelinkflowLinkflowTaskResponse.ResponseStatusCode"));
		queryLinkelinkflowLinkflowTaskResponse.setSuccess(_ctx.booleanValue("QueryLinkelinkflowLinkflowTaskResponse.Success"));
		queryLinkelinkflowLinkflowTaskResponse.setTotal(_ctx.longValue("QueryLinkelinkflowLinkflowTaskResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkelinkflowLinkflowTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAssignedUser(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].AssignedUser"));
			dataItem.setAssignee(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Assignee"));
			dataItem.setEndTime(_ctx.longValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].EndTime"));
			dataItem.setFinished(_ctx.booleanValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Finished"));
			dataItem.setFormKey(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].FormKey"));
			dataItem.setId(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Id"));
			dataItem.setKey(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Key"));
			dataItem.setName(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Name"));
			dataItem.setProcessDefinitionId(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].ProcessDefinitionId"));
			dataItem.setProcessInstance(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].ProcessInstance"));
			dataItem.setProcessInstanceId(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].ProcessInstanceId"));
			dataItem.setStartTime(_ctx.longValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].StartTime"));

			List<String> candidates = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Candidates.Length"); j++) {
				candidates.add(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].Candidates["+ j +"]"));
			}
			dataItem.setCandidates(candidates);

			List<String> candidateGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].CandidateGroups.Length"); j++) {
				candidateGroups.add(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].CandidateGroups["+ j +"]"));
			}
			dataItem.setCandidateGroups(candidateGroups);

			List<String> candidateGroupUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].CandidateGroupUsers.Length"); j++) {
				candidateGroupUsers.add(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].CandidateGroupUsers["+ j +"]"));
			}
			dataItem.setCandidateGroupUsers(candidateGroupUsers);

			List<String> candidateUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].CandidateUsers.Length"); j++) {
				candidateUsers.add(_ctx.stringValue("QueryLinkelinkflowLinkflowTaskResponse.Data["+ i +"].CandidateUsers["+ j +"]"));
			}
			dataItem.setCandidateUsers(candidateUsers);

			data.add(dataItem);
		}
		queryLinkelinkflowLinkflowTaskResponse.setData(data);
	 
	 	return queryLinkelinkflowLinkflowTaskResponse;
	}
}