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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.FindCustomizedPropertiesResponse;
import com.aliyuncs.iovcc.model.v20180501.FindCustomizedPropertiesResponse.CustomizedPropertyList;
import com.aliyuncs.iovcc.model.v20180501.FindCustomizedPropertiesResponse.CustomizedPropertyList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCustomizedPropertiesResponseUnmarshaller {

	public static FindCustomizedPropertiesResponse unmarshall(FindCustomizedPropertiesResponse findCustomizedPropertiesResponse, UnmarshallerContext _ctx) {
		
		findCustomizedPropertiesResponse.setRequestId(_ctx.stringValue("FindCustomizedPropertiesResponse.RequestId"));

		CustomizedPropertyList customizedPropertyList = new CustomizedPropertyList();
		customizedPropertyList.setTotalCount(_ctx.integerValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.Items["+ i +"].Name"));
			itemsItem.setValue(_ctx.stringValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.Items["+ i +"].Value"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindCustomizedPropertiesResponse.CustomizedPropertyList.Items["+ i +"].GmtCreateTimestamp"));

			items.add(itemsItem);
		}
		customizedPropertyList.setItems(items);
		findCustomizedPropertiesResponse.setCustomizedPropertyList(customizedPropertyList);
	 
	 	return findCustomizedPropertiesResponse;
	}
}