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

import com.aliyuncs.cms.model.v20180308.GetMyGroupsResponse;
import com.aliyuncs.cms.model.v20180308.GetMyGroupsResponse.Group;
import com.aliyuncs.cms.model.v20180308.GetMyGroupsResponse.Group.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMyGroupsResponseUnmarshaller {

	public static GetMyGroupsResponse unmarshall(GetMyGroupsResponse getMyGroupsResponse, UnmarshallerContext context) {
		
		getMyGroupsResponse.setRequestId(context.stringValue("GetMyGroupsResponse.RequestId"));
		getMyGroupsResponse.setSuccess(context.booleanValue("GetMyGroupsResponse.Success"));
		getMyGroupsResponse.setErrorCode(context.integerValue("GetMyGroupsResponse.ErrorCode"));
		getMyGroupsResponse.setErrorMessage(context.stringValue("GetMyGroupsResponse.ErrorMessage"));

		Group group = new Group();
		group.setGroupId(context.longValue("GetMyGroupsResponse.Group.GroupId"));
		group.setGroupName(context.stringValue("GetMyGroupsResponse.Group.GroupName"));
		group.setServiceId(context.longValue("GetMyGroupsResponse.Group.ServiceId"));
		group.setBindUrl(context.stringValue("GetMyGroupsResponse.Group.BindUrl"));
		group.setType(context.stringValue("GetMyGroupsResponse.Group.Type"));

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < context.lengthValue("GetMyGroupsResponse.Group.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setName(context.stringValue("GetMyGroupsResponse.Group.ContactGroups["+ i +"].Name"));

			contactGroups.add(contactGroup);
		}
		group.setContactGroups(contactGroups);
		getMyGroupsResponse.setGroup(group);
	 
	 	return getMyGroupsResponse;
	}
}