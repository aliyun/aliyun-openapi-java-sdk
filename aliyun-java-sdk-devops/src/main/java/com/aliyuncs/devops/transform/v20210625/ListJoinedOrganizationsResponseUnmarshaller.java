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

import com.aliyuncs.devops.model.v20210625.ListJoinedOrganizationsResponse;
import com.aliyuncs.devops.model.v20210625.ListJoinedOrganizationsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJoinedOrganizationsResponseUnmarshaller {

	public static ListJoinedOrganizationsResponse unmarshall(ListJoinedOrganizationsResponse listJoinedOrganizationsResponse, UnmarshallerContext _ctx) {
		
		listJoinedOrganizationsResponse.setRequestId(_ctx.stringValue("ListJoinedOrganizationsResponse.requestId"));
		listJoinedOrganizationsResponse.setSuccess(_ctx.booleanValue("ListJoinedOrganizationsResponse.success"));
		listJoinedOrganizationsResponse.setErrorCode(_ctx.stringValue("ListJoinedOrganizationsResponse.errorCode"));
		listJoinedOrganizationsResponse.setErrorMessage(_ctx.stringValue("ListJoinedOrganizationsResponse.errorMessage"));

		List<Result> organizations = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListJoinedOrganizationsResponse.organizations.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.stringValue("ListJoinedOrganizationsResponse.organizations["+ i +"].id"));
			result.setName(_ctx.stringValue("ListJoinedOrganizationsResponse.organizations["+ i +"].name"));

			organizations.add(result);
		}
		listJoinedOrganizationsResponse.setOrganizations(organizations);
	 
	 	return listJoinedOrganizationsResponse;
	}
}