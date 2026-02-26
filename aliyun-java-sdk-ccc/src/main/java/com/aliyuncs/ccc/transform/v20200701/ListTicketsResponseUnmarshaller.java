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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListTicketsResponse;
import com.aliyuncs.ccc.model.v20200701.ListTicketsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListTicketsResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketsResponseUnmarshaller {

	public static ListTicketsResponse unmarshall(ListTicketsResponse listTicketsResponse, UnmarshallerContext _ctx) {
		
		listTicketsResponse.setRequestId(_ctx.stringValue("ListTicketsResponse.RequestId"));
		listTicketsResponse.setMessage(_ctx.stringValue("ListTicketsResponse.Message"));
		listTicketsResponse.setHttpStatusCode(_ctx.longValue("ListTicketsResponse.HttpStatusCode"));
		listTicketsResponse.setCode(_ctx.stringValue("ListTicketsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListTicketsResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.longValue("ListTicketsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListTicketsResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketsResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setInstanceId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].InstanceId"));
			listItem.setTicketId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].TicketId"));
			listItem.setTitle(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Title"));
			listItem.setTemplateId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].TemplateId"));
			listItem.setTemplateVersion(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].TemplateVersion"));
			listItem.setCategoryId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CategoryId"));
			listItem.setCategoryName(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CategoryName"));
			listItem.setStartTime(_ctx.longValue("ListTicketsResponse.Data.List["+ i +"].StartTime"));
			listItem.setEndTime(_ctx.longValue("ListTicketsResponse.Data.List["+ i +"].EndTime"));
			listItem.setState(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].State"));
			listItem.setCloseCode(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CloseCode"));
			listItem.setAssignee(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Assignee"));
			listItem.setComment(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Comment"));
			listItem.setAssigneeName(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].AssigneeName"));
			listItem.setCreator(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Creator"));
			listItem.setCreatorName(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CreatorName"));
			listItem.setContext(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Context"));
			listItem.setCreatedTime(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CreatedTime"));
			listItem.setUpdatedTime(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].UpdatedTime"));
			listItem.setCurrentTaskId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CurrentTaskId"));
			listItem.setCurrentTaskName(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CurrentTaskName"));
			listItem.setCurrentTaskStartTime(_ctx.longValue("ListTicketsResponse.Data.List["+ i +"].CurrentTaskStartTime"));
			listItem.setCustomerId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].CustomerId"));
			listItem.setJobId(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].JobId"));
			listItem.setSource(_ctx.stringValue("ListTicketsResponse.Data.List["+ i +"].Source"));

			list.add(listItem);
		}
		data.setList(list);
		listTicketsResponse.setData(data);
	 
	 	return listTicketsResponse;
	}
}