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

package com.aliyuncs.workorder.transform.v20200326;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20200326.ListTicketNotesResponse;
import com.aliyuncs.workorder.model.v20200326.ListTicketNotesResponse.Data;
import com.aliyuncs.workorder.model.v20200326.ListTicketNotesResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketNotesResponseUnmarshaller {

	public static ListTicketNotesResponse unmarshall(ListTicketNotesResponse listTicketNotesResponse, UnmarshallerContext _ctx) {
		
		listTicketNotesResponse.setRequestId(_ctx.stringValue("ListTicketNotesResponse.RequestId"));
		listTicketNotesResponse.setCode(_ctx.integerValue("ListTicketNotesResponse.Code"));
		listTicketNotesResponse.setSuccess(_ctx.booleanValue("ListTicketNotesResponse.Success"));
		listTicketNotesResponse.setMessage(_ctx.stringValue("ListTicketNotesResponse.Message"));

		Data data = new Data();

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketNotesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setFromOfficial(_ctx.booleanValue("ListTicketNotesResponse.Data.List["+ i +"].FromOfficial"));
			listItem.setGmtCreated(_ctx.integerValue("ListTicketNotesResponse.Data.List["+ i +"].GmtCreated"));
			listItem.setNoteId(_ctx.stringValue("ListTicketNotesResponse.Data.List["+ i +"].NoteId"));
			listItem.setContent(_ctx.stringValue("ListTicketNotesResponse.Data.List["+ i +"].Content"));

			list.add(listItem);
		}
		data.setList(list);
		listTicketNotesResponse.setData(data);
	 
	 	return listTicketNotesResponse;
	}
}