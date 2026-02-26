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

import com.aliyuncs.dataphin_public.model.v20230630.OfflinePipelineResponse;
import com.aliyuncs.dataphin_public.model.v20230630.OfflinePipelineResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OfflinePipelineResponseUnmarshaller {

	public static OfflinePipelineResponse unmarshall(OfflinePipelineResponse offlinePipelineResponse, UnmarshallerContext _ctx) {
		
		offlinePipelineResponse.setRequestId(_ctx.stringValue("OfflinePipelineResponse.RequestId"));
		offlinePipelineResponse.setMessage(_ctx.stringValue("OfflinePipelineResponse.Message"));
		offlinePipelineResponse.setHttpStatusCode(_ctx.integerValue("OfflinePipelineResponse.HttpStatusCode"));
		offlinePipelineResponse.setCode(_ctx.stringValue("OfflinePipelineResponse.Code"));
		offlinePipelineResponse.setSuccess(_ctx.booleanValue("OfflinePipelineResponse.Success"));

		Data data = new Data();
		data.setSubmitId(_ctx.longValue("OfflinePipelineResponse.Data.SubmitId"));
		data.setHostMachine(_ctx.stringValue("OfflinePipelineResponse.Data.HostMachine"));
		data.setVersion(_ctx.stringValue("OfflinePipelineResponse.Data.Version"));
		data.setNodeId(_ctx.stringValue("OfflinePipelineResponse.Data.NodeId"));
		data.setPipelineId(_ctx.longValue("OfflinePipelineResponse.Data.PipelineId"));
		offlinePipelineResponse.setData(data);
	 
	 	return offlinePipelineResponse;
	}
}