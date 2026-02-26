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

import com.aliyuncs.devops.model.v20210625.ListOrganizationsResponse;
import com.aliyuncs.devops.model.v20210625.ListOrganizationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationsResponseUnmarshaller {

	public static ListOrganizationsResponse unmarshall(ListOrganizationsResponse listOrganizationsResponse, UnmarshallerContext _ctx) {
		
		listOrganizationsResponse.setRequestId(_ctx.stringValue("ListOrganizationsResponse.requestId"));
		listOrganizationsResponse.setErrorCode(_ctx.stringValue("ListOrganizationsResponse.errorCode"));
		listOrganizationsResponse.setErrorMessage(_ctx.stringValue("ListOrganizationsResponse.errorMessage"));
		listOrganizationsResponse.setTotal(_ctx.longValue("ListOrganizationsResponse.total"));
		listOrganizationsResponse.setSuccess(_ctx.booleanValue("ListOrganizationsResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListOrganizationsResponse.result["+ i +"].id"));
			resultItem.setAccessLevel(_ctx.integerValue("ListOrganizationsResponse.result["+ i +"].accessLevel"));
			resultItem.setOrganizationId(_ctx.stringValue("ListOrganizationsResponse.result["+ i +"].organizationId"));
			resultItem.setOrganizationName(_ctx.stringValue("ListOrganizationsResponse.result["+ i +"].organizationName"));
			resultItem.setOrganizationRole(_ctx.stringValue("ListOrganizationsResponse.result["+ i +"].organizationRole"));
			resultItem.setOrganizationAlias(_ctx.stringValue("ListOrganizationsResponse.result["+ i +"].organizationAlias"));
			resultItem.setNamespaceId(_ctx.stringValue("ListOrganizationsResponse.result["+ i +"].namespaceId"));

			result.add(resultItem);
		}
		listOrganizationsResponse.setResult(result);
	 
	 	return listOrganizationsResponse;
	}
}