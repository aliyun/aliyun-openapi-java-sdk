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

import com.aliyuncs.cms.model.v20180308.ListMyGroupsResponse;
import com.aliyuncs.cms.model.v20180308.ListMyGroupsResponse.Resource;
import com.aliyuncs.cms.model.v20180308.ListMyGroupsResponse.Resource.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMyGroupsResponseUnmarshaller {

	public static ListMyGroupsResponse unmarshall(ListMyGroupsResponse listMyGroupsResponse, UnmarshallerContext context) {
		
		listMyGroupsResponse.setRequestId(context.stringValue("ListMyGroupsResponse.RequestId"));
		listMyGroupsResponse.setSuccess(context.booleanValue("ListMyGroupsResponse.Success"));
		listMyGroupsResponse.setErrorCode(context.integerValue("ListMyGroupsResponse.ErrorCode"));
		listMyGroupsResponse.setErrorMessage(context.stringValue("ListMyGroupsResponse.ErrorMessage"));
		listMyGroupsResponse.setPageNumber(context.integerValue("ListMyGroupsResponse.PageNumber"));
		listMyGroupsResponse.setPageSize(context.integerValue("ListMyGroupsResponse.PageSize"));
		listMyGroupsResponse.setTotal(context.integerValue("ListMyGroupsResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("ListMyGroupsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setGroupId(context.longValue("ListMyGroupsResponse.Resources["+ i +"].GroupId"));
			resource.setGroupName(context.stringValue("ListMyGroupsResponse.Resources["+ i +"].GroupName"));
			resource.setServiceId(context.stringValue("ListMyGroupsResponse.Resources["+ i +"].ServiceId"));
			resource.setBindUrls(context.stringValue("ListMyGroupsResponse.Resources["+ i +"].BindUrls"));
			resource.setType(context.stringValue("ListMyGroupsResponse.Resources["+ i +"].Type"));
			resource.setGmtModified(context.longValue("ListMyGroupsResponse.Resources["+ i +"].GmtModified"));
			resource.setGmtCreate(context.longValue("ListMyGroupsResponse.Resources["+ i +"].GmtCreate"));

			List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
			for (int j = 0; j < context.lengthValue("ListMyGroupsResponse.Resources["+ i +"].ContactGroups.Length"); j++) {
				ContactGroup contactGroup = new ContactGroup();
				contactGroup.setName(context.stringValue("ListMyGroupsResponse.Resources["+ i +"].ContactGroups["+ j +"].Name"));

				contactGroups.add(contactGroup);
			}
			resource.setContactGroups(contactGroups);

			resources.add(resource);
		}
		listMyGroupsResponse.setResources(resources);
	 
	 	return listMyGroupsResponse;
	}
}