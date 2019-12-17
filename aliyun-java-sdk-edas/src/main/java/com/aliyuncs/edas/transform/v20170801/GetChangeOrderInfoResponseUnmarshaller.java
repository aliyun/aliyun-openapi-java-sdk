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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo.PipelineInfo;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo.PipelineInfo.StageInfoDTO;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo.PipelineInfo.StageInfoDTO.StageResultDTO;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo.PipelineInfo.StageInfoDTO.StageResultDTO.InstanceDTO;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo.PipelineInfo.StageInfoDTO.StageResultDTO.InstanceDTO.InstanceStageDTO;
import com.aliyuncs.edas.model.v20170801.GetChangeOrderInfoResponse.ChangeOrderInfo.PipelineInfo.StageInfoDTO.StageResultDTO.ServiceStage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChangeOrderInfoResponseUnmarshaller {

	public static GetChangeOrderInfoResponse unmarshall(GetChangeOrderInfoResponse getChangeOrderInfoResponse, UnmarshallerContext _ctx) {
		
		getChangeOrderInfoResponse.setRequestId(_ctx.stringValue("GetChangeOrderInfoResponse.RequestId"));
		getChangeOrderInfoResponse.setCode(_ctx.integerValue("GetChangeOrderInfoResponse.Code"));
		getChangeOrderInfoResponse.setMessage(_ctx.stringValue("GetChangeOrderInfoResponse.Message"));

		ChangeOrderInfo changeOrderInfo = new ChangeOrderInfo();
		changeOrderInfo.setChangeOrderId(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.ChangeOrderId"));
		changeOrderInfo.setCreateUserId(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.CreateUserId"));
		changeOrderInfo.setDesc(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.Desc"));
		changeOrderInfo.setBatchCount(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.BatchCount"));
		changeOrderInfo.setBatchType(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.BatchType"));
		changeOrderInfo.setStatus(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.Status"));
		changeOrderInfo.setCoType(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.CoType"));
		changeOrderInfo.setCreateTime(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.CreateTime"));
		changeOrderInfo.setSupportRollback(_ctx.booleanValue("GetChangeOrderInfoResponse.changeOrderInfo.SupportRollback"));

		List<PipelineInfo> pipelineInfoList = new ArrayList<PipelineInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList.Length"); i++) {
			PipelineInfo pipelineInfo = new PipelineInfo();
			pipelineInfo.setPipelineId(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].PipelineId"));
			pipelineInfo.setPipelineName(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].PipelineName"));
			pipelineInfo.setPipelineStatus(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].PipelineStatus"));
			pipelineInfo.setStartTime(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StartTime"));
			pipelineInfo.setUpdateTime(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].UpdateTime"));

			List<StageInfoDTO> stageList = new ArrayList<StageInfoDTO>();
			for (int j = 0; j < _ctx.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList.Length"); j++) {
				StageInfoDTO stageInfoDTO = new StageInfoDTO();
				stageInfoDTO.setStageId(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageId"));
				stageInfoDTO.setStageName(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageName"));
				stageInfoDTO.setStatus(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].Status"));

				StageResultDTO stageResultDTO = new StageResultDTO();

				ServiceStage serviceStage = new ServiceStage();
				serviceStage.setStageId(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.StageId"));
				serviceStage.setStageName(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.StageName"));
				serviceStage.setStatus(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.Status"));
				serviceStage.setMessage(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.Message"));
				stageResultDTO.setServiceStage(serviceStage);

				List<InstanceDTO> instanceDTOList = new ArrayList<InstanceDTO>();
				for (int k = 0; k < _ctx.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList.Length"); k++) {
					InstanceDTO instanceDTO = new InstanceDTO();
					instanceDTO.setInstanceName(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceName"));
					instanceDTO.setInstanceIp(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceIp"));
					instanceDTO.setStatus(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].Status"));
					instanceDTO.setPodName(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].PodName"));

					List<InstanceStageDTO> instanceStageDTOList = new ArrayList<InstanceStageDTO>();
					for (int l = 0; l < _ctx.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList.Length"); l++) {
						InstanceStageDTO instanceStageDTO = new InstanceStageDTO();
						instanceStageDTO.setStageId(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].StageId"));
						instanceStageDTO.setStageName(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].StageName"));
						instanceStageDTO.setStatus(_ctx.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].Status"));
						instanceStageDTO.setStageMessage(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].StageMessage"));
						instanceStageDTO.setStartTime(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].StartTime"));
						instanceStageDTO.setFinishTime(_ctx.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].FinishTime"));

						instanceStageDTOList.add(instanceStageDTO);
					}
					instanceDTO.setInstanceStageDTOList(instanceStageDTOList);

					instanceDTOList.add(instanceDTO);
				}
				stageResultDTO.setInstanceDTOList(instanceDTOList);
				stageInfoDTO.setStageResultDTO(stageResultDTO);

				stageList.add(stageInfoDTO);
			}
			pipelineInfo.setStageList(stageList);

			pipelineInfoList.add(pipelineInfo);
		}
		changeOrderInfo.setPipelineInfoList(pipelineInfoList);
		getChangeOrderInfoResponse.setChangeOrderInfo(changeOrderInfo);
	 
	 	return getChangeOrderInfoResponse;
	}
}