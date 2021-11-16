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

import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineStatusResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineStatusResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineStatusResponse.Data.BlockInstance;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineStatusResponse.Data.LastInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBaselineStatusResponseUnmarshaller {

	public static GetBaselineStatusResponse unmarshall(GetBaselineStatusResponse getBaselineStatusResponse, UnmarshallerContext _ctx) {
		
		getBaselineStatusResponse.setRequestId(_ctx.stringValue("GetBaselineStatusResponse.RequestId"));
		getBaselineStatusResponse.setSuccess(_ctx.booleanValue("GetBaselineStatusResponse.Success"));
		getBaselineStatusResponse.setErrorCode(_ctx.stringValue("GetBaselineStatusResponse.ErrorCode"));
		getBaselineStatusResponse.setErrorMessage(_ctx.stringValue("GetBaselineStatusResponse.ErrorMessage"));
		getBaselineStatusResponse.setHttpStatusCode(_ctx.integerValue("GetBaselineStatusResponse.HttpStatusCode"));

		Data data = new Data();
		data.setBaselineName(_ctx.stringValue("GetBaselineStatusResponse.Data.BaselineName"));
		data.setBaselineId(_ctx.longValue("GetBaselineStatusResponse.Data.BaselineId"));
		data.setBizdate(_ctx.longValue("GetBaselineStatusResponse.Data.Bizdate"));
		data.setOwner(_ctx.stringValue("GetBaselineStatusResponse.Data.Owner"));
		data.setExpTime(_ctx.longValue("GetBaselineStatusResponse.Data.ExpTime"));
		data.setFinishTime(_ctx.longValue("GetBaselineStatusResponse.Data.FinishTime"));
		data.setEndCast(_ctx.longValue("GetBaselineStatusResponse.Data.EndCast"));
		data.setSlaTime(_ctx.longValue("GetBaselineStatusResponse.Data.SlaTime"));
		data.setPriority(_ctx.integerValue("GetBaselineStatusResponse.Data.Priority"));
		data.setProjectId(_ctx.longValue("GetBaselineStatusResponse.Data.ProjectId"));
		data.setBuffer(_ctx.floatValue("GetBaselineStatusResponse.Data.Buffer"));
		data.setStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.Status"));
		data.setFinishStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.FinishStatus"));
		data.setInGroupId(_ctx.integerValue("GetBaselineStatusResponse.Data.InGroupId"));

		LastInstance lastInstance = new LastInstance();
		lastInstance.setInstanceId(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.InstanceId"));
		lastInstance.setStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.LastInstance.Status"));
		lastInstance.setProjectId(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.ProjectId"));
		lastInstance.setOwner(_ctx.stringValue("GetBaselineStatusResponse.Data.LastInstance.Owner"));
		lastInstance.setNodeId(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.NodeId"));
		lastInstance.setFinishTime(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.FinishTime"));
		lastInstance.setEndCast(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.EndCast"));
		lastInstance.setNodeName(_ctx.stringValue("GetBaselineStatusResponse.Data.LastInstance.NodeName"));
		data.setLastInstance(lastInstance);

		BlockInstance blockInstance = new BlockInstance();
		blockInstance.setInstanceId(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.InstanceId"));
		blockInstance.setStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.BlockInstance.Status"));
		blockInstance.setProjectId(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.ProjectId"));
		blockInstance.setOwner(_ctx.stringValue("GetBaselineStatusResponse.Data.BlockInstance.Owner"));
		blockInstance.setNodeId(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.NodeId"));
		blockInstance.setFinishTime(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.FinishTime"));
		blockInstance.setEndCast(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.EndCast"));
		blockInstance.setNodeName(_ctx.stringValue("GetBaselineStatusResponse.Data.BlockInstance.NodeName"));
		data.setBlockInstance(blockInstance);
		getBaselineStatusResponse.setData(data);
	 
	 	return getBaselineStatusResponse;
	}
}