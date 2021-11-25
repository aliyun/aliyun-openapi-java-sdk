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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListDownloadTasksResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListDownloadTasksResponse.DownloadTasks;
import com.aliyuncs.outboundbot.model.v20191226.ListDownloadTasksResponse.DownloadTasks.DownloadTask;
import com.aliyuncs.outboundbot.model.v20191226.ListDownloadTasksResponse.DownloadTasks.DownloadTask.DownloadTaskFile0;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDownloadTasksResponseUnmarshaller {

	public static ListDownloadTasksResponse unmarshall(ListDownloadTasksResponse listDownloadTasksResponse, UnmarshallerContext _ctx) {
		
		listDownloadTasksResponse.setRequestId(_ctx.stringValue("ListDownloadTasksResponse.RequestId"));
		listDownloadTasksResponse.setHttpStatusCode(_ctx.integerValue("ListDownloadTasksResponse.HttpStatusCode"));
		listDownloadTasksResponse.setCode(_ctx.stringValue("ListDownloadTasksResponse.Code"));
		listDownloadTasksResponse.setMessage(_ctx.stringValue("ListDownloadTasksResponse.Message"));
		listDownloadTasksResponse.setSuccess(_ctx.booleanValue("ListDownloadTasksResponse.Success"));

		DownloadTasks downloadTasks = new DownloadTasks();
		downloadTasks.setPageNumber(_ctx.integerValue("ListDownloadTasksResponse.DownloadTasks.PageNumber"));
		downloadTasks.setPageSize(_ctx.integerValue("ListDownloadTasksResponse.DownloadTasks.PageSize"));
		downloadTasks.setTotalCount(_ctx.integerValue("ListDownloadTasksResponse.DownloadTasks.TotalCount"));

		List<DownloadTask> list = new ArrayList<DownloadTask>();
		for (int i = 0; i < _ctx.lengthValue("ListDownloadTasksResponse.DownloadTasks.List.Length"); i++) {
			DownloadTask downloadTask = new DownloadTask();
			downloadTask.setStatus(_ctx.stringValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].Status"));
			downloadTask.setTitle(_ctx.stringValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].Title"));
			downloadTask.setExpireTime(_ctx.longValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].ExpireTime"));
			downloadTask.setTaskId(_ctx.stringValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].TaskId"));

			List<DownloadTaskFile0> downloadTaskFiles = new ArrayList<DownloadTaskFile0>();
			for (int j = 0; j < _ctx.lengthValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].DownloadTaskFiles.Length"); j++) {
				DownloadTaskFile0 downloadTaskFile0 = new DownloadTaskFile0();
				downloadTaskFile0.setStatus(_ctx.stringValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].DownloadTaskFiles["+ j +"].Status"));
				downloadTaskFile0.setTitle(_ctx.stringValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].DownloadTaskFiles["+ j +"].Title"));
				downloadTaskFile0.setProgress(_ctx.integerValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].DownloadTaskFiles["+ j +"].Progress"));
				downloadTaskFile0.setFileId(_ctx.stringValue("ListDownloadTasksResponse.DownloadTasks.List["+ i +"].DownloadTaskFiles["+ j +"].FileId"));

				downloadTaskFiles.add(downloadTaskFile0);
			}
			downloadTask.setDownloadTaskFiles(downloadTaskFiles);

			list.add(downloadTask);
		}
		downloadTasks.setList(list);
		listDownloadTasksResponse.setDownloadTasks(downloadTasks);
	 
	 	return listDownloadTasksResponse;
	}
}