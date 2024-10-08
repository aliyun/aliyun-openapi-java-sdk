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

import com.aliyuncs.resourcecenter.model.v20221201.ListFiltersResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListFiltersResponse.Filter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFiltersResponseUnmarshaller {

	public static ListFiltersResponse unmarshall(ListFiltersResponse listFiltersResponse, UnmarshallerContext _ctx) {
		
		listFiltersResponse.setRequestId(_ctx.stringValue("ListFiltersResponse.RequestId"));
		listFiltersResponse.setDefaultFilterName(_ctx.stringValue("ListFiltersResponse.DefaultFilterName"));

		List<Filter> filters = new ArrayList<Filter>();
		for (int i = 0; i < _ctx.lengthValue("ListFiltersResponse.Filters.Length"); i++) {
			Filter filter = new Filter();
			filter.setFilterName(_ctx.stringValue("ListFiltersResponse.Filters["+ i +"].FilterName"));
			filter.setFilterConfiguration(_ctx.stringValue("ListFiltersResponse.Filters["+ i +"].FilterConfiguration"));

			filters.add(filter);
		}
		listFiltersResponse.setFilters(filters);
	 
	 	return listFiltersResponse;
	}
}