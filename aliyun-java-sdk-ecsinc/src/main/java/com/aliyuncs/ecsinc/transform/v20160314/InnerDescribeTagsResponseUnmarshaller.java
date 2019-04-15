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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeTagsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeTagsResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeTagsResponseUnmarshaller {

	public static InnerDescribeTagsResponse unmarshall(InnerDescribeTagsResponse innerDescribeTagsResponse, UnmarshallerContext context) {
		
		innerDescribeTagsResponse.setRequestId(context.stringValue("InnerDescribeTagsResponse.RequestId"));
		innerDescribeTagsResponse.setPageSize(context.integerValue("InnerDescribeTagsResponse.PageSize"));
		innerDescribeTagsResponse.setPageNumber(context.integerValue("InnerDescribeTagsResponse.PageNumber"));
		innerDescribeTagsResponse.setTotalCount(context.integerValue("InnerDescribeTagsResponse.TotalCount"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("InnerDescribeTagsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceType(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].ResourceType"));
			resource.setRegionId(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].RegionId"));
			resource.setResourceId(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].ResourceId"));
			resource.setAliUid(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].AliUid"));
			resource.setTagKey(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].TagKey"));
			resource.setTagValue(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].TagValue"));
			resource.setTagCategory(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].TagCategory"));
			resource.setCreateBy(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].CreateBy"));
			resource.setScope(context.stringValue("InnerDescribeTagsResponse.Resources["+ i +"].Scope"));

			resources.add(resource);
		}
		innerDescribeTagsResponse.setResources(resources);
	 
	 	return innerDescribeTagsResponse;
	}
}