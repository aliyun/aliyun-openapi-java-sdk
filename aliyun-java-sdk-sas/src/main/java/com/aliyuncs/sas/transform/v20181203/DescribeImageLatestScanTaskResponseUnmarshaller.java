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

import com.aliyuncs.sas.model.v20181203.DescribeImageLatestScanTaskResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageLatestScanTaskResponse.ImageScanTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageLatestScanTaskResponseUnmarshaller {

	public static DescribeImageLatestScanTaskResponse unmarshall(DescribeImageLatestScanTaskResponse describeImageLatestScanTaskResponse, UnmarshallerContext _ctx) {
		
		describeImageLatestScanTaskResponse.setRequestId(_ctx.stringValue("DescribeImageLatestScanTaskResponse.RequestId"));

		List<ImageScanTask> task = new ArrayList<ImageScanTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageLatestScanTaskResponse.Task.Length"); i++) {
			ImageScanTask imageScanTask = new ImageScanTask();
			imageScanTask.setStatus(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Status"));
			imageScanTask.setModified(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Modified"));
			imageScanTask.setFinishTime(_ctx.longValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].FinishTime"));
			imageScanTask.setCreate(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Create"));
			imageScanTask.setFinish(_ctx.integerValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Finish"));
			imageScanTask.setAliUid(_ctx.longValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].AliUid"));
			imageScanTask.setSource(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Source"));
			imageScanTask.setStartTime(_ctx.longValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].StartTime"));
			imageScanTask.setTaskType(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].TaskType"));
			imageScanTask.setName(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Name"));
			imageScanTask.setTaskId(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].TaskId"));
			imageScanTask.setTarget(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Target"));
			imageScanTask.setId(_ctx.longValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].Id"));
			imageScanTask.setTargetType(_ctx.stringValue("DescribeImageLatestScanTaskResponse.Task["+ i +"].TargetType"));

			task.add(imageScanTask);
		}
		describeImageLatestScanTaskResponse.setTask(task);
	 
	 	return describeImageLatestScanTaskResponse;
	}
}