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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribePropertyScaItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyScaItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyScaItemResponse.PropertyItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyScaItemResponseUnmarshaller {

	public static DescribePropertyScaItemResponse unmarshall(DescribePropertyScaItemResponse describePropertyScaItemResponse, UnmarshallerContext _ctx) {
		
		describePropertyScaItemResponse.setRequestId(_ctx.stringValue("DescribePropertyScaItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyScaItemResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyScaItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyScaItemResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribePropertyScaItemResponse.PageInfo.Count"));
		describePropertyScaItemResponse.setPageInfo(pageInfo);

		List<PropertyItemsItem> propertyItems = new ArrayList<PropertyItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyScaItemResponse.PropertyItems.Length"); i++) {
			PropertyItemsItem propertyItemsItem = new PropertyItemsItem();
			propertyItemsItem.setTypeDisplay(_ctx.stringValue("DescribePropertyScaItemResponse.PropertyItems["+ i +"].TypeDisplay"));
			propertyItemsItem.setName(_ctx.stringValue("DescribePropertyScaItemResponse.PropertyItems["+ i +"].Name"));
			propertyItemsItem.setCount(_ctx.integerValue("DescribePropertyScaItemResponse.PropertyItems["+ i +"].Count"));
			propertyItemsItem.setBizType(_ctx.stringValue("DescribePropertyScaItemResponse.PropertyItems["+ i +"].BizType"));

			propertyItems.add(propertyItemsItem);
		}
		describePropertyScaItemResponse.setPropertyItems(propertyItems);
	 
	 	return describePropertyScaItemResponse;
	}
}