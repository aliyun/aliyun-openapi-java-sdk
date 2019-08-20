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

package com.aliyuncs.appmallsservice.transform.v20180224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetShowCommentsResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetShowCommentsResponse.CommentListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetShowCommentsResponseUnmarshaller {

	public static TaobaoFilmGetShowCommentsResponse unmarshall(TaobaoFilmGetShowCommentsResponse taobaoFilmGetShowCommentsResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetShowCommentsResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.RequestId"));
		taobaoFilmGetShowCommentsResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.ErrorCode"));
		taobaoFilmGetShowCommentsResponse.setMsg(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.Msg"));
		taobaoFilmGetShowCommentsResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.SubCode"));
		taobaoFilmGetShowCommentsResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.SubMsg"));
		taobaoFilmGetShowCommentsResponse.setCount(_ctx.longValue("TaobaoFilmGetShowCommentsResponse.Count"));
		taobaoFilmGetShowCommentsResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.LogsId"));

		List<CommentListItem> commentList = new ArrayList<CommentListItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetShowCommentsResponse.CommentList.Length"); i++) {
			CommentListItem commentListItem = new CommentListItem();
			commentListItem.setCommentTime(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].CommentTime"));
			commentListItem.setContent(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].Content"));
			commentListItem.setFavorCount(_ctx.longValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].FavorCount"));
			commentListItem.setId(_ctx.longValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].Id"));
			commentListItem.setNickName(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].NickName"));
			commentListItem.setRemark(_ctx.longValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].Remark"));
			commentListItem.setShowId(_ctx.longValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].ShowId"));
			commentListItem.setSubject(_ctx.stringValue("TaobaoFilmGetShowCommentsResponse.CommentList["+ i +"].Subject"));

			commentList.add(commentListItem);
		}
		taobaoFilmGetShowCommentsResponse.setCommentList(commentList);
	 
	 	return taobaoFilmGetShowCommentsResponse;
	}
}