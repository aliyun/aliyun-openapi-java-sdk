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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsmergerequestResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static CreateLinkeBahamutVcsmergerequestResponse unmarshall(CreateLinkeBahamutVcsmergerequestResponse createLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.RequestId"));
		createLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.ResultCode"));
		createLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		createLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		createLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		createLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Message"));
		createLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		createLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutVcsmergerequestResponse.Success"));

		Result result = new Result();
		result.setAssignee(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Assignee"));
		result.setAuthor(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Author"));
		result.setDescription(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Description"));
		result.setId(_ctx.longValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Id"));
		result.setIid(_ctx.longValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Iid"));
		result.setMergeCommitSha(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.MergeCommitSha"));
		result.setMergeStatus(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.MergeStatus"));
		result.setProjectId(_ctx.longValue("CreateLinkeBahamutVcsmergerequestResponse.Result.ProjectId"));
		result.setReview(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Review"));
		result.setReviewed(_ctx.booleanValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Reviewed"));
		result.setSourceBranch(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.SourceBranch"));
		result.setSourceProjectId(_ctx.longValue("CreateLinkeBahamutVcsmergerequestResponse.Result.SourceProjectId"));
		result.setState(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.State"));
		result.setTargetBranch(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.TargetBranch"));
		result.setTargetProjectId(_ctx.longValue("CreateLinkeBahamutVcsmergerequestResponse.Result.TargetProjectId"));
		result.setTitle(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.Title"));
		result.setWebUrl(_ctx.stringValue("CreateLinkeBahamutVcsmergerequestResponse.Result.WebUrl"));
		createLinkeBahamutVcsmergerequestResponse.setResult(result);
	 
	 	return createLinkeBahamutVcsmergerequestResponse;
	}
}