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

import com.aliyuncs.devops.model.v20210625.ListRepositoriesResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoriesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoriesResponseUnmarshaller {

	public static ListRepositoriesResponse unmarshall(ListRepositoriesResponse listRepositoriesResponse, UnmarshallerContext _ctx) {
		
		listRepositoriesResponse.setRequestId(_ctx.stringValue("ListRepositoriesResponse.requestId"));
		listRepositoriesResponse.setErrorMessage(_ctx.stringValue("ListRepositoriesResponse.errorMessage"));
		listRepositoriesResponse.setTotal(_ctx.longValue("ListRepositoriesResponse.total"));
		listRepositoriesResponse.setSuccess(_ctx.booleanValue("ListRepositoriesResponse.success"));
		listRepositoriesResponse.setErrorCode(_ctx.integerValue("ListRepositoriesResponse.errorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoriesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setLastActivityAt(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].lastActivityAt"));
			resultItem.setNamespaceId(_ctx.longValue("ListRepositoriesResponse.result["+ i +"].namespaceId"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].avatarUrl"));
			resultItem.setStarCount(_ctx.longValue("ListRepositoriesResponse.result["+ i +"].starCount"));
			resultItem.setArchive(_ctx.booleanValue("ListRepositoriesResponse.result["+ i +"].archive"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].createdAt"));
			resultItem.setStar(_ctx.booleanValue("ListRepositoriesResponse.result["+ i +"].star"));
			resultItem.setImportStatus(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].importStatus"));
			resultItem.setWebUrl(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].webUrl"));
			resultItem.setDescription(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].description"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].nameWithNamespace"));
			resultItem.setPathWithNamespace(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].pathWithNamespace"));
			resultItem.setPath(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].path"));
			resultItem.setVisibilityLevel(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].visibilityLevel"));
			resultItem.setAccessLevel(_ctx.integerValue("ListRepositoriesResponse.result["+ i +"].accessLevel"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].updatedAt"));
			resultItem.setName(_ctx.stringValue("ListRepositoriesResponse.result["+ i +"].name"));
			resultItem.setId(_ctx.longValue("ListRepositoriesResponse.result["+ i +"].Id"));

			result.add(resultItem);
		}
		listRepositoriesResponse.setResult(result);
	 
	 	return listRepositoriesResponse;
	}
}