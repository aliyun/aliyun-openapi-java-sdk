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

import com.aliyuncs.sas.model.v20181203.GetOnceTaskResultInfoResponse;
import com.aliyuncs.sas.model.v20181203.GetOnceTaskResultInfoResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOnceTaskResultInfoResponseUnmarshaller {

	public static GetOnceTaskResultInfoResponse unmarshall(GetOnceTaskResultInfoResponse getOnceTaskResultInfoResponse, UnmarshallerContext _ctx) {
		
		getOnceTaskResultInfoResponse.setRequestId(_ctx.stringValue("GetOnceTaskResultInfoResponse.RequestId"));
		getOnceTaskResultInfoResponse.setCollectTime(_ctx.longValue("GetOnceTaskResultInfoResponse.CollectTime"));
		getOnceTaskResultInfoResponse.setTotalCount(_ctx.integerValue("GetOnceTaskResultInfoResponse.TotalCount"));
		getOnceTaskResultInfoResponse.setTaskId(_ctx.longValue("GetOnceTaskResultInfoResponse.TaskId"));
		getOnceTaskResultInfoResponse.setFinishCount(_ctx.integerValue("GetOnceTaskResultInfoResponse.FinishCount"));
		getOnceTaskResultInfoResponse.setFailedCount(_ctx.integerValue("GetOnceTaskResultInfoResponse.FailedCount"));
		getOnceTaskResultInfoResponse.setSuccessCount(_ctx.integerValue("GetOnceTaskResultInfoResponse.SuccessCount"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setStatus(_ctx.stringValue("GetOnceTaskResultInfoResponse.TaskInfo.Status"));
		getOnceTaskResultInfoResponse.setTaskInfo(taskInfo);
	 
	 	return getOnceTaskResultInfoResponse;
	}
}