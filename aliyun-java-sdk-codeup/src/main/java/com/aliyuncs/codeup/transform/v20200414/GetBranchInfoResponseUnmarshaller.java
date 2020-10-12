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

import com.aliyuncs.codeup.model.v20200414.GetBranchInfoResponse;
import com.aliyuncs.codeup.model.v20200414.GetBranchInfoResponse.Result;
import com.aliyuncs.codeup.model.v20200414.GetBranchInfoResponse.Result.CommitInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBranchInfoResponseUnmarshaller {

	public static GetBranchInfoResponse unmarshall(GetBranchInfoResponse getBranchInfoResponse, UnmarshallerContext _ctx) {
		
		getBranchInfoResponse.setRequestId(_ctx.stringValue("GetBranchInfoResponse.RequestId"));
		getBranchInfoResponse.setErrorCode(_ctx.stringValue("GetBranchInfoResponse.ErrorCode"));
		getBranchInfoResponse.setSuccess(_ctx.booleanValue("GetBranchInfoResponse.Success"));
		getBranchInfoResponse.setErrorMessage(_ctx.stringValue("GetBranchInfoResponse.ErrorMessage"));

		Result result = new Result();
		result.setBranchName(_ctx.stringValue("GetBranchInfoResponse.Result.BranchName"));
		result.setProtectedBranch(_ctx.booleanValue("GetBranchInfoResponse.Result.ProtectedBranch"));

		CommitInfo commitInfo = new CommitInfo();
		commitInfo.setId(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.Id"));
		commitInfo.setShortId(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.ShortId"));
		commitInfo.setTitle(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.Title"));
		commitInfo.setAuthorName(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.AuthorName"));
		commitInfo.setAuthorEmail(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.AuthorEmail"));
		commitInfo.setCreatedAt(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.CreatedAt"));
		commitInfo.setMessage(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.Message"));
		commitInfo.setAuthorDate(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.AuthorDate"));
		commitInfo.setCommittedDate(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.CommittedDate"));
		commitInfo.setCommitterEmail(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.CommitterEmail"));
		commitInfo.setCommitterName(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.CommitterName"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBranchInfoResponse.Result.CommitInfo.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetBranchInfoResponse.Result.CommitInfo.ParentIds["+ i +"]"));
		}
		commitInfo.setParentIds(parentIds);
		result.setCommitInfo(commitInfo);
		getBranchInfoResponse.setResult(result);
	 
	 	return getBranchInfoResponse;
	}
}