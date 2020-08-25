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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskapprovalbyinstanceResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskapprovalbyinstanceResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTaskapprovalbyinstanceResponseUnmarshaller {

	public static GetLinkeBahamutTaskapprovalbyinstanceResponse unmarshall(GetLinkeBahamutTaskapprovalbyinstanceResponse getLinkeBahamutTaskapprovalbyinstanceResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTaskapprovalbyinstanceResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.RequestId"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.ResultCode"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.ResultMessage"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.ErrorMessage"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Message"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.ResponseStatusCode"));
		getLinkeBahamutTaskapprovalbyinstanceResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAbortedBlocked(_ctx.booleanValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].AbortedBlocked"));
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Assignee"));
			resultItem.setAssigneeUser(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].AssigneeUser"));
			resultItem.setCompleted(_ctx.booleanValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Completed"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorId(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].CreatorId"));
			resultItem.setDetail(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Detail"));
			resultItem.setExtend(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Extend"));
			resultItem.setExtra(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Extra"));
			resultItem.setFinishedSuccessful(_ctx.booleanValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].FinishedSuccessful"));
			resultItem.setFlowStatus(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].FlowStatus"));
			resultItem.setGmtCreate(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].GmtCreate"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Id"));
			resultItem.setObjectId(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].ObjectId"));
			resultItem.setObjectType(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].ObjectType"));
			resultItem.setPortalUrl(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].PortalUrl"));
			resultItem.setRecordCnName(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].RecordCnName"));
			resultItem.setSourceId(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].SourceId"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Status"));
			resultItem.setStatusName(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].StatusName"));
			resultItem.setTaskStatus(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].TaskStatus"));
			resultItem.setTitle(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Title"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].Url"));

			List<String> appNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].AppNames.Length"); j++) {
				appNames.add(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].AppNames["+ j +"]"));
			}
			resultItem.setAppNames(appNames);

			List<String> assigneeUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].AssigneeUsers.Length"); j++) {
				assigneeUsers.add(_ctx.stringValue("GetLinkeBahamutTaskapprovalbyinstanceResponse.Result["+ i +"].AssigneeUsers["+ j +"]"));
			}
			resultItem.setAssigneeUsers(assigneeUsers);

			result.add(resultItem);
		}
		getLinkeBahamutTaskapprovalbyinstanceResponse.setResult(result);
	 
	 	return getLinkeBahamutTaskapprovalbyinstanceResponse;
	}
}