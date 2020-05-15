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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.GetServiceLinkedRoleDeletionStatusResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetServiceLinkedRoleDeletionStatusResponse.Reason;
import com.aliyuncs.resourcemanager.model.v20200331.GetServiceLinkedRoleDeletionStatusResponse.Reason.RoleUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceLinkedRoleDeletionStatusResponseUnmarshaller {

	public static GetServiceLinkedRoleDeletionStatusResponse unmarshall(GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatusResponse, UnmarshallerContext _ctx) {
		
		getServiceLinkedRoleDeletionStatusResponse.setRequestId(_ctx.stringValue("GetServiceLinkedRoleDeletionStatusResponse.RequestId"));
		getServiceLinkedRoleDeletionStatusResponse.setStatus(_ctx.stringValue("GetServiceLinkedRoleDeletionStatusResponse.Status"));

		Reason reason = new Reason();
		reason.setMessage(_ctx.stringValue("GetServiceLinkedRoleDeletionStatusResponse.Reason.Message"));

		List<RoleUsage> roleUsages = new ArrayList<RoleUsage>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceLinkedRoleDeletionStatusResponse.Reason.RoleUsages.Length"); i++) {
			RoleUsage roleUsage = new RoleUsage();
			roleUsage.setRegion(_ctx.stringValue("GetServiceLinkedRoleDeletionStatusResponse.Reason.RoleUsages["+ i +"].Region"));

			List<String> resources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceLinkedRoleDeletionStatusResponse.Reason.RoleUsages["+ i +"].Resources.Length"); j++) {
				resources.add(_ctx.stringValue("GetServiceLinkedRoleDeletionStatusResponse.Reason.RoleUsages["+ i +"].Resources["+ j +"]"));
			}
			roleUsage.setResources(resources);

			roleUsages.add(roleUsage);
		}
		reason.setRoleUsages(roleUsages);
		getServiceLinkedRoleDeletionStatusResponse.setReason(reason);
	 
	 	return getServiceLinkedRoleDeletionStatusResponse;
	}
}