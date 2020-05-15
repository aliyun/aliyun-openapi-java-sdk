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

import com.aliyuncs.outboundbot.model.v20191226.ResumeJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeJobsResponseUnmarshaller {

	public static ResumeJobsResponse unmarshall(ResumeJobsResponse resumeJobsResponse, UnmarshallerContext _ctx) {
		
		resumeJobsResponse.setRequestId(_ctx.stringValue("ResumeJobsResponse.RequestId"));
		resumeJobsResponse.setSuccess(_ctx.booleanValue("ResumeJobsResponse.Success"));
		resumeJobsResponse.setCode(_ctx.stringValue("ResumeJobsResponse.Code"));
		resumeJobsResponse.setMessage(_ctx.stringValue("ResumeJobsResponse.Message"));
		resumeJobsResponse.setHttpStatusCode(_ctx.integerValue("ResumeJobsResponse.HttpStatusCode"));
	 
	 	return resumeJobsResponse;
	}
}