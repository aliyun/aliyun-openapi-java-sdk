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

import com.aliyuncs.devops.model.v20210625.ListRepositoryMemberWithInheritedResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryMemberWithInheritedResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListRepositoryMemberWithInheritedResponse.ResultItem.Inherited;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryMemberWithInheritedResponseUnmarshaller {

	public static ListRepositoryMemberWithInheritedResponse unmarshall(ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInheritedResponse, UnmarshallerContext _ctx) {
		
		listRepositoryMemberWithInheritedResponse.setErrorMessage(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.errorMessage"));
		listRepositoryMemberWithInheritedResponse.setRequestId(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.requestId"));
		listRepositoryMemberWithInheritedResponse.setErrorCode(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.errorCode"));
		listRepositoryMemberWithInheritedResponse.setSuccess(_ctx.booleanValue("ListRepositoryMemberWithInheritedResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryMemberWithInheritedResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setExternUserId(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].externUserId"));
			resultItem.setEmail(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].email"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].avatarUrl"));
			resultItem.setState(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].state"));
			resultItem.setAccessLevel(_ctx.integerValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].accessLevel"));
			resultItem.setName(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].name"));
			resultItem.setId(_ctx.longValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].id"));
			resultItem.setUsername(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].username"));

			Inherited inherited = new Inherited();
			inherited.setType(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.type"));
			inherited.setNameWithNamespace(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.nameWithNamespace"));
			inherited.setPathWithNamespace(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.pathWithNamespace"));
			inherited.setVisibilityLevel(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.visibilityLevel"));
			inherited.setPath(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.path"));
			inherited.setName(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.name"));
			inherited.setId(_ctx.longValue("ListRepositoryMemberWithInheritedResponse.result["+ i +"].inherited.id"));
			resultItem.setInherited(inherited);

			result.add(resultItem);
		}
		listRepositoryMemberWithInheritedResponse.setResult(result);
	 
	 	return listRepositoryMemberWithInheritedResponse;
	}
}