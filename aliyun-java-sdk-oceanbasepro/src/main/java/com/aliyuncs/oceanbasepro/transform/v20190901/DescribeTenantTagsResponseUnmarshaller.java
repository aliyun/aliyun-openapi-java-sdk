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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantTagsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantTagsResponse.TagResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantTagsResponseUnmarshaller {

	public static DescribeTenantTagsResponse unmarshall(DescribeTenantTagsResponse describeTenantTagsResponse, UnmarshallerContext _ctx) {
		
		describeTenantTagsResponse.setRequestId(_ctx.stringValue("DescribeTenantTagsResponse.RequestId"));

		List<TagResourcesItem> tagResources = new ArrayList<TagResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantTagsResponse.TagResources.Length"); i++) {
			TagResourcesItem tagResourcesItem = new TagResourcesItem();
			tagResourcesItem.setResourceId(_ctx.stringValue("DescribeTenantTagsResponse.TagResources["+ i +"].ResourceId"));
			tagResourcesItem.setResourceType(_ctx.stringValue("DescribeTenantTagsResponse.TagResources["+ i +"].ResourceType"));
			tagResourcesItem.setTag(_ctx.stringValue("DescribeTenantTagsResponse.TagResources["+ i +"].Tag"));

			tagResources.add(tagResourcesItem);
		}
		describeTenantTagsResponse.setTagResources(tagResources);
	 
	 	return describeTenantTagsResponse;
	}
}