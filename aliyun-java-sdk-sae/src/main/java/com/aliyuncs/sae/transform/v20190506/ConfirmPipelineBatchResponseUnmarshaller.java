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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.ConfirmPipelineBatchResponse;
import com.aliyuncs.sae.model.v20190506.ConfirmPipelineBatchResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmPipelineBatchResponseUnmarshaller {

	public static ConfirmPipelineBatchResponse unmarshall(ConfirmPipelineBatchResponse confirmPipelineBatchResponse, UnmarshallerContext _ctx) {
		
		confirmPipelineBatchResponse.setRequestId(_ctx.stringValue("ConfirmPipelineBatchResponse.RequestId"));
		confirmPipelineBatchResponse.setCode(_ctx.stringValue("ConfirmPipelineBatchResponse.Code"));
		confirmPipelineBatchResponse.setErrorCode(_ctx.stringValue("ConfirmPipelineBatchResponse.ErrorCode"));
		confirmPipelineBatchResponse.setMessage(_ctx.stringValue("ConfirmPipelineBatchResponse.Message"));
		confirmPipelineBatchResponse.setSuccess(_ctx.booleanValue("ConfirmPipelineBatchResponse.Success"));
		confirmPipelineBatchResponse.setTraceId(_ctx.stringValue("ConfirmPipelineBatchResponse.TraceId"));

		Data data = new Data();
		data.setPipelineId(_ctx.stringValue("ConfirmPipelineBatchResponse.Data.PipelineId"));
		confirmPipelineBatchResponse.setData(data);
	 
	 	return confirmPipelineBatchResponse;
	}
}