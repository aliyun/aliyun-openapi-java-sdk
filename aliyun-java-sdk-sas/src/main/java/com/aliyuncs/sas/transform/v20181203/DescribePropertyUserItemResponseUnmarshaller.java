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

import com.aliyuncs.sas.model.v20181203.DescribePropertyUserItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyUserItemResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribePropertyUserItemResponse.PropertyUserItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyUserItemResponseUnmarshaller {

	public static DescribePropertyUserItemResponse unmarshall(DescribePropertyUserItemResponse describePropertyUserItemResponse, UnmarshallerContext _ctx) {
		
		describePropertyUserItemResponse.setRequestId(_ctx.stringValue("DescribePropertyUserItemResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribePropertyUserItemResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribePropertyUserItemResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribePropertyUserItemResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribePropertyUserItemResponse.PageInfo.CurrentPage"));
		describePropertyUserItemResponse.setPageInfo(pageInfo);

		List<PropertyUserItem> propertyItems = new ArrayList<PropertyUserItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyUserItemResponse.PropertyItems.Length"); i++) {
			PropertyUserItem propertyUserItem = new PropertyUserItem();
			propertyUserItem.setUser(_ctx.stringValue("DescribePropertyUserItemResponse.PropertyItems["+ i +"].User"));
			propertyUserItem.setCount(_ctx.integerValue("DescribePropertyUserItemResponse.PropertyItems["+ i +"].Count"));

			propertyItems.add(propertyUserItem);
		}
		describePropertyUserItemResponse.setPropertyItems(propertyItems);
	 
	 	return describePropertyUserItemResponse;
	}
}