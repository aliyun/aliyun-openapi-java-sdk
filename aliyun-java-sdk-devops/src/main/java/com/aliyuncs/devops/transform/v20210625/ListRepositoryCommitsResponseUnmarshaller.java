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

import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitsResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitsResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitsResponse.ResultItem.Author;
import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitsResponse.ResultItem.Committer;
import com.aliyuncs.devops.model.v20210625.ListRepositoryCommitsResponse.ResultItem.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryCommitsResponseUnmarshaller {

	public static ListRepositoryCommitsResponse unmarshall(ListRepositoryCommitsResponse listRepositoryCommitsResponse, UnmarshallerContext _ctx) {
		
		listRepositoryCommitsResponse.setRequestId(_ctx.stringValue("ListRepositoryCommitsResponse.requestId"));
		listRepositoryCommitsResponse.setErrorMessage(_ctx.stringValue("ListRepositoryCommitsResponse.errorMessage"));
		listRepositoryCommitsResponse.setErrorCode(_ctx.stringValue("ListRepositoryCommitsResponse.errorCode"));
		listRepositoryCommitsResponse.setSuccess(_ctx.booleanValue("ListRepositoryCommitsResponse.success"));
		listRepositoryCommitsResponse.setTotal(_ctx.longValue("ListRepositoryCommitsResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryCommitsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].id"));
			resultItem.setShortId(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].shortId"));
			resultItem.setTitle(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].title"));
			resultItem.setAuthorName(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].authorName"));
			resultItem.setAuthorEmail(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].authorEmail"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].createdAt"));
			resultItem.setMessage(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].message"));
			resultItem.setAuthoredDate(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].authoredDate"));
			resultItem.setCommittedDate(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committedDate"));
			resultItem.setCommitterEmail(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committerEmail"));
			resultItem.setCommitterName(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committerName"));
			resultItem.setCommentsCount(_ctx.longValue("ListRepositoryCommitsResponse.result["+ i +"].commentsCount"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepositoryCommitsResponse.result["+ i +"].parentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].parentIds["+ j +"]"));
			}
			resultItem.setParentIds(parentIds);

			Author author = new Author();
			author.setId(_ctx.longValue("ListRepositoryCommitsResponse.result["+ i +"].author.id"));
			author.setName(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.name"));
			author.setUsername(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.username"));
			author.setState(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.state"));
			author.setAvatarUrl(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.avatarUrl"));
			author.setExternUid(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.externUid"));
			author.setWebsiteUrl(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.websiteUrl"));
			author.setEmail(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.email"));
			author.setTbUserId(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].author.tbUserId"));
			resultItem.setAuthor(author);

			Committer committer = new Committer();
			committer.setId(_ctx.longValue("ListRepositoryCommitsResponse.result["+ i +"].committer.id"));
			committer.setName(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.name"));
			committer.setUsername(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.username"));
			committer.setState(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.state"));
			committer.setAvatarUrl(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.avatarUrl"));
			committer.setExternUid(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.externUid"));
			committer.setWebsiteUrl(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.websiteUrl"));
			committer.setEmail(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.email"));
			committer.setTbUserId(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].committer.tbUserId"));
			resultItem.setCommitter(committer);

			Signature signature = new Signature();
			signature.setGpgKeyId(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].signature.gpgKeyId"));
			signature.setVerificationStatus(_ctx.stringValue("ListRepositoryCommitsResponse.result["+ i +"].signature.verificationStatus"));
			resultItem.setSignature(signature);

			result.add(resultItem);
		}
		listRepositoryCommitsResponse.setResult(result);
	 
	 	return listRepositoryCommitsResponse;
	}
}