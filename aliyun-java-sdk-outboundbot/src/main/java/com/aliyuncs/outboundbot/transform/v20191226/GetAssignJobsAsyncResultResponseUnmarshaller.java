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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.GetAssignJobsAsyncResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssignJobsAsyncResultResponseUnmarshaller {

	public static GetAssignJobsAsyncResultResponse unmarshall(GetAssignJobsAsyncResultResponse getAssignJobsAsyncResultResponse, UnmarshallerContext _ctx) {
		
		getAssignJobsAsyncResultResponse.setRequestId(_ctx.stringValue("GetAssignJobsAsyncResultResponse.RequestId"));
		getAssignJobsAsyncResultResponse.setTimeout(_ctx.booleanValue("GetAssignJobsAsyncResultResponse.Timeout"));
		getAssignJobsAsyncResultResponse.setHttpStatusCode(_ctx.integerValue("GetAssignJobsAsyncResultResponse.HttpStatusCode"));
		getAssignJobsAsyncResultResponse.setSuccess(_ctx.booleanValue("GetAssignJobsAsyncResultResponse.Success"));
		getAssignJobsAsyncResultResponse.setValid(_ctx.booleanValue("GetAssignJobsAsyncResultResponse.Valid"));
		getAssignJobsAsyncResultResponse.setCode(_ctx.stringValue("GetAssignJobsAsyncResultResponse.Code"));
		getAssignJobsAsyncResultResponse.setMessage(_ctx.stringValue("GetAssignJobsAsyncResultResponse.Message"));
		getAssignJobsAsyncResultResponse.setJobGroupId(_ctx.stringValue("GetAssignJobsAsyncResultResponse.JobGroupId"));

		List<String> jobsId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAssignJobsAsyncResultResponse.JobsId.Length"); i++) {
			jobsId.add(_ctx.stringValue("GetAssignJobsAsyncResultResponse.JobsId["+ i +"]"));
		}
		getAssignJobsAsyncResultResponse.setJobsId(jobsId);
	 
	 	return getAssignJobsAsyncResultResponse;
	}
}