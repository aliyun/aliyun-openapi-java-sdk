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

import com.aliyuncs.viapi_regen.model.v20211119.UpdateTrainTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.UpdateTrainTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTrainTaskResponseUnmarshaller {

	public static UpdateTrainTaskResponse unmarshall(UpdateTrainTaskResponse updateTrainTaskResponse, UnmarshallerContext _ctx) {
		
		updateTrainTaskResponse.setRequestId(_ctx.stringValue("UpdateTrainTaskResponse.RequestId"));
		updateTrainTaskResponse.setMessage(_ctx.stringValue("UpdateTrainTaskResponse.Message"));
		updateTrainTaskResponse.setCode(_ctx.stringValue("UpdateTrainTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateTrainTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("UpdateTrainTaskResponse.Data.GmtCreate"));
		data.setTaskName(_ctx.stringValue("UpdateTrainTaskResponse.Data.TaskName"));
		data.setDescription(_ctx.stringValue("UpdateTrainTaskResponse.Data.Description"));
		data.setDatasetId(_ctx.longValue("UpdateTrainTaskResponse.Data.DatasetId"));
		data.setDatasetName(_ctx.stringValue("UpdateTrainTaskResponse.Data.DatasetName"));
		data.setLabelId(_ctx.longValue("UpdateTrainTaskResponse.Data.LabelId"));
		data.setLabelName(_ctx.stringValue("UpdateTrainTaskResponse.Data.LabelName"));
		data.setTrainMode(_ctx.stringValue("UpdateTrainTaskResponse.Data.TrainMode"));
		data.setAdvancedParameters(_ctx.stringValue("UpdateTrainTaskResponse.Data.AdvancedParameters"));
		data.setTrainStatus(_ctx.stringValue("UpdateTrainTaskResponse.Data.TrainStatus"));
		data.setModelId(_ctx.longValue("UpdateTrainTaskResponse.Data.ModelId"));
		data.setModelEffect(_ctx.stringValue("UpdateTrainTaskResponse.Data.ModelEffect"));
		updateTrainTaskResponse.setData(data);
	 
	 	return updateTrainTaskResponse;
	}
}