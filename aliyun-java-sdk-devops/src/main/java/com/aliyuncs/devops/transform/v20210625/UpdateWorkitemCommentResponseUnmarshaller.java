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

import com.aliyuncs.devops.model.v20210625.UpdateWorkitemCommentResponse;
import com.aliyuncs.devops.model.v20210625.UpdateWorkitemCommentResponse.Comment;
import com.aliyuncs.devops.model.v20210625.UpdateWorkitemCommentResponse.Comment.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWorkitemCommentResponseUnmarshaller {

	public static UpdateWorkitemCommentResponse unmarshall(UpdateWorkitemCommentResponse updateWorkitemCommentResponse, UnmarshallerContext _ctx) {
		
		updateWorkitemCommentResponse.setRequestId(_ctx.stringValue("UpdateWorkitemCommentResponse.requestId"));
		updateWorkitemCommentResponse.setErrorMsg(_ctx.stringValue("UpdateWorkitemCommentResponse.errorMsg"));
		updateWorkitemCommentResponse.setErrorCode(_ctx.stringValue("UpdateWorkitemCommentResponse.errorCode"));
		updateWorkitemCommentResponse.setSuccess(_ctx.stringValue("UpdateWorkitemCommentResponse.success"));

		Comment comment = new Comment();
		comment.setId(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.id"));
		comment.setContent(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.content"));
		comment.setTargetType(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.targetType"));
		comment.setTargetIdentifier(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.targetIdentifier"));
		comment.setParentId(_ctx.longValue("UpdateWorkitemCommentResponse.comment.parentId"));
		comment.setCreateTime(_ctx.longValue("UpdateWorkitemCommentResponse.comment.createTime"));
		comment.setModifiedTime(_ctx.longValue("UpdateWorkitemCommentResponse.comment.modifiedTime"));
		comment.setIsTop(_ctx.booleanValue("UpdateWorkitemCommentResponse.comment.isTop"));
		comment.setTopTime(_ctx.longValue("UpdateWorkitemCommentResponse.comment.topTime"));
		comment.setFormatType(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.formatType"));

		User user = new User();
		user.setAccount(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.user.account"));
		user.setIdentifier(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.user.identifier"));
		user.setRealName(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.user.realName"));
		user.setNickName(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.user.nickName"));
		user.setAvatar(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.user.avatar"));
		user.setDisplayName(_ctx.stringValue("UpdateWorkitemCommentResponse.comment.user.displayName"));
		comment.setUser(user);
		updateWorkitemCommentResponse.setComment(comment);
	 
	 	return updateWorkitemCommentResponse;
	}
}