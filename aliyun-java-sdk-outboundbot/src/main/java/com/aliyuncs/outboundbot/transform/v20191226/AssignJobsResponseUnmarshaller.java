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

import com.aliyuncs.outboundbot.model.v20191226.AssignJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignJobsResponseUnmarshaller {

	public static AssignJobsResponse unmarshall(AssignJobsResponse assignJobsResponse, UnmarshallerContext _ctx) {
		
		assignJobsResponse.setRequestId(_ctx.stringValue("AssignJobsResponse.RequestId"));
		assignJobsResponse.setSuccess(_ctx.booleanValue("AssignJobsResponse.Success"));
		assignJobsResponse.setCode(_ctx.stringValue("AssignJobsResponse.Code"));
		assignJobsResponse.setMessage(_ctx.stringValue("AssignJobsResponse.Message"));
		assignJobsResponse.setHttpStatusCode(_ctx.integerValue("AssignJobsResponse.HttpStatusCode"));
		assignJobsResponse.setJobGroupId(_ctx.stringValue("AssignJobsResponse.JobGroupId"));
	 
	 	return assignJobsResponse;
	}
}