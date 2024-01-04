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

import com.aliyuncs.devops.model.v20210625.AddGroupMemberResponse;
import com.aliyuncs.devops.model.v20210625.AddGroupMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGroupMemberResponseUnmarshaller {

	public static AddGroupMemberResponse unmarshall(AddGroupMemberResponse addGroupMemberResponse, UnmarshallerContext _ctx) {
		
		addGroupMemberResponse.setRequestId(_ctx.stringValue("AddGroupMemberResponse.requestId"));
		addGroupMemberResponse.setErrorMessage(_ctx.stringValue("AddGroupMemberResponse.errorMessage"));
		addGroupMemberResponse.setErrorCode(_ctx.stringValue("AddGroupMemberResponse.errorCode"));
		addGroupMemberResponse.setSuccess(_ctx.booleanValue("AddGroupMemberResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AddGroupMemberResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("AddGroupMemberResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("AddGroupMemberResponse.result["+ i +"].name"));
			resultItem.setUsername(_ctx.stringValue("AddGroupMemberResponse.result["+ i +"].username"));
			resultItem.setState(_ctx.stringValue("AddGroupMemberResponse.result["+ i +"].state"));
			resultItem.setAvatarUrl(_ctx.stringValue("AddGroupMemberResponse.result["+ i +"].avatarUrl"));
			resultItem.setEmail(_ctx.stringValue("AddGroupMemberResponse.result["+ i +"].email"));
			resultItem.setExternUid(_ctx.stringValue("AddGroupMemberResponse.result["+ i +"].externUid"));
			resultItem.setAccessLevel(_ctx.integerValue("AddGroupMemberResponse.result["+ i +"].accessLevel"));
			resultItem.setSourceId(_ctx.longValue("AddGroupMemberResponse.result["+ i +"].sourceId"));

			result.add(resultItem);
		}
		addGroupMemberResponse.setResult(result);
	 
	 	return addGroupMemberResponse;
	}
}