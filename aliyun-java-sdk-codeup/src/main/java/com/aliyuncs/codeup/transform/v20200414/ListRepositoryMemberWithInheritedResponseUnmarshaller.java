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

import com.aliyuncs.codeup.model.v20200414.ListRepositoryMemberWithInheritedResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryMemberWithInheritedResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryMemberWithInheritedResponse.ResultItem.Inherited;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryMemberWithInheritedResponseUnmarshaller {

	public static ListRepositoryMemberWithInheritedResponse unmarshall(ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInheritedResponse, UnmarshallerContext _ctx) {
		
		listRepositoryMemberWithInheritedResponse.setRequestId(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.RequestId"));
		listRepositoryMemberWithInheritedResponse.setErrorCode(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.ErrorCode"));
		listRepositoryMemberWithInheritedResponse.setSuccess(_ctx.booleanValue("ListRepositoryMemberWithInheritedResponse.Success"));
		listRepositoryMemberWithInheritedResponse.setErrorMessage(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.ErrorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryMemberWithInheritedResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.integerValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].AccessLevel"));
			resultItem.setExternUserId(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].ExternUserId"));
			resultItem.setId(_ctx.longValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Id"));
			resultItem.setState(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].State"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].AvatarUrl"));
			resultItem.setEmail(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Email"));
			resultItem.setName(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Name"));
			resultItem.setUsername(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Username"));

			Inherited inherited = new Inherited();
			inherited.setId(_ctx.longValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.Id"));
			inherited.setName(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.Name"));
			inherited.setPath(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.Path"));
			inherited.setNameWithNamespace(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.NameWithNamespace"));
			inherited.setPathWithNamespace(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.PathWithNamespace"));
			inherited.setType(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.Type"));
			inherited.setVisibilityLevel(_ctx.stringValue("ListRepositoryMemberWithInheritedResponse.Result["+ i +"].Inherited.VisibilityLevel"));
			resultItem.setInherited(inherited);

			result.add(resultItem);
		}
		listRepositoryMemberWithInheritedResponse.setResult(result);
	 
	 	return listRepositoryMemberWithInheritedResponse;
	}
}