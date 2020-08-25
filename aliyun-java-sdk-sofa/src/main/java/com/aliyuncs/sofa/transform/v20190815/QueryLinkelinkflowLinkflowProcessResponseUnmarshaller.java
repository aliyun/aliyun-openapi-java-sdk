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

import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowProcessResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowProcessResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkelinkflowLinkflowProcessResponseUnmarshaller {

	public static QueryLinkelinkflowLinkflowProcessResponse unmarshall(QueryLinkelinkflowLinkflowProcessResponse queryLinkelinkflowLinkflowProcessResponse, UnmarshallerContext _ctx) {
		
		queryLinkelinkflowLinkflowProcessResponse.setRequestId(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.RequestId"));
		queryLinkelinkflowLinkflowProcessResponse.setResultCode(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.ResultCode"));
		queryLinkelinkflowLinkflowProcessResponse.setResultMessage(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.ResultMessage"));
		queryLinkelinkflowLinkflowProcessResponse.setCurrent(_ctx.longValue("QueryLinkelinkflowLinkflowProcessResponse.Current"));
		queryLinkelinkflowLinkflowProcessResponse.setErrorCode(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.ErrorCode"));
		queryLinkelinkflowLinkflowProcessResponse.setErrorMsg(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.ErrorMsg"));
		queryLinkelinkflowLinkflowProcessResponse.setPageSize(_ctx.longValue("QueryLinkelinkflowLinkflowProcessResponse.PageSize"));
		queryLinkelinkflowLinkflowProcessResponse.setResponseStatusCode(_ctx.longValue("QueryLinkelinkflowLinkflowProcessResponse.ResponseStatusCode"));
		queryLinkelinkflowLinkflowProcessResponse.setSuccess(_ctx.booleanValue("QueryLinkelinkflowLinkflowProcessResponse.Success"));
		queryLinkelinkflowLinkflowProcessResponse.setTotal(_ctx.longValue("QueryLinkelinkflowLinkflowProcessResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkelinkflowLinkflowProcessResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizId(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].BizId"));
			dataItem.setDefinitionId(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].DefinitionId"));
			dataItem.setDefinitionKey(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].DefinitionKey"));
			dataItem.setFinished(_ctx.booleanValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Finished"));
			dataItem.setId(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Name"));
			dataItem.setStarter(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Starter"));
			dataItem.setStartTime(_ctx.longValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].StartTime"));
			dataItem.setStartUserId(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].StartUserId"));
			dataItem.setStatus(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Status"));
			dataItem.setTenantId(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].TenantId"));
			dataItem.setUrl(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Url"));
			dataItem.setVariables(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].Variables"));

			List<String> assigneeUserIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].AssigneeUserIds.Length"); j++) {
				assigneeUserIds.add(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].AssigneeUserIds["+ j +"]"));
			}
			dataItem.setAssigneeUserIds(assigneeUserIds);

			List<String> candidateUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].CandidateUsers.Length"); j++) {
				candidateUsers.add(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].CandidateUsers["+ j +"]"));
			}
			dataItem.setCandidateUsers(candidateUsers);

			List<String> candidateUserIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].CandidateUserIds.Length"); j++) {
				candidateUserIds.add(_ctx.stringValue("QueryLinkelinkflowLinkflowProcessResponse.Data["+ i +"].CandidateUserIds["+ j +"]"));
			}
			dataItem.setCandidateUserIds(candidateUserIds);

			data.add(dataItem);
		}
		queryLinkelinkflowLinkflowProcessResponse.setData(data);
	 
	 	return queryLinkelinkflowLinkflowProcessResponse;
	}
}