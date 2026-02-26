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

import com.aliyuncs.devops.model.v20210625.GetBranchInfoResponse;
import com.aliyuncs.devops.model.v20210625.GetBranchInfoResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetBranchInfoResponse.Result.Commit;
import com.aliyuncs.devops.model.v20210625.GetBranchInfoResponse.Result.Commit.Author;
import com.aliyuncs.devops.model.v20210625.GetBranchInfoResponse.Result.Commit.Committer;
import com.aliyuncs.devops.model.v20210625.GetBranchInfoResponse.Result.Commit.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBranchInfoResponseUnmarshaller {

	public static GetBranchInfoResponse unmarshall(GetBranchInfoResponse getBranchInfoResponse, UnmarshallerContext _ctx) {
		
		getBranchInfoResponse.setRequestId(_ctx.stringValue("GetBranchInfoResponse.requestId"));
		getBranchInfoResponse.setErrorMessage(_ctx.stringValue("GetBranchInfoResponse.errorMessage"));
		getBranchInfoResponse.setErrorCode(_ctx.stringValue("GetBranchInfoResponse.errorCode"));
		getBranchInfoResponse.setSuccess(_ctx.booleanValue("GetBranchInfoResponse.success"));

		Result result = new Result();
		result.setName(_ctx.stringValue("GetBranchInfoResponse.result.name"));
		result.set_Protected(_ctx.stringValue("GetBranchInfoResponse.result.protected"));

		Commit commit = new Commit();
		commit.setId(_ctx.stringValue("GetBranchInfoResponse.result.commit.id"));
		commit.setShortId(_ctx.stringValue("GetBranchInfoResponse.result.commit.shortId"));
		commit.setTitle(_ctx.stringValue("GetBranchInfoResponse.result.commit.title"));
		commit.setAuthorName(_ctx.stringValue("GetBranchInfoResponse.result.commit.authorName"));
		commit.setAuthorEmail(_ctx.stringValue("GetBranchInfoResponse.result.commit.authorEmail"));
		commit.setCreatedAt(_ctx.stringValue("GetBranchInfoResponse.result.commit.createdAt"));
		commit.setMessage(_ctx.stringValue("GetBranchInfoResponse.result.commit.message"));
		commit.setAuthoredDate(_ctx.stringValue("GetBranchInfoResponse.result.commit.authoredDate"));
		commit.setCommittedDate(_ctx.stringValue("GetBranchInfoResponse.result.commit.committedDate"));
		commit.setCommitterEmail(_ctx.stringValue("GetBranchInfoResponse.result.commit.committerEmail"));
		commit.setCommitterName(_ctx.stringValue("GetBranchInfoResponse.result.commit.committerName"));
		commit.setCommentsCount(_ctx.longValue("GetBranchInfoResponse.result.commit.commentsCount"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBranchInfoResponse.result.commit.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetBranchInfoResponse.result.commit.parentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);

		Author author = new Author();
		author.setId(_ctx.longValue("GetBranchInfoResponse.result.commit.author.id"));
		author.setName(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.name"));
		author.setUsername(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.username"));
		author.setState(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.state"));
		author.setAvatarUrl(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.avatarUrl"));
		author.setExternUid(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.externUid"));
		author.setEmail(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.email"));
		author.setTbUserId(_ctx.stringValue("GetBranchInfoResponse.result.commit.author.tbUserId"));
		commit.setAuthor(author);

		Committer committer = new Committer();
		committer.setId(_ctx.longValue("GetBranchInfoResponse.result.commit.committer.id"));
		committer.setName(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.name"));
		committer.setUsername(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.username"));
		committer.setState(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.state"));
		committer.setAvatarUrl(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.avatarUrl"));
		committer.setExternUid(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.externUid"));
		committer.setEmail(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.email"));
		committer.setTbUserId(_ctx.stringValue("GetBranchInfoResponse.result.commit.committer.tbUserId"));
		commit.setCommitter(committer);

		Signature signature = new Signature();
		signature.setGpgKeyId(_ctx.stringValue("GetBranchInfoResponse.result.commit.signature.gpgKeyId"));
		signature.setVerificationStatus(_ctx.stringValue("GetBranchInfoResponse.result.commit.signature.verificationStatus"));
		commit.setSignature(signature);
		result.setCommit(commit);
		getBranchInfoResponse.setResult(result);
	 
	 	return getBranchInfoResponse;
	}
}