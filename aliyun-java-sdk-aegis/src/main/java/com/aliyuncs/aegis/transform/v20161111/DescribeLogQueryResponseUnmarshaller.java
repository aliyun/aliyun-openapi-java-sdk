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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeLogQueryResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeLogQueryResponse.QueryItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogQueryResponseUnmarshaller {

	public static DescribeLogQueryResponse unmarshall(DescribeLogQueryResponse describeLogQueryResponse, UnmarshallerContext context) {
		
		describeLogQueryResponse.setRequestId(context.stringValue("DescribeLogQueryResponse.RequestId"));
		describeLogQueryResponse.setListTotal(context.integerValue("DescribeLogQueryResponse.ListTotal"));

		List<QueryItemsItem> queryItems = new ArrayList<QueryItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeLogQueryResponse.QueryItems.Length"); i++) {
			QueryItemsItem queryItemsItem = new QueryItemsItem();
			queryItemsItem.setQueryDetail(context.stringValue("DescribeLogQueryResponse.QueryItems["+ i +"].QueryDetail"));
			queryItemsItem.setQueryName(context.stringValue("DescribeLogQueryResponse.QueryItems["+ i +"].QueryName"));
			queryItemsItem.setConditions(context.stringValue("DescribeLogQueryResponse.QueryItems["+ i +"].Conditions"));

			queryItems.add(queryItemsItem);
		}
		describeLogQueryResponse.setQueryItems(queryItems);
	 
	 	return describeLogQueryResponse;
	}
}