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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsSlowSqlsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsSlowSqlsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsSlowSqlsResponseUnmarshaller {

	public static DescribeDrdsSlowSqlsResponse unmarshall(DescribeDrdsSlowSqlsResponse describeDrdsSlowSqlsResponse, UnmarshallerContext context) {
		
		describeDrdsSlowSqlsResponse.setRequestId(context.stringValue("DescribeDrdsSlowSqlsResponse.RequestId"));
		describeDrdsSlowSqlsResponse.setSuccess(context.booleanValue("DescribeDrdsSlowSqlsResponse.Success"));
		describeDrdsSlowSqlsResponse.setTotal(context.integerValue("DescribeDrdsSlowSqlsResponse.Total"));
		describeDrdsSlowSqlsResponse.setPageNumber(context.integerValue("DescribeDrdsSlowSqlsResponse.PageNumber"));
		describeDrdsSlowSqlsResponse.setPageSize(context.integerValue("DescribeDrdsSlowSqlsResponse.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsSlowSqlsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setSchema(context.stringValue("DescribeDrdsSlowSqlsResponse.Items["+ i +"].Schema"));
			item.setSql(context.stringValue("DescribeDrdsSlowSqlsResponse.Items["+ i +"].Sql"));
			item.setSendTime(context.longValue("DescribeDrdsSlowSqlsResponse.Items["+ i +"].SendTime"));
			item.setResponseTime(context.longValue("DescribeDrdsSlowSqlsResponse.Items["+ i +"].ResponseTime"));
			item.setHost(context.stringValue("DescribeDrdsSlowSqlsResponse.Items["+ i +"].Host"));

			items.add(item);
		}
		describeDrdsSlowSqlsResponse.setItems(items);
	 
	 	return describeDrdsSlowSqlsResponse;
	}
}