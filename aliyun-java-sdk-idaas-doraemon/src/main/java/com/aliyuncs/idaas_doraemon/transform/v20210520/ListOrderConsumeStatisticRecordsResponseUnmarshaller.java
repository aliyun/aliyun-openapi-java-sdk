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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idaas_doraemon.model.v20210520.ListOrderConsumeStatisticRecordsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListOrderConsumeStatisticRecordsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrderConsumeStatisticRecordsResponseUnmarshaller {

	public static ListOrderConsumeStatisticRecordsResponse unmarshall(ListOrderConsumeStatisticRecordsResponse listOrderConsumeStatisticRecordsResponse, UnmarshallerContext _ctx) {
		
		listOrderConsumeStatisticRecordsResponse.setRequestId(_ctx.stringValue("ListOrderConsumeStatisticRecordsResponse.RequestId"));
		listOrderConsumeStatisticRecordsResponse.setTotalPages(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.TotalPages"));
		listOrderConsumeStatisticRecordsResponse.setTotalElements(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.TotalElements"));
		listOrderConsumeStatisticRecordsResponse.setPageSize(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListOrderConsumeStatisticRecordsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setAliOrderCode(_ctx.stringValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].AliOrderCode"));
			item.setStatisticTime(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].StatisticTime"));
			item.setApplicationExternalId(_ctx.stringValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].ApplicationExternalId"));
			item.setServiceCode(_ctx.stringValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].ServiceCode"));
			item.setUnitPrice(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].UnitPrice"));
			item.setChargedCount(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].ChargedCount"));
			item.setTotalPrice(_ctx.longValue("ListOrderConsumeStatisticRecordsResponse.Items["+ i +"].TotalPrice"));

			items.add(item);
		}
		listOrderConsumeStatisticRecordsResponse.setItems(items);
	 
	 	return listOrderConsumeStatisticRecordsResponse;
	}
}