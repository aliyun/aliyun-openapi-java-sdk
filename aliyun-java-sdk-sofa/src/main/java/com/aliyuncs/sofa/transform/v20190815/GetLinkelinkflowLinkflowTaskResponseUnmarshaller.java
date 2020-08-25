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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowTaskResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowTaskResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowTaskResponse unmarshall(GetLinkelinkflowLinkflowTaskResponse getLinkelinkflowLinkflowTaskResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowTaskResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.RequestId"));
		getLinkelinkflowLinkflowTaskResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.ResultCode"));
		getLinkelinkflowLinkflowTaskResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.ResultMessage"));
		getLinkelinkflowLinkflowTaskResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowTaskResponse.Current"));
		getLinkelinkflowLinkflowTaskResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.ErrorCode"));
		getLinkelinkflowLinkflowTaskResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.ErrorMsg"));
		getLinkelinkflowLinkflowTaskResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowTaskResponse.PageSize"));
		getLinkelinkflowLinkflowTaskResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowTaskResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowTaskResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowTaskResponse.Success"));
		getLinkelinkflowLinkflowTaskResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowTaskResponse.Total"));

		Data data = new Data();
		data.setAssignedUser(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.AssignedUser"));
		data.setAssignee(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.Assignee"));
		data.setEndTime(_ctx.longValue("GetLinkelinkflowLinkflowTaskResponse.Data.EndTime"));
		data.setFinished(_ctx.booleanValue("GetLinkelinkflowLinkflowTaskResponse.Data.Finished"));
		data.setFormKey(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.FormKey"));
		data.setId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.Id"));
		data.setKey(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.Key"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.Name"));
		data.setProcessDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.ProcessDefinitionId"));
		data.setProcessInstance(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.ProcessInstance"));
		data.setProcessInstanceId(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.ProcessInstanceId"));
		data.setStartTime(_ctx.longValue("GetLinkelinkflowLinkflowTaskResponse.Data.StartTime"));

		List<String> candidates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowTaskResponse.Data.Candidates.Length"); i++) {
			candidates.add(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.Candidates["+ i +"]"));
		}
		data.setCandidates(candidates);

		List<String> candidateGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowTaskResponse.Data.CandidateGroups.Length"); i++) {
			candidateGroups.add(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.CandidateGroups["+ i +"]"));
		}
		data.setCandidateGroups(candidateGroups);

		List<String> candidateGroupUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowTaskResponse.Data.CandidateGroupUsers.Length"); i++) {
			candidateGroupUsers.add(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.CandidateGroupUsers["+ i +"]"));
		}
		data.setCandidateGroupUsers(candidateGroupUsers);

		List<String> candidateUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowTaskResponse.Data.CandidateUsers.Length"); i++) {
			candidateUsers.add(_ctx.stringValue("GetLinkelinkflowLinkflowTaskResponse.Data.CandidateUsers["+ i +"]"));
		}
		data.setCandidateUsers(candidateUsers);
		getLinkelinkflowLinkflowTaskResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowTaskResponse;
	}
}