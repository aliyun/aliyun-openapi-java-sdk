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

import com.aliyuncs.devops.model.v20210625.ListGroupMemberResponse;
import com.aliyuncs.devops.model.v20210625.ListGroupMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupMemberResponseUnmarshaller {

	public static ListGroupMemberResponse unmarshall(ListGroupMemberResponse listGroupMemberResponse, UnmarshallerContext _ctx) {
		
		listGroupMemberResponse.setRequestId(_ctx.stringValue("ListGroupMemberResponse.requestId"));
		listGroupMemberResponse.setErrorMessage(_ctx.stringValue("ListGroupMemberResponse.errorMessage"));
		listGroupMemberResponse.setErrorCode(_ctx.stringValue("ListGroupMemberResponse.errorCode"));
		listGroupMemberResponse.setSuccess(_ctx.booleanValue("ListGroupMemberResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupMemberResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListGroupMemberResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].name"));
			resultItem.setUsername(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].username"));
			resultItem.setState(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].state"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].avatarUrl"));
			resultItem.setEmail(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].email"));
			resultItem.setExternUid(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].externUid"));
			resultItem.setAccessLevel(_ctx.integerValue("ListGroupMemberResponse.result["+ i +"].accessLevel"));
			resultItem.setMemberType(_ctx.stringValue("ListGroupMemberResponse.result["+ i +"].memberType"));
			resultItem.setSourceId(_ctx.longValue("ListGroupMemberResponse.result["+ i +"].sourceId"));

			result.add(resultItem);
		}
		listGroupMemberResponse.setResult(result);
	 
	 	return listGroupMemberResponse;
	}
}