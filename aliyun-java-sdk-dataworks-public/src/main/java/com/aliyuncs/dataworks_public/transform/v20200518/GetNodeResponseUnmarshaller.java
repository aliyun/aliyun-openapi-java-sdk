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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetNodeResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeResponseUnmarshaller {

	public static GetNodeResponse unmarshall(GetNodeResponse getNodeResponse, UnmarshallerContext _ctx) {
		
		getNodeResponse.setRequestId(_ctx.stringValue("GetNodeResponse.RequestId"));
		getNodeResponse.setHttpStatusCode(_ctx.integerValue("GetNodeResponse.HttpStatusCode"));
		getNodeResponse.setErrorMessage(_ctx.stringValue("GetNodeResponse.ErrorMessage"));
		getNodeResponse.setErrorCode(_ctx.stringValue("GetNodeResponse.ErrorCode"));
		getNodeResponse.setSuccess(_ctx.booleanValue("GetNodeResponse.Success"));

		Data data = new Data();
		data.setSchedulerType(_ctx.stringValue("GetNodeResponse.Data.SchedulerType"));
		data.setRepeatInterval(_ctx.longValue("GetNodeResponse.Data.RepeatInterval"));
		data.setRepeatability(_ctx.stringValue("GetNodeResponse.Data.Repeatability"));
		data.setProjectId(_ctx.longValue("GetNodeResponse.Data.ProjectId"));
		data.setProgramType(_ctx.stringValue("GetNodeResponse.Data.ProgramType"));
		data.setPriority(_ctx.integerValue("GetNodeResponse.Data.Priority"));
		data.setOwnerId(_ctx.stringValue("GetNodeResponse.Data.OwnerId"));
		data.setConnection(_ctx.stringValue("GetNodeResponse.Data.Connection"));
		data.setParamValues(_ctx.stringValue("GetNodeResponse.Data.ParamValues"));
		data.setRelatedFlowId(_ctx.longValue("GetNodeResponse.Data.RelatedFlowId"));
		data.setDqcType(_ctx.integerValue("GetNodeResponse.Data.DqcType"));
		data.setBaselineId(_ctx.longValue("GetNodeResponse.Data.BaselineId"));
		data.setDescription(_ctx.stringValue("GetNodeResponse.Data.Description"));
		data.setNodeName(_ctx.stringValue("GetNodeResponse.Data.NodeName"));
		data.setResGroupName(_ctx.stringValue("GetNodeResponse.Data.ResGroupName"));
		data.setBusinessId(_ctx.longValue("GetNodeResponse.Data.BusinessId"));
		data.setDqcDescription(_ctx.stringValue("GetNodeResponse.Data.DqcDescription"));
		data.setCronExpress(_ctx.stringValue("GetNodeResponse.Data.CronExpress"));
		data.setNodeId(_ctx.longValue("GetNodeResponse.Data.NodeId"));
		getNodeResponse.setData(data);
	 
	 	return getNodeResponse;
	}
}