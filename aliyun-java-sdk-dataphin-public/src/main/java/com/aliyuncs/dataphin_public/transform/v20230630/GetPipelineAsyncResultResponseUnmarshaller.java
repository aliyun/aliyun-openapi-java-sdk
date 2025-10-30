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

import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineAsyncResultResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPipelineAsyncResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineAsyncResultResponseUnmarshaller {

	public static GetPipelineAsyncResultResponse unmarshall(GetPipelineAsyncResultResponse getPipelineAsyncResultResponse, UnmarshallerContext _ctx) {
		
		getPipelineAsyncResultResponse.setRequestId(_ctx.stringValue("GetPipelineAsyncResultResponse.RequestId"));
		getPipelineAsyncResultResponse.setMessage(_ctx.stringValue("GetPipelineAsyncResultResponse.Message"));
		getPipelineAsyncResultResponse.setHttpStatusCode(_ctx.integerValue("GetPipelineAsyncResultResponse.HttpStatusCode"));
		getPipelineAsyncResultResponse.setCode(_ctx.stringValue("GetPipelineAsyncResultResponse.Code"));
		getPipelineAsyncResultResponse.setSuccess(_ctx.booleanValue("GetPipelineAsyncResultResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetPipelineAsyncResultResponse.Data.Status"));
		data.setSubmitId(_ctx.longValue("GetPipelineAsyncResultResponse.Data.SubmitId"));
		data.setHostMachine(_ctx.stringValue("GetPipelineAsyncResultResponse.Data.HostMachine"));
		data.setVersion(_ctx.stringValue("GetPipelineAsyncResultResponse.Data.Version"));
		data.setNodeId(_ctx.stringValue("GetPipelineAsyncResultResponse.Data.NodeId"));
		data.setAsyncId(_ctx.longValue("GetPipelineAsyncResultResponse.Data.AsyncId"));
		data.setPipelineId(_ctx.longValue("GetPipelineAsyncResultResponse.Data.PipelineId"));
		data.setErrorCode(_ctx.stringValue("GetPipelineAsyncResultResponse.Data.ErrorCode"));
		data.setErrorMessage(_ctx.stringValue("GetPipelineAsyncResultResponse.Data.ErrorMessage"));
		getPipelineAsyncResultResponse.setData(data);
	 
	 	return getPipelineAsyncResultResponse;
	}
}