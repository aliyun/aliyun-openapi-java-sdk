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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApprovaltasksResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutApprovaltasksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutApprovaltasksResponseUnmarshaller {

	public static GetLinkeBahamutApprovaltasksResponse unmarshall(GetLinkeBahamutApprovaltasksResponse getLinkeBahamutApprovaltasksResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutApprovaltasksResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.RequestId"));
		getLinkeBahamutApprovaltasksResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.ResultCode"));
		getLinkeBahamutApprovaltasksResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.ResultMessage"));
		getLinkeBahamutApprovaltasksResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.ErrorMessage"));
		getLinkeBahamutApprovaltasksResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.ErrorMsgParamsMap"));
		getLinkeBahamutApprovaltasksResponse.setMessage(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Message"));
		getLinkeBahamutApprovaltasksResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutApprovaltasksResponse.ResponseStatusCode"));
		getLinkeBahamutApprovaltasksResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutApprovaltasksResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutApprovaltasksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAbortedBlocked(_ctx.booleanValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].AbortedBlocked"));
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Assignee"));
			resultItem.setAssigneeUser(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].AssigneeUser"));
			resultItem.setCompleted(_ctx.booleanValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Completed"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorId(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].CreatorId"));
			resultItem.setDetail(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Detail"));
			resultItem.setExtend(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Extend"));
			resultItem.setExtra(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Extra"));
			resultItem.setFinishedSuccessful(_ctx.booleanValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].FinishedSuccessful"));
			resultItem.setFlowStatus(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].FlowStatus"));
			resultItem.setGmtCreate(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].GmtCreate"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Id"));
			resultItem.setObjectId(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].ObjectId"));
			resultItem.setObjectType(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].ObjectType"));
			resultItem.setPortalUrl(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].PortalUrl"));
			resultItem.setRecordCnName(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].RecordCnName"));
			resultItem.setSourceId(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].SourceId"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Status"));
			resultItem.setStatusName(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].StatusName"));
			resultItem.setTaskStatus(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].TaskStatus"));
			resultItem.setTitle(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Title"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].Url"));

			List<String> appNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].AppNames.Length"); j++) {
				appNames.add(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].AppNames["+ j +"]"));
			}
			resultItem.setAppNames(appNames);

			List<String> assigneeUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].AssigneeUsers.Length"); j++) {
				assigneeUsers.add(_ctx.stringValue("GetLinkeBahamutApprovaltasksResponse.Result["+ i +"].AssigneeUsers["+ j +"]"));
			}
			resultItem.setAssigneeUsers(assigneeUsers);

			result.add(resultItem);
		}
		getLinkeBahamutApprovaltasksResponse.setResult(result);
	 
	 	return getLinkeBahamutApprovaltasksResponse;
	}
}