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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeResourceRecommendFiltersResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceRecommendFiltersResponse.RecommendFilter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceRecommendFiltersResponseUnmarshaller {

	public static DescribeResourceRecommendFiltersResponse unmarshall(DescribeResourceRecommendFiltersResponse describeResourceRecommendFiltersResponse, UnmarshallerContext _ctx) {
		
		describeResourceRecommendFiltersResponse.setRequestId(_ctx.stringValue("DescribeResourceRecommendFiltersResponse.RequestId"));

		List<RecommendFilter> recommendFilters = new ArrayList<RecommendFilter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceRecommendFiltersResponse.RecommendFilters.Length"); i++) {
			RecommendFilter recommendFilter = new RecommendFilter();
			recommendFilter.setResourceType(_ctx.stringValue("DescribeResourceRecommendFiltersResponse.RecommendFilters["+ i +"].ResourceType"));
			recommendFilter.setAttributeName(_ctx.stringValue("DescribeResourceRecommendFiltersResponse.RecommendFilters["+ i +"].AttributeName"));
			recommendFilter.setProduct(_ctx.stringValue("DescribeResourceRecommendFiltersResponse.RecommendFilters["+ i +"].Product"));
			recommendFilter.setAttributeValue(_ctx.stringValue("DescribeResourceRecommendFiltersResponse.RecommendFilters["+ i +"].AttributeValue"));

			recommendFilters.add(recommendFilter);
		}
		describeResourceRecommendFiltersResponse.setRecommendFilters(recommendFilters);
	 
	 	return describeResourceRecommendFiltersResponse;
	}
}