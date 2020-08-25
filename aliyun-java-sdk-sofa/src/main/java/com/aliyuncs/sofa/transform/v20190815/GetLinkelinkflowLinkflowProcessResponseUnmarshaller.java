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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowProcessResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowProcessResponse unmarshall(GetLinkelinkflowLinkflowProcessResponse getLinkelinkflowLinkflowProcessResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowProcessResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.RequestId"));
		getLinkelinkflowLinkflowProcessResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.ResultCode"));
		getLinkelinkflowLinkflowProcessResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.ResultMessage"));
		getLinkelinkflowLinkflowProcessResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowProcessResponse.Current"));
		getLinkelinkflowLinkflowProcessResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.ErrorCode"));
		getLinkelinkflowLinkflowProcessResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.ErrorMsg"));
		getLinkelinkflowLinkflowProcessResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowProcessResponse.PageSize"));
		getLinkelinkflowLinkflowProcessResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowProcessResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowProcessResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowProcessResponse.Success"));
		getLinkelinkflowLinkflowProcessResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowProcessResponse.Total"));

		Data data = new Data();
		data.setBizId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.BizId"));
		data.setDefinitionId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.DefinitionId"));
		data.setDefinitionKey(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.DefinitionKey"));
		data.setFinished(_ctx.booleanValue("GetLinkelinkflowLinkflowProcessResponse.Data.Finished"));
		data.setId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.Name"));
		data.setStarter(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.Starter"));
		data.setStartTime(_ctx.longValue("GetLinkelinkflowLinkflowProcessResponse.Data.StartTime"));
		data.setStartUserId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.StartUserId"));
		data.setStatus(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.Status"));
		data.setTenantId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.TenantId"));
		data.setUrl(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.Url"));
		data.setVariables(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.Variables"));

		List<String> assigneeUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowProcessResponse.Data.AssigneeUserIds.Length"); i++) {
			assigneeUserIds.add(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.AssigneeUserIds["+ i +"]"));
		}
		data.setAssigneeUserIds(assigneeUserIds);

		List<String> candidateUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowProcessResponse.Data.CandidateUsers.Length"); i++) {
			candidateUsers.add(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.CandidateUsers["+ i +"]"));
		}
		data.setCandidateUsers(candidateUsers);

		List<String> candidateUserIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowProcessResponse.Data.CandidateUserIds.Length"); i++) {
			candidateUserIds.add(_ctx.stringValue("GetLinkelinkflowLinkflowProcessResponse.Data.CandidateUserIds["+ i +"]"));
		}
		data.setCandidateUserIds(candidateUserIds);
		getLinkelinkflowLinkflowProcessResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowProcessResponse;
	}
}