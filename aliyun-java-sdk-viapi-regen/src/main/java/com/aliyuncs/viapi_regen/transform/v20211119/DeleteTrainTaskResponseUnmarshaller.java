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

import com.aliyuncs.viapi_regen.model.v20211119.DeleteTrainTaskResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DeleteTrainTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTrainTaskResponseUnmarshaller {

	public static DeleteTrainTaskResponse unmarshall(DeleteTrainTaskResponse deleteTrainTaskResponse, UnmarshallerContext _ctx) {
		
		deleteTrainTaskResponse.setRequestId(_ctx.stringValue("DeleteTrainTaskResponse.RequestId"));
		deleteTrainTaskResponse.setMessage(_ctx.stringValue("DeleteTrainTaskResponse.Message"));
		deleteTrainTaskResponse.setCode(_ctx.stringValue("DeleteTrainTaskResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteTrainTaskResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("DeleteTrainTaskResponse.Data.GmtCreate"));
		data.setTaskName(_ctx.stringValue("DeleteTrainTaskResponse.Data.TaskName"));
		data.setDescription(_ctx.stringValue("DeleteTrainTaskResponse.Data.Description"));
		data.setDatasetId(_ctx.longValue("DeleteTrainTaskResponse.Data.DatasetId"));
		data.setDatasetName(_ctx.stringValue("DeleteTrainTaskResponse.Data.DatasetName"));
		data.setLabelId(_ctx.longValue("DeleteTrainTaskResponse.Data.LabelId"));
		data.setLabelName(_ctx.stringValue("DeleteTrainTaskResponse.Data.LabelName"));
		data.setTrainMode(_ctx.stringValue("DeleteTrainTaskResponse.Data.TrainMode"));
		data.setTrainStatus(_ctx.stringValue("DeleteTrainTaskResponse.Data.TrainStatus"));
		data.setModelId(_ctx.longValue("DeleteTrainTaskResponse.Data.ModelId"));
		data.setModelEffect(_ctx.stringValue("DeleteTrainTaskResponse.Data.ModelEffect"));
		deleteTrainTaskResponse.setData(data);
	 
	 	return deleteTrainTaskResponse;
	}
}