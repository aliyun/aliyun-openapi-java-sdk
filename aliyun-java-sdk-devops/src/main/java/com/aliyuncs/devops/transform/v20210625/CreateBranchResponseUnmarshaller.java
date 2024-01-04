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

import com.aliyuncs.devops.model.v20210625.CreateBranchResponse;
import com.aliyuncs.devops.model.v20210625.CreateBranchResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateBranchResponse.Result.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBranchResponseUnmarshaller {

	public static CreateBranchResponse unmarshall(CreateBranchResponse createBranchResponse, UnmarshallerContext _ctx) {
		
		createBranchResponse.setRequestId(_ctx.stringValue("CreateBranchResponse.requestId"));
		createBranchResponse.setErrorMessage(_ctx.stringValue("CreateBranchResponse.errorMessage"));
		createBranchResponse.setErrorCode(_ctx.stringValue("CreateBranchResponse.errorCode"));
		createBranchResponse.setSuccess(_ctx.booleanValue("CreateBranchResponse.success"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateBranchResponse.result.name"));
		result.set_Protected(_ctx.booleanValue("CreateBranchResponse.result.protected"));

		Commit commit = new Commit();
		commit.setId(_ctx.stringValue("CreateBranchResponse.result.commit.id"));
		commit.setShortId(_ctx.stringValue("CreateBranchResponse.result.commit.shortId"));
		commit.setTitle(_ctx.stringValue("CreateBranchResponse.result.commit.title"));
		commit.setAuthorName(_ctx.stringValue("CreateBranchResponse.result.commit.authorName"));
		commit.setAuthorEmail(_ctx.stringValue("CreateBranchResponse.result.commit.authorEmail"));
		commit.setCreatedAt(_ctx.stringValue("CreateBranchResponse.result.commit.createdAt"));
		commit.setMessage(_ctx.stringValue("CreateBranchResponse.result.commit.message"));
		commit.setAuthoredDate(_ctx.stringValue("CreateBranchResponse.result.commit.authoredDate"));
		commit.setCommittedDate(_ctx.stringValue("CreateBranchResponse.result.commit.committedDate"));
		commit.setCommitterEmail(_ctx.stringValue("CreateBranchResponse.result.commit.committerEmail"));
		commit.setCommitterName(_ctx.stringValue("CreateBranchResponse.result.commit.committerName"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateBranchResponse.result.commit.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateBranchResponse.result.commit.parentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		result.setCommit(commit);
		createBranchResponse.setResult(result);
	 
	 	return createBranchResponse;
	}
}