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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetCustomizationConfigListResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetCustomizationConfigListResponse.ModelCustomizationDataSetPo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomizationConfigListResponseUnmarshaller {

	public static GetCustomizationConfigListResponse unmarshall(GetCustomizationConfigListResponse getCustomizationConfigListResponse, UnmarshallerContext _ctx) {
		
		getCustomizationConfigListResponse.setRequestId(_ctx.stringValue("GetCustomizationConfigListResponse.RequestId"));
		getCustomizationConfigListResponse.setSuccess(_ctx.booleanValue("GetCustomizationConfigListResponse.Success"));
		getCustomizationConfigListResponse.setCode(_ctx.stringValue("GetCustomizationConfigListResponse.Code"));
		getCustomizationConfigListResponse.setMessage(_ctx.stringValue("GetCustomizationConfigListResponse.Message"));

		List<ModelCustomizationDataSetPo> data = new ArrayList<ModelCustomizationDataSetPo>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomizationConfigListResponse.Data.Length"); i++) {
			ModelCustomizationDataSetPo modelCustomizationDataSetPo = new ModelCustomizationDataSetPo();
			modelCustomizationDataSetPo.setModelId(_ctx.longValue("GetCustomizationConfigListResponse.Data["+ i +"].ModelId"));
			modelCustomizationDataSetPo.setModeCustomizationId(_ctx.stringValue("GetCustomizationConfigListResponse.Data["+ i +"].ModeCustomizationId"));
			modelCustomizationDataSetPo.setModelName(_ctx.stringValue("GetCustomizationConfigListResponse.Data["+ i +"].ModelName"));
			modelCustomizationDataSetPo.setModelStatus(_ctx.integerValue("GetCustomizationConfigListResponse.Data["+ i +"].ModelStatus"));
			modelCustomizationDataSetPo.setTaskType(_ctx.integerValue("GetCustomizationConfigListResponse.Data["+ i +"].TaskType"));
			modelCustomizationDataSetPo.setCreateTime(_ctx.stringValue("GetCustomizationConfigListResponse.Data["+ i +"].CreateTime"));

			data.add(modelCustomizationDataSetPo);
		}
		getCustomizationConfigListResponse.setData(data);
	 
	 	return getCustomizationConfigListResponse;
	}
}