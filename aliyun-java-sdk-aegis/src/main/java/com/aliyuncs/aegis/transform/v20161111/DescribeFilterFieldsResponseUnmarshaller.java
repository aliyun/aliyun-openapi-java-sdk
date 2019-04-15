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

import com.aliyuncs.aegis.model.v20161111.DescribeFilterFieldsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeFilterFieldsResponse.LogFilterListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilterFieldsResponseUnmarshaller {

	public static DescribeFilterFieldsResponse unmarshall(DescribeFilterFieldsResponse describeFilterFieldsResponse, UnmarshallerContext context) {
		
		describeFilterFieldsResponse.setRequestId(context.stringValue("DescribeFilterFieldsResponse.RequestId"));
		describeFilterFieldsResponse.setTotal(context.longValue("DescribeFilterFieldsResponse.Total"));

		List<LogFilterListItem> logFilterList = new ArrayList<LogFilterListItem>();
		for (int i = 0; i < context.lengthValue("DescribeFilterFieldsResponse.LogFilterList.Length"); i++) {
			LogFilterListItem logFilterListItem = new LogFilterListItem();
			logFilterListItem.setFields(context.stringValue("DescribeFilterFieldsResponse.LogFilterList["+ i +"].Fields"));

			logFilterList.add(logFilterListItem);
		}
		describeFilterFieldsResponse.setLogFilterList(logFilterList);
	 
	 	return describeFilterFieldsResponse;
	}
}