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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListRepositoryBranchesResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryBranchesResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListRepositoryBranchesResponse.ResultItem.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryBranchesResponseUnmarshaller {

	public static ListRepositoryBranchesResponse unmarshall(ListRepositoryBranchesResponse listRepositoryBranchesResponse, UnmarshallerContext _ctx) {
		
		listRepositoryBranchesResponse.setRequestId(_ctx.stringValue("ListRepositoryBranchesResponse.requestId"));
		listRepositoryBranchesResponse.setErrorMessage(_ctx.stringValue("ListRepositoryBranchesResponse.errorMessage"));
		listRepositoryBranchesResponse.setErrorCode(_ctx.stringValue("ListRepositoryBranchesResponse.errorCode"));
		listRepositoryBranchesResponse.setSuccess(_ctx.booleanValue("ListRepositoryBranchesResponse.success"));
		listRepositoryBranchesResponse.setTotal(_ctx.longValue("ListRepositoryBranchesResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryBranchesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].name"));
			resultItem.set_Protected(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].protected"));

			Commit commit = new Commit();
			commit.setId(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.id"));
			commit.setShortId(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.shortId"));
			commit.setTitle(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.title"));
			commit.setAuthorName(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.authorName"));
			commit.setAuthorEmail(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.authorEmail"));
			commit.setCreatedAt(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.createdAt"));
			commit.setMessage(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.message"));
			commit.setAuthoredDate(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.authoredDate"));
			commit.setCommittedDate(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.committedDate"));
			commit.setCommitterEmail(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.committerEmail"));
			commit.setCommitterName(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.committerName"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepositoryBranchesResponse.result["+ i +"].commit.parentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListRepositoryBranchesResponse.result["+ i +"].commit.parentIds["+ j +"]"));
			}
			commit.setParentIds(parentIds);
			resultItem.setCommit(commit);

			result.add(resultItem);
		}
		listRepositoryBranchesResponse.setResult(result);
	 
	 	return listRepositoryBranchesResponse;
	}
}