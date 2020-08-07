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

import com.aliyuncs.csb.model.v20171118.FindOtherInstanceListResponse;
import com.aliyuncs.csb.model.v20171118.FindOtherInstanceListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindOtherInstanceListResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindOtherInstanceListResponseUnmarshaller {

	public static FindOtherInstanceListResponse unmarshall(FindOtherInstanceListResponse findOtherInstanceListResponse, UnmarshallerContext _ctx) {
		
		findOtherInstanceListResponse.setRequestId(_ctx.stringValue("FindOtherInstanceListResponse.RequestId"));
		findOtherInstanceListResponse.setCode(_ctx.integerValue("FindOtherInstanceListResponse.Code"));
		findOtherInstanceListResponse.setMessage(_ctx.stringValue("FindOtherInstanceListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindOtherInstanceListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindOtherInstanceListResponse.Data.PageNumber"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("FindOtherInstanceListResponse.Data.ItemList.Length"); i++) {
			Item item = new Item();
			item.setDescription(_ctx.stringValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].Description"));
			item.setRunStatus(_ctx.stringValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].RunStatus"));
			item.setGmtCreate(_ctx.longValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.longValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].GmtModified"));
			item.setId(_ctx.longValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].Id"));
			item.setInstanceCategory(_ctx.integerValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].InstanceCategory"));
			item.setName(_ctx.stringValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].Name"));
			item.setStatusStr(_ctx.stringValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].StatusStr"));
			item.setOwnerId(_ctx.longValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].OwnerId"));
			item.setVpcName(_ctx.stringValue("FindOtherInstanceListResponse.Data.ItemList["+ i +"].VpcName"));

			itemList.add(item);
		}
		data.setItemList(itemList);
		findOtherInstanceListResponse.setData(data);
	 
	 	return findOtherInstanceListResponse;
	}
}