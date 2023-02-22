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

import com.aliyuncs.sas.model.v20181203.GetLastOnceTaskInfoResponse;
import com.aliyuncs.sas.model.v20181203.GetLastOnceTaskInfoResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLastOnceTaskInfoResponseUnmarshaller {

	public static GetLastOnceTaskInfoResponse unmarshall(GetLastOnceTaskInfoResponse getLastOnceTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getLastOnceTaskInfoResponse.setRequestId(_ctx.stringValue("GetLastOnceTaskInfoResponse.RequestId"));
		getLastOnceTaskInfoResponse.setCollectTime(_ctx.longValue("GetLastOnceTaskInfoResponse.CollectTime"));
		getLastOnceTaskInfoResponse.setTotalCount(_ctx.integerValue("GetLastOnceTaskInfoResponse.TotalCount"));
		getLastOnceTaskInfoResponse.setTaskId(_ctx.longValue("GetLastOnceTaskInfoResponse.TaskId"));
		getLastOnceTaskInfoResponse.setFinishCount(_ctx.integerValue("GetLastOnceTaskInfoResponse.FinishCount"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setStatus(_ctx.stringValue("GetLastOnceTaskInfoResponse.TaskInfo.Status"));
		taskInfo.setProgress(_ctx.integerValue("GetLastOnceTaskInfoResponse.TaskInfo.Progress"));
		taskInfo.setResult(_ctx.stringValue("GetLastOnceTaskInfoResponse.TaskInfo.Result"));
		getLastOnceTaskInfoResponse.setTaskInfo(taskInfo);
	 
	 	return getLastOnceTaskInfoResponse;
	}
}