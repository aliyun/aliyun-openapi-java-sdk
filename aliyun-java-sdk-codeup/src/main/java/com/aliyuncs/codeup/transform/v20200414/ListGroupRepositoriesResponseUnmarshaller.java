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

import com.aliyuncs.codeup.model.v20200414.ListGroupRepositoriesResponse;
import com.aliyuncs.codeup.model.v20200414.ListGroupRepositoriesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupRepositoriesResponseUnmarshaller {

	public static ListGroupRepositoriesResponse unmarshall(ListGroupRepositoriesResponse listGroupRepositoriesResponse, UnmarshallerContext _ctx) {
		
		listGroupRepositoriesResponse.setRequestId(_ctx.stringValue("ListGroupRepositoriesResponse.RequestId"));
		listGroupRepositoriesResponse.setErrorCode(_ctx.stringValue("ListGroupRepositoriesResponse.ErrorCode"));
		listGroupRepositoriesResponse.setSuccess(_ctx.booleanValue("ListGroupRepositoriesResponse.Success"));
		listGroupRepositoriesResponse.setErrorMessage(_ctx.stringValue("ListGroupRepositoriesResponse.ErrorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupRepositoriesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setArchive(_ctx.booleanValue("ListGroupRepositoriesResponse.Result["+ i +"].Archive"));
			resultItem.setCreatedAt(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].CreatedAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].UpdatedAt"));
			resultItem.setLastActivityAt(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].LastActivityAt"));
			resultItem.setId(_ctx.longValue("ListGroupRepositoriesResponse.Result["+ i +"].Id"));
			resultItem.setCreatorId(_ctx.longValue("ListGroupRepositoriesResponse.Result["+ i +"].CreatorId"));
			resultItem.setName(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].Name"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].NameWithNamespace"));
			resultItem.setPath(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].Path"));
			resultItem.setPathWithNamespace(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].PathWithNamespace"));
			resultItem.setNamespaceId(_ctx.longValue("ListGroupRepositoriesResponse.Result["+ i +"].NamespaceId"));
			resultItem.setHttpCloneUrl(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].HttpCloneUrl"));
			resultItem.setSshCloneUrl(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].SshCloneUrl"));
			resultItem.setVisibilityLevel(_ctx.integerValue("ListGroupRepositoriesResponse.Result["+ i +"].VisibilityLevel"));
			resultItem.setWebUrl(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].WebUrl"));
			resultItem.setImportStatus(_ctx.stringValue("ListGroupRepositoriesResponse.Result["+ i +"].ImportStatus"));

			result.add(resultItem);
		}
		listGroupRepositoriesResponse.setResult(result);
	 
	 	return listGroupRepositoriesResponse;
	}
}