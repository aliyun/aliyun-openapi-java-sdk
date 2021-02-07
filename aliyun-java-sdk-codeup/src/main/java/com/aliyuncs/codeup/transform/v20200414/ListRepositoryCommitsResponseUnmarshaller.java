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

import com.aliyuncs.codeup.model.v20200414.ListRepositoryCommitsResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryCommitsResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryCommitsResponse.ResultItem.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryCommitsResponseUnmarshaller {

	public static ListRepositoryCommitsResponse unmarshall(ListRepositoryCommitsResponse listRepositoryCommitsResponse, UnmarshallerContext _ctx) {
		
		listRepositoryCommitsResponse.setRequestId(_ctx.stringValue("ListRepositoryCommitsResponse.RequestId"));
		listRepositoryCommitsResponse.setErrorCode(_ctx.stringValue("ListRepositoryCommitsResponse.ErrorCode"));
		listRepositoryCommitsResponse.setErrorMessage(_ctx.stringValue("ListRepositoryCommitsResponse.ErrorMessage"));
		listRepositoryCommitsResponse.setSuccess(_ctx.booleanValue("ListRepositoryCommitsResponse.Success"));
		listRepositoryCommitsResponse.setTotal(_ctx.longValue("ListRepositoryCommitsResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryCommitsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAuthorDate(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].AuthorDate"));
			resultItem.setAuthorEmail(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].AuthorEmail"));
			resultItem.setAuthorName(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].AuthorName"));
			resultItem.setCommittedDate(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].CommittedDate"));
			resultItem.setCommitterEmail(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].CommitterEmail"));
			resultItem.setCommitterName(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].CommitterName"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].CreatedAt"));
			resultItem.setId(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].Id"));
			resultItem.setMessage(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].Message"));
			resultItem.setShortId(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].ShortId"));
			resultItem.setTitle(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].Title"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepositoryCommitsResponse.Result["+ i +"].ParentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].ParentIds["+ j +"]"));
			}
			resultItem.setParentIds(parentIds);

			Signature signature = new Signature();
			signature.setGpgKeyId(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].Signature.GpgKeyId"));
			signature.setVerificationStatus(_ctx.stringValue("ListRepositoryCommitsResponse.Result["+ i +"].Signature.VerificationStatus"));
			resultItem.setSignature(signature);

			result.add(resultItem);
		}
		listRepositoryCommitsResponse.setResult(result);
	 
	 	return listRepositoryCommitsResponse;
	}
}