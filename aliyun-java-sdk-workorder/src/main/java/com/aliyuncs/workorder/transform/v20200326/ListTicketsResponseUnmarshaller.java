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

import com.aliyuncs.workorder.model.v20200326.ListTicketsResponse;
import com.aliyuncs.workorder.model.v20200326.ListTicketsResponse.Data;
import com.aliyuncs.workorder.model.v20200326.ListTicketsResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketsResponseUnmarshaller {

	public static ListTicketsResponse unmarshall(ListTicketsResponse listTicketsResponse, UnmarshallerContext _ctx) {
		
		listTicketsResponse.setRequestId(_ctx.stringValue("ListTicketsResponse.RequestId"));
		listTicketsResponse.setCode(_ctx.integerValue("ListTicketsResponse.Code"));
		listTicketsResponse.setSuccess(_ctx.booleanValue("ListTicketsResponse.Success"));
		listTicketsResponse.setMessage(_ctx.stringValue("ListTicketsResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListTicketsResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("ListTicketsResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("ListTicketsResponse.Data.CurrentPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketsResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAddTime(_ctx.integerValue("ListTicketsResponse.Data.List["+ i +"].AddTime"));
			listItem.setTicketStatus(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].TicketStatus"));
			listItem.setCreatorId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CreatorId"));
			listItem.setId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Id"));
			listItem.setTitle(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Title"));

			list.add(listItem);
		}
		data.setList(list);
		listTicketsResponse.setData(data);
	 
	 	return listTicketsResponse;
	}
}