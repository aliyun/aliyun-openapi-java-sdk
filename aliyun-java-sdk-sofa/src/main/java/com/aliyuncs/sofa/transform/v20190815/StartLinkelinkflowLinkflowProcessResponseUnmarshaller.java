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

import com.aliyuncs.sofa.model.v20190815.StartLinkelinkflowLinkflowProcessResponse;
import com.aliyuncs.sofa.model.v20190815.StartLinkelinkflowLinkflowProcessResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartLinkelinkflowLinkflowProcessResponseUnmarshaller {

	public static StartLinkelinkflowLinkflowProcessResponse unmarshall(StartLinkelinkflowLinkflowProcessResponse startLinkelinkflowLinkflowProcessResponse, UnmarshallerContext _ctx) {
		
		startLinkelinkflowLinkflowProcessResponse.setRequestId(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.RequestId"));
		startLinkelinkflowLinkflowProcessResponse.setResultCode(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.ResultCode"));
		startLinkelinkflowLinkflowProcessResponse.setResultMessage(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.ResultMessage"));
		startLinkelinkflowLinkflowProcessResponse.setCurrent(_ctx.longValue("StartLinkelinkflowLinkflowProcessResponse.Current"));
		startLinkelinkflowLinkflowProcessResponse.setErrorCode(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.ErrorCode"));
		startLinkelinkflowLinkflowProcessResponse.setErrorMsg(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.ErrorMsg"));
		startLinkelinkflowLinkflowProcessResponse.setPageSize(_ctx.longValue("StartLinkelinkflowLinkflowProcessResponse.PageSize"));
		startLinkelinkflowLinkflowProcessResponse.setResponseStatusCode(_ctx.longValue("StartLinkelinkflowLinkflowProcessResponse.ResponseStatusCode"));
		startLinkelinkflowLinkflowProcessResponse.setSuccess(_ctx.booleanValue("StartLinkelinkflowLinkflowProcessResponse.Success"));
		startLinkelinkflowLinkflowProcessResponse.setTotal(_ctx.longValue("StartLinkelinkflowLinkflowProcessResponse.Total"));

		Data data = new Data();
		data.setBizId(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.BizId"));
		data.setDefinitionId(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.DefinitionId"));
		data.setDefinitionKey(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.DefinitionKey"));
		data.setFinished(_ctx.booleanValue("StartLinkelinkflowLinkflowProcessResponse.Data.Finished"));
		data.setId(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.Id"));
		data.setName(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.Name"));
		data.setStarter(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.Starter"));
		data.setStartTime(_ctx.longValue("StartLinkelinkflowLinkflowProcessResponse.Data.StartTime"));
		data.setStartUserId(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.StartUserId"));
		data.setStatus(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.Status"));
		data.setTenantId(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.TenantId"));
		data.setUrl(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.Url"));
		data.setVariables(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.Variables"));

		List<String> assigneeUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkelinkflowLinkflowProcessResponse.Data.AssigneeUserIds.Length"); i++) {
			assigneeUserIds.add(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.AssigneeUserIds["+ i +"]"));
		}
		data.setAssigneeUserIds(assigneeUserIds);

		List<String> candidateUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkelinkflowLinkflowProcessResponse.Data.CandidateUsers.Length"); i++) {
			candidateUsers.add(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.CandidateUsers["+ i +"]"));
		}
		data.setCandidateUsers(candidateUsers);

		List<String> candidateUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkelinkflowLinkflowProcessResponse.Data.CandidateUserIds.Length"); i++) {
			candidateUserIds.add(_ctx.stringValue("StartLinkelinkflowLinkflowProcessResponse.Data.CandidateUserIds["+ i +"]"));
		}
		data.setCandidateUserIds(candidateUserIds);
		startLinkelinkflowLinkflowProcessResponse.setData(data);
	 
	 	return startLinkelinkflowLinkflowProcessResponse;
	}
}