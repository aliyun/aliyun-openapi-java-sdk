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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskbykeywordResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskbykeywordResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutTaskbykeywordResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutTaskbykeywordResponseUnmarshaller {

	public static GetLinkeBahamutTaskbykeywordResponse unmarshall(GetLinkeBahamutTaskbykeywordResponse getLinkeBahamutTaskbykeywordResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutTaskbykeywordResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.RequestId"));
		getLinkeBahamutTaskbykeywordResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.ResultCode"));
		getLinkeBahamutTaskbykeywordResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.ResultMessage"));
		getLinkeBahamutTaskbykeywordResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.ErrorMessage"));
		getLinkeBahamutTaskbykeywordResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.ErrorMsgParamsMap"));
		getLinkeBahamutTaskbykeywordResponse.setMessage(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Message"));
		getLinkeBahamutTaskbykeywordResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutTaskbykeywordResponse.ResponseStatusCode"));
		getLinkeBahamutTaskbykeywordResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutTaskbykeywordResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutTaskbykeywordResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutTaskbykeywordResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutTaskbykeywordResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutTaskbykeywordResponse.Paginator.PageSize"));
		getLinkeBahamutTaskbykeywordResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutTaskbykeywordResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAbortedBlocked(_ctx.booleanValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].AbortedBlocked"));
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Assignee"));
			resultItem.setAssigneeUser(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].AssigneeUser"));
			resultItem.setCompleted(_ctx.booleanValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Completed"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorId(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].CreatorId"));
			resultItem.setDetail(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Detail"));
			resultItem.setExtend(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Extend"));
			resultItem.setExtra(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Extra"));
			resultItem.setFinishedSuccessful(_ctx.booleanValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].FinishedSuccessful"));
			resultItem.setFlowStatus(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].FlowStatus"));
			resultItem.setGmtCreate(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].GmtCreate"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Id"));
			resultItem.setObjectId(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].ObjectId"));
			resultItem.setObjectType(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].ObjectType"));
			resultItem.setPortalUrl(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].PortalUrl"));
			resultItem.setRecordCnName(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].RecordCnName"));
			resultItem.setSourceId(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].SourceId"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Status"));
			resultItem.setStatusName(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].StatusName"));
			resultItem.setTaskStatus(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].TaskStatus"));
			resultItem.setTitle(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Title"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].Url"));

			List<String> appNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].AppNames.Length"); j++) {
				appNames.add(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].AppNames["+ j +"]"));
			}
			resultItem.setAppNames(appNames);

			List<String> assigneeUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].AssigneeUsers.Length"); j++) {
				assigneeUsers.add(_ctx.stringValue("GetLinkeBahamutTaskbykeywordResponse.Result["+ i +"].AssigneeUsers["+ j +"]"));
			}
			resultItem.setAssigneeUsers(assigneeUsers);

			result.add(resultItem);
		}
		getLinkeBahamutTaskbykeywordResponse.setResult(result);
	 
	 	return getLinkeBahamutTaskbykeywordResponse;
	}
}