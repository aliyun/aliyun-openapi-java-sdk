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

import com.aliyuncs.codeup.model.v20200414.ListRepositoriesResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoriesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoriesResponseUnmarshaller {

	public static ListRepositoriesResponse unmarshall(ListRepositoriesResponse listRepositoriesResponse, UnmarshallerContext _ctx) {
		
		listRepositoriesResponse.setRequestId(_ctx.stringValue("ListRepositoriesResponse.RequestId"));
		listRepositoriesResponse.setErrorCode(_ctx.integerValue("ListRepositoriesResponse.ErrorCode"));
		listRepositoriesResponse.setErrorMessage(_ctx.stringValue("ListRepositoriesResponse.ErrorMessage"));
		listRepositoriesResponse.setSuccess(_ctx.booleanValue("ListRepositoriesResponse.Success"));
		listRepositoriesResponse.setTotal(_ctx.longValue("ListRepositoriesResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoriesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListRepositoriesResponse.Result["+ i +"].Id"));
			resultItem.setDescription(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].Description"));
			resultItem.setVisibilityLevel(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].VisibilityLevel"));
			resultItem.setWebUrl(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].WebUrl"));
			resultItem.setName(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].Name"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].NameWithNamespace"));
			resultItem.setPath(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].Path"));
			resultItem.setPathWithNamespace(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].PathWithNamespace"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].CreatedAt"));
			resultItem.setLastActivityAt(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].LastActivityAt"));
			resultItem.setArchive(_ctx.booleanValue("ListRepositoriesResponse.Result["+ i +"].Archive"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].AvatarUrl"));
			resultItem.setDemoProjectStatus(_ctx.booleanValue("ListRepositoriesResponse.Result["+ i +"].DemoProjectStatus"));
			resultItem.setAccessLevel(_ctx.integerValue("ListRepositoriesResponse.Result["+ i +"].AccessLevel"));
			resultItem.setImportStatus(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].ImportStatus"));
			resultItem.setNamespaceId(_ctx.longValue("ListRepositoriesResponse.Result["+ i +"].NamespaceId"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListRepositoriesResponse.Result["+ i +"].UpdatedAt"));
			resultItem.setStarCount(_ctx.longValue("ListRepositoriesResponse.Result["+ i +"].StarCount"));
			resultItem.setStar(_ctx.booleanValue("ListRepositoriesResponse.Result["+ i +"].Star"));

			result.add(resultItem);
		}
		listRepositoriesResponse.setResult(result);
	 
	 	return listRepositoriesResponse;
	}
}