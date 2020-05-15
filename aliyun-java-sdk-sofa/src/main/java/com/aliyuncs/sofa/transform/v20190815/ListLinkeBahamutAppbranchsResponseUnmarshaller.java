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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppbranchsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppbranchsResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppbranchsResponse.ResultItem.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAppbranchsResponseUnmarshaller {

	public static ListLinkeBahamutAppbranchsResponse unmarshall(ListLinkeBahamutAppbranchsResponse listLinkeBahamutAppbranchsResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAppbranchsResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.RequestId"));
		listLinkeBahamutAppbranchsResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.ResultCode"));
		listLinkeBahamutAppbranchsResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.ResultMessage"));
		listLinkeBahamutAppbranchsResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.ErrorMessage"));
		listLinkeBahamutAppbranchsResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Message"));
		listLinkeBahamutAppbranchsResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAppbranchsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAppbranchsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setLocked(_ctx.booleanValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Locked"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Name"));

			Commit commit = new Commit();
			commit.setAuthoredData(_ctx.longValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.AuthoredData"));
			commit.setAuthorEmail(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.AuthorEmail"));
			commit.setAuthorName(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.AuthorName"));
			commit.setCommittedDate(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.CommittedDate"));
			commit.setCommitterEmail(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.CommitterEmail"));
			commit.setCommitterName(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.CommitterName"));
			commit.setCreatedAt(_ctx.longValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.CreatedAt"));
			commit.setId(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.Id"));
			commit.setMessage(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.Message"));
			commit.setShortId(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.ShortId"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.ParentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListLinkeBahamutAppbranchsResponse.Result["+ i +"].Commit.ParentIds["+ j +"]"));
			}
			commit.setParentIds(parentIds);
			resultItem.setCommit(commit);

			result.add(resultItem);
		}
		listLinkeBahamutAppbranchsResponse.setResult(result);
	 
	 	return listLinkeBahamutAppbranchsResponse;
	}
}