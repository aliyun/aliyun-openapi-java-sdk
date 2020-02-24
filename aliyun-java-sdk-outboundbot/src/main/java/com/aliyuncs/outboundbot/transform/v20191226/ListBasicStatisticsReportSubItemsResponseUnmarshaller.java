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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListBasicStatisticsReportSubItemsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems;
import com.aliyuncs.outboundbot.model.v20191226.ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.BasicStatisticsReportSubItem;
import com.aliyuncs.outboundbot.model.v20191226.ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.BasicStatisticsReportSubItem.KeyValuePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBasicStatisticsReportSubItemsResponseUnmarshaller {

	public static ListBasicStatisticsReportSubItemsResponse unmarshall(ListBasicStatisticsReportSubItemsResponse listBasicStatisticsReportSubItemsResponse, UnmarshallerContext _ctx) {
		
		listBasicStatisticsReportSubItemsResponse.setRequestId(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.RequestId"));
		listBasicStatisticsReportSubItemsResponse.setSuccess(_ctx.booleanValue("ListBasicStatisticsReportSubItemsResponse.Success"));
		listBasicStatisticsReportSubItemsResponse.setCode(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.Code"));
		listBasicStatisticsReportSubItemsResponse.setMessage(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.Message"));
		listBasicStatisticsReportSubItemsResponse.setHttpStatusCode(_ctx.integerValue("ListBasicStatisticsReportSubItemsResponse.HttpStatusCode"));

		BasicStatisticsReportSubItems basicStatisticsReportSubItems = new BasicStatisticsReportSubItems();
		basicStatisticsReportSubItems.setTotalCount(_ctx.integerValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.TotalCount"));
		basicStatisticsReportSubItems.setPageNumber(_ctx.integerValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.PageNumber"));
		basicStatisticsReportSubItems.setPageSize(_ctx.integerValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.PageSize"));

		List<BasicStatisticsReportSubItem> list = new ArrayList<BasicStatisticsReportSubItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List.Length"); i++) {
			BasicStatisticsReportSubItem basicStatisticsReportSubItem = new BasicStatisticsReportSubItem();
			basicStatisticsReportSubItem.setBasicStatisticsReportSubItemName(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].BasicStatisticsReportSubItemName"));
			basicStatisticsReportSubItem.setValue(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].Value"));
			basicStatisticsReportSubItem.setCount(_ctx.integerValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].Count"));
			basicStatisticsReportSubItem.setPercentage(_ctx.integerValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].Percentage"));

			List<KeyValuePair> row = new ArrayList<KeyValuePair>();
			for (int j = 0; j < _ctx.lengthValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].Row.Length"); j++) {
				KeyValuePair keyValuePair = new KeyValuePair();
				keyValuePair.setKey(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].Row["+ j +"].Key"));
				keyValuePair.setValue(_ctx.stringValue("ListBasicStatisticsReportSubItemsResponse.BasicStatisticsReportSubItems.List["+ i +"].Row["+ j +"].Value"));

				row.add(keyValuePair);
			}
			basicStatisticsReportSubItem.setRow(row);

			list.add(basicStatisticsReportSubItem);
		}
		basicStatisticsReportSubItems.setList(list);
		listBasicStatisticsReportSubItemsResponse.setBasicStatisticsReportSubItems(basicStatisticsReportSubItems);
	 
	 	return listBasicStatisticsReportSubItemsResponse;
	}
}