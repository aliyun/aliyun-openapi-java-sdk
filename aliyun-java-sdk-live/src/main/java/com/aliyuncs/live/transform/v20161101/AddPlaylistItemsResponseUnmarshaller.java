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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.AddPlaylistItemsResponse;
import com.aliyuncs.live.model.v20161101.AddPlaylistItemsResponse.Items;
import com.aliyuncs.live.model.v20161101.AddPlaylistItemsResponse.Items.FailedItem;
import com.aliyuncs.live.model.v20161101.AddPlaylistItemsResponse.Items.SuccessItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPlaylistItemsResponseUnmarshaller {

	public static AddPlaylistItemsResponse unmarshall(AddPlaylistItemsResponse addPlaylistItemsResponse, UnmarshallerContext _ctx) {
		
		addPlaylistItemsResponse.setRequestId(_ctx.stringValue("AddPlaylistItemsResponse.RequestId"));
		addPlaylistItemsResponse.setProgramId(_ctx.stringValue("AddPlaylistItemsResponse.ProgramId"));

		Items items = new Items();

		List<SuccessItem> successItems = new ArrayList<SuccessItem>();
		for (int i = 0; i < _ctx.lengthValue("AddPlaylistItemsResponse.Items.SuccessItems.Length"); i++) {
			SuccessItem successItem = new SuccessItem();
			successItem.setItemId(_ctx.stringValue("AddPlaylistItemsResponse.Items.SuccessItems["+ i +"].ItemId"));
			successItem.setItemName(_ctx.stringValue("AddPlaylistItemsResponse.Items.SuccessItems["+ i +"].ItemName"));

			successItems.add(successItem);
		}
		items.setSuccessItems(successItems);

		List<FailedItem> failedItems = new ArrayList<FailedItem>();
		for (int i = 0; i < _ctx.lengthValue("AddPlaylistItemsResponse.Items.FailedItems.Length"); i++) {
			FailedItem failedItem = new FailedItem();
			failedItem.setItemId(_ctx.stringValue("AddPlaylistItemsResponse.Items.FailedItems["+ i +"].ItemId"));
			failedItem.setItemName(_ctx.stringValue("AddPlaylistItemsResponse.Items.FailedItems["+ i +"].ItemName"));

			failedItems.add(failedItem);
		}
		items.setFailedItems(failedItems);
		addPlaylistItemsResponse.setItems(items);
	 
	 	return addPlaylistItemsResponse;
	}
}