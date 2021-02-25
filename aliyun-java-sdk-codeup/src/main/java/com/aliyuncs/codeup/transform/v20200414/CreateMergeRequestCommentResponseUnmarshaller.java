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

import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestCommentResponse;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestCommentResponse.Result;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestCommentResponse.Result.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMergeRequestCommentResponseUnmarshaller {

	public static CreateMergeRequestCommentResponse unmarshall(CreateMergeRequestCommentResponse createMergeRequestCommentResponse, UnmarshallerContext _ctx) {
		
		createMergeRequestCommentResponse.setRequestId(_ctx.stringValue("CreateMergeRequestCommentResponse.RequestId"));
		createMergeRequestCommentResponse.setErrorCode(_ctx.stringValue("CreateMergeRequestCommentResponse.ErrorCode"));
		createMergeRequestCommentResponse.setErrorMessage(_ctx.stringValue("CreateMergeRequestCommentResponse.ErrorMessage"));
		createMergeRequestCommentResponse.setSuccess(_ctx.booleanValue("CreateMergeRequestCommentResponse.Success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateMergeRequestCommentResponse.Result.Id"));
		result.setNote(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Note"));
		result.setCreatedAt(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.CreatedAt"));
		result.setUpdatedAt(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.UpdatedAt"));
		result.setProjectId(_ctx.longValue("CreateMergeRequestCommentResponse.Result.ProjectId"));
		result.setIsDraft(_ctx.booleanValue("CreateMergeRequestCommentResponse.Result.IsDraft"));
		result.setParentNoteId(_ctx.longValue("CreateMergeRequestCommentResponse.Result.ParentNoteId"));
		result.setLine(_ctx.longValue("CreateMergeRequestCommentResponse.Result.Line"));
		result.setSide(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Side"));
		result.setPath(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Path"));
		result.setRangeContext(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.RangeContext"));
		result.setOutDated(_ctx.booleanValue("CreateMergeRequestCommentResponse.Result.OutDated"));
		result.setClosed(_ctx.integerValue("CreateMergeRequestCommentResponse.Result.Closed"));

		Author author = new Author();
		author.setId(_ctx.longValue("CreateMergeRequestCommentResponse.Result.Author.Id"));
		author.setAvatarUrl(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Author.AvatarUrl"));
		author.setExternUserId(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Author.ExternUserId"));
		author.setName(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Author.Name"));
		author.setEmail(_ctx.stringValue("CreateMergeRequestCommentResponse.Result.Author.Email"));
		result.setAuthor(author);
		createMergeRequestCommentResponse.setResult(result);
	 
	 	return createMergeRequestCommentResponse;
	}
}