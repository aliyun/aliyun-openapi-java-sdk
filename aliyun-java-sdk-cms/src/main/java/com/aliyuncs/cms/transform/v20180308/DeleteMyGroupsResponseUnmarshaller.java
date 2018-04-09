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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.DeleteMyGroupsResponse;
import com.aliyuncs.cms.model.v20180308.DeleteMyGroupsResponse.Group;
import com.aliyuncs.cms.model.v20180308.DeleteMyGroupsResponse.Group.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMyGroupsResponseUnmarshaller {

	public static DeleteMyGroupsResponse unmarshall(DeleteMyGroupsResponse deleteMyGroupsResponse, UnmarshallerContext context) {
		
		deleteMyGroupsResponse.setRequestId(context.stringValue("DeleteMyGroupsResponse.RequestId"));
		deleteMyGroupsResponse.setSuccess(context.booleanValue("DeleteMyGroupsResponse.Success"));
		deleteMyGroupsResponse.setErrorCode(context.integerValue("DeleteMyGroupsResponse.ErrorCode"));
		deleteMyGroupsResponse.setErrorMessage(context.stringValue("DeleteMyGroupsResponse.ErrorMessage"));

		Group group = new Group();
		group.setGroupId(context.longValue("DeleteMyGroupsResponse.Group.GroupId"));
		group.setGroupName(context.stringValue("DeleteMyGroupsResponse.Group.GroupName"));
		group.setServiceId(context.stringValue("DeleteMyGroupsResponse.Group.ServiceId"));
		group.setBindUrls(context.stringValue("DeleteMyGroupsResponse.Group.BindUrls"));
		group.setType(context.stringValue("DeleteMyGroupsResponse.Group.Type"));

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < context.lengthValue("DeleteMyGroupsResponse.Group.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setName(context.stringValue("DeleteMyGroupsResponse.Group.ContactGroups["+ i +"].Name"));

			contactGroups.add(contactGroup);
		}
		group.setContactGroups(contactGroups);
		deleteMyGroupsResponse.setGroup(group);
	 
	 	return deleteMyGroupsResponse;
	}
}