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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMovieCommentsResponseUnmarshaller {

	public static QueryMovieCommentsResponse unmarshall(QueryMovieCommentsResponse queryMovieCommentsResponse, UnmarshallerContext _ctx) {
		
		queryMovieCommentsResponse.setRequestId(_ctx.stringValue("QueryMovieCommentsResponse.RequestId"));
		queryMovieCommentsResponse.setLogsId(_ctx.stringValue("QueryMovieCommentsResponse.LogsId"));
		queryMovieCommentsResponse.setSubCode(_ctx.stringValue("QueryMovieCommentsResponse.SubCode"));
		queryMovieCommentsResponse.setSubMessage(_ctx.stringValue("QueryMovieCommentsResponse.SubMessage"));
		queryMovieCommentsResponse.setCode(_ctx.stringValue("QueryMovieCommentsResponse.Code"));
		queryMovieCommentsResponse.setSuccess(_ctx.booleanValue("QueryMovieCommentsResponse.Success"));
		queryMovieCommentsResponse.setMessage(_ctx.stringValue("QueryMovieCommentsResponse.Message"));
		queryMovieCommentsResponse.setCount(_ctx.longValue("QueryMovieCommentsResponse.Count"));

		List<Comment> commentList = new ArrayList<Comment>();
		for (int i = 0; i < _ctx.lengthValue("QueryMovieCommentsResponse.CommentList.Length"); i++) {
			Comment comment = new Comment();
			comment.setCommentTime(_ctx.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].CommentTime"));
			comment.setContent(_ctx.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].Content"));
			comment.setFavorCount(_ctx.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].FavorCount"));
			comment.setId(_ctx.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].Id"));
			comment.setNickName(_ctx.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].NickName"));
			comment.setRemark(_ctx.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].Remark"));
			comment.setMovieId(_ctx.longValue("QueryMovieCommentsResponse.CommentList["+ i +"].MovieId"));
			comment.setSubject(_ctx.stringValue("QueryMovieCommentsResponse.CommentList["+ i +"].Subject"));

			commentList.add(comment);
		}
		queryMovieCommentsResponse.setCommentList(commentList);
	 
	 	return queryMovieCommentsResponse;
	}
}