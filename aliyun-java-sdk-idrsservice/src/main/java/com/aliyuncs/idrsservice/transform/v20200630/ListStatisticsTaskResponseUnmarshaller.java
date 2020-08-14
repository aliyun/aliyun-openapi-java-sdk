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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.ListStatisticsTaskResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListStatisticsTaskResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListStatisticsTaskResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStatisticsTaskResponseUnmarshaller {

	public static ListStatisticsTaskResponse unmarshall(ListStatisticsTaskResponse listStatisticsTaskResponse, UnmarshallerContext _ctx) {
		
		listStatisticsTaskResponse.setRequestId(_ctx.stringValue("ListStatisticsTaskResponse.RequestId"));
		listStatisticsTaskResponse.setCode(_ctx.stringValue("ListStatisticsTaskResponse.Code"));
		listStatisticsTaskResponse.setMessage(_ctx.stringValue("ListStatisticsTaskResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListStatisticsTaskResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListStatisticsTaskResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListStatisticsTaskResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreatedAt(_ctx.stringValue("ListStatisticsTaskResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setFileUrl(_ctx.stringValue("ListStatisticsTaskResponse.Data.Items["+ i +"].FileUrl"));
			itemsItem.setName(_ctx.stringValue("ListStatisticsTaskResponse.Data.Items["+ i +"].Name"));
			itemsItem.setStatus(_ctx.integerValue("ListStatisticsTaskResponse.Data.Items["+ i +"].Status"));

			items.add(itemsItem);
		}
		data.setItems(items);
		listStatisticsTaskResponse.setData(data);
	 
	 	return listStatisticsTaskResponse;
	}
}