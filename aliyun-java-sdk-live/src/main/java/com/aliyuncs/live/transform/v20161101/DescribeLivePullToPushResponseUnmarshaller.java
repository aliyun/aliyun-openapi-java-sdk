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

import com.aliyuncs.live.model.v20161101.DescribeLivePullToPushResponse;
import com.aliyuncs.live.model.v20161101.DescribeLivePullToPushResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePullToPushResponseUnmarshaller {

	public static DescribeLivePullToPushResponse unmarshall(DescribeLivePullToPushResponse describeLivePullToPushResponse, UnmarshallerContext _ctx) {
		
		describeLivePullToPushResponse.setRequestId(_ctx.stringValue("DescribeLivePullToPushResponse.RequestId"));
		describeLivePullToPushResponse.setRetCode(_ctx.integerValue("DescribeLivePullToPushResponse.RetCode"));
		describeLivePullToPushResponse.setDescription(_ctx.stringValue("DescribeLivePullToPushResponse.Description"));
		describeLivePullToPushResponse.setTaskId(_ctx.stringValue("DescribeLivePullToPushResponse.TaskId"));
		describeLivePullToPushResponse.setTaskStatus(_ctx.integerValue("DescribeLivePullToPushResponse.TaskStatus"));
		describeLivePullToPushResponse.setTaskInvalidReason(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInvalidReason"));
		describeLivePullToPushResponse.setTaskExitTime(_ctx.integerValue("DescribeLivePullToPushResponse.TaskExitTime"));
		describeLivePullToPushResponse.setTaskExitReason(_ctx.stringValue("DescribeLivePullToPushResponse.TaskExitReason"));
		describeLivePullToPushResponse.setCurrentOffset(_ctx.integerValue("DescribeLivePullToPushResponse.CurrentOffset"));
		describeLivePullToPushResponse.setCurrentFileIndex(_ctx.integerValue("DescribeLivePullToPushResponse.CurrentFileIndex"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setTaskId(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.TaskId"));
		taskInfo.setTaskName(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.TaskName"));
		taskInfo.setStartTime(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.StartTime"));
		taskInfo.setEndTime(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.EndTime"));
		taskInfo.setSourceType(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.SourceType"));
		taskInfo.setSourceProtocol(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.SourceProtocol"));
		taskInfo.setDstUrl(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.DstUrl"));
		taskInfo.setCallbackURL(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.CallbackURL"));
		taskInfo.setOffset(_ctx.integerValue("DescribeLivePullToPushResponse.TaskInfo.Offset"));
		taskInfo.setFileIndex(_ctx.integerValue("DescribeLivePullToPushResponse.TaskInfo.FileIndex"));
		taskInfo.setRetryCount(_ctx.integerValue("DescribeLivePullToPushResponse.TaskInfo.RetryCount"));
		taskInfo.setRetryInterval(_ctx.integerValue("DescribeLivePullToPushResponse.TaskInfo.RetryInterval"));

		List<String> sourceUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLivePullToPushResponse.TaskInfo.SourceUrls.Length"); i++) {
			sourceUrls.add(_ctx.stringValue("DescribeLivePullToPushResponse.TaskInfo.SourceUrls["+ i +"]"));
		}
		taskInfo.setSourceUrls(sourceUrls);
		describeLivePullToPushResponse.setTaskInfo(taskInfo);
	 
	 	return describeLivePullToPushResponse;
	}
}