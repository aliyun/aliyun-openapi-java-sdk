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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindInstanceListResponse;
import com.aliyuncs.csb.model.v20171118.FindInstanceListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindInstanceListResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindInstanceListResponseUnmarshaller {

	public static FindInstanceListResponse unmarshall(FindInstanceListResponse findInstanceListResponse, UnmarshallerContext context) {
		
		findInstanceListResponse.setRequestId(context.stringValue("FindInstanceListResponse.RequestId"));
		findInstanceListResponse.setCode(context.integerValue("FindInstanceListResponse.Code"));
		findInstanceListResponse.setMessage(context.stringValue("FindInstanceListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("FindInstanceListResponse.Data.CurrentPage"));
		data.setPageNumber(context.integerValue("FindInstanceListResponse.Data.PageNumber"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("FindInstanceListResponse.Data.ItemList.Length"); i++) {
			Item item = new Item();
			item.setDescription(context.stringValue("FindInstanceListResponse.Data.ItemList["+ i +"].Description"));
			item.setFrontStatus(context.stringValue("FindInstanceListResponse.Data.ItemList["+ i +"].FrontStatus"));
			item.setGmtCreate(context.longValue("FindInstanceListResponse.Data.ItemList["+ i +"].GmtCreate"));
			item.setGmtModified(context.longValue("FindInstanceListResponse.Data.ItemList["+ i +"].GmtModified"));
			item.setId(context.longValue("FindInstanceListResponse.Data.ItemList["+ i +"].Id"));
			item.setInstanceCategory(context.integerValue("FindInstanceListResponse.Data.ItemList["+ i +"].InstanceCategory"));
			item.setName(context.stringValue("FindInstanceListResponse.Data.ItemList["+ i +"].Name"));
			item.setStatusCode(context.integerValue("FindInstanceListResponse.Data.ItemList["+ i +"].StatusCode"));
			item.setVisible(context.booleanValue("FindInstanceListResponse.Data.ItemList["+ i +"].Visible"));
			item.setVpcName(context.stringValue("FindInstanceListResponse.Data.ItemList["+ i +"].VpcName"));

			itemList.add(item);
		}
		data.setItemList(itemList);
		findInstanceListResponse.setData(data);
	 
	 	return findInstanceListResponse;
	}
}