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

import com.aliyuncs.devops.model.v20210625.ListSearchCommitResponse;
import com.aliyuncs.devops.model.v20210625.ListSearchCommitResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListSearchCommitResponse.ResultItem.HighlightTextMap;
import com.aliyuncs.devops.model.v20210625.ListSearchCommitResponse.ResultItem.Source;
import com.aliyuncs.devops.model.v20210625.ListSearchCommitResponse.ResultItem.Source.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSearchCommitResponseUnmarshaller {

	public static ListSearchCommitResponse unmarshall(ListSearchCommitResponse listSearchCommitResponse, UnmarshallerContext _ctx) {
		
		listSearchCommitResponse.setRequestId(_ctx.stringValue("ListSearchCommitResponse.requestId"));
		listSearchCommitResponse.setErrorMessage(_ctx.stringValue("ListSearchCommitResponse.errorMessage"));
		listSearchCommitResponse.setErrorCode(_ctx.stringValue("ListSearchCommitResponse.errorCode"));
		listSearchCommitResponse.setSuccess(_ctx.booleanValue("ListSearchCommitResponse.success"));
		listSearchCommitResponse.setTotal(_ctx.longValue("ListSearchCommitResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSearchCommitResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDocId(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].docId"));

			HighlightTextMap highlightTextMap = new HighlightTextMap();
			highlightTextMap.setCommitId(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].highlightTextMap.commitId"));
			highlightTextMap.setTitle(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].highlightTextMap.title"));
			highlightTextMap.setCommitMessage(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].highlightTextMap.commitMessage"));
			highlightTextMap.setOrganizationId(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].highlightTextMap.organizationId"));
			resultItem.setHighlightTextMap(highlightTextMap);

			Source source = new Source();
			source.setCommitId(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.commitId"));
			source.setTitle(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.title"));
			source.setCommitMessage(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.commitMessage"));
			source.setAuthorTime(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.authorTime"));
			source.setRepoPath(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.repoPath"));
			source.setOrganizationId(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.organizationId"));

			Author author = new Author();
			author.setName(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.author.name"));
			author.setEmail(_ctx.stringValue("ListSearchCommitResponse.result["+ i +"].source.author.email"));
			source.setAuthor(author);
			resultItem.setSource(source);

			result.add(resultItem);
		}
		listSearchCommitResponse.setResult(result);
	 
	 	return listSearchCommitResponse;
	}
}