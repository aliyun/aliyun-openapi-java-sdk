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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.GetAIJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetAIJobResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.GetAIJobResponse.Data.ActionJobDTO;
import com.aliyuncs.linkvisual.model.v20180120.GetAIJobResponse.Data.DataDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIJobResponseUnmarshaller {

	public static GetAIJobResponse unmarshall(GetAIJobResponse getAIJobResponse, UnmarshallerContext _ctx) {
		
		getAIJobResponse.setRequestId(_ctx.stringValue("GetAIJobResponse.RequestId"));
		getAIJobResponse.setSuccess(_ctx.booleanValue("GetAIJobResponse.Success"));
		getAIJobResponse.setErrorMessage(_ctx.stringValue("GetAIJobResponse.ErrorMessage"));
		getAIJobResponse.setCode(_ctx.stringValue("GetAIJobResponse.Code"));

		Data data = new Data();

		ActionJobDTO actionJobDTO = new ActionJobDTO();
		actionJobDTO.setJobId(_ctx.stringValue("GetAIJobResponse.Data.ActionJobDTO.JobId"));
		actionJobDTO.setActionId(_ctx.stringValue("GetAIJobResponse.Data.ActionJobDTO.ActionId"));
		actionJobDTO.setStatus(_ctx.integerValue("GetAIJobResponse.Data.ActionJobDTO.Status"));
		actionJobDTO.setIotId(_ctx.stringValue("GetAIJobResponse.Data.ActionJobDTO.IotId"));
		data.setActionJobDTO(actionJobDTO);

		List<DataDTOListItem> dataDTOList = new ArrayList<DataDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIJobResponse.Data.DataDTOList.Length"); i++) {
			DataDTOListItem dataDTOListItem = new DataDTOListItem();
			dataDTOListItem.setDataId(_ctx.stringValue("GetAIJobResponse.Data.DataDTOList["+ i +"].DataId"));
			dataDTOListItem.setDataType(_ctx.stringValue("GetAIJobResponse.Data.DataDTOList["+ i +"].DataType"));
			dataDTOListItem.setDataSource(_ctx.stringValue("GetAIJobResponse.Data.DataDTOList["+ i +"].DataSource"));
			dataDTOListItem.setAlgoData(_ctx.stringValue("GetAIJobResponse.Data.DataDTOList["+ i +"].AlgoData"));
			dataDTOListItem.setJobId(_ctx.stringValue("GetAIJobResponse.Data.DataDTOList["+ i +"].JobId"));
			dataDTOListItem.setIotId(_ctx.stringValue("GetAIJobResponse.Data.DataDTOList["+ i +"].IotId"));

			dataDTOList.add(dataDTOListItem);
		}
		data.setDataDTOList(dataDTOList);
		getAIJobResponse.setData(data);
	 
	 	return getAIJobResponse;
	}
}