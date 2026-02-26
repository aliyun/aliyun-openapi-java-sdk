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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribeSmartStatisticsPageListResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeSmartStatisticsPageListResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartStatisticsPageListResponseUnmarshaller {

	public static DescribeSmartStatisticsPageListResponse unmarshall(DescribeSmartStatisticsPageListResponse describeSmartStatisticsPageListResponse, UnmarshallerContext _ctx) {
		
		describeSmartStatisticsPageListResponse.setRequestId(_ctx.stringValue("DescribeSmartStatisticsPageListResponse.RequestId"));
		describeSmartStatisticsPageListResponse.setCurrentPage(_ctx.integerValue("DescribeSmartStatisticsPageListResponse.CurrentPage"));
		describeSmartStatisticsPageListResponse.setTotalPage(_ctx.integerValue("DescribeSmartStatisticsPageListResponse.TotalPage"));
		describeSmartStatisticsPageListResponse.setPageSize(_ctx.integerValue("DescribeSmartStatisticsPageListResponse.PageSize"));
		describeSmartStatisticsPageListResponse.setTotalCount(_ctx.integerValue("DescribeSmartStatisticsPageListResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartStatisticsPageListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDate(_ctx.stringValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].Date"));
			itemsItem.setSceneId(_ctx.longValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].SceneId"));
			itemsItem.setSceneName(_ctx.stringValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].SceneName"));
			itemsItem.setTotalCount(_ctx.integerValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].TotalCount"));
			itemsItem.setSuccessCount(_ctx.integerValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].SuccessCount"));
			itemsItem.setPassRate(_ctx.stringValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].PassRate"));
			itemsItem.setProductCode(_ctx.stringValue("DescribeSmartStatisticsPageListResponse.Items["+ i +"].ProductCode"));

			items.add(itemsItem);
		}
		describeSmartStatisticsPageListResponse.setItems(items);
	 
	 	return describeSmartStatisticsPageListResponse;
	}
}