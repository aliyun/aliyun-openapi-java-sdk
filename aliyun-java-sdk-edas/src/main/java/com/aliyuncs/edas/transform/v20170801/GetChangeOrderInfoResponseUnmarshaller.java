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

	public static GetChangeOrderInfoResponse unmarshall(GetChangeOrderInfoResponse getChangeOrderInfoResponse, UnmarshallerContext context) {
		
		getChangeOrderInfoResponse.setRequestId(context.stringValue("GetChangeOrderInfoResponse.RequestId"));
		getChangeOrderInfoResponse.setCode(context.integerValue("GetChangeOrderInfoResponse.Code"));
		getChangeOrderInfoResponse.setMessage(context.stringValue("GetChangeOrderInfoResponse.Message"));

		ChangeOrderInfo changeOrderInfo = new ChangeOrderInfo();
		changeOrderInfo.setChangeOrderId(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.ChangeOrderId"));
		changeOrderInfo.setCreateUserId(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.CreateUserId"));
		changeOrderInfo.setDesc(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.Desc"));
		changeOrderInfo.setBatchCount(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.BatchCount"));
		changeOrderInfo.setBatchType(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.BatchType"));
		changeOrderInfo.setStatus(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.Status"));
		changeOrderInfo.setCoType(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.CoType"));
		changeOrderInfo.setCreateTime(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.CreateTime"));

		List<PipelineInfo> pipelineInfoList = new ArrayList<PipelineInfo>();
		for (int i = 0; i < context.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList.Length"); i++) {
			PipelineInfo pipelineInfo = new PipelineInfo();
			pipelineInfo.setPipelineId(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].PipelineId"));
			pipelineInfo.setPipelineName(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].PipelineName"));
			pipelineInfo.setPipelineStatus(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].PipelineStatus"));

			List<StageInfoDTO> stageList = new ArrayList<StageInfoDTO>();
			for (int j = 0; j < context.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList.Length"); j++) {
				StageInfoDTO stageInfoDTO = new StageInfoDTO();
				stageInfoDTO.setStageId(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageId"));
				stageInfoDTO.setStageName(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageName"));
				stageInfoDTO.setStatus(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].Status"));

				StageResultDTO stageResultDTO = new StageResultDTO();

				ServiceStage serviceStage = new ServiceStage();
				serviceStage.setStageId(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.StageId"));
				serviceStage.setStageName(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.StageName"));
				serviceStage.setStatus(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.Status"));
				serviceStage.setMessage(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.ServiceStage.Message"));
				stageResultDTO.setServiceStage(serviceStage);

				List<InstanceDTO> instanceDTOList = new ArrayList<InstanceDTO>();
				for (int k = 0; k < context.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList.Length"); k++) {
					InstanceDTO instanceDTO = new InstanceDTO();
					instanceDTO.setInstanceName(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceName"));
					instanceDTO.setInstanceIp(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceIp"));
					instanceDTO.setStatus(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].Status"));

					List<InstanceStageDTO> instanceStageDTOList = new ArrayList<InstanceStageDTO>();
					for (int l = 0; l < context.lengthValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList.Length"); l++) {
						InstanceStageDTO instanceStageDTO = new InstanceStageDTO();
						instanceStageDTO.setStageId(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].StageId"));
						instanceStageDTO.setStageName(context.stringValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].StageName"));
						instanceStageDTO.setStatus(context.integerValue("GetChangeOrderInfoResponse.changeOrderInfo.PipelineInfoList["+ i +"].StageList["+ j +"].StageResultDTO.InstanceDTOList["+ k +"].InstanceStageDTOList["+ l +"].Status"));

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