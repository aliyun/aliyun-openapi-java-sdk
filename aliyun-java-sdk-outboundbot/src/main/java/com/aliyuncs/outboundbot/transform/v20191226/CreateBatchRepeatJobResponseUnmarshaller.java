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

import com.aliyuncs.outboundbot.model.v20191226.CreateBatchRepeatJobResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateBatchRepeatJobResponse.JobGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBatchRepeatJobResponseUnmarshaller {

	public static CreateBatchRepeatJobResponse unmarshall(CreateBatchRepeatJobResponse createBatchRepeatJobResponse, UnmarshallerContext _ctx) {
		
		createBatchRepeatJobResponse.setRequestId(_ctx.stringValue("CreateBatchRepeatJobResponse.RequestId"));
		createBatchRepeatJobResponse.setSuccess(_ctx.booleanValue("CreateBatchRepeatJobResponse.Success"));
		createBatchRepeatJobResponse.setCode(_ctx.stringValue("CreateBatchRepeatJobResponse.Code"));
		createBatchRepeatJobResponse.setMessage(_ctx.stringValue("CreateBatchRepeatJobResponse.Message"));
		createBatchRepeatJobResponse.setHttpStatusCode(_ctx.integerValue("CreateBatchRepeatJobResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setId(_ctx.stringValue("CreateBatchRepeatJobResponse.JobGroup.Id"));
		createBatchRepeatJobResponse.setJobGroup(jobGroup);
	 
	 	return createBatchRepeatJobResponse;
	}
}