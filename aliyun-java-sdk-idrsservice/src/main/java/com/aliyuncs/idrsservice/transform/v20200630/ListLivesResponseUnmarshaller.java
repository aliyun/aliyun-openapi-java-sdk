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

import com.aliyuncs.idrsservice.model.v20200630.ListLivesResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListLivesResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListLivesResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLivesResponseUnmarshaller {

	public static ListLivesResponse unmarshall(ListLivesResponse listLivesResponse, UnmarshallerContext _ctx) {
		
		listLivesResponse.setRequestId(_ctx.stringValue("ListLivesResponse.RequestId"));
		listLivesResponse.setCode(_ctx.stringValue("ListLivesResponse.Code"));
		listLivesResponse.setMessage(_ctx.stringValue("ListLivesResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListLivesResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListLivesResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLivesResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setChannel(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].Channel"));
			itemsItem.setCreatedAt(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setId(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].Name"));
			itemsItem.setPublicId(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].PublicId"));
			itemsItem.setStatus(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].Status"));
			itemsItem.setUserId(_ctx.stringValue("ListLivesResponse.Data.Items["+ i +"].UserId"));

			items.add(itemsItem);
		}
		data.setItems(items);
		listLivesResponse.setData(data);
	 
	 	return listLivesResponse;
	}
}