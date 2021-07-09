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
		getPipelineInstHistoryResponse.setErrorMessage(_ctx.stringValue("GetPipelineInstHistoryResponse.ErrorMessage"));
		getPipelineInstHistoryResponse.setSuccess(_ctx.booleanValue("GetPipelineInstHistoryResponse.Success"));
		getPipelineInstHistoryResponse.setErrorCode(_ctx.stringValue("GetPipelineInstHistoryResponse.ErrorCode"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.Total"));

		List<PipelineInst> dataList = new ArrayList<PipelineInst>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineInstHistoryResponse.Data.DataList.Length"); i++) {
			PipelineInst pipelineInst = new PipelineInst();
			pipelineInst.setStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Status"));
			pipelineInst.setCreateTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].CreateTime"));
			pipelineInst.setStatusName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].StatusName"));
			pipelineInst.setTriggerMode(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].TriggerMode"));
			pipelineInst.setPipelineConfigId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].PipelineConfigId"));
			pipelineInst.setDeletion(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Deletion"));
			pipelineInst.setCreator(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Creator"));
			pipelineInst.setInstNumber(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].InstNumber"));
			pipelineInst.setModifier(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Modifier"));
			pipelineInst.setPackages(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Packages"));
			pipelineInst.setFlowInstId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstId"));
			pipelineInst.setPipelineId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].PipelineId"));
			pipelineInst.setId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].Id"));
			pipelineInst.setModifyTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].ModifyTime"));

			FlowInstance flowInstance = new FlowInstance();
			flowInstance.setStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Status"));
			flowInstance.setStages(_ctx.mapValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Stages"));
			flowInstance.setCreateTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.CreateTime"));
			flowInstance.setStatusName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.StatusName"));
			flowInstance.setRunningStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.RunningStatus"));
			flowInstance.setCreator(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Creator"));
			flowInstance.setStageTopo(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.StageTopo"));
			flowInstance.setModifier(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Modifier"));
			flowInstance.setAutoDrivenStatus(_ctx.booleanValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.AutoDrivenStatus"));
			flowInstance.setResultStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.ResultStatus"));
			flowInstance.setId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Id"));
			flowInstance.setSystemCode(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.SystemCode"));
			flowInstance.setModifyTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.ModifyTime"));
			flowInstance.setSystemId(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.SystemId"));

			Result result = new Result();
			result.setEnginePipelineNumber(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineNumber"));
			result.setMixFlowInstId(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.MixFlowInstId"));
			result.setEnginePipelineName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineName"));
			result.setEnginePipelineId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineId"));
			result.setEnginePipelineInstId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.EnginePipelineInstId"));
			result.setTimeStamp(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.TimeStamp"));
			result.setTriggerMode(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.TriggerMode"));
			result.setSources(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.Sources"));
			result.setCaches(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.Caches"));
			result.setDateTime(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Result.DateTime"));
			flowInstance.setResult(result);

			List<Group> groups = new ArrayList<Group>();
			for (int j = 0; j < _ctx.lengthValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups.Length"); j++) {
				Group group = new Group();
				group.setStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Status"));
				group.setCreateTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].CreateTime"));
				group.setDeleteStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].DeleteStatus"));
				group.setIdExtent(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].IdExtent"));
				group.setCreator(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Creator"));
				group.setEndTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].EndTime"));
				group.setStartTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].StartTime"));
				group.setModifier(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Modifier"));
				group.setResultStatus(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].ResultStatus"));
				group.setFlowInstId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].FlowInstId"));
				group.setName(_ctx.stringValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Name"));
				group.setId(_ctx.integerValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].Id"));
				group.setModifyTime(_ctx.longValue("GetPipelineInstHistoryResponse.Data.DataList["+ i +"].FlowInstance.Groups["+ j +"].ModifyTime"));

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