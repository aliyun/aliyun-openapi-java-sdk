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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryMovieCommentsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryMovieCommentsResponse.Comment;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMovieCommentsResponseUnmarshaller {

	public static QueryMovieCommentsResponse unmarshall(QueryMovieCommentsResponse queryMovieCommentsResponse, UnmarshallerContext context) {
		
		queryMovieCommentsResponse.setRequestId(context.stringValue("QueryMovieCommentsResponse.RequestId"));
		queryMovieCommentsResponse.setLogsId(context.stringValue("QueryMovieCommentsResponse.LogsId"));
		queryMovieCommentsResponse.setSubCode(context.stringValue("QueryMovieCommentsResponse.SubCode"));
		queryMovieCommentsResponse.setSubMessage(context.stringValue("QueryMovieCommentsResponse.SubMessage"));
		queryMovieCommentsResponse.setCode(context.stringValue("QueryMovieCommentsResponse.Code"));
		queryMovieCommentsResponse.setSuccess(context.booleanValue("QueryMovieCommentsResponse.Success"));
		queryMovieCommentsResponse.setMessage(context.stringValue("QueryMovieCommentsResponse.Message"));
		queryMovieCommentsResponse.setCount(context.longValue("QueryMovieCommentsResponse.Count"));

		List<Comment> commentList = new ArrayList<Comment>();
		for (int i = 0; i < context.lengthValue("QueryMovieCommentsResponse.CommentList.Length"); i++) {
			Comment comment = new Comment();
			comment.setCommentTime(context.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].CommentTime"));
			comment.setContent(context.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].Content"));
			comment.setFavorCount(context.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].FavorCount"));
			comment.setId(context.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].Id"));
			comment.setNickName(context.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].NickName"));
			comment.setRemark(context.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].Remark"));
			comment.setMovieId(context.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].MovieId"));
			comment.setSubject(context.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].Subject"));

			commentList.add(comment);
		}
		queryMovieCommentsResponse.setCommentList(commentList);
	 
	 	return queryMovieCommentsResponse;
	}
}