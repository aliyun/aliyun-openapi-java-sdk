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

import com.aliyuncs.resourcecenter.model.v20221201.SearchResourcesResponse;
import com.aliyuncs.resourcecenter.model.v20221201.SearchResourcesResponse.Filter;
import com.aliyuncs.resourcecenter.model.v20221201.SearchResourcesResponse.Resource;
import com.aliyuncs.resourcecenter.model.v20221201.SearchResourcesResponse.Resource.IpAddressAttribute;
import com.aliyuncs.resourcecenter.model.v20221201.SearchResourcesResponse.Resource.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchResourcesResponseUnmarshaller {

	public static SearchResourcesResponse unmarshall(SearchResourcesResponse searchResourcesResponse, UnmarshallerContext _ctx) {
		
		searchResourcesResponse.setRequestId(_ctx.stringValue("SearchResourcesResponse.RequestId"));
		searchResourcesResponse.setMaxResults(_ctx.integerValue("SearchResourcesResponse.MaxResults"));
		searchResourcesResponse.setNextToken(_ctx.stringValue("SearchResourcesResponse.NextToken"));

		List<Filter> filters = new ArrayList<Filter>();
		for (int i = 0; i < _ctx.lengthValue("SearchResourcesResponse.Filters.Length"); i++) {
			Filter filter = new Filter();
			filter.setKey(_ctx.stringValue("SearchResourcesResponse.Filters["+ i +"].Key"));
			filter.setMatchType(_ctx.stringValue("SearchResourcesResponse.Filters["+ i +"].MatchType"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchResourcesResponse.Filters["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("SearchResourcesResponse.Filters["+ i +"].Values["+ j +"]"));
			}
			filter.setValues(values);

			filters.add(filter);
		}
		searchResourcesResponse.setFilters(filters);

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("SearchResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setAccountId(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].AccountId"));
			resource.setCreateTime(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setExpireTime(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].ExpireTime"));
			resource.setRegionId(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].RegionId"));
			resource.setResourceGroupId(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].ResourceGroupId"));
			resource.setResourceId(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setResourceName(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].ResourceName"));
			resource.setResourceType(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setZoneId(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].ZoneId"));

			List<String> ipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchResourcesResponse.Resources["+ i +"].IpAddresses.Length"); j++) {
				ipAddresses.add(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].IpAddresses["+ j +"]"));
			}
			resource.setIpAddresses(ipAddresses);

			List<IpAddressAttribute> ipAddressAttributes = new ArrayList<IpAddressAttribute>();
			for (int j = 0; j < _ctx.lengthValue("SearchResourcesResponse.Resources["+ i +"].IpAddressAttributes.Length"); j++) {
				IpAddressAttribute ipAddressAttribute = new IpAddressAttribute();
				ipAddressAttribute.setIpAddress(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].IpAddressAttributes["+ j +"].IpAddress"));
				ipAddressAttribute.setNetworkType(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].IpAddressAttributes["+ j +"].NetworkType"));
				ipAddressAttribute.setVersion(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].IpAddressAttributes["+ j +"].Version"));

				ipAddressAttributes.add(ipAddressAttribute);
			}
			resource.setIpAddressAttributes(ipAddressAttributes);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("SearchResourcesResponse.Resources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("SearchResourcesResponse.Resources["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			resource.setTags(tags);

			resources.add(resource);
		}
		searchResourcesResponse.setResources(resources);
	 
	 	return searchResourcesResponse;
	}
}