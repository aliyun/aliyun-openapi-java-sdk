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

import com.aliyuncs.sas.model.v20181203.DescribePropertySoftwareItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertySoftwareItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertySoftwareItemResponse.PropertySoftwareItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertySoftwareItemResponseUnmarshaller {

	public static DescribePropertySoftwareItemResponse unmarshall(DescribePropertySoftwareItemResponse describePropertySoftwareItemResponse, UnmarshallerContext _ctx) {
		
		describePropertySoftwareItemResponse.setRequestId(_ctx.stringValue("DescribePropertySoftwareItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertySoftwareItemResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertySoftwareItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertySoftwareItemResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertySoftwareItemResponse.PageInfo.CurrentPage"));
		describePropertySoftwareItemResponse.setPageInfo(pageInfo);

		List<PropertySoftwareItem> propertyItems = new ArrayList<PropertySoftwareItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertySoftwareItemResponse.PropertyItems.Length"); i++) {
			PropertySoftwareItem propertySoftwareItem = new PropertySoftwareItem();
			propertySoftwareItem.setName(_ctx.stringValue("DescribePropertySoftwareItemResponse.PropertyItems["+ i +"].Name"));
			propertySoftwareItem.setCount(_ctx.integerValue("DescribePropertySoftwareItemResponse.PropertyItems["+ i +"].Count"));

			propertyItems.add(propertySoftwareItem);
		}
		describePropertySoftwareItemResponse.setPropertyItems(propertyItems);
	 
	 	return describePropertySoftwareItemResponse;
	}
}