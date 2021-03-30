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

import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setErrorCode(_ctx.stringValue("GetInstanceResponse.ErrorCode"));
		getInstanceResponse.setErrorMessage(_ctx.stringValue("GetInstanceResponse.ErrorMessage"));
		getInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceResponse.HttpStatusCode"));
		getInstanceResponse.setSuccess(_ctx.booleanValue("GetInstanceResponse.Success"));

		Data data = new Data();
		data.setNodeId(_ctx.longValue("GetInstanceResponse.Data.NodeId"));
		data.setInstanceId(_ctx.longValue("GetInstanceResponse.Data.InstanceId"));
		data.setDagId(_ctx.longValue("GetInstanceResponse.Data.DagId"));
		data.setDagType(_ctx.stringValue("GetInstanceResponse.Data.DagType"));
		data.setStatus(_ctx.stringValue("GetInstanceResponse.Data.Status"));
		data.setBizdate(_ctx.longValue("GetInstanceResponse.Data.Bizdate"));
		data.setParamValues(_ctx.stringValue("GetInstanceResponse.Data.ParamValues"));
		data.setCycTime(_ctx.longValue("GetInstanceResponse.Data.CycTime"));
		data.setFinishTime(_ctx.longValue("GetInstanceResponse.Data.FinishTime"));
		data.setBeginWaitTimeTime(_ctx.longValue("GetInstanceResponse.Data.BeginWaitTimeTime"));
		data.setBeginWaitResTime(_ctx.longValue("GetInstanceResponse.Data.BeginWaitResTime"));
		data.setBeginRunningTime(_ctx.longValue("GetInstanceResponse.Data.BeginRunningTime"));
		data.setCreateTime(_ctx.longValue("GetInstanceResponse.Data.CreateTime"));
		data.setModifyTime(_ctx.longValue("GetInstanceResponse.Data.ModifyTime"));
		data.setNodeName(_ctx.stringValue("GetInstanceResponse.Data.NodeName"));
		data.setPriority(_ctx.integerValue("GetInstanceResponse.Data.Priority"));
		data.setBaselineId(_ctx.longValue("GetInstanceResponse.Data.BaselineId"));
		data.setRepeatability(_ctx.booleanValue("GetInstanceResponse.Data.Repeatability"));
		data.setRepeatInterval(_ctx.longValue("GetInstanceResponse.Data.RepeatInterval"));
		data.setConnection(_ctx.stringValue("GetInstanceResponse.Data.Connection"));
		data.setDqcType(_ctx.integerValue("GetInstanceResponse.Data.DqcType"));
		data.setDqcDescription(_ctx.stringValue("GetInstanceResponse.Data.DqcDescription"));
		data.setErrorMessage(_ctx.stringValue("GetInstanceResponse.Data.ErrorMessage"));
		data.setRelatedFlowId(_ctx.longValue("GetInstanceResponse.Data.RelatedFlowId"));
		data.setTaskType(_ctx.stringValue("GetInstanceResponse.Data.TaskType"));
		data.setTaskRerunTime(_ctx.integerValue("GetInstanceResponse.Data.TaskRerunTime"));
		getInstanceResponse.setData(data);
	 
	 	return getInstanceResponse;
	}
}