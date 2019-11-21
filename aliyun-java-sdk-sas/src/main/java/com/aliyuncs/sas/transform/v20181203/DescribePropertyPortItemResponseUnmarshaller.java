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

import com.aliyuncs.sas.model.v20181203.DescribePropertyPortItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyPortItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyPortItemResponse.PropertyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyPortItemResponseUnmarshaller {

	public static DescribePropertyPortItemResponse unmarshall(DescribePropertyPortItemResponse describePropertyPortItemResponse, UnmarshallerContext _ctx) {
		
		describePropertyPortItemResponse.setRequestId(_ctx.stringValue("DescribePropertyPortItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertyPortItemResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyPortItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyPortItemResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyPortItemResponse.PageInfo.CurrentPage"));
		describePropertyPortItemResponse.setPageInfo(pageInfo);

		List<PropertyItem> propertyItems = new ArrayList<PropertyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyPortItemResponse.PropertyItems.Length"); i++) {
			PropertyItem propertyItem = new PropertyItem();
			propertyItem.setPort(_ctx.stringValue("DescribePropertyPortItemResponse.PropertyItems["+ i +"].Port"));
			propertyItem.setProto(_ctx.stringValue("DescribePropertyPortItemResponse.PropertyItems["+ i +"].Proto"));
			propertyItem.setCount(_ctx.integerValue("DescribePropertyPortItemResponse.PropertyItems["+ i +"].Count"));

			propertyItems.add(propertyItem);
		}
		describePropertyPortItemResponse.setPropertyItems(propertyItems);
	 
	 	return describePropertyPortItemResponse;
	}
}