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

import com.aliyuncs.dataphin_public.model.v20230630.CreateWorkFlowByJsonResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateWorkFlowByJsonResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkFlowByJsonResponseUnmarshaller {

	public static CreateWorkFlowByJsonResponse unmarshall(CreateWorkFlowByJsonResponse createWorkFlowByJsonResponse, UnmarshallerContext _ctx) {
		
		createWorkFlowByJsonResponse.setRequestId(_ctx.stringValue("CreateWorkFlowByJsonResponse.RequestId"));
		createWorkFlowByJsonResponse.setMessage(_ctx.stringValue("CreateWorkFlowByJsonResponse.Message"));
		createWorkFlowByJsonResponse.setHttpStatusCode(_ctx.integerValue("CreateWorkFlowByJsonResponse.HttpStatusCode"));
		createWorkFlowByJsonResponse.setCode(_ctx.stringValue("CreateWorkFlowByJsonResponse.Code"));
		createWorkFlowByJsonResponse.setSuccess(_ctx.booleanValue("CreateWorkFlowByJsonResponse.Success"));

		Data data = new Data();
		data.setSubmitId(_ctx.longValue("CreateWorkFlowByJsonResponse.Data.SubmitId"));
		data.setHostMachine(_ctx.stringValue("CreateWorkFlowByJsonResponse.Data.HostMachine"));
		data.setVersion(_ctx.stringValue("CreateWorkFlowByJsonResponse.Data.Version"));
		data.setNodeId(_ctx.stringValue("CreateWorkFlowByJsonResponse.Data.NodeId"));
		data.setPipelineId(_ctx.longValue("CreateWorkFlowByJsonResponse.Data.PipelineId"));
		createWorkFlowByJsonResponse.setData(data);
	 
	 	return createWorkFlowByJsonResponse;
	}
}