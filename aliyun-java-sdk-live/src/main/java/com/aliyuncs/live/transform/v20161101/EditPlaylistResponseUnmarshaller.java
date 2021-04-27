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

import com.aliyuncs.live.model.v20161101.EditPlaylistResponse;
import com.aliyuncs.live.model.v20161101.EditPlaylistResponse.Items;
import com.aliyuncs.live.model.v20161101.EditPlaylistResponse.Items.FailedItem;
import com.aliyuncs.live.model.v20161101.EditPlaylistResponse.Items.SuccessItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class EditPlaylistResponseUnmarshaller {

	public static EditPlaylistResponse unmarshall(EditPlaylistResponse editPlaylistResponse, UnmarshallerContext _ctx) {
		
		editPlaylistResponse.setRequestId(_ctx.stringValue("EditPlaylistResponse.RequestId"));
		editPlaylistResponse.setProgramId(_ctx.stringValue("EditPlaylistResponse.ProgramId"));
		editPlaylistResponse.setCasterId(_ctx.stringValue("EditPlaylistResponse.CasterId"));

		Items items = new Items();

		List<SuccessItem> successItems = new ArrayList<SuccessItem>();
		for (int i = 0; i < _ctx.lengthValue("EditPlaylistResponse.Items.SuccessItems.Length"); i++) {
			SuccessItem successItem = new SuccessItem();
			successItem.setItemId(_ctx.stringValue("EditPlaylistResponse.Items.SuccessItems["+ i +"].ItemId"));
			successItem.setItemName(_ctx.stringValue("EditPlaylistResponse.Items.SuccessItems["+ i +"].ItemName"));

			successItems.add(successItem);
		}
		items.setSuccessItems(successItems);

		List<FailedItem> failedItems = new ArrayList<FailedItem>();
		for (int i = 0; i < _ctx.lengthValue("EditPlaylistResponse.Items.FailedItems.Length"); i++) {
			FailedItem failedItem = new FailedItem();
			failedItem.setItemId(_ctx.stringValue("EditPlaylistResponse.Items.FailedItems["+ i +"].ItemId"));
			failedItem.setItemName(_ctx.stringValue("EditPlaylistResponse.Items.FailedItems["+ i +"].ItemName"));

			failedItems.add(failedItem);
		}
		items.setFailedItems(failedItems);
		editPlaylistResponse.setItems(items);
	 
	 	return editPlaylistResponse;
	}
}