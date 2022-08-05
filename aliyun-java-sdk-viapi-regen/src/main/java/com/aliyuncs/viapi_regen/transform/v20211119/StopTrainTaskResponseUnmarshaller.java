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

import com.aliyuncs.viapi_regen.model.v20211119.StopTrainTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.StopTrainTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopTrainTaskResponseUnmarshaller {

	public static StopTrainTaskResponse unmarshall(StopTrainTaskResponse stopTrainTaskResponse, UnmarshallerContext _ctx) {
		
		stopTrainTaskResponse.setRequestId(_ctx.stringValue("StopTrainTaskResponse.RequestId"));
		stopTrainTaskResponse.setMessage(_ctx.stringValue("StopTrainTaskResponse.Message"));
		stopTrainTaskResponse.setCode(_ctx.stringValue("StopTrainTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("StopTrainTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("StopTrainTaskResponse.Data.GmtCreate"));
		data.setTaskName(_ctx.stringValue("StopTrainTaskResponse.Data.TaskName"));
		data.setDescription(_ctx.stringValue("StopTrainTaskResponse.Data.Description"));
		data.setDatasetId(_ctx.longValue("StopTrainTaskResponse.Data.DatasetId"));
		data.setDatasetName(_ctx.stringValue("StopTrainTaskResponse.Data.DatasetName"));
		data.setLabelId(_ctx.longValue("StopTrainTaskResponse.Data.LabelId"));
		data.setLabelName(_ctx.stringValue("StopTrainTaskResponse.Data.LabelName"));
		data.setTrainMode(_ctx.stringValue("StopTrainTaskResponse.Data.TrainMode"));
		data.setTrainStatus(_ctx.stringValue("StopTrainTaskResponse.Data.TrainStatus"));
		data.setModelId(_ctx.longValue("StopTrainTaskResponse.Data.ModelId"));
		data.setModelEffect(_ctx.stringValue("StopTrainTaskResponse.Data.ModelEffect"));
		stopTrainTaskResponse.setData(data);
	 
	 	return stopTrainTaskResponse;
	}
}