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

import com.aliyuncs.codeup.model.v20200414.AddRepositoryMemberResponse;
import com.aliyuncs.codeup.model.v20200414.AddRepositoryMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRepositoryMemberResponseUnmarshaller {

	public static AddRepositoryMemberResponse unmarshall(AddRepositoryMemberResponse addRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		addRepositoryMemberResponse.setRequestId(_ctx.stringValue("AddRepositoryMemberResponse.RequestId"));
		addRepositoryMemberResponse.setErrorCode(_ctx.stringValue("AddRepositoryMemberResponse.ErrorCode"));
		addRepositoryMemberResponse.setSuccess(_ctx.booleanValue("AddRepositoryMemberResponse.Success"));
		addRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("AddRepositoryMemberResponse.ErrorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AddRepositoryMemberResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.integerValue("AddRepositoryMemberResponse.Result["+ i +"].AccessLevel"));
			resultItem.setExternUserId(_ctx.stringValue("AddRepositoryMemberResponse.Result["+ i +"].ExternUserId"));
			resultItem.setId(_ctx.longValue("AddRepositoryMemberResponse.Result["+ i +"].Id"));
			resultItem.setState(_ctx.stringValue("AddRepositoryMemberResponse.Result["+ i +"].State"));
			resultItem.setAvatarUrl(_ctx.stringValue("AddRepositoryMemberResponse.Result["+ i +"].AvatarUrl"));
			resultItem.setEmail(_ctx.stringValue("AddRepositoryMemberResponse.Result["+ i +"].Email"));

			result.add(resultItem);
		}
		addRepositoryMemberResponse.setResult(result);
	 
	 	return addRepositoryMemberResponse;
	}
}