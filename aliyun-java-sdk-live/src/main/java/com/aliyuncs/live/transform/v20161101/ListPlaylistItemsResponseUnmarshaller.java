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

import com.aliyuncs.live.model.v20161101.ListPlaylistItemsResponse;
import com.aliyuncs.live.model.v20161101.ListPlaylistItemsResponse.ProgramItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPlaylistItemsResponseUnmarshaller {

	public static ListPlaylistItemsResponse unmarshall(ListPlaylistItemsResponse listPlaylistItemsResponse, UnmarshallerContext _ctx) {
		
		listPlaylistItemsResponse.setRequestId(_ctx.stringValue("ListPlaylistItemsResponse.RequestId"));
		listPlaylistItemsResponse.setTotal(_ctx.integerValue("ListPlaylistItemsResponse.Total"));

		List<ProgramItem> programItems = new ArrayList<ProgramItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPlaylistItemsResponse.ProgramItems.Length"); i++) {
			ProgramItem programItem = new ProgramItem();
			programItem.setProgramId(_ctx.stringValue("ListPlaylistItemsResponse.ProgramItems["+ i +"].ProgramId"));
			programItem.setProgramItemId(_ctx.stringValue("ListPlaylistItemsResponse.ProgramItems["+ i +"].ProgramItemId"));
			programItem.setProgramItemName(_ctx.stringValue("ListPlaylistItemsResponse.ProgramItems["+ i +"].ProgramItemName"));
			programItem.setResourceType(_ctx.stringValue("ListPlaylistItemsResponse.ProgramItems["+ i +"].ResourceType"));
			programItem.setResourceValue(_ctx.stringValue("ListPlaylistItemsResponse.ProgramItems["+ i +"].ResourceValue"));
			programItem.setIndex(_ctx.integerValue("ListPlaylistItemsResponse.ProgramItems["+ i +"].Index"));

			programItems.add(programItem);
		}
		listPlaylistItemsResponse.setProgramItems(programItems);
	 
	 	return listPlaylistItemsResponse;
	}
}