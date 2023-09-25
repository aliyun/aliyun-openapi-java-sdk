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
		getBaselineStatusResponse.setHttpStatusCode(_ctx.integerValue("GetBaselineStatusResponse.HttpStatusCode"));
		getBaselineStatusResponse.setErrorMessage(_ctx.stringValue("GetBaselineStatusResponse.ErrorMessage"));
		getBaselineStatusResponse.setErrorCode(_ctx.stringValue("GetBaselineStatusResponse.ErrorCode"));
		getBaselineStatusResponse.setSuccess(_ctx.booleanValue("GetBaselineStatusResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.Status"));
		data.setOwner(_ctx.stringValue("GetBaselineStatusResponse.Data.Owner"));
		data.setFinishTime(_ctx.longValue("GetBaselineStatusResponse.Data.FinishTime"));
		data.setProjectId(_ctx.longValue("GetBaselineStatusResponse.Data.ProjectId"));
		data.setPriority(_ctx.integerValue("GetBaselineStatusResponse.Data.Priority"));
		data.setEndCast(_ctx.longValue("GetBaselineStatusResponse.Data.EndCast"));
		data.setInGroupId(_ctx.integerValue("GetBaselineStatusResponse.Data.InGroupId"));
		data.setBaselineName(_ctx.stringValue("GetBaselineStatusResponse.Data.BaselineName"));
		data.setBaselineId(_ctx.longValue("GetBaselineStatusResponse.Data.BaselineId"));
		data.setFinishStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.FinishStatus"));
		data.setBizdate(_ctx.longValue("GetBaselineStatusResponse.Data.Bizdate"));
		data.setBuffer(_ctx.floatValue("GetBaselineStatusResponse.Data.Buffer"));
		data.setSlaTime(_ctx.longValue("GetBaselineStatusResponse.Data.SlaTime"));
		data.setExpTime(_ctx.longValue("GetBaselineStatusResponse.Data.ExpTime"));

		LastInstance lastInstance = new LastInstance();
		lastInstance.setStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.LastInstance.Status"));
		lastInstance.setOwner(_ctx.stringValue("GetBaselineStatusResponse.Data.LastInstance.Owner"));
		lastInstance.setFinishTime(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.FinishTime"));
		lastInstance.setNodeName(_ctx.stringValue("GetBaselineStatusResponse.Data.LastInstance.NodeName"));
		lastInstance.setProjectId(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.ProjectId"));
		lastInstance.setInstanceId(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.InstanceId"));
		lastInstance.setEndCast(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.EndCast"));
		lastInstance.setNodeId(_ctx.longValue("GetBaselineStatusResponse.Data.LastInstance.NodeId"));
		data.setLastInstance(lastInstance);

		BlockInstance blockInstance = new BlockInstance();
		blockInstance.setStatus(_ctx.stringValue("GetBaselineStatusResponse.Data.BlockInstance.Status"));
		blockInstance.setOwner(_ctx.stringValue("GetBaselineStatusResponse.Data.BlockInstance.Owner"));
		blockInstance.setFinishTime(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.FinishTime"));
		blockInstance.setNodeName(_ctx.stringValue("GetBaselineStatusResponse.Data.BlockInstance.NodeName"));
		blockInstance.setProjectId(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.ProjectId"));
		blockInstance.setInstanceId(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.InstanceId"));
		blockInstance.setEndCast(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.EndCast"));
		blockInstance.setNodeId(_ctx.longValue("GetBaselineStatusResponse.Data.BlockInstance.NodeId"));
		data.setBlockInstance(blockInstance);
		getBaselineStatusResponse.setData(data);
	 
	 	return getBaselineStatusResponse;
	}
}