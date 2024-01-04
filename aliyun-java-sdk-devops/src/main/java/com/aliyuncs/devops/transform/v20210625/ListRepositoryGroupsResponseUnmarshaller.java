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

import com.aliyuncs.devops.model.v20210625.ListRepositoryGroupsResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryGroupsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryGroupsResponseUnmarshaller {

	public static ListRepositoryGroupsResponse unmarshall(ListRepositoryGroupsResponse listRepositoryGroupsResponse, UnmarshallerContext _ctx) {
		
		listRepositoryGroupsResponse.setRequestId(_ctx.stringValue("ListRepositoryGroupsResponse.requestId"));
		listRepositoryGroupsResponse.setErrorMessage(_ctx.stringValue("ListRepositoryGroupsResponse.errorMessage"));
		listRepositoryGroupsResponse.setErrorCode(_ctx.stringValue("ListRepositoryGroupsResponse.errorCode"));
		listRepositoryGroupsResponse.setSuccess(_ctx.booleanValue("ListRepositoryGroupsResponse.success"));
		listRepositoryGroupsResponse.setTotal(_ctx.longValue("ListRepositoryGroupsResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryGroupsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListRepositoryGroupsResponse.result["+ i +"].id"));
			resultItem.setPath(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].path"));
			resultItem.setName(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].name"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].nameWithNamespace"));
			resultItem.setPathWithNamespace(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].pathWithNamespace"));
			resultItem.setVisibilityLevel(_ctx.integerValue("ListRepositoryGroupsResponse.result["+ i +"].visibilityLevel"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].avatarUrl"));
			resultItem.setWebUrl(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].webUrl"));
			resultItem.setType(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].type"));
			resultItem.setDescription(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].description"));
			resultItem.setParentId(_ctx.longValue("ListRepositoryGroupsResponse.result["+ i +"].parentId"));
			resultItem.setOwnerId(_ctx.longValue("ListRepositoryGroupsResponse.result["+ i +"].ownerId"));
			resultItem.setAccessLevel(_ctx.integerValue("ListRepositoryGroupsResponse.result["+ i +"].accessLevel"));
			resultItem.setProjectCount(_ctx.longValue("ListRepositoryGroupsResponse.result["+ i +"].projectCount"));
			resultItem.setGroupCount(_ctx.longValue("ListRepositoryGroupsResponse.result["+ i +"].groupCount"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].createdAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListRepositoryGroupsResponse.result["+ i +"].updatedAt"));

			result.add(resultItem);
		}
		listRepositoryGroupsResponse.setResult(result);
	 
	 	return listRepositoryGroupsResponse;
	}
}