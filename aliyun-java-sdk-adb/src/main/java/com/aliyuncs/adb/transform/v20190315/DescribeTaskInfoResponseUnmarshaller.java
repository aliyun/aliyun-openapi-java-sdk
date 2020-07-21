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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.DescribeTaskInfoResponse;
import com.aliyuncs.adb.model.v20190315.DescribeTaskInfoResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskInfoResponseUnmarshaller {

	public static DescribeTaskInfoResponse unmarshall(DescribeTaskInfoResponse describeTaskInfoResponse, UnmarshallerContext _ctx) {
		
		describeTaskInfoResponse.setRequestId(_ctx.stringValue("DescribeTaskInfoResponse.RequestId"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setTaskId(_ctx.integerValue("DescribeTaskInfoResponse.TaskInfo.TaskId"));
		taskInfo.setBeginTime(_ctx.stringValue("DescribeTaskInfoResponse.TaskInfo.BeginTime"));
		taskInfo.setFinishTime(_ctx.stringValue("DescribeTaskInfoResponse.TaskInfo.FinishTime"));
		taskInfo.setProgress(_ctx.stringValue("DescribeTaskInfoResponse.TaskInfo.Progress"));
		taskInfo.setStatus(_ctx.stringValue("DescribeTaskInfoResponse.TaskInfo.Status"));
		describeTaskInfoResponse.setTaskInfo(taskInfo);
	 
	 	return describeTaskInfoResponse;
	}
}