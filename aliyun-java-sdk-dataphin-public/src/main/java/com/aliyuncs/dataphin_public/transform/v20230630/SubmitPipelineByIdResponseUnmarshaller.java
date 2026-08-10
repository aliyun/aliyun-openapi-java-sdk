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

import com.aliyuncs.dataphin_public.model.v20230630.SubmitPipelineByIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitPipelineByIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitPipelineByIdResponseUnmarshaller {

	public static SubmitPipelineByIdResponse unmarshall(SubmitPipelineByIdResponse submitPipelineByIdResponse, UnmarshallerContext _ctx) {
		
		submitPipelineByIdResponse.setRequestId(_ctx.stringValue("SubmitPipelineByIdResponse.RequestId"));
		submitPipelineByIdResponse.setMessage(_ctx.stringValue("SubmitPipelineByIdResponse.Message"));
		submitPipelineByIdResponse.setHttpStatusCode(_ctx.integerValue("SubmitPipelineByIdResponse.HttpStatusCode"));
		submitPipelineByIdResponse.setCode(_ctx.stringValue("SubmitPipelineByIdResponse.Code"));
		submitPipelineByIdResponse.setSuccess(_ctx.booleanValue("SubmitPipelineByIdResponse.Success"));

		Data data = new Data();
		data.setSubmitId(_ctx.longValue("SubmitPipelineByIdResponse.Data.SubmitId"));
		data.setHostMachine(_ctx.stringValue("SubmitPipelineByIdResponse.Data.HostMachine"));
		data.setVersion(_ctx.stringValue("SubmitPipelineByIdResponse.Data.Version"));
		data.setNodeId(_ctx.stringValue("SubmitPipelineByIdResponse.Data.NodeId"));
		data.setPipelineId(_ctx.longValue("SubmitPipelineByIdResponse.Data.PipelineId"));
		submitPipelineByIdResponse.setData(data);
	 
	 	return submitPipelineByIdResponse;
	}
}