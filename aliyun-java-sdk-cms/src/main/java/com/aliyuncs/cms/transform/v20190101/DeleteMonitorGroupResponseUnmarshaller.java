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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DeleteMonitorGroupResponse;
import com.aliyuncs.cms.model.v20190101.DeleteMonitorGroupResponse.Group;
import com.aliyuncs.cms.model.v20190101.DeleteMonitorGroupResponse.Group.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMonitorGroupResponseUnmarshaller {

	public static DeleteMonitorGroupResponse unmarshall(DeleteMonitorGroupResponse deleteMonitorGroupResponse, UnmarshallerContext context) {
		
		deleteMonitorGroupResponse.setRequestId(context.stringValue("DeleteMonitorGroupResponse.RequestId"));
		deleteMonitorGroupResponse.setSuccess(context.booleanValue("DeleteMonitorGroupResponse.Success"));
		deleteMonitorGroupResponse.setCode(context.integerValue("DeleteMonitorGroupResponse.Code"));
		deleteMonitorGroupResponse.setMessage(context.stringValue("DeleteMonitorGroupResponse.Message"));

		Group group = new Group();
		group.setGroupName(context.stringValue("DeleteMonitorGroupResponse.Group.GroupName"));

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < context.lengthValue("DeleteMonitorGroupResponse.Group.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setName(context.stringValue("DeleteMonitorGroupResponse.Group.ContactGroups["+ i +"].Name"));

			contactGroups.add(contactGroup);
		}
		group.setContactGroups(contactGroups);
		deleteMonitorGroupResponse.setGroup(group);
	 
	 	return deleteMonitorGroupResponse;
	}
}