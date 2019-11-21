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

import com.aliyuncs.sas.model.v20181203.DescribePropertyProcItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyProcItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyProcItemResponse.PropertyProcItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyProcItemResponseUnmarshaller {

	public static DescribePropertyProcItemResponse unmarshall(DescribePropertyProcItemResponse describePropertyProcItemResponse, UnmarshallerContext _ctx) {
		
		describePropertyProcItemResponse.setRequestId(_ctx.stringValue("DescribePropertyProcItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertyProcItemResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyProcItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyProcItemResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyProcItemResponse.PageInfo.CurrentPage"));
		describePropertyProcItemResponse.setPageInfo(pageInfo);

		List<PropertyProcItem> propertyItems = new ArrayList<PropertyProcItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyProcItemResponse.PropertyItems.Length"); i++) {
			PropertyProcItem propertyProcItem = new PropertyProcItem();
			propertyProcItem.setName(_ctx.stringValue("DescribePropertyProcItemResponse.PropertyItems["+ i +"].Name"));
			propertyProcItem.setCount(_ctx.integerValue("DescribePropertyProcItemResponse.PropertyItems["+ i +"].Count"));

			propertyItems.add(propertyProcItem);
		}
		describePropertyProcItemResponse.setPropertyItems(propertyItems);
	 
	 	return describePropertyProcItemResponse;
	}
}