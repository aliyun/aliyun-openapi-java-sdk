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

import com.aliyuncs.dataphin_public.model.v20230630.CreatePipelineResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreatePipelineResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePipelineResponseUnmarshaller {

	public static CreatePipelineResponse unmarshall(CreatePipelineResponse createPipelineResponse, UnmarshallerContext _ctx) {
		
		createPipelineResponse.setRequestId(_ctx.stringValue("CreatePipelineResponse.RequestId"));
		createPipelineResponse.setMessage(_ctx.stringValue("CreatePipelineResponse.Message"));
		createPipelineResponse.setHttpStatusCode(_ctx.integerValue("CreatePipelineResponse.HttpStatusCode"));
		createPipelineResponse.setCode(_ctx.stringValue("CreatePipelineResponse.Code"));
		createPipelineResponse.setSuccess(_ctx.booleanValue("CreatePipelineResponse.Success"));

		Data data = new Data();
		data.setSubmitId(_ctx.longValue("CreatePipelineResponse.Data.SubmitId"));
		data.setHostMachine(_ctx.stringValue("CreatePipelineResponse.Data.HostMachine"));
		data.setVersion(_ctx.stringValue("CreatePipelineResponse.Data.Version"));
		data.setNodeId(_ctx.stringValue("CreatePipelineResponse.Data.NodeId"));
		data.setPipelineId(_ctx.longValue("CreatePipelineResponse.Data.PipelineId"));
		createPipelineResponse.setData(data);
	 
	 	return createPipelineResponse;
	}
}