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

import com.aliyuncs.devops.model.v20210625.GetWorkitemCommentListResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkitemCommentListResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetWorkitemCommentListResponse.Result.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkitemCommentListResponseUnmarshaller {

	public static GetWorkitemCommentListResponse unmarshall(GetWorkitemCommentListResponse getWorkitemCommentListResponse, UnmarshallerContext _ctx) {
		
		getWorkitemCommentListResponse.setRequestId(_ctx.stringValue("GetWorkitemCommentListResponse.requestId"));
		getWorkitemCommentListResponse.setErrorMsg(_ctx.stringValue("GetWorkitemCommentListResponse.errorMsg"));
		getWorkitemCommentListResponse.setErrorCode(_ctx.stringValue("GetWorkitemCommentListResponse.errorCode"));
		getWorkitemCommentListResponse.setSuccess(_ctx.stringValue("GetWorkitemCommentListResponse.success"));

		List<Result> commentList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkitemCommentListResponse.commentList.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.longValue("GetWorkitemCommentListResponse.commentList["+ i +"].id"));
			result.setContent(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].content"));
			result.setTargetType(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].targetType"));
			result.setTargetIdentifier(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].targetIdentifier"));
			result.setParentId(_ctx.longValue("GetWorkitemCommentListResponse.commentList["+ i +"].parentId"));
			result.setCreateTime(_ctx.longValue("GetWorkitemCommentListResponse.commentList["+ i +"].createTime"));
			result.setModifiedTime(_ctx.longValue("GetWorkitemCommentListResponse.commentList["+ i +"].modifiedTime"));
			result.setIsTop(_ctx.booleanValue("GetWorkitemCommentListResponse.commentList["+ i +"].isTop"));
			result.setTopTime(_ctx.longValue("GetWorkitemCommentListResponse.commentList["+ i +"].topTime"));
			result.setFormatType(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].formatType"));

			User user = new User();
			user.setAccount(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].user.account"));
			user.setIdentifier(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].user.identifier"));
			user.setRealName(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].user.realName"));
			user.setNickName(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].user.nickName"));
			user.setAvatar(_ctx.stringValue("GetWorkitemCommentListResponse.commentList["+ i +"].user.avatar"));
			result.setUser(user);

			commentList.add(result);
		}
		getWorkitemCommentListResponse.setCommentList(commentList);
	 
	 	return getWorkitemCommentListResponse;
	}
}