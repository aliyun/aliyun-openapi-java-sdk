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

import com.aliyuncs.iovcc.model.v20180501.FindCustomizedFiltersResponse;
import com.aliyuncs.iovcc.model.v20180501.FindCustomizedFiltersResponse.CustomizedFilterList;
import com.aliyuncs.iovcc.model.v20180501.FindCustomizedFiltersResponse.CustomizedFilterList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCustomizedFiltersResponseUnmarshaller {

	public static FindCustomizedFiltersResponse unmarshall(FindCustomizedFiltersResponse findCustomizedFiltersResponse, UnmarshallerContext _ctx) {
		
		findCustomizedFiltersResponse.setRequestId(_ctx.stringValue("FindCustomizedFiltersResponse.RequestId"));

		CustomizedFilterList customizedFilterList = new CustomizedFilterList();
		customizedFilterList.setTotalCount(_ctx.integerValue("FindCustomizedFiltersResponse.CustomizedFilterList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].Name"));
			itemsItem.setValue(_ctx.stringValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].Value"));
			itemsItem.setValueCompareType(_ctx.stringValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].ValueCompareType"));
			itemsItem.setBlackWhiteType(_ctx.stringValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].BlackWhiteType"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].GmtModify"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindCustomizedFiltersResponse.CustomizedFilterList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		customizedFilterList.setItems(items);
		findCustomizedFiltersResponse.setCustomizedFilterList(customizedFilterList);
	 
	 	return findCustomizedFiltersResponse;
	}
}