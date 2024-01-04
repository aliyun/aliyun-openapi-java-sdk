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

import com.aliyuncs.devops.model.v20210625.GetRepositoryCommitResponse;
import com.aliyuncs.devops.model.v20210625.GetRepositoryCommitResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetRepositoryCommitResponse.Result.Author;
import com.aliyuncs.devops.model.v20210625.GetRepositoryCommitResponse.Result.Committer;
import com.aliyuncs.devops.model.v20210625.GetRepositoryCommitResponse.Result.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryCommitResponseUnmarshaller {

	public static GetRepositoryCommitResponse unmarshall(GetRepositoryCommitResponse getRepositoryCommitResponse, UnmarshallerContext _ctx) {
		
		getRepositoryCommitResponse.setRequestId(_ctx.stringValue("GetRepositoryCommitResponse.requestId"));
		getRepositoryCommitResponse.setErrorMessage(_ctx.stringValue("GetRepositoryCommitResponse.errorMessage"));
		getRepositoryCommitResponse.setErrorCode(_ctx.stringValue("GetRepositoryCommitResponse.errorCode"));
		getRepositoryCommitResponse.setSuccess(_ctx.booleanValue("GetRepositoryCommitResponse.success"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetRepositoryCommitResponse.result.id"));
		result.setShortId(_ctx.stringValue("GetRepositoryCommitResponse.result.shortId"));
		result.setTitle(_ctx.stringValue("GetRepositoryCommitResponse.result.title"));
		result.setAuthorName(_ctx.stringValue("GetRepositoryCommitResponse.result.authorName"));
		result.setAuthorEmail(_ctx.stringValue("GetRepositoryCommitResponse.result.authorEmail"));
		result.setCreatedAt(_ctx.stringValue("GetRepositoryCommitResponse.result.createdAt"));
		result.setMessage(_ctx.stringValue("GetRepositoryCommitResponse.result.message"));
		result.setAuthoredDate(_ctx.stringValue("GetRepositoryCommitResponse.result.authoredDate"));
		result.setCommittedDate(_ctx.stringValue("GetRepositoryCommitResponse.result.committedDate"));
		result.setCommitterEmail(_ctx.stringValue("GetRepositoryCommitResponse.result.committerEmail"));
		result.setCommitterName(_ctx.stringValue("GetRepositoryCommitResponse.result.committerName"));
		result.setCommentsCount(_ctx.longValue("GetRepositoryCommitResponse.result.commentsCount"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRepositoryCommitResponse.result.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetRepositoryCommitResponse.result.parentIds["+ i +"]"));
		}
		result.setParentIds(parentIds);

		Author author = new Author();
		author.setId(_ctx.longValue("GetRepositoryCommitResponse.result.author.id"));
		author.setName(_ctx.stringValue("GetRepositoryCommitResponse.result.author.name"));
		author.setUsername(_ctx.stringValue("GetRepositoryCommitResponse.result.author.username"));
		author.setState(_ctx.stringValue("GetRepositoryCommitResponse.result.author.state"));
		author.setAvatarUrl(_ctx.stringValue("GetRepositoryCommitResponse.result.author.avatarUrl"));
		author.setExternUid(_ctx.stringValue("GetRepositoryCommitResponse.result.author.externUid"));
		author.setWebsiteUrl(_ctx.stringValue("GetRepositoryCommitResponse.result.author.websiteUrl"));
		author.setEmail(_ctx.stringValue("GetRepositoryCommitResponse.result.author.email"));
		author.setTbUserId(_ctx.stringValue("GetRepositoryCommitResponse.result.author.tbUserId"));
		result.setAuthor(author);

		Committer committer = new Committer();
		committer.setId(_ctx.longValue("GetRepositoryCommitResponse.result.committer.id"));
		committer.setName(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.name"));
		committer.setUsername(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.username"));
		committer.setState(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.state"));
		committer.setAvatarUrl(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.avatarUrl"));
		committer.setExternUid(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.externUid"));
		committer.setWebsiteUrl(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.websiteUrl"));
		committer.setEmail(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.email"));
		committer.setTbUserId(_ctx.stringValue("GetRepositoryCommitResponse.result.committer.tbUserId"));
		result.setCommitter(committer);

		Signature signature = new Signature();
		signature.setGpgKeyId(_ctx.stringValue("GetRepositoryCommitResponse.result.signature.gpgKeyId"));
		signature.setVerificationStatus(_ctx.stringValue("GetRepositoryCommitResponse.result.signature.verificationStatus"));
		result.setSignature(signature);
		getRepositoryCommitResponse.setResult(result);
	 
	 	return getRepositoryCommitResponse;
	}
}