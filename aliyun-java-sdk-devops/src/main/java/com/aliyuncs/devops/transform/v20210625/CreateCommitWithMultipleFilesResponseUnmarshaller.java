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

import com.aliyuncs.devops.model.v20210625.CreateCommitWithMultipleFilesResponse;
import com.aliyuncs.devops.model.v20210625.CreateCommitWithMultipleFilesResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateCommitWithMultipleFilesResponse.Result.Author;
import com.aliyuncs.devops.model.v20210625.CreateCommitWithMultipleFilesResponse.Result.Committer;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCommitWithMultipleFilesResponseUnmarshaller {

	public static CreateCommitWithMultipleFilesResponse unmarshall(CreateCommitWithMultipleFilesResponse createCommitWithMultipleFilesResponse, UnmarshallerContext _ctx) {
		
		createCommitWithMultipleFilesResponse.setRequestId(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.requestId"));
		createCommitWithMultipleFilesResponse.setSuccess(_ctx.booleanValue("CreateCommitWithMultipleFilesResponse.success"));
		createCommitWithMultipleFilesResponse.setErrorCode(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.errorCode"));
		createCommitWithMultipleFilesResponse.setErrorMsg(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.errorMsg"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.id"));
		result.setShortId(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.shortId"));
		result.setTitle(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.title"));
		result.setMessage(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.message"));
		result.setAuthorName(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.authorName"));
		result.setAuthorEmail(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.authorEmail"));
		result.setAuthoredDate(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.authoredDate"));
		result.setCommitterName(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committerName"));
		result.setCommitterEmail(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committerEmail"));
		result.setCommittedDate(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committedDate"));
		result.setCreatedAt(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.createdAt"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateCommitWithMultipleFilesResponse.result.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.parentIds["+ i +"]"));
		}
		result.setParentIds(parentIds);

		Author author = new Author();
		author.setId(_ctx.longValue("CreateCommitWithMultipleFilesResponse.result.author.id"));
		author.setAliyunPk(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.aliyunPk"));
		author.setName(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.name"));
		author.setUsername(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.username"));
		author.setEmail(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.email"));
		author.setState(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.state"));
		author.setAvatarUrl(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.avatarUrl"));
		author.setWebsiteUrl(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.author.websiteUrl"));
		result.setAuthor(author);

		Committer committer = new Committer();
		committer.setId(_ctx.longValue("CreateCommitWithMultipleFilesResponse.result.committer.id"));
		committer.setAliyunPk(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.aliyunPk"));
		committer.setName(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.name"));
		committer.setUsername(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.username"));
		committer.setEmail(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.email"));
		committer.setState(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.state"));
		committer.setAvatarUrl(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.avatarUrl"));
		committer.setWebsiteUrl(_ctx.stringValue("CreateCommitWithMultipleFilesResponse.result.committer.websiteUrl"));
		result.setCommitter(committer);
		createCommitWithMultipleFilesResponse.setResult(result);
	 
	 	return createCommitWithMultipleFilesResponse;
	}
}