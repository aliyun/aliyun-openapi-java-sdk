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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeDataFlowTasksResponse;
import com.aliyuncs.nas.model.v20170626.DescribeDataFlowTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataFlowTasksResponseUnmarshaller {

	public static DescribeDataFlowTasksResponse unmarshall(DescribeDataFlowTasksResponse describeDataFlowTasksResponse, UnmarshallerContext _ctx) {
		
		describeDataFlowTasksResponse.setRequestId(_ctx.stringValue("DescribeDataFlowTasksResponse.RequestId"));
		describeDataFlowTasksResponse.setNextToken(_ctx.stringValue("DescribeDataFlowTasksResponse.NextToken"));

		List<Task> taskInfo = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataFlowTasksResponse.TaskInfo.Length"); i++) {
			Task task = new Task();
			task.setFilesystemId(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].FilesystemId"));
			task.setDataFlowId(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].DataFlowId"));
			task.setTaskId(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].TaskId"));
			task.setSourceStorage(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].SourceStorage"));
			task.setFileSystemPath(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].FileSystemPath"));
			task.setOriginator(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].Originator"));
			task.setTaskAction(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].TaskAction"));
			task.setDataType(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].DataType"));
			task.setProgress(_ctx.longValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].Progress"));
			task.setStatus(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].Status"));
			task.setReportPath(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].ReportPath"));
			task.setCreateTime(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].CreateTime"));
			task.setStartTime(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].StartTime"));
			task.setEndTime(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].EndTime"));
			task.setFsPath(_ctx.stringValue("DescribeDataFlowTasksResponse.TaskInfo["+ i +"].FsPath"));

			taskInfo.add(task);
		}
		describeDataFlowTasksResponse.setTaskInfo(taskInfo);
	 
	 	return describeDataFlowTasksResponse;
	}
}