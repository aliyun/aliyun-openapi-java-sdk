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

import com.aliyuncs.ccc.model.v20200701.ListTicketTasksResponse;
import com.aliyuncs.ccc.model.v20200701.ListTicketTasksResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketTasksResponseUnmarshaller {

	public static ListTicketTasksResponse unmarshall(ListTicketTasksResponse listTicketTasksResponse, UnmarshallerContext _ctx) {
		
		listTicketTasksResponse.setRequestId(_ctx.stringValue("ListTicketTasksResponse.RequestId"));
		listTicketTasksResponse.setHttpStatusCode(_ctx.integerValue("ListTicketTasksResponse.HttpStatusCode"));
		listTicketTasksResponse.setCode(_ctx.stringValue("ListTicketTasksResponse.Code"));
		listTicketTasksResponse.setMessage(_ctx.stringValue("ListTicketTasksResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketTasksResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListTicketTasksResponse.Params["+ i +"]"));
		}
		listTicketTasksResponse.setParams(params);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketTasksResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskName(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].TaskName"));
			dataItem.setAssignee(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].Assignee"));
			dataItem.setComment(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].Comment"));
			dataItem.setStartTime(_ctx.longValue("ListTicketTasksResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.longValue("ListTicketTasksResponse.Data["+ i +"].EndTime"));
			dataItem.setAssigneeName(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].AssigneeName"));
			dataItem.setTaskId(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].TaskId"));
			dataItem.setTicketId(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].TicketId"));
			dataItem.setInstanceId(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].InstanceId"));
			dataItem.setTaskDefinitionNodeId(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].TaskDefinitionNodeId"));
			dataItem.setTaskDefinitionNodeType(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].TaskDefinitionNodeType"));
			dataItem.setAction(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].Action"));

			List<String> fileKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTicketTasksResponse.Data["+ i +"].FileKeys.Length"); j++) {
				fileKeys.add(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].FileKeys["+ j +"]"));
			}
			dataItem.setFileKeys(fileKeys);

			List<String> fileUrls = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTicketTasksResponse.Data["+ i +"].FileUrls.Length"); j++) {
				fileUrls.add(_ctx.stringValue("ListTicketTasksResponse.Data["+ i +"].FileUrls["+ j +"]"));
			}
			dataItem.setFileUrls(fileUrls);

			data.add(dataItem);
		}
		listTicketTasksResponse.setData(data);
	 
	 	return listTicketTasksResponse;
	}
}