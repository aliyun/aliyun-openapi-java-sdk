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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeResourcePackagesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeResourcePackagesResponse.ResourcePackageListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeResourcePackagesResponse.ResourcePackageListItem.ResourcePackageQuotaListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeResourcePackagesResponse.ResourcePackageListItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcePackagesResponseUnmarshaller {

	public static DescribeResourcePackagesResponse unmarshall(DescribeResourcePackagesResponse describeResourcePackagesResponse, UnmarshallerContext _ctx) {
		
		describeResourcePackagesResponse.setRequestId(_ctx.stringValue("DescribeResourcePackagesResponse.RequestId"));

		List<ResourcePackageListItem> resourcePackageList = new ArrayList<ResourcePackageListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourcePackagesResponse.ResourcePackageList.Length"); i++) {
			ResourcePackageListItem resourcePackageListItem = new ResourcePackageListItem();
			resourcePackageListItem.setResourcePackageId(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ResourcePackageId"));
			resourcePackageListItem.setResourcePackageType(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ResourcePackageType"));
			resourcePackageListItem.setStatus(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].Status"));
			resourcePackageListItem.setUsedCapacity(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].UsedCapacity"));
			resourcePackageListItem.setTotalCapacity(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].TotalCapacity"));
			resourcePackageListItem.setCreateTime(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].CreateTime"));
			resourcePackageListItem.setExpireTime(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ExpireTime"));
			resourcePackageListItem.setAutoQuota(_ctx.booleanValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].AutoQuota"));

			List<ResourcePackageQuotaListItem> resourcePackageQuotaList = new ArrayList<ResourcePackageQuotaListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ResourcePackageQuotaList.Length"); j++) {
				ResourcePackageQuotaListItem resourcePackageQuotaListItem = new ResourcePackageQuotaListItem();
				resourcePackageQuotaListItem.setProjectId(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ResourcePackageQuotaList["+ j +"].ProjectId"));
				resourcePackageQuotaListItem.setUsedCapacity(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ResourcePackageQuotaList["+ j +"].UsedCapacity"));
				resourcePackageQuotaListItem.setAllocatedCapacity(_ctx.longValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].ResourcePackageQuotaList["+ j +"].AllocatedCapacity"));

				resourcePackageQuotaList.add(resourcePackageQuotaListItem);
			}
			resourcePackageListItem.setResourcePackageQuotaList(resourcePackageQuotaList);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeResourcePackagesResponse.ResourcePackageList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			resourcePackageListItem.setTags(tags);

			resourcePackageList.add(resourcePackageListItem);
		}
		describeResourcePackagesResponse.setResourcePackageList(resourcePackageList);
	 
	 	return describeResourcePackagesResponse;
	}
}