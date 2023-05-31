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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.ExportAnnotationsResponse;
import com.aliyuncs.openitag.model.v20220616.ExportAnnotationsResponse.FlowJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportAnnotationsResponseUnmarshaller {

	public static ExportAnnotationsResponse unmarshall(ExportAnnotationsResponse exportAnnotationsResponse, UnmarshallerContext _ctx) {
		
		exportAnnotationsResponse.setRequestId(_ctx.stringValue("ExportAnnotationsResponse.RequestId"));
		exportAnnotationsResponse.setCode(_ctx.integerValue("ExportAnnotationsResponse.Code"));
		exportAnnotationsResponse.setMessage(_ctx.stringValue("ExportAnnotationsResponse.Message"));
		exportAnnotationsResponse.setDetails(_ctx.stringValue("ExportAnnotationsResponse.Details"));
		exportAnnotationsResponse.setSuccess(_ctx.booleanValue("ExportAnnotationsResponse.Success"));
		exportAnnotationsResponse.setErrorCode(_ctx.stringValue("ExportAnnotationsResponse.ErrorCode"));

		FlowJob flowJob = new FlowJob();
		flowJob.setJobId(_ctx.stringValue("ExportAnnotationsResponse.FlowJob.JobId"));
		flowJob.setJobType(_ctx.stringValue("ExportAnnotationsResponse.FlowJob.JobType"));
		flowJob.setProcessType(_ctx.stringValue("ExportAnnotationsResponse.FlowJob.ProcessType"));
		flowJob.setMessageId(_ctx.stringValue("ExportAnnotationsResponse.FlowJob.MessageId"));
		flowJob.setTaskId(_ctx.stringValue("ExportAnnotationsResponse.FlowJob.TaskId"));
		flowJob.setDisplay(_ctx.booleanValue("ExportAnnotationsResponse.FlowJob.Display"));
		exportAnnotationsResponse.setFlowJob(flowJob);
	 
	 	return exportAnnotationsResponse;
	}
}