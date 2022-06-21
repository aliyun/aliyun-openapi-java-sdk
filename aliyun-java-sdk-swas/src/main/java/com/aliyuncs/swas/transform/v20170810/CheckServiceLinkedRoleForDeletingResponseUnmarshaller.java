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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.CheckServiceLinkedRoleForDeletingResponse;
import com.aliyuncs.swas.model.v20170810.CheckServiceLinkedRoleForDeletingResponse.RoleUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckServiceLinkedRoleForDeletingResponseUnmarshaller {

	public static CheckServiceLinkedRoleForDeletingResponse unmarshall(CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeletingResponse, UnmarshallerContext _ctx) {
		
		checkServiceLinkedRoleForDeletingResponse.setCode(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.code"));
		checkServiceLinkedRoleForDeletingResponse.setDeletable(_ctx.booleanValue("CheckServiceLinkedRoleForDeletingResponse.Deletable"));
		checkServiceLinkedRoleForDeletingResponse.setSuccess(_ctx.booleanValue("CheckServiceLinkedRoleForDeletingResponse.success"));
		checkServiceLinkedRoleForDeletingResponse.setMessage(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.message"));
		checkServiceLinkedRoleForDeletingResponse.setRequestId(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.requestId"));

		List<RoleUsage> roleUsages = new ArrayList<RoleUsage>();
		for (int i = 0; i < _ctx.lengthValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages.Length"); i++) {
			RoleUsage roleUsage = new RoleUsage();
			roleUsage.setRegion(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages["+ i +"].Region"));

			List<String> resources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages["+ i +"].Resources.Length"); j++) {
				resources.add(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages["+ i +"].Resources["+ j +"]"));
			}
			roleUsage.setResources(resources);

			roleUsages.add(roleUsage);
		}
		checkServiceLinkedRoleForDeletingResponse.setRoleUsages(roleUsages);
	 
	 	return checkServiceLinkedRoleForDeletingResponse;
	}
}