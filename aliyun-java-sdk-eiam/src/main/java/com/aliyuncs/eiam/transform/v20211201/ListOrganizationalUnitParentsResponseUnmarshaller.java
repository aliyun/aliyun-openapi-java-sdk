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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListOrganizationalUnitParentsResponse;
import com.aliyuncs.eiam.model.v20211201.ListOrganizationalUnitParentsResponse.Parent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationalUnitParentsResponseUnmarshaller {

	public static ListOrganizationalUnitParentsResponse unmarshall(ListOrganizationalUnitParentsResponse listOrganizationalUnitParentsResponse, UnmarshallerContext _ctx) {
		
		listOrganizationalUnitParentsResponse.setRequestId(_ctx.stringValue("ListOrganizationalUnitParentsResponse.RequestId"));

		List<Parent> parents = new ArrayList<Parent>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationalUnitParentsResponse.Parents.Length"); i++) {
			Parent parent = new Parent();
			parent.setOrganizationalUnitId(_ctx.stringValue("ListOrganizationalUnitParentsResponse.Parents["+ i +"].OrganizationalUnitId"));
			parent.setParentId(_ctx.stringValue("ListOrganizationalUnitParentsResponse.Parents["+ i +"].ParentId"));

			parents.add(parent);
		}
		listOrganizationalUnitParentsResponse.setParents(parents);
	 
	 	return listOrganizationalUnitParentsResponse;
	}
}