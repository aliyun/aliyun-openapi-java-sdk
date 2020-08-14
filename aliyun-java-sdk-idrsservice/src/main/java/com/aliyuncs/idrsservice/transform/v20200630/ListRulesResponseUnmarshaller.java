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

import com.aliyuncs.idrsservice.model.v20200630.ListRulesResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListRulesResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListRulesResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRulesResponseUnmarshaller {

	public static ListRulesResponse unmarshall(ListRulesResponse listRulesResponse, UnmarshallerContext _ctx) {
		
		listRulesResponse.setRequestId(_ctx.stringValue("ListRulesResponse.RequestId"));
		listRulesResponse.setCode(_ctx.stringValue("ListRulesResponse.Code"));
		listRulesResponse.setMessage(_ctx.stringValue("ListRulesResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListRulesResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListRulesResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setContent(_ctx.stringValue("ListRulesResponse.Data.Items["+ i +"].Content"));
			itemsItem.setCreatedAt(_ctx.stringValue("ListRulesResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setId(_ctx.stringValue("ListRulesResponse.Data.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("ListRulesResponse.Data.Items["+ i +"].Name"));

			items.add(itemsItem);
		}
		data.setItems(items);
		listRulesResponse.setData(data);
	 
	 	return listRulesResponse;
	}
}