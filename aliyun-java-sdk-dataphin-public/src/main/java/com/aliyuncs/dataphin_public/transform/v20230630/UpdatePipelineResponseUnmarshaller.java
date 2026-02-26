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

import com.aliyuncs.dataphin_public.model.v20230630.UpdatePipelineResponse;
import com.aliyuncs.dataphin_public.model.v20230630.UpdatePipelineResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePipelineResponseUnmarshaller {

	public static UpdatePipelineResponse unmarshall(UpdatePipelineResponse updatePipelineResponse, UnmarshallerContext _ctx) {
		
		updatePipelineResponse.setRequestId(_ctx.stringValue("UpdatePipelineResponse.RequestId"));
		updatePipelineResponse.setMessage(_ctx.stringValue("UpdatePipelineResponse.Message"));
		updatePipelineResponse.setHttpStatusCode(_ctx.integerValue("UpdatePipelineResponse.HttpStatusCode"));
		updatePipelineResponse.setCode(_ctx.stringValue("UpdatePipelineResponse.Code"));
		updatePipelineResponse.setSuccess(_ctx.booleanValue("UpdatePipelineResponse.Success"));

		Data data = new Data();
		data.setSubmitId(_ctx.longValue("UpdatePipelineResponse.Data.SubmitId"));
		data.setHostMachine(_ctx.stringValue("UpdatePipelineResponse.Data.HostMachine"));
		data.setVersion(_ctx.stringValue("UpdatePipelineResponse.Data.Version"));
		data.setNodeId(_ctx.stringValue("UpdatePipelineResponse.Data.NodeId"));
		data.setPipelineId(_ctx.longValue("UpdatePipelineResponse.Data.PipelineId"));
		updatePipelineResponse.setData(data);
	 
	 	return updatePipelineResponse;
	}
}