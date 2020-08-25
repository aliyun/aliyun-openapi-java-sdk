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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutVcsmergerequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static AddLinkeBahamutVcsmergerequestResponse unmarshall(AddLinkeBahamutVcsmergerequestResponse addLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.RequestId"));
		addLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.ResultCode"));
		addLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		addLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		addLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		addLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Message"));
		addLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		addLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutVcsmergerequestResponse.Success"));

		Result result = new Result();
		result.setAssignee(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.Assignee"));
		result.setAuthor(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.Author"));
		result.setCanMergeClick(_ctx.booleanValue("AddLinkeBahamutVcsmergerequestResponse.Result.CanMergeClick"));
		result.setCreatedAt(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.Result.CreatedAt"));
		result.setDescription(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.Description"));
		result.setId(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.Result.Id"));
		result.setIid(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.Result.Iid"));
		result.setMergeStatus(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.MergeStatus"));
		result.setProjectId(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.Result.ProjectId"));
		result.setSourceBranch(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.SourceBranch"));
		result.setState(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.State"));
		result.setTargetBranch(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.TargetBranch"));
		result.setTargetProjectId(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.Result.TargetProjectId"));
		result.setTitle(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.Title"));
		result.setUpdatedAt(_ctx.longValue("AddLinkeBahamutVcsmergerequestResponse.Result.UpdatedAt"));
		result.setUpdatedBy(_ctx.stringValue("AddLinkeBahamutVcsmergerequestResponse.Result.UpdatedBy"));
		addLinkeBahamutVcsmergerequestResponse.setResult(result);
	 
	 	return addLinkeBahamutVcsmergerequestResponse;
	}
}