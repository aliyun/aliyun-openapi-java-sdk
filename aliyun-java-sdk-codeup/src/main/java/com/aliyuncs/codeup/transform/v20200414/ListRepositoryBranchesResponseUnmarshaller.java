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

import com.aliyuncs.codeup.model.v20200414.ListRepositoryBranchesResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryBranchesResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryBranchesResponse.ResultItem.CommitInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryBranchesResponseUnmarshaller {

	public static ListRepositoryBranchesResponse unmarshall(ListRepositoryBranchesResponse listRepositoryBranchesResponse, UnmarshallerContext _ctx) {
		
		listRepositoryBranchesResponse.setRequestId(_ctx.stringValue("ListRepositoryBranchesResponse.RequestId"));
		listRepositoryBranchesResponse.setErrorCode(_ctx.stringValue("ListRepositoryBranchesResponse.ErrorCode"));
		listRepositoryBranchesResponse.setSuccess(_ctx.booleanValue("ListRepositoryBranchesResponse.Success"));
		listRepositoryBranchesResponse.setErrorMessage(_ctx.stringValue("ListRepositoryBranchesResponse.ErrorMessage"));
		listRepositoryBranchesResponse.setTotal(_ctx.longValue("ListRepositoryBranchesResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryBranchesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBranchName(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].BranchName"));
			resultItem.setProtectedBranch(_ctx.booleanValue("ListRepositoryBranchesResponse.Result["+ i +"].ProtectedBranch"));

			CommitInfo commitInfo = new CommitInfo();
			commitInfo.setId(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.Id"));
			commitInfo.setShortId(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.ShortId"));
			commitInfo.setTitle(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.Title"));
			commitInfo.setAuthorName(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.AuthorName"));
			commitInfo.setAuthorEmail(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.AuthorEmail"));
			commitInfo.setCreatedAt(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.CreatedAt"));
			commitInfo.setMessage(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.Message"));
			commitInfo.setAuthorDate(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.AuthorDate"));
			commitInfo.setCommittedDate(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.CommittedDate"));
			commitInfo.setCommitterEmail(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.CommitterEmail"));
			commitInfo.setCommitterName(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.CommitterName"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.ParentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListRepositoryBranchesResponse.Result["+ i +"].CommitInfo.ParentIds["+ j +"]"));
			}
			commitInfo.setParentIds(parentIds);
			resultItem.setCommitInfo(commitInfo);

			result.add(resultItem);
		}
		listRepositoryBranchesResponse.setResult(result);
	 
	 	return listRepositoryBranchesResponse;
	}
}