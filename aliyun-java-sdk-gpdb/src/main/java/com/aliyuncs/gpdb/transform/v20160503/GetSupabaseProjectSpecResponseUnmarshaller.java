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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.GetSupabaseProjectSpecResponse;
import com.aliyuncs.gpdb.model.v20160503.GetSupabaseProjectSpecResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupabaseProjectSpecResponseUnmarshaller {

	public static GetSupabaseProjectSpecResponse unmarshall(GetSupabaseProjectSpecResponse getSupabaseProjectSpecResponse, UnmarshallerContext _ctx) {
		
		getSupabaseProjectSpecResponse.setRequestId(_ctx.stringValue("GetSupabaseProjectSpecResponse.RequestId"));

		List<String> zoneIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSupabaseProjectSpecResponse.ZoneIds.Length"); i++) {
			zoneIds.add(_ctx.stringValue("GetSupabaseProjectSpecResponse.ZoneIds["+ i +"]"));
		}
		getSupabaseProjectSpecResponse.setZoneIds(zoneIds);

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSupabaseProjectSpecResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setVisible(_ctx.booleanValue("GetSupabaseProjectSpecResponse.Items["+ i +"].Visible"));
			itemsItem.setSpec(_ctx.stringValue("GetSupabaseProjectSpecResponse.Items["+ i +"].Spec"));
			itemsItem.setFree(_ctx.booleanValue("GetSupabaseProjectSpecResponse.Items["+ i +"].Free"));

			items.add(itemsItem);
		}
		getSupabaseProjectSpecResponse.setItems(items);
	 
	 	return getSupabaseProjectSpecResponse;
	}
}