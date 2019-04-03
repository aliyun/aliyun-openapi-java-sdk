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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeTableListByTypeResponse;
import com.aliyuncs.drds.model.v20190123.DescribeTableListByTypeResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableListByTypeResponseUnmarshaller {

	public static DescribeTableListByTypeResponse unmarshall(DescribeTableListByTypeResponse describeTableListByTypeResponse, UnmarshallerContext context) {
		
		describeTableListByTypeResponse.setRequestId(context.stringValue("DescribeTableListByTypeResponse.RequestId"));
		describeTableListByTypeResponse.setSuccess(context.booleanValue("DescribeTableListByTypeResponse.Success"));
		describeTableListByTypeResponse.setPageNumber(context.integerValue("DescribeTableListByTypeResponse.PageNumber"));
		describeTableListByTypeResponse.setPageSize(context.integerValue("DescribeTableListByTypeResponse.PageSize"));
		describeTableListByTypeResponse.setTotal(context.integerValue("DescribeTableListByTypeResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("DescribeTableListByTypeResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTableName(context.stringValue("DescribeTableListByTypeResponse.List["+ i +"].TableName"));
			listItem.setProperty(context.stringValue("DescribeTableListByTypeResponse.List["+ i +"].Property"));

			list.add(listItem);
		}
		describeTableListByTypeResponse.setList(list);
	 
	 	return describeTableListByTypeResponse;
	}
}