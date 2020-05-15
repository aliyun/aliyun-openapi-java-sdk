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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeResourcePackagesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeResourcePackagesResponse.ResourcePackage;
import com.aliyuncs.hbr.model.v20170908.DescribeResourcePackagesResponse.ResourcePackage.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcePackagesResponseUnmarshaller {

	public static DescribeResourcePackagesResponse unmarshall(DescribeResourcePackagesResponse describeResourcePackagesResponse, UnmarshallerContext _ctx) {
		
		describeResourcePackagesResponse.setRequestId(_ctx.stringValue("DescribeResourcePackagesResponse.RequestId"));
		describeResourcePackagesResponse.setSuccess(_ctx.booleanValue("DescribeResourcePackagesResponse.Success"));
		describeResourcePackagesResponse.setCode(_ctx.stringValue("DescribeResourcePackagesResponse.Code"));
		describeResourcePackagesResponse.setMessage(_ctx.stringValue("DescribeResourcePackagesResponse.Message"));
		describeResourcePackagesResponse.setTotalCount(_ctx.integerValue("DescribeResourcePackagesResponse.TotalCount"));
		describeResourcePackagesResponse.setPageSize(_ctx.integerValue("DescribeResourcePackagesResponse.PageSize"));
		describeResourcePackagesResponse.setPageNumber(_ctx.integerValue("DescribeResourcePackagesResponse.PageNumber"));

		List<ResourcePackage> resourcePackages = new ArrayList<ResourcePackage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourcePackagesResponse.ResourcePackages.Length"); i++) {
			ResourcePackage resourcePackage = new ResourcePackage();
			resourcePackage.setId(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Id"));
			resourcePackage.setUid(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Uid"));
			resourcePackage.setResourceType(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].ResourceType"));
			resourcePackage.setStartTime(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].StartTime"));
			resourcePackage.setEndTime(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].EndTime"));
			resourcePackage.setInitCapacity(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].InitCapacity"));
			resourcePackage.setCurrCapacity(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].CurrCapacity"));
			resourcePackage.setInstanceName(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].InstanceName"));
			resourcePackage.setStatus(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Status"));

			Template template = new Template();
			template.setDisplayName(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Template.DisplayName"));
			template.setUpgrade(_ctx.booleanValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Template.Upgrade"));
			template.setRenew(_ctx.booleanValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Template.Renew"));
			template.setTemplateType(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackages["+ i +"].Template.TemplateType"));
			resourcePackage.setTemplate(template);

			resourcePackages.add(resourcePackage);
		}
		describeResourcePackagesResponse.setResourcePackages(resourcePackages);
	 
	 	return describeResourcePackagesResponse;
	}
}