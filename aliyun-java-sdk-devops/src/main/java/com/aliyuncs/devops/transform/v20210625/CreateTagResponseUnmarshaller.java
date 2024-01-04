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

import com.aliyuncs.devops.model.v20210625.CreateTagResponse;
import com.aliyuncs.devops.model.v20210625.CreateTagResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateTagResponse.Result.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTagResponseUnmarshaller {

	public static CreateTagResponse unmarshall(CreateTagResponse createTagResponse, UnmarshallerContext _ctx) {
		
		createTagResponse.setRequestId(_ctx.stringValue("CreateTagResponse.requestId"));
		createTagResponse.setErrorCode(_ctx.stringValue("CreateTagResponse.errorCode"));
		createTagResponse.setErrorMessage(_ctx.stringValue("CreateTagResponse.errorMessage"));
		createTagResponse.setSuccess(_ctx.booleanValue("CreateTagResponse.success"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateTagResponse.result.id"));
		result.setName(_ctx.stringValue("CreateTagResponse.result.name"));
		result.setMessage(_ctx.stringValue("CreateTagResponse.result.message"));

		Commit commit = new Commit();
		commit.setId(_ctx.stringValue("CreateTagResponse.result.commit.id"));
		commit.setShortId(_ctx.stringValue("CreateTagResponse.result.commit.shortId"));
		commit.setTitle(_ctx.stringValue("CreateTagResponse.result.commit.title"));
		commit.setMessage(_ctx.stringValue("CreateTagResponse.result.commit.message"));
		commit.setCreatedAt(_ctx.stringValue("CreateTagResponse.result.commit.createdAt"));
		commit.setAuthorName(_ctx.stringValue("CreateTagResponse.result.commit.authorName"));
		commit.setAuthorEmail(_ctx.stringValue("CreateTagResponse.result.commit.authorEmail"));
		commit.setAuthoredDate(_ctx.stringValue("CreateTagResponse.result.commit.authoredDate"));
		commit.setCommitterName(_ctx.stringValue("CreateTagResponse.result.commit.committerName"));
		commit.setCommitterEmail(_ctx.stringValue("CreateTagResponse.result.commit.committerEmail"));
		commit.setCommittedDate(_ctx.stringValue("CreateTagResponse.result.commit.committedDate"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateTagResponse.result.commit.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateTagResponse.result.commit.parentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		result.setCommit(commit);
		createTagResponse.setResult(result);
	 
	 	return createTagResponse;
	}
}