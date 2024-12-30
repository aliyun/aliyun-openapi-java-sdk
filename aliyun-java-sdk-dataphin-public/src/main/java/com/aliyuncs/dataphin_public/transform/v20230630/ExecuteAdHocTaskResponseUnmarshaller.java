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

import com.aliyuncs.dataphin_public.model.v20230630.ExecuteAdHocTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ExecuteAdHocTaskResponse.ExecuteResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteAdHocTaskResponseUnmarshaller {

	public static ExecuteAdHocTaskResponse unmarshall(ExecuteAdHocTaskResponse executeAdHocTaskResponse, UnmarshallerContext _ctx) {
		
		executeAdHocTaskResponse.setRequestId(_ctx.stringValue("ExecuteAdHocTaskResponse.RequestId"));
		executeAdHocTaskResponse.setSuccess(_ctx.booleanValue("ExecuteAdHocTaskResponse.Success"));
		executeAdHocTaskResponse.setHttpStatusCode(_ctx.integerValue("ExecuteAdHocTaskResponse.HttpStatusCode"));
		executeAdHocTaskResponse.setCode(_ctx.stringValue("ExecuteAdHocTaskResponse.Code"));
		executeAdHocTaskResponse.setMessage(_ctx.stringValue("ExecuteAdHocTaskResponse.Message"));

		ExecuteResult executeResult = new ExecuteResult();
		executeResult.setTaskId(_ctx.stringValue("ExecuteAdHocTaskResponse.ExecuteResult.TaskId"));
		executeResult.setSubTaskCount(_ctx.integerValue("ExecuteAdHocTaskResponse.ExecuteResult.SubTaskCount"));
		executeAdHocTaskResponse.setExecuteResult(executeResult);
	 
	 	return executeAdHocTaskResponse;
	}
}