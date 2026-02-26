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

import com.aliyuncs.devops.model.v20210625.GetCompareDetailResponse;
import com.aliyuncs.devops.model.v20210625.GetCompareDetailResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetCompareDetailResponse.Result.CommitsItem;
import com.aliyuncs.devops.model.v20210625.GetCompareDetailResponse.Result.CommitsItem.Author;
import com.aliyuncs.devops.model.v20210625.GetCompareDetailResponse.Result.CommitsItem.Committer;
import com.aliyuncs.devops.model.v20210625.GetCompareDetailResponse.Result.DiffsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompareDetailResponseUnmarshaller {

	public static GetCompareDetailResponse unmarshall(GetCompareDetailResponse getCompareDetailResponse, UnmarshallerContext _ctx) {
		
		getCompareDetailResponse.setRequestId(_ctx.stringValue("GetCompareDetailResponse.requestId"));
		getCompareDetailResponse.setErrorCode(_ctx.stringValue("GetCompareDetailResponse.errorCode"));
		getCompareDetailResponse.setErrorMessage(_ctx.stringValue("GetCompareDetailResponse.errorMessage"));
		getCompareDetailResponse.setSuccess(_ctx.booleanValue("GetCompareDetailResponse.success"));

		Result result = new Result();

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCompareDetailResponse.result.messages.Length"); i++) {
			messages.add(_ctx.stringValue("GetCompareDetailResponse.result.messages["+ i +"]"));
		}
		result.setMessages(messages);

		List<CommitsItem> commits = new ArrayList<CommitsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCompareDetailResponse.result.commits.Length"); i++) {
			CommitsItem commitsItem = new CommitsItem();
			commitsItem.setId(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].id"));
			commitsItem.setShortId(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].shortId"));
			commitsItem.setTitle(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].title"));
			commitsItem.setMessage(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].message"));
			commitsItem.setAuthorName(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].authorName"));
			commitsItem.setAuthorEmail(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].authorEmail"));
			commitsItem.setAuthoredDate(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].authoredDate"));
			commitsItem.setCreatedAt(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].createdAt"));
			commitsItem.setCommitterName(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committerName"));
			commitsItem.setCommitterEmail(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committerEmail"));
			commitsItem.setCommittedDate(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committedDate"));
			commitsItem.setCommentsCount(_ctx.longValue("GetCompareDetailResponse.result.commits["+ i +"].commentsCount"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetCompareDetailResponse.result.commits["+ i +"].parentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].parentIds["+ j +"]"));
			}
			commitsItem.setParentIds(parentIds);

			Author author = new Author();
			author.setId(_ctx.longValue("GetCompareDetailResponse.result.commits["+ i +"].author.id"));
			author.setName(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.name"));
			author.setUsername(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.username"));
			author.setState(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.state"));
			author.setAvatarUrl(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.avatarUrl"));
			author.setExternUid(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.externUid"));
			author.setEmail(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.email"));
			author.setWebsiteUrl(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].author.websiteUrl"));
			commitsItem.setAuthor(author);

			Committer committer = new Committer();
			committer.setId(_ctx.longValue("GetCompareDetailResponse.result.commits["+ i +"].committer.id"));
			committer.setName(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.name"));
			committer.setUsername(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.username"));
			committer.setState(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.state"));
			committer.setAvatarUrl(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.avatarUrl"));
			committer.setExternUid(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.externUid"));
			committer.setEmail(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.email"));
			committer.setWebsiteUrl(_ctx.stringValue("GetCompareDetailResponse.result.commits["+ i +"].committer.websiteUrl"));
			commitsItem.setCommitter(committer);

			commits.add(commitsItem);
		}
		result.setCommits(commits);

		List<DiffsItem> diffs = new ArrayList<DiffsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCompareDetailResponse.result.diffs.Length"); i++) {
			DiffsItem diffsItem = new DiffsItem();
			diffsItem.setDiff(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].diff"));
			diffsItem.setNewPath(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].newPath"));
			diffsItem.setOldPath(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].oldPath"));
			diffsItem.setAMode(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].aMode"));
			diffsItem.setBMode(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].bMode"));
			diffsItem.setNewFile(_ctx.booleanValue("GetCompareDetailResponse.result.diffs["+ i +"].newFile"));
			diffsItem.setRenamedFile(_ctx.booleanValue("GetCompareDetailResponse.result.diffs["+ i +"].renamedFile"));
			diffsItem.setDeletedFile(_ctx.booleanValue("GetCompareDetailResponse.result.diffs["+ i +"].deletedFile"));
			diffsItem.setIsBinary(_ctx.booleanValue("GetCompareDetailResponse.result.diffs["+ i +"].isBinary"));
			diffsItem.setOldId(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].oldId"));
			diffsItem.setNewId(_ctx.stringValue("GetCompareDetailResponse.result.diffs["+ i +"].newId"));
			diffsItem.setIsNewLfs(_ctx.booleanValue("GetCompareDetailResponse.result.diffs["+ i +"].isNewLfs"));
			diffsItem.setIsOldLfs(_ctx.booleanValue("GetCompareDetailResponse.result.diffs["+ i +"].isOldLfs"));

			diffs.add(diffsItem);
		}
		result.setDiffs(diffs);
		getCompareDetailResponse.setResult(result);
	 
	 	return getCompareDetailResponse;
	}
}