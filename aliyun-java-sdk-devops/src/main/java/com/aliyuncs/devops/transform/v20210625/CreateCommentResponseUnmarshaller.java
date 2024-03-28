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

import com.aliyuncs.devops.model.v20210625.CreateCommentResponse;
import com.aliyuncs.devops.model.v20210625.CreateCommentResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateCommentResponse.Result.Author;
import com.aliyuncs.devops.model.v20210625.CreateCommentResponse.Result.RelatedPatchSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCommentResponseUnmarshaller {

	public static CreateCommentResponse unmarshall(CreateCommentResponse createCommentResponse, UnmarshallerContext _ctx) {
		
		createCommentResponse.setRequestId(_ctx.stringValue("CreateCommentResponse.requestId"));
		createCommentResponse.setSuccess(_ctx.booleanValue("CreateCommentResponse.success"));
		createCommentResponse.setErrorCode(_ctx.stringValue("CreateCommentResponse.errorCode"));
		createCommentResponse.setErrorMessage(_ctx.stringValue("CreateCommentResponse.errorMessage"));

		Result result = new Result();
		result.setCommentBizId(_ctx.stringValue("CreateCommentResponse.result.commentBizId"));
		result.setCommentType(_ctx.stringValue("CreateCommentResponse.result.commentType"));
		result.setState(_ctx.stringValue("CreateCommentResponse.result.state"));
		result.setResolved(_ctx.booleanValue("CreateCommentResponse.result.resolved"));
		result.setDeleted(_ctx.booleanValue("CreateCommentResponse.result.deleted"));
		result.setCommentTime(_ctx.stringValue("CreateCommentResponse.result.commentTime"));
		result.setLastEditTime(_ctx.stringValue("CreateCommentResponse.result.lastEditTime"));
		result.setContent(_ctx.stringValue("CreateCommentResponse.result.content"));
		result.setLineNumber(_ctx.stringValue("CreateCommentResponse.result.lineNumber"));
		result.setFilePath(_ctx.stringValue("CreateCommentResponse.result.filePath"));
		result.setParentCommentBizId(_ctx.stringValue("CreateCommentResponse.result.parentCommentBizId"));
		result.setRootCommentBizId(_ctx.stringValue("CreateCommentResponse.result.rootCommentBizId"));

		Author author = new Author();
		author.setAliyunPk(_ctx.stringValue("CreateCommentResponse.result.author.aliyunPk"));
		author.setName(_ctx.stringValue("CreateCommentResponse.result.author.name"));
		author.setUsername(_ctx.stringValue("CreateCommentResponse.result.author.username"));
		author.setState(_ctx.stringValue("CreateCommentResponse.result.author.state"));
		author.setAvatarUrl(_ctx.stringValue("CreateCommentResponse.result.author.avatarUrl"));
		author.setEmail(_ctx.stringValue("CreateCommentResponse.result.author.email"));
		author.setId(_ctx.longValue("CreateCommentResponse.result.author.id"));
		result.setAuthor(author);

		RelatedPatchSet relatedPatchSet = new RelatedPatchSet();
		relatedPatchSet.setPatchSetNo(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.patchSetNo"));
		relatedPatchSet.setPatchSetBizId(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.patchSetBizId"));
		relatedPatchSet.setPatchSetName(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.patchSetName"));
		relatedPatchSet.setCommitId(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.commitId"));
		relatedPatchSet.setShortId(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.shortId"));
		relatedPatchSet.setRelatedMergeItemType(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.relatedMergeItemType"));
		relatedPatchSet.setCreatedAt(_ctx.stringValue("CreateCommentResponse.result.relatedPatchSet.createdAt"));
		result.setRelatedPatchSet(relatedPatchSet);
		createCommentResponse.setResult(result);
	 
	 	return createCommentResponse;
	}
}