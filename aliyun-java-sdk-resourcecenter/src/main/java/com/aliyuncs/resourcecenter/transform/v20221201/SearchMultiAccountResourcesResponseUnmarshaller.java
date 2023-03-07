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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.SearchMultiAccountResourcesResponse;
import com.aliyuncs.resourcecenter.model.v20221201.SearchMultiAccountResourcesResponse.Filter;
import com.aliyuncs.resourcecenter.model.v20221201.SearchMultiAccountResourcesResponse.Resource;
import com.aliyuncs.resourcecenter.model.v20221201.SearchMultiAccountResourcesResponse.Resource.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMultiAccountResourcesResponseUnmarshaller {

	public static SearchMultiAccountResourcesResponse unmarshall(SearchMultiAccountResourcesResponse searchMultiAccountResourcesResponse, UnmarshallerContext _ctx) {
		
		searchMultiAccountResourcesResponse.setRequestId(_ctx.stringValue("SearchMultiAccountResourcesResponse.RequestId"));
		searchMultiAccountResourcesResponse.setNextToken(_ctx.stringValue("SearchMultiAccountResourcesResponse.NextToken"));
		searchMultiAccountResourcesResponse.setScope(_ctx.stringValue("SearchMultiAccountResourcesResponse.Scope"));
		searchMultiAccountResourcesResponse.setMaxResults(_ctx.integerValue("SearchMultiAccountResourcesResponse.MaxResults"));

		List<Filter> filters = new ArrayList<Filter>();
		for (int i = 0; i < _ctx.lengthValue("SearchMultiAccountResourcesResponse.Filters.Length"); i++) {
			Filter filter = new Filter();
			filter.setKey(_ctx.stringValue("SearchMultiAccountResourcesResponse.Filters["+ i +"].Key"));
			filter.setMatchType(_ctx.stringValue("SearchMultiAccountResourcesResponse.Filters["+ i +"].MatchType"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMultiAccountResourcesResponse.Filters["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("SearchMultiAccountResourcesResponse.Filters["+ i +"].Values["+ j +"]"));
			}
			filter.setValues(values);

			filters.add(filter);
		}
		searchMultiAccountResourcesResponse.setFilters(filters);

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("SearchMultiAccountResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceType(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setCreateTime(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setResourceGroupId(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].ResourceGroupId"));
			resource.setZoneId(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].ZoneId"));
			resource.setAccountId(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].AccountId"));
			resource.setResourceId(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setResourceName(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].ResourceName"));
			resource.setRegionId(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].RegionId"));

			List<String> ipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].IpAddresses.Length"); j++) {
				ipAddresses.add(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].IpAddresses["+ j +"]"));
			}
			resource.setIpAddresses(ipAddresses);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("SearchMultiAccountResourcesResponse.Resources["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			resource.setTags(tags);

			resources.add(resource);
		}
		searchMultiAccountResourcesResponse.setResources(resources);
	 
	 	return searchMultiAccountResourcesResponse;
	}
}