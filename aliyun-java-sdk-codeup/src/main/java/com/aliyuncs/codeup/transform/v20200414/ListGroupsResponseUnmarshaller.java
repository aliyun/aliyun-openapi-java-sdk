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

import com.aliyuncs.codeup.model.v20200414.ListGroupsResponse;
import com.aliyuncs.codeup.model.v20200414.ListGroupsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsResponseUnmarshaller {

	public static ListGroupsResponse unmarshall(ListGroupsResponse listGroupsResponse, UnmarshallerContext _ctx) {
		
		listGroupsResponse.setRequestId(_ctx.stringValue("ListGroupsResponse.RequestId"));
		listGroupsResponse.setErrorCode(_ctx.stringValue("ListGroupsResponse.ErrorCode"));
		listGroupsResponse.setSuccess(_ctx.booleanValue("ListGroupsResponse.Success"));
		listGroupsResponse.setErrorMessage(_ctx.stringValue("ListGroupsResponse.ErrorMessage"));
		listGroupsResponse.setTotal(_ctx.longValue("ListGroupsResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListGroupsResponse.Result["+ i +"].Id"));
			resultItem.setCreatedAt(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].CreatedAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].UpdatedAt"));
			resultItem.setAccessLevel(_ctx.integerValue("ListGroupsResponse.Result["+ i +"].AccessLevel"));
			resultItem.setDescription(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].Description"));
			resultItem.setName(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].Name"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].NameWithNamespace"));
			resultItem.setOwnerId(_ctx.longValue("ListGroupsResponse.Result["+ i +"].OwnerId"));
			resultItem.setParentId(_ctx.longValue("ListGroupsResponse.Result["+ i +"].ParentId"));
			resultItem.setPath(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].Path"));
			resultItem.setPathWithNamespace(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].PathWithNamespace"));
			resultItem.setType(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].Type"));
			resultItem.setVisibilityLevel(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].VisibilityLevel"));
			resultItem.setWebUrl(_ctx.stringValue("ListGroupsResponse.Result["+ i +"].WebUrl"));

			result.add(resultItem);
		}
		listGroupsResponse.setResult(result);
	 
	 	return listGroupsResponse;
	}
}