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

import com.aliyuncs.viapi_regen.model.v20211119.CreateTrainTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CreateTrainTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrainTaskResponseUnmarshaller {

	public static CreateTrainTaskResponse unmarshall(CreateTrainTaskResponse createTrainTaskResponse, UnmarshallerContext _ctx) {
		
		createTrainTaskResponse.setRequestId(_ctx.stringValue("CreateTrainTaskResponse.RequestId"));
		createTrainTaskResponse.setMessage(_ctx.stringValue("CreateTrainTaskResponse.Message"));
		createTrainTaskResponse.setCode(_ctx.stringValue("CreateTrainTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateTrainTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("CreateTrainTaskResponse.Data.GmtCreate"));
		data.setTaskName(_ctx.stringValue("CreateTrainTaskResponse.Data.TaskName"));
		data.setDescription(_ctx.stringValue("CreateTrainTaskResponse.Data.Description"));
		data.setDatasetId(_ctx.longValue("CreateTrainTaskResponse.Data.DatasetId"));
		data.setDatasetName(_ctx.stringValue("CreateTrainTaskResponse.Data.DatasetName"));
		data.setLabelId(_ctx.longValue("CreateTrainTaskResponse.Data.LabelId"));
		data.setLabelName(_ctx.stringValue("CreateTrainTaskResponse.Data.LabelName"));
		data.setTrainMode(_ctx.stringValue("CreateTrainTaskResponse.Data.TrainMode"));
		data.setTrainStatus(_ctx.stringValue("CreateTrainTaskResponse.Data.TrainStatus"));
		data.setModelId(_ctx.longValue("CreateTrainTaskResponse.Data.ModelId"));
		data.setModelEffect(_ctx.stringValue("CreateTrainTaskResponse.Data.ModelEffect"));
		createTrainTaskResponse.setData(data);
	 
	 	return createTrainTaskResponse;
	}
}