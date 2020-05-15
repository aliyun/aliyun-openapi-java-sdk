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

package com.aliyuncs.paistudio.transform.v20200428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20200428.CheckServiceLinkedRoleForDeletingResponse;
import com.aliyuncs.paistudio.model.v20200428.CheckServiceLinkedRoleForDeletingResponse.RoleUsagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckServiceLinkedRoleForDeletingResponseUnmarshaller {

	public static CheckServiceLinkedRoleForDeletingResponse unmarshall(CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeletingResponse, UnmarshallerContext _ctx) {
		
		checkServiceLinkedRoleForDeletingResponse.setRequestId(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.RequestId"));
		checkServiceLinkedRoleForDeletingResponse.setDeletable(_ctx.booleanValue("CheckServiceLinkedRoleForDeletingResponse.Deletable"));

		List<RoleUsagesItem> roleUsages = new ArrayList<RoleUsagesItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages.Length"); i++) {
			RoleUsagesItem roleUsagesItem = new RoleUsagesItem();
			roleUsagesItem.setRegion(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages["+ i +"].Region"));

			List<String> resources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages["+ i +"].Resources.Length"); j++) {
				resources.add(_ctx.stringValue("CheckServiceLinkedRoleForDeletingResponse.RoleUsages["+ i +"].Resources["+ j +"]"));
			}
			roleUsagesItem.setResources(resources);

			roleUsages.add(roleUsagesItem);
		}
		checkServiceLinkedRoleForDeletingResponse.setRoleUsages(roleUsages);
	 
	 	return checkServiceLinkedRoleForDeletingResponse;
	}
}