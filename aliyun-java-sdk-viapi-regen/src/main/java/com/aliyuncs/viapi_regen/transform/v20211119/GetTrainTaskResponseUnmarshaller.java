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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetTrainTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetTrainTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrainTaskResponseUnmarshaller {

	public static GetTrainTaskResponse unmarshall(GetTrainTaskResponse getTrainTaskResponse, UnmarshallerContext _ctx) {
		
		getTrainTaskResponse.setRequestId(_ctx.stringValue("GetTrainTaskResponse.RequestId"));
		getTrainTaskResponse.setMessage(_ctx.stringValue("GetTrainTaskResponse.Message"));
		getTrainTaskResponse.setCode(_ctx.stringValue("GetTrainTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetTrainTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("GetTrainTaskResponse.Data.GmtCreate"));
		data.setTaskName(_ctx.stringValue("GetTrainTaskResponse.Data.TaskName"));
		data.setDescription(_ctx.stringValue("GetTrainTaskResponse.Data.Description"));
		data.setDatasetId(_ctx.longValue("GetTrainTaskResponse.Data.DatasetId"));
		data.setDatasetName(_ctx.stringValue("GetTrainTaskResponse.Data.DatasetName"));
		data.setLabelId(_ctx.longValue("GetTrainTaskResponse.Data.LabelId"));
		data.setLabelName(_ctx.stringValue("GetTrainTaskResponse.Data.LabelName"));
		data.setTrainMode(_ctx.stringValue("GetTrainTaskResponse.Data.TrainMode"));
		data.setTrainStatus(_ctx.stringValue("GetTrainTaskResponse.Data.TrainStatus"));
		data.setModelId(_ctx.longValue("GetTrainTaskResponse.Data.ModelId"));
		data.setModelEffect(_ctx.stringValue("GetTrainTaskResponse.Data.ModelEffect"));
		data.setFailureReason(_ctx.stringValue("GetTrainTaskResponse.Data.FailureReason"));
		data.setTrainUseTime(_ctx.longValue("GetTrainTaskResponse.Data.TrainUseTime"));
		getTrainTaskResponse.setData(data);
	 
	 	return getTrainTaskResponse;
	}
}