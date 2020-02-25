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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.StartTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTaskResponseUnmarshaller {

	public static StartTaskResponse unmarshall(StartTaskResponse startTaskResponse, UnmarshallerContext _ctx) {
		
		startTaskResponse.setRequestId(_ctx.stringValue("StartTaskResponse.RequestId"));
		startTaskResponse.setSuccess(_ctx.booleanValue("StartTaskResponse.Success"));
		startTaskResponse.setErrCode(_ctx.stringValue("StartTaskResponse.ErrCode"));
		startTaskResponse.setErrMessage(_ctx.stringValue("StartTaskResponse.ErrMessage"));
		startTaskResponse.setHttpStatusCode(_ctx.integerValue("StartTaskResponse.HttpStatusCode"));
		startTaskResponse.setTaskId(_ctx.stringValue("StartTaskResponse.TaskId"));
		startTaskResponse.setJobTypeName(_ctx.stringValue("StartTaskResponse.JobTypeName"));
	 
	 	return startTaskResponse;
	}
}