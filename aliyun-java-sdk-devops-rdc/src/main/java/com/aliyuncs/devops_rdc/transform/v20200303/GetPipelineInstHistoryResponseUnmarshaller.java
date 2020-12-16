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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstHistoryResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstHistoryResponse.Data;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstHistoryResponse.Data.PipelineInst;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstHistoryResponse.Data.PipelineInst.FlowInstance;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstHistoryResponse.Data.PipelineInst.FlowInstance.Group;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstHistoryResponse.Data.PipelineInst.FlowInstance.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineInstHistoryResponseUnmarshaller {

	public static GetPipelineInstHistoryResponse unmarshall(GetPipelineInstHistoryResponse getPipelineInstHistoryResponse, UnmarshallerContext _ctx) {
		
		getPipelineInstHistoryResponse.setRequestId(_ctx.stringValue("GetPipelineInstHistoryResponse.RequestId"));
		getPipelineInstHistoryResponse.setSuccess(_ctx.booleanValue("GetPipelineInstHistoryResponse.Success"));
		getPipelineInstHistoryResponse.setErrorCode(_ctx.stringValue("GetPipelineInstHistoryResponse.ErrorCode"));
		getPipelineInstHistoryResponse.setErrorMessage(_ctx.stringValue("GetPipelineInstHistoryResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.Total"));

		List<PipelineInst> dataList = new ArrayList<PipelineInst>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineInstHistoryResponse.Data.DataList.Length"); i++) {
			PipelineInst pipelineInst = new PipelineInst();
			pipelineInst.setCreator(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Creator"));
			pipelineInst.setModifyTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].ModifyTime"));
			pipelineInst.setPipelineConfigId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].PipelineConfigId"));
			pipelineInst.setModifier(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Modifier"));
			pipelineInst.setCreateTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].CreateTime"));
			pipelineInst.setPackages(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Packages"));
			pipelineInst.setPipelineId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].PipelineId"));
			pipelineInst.setFlowInstId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstId"));
			pipelineInst.setInstNumber(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].InstNumber"));
			pipelineInst.setDeletion(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Deletion"));
			pipelineInst.setStatusName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].StatusName"));
			pipelineInst.setId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Id"));
			pipelineInst.setTriggerMode(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].TriggerMode"));
			pipelineInst.setStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Status"));

			FlowInstance flowInstance = new FlowInstance();
			flowInstance.setCreator(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Creator"));
			flowInstance.setModifyTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.ModifyTime"));
			flowInstance.setSystemId(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.SystemId"));
			flowInstance.setStageTopo(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.StageTopo"));
			flowInstance.setModifier(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Modifier"));
			flowInstance.setAutoDrivenStatus(_ctx.booleanValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.AutoDrivenStatus"));
			flowInstance.setCreateTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.CreateTime"));
			flowInstance.setResultStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.ResultStatus"));
			flowInstance.setRunningStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.RunningStatus"));
			flowInstance.setSystemCode(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.SystemCode"));
			flowInstance.setStages(_ctx.mapValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Stages"));
			flowInstance.setStatusName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.StatusName"));
			flowInstance.setId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Id"));
			flowInstance.setStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Status"));

			Result result = new Result();
			result.setSources(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.Sources"));
			result.setCaches(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.Caches"));
			result.setEnginePipelineId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineId"));
			result.setMixFlowInstId(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.MixFlowInstId"));
			result.setEnginePipelineName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineName"));
			result.setEnginePipelineNumber(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineNumber"));
			result.setDateTime(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.DateTime"));
			result.setTimeStamp(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.TimeStamp"));
			result.setTriggerMode(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.TriggerMode"));
			result.setEnginePipelineInstId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineInstId"));
			flowInstance.setResult(result);

			List<Group> groups = new ArrayList<Group>();
			for (int j = 0; j < _ctx.lengthValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups.Length"); j++) {
				Group group = new Group();
				group.setCreator(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Creator"));
				group.setModifyTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].ModifyTime"));
				group.setModifier(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Modifier"));
				group.setCreateTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].CreateTime"));
				group.setFlowInstId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].FlowInstId"));
				group.setResultStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].ResultStatus"));
				group.setDeleteStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].DeleteStatus"));
				group.setName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Name"));
				group.setStartTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].StartTime"));
				group.setEndTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].EndTime"));
				group.setId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Id"));
				group.setIdExtent(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].IdExtent"));
				group.setStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Status"));

				groups.add(group);
			}
			flowInstance.setGroups(groups);
			pipelineInst.setFlowInstance(flowInstance);

			dataList.add(pipelineInst);
		}
		data.setDataList(dataList);
		getPipelineInstHistoryResponse.setData(data);
	 
	 	return getPipelineInstHistoryResponse;
	}
}