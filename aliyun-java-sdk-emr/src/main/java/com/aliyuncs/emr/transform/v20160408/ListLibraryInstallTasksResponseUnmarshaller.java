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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListLibraryInstallTasksResponse;
import com.aliyuncs.emr.model.v20160408.ListLibraryInstallTasksResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLibraryInstallTasksResponseUnmarshaller {

	public static ListLibraryInstallTasksResponse unmarshall(ListLibraryInstallTasksResponse listLibraryInstallTasksResponse, UnmarshallerContext _ctx) {
		
		listLibraryInstallTasksResponse.setRequestId(_ctx.stringValue("ListLibraryInstallTasksResponse.RequestId"));
		listLibraryInstallTasksResponse.setPageNumber(_ctx.integerValue("ListLibraryInstallTasksResponse.PageNumber"));
		listLibraryInstallTasksResponse.setPageSize(_ctx.integerValue("ListLibraryInstallTasksResponse.PageSize"));
		listLibraryInstallTasksResponse.setTotalCount(_ctx.integerValue("ListLibraryInstallTasksResponse.TotalCount"));
		listLibraryInstallTasksResponse.setNextToken(_ctx.stringValue("ListLibraryInstallTasksResponse.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListLibraryInstallTasksResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setLibraryBizId(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].LibraryBizId"));
			item.setTaskGroupId(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].TaskGroupId"));
			item.setTaskId(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].TaskId"));
			item.setTaskStatus(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].TaskStatus"));
			item.setStartTime(_ctx.longValue("ListLibraryInstallTasksResponse.Items["+ i +"].StartTime"));
			item.setEndTime(_ctx.longValue("ListLibraryInstallTasksResponse.Items["+ i +"].EndTime"));
			item.setExecuteTime(_ctx.longValue("ListLibraryInstallTasksResponse.Items["+ i +"].ExecuteTime"));
			item.setTaskProcess(_ctx.integerValue("ListLibraryInstallTasksResponse.Items["+ i +"].TaskProcess"));
			item.setTaskType(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].TaskType"));
			item.setDetail(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].Detail"));
			item.setClusterBizId(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].ClusterBizId"));
			item.setHostname(_ctx.stringValue("ListLibraryInstallTasksResponse.Items["+ i +"].Hostname"));

			items.add(item);
		}
		listLibraryInstallTasksResponse.setItems(items);
	 
	 	return listLibraryInstallTasksResponse;
	}
}