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

import com.aliyuncs.resourcecenter.model.v20221201.GetResourceCountsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetResourceCountsResponse.Filter;
import com.aliyuncs.resourcecenter.model.v20221201.GetResourceCountsResponse.ResourceCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceCountsResponseUnmarshaller {

	public static GetResourceCountsResponse unmarshall(GetResourceCountsResponse getResourceCountsResponse, UnmarshallerContext _ctx) {
		
		getResourceCountsResponse.setRequestId(_ctx.stringValue("GetResourceCountsResponse.RequestId"));
		getResourceCountsResponse.setGroupByKey(_ctx.stringValue("GetResourceCountsResponse.GroupByKey"));

		List<Filter> filters = new ArrayList<Filter>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceCountsResponse.Filters.Length"); i++) {
			Filter filter = new Filter();
			filter.setKey(_ctx.stringValue("GetResourceCountsResponse.Filters["+ i +"].Key"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetResourceCountsResponse.Filters["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("GetResourceCountsResponse.Filters["+ i +"].Values["+ j +"]"));
			}
			filter.setValues(values);

			filters.add(filter);
		}
		getResourceCountsResponse.setFilters(filters);

		List<ResourceCount> resourceCounts = new ArrayList<ResourceCount>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceCountsResponse.ResourceCounts.Length"); i++) {
			ResourceCount resourceCount = new ResourceCount();
			resourceCount.setGroupName(_ctx.stringValue("GetResourceCountsResponse.ResourceCounts["+ i +"].GroupName"));
			resourceCount.setCount(_ctx.longValue("GetResourceCountsResponse.ResourceCounts["+ i +"].Count"));

			resourceCounts.add(resourceCount);
		}
		getResourceCountsResponse.setResourceCounts(resourceCounts);
	 
	 	return getResourceCountsResponse;
	}
}