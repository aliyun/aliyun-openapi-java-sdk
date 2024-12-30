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

import com.aliyuncs.dataphin_public.model.v20230630.SubmitBatchTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitBatchTaskResponse.SubmitResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitBatchTaskResponseUnmarshaller {

	public static SubmitBatchTaskResponse unmarshall(SubmitBatchTaskResponse submitBatchTaskResponse, UnmarshallerContext _ctx) {
		
		submitBatchTaskResponse.setRequestId(_ctx.stringValue("SubmitBatchTaskResponse.RequestId"));
		submitBatchTaskResponse.setSuccess(_ctx.booleanValue("SubmitBatchTaskResponse.Success"));
		submitBatchTaskResponse.setHttpStatusCode(_ctx.integerValue("SubmitBatchTaskResponse.HttpStatusCode"));
		submitBatchTaskResponse.setCode(_ctx.stringValue("SubmitBatchTaskResponse.Code"));
		submitBatchTaskResponse.setMessage(_ctx.stringValue("SubmitBatchTaskResponse.Message"));

		SubmitResult submitResult = new SubmitResult();
		submitResult.setNodeId(_ctx.stringValue("SubmitBatchTaskResponse.SubmitResult.NodeId"));
		submitResult.setSubmitId(_ctx.longValue("SubmitBatchTaskResponse.SubmitResult.SubmitId"));
		submitBatchTaskResponse.setSubmitResult(submitResult);
	 
	 	return submitBatchTaskResponse;
	}
}