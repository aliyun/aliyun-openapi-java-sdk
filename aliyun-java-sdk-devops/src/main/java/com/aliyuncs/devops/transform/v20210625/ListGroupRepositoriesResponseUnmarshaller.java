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

import com.aliyuncs.devops.model.v20210625.ListGroupRepositoriesResponse;
import com.aliyuncs.devops.model.v20210625.ListGroupRepositoriesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupRepositoriesResponseUnmarshaller {

	public static ListGroupRepositoriesResponse unmarshall(ListGroupRepositoriesResponse listGroupRepositoriesResponse, UnmarshallerContext _ctx) {
		
		listGroupRepositoriesResponse.setRequestId(_ctx.stringValue("ListGroupRepositoriesResponse.requestId"));
		listGroupRepositoriesResponse.setErrorMessage(_ctx.stringValue("ListGroupRepositoriesResponse.errorMessage"));
		listGroupRepositoriesResponse.setErrorCode(_ctx.stringValue("ListGroupRepositoriesResponse.errorCode"));
		listGroupRepositoriesResponse.setSuccess(_ctx.booleanValue("ListGroupRepositoriesResponse.success"));
		listGroupRepositoriesResponse.setTotal(_ctx.longValue("ListGroupRepositoriesResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupRepositoriesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListGroupRepositoriesResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].name"));
			resultItem.setPath(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].path"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].nameWithNamespace"));
			resultItem.setPathWithNamespace(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].pathWithNamespace"));
			resultItem.setLastActivityAt(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].lastActivityAt"));
			resultItem.setCreatedAt(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].createdAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].updatedAt"));
			resultItem.setVisibilityLevel(_ctx.integerValue("ListGroupRepositoriesResponse.result["+ i +"].visibilityLevel"));
			resultItem.setStarCount(_ctx.integerValue("ListGroupRepositoriesResponse.result["+ i +"].starCount"));
			resultItem.setWebUrl(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].webUrl"));
			resultItem.setSshUrl(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].sshUrl"));
			resultItem.setHttpUrl(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].httpUrl"));
			resultItem.setDescription(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].description"));
			resultItem.setPrivateFlag(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].privateFlag"));
			resultItem.setCreatorId(_ctx.longValue("ListGroupRepositoriesResponse.result["+ i +"].creatorId"));
			resultItem.setIssuesEnabled(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].issuesEnabled"));
			resultItem.setMergeRequestsEnabled(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].mergeRequestsEnabled"));
			resultItem.setWikiEnabled(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].wikiEnabled"));
			resultItem.setNamespaceId(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].namespaceId"));
			resultItem.setSnippetsEnabled(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].snippetsEnabled"));
			resultItem.setImportUrl(_ctx.stringValue("ListGroupRepositoriesResponse.result["+ i +"].importUrl"));
			resultItem.setArchived(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].archived"));
			resultItem.setCommitCount(_ctx.longValue("ListGroupRepositoriesResponse.result["+ i +"].commitCount"));
			resultItem.setIsStared(_ctx.booleanValue("ListGroupRepositoriesResponse.result["+ i +"].isStared"));

			result.add(resultItem);
		}
		listGroupRepositoriesResponse.setResult(result);
	 
	 	return listGroupRepositoriesResponse;
	}
}