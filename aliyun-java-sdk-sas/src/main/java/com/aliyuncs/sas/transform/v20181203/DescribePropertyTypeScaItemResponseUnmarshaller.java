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

import com.aliyuncs.sas.model.v20181203.DescribePropertyTypeScaItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyTypeScaItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyTypeScaItemResponse.PropertyTypeItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyTypeScaItemResponseUnmarshaller {

	public static DescribePropertyTypeScaItemResponse unmarshall(DescribePropertyTypeScaItemResponse describePropertyTypeScaItemResponse, UnmarshallerContext _ctx) {
		
		describePropertyTypeScaItemResponse.setRequestId(_ctx.stringValue("DescribePropertyTypeScaItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyTypeScaItemResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyTypeScaItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyTypeScaItemResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribePropertyTypeScaItemResponse.PageInfo.Count"));
		describePropertyTypeScaItemResponse.setPageInfo(pageInfo);

		List<PropertyTypeItemsItem> propertyTypeItems = new ArrayList<PropertyTypeItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyTypeScaItemResponse.PropertyTypeItems.Length"); i++) {
			PropertyTypeItemsItem propertyTypeItemsItem = new PropertyTypeItemsItem();
			propertyTypeItemsItem.setType(_ctx.stringValue("DescribePropertyTypeScaItemResponse.PropertyTypeItems["+ i +"].Type"));
			propertyTypeItemsItem.setName(_ctx.stringValue("DescribePropertyTypeScaItemResponse.PropertyTypeItems["+ i +"].Name"));

			propertyTypeItems.add(propertyTypeItemsItem);
		}
		describePropertyTypeScaItemResponse.setPropertyTypeItems(propertyTypeItems);
	 
	 	return describePropertyTypeScaItemResponse;
	}
}