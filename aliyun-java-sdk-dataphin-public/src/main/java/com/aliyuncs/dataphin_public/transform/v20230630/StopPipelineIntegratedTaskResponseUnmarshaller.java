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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.StopPipelineIntegratedTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.StopPipelineIntegratedTaskResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.StopPipelineIntegratedTaskResponse.Data.DevOpsActionResDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopPipelineIntegratedTaskResponseUnmarshaller {

	public static StopPipelineIntegratedTaskResponse unmarshall(StopPipelineIntegratedTaskResponse stopPipelineIntegratedTaskResponse, UnmarshallerContext _ctx) {
		
		stopPipelineIntegratedTaskResponse.setRequestId(_ctx.stringValue("StopPipelineIntegratedTaskResponse.RequestId"));
		stopPipelineIntegratedTaskResponse.setMessage(_ctx.stringValue("StopPipelineIntegratedTaskResponse.Message"));
		stopPipelineIntegratedTaskResponse.setHttpStatusCode(_ctx.integerValue("StopPipelineIntegratedTaskResponse.HttpStatusCode"));
		stopPipelineIntegratedTaskResponse.setCode(_ctx.stringValue("StopPipelineIntegratedTaskResponse.Code"));
		stopPipelineIntegratedTaskResponse.setSuccess(_ctx.booleanValue("StopPipelineIntegratedTaskResponse.Success"));

		Data data = new Data();
		data.setSuccess(_ctx.longValue("StopPipelineIntegratedTaskResponse.Data.Success"));
		data.setFail(_ctx.longValue("StopPipelineIntegratedTaskResponse.Data.Fail"));

		List<DevOpsActionResDTO> devOpsActionResDTOList = new ArrayList<DevOpsActionResDTO>();
		for (int i = 0; i < _ctx.lengthValue("StopPipelineIntegratedTaskResponse.Data.DevOpsActionResDTOList.Length"); i++) {
			DevOpsActionResDTO devOpsActionResDTO = new DevOpsActionResDTO();
			devOpsActionResDTO.setStatus(_ctx.stringValue("StopPipelineIntegratedTaskResponse.Data.DevOpsActionResDTOList["+ i +"].Status"));
			devOpsActionResDTO.setOwner(_ctx.stringValue("StopPipelineIntegratedTaskResponse.Data.DevOpsActionResDTOList["+ i +"].Owner"));
			devOpsActionResDTO.setJobName(_ctx.stringValue("StopPipelineIntegratedTaskResponse.Data.DevOpsActionResDTOList["+ i +"].JobName"));

			devOpsActionResDTOList.add(devOpsActionResDTO);
		}
		data.setDevOpsActionResDTOList(devOpsActionResDTOList);
		stopPipelineIntegratedTaskResponse.setData(data);
	 
	 	return stopPipelineIntegratedTaskResponse;
	}
}