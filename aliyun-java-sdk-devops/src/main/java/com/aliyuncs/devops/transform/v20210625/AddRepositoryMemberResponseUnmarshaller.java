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

import com.aliyuncs.devops.model.v20210625.AddRepositoryMemberResponse;
import com.aliyuncs.devops.model.v20210625.AddRepositoryMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRepositoryMemberResponseUnmarshaller {

	public static AddRepositoryMemberResponse unmarshall(AddRepositoryMemberResponse addRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		addRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("AddRepositoryMemberResponse.errorMessage"));
		addRepositoryMemberResponse.setRequestId(_ctx.stringValue("AddRepositoryMemberResponse.requestId"));
		addRepositoryMemberResponse.setErrorCode(_ctx.stringValue("AddRepositoryMemberResponse.errorCode"));
		addRepositoryMemberResponse.setSuccess(_ctx.booleanValue("AddRepositoryMemberResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AddRepositoryMemberResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setExternUserId(_ctx.stringValue("AddRepositoryMemberResponse.result["+ i +"].externUserId"));
			resultItem.setEmail(_ctx.stringValue("AddRepositoryMemberResponse.result["+ i +"].email"));
			resultItem.setAvatarUrl(_ctx.stringValue("AddRepositoryMemberResponse.result["+ i +"].avatarUrl"));
			resultItem.setState(_ctx.stringValue("AddRepositoryMemberResponse.result["+ i +"].state"));
			resultItem.setAccessLevel(_ctx.integerValue("AddRepositoryMemberResponse.result["+ i +"].accessLevel"));
			resultItem.setId(_ctx.longValue("AddRepositoryMemberResponse.result["+ i +"].id"));

			result.add(resultItem);
		}
		addRepositoryMemberResponse.setResult(result);
	 
	 	return addRepositoryMemberResponse;
	}
}