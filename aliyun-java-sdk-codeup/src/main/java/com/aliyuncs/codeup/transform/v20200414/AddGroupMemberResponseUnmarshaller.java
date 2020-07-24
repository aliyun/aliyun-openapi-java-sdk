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

import com.aliyuncs.codeup.model.v20200414.AddGroupMemberResponse;
import com.aliyuncs.codeup.model.v20200414.AddGroupMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGroupMemberResponseUnmarshaller {

	public static AddGroupMemberResponse unmarshall(AddGroupMemberResponse addGroupMemberResponse, UnmarshallerContext _ctx) {
		
		addGroupMemberResponse.setRequestId(_ctx.stringValue("AddGroupMemberResponse.RequestId"));
		addGroupMemberResponse.setErrorCode(_ctx.stringValue("AddGroupMemberResponse.ErrorCode"));
		addGroupMemberResponse.setSuccess(_ctx.booleanValue("AddGroupMemberResponse.Success"));
		addGroupMemberResponse.setErrorMessage(_ctx.stringValue("AddGroupMemberResponse.ErrorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AddGroupMemberResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.integerValue("AddGroupMemberResponse.Result["+ i +"].AccessLevel"));
			resultItem.setExternUserId(_ctx.stringValue("AddGroupMemberResponse.Result["+ i +"].ExternUserId"));
			resultItem.setId(_ctx.longValue("AddGroupMemberResponse.Result["+ i +"].Id"));
			resultItem.setState(_ctx.stringValue("AddGroupMemberResponse.Result["+ i +"].State"));
			resultItem.setAvatarUrl(_ctx.stringValue("AddGroupMemberResponse.Result["+ i +"].AvatarUrl"));
			resultItem.setEmail(_ctx.stringValue("AddGroupMemberResponse.Result["+ i +"].Email"));

			result.add(resultItem);
		}
		addGroupMemberResponse.setResult(result);
	 
	 	return addGroupMemberResponse;
	}
}