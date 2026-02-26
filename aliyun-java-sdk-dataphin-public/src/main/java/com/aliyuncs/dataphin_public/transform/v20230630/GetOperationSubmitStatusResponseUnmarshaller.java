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

import com.aliyuncs.dataphin_public.model.v20230630.GetOperationSubmitStatusResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetOperationSubmitStatusResponse.OperationSubmitJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationSubmitStatusResponseUnmarshaller {

	public static GetOperationSubmitStatusResponse unmarshall(GetOperationSubmitStatusResponse getOperationSubmitStatusResponse, UnmarshallerContext _ctx) {
		
		getOperationSubmitStatusResponse.setRequestId(_ctx.stringValue("GetOperationSubmitStatusResponse.RequestId"));
		getOperationSubmitStatusResponse.setSuccess(_ctx.booleanValue("GetOperationSubmitStatusResponse.Success"));
		getOperationSubmitStatusResponse.setHttpStatusCode(_ctx.integerValue("GetOperationSubmitStatusResponse.HttpStatusCode"));
		getOperationSubmitStatusResponse.setCode(_ctx.stringValue("GetOperationSubmitStatusResponse.Code"));
		getOperationSubmitStatusResponse.setMessage(_ctx.stringValue("GetOperationSubmitStatusResponse.Message"));

		OperationSubmitJob operationSubmitJob = new OperationSubmitJob();
		operationSubmitJob.setJobId(_ctx.stringValue("GetOperationSubmitStatusResponse.OperationSubmitJob.JobId"));
		operationSubmitJob.setProgress(_ctx.stringValue("GetOperationSubmitStatusResponse.OperationSubmitJob.Progress"));
		operationSubmitJob.setOperation(_ctx.stringValue("GetOperationSubmitStatusResponse.OperationSubmitJob.Operation"));
		operationSubmitJob.setOperationStatus(_ctx.stringValue("GetOperationSubmitStatusResponse.OperationSubmitJob.OperationStatus"));
		operationSubmitJob.setExternalBizId(_ctx.stringValue("GetOperationSubmitStatusResponse.OperationSubmitJob.ExternalBizId"));
		operationSubmitJob.setOperator(_ctx.stringValue("GetOperationSubmitStatusResponse.OperationSubmitJob.Operator"));
		getOperationSubmitStatusResponse.setOperationSubmitJob(operationSubmitJob);
	 
	 	return getOperationSubmitStatusResponse;
	}
}