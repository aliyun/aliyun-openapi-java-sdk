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

import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupCategoriesResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupCategoriesResponse.MonitorGroupCategories;
import com.aliyuncs.cms.model.v20190101.DescribeMonitorGroupCategoriesResponse.MonitorGroupCategories.CategoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorGroupCategoriesResponseUnmarshaller {

	public static DescribeMonitorGroupCategoriesResponse unmarshall(DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategoriesResponse, UnmarshallerContext _ctx) {
		
		describeMonitorGroupCategoriesResponse.setRequestId(_ctx.stringValue("DescribeMonitorGroupCategoriesResponse.RequestId"));
		describeMonitorGroupCategoriesResponse.setSuccess(_ctx.booleanValue("DescribeMonitorGroupCategoriesResponse.Success"));
		describeMonitorGroupCategoriesResponse.setCode(_ctx.integerValue("DescribeMonitorGroupCategoriesResponse.Code"));
		describeMonitorGroupCategoriesResponse.setMessage(_ctx.stringValue("DescribeMonitorGroupCategoriesResponse.Message"));

		MonitorGroupCategories monitorGroupCategories = new MonitorGroupCategories();
		monitorGroupCategories.setGroupId(_ctx.longValue("DescribeMonitorGroupCategoriesResponse.MonitorGroupCategories.GroupId"));

		List<CategoryItem> monitorGroupCategory = new ArrayList<CategoryItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitorGroupCategoriesResponse.MonitorGroupCategories.MonitorGroupCategory.Length"); i++) {
			CategoryItem categoryItem = new CategoryItem();
			categoryItem.setCategory(_ctx.stringValue("DescribeMonitorGroupCategoriesResponse.MonitorGroupCategories.MonitorGroupCategory["+ i +"].Category"));
			categoryItem.setCount(_ctx.integerValue("DescribeMonitorGroupCategoriesResponse.MonitorGroupCategories.MonitorGroupCategory["+ i +"].Count"));

			monitorGroupCategory.add(categoryItem);
		}
		monitorGroupCategories.setMonitorGroupCategory(monitorGroupCategory);
		describeMonitorGroupCategoriesResponse.setMonitorGroupCategories(monitorGroupCategories);
	 
	 	return describeMonitorGroupCategoriesResponse;
	}
}