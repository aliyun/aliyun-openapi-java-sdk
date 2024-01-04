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

import com.aliyuncs.devops.model.v20210625.CreateWorkitemCommentResponse;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemCommentResponse.Comment;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemCommentResponse.Comment.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkitemCommentResponseUnmarshaller {

	public static CreateWorkitemCommentResponse unmarshall(CreateWorkitemCommentResponse createWorkitemCommentResponse, UnmarshallerContext _ctx) {
		
		createWorkitemCommentResponse.setRequestId(_ctx.stringValue("CreateWorkitemCommentResponse.requestId"));
		createWorkitemCommentResponse.setErrorMsg(_ctx.stringValue("CreateWorkitemCommentResponse.errorMsg"));
		createWorkitemCommentResponse.setErrorCode(_ctx.stringValue("CreateWorkitemCommentResponse.errorCode"));
		createWorkitemCommentResponse.setSuccess(_ctx.stringValue("CreateWorkitemCommentResponse.success"));

		Comment comment = new Comment();
		comment.setId(_ctx.longValue("CreateWorkitemCommentResponse.Comment.Id"));
		comment.setContent(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.content"));
		comment.setTargetType(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.targetType"));
		comment.setTargetIdentifier(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.targetIdentifier"));
		comment.setParentId(_ctx.longValue("CreateWorkitemCommentResponse.Comment.parentId"));
		comment.setCreateTime(_ctx.longValue("CreateWorkitemCommentResponse.Comment.createTime"));
		comment.setModifiedTime(_ctx.longValue("CreateWorkitemCommentResponse.Comment.modifiedTime"));
		comment.setIsTop(_ctx.booleanValue("CreateWorkitemCommentResponse.Comment.isTop"));
		comment.setTopTime(_ctx.longValue("CreateWorkitemCommentResponse.Comment.topTime"));
		comment.setFormatType(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.formatType"));

		User user = new User();
		user.setAccount(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.account"));
		user.setIdentifier(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.identifier"));
		user.setRealName(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.realName"));
		user.setNickName(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.nickName"));
		user.setAvatar(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.avatar"));
		user.setDisplayName(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.displayName"));
		user.setTargetType(_ctx.stringValue("CreateWorkitemCommentResponse.Comment.user.targetType"));
		comment.setUser(user);
		createWorkitemCommentResponse.setComment(comment);
	 
	 	return createWorkitemCommentResponse;
	}
}