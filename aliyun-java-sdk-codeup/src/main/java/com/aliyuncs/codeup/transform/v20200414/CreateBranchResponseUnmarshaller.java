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

package com.aliyuncs.codeup.transform.v20200414;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.CreateBranchResponse;
import com.aliyuncs.codeup.model.v20200414.CreateBranchResponse.Result;
import com.aliyuncs.codeup.model.v20200414.CreateBranchResponse.Result.CommitInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBranchResponseUnmarshaller {

	public static CreateBranchResponse unmarshall(CreateBranchResponse createBranchResponse, UnmarshallerContext _ctx) {
		
		createBranchResponse.setRequestId(_ctx.stringValue("CreateBranchResponse.RequestId"));
		createBranchResponse.setErrorCode(_ctx.stringValue("CreateBranchResponse.ErrorCode"));
		createBranchResponse.setSuccess(_ctx.booleanValue("CreateBranchResponse.Success"));
		createBranchResponse.setErrorMessage(_ctx.stringValue("CreateBranchResponse.ErrorMessage"));

		Result result = new Result();
		result.setBranchName(_ctx.stringValue("CreateBranchResponse.Result.BranchName"));
		result.setProtectedBranch(_ctx.booleanValue("CreateBranchResponse.Result.ProtectedBranch"));

		CommitInfo commitInfo = new CommitInfo();
		commitInfo.setId(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.Id"));
		commitInfo.setShortId(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.ShortId"));
		commitInfo.setTitle(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.Title"));
		commitInfo.setAuthorName(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.AuthorName"));
		commitInfo.setAuthorEmail(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.AuthorEmail"));
		commitInfo.setCreatedAt(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.CreatedAt"));
		commitInfo.setMessage(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.Message"));
		commitInfo.setAuthorDate(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.AuthorDate"));
		commitInfo.setCommittedDate(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.CommittedDate"));
		commitInfo.setCommitterEmail(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.CommitterEmail"));
		commitInfo.setCommitterName(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.CommitterName"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateBranchResponse.Result.CommitInfo.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateBranchResponse.Result.CommitInfo.ParentIds["+ i +"]"));
		}
		commitInfo.setParentIds(parentIds);
		result.setCommitInfo(commitInfo);
		createBranchResponse.setResult(result);
	 
	 	return createBranchResponse;
	}
}