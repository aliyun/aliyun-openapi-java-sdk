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

import com.aliyuncs.live.model.v20161101.DescribeLivePullToPushListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLivePullToPushListResponse.TaskListItem;
import com.aliyuncs.live.model.v20161101.DescribeLivePullToPushListResponse.TaskListItem.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePullToPushListResponseUnmarshaller {

	public static DescribeLivePullToPushListResponse unmarshall(DescribeLivePullToPushListResponse describeLivePullToPushListResponse, UnmarshallerContext _ctx) {
		
		describeLivePullToPushListResponse.setRequestId(_ctx.stringValue("DescribeLivePullToPushListResponse.RequestId"));
		describeLivePullToPushListResponse.setTotal(_ctx.integerValue("DescribeLivePullToPushListResponse.Total"));
		describeLivePullToPushListResponse.setPageNumber(_ctx.integerValue("DescribeLivePullToPushListResponse.PageNumber"));
		describeLivePullToPushListResponse.setPageSize(_ctx.integerValue("DescribeLivePullToPushListResponse.PageSize"));

		List<TaskListItem> taskList = new ArrayList<TaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLivePullToPushListResponse.TaskList.Length"); i++) {
			TaskListItem taskListItem = new TaskListItem();
			taskListItem.setTaskId(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskId"));
			taskListItem.setTaskStatus(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskStatus"));
			taskListItem.setTaskInvalidReason(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInvalidReason"));
			taskListItem.setTaskExitTime(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskExitTime"));
			taskListItem.setTaskExitReason(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskExitReason"));
			taskListItem.setCurrentOffset(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].CurrentOffset"));
			taskListItem.setCurrentFileIndex(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].CurrentFileIndex"));

			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setTaskId(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.TaskId"));
			taskInfo.setTaskName(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.TaskName"));
			taskInfo.setStartTime(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.StartTime"));
			taskInfo.setEndTime(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.EndTime"));
			taskInfo.setSourceType(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.SourceType"));
			taskInfo.setSourceProtocol(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.SourceProtocol"));
			taskInfo.setDstUrl(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.DstUrl"));
			taskInfo.setCallbackURL(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.CallbackURL"));
			taskInfo.setOffset(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.Offset"));
			taskInfo.setFileIndex(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.FileIndex"));
			taskInfo.setRetryCount(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.RetryCount"));
			taskInfo.setRetryInterval(_ctx.integerValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.RetryInterval"));

			List<String> sourceUrls = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.SourceUrls.Length"); j++) {
				sourceUrls.add(_ctx.stringValue("DescribeLivePullToPushListResponse.TaskList["+ i +"].TaskInfo.SourceUrls["+ j +"]"));
			}
			taskInfo.setSourceUrls(sourceUrls);
			taskListItem.setTaskInfo(taskInfo);

			taskList.add(taskListItem);
		}
		describeLivePullToPushListResponse.setTaskList(taskList);
	 
	 	return describeLivePullToPushListResponse;
	}
}