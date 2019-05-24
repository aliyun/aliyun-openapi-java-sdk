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

import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupsResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupsResponse.Resource;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupsResponse.Resource.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupsResponseUnmarshaller {

	public static DescribeMonitorGroupsResponse unmarshall(DescribeMonitorGroupsResponse describeMonitorGroupsResponse, UnmarshallerContext context) {
		
		describeMonitorGroupsResponse.setRequestId(context.stringValue("DescribeMonitorGroupsResponse.RequestId"));
		describeMonitorGroupsResponse.setSuccess(context.booleanValue("DescribeMonitorGroupsResponse.Success"));
		describeMonitorGroupsResponse.setCode(context.integerValue("DescribeMonitorGroupsResponse.Code"));
		describeMonitorGroupsResponse.setMessage(context.stringValue("DescribeMonitorGroupsResponse.Message"));
		describeMonitorGroupsResponse.setPageNumber(context.integerValue("DescribeMonitorGroupsResponse.PageNumber"));
		describeMonitorGroupsResponse.setPageSize(context.integerValue("DescribeMonitorGroupsResponse.PageSize"));
		describeMonitorGroupsResponse.setTotal(context.integerValue("DescribeMonitorGroupsResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorGroupsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setGroupId(context.longValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GroupId"));
			resource.setGroupName(context.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GroupName"));
			resource.setServiceId(context.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].ServiceId"));
			resource.setType(context.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].Type"));
			resource.setGmtModified(context.longValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GmtModified"));
			resource.setGmtCreate(context.longValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GmtCreate"));
			resource.setBindUrl(context.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].BindUrl"));

			List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
			for (int j = 0; j < context.lengthValue("DescribeMonitorGroupsResponse.Resources["+ i +"].ContactGroups.Length"); j++) {
				ContactGroup contactGroup = new ContactGroup();
				contactGroup.setName(context.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].ContactGroups["+ j +"].Name"));

				contactGroups.add(contactGroup);
			}
			resource.setContactGroups(contactGroups);

			resources.add(resource);
		}
		describeMonitorGroupsResponse.setResources(resources);
	 
	 	return describeMonitorGroupsResponse;
	}
}