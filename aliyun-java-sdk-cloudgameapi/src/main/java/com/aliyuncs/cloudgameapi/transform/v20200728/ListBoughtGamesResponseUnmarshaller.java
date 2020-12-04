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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgameapi.model.v20200728.ListBoughtGamesResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.ListBoughtGamesResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBoughtGamesResponseUnmarshaller {

	public static ListBoughtGamesResponse unmarshall(ListBoughtGamesResponse listBoughtGamesResponse, UnmarshallerContext _ctx) {
		
		listBoughtGamesResponse.setRequestId(_ctx.stringValue("ListBoughtGamesResponse.RequestId"));
		listBoughtGamesResponse.setPageNumber(_ctx.integerValue("ListBoughtGamesResponse.PageNumber"));
		listBoughtGamesResponse.setPageSize(_ctx.integerValue("ListBoughtGamesResponse.PageSize"));
		listBoughtGamesResponse.setTotalCount(_ctx.integerValue("ListBoughtGamesResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBoughtGamesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setGameId(_ctx.stringValue("ListBoughtGamesResponse.Items["+ i +"].GameId"));
			itemsItem.setGameName(_ctx.stringValue("ListBoughtGamesResponse.Items["+ i +"].GameName"));
			itemsItem.setStartTime(_ctx.longValue("ListBoughtGamesResponse.Items["+ i +"].StartTime"));
			itemsItem.setEndTime(_ctx.longValue("ListBoughtGamesResponse.Items["+ i +"].EndTime"));

			items.add(itemsItem);
		}
		listBoughtGamesResponse.setItems(items);
	 
	 	return listBoughtGamesResponse;
	}
}