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

import com.aliyuncs.devops.model.v20210625.ListRepositoryTagsResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryTagsResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListRepositoryTagsResponse.ResultItem.Commit;
import com.aliyuncs.devops.model.v20210625.ListRepositoryTagsResponse.ResultItem.Commit.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryTagsResponseUnmarshaller {

	public static ListRepositoryTagsResponse unmarshall(ListRepositoryTagsResponse listRepositoryTagsResponse, UnmarshallerContext _ctx) {
		
		listRepositoryTagsResponse.setRequestId(_ctx.stringValue("ListRepositoryTagsResponse.requestId"));
		listRepositoryTagsResponse.setErrorCode(_ctx.stringValue("ListRepositoryTagsResponse.errorCode"));
		listRepositoryTagsResponse.setErrorMessage(_ctx.stringValue("ListRepositoryTagsResponse.errorMessage"));
		listRepositoryTagsResponse.setSuccess(_ctx.booleanValue("ListRepositoryTagsResponse.success"));
		listRepositoryTagsResponse.setTotal(_ctx.longValue("ListRepositoryTagsResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryTagsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].name"));
			resultItem.setMessage(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].message"));

			Commit commit = new Commit();
			commit.setId(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.id"));
			commit.setShortId(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.shortId"));
			commit.setTitle(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.title"));
			commit.setMessage(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.message"));
			commit.setCreatedAt(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.createdAt"));
			commit.setAuthorName(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.authorName"));
			commit.setAuthorEmail(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.authorEmail"));
			commit.setAuthoredDate(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.authoredDate"));
			commit.setCommitterName(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.committerName"));
			commit.setCommitterEmail(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.committerEmail"));
			commit.setCommittedDate(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.committedDate"));

			List<String> parentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRepositoryTagsResponse.result["+ i +"].commit.parentIds.Length"); j++) {
				parentIds.add(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.parentIds["+ j +"]"));
			}
			commit.setParentIds(parentIds);

			Signature signature = new Signature();
			signature.setGpgKeyId(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.signature.gpgKeyId"));
			signature.setVerificationStatus(_ctx.stringValue("ListRepositoryTagsResponse.result["+ i +"].commit.signature.verificationStatus"));
			commit.setSignature(signature);
			resultItem.setCommit(commit);

			result.add(resultItem);
		}
		listRepositoryTagsResponse.setResult(result);
	 
	 	return listRepositoryTagsResponse;
	}
}