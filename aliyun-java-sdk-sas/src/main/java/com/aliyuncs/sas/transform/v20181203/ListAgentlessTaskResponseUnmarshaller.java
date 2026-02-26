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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListAgentlessTaskResponse;
import com.aliyuncs.sas.model.v20181203.ListAgentlessTaskResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListAgentlessTaskResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentlessTaskResponseUnmarshaller {

	public static ListAgentlessTaskResponse unmarshall(ListAgentlessTaskResponse listAgentlessTaskResponse, UnmarshallerContext _ctx) {
		
		listAgentlessTaskResponse.setRequestId(_ctx.stringValue("ListAgentlessTaskResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListAgentlessTaskResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListAgentlessTaskResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListAgentlessTaskResponse.PageInfo.TotalCount"));
		listAgentlessTaskResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentlessTaskResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTaskId(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].TaskId"));
			listItem.setTaskName(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].TaskName"));
			listItem.setTargetType(_ctx.integerValue("ListAgentlessTaskResponse.List["+ i +"].TargetType"));
			listItem.setStatus(_ctx.integerValue("ListAgentlessTaskResponse.List["+ i +"].Status"));
			listItem.setProgress(_ctx.integerValue("ListAgentlessTaskResponse.List["+ i +"].Progress"));
			listItem.setStartTime(_ctx.longValue("ListAgentlessTaskResponse.List["+ i +"].StartTime"));
			listItem.setEndTime(_ctx.longValue("ListAgentlessTaskResponse.List["+ i +"].EndTime"));
			listItem.setResult(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].Result"));
			listItem.setUuid(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].Uuid"));
			listItem.setInternetIp(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].InternetIp"));
			listItem.setIntranetIp(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].IntranetIp"));
			listItem.setInstanceName(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].InstanceName"));
			listItem.setTargetName(_ctx.stringValue("ListAgentlessTaskResponse.List["+ i +"].TargetName"));

			list.add(listItem);
		}
		listAgentlessTaskResponse.setList(list);
	 
	 	return listAgentlessTaskResponse;
	}
}