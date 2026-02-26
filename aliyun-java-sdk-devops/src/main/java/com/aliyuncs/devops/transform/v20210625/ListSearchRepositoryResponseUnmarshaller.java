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

import com.aliyuncs.devops.model.v20210625.ListSearchRepositoryResponse;
import com.aliyuncs.devops.model.v20210625.ListSearchRepositoryResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListSearchRepositoryResponse.ResultItem.HighlightTextMap;
import com.aliyuncs.devops.model.v20210625.ListSearchRepositoryResponse.ResultItem.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSearchRepositoryResponseUnmarshaller {

	public static ListSearchRepositoryResponse unmarshall(ListSearchRepositoryResponse listSearchRepositoryResponse, UnmarshallerContext _ctx) {
		
		listSearchRepositoryResponse.setRequestId(_ctx.stringValue("ListSearchRepositoryResponse.requestId"));
		listSearchRepositoryResponse.setErrorCode(_ctx.stringValue("ListSearchRepositoryResponse.errorCode"));
		listSearchRepositoryResponse.setErrorMessage(_ctx.stringValue("ListSearchRepositoryResponse.errorMessage"));
		listSearchRepositoryResponse.setSuccess(_ctx.booleanValue("ListSearchRepositoryResponse.success"));
		listSearchRepositoryResponse.setTotal(_ctx.longValue("ListSearchRepositoryResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSearchRepositoryResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDocId(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].docId"));

			HighlightTextMap highlightTextMap = new HighlightTextMap();
			highlightTextMap.setOrganizationId(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].highlightTextMap.organizationId"));
			highlightTextMap.setCreatorUserId(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].highlightTextMap.creatorUserId"));
			highlightTextMap.setRepoPath(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].highlightTextMap.repoPath"));
			highlightTextMap.setRepoNameWithNamespace(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].highlightTextMap.repoNameWithNamespace"));
			highlightTextMap.setReadMe(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].highlightTextMap.readMe"));
			highlightTextMap.setDescription(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].highlightTextMap.description"));
			resultItem.setHighlightTextMap(highlightTextMap);

			Source source = new Source();
			source.setRepoName(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.repoName"));
			source.setRepoPath(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.repoPath"));
			source.setDescription(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.description"));
			source.setVisibilityLevel(_ctx.integerValue("ListSearchRepositoryResponse.result["+ i +"].source.visibilityLevel"));
			source.setCreateTime(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.createTime"));
			source.setLastActivityTime(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.lastActivityTime"));
			source.setReadMe(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.readMe"));
			source.setOrganizationId(_ctx.stringValue("ListSearchRepositoryResponse.result["+ i +"].source.organizationId"));
			resultItem.setSource(source);

			result.add(resultItem);
		}
		listSearchRepositoryResponse.setResult(result);
	 
	 	return listSearchRepositoryResponse;
	}
}