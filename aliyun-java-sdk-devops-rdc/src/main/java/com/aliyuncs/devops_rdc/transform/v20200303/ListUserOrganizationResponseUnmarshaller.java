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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListUserOrganizationResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListUserOrganizationResponse.Organization;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserOrganizationResponseUnmarshaller {

	public static ListUserOrganizationResponse unmarshall(ListUserOrganizationResponse listUserOrganizationResponse, UnmarshallerContext _ctx) {
		
		listUserOrganizationResponse.setRequestId(_ctx.stringValue("ListUserOrganizationResponse.RequestId"));
		listUserOrganizationResponse.setSuccess(_ctx.booleanValue("ListUserOrganizationResponse.Success"));
		listUserOrganizationResponse.setErrorCode(_ctx.stringValue("ListUserOrganizationResponse.ErrorCode"));
		listUserOrganizationResponse.setErrorMessage(_ctx.stringValue("ListUserOrganizationResponse.ErrorMessage"));

		List<Organization> object = new ArrayList<Organization>();
		for (int i = 0; i < _ctx.lengthValue("ListUserOrganizationResponse.Object.Length"); i++) {
			Organization organization = new Organization();
			organization.setName(_ctx.stringValue("ListUserOrganizationResponse.Object["+ i +"].Name"));
			organization.setId(_ctx.stringValue("ListUserOrganizationResponse.Object["+ i +"].Id"));

			object.add(organization);
		}
		listUserOrganizationResponse.setObject(object);
	 
	 	return listUserOrganizationResponse;
	}
}