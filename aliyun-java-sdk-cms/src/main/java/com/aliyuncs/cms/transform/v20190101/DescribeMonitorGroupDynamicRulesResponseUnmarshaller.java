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

import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupDynamicRulesResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupDynamicRulesResponse.ResourceItem;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupDynamicRulesResponse.ResourceItem.Filter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupDynamicRulesResponseUnmarshaller {

	public static DescribeMonitorGroupDynamicRulesResponse unmarshall(DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRulesResponse, UnmarshallerContext _ctx) {
		
		describeMonitorGroupDynamicRulesResponse.setRequestId(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.RequestId"));
		describeMonitorGroupDynamicRulesResponse.setSuccess(_ctx.booleanValue("DescribeMonitorGroupDynamicRulesResponse.Success"));
		describeMonitorGroupDynamicRulesResponse.setCode(_ctx.integerValue("DescribeMonitorGroupDynamicRulesResponse.Code"));
		describeMonitorGroupDynamicRulesResponse.setMessage(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.Message"));

		List<ResourceItem> resource = new ArrayList<ResourceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitorGroupDynamicRulesResponse.Resource.Length"); i++) {
			ResourceItem resourceItem = new ResourceItem();
			resourceItem.setGroupId(_ctx.longValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].GroupId"));
			resourceItem.setCategory(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].Category"));
			resourceItem.setFilterRelation(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].FilterRelation"));

			List<Filter> filters = new ArrayList<Filter>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].Filters.Length"); j++) {
				Filter filter = new Filter();
				filter.setFunction(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].Filters["+ j +"].Function"));
				filter.setName(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].Filters["+ j +"].Name"));
				filter.setValue(_ctx.stringValue("DescribeMonitorGroupDynamicRulesResponse.Resource["+ i +"].Filters["+ j +"].Value"));

				filters.add(filter);
			}
			resourceItem.setFilters(filters);

			resource.add(resourceItem);
		}
		describeMonitorGroupDynamicRulesResponse.setResource(resource);
	 
	 	return describeMonitorGroupDynamicRulesResponse;
	}
}