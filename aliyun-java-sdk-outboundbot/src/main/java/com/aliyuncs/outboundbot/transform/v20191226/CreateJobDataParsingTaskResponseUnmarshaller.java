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

import com.aliyuncs.outboundbot.model.v20191226.CreateJobDataParsingTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobDataParsingTaskResponseUnmarshaller {

	public static CreateJobDataParsingTaskResponse unmarshall(CreateJobDataParsingTaskResponse createJobDataParsingTaskResponse, UnmarshallerContext _ctx) {
		
		createJobDataParsingTaskResponse.setRequestId(_ctx.stringValue("CreateJobDataParsingTaskResponse.RequestId"));
		createJobDataParsingTaskResponse.setSuccess(_ctx.booleanValue("CreateJobDataParsingTaskResponse.Success"));
		createJobDataParsingTaskResponse.setCode(_ctx.stringValue("CreateJobDataParsingTaskResponse.Code"));
		createJobDataParsingTaskResponse.setMessage(_ctx.stringValue("CreateJobDataParsingTaskResponse.Message"));
		createJobDataParsingTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateJobDataParsingTaskResponse.HttpStatusCode"));
		createJobDataParsingTaskResponse.setJobDataParsingTaskId(_ctx.stringValue("CreateJobDataParsingTaskResponse.JobDataParsingTaskId"));
	 
	 	return createJobDataParsingTaskResponse;
	}
}