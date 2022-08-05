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

import com.aliyuncs.viapi_regen.model.v20211119.StartTrainTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.StartTrainTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTrainTaskResponseUnmarshaller {

	public static StartTrainTaskResponse unmarshall(StartTrainTaskResponse startTrainTaskResponse, UnmarshallerContext _ctx) {
		
		startTrainTaskResponse.setRequestId(_ctx.stringValue("StartTrainTaskResponse.RequestId"));
		startTrainTaskResponse.setMessage(_ctx.stringValue("StartTrainTaskResponse.Message"));
		startTrainTaskResponse.setCode(_ctx.stringValue("StartTrainTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("StartTrainTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("StartTrainTaskResponse.Data.GmtCreate"));
		data.setTaskName(_ctx.stringValue("StartTrainTaskResponse.Data.TaskName"));
		data.setDescription(_ctx.stringValue("StartTrainTaskResponse.Data.Description"));
		data.setDatasetId(_ctx.longValue("StartTrainTaskResponse.Data.DatasetId"));
		data.setDatasetName(_ctx.stringValue("StartTrainTaskResponse.Data.DatasetName"));
		data.setLabelId(_ctx.longValue("StartTrainTaskResponse.Data.LabelId"));
		data.setLabelName(_ctx.stringValue("StartTrainTaskResponse.Data.LabelName"));
		data.setTrainMode(_ctx.stringValue("StartTrainTaskResponse.Data.TrainMode"));
		data.setTrainStatus(_ctx.stringValue("StartTrainTaskResponse.Data.TrainStatus"));
		data.setModelId(_ctx.longValue("StartTrainTaskResponse.Data.ModelId"));
		data.setModelEffect(_ctx.stringValue("StartTrainTaskResponse.Data.ModelEffect"));
		startTrainTaskResponse.setData(data);
	 
	 	return startTrainTaskResponse;
	}
}