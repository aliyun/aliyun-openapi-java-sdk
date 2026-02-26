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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.AssignJobsAsyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignJobsAsyncResponseUnmarshaller {

	public static AssignJobsAsyncResponse unmarshall(AssignJobsAsyncResponse assignJobsAsyncResponse, UnmarshallerContext _ctx) {
		
		assignJobsAsyncResponse.setRequestId(_ctx.stringValue("AssignJobsAsyncResponse.RequestId"));
		assignJobsAsyncResponse.setHttpStatusCode(_ctx.integerValue("AssignJobsAsyncResponse.HttpStatusCode"));
		assignJobsAsyncResponse.setSuccess(_ctx.booleanValue("AssignJobsAsyncResponse.Success"));
		assignJobsAsyncResponse.setCode(_ctx.stringValue("AssignJobsAsyncResponse.Code"));
		assignJobsAsyncResponse.setMessage(_ctx.stringValue("AssignJobsAsyncResponse.Message"));
		assignJobsAsyncResponse.setAsyncTaskId(_ctx.stringValue("AssignJobsAsyncResponse.AsyncTaskId"));
	 
	 	return assignJobsAsyncResponse;
	}
}