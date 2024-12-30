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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetAdHocTaskResultResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAdHocTaskResultResponse.ExecuteResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdHocTaskResultResponseUnmarshaller {

	public static GetAdHocTaskResultResponse unmarshall(GetAdHocTaskResultResponse getAdHocTaskResultResponse, UnmarshallerContext _ctx) {
		
		getAdHocTaskResultResponse.setRequestId(_ctx.stringValue("GetAdHocTaskResultResponse.RequestId"));
		getAdHocTaskResultResponse.setSuccess(_ctx.booleanValue("GetAdHocTaskResultResponse.Success"));
		getAdHocTaskResultResponse.setHttpStatusCode(_ctx.integerValue("GetAdHocTaskResultResponse.HttpStatusCode"));
		getAdHocTaskResultResponse.setCode(_ctx.stringValue("GetAdHocTaskResultResponse.Code"));
		getAdHocTaskResultResponse.setMessage(_ctx.stringValue("GetAdHocTaskResultResponse.Message"));

		ExecuteResult executeResult = new ExecuteResult();
		executeResult.setTaskId(_ctx.stringValue("GetAdHocTaskResultResponse.ExecuteResult.TaskId"));
		executeResult.setScheduleTaskId(_ctx.stringValue("GetAdHocTaskResultResponse.ExecuteResult.ScheduleTaskId"));
		executeResult.setResult(_ctx.stringValue("GetAdHocTaskResultResponse.ExecuteResult.Result"));
		getAdHocTaskResultResponse.setExecuteResult(executeResult);
	 
	 	return getAdHocTaskResultResponse;
	}
}