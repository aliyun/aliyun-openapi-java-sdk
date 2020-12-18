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

import com.aliyuncs.codeup.model.v20200414.ListOrganizationsResponse;
import com.aliyuncs.codeup.model.v20200414.ListOrganizationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationsResponseUnmarshaller {

	public static ListOrganizationsResponse unmarshall(ListOrganizationsResponse listOrganizationsResponse, UnmarshallerContext _ctx) {
		
		listOrganizationsResponse.setRequestId(_ctx.stringValue("ListOrganizationsResponse.RequestId"));
		listOrganizationsResponse.setErrorCode(_ctx.stringValue("ListOrganizationsResponse.ErrorCode"));
		listOrganizationsResponse.setSuccess(_ctx.booleanValue("ListOrganizationsResponse.Success"));
		listOrganizationsResponse.setErrorMessage(_ctx.stringValue("ListOrganizationsResponse.ErrorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOrganizationId(_ctx.stringValue("ListOrganizationsResponse.Result["+ i +"].OrganizationId"));
			resultItem.setOrganizationName(_ctx.stringValue("ListOrganizationsResponse.Result["+ i +"].OrganizationName"));
			resultItem.setOrganizationRole(_ctx.stringValue("ListOrganizationsResponse.Result["+ i +"].OrganizationRole"));
			resultItem.setAccessLevel(_ctx.integerValue("ListOrganizationsResponse.Result["+ i +"].AccessLevel"));

			result.add(resultItem);
		}
		listOrganizationsResponse.setResult(result);
	 
	 	return listOrganizationsResponse;
	}
}