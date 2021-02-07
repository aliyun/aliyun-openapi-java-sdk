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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.ListMergeRequestCommentsResponse;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestCommentsResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestCommentsResponse.ResultItem.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestCommentsResponseUnmarshaller {

	public static ListMergeRequestCommentsResponse unmarshall(ListMergeRequestCommentsResponse listMergeRequestCommentsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestCommentsResponse.setRequestId(_ctx.stringValue("ListMergeRequestCommentsResponse.RequestId"));
		listMergeRequestCommentsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestCommentsResponse.ErrorCode"));
		listMergeRequestCommentsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestCommentsResponse.ErrorMessage"));
		listMergeRequestCommentsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestCommentsResponse.Success"));
		listMergeRequestCommentsResponse.setTotal(_ctx.longValue("ListMergeRequestCommentsResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestCommentsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setClosed(_ctx.integerValue("ListMergeRequestCommentsResponse.Result["+ i +"].Closed"));
			resultItem.setCreatedAt(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].CreatedAt"));
			resultItem.setId(_ctx.longValue("ListMergeRequestCommentsResponse.Result["+ i +"].Id"));
			resultItem.setIsDraft(_ctx.booleanValue("ListMergeRequestCommentsResponse.Result["+ i +"].IsDraft"));
			resultItem.setLine(_ctx.longValue("ListMergeRequestCommentsResponse.Result["+ i +"].Line"));
			resultItem.setNote(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Note"));
			resultItem.setOutDated(_ctx.booleanValue("ListMergeRequestCommentsResponse.Result["+ i +"].OutDated"));
			resultItem.setParentNoteId(_ctx.longValue("ListMergeRequestCommentsResponse.Result["+ i +"].ParentNoteId"));
			resultItem.setPath(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Path"));
			resultItem.setProjectId(_ctx.longValue("ListMergeRequestCommentsResponse.Result["+ i +"].ProjectId"));
			resultItem.setRangeContext(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].RangeContext"));
			resultItem.setSide(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Side"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].UpdatedAt"));

			Author author = new Author();
			author.setAvatarUrl(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Author.AvatarUrl"));
			author.setEmail(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Author.Email"));
			author.setExternUserId(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Author.ExternUserId"));
			author.setId(_ctx.longValue("ListMergeRequestCommentsResponse.Result["+ i +"].Author.Id"));
			author.setName(_ctx.stringValue("ListMergeRequestCommentsResponse.Result["+ i +"].Author.Name"));
			resultItem.setAuthor(author);

			result.add(resultItem);
		}
		listMergeRequestCommentsResponse.setResult(result);
	 
	 	return listMergeRequestCommentsResponse;
	}
}