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

import com.aliyuncs.sas.model.v20181203.DescribePropertyCronItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyCronItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyCronItemResponse.PropertyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyCronItemResponseUnmarshaller {

	public static DescribePropertyCronItemResponse unmarshall(DescribePropertyCronItemResponse describePropertyCronItemResponse, UnmarshallerContext _ctx) {
		
		describePropertyCronItemResponse.setRequestId(_ctx.stringValue("DescribePropertyCronItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyCronItemResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyCronItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyCronItemResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribePropertyCronItemResponse.PageInfo.Count"));
		describePropertyCronItemResponse.setPageInfo(pageInfo);

		List<PropertyItem> propertyItems = new ArrayList<PropertyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyCronItemResponse.PropertyItems.Length"); i++) {
			PropertyItem propertyItem = new PropertyItem();
			propertyItem.setSource(_ctx.stringValue("DescribePropertyCronItemResponse.PropertyItems["+ i +"].Source"));
			propertyItem.setCount(_ctx.integerValue("DescribePropertyCronItemResponse.PropertyItems["+ i +"].Count"));

			propertyItems.add(propertyItem);
		}
		describePropertyCronItemResponse.setPropertyItems(propertyItems);
	 
	 	return describePropertyCronItemResponse;
	}
}