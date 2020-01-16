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
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupsResponse.Resource.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupsResponseUnmarshaller {

	public static DescribeMonitorGroupsResponse unmarshall(DescribeMonitorGroupsResponse describeMonitorGroupsResponse, UnmarshallerContext _ctx) {
		
		describeMonitorGroupsResponse.setRequestId(_ctx.stringValue("DescribeMonitorGroupsResponse.RequestId"));
		describeMonitorGroupsResponse.setSuccess(_ctx.booleanValue("DescribeMonitorGroupsResponse.Success"));
		describeMonitorGroupsResponse.setCode(_ctx.integerValue("DescribeMonitorGroupsResponse.Code"));
		describeMonitorGroupsResponse.setMessage(_ctx.stringValue("DescribeMonitorGroupsResponse.Message"));
		describeMonitorGroupsResponse.setPageNumber(_ctx.integerValue("DescribeMonitorGroupsResponse.PageNumber"));
		describeMonitorGroupsResponse.setPageSize(_ctx.integerValue("DescribeMonitorGroupsResponse.PageSize"));
		describeMonitorGroupsResponse.setTotal(_ctx.integerValue("DescribeMonitorGroupsResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitorGroupsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setGroupId(_ctx.longValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GroupId"));
			resource.setGroupName(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GroupName"));
			resource.setServiceId(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].ServiceId"));
			resource.setType(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].Type"));
			resource.setGmtModified(_ctx.longValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GmtModified"));
			resource.setGmtCreate(_ctx.longValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GmtCreate"));
			resource.setBindUrl(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].BindUrl"));
			resource.setDynamicTagRuleId(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].DynamicTagRuleId"));
			resource.setGroupFounderTagKey(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GroupFounderTagKey"));
			resource.setGroupFounderTagValue(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].GroupFounderTagValue"));

			List<String> templateIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMonitorGroupsResponse.Resources["+ i +"].TemplateIds.Length"); j++) {
				templateIds.add(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].TemplateIds["+ j +"]"));
			}
			resource.setTemplateIds(templateIds);

			List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMonitorGroupsResponse.Resources["+ i +"].ContactGroups.Length"); j++) {
				ContactGroup contactGroup = new ContactGroup();
				contactGroup.setName(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].ContactGroups["+ j +"].Name"));

				contactGroups.add(contactGroup);
			}
			resource.setContactGroups(contactGroups);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMonitorGroupsResponse.Resources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeMonitorGroupsResponse.Resources["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			resource.setTags(tags);

			resources.add(resource);
		}
		describeMonitorGroupsResponse.setResources(resources);
	 
	 	return describeMonitorGroupsResponse;
	}
}