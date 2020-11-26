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

import com.aliyuncs.codeup.model.v20200414.ListRepositoryTagsResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryTagsResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryTagsResponse.ResultItem.Commit;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryTagsResponse.ResultItem.Commit.Signature1;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryTagsResponse.ResultItem.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryTagsResponseUnmarshaller {

	public static ListRepositoryTagsResponse unmarshall(ListRepositoryTagsResponse listRepositoryTagsResponse, UnmarshallerContext _ctx) {
		
		listRepositoryTagsResponse.setRequestId(_ctx.stringValue("ListRepositoryTagsResponse.RequestId"));
		listRepositoryTagsResponse.setErrorCode(_ctx.stringValue("ListRepositoryTagsResponse.ErrorCode"));
		listRepositoryTagsResponse.setSuccess(_ctx.booleanValue("ListRepositoryTagsResponse.Success"));
		listRepositoryTagsResponse.setErrorMessage(_ctx.stringValue("ListRepositoryTagsResponse.ErrorMessage"));
		listRepositoryTagsResponse.setTotal(_ctx.longValue("ListRepositoryTagsResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryTagsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Name"));
			resultItem.setMessage(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Message"));

			Commit commit = new Commit();
			commit.setId(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.Id"));
			commit.setShortId(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.ShortId"));
			commit.setTitle(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.Title"));
			commit.setAuthorName(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.AuthorName"));
			commit.setAuthorEmail(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.AuthorEmail"));
			commit.setCreatedAt(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.CreatedAt"));
			commit.setMessage(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.Message"));
			commit.setAuthoredDate(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.AuthoredDate"));
			commit.setCommittedDate(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.CommittedDate"));
			commit.setCommitterEmail(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.CommitterEmail"));
			commit.setCommitterName(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.CommitterName"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.ParentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.ParentIds["+ j +"]"));
			}
			commit.setParentIds(parentIds);

			Signature1 signature1 = new Signature1();
			signature1.setGpgKeyId(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.Signature.GpgKeyId"));
			signature1.setVerificationStatus(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Commit.Signature.VerificationStatus"));
			commit.setSignature1(signature1);
			resultItem.setCommit(commit);

			Signature signature = new Signature();
			signature.setGpgKeyId(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Signature.GpgKeyId"));
			signature.setVerificationStatus(_ctx.stringValue("ListRepositoryTagsResponse.Result["+ i +"].Signature.VerificationStatus"));
			resultItem.setSignature(signature);

			result.add(resultItem);
		}
		listRepositoryTagsResponse.setResult(result);
	 
	 	return listRepositoryTagsResponse;
	}
}