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

import com.aliyuncs.codeup.model.v20200414.ListRepositoryMemberResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryMemberResponseUnmarshaller {

	public static ListRepositoryMemberResponse unmarshall(ListRepositoryMemberResponse listRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		listRepositoryMemberResponse.setRequestId(_ctx.stringValue("ListRepositoryMemberResponse.RequestId"));
		listRepositoryMemberResponse.setErrorCode(_ctx.stringValue("ListRepositoryMemberResponse.ErrorCode"));
		listRepositoryMemberResponse.setSuccess(_ctx.booleanValue("ListRepositoryMemberResponse.Success"));
		listRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("ListRepositoryMemberResponse.ErrorMessage"));
		listRepositoryMemberResponse.setTotal(_ctx.longValue("ListRepositoryMemberResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryMemberResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.integerValue("ListRepositoryMemberResponse.Result["+ i +"].AccessLevel"));
			resultItem.setExternUserId(_ctx.stringValue("ListRepositoryMemberResponse.Result["+ i +"].ExternUserId"));
			resultItem.setId(_ctx.longValue("ListRepositoryMemberResponse.Result["+ i +"].Id"));
			resultItem.setState(_ctx.stringValue("ListRepositoryMemberResponse.Result["+ i +"].State"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListRepositoryMemberResponse.Result["+ i +"].AvatarUrl"));
			resultItem.setEmail(_ctx.stringValue("ListRepositoryMemberResponse.Result["+ i +"].Email"));
			resultItem.setName(_ctx.stringValue("ListRepositoryMemberResponse.Result["+ i +"].Name"));
			resultItem.setUsername(_ctx.stringValue("ListRepositoryMemberResponse.Result["+ i +"].Username"));

			result.add(resultItem);
		}
		listRepositoryMemberResponse.setResult(result);
	 
	 	return listRepositoryMemberResponse;
	}
}