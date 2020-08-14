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

import com.aliyuncs.idrsservice.model.v20200630.ListTasksResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListTasksResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListTasksResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setCode(_ctx.stringValue("ListTasksResponse.Code"));
		listTasksResponse.setMessage(_ctx.stringValue("ListTasksResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListTasksResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListTasksResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreatedAt(_ctx.stringValue("ListTasksResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setId(_ctx.stringValue("ListTasksResponse.Data.Items["+ i +"].Id"));
			itemsItem.setStatus(_ctx.stringValue("ListTasksResponse.Data.Items["+ i +"].Status"));
			itemsItem.setVideoMetaUrl(_ctx.stringValue("ListTasksResponse.Data.Items["+ i +"].VideoMetaUrl"));
			itemsItem.setVideoUrl(_ctx.stringValue("ListTasksResponse.Data.Items["+ i +"].VideoUrl"));

			items.add(itemsItem);
		}
		data.setItems(items);
		listTasksResponse.setData(data);
	 
	 	return listTasksResponse;
	}
}