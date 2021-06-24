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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsBatchStopInstanceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchStopInstanceResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchStopInstanceResponse.Data.OperateResponseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsBatchStopInstanceResponseUnmarshaller {

	public static OpsBatchStopInstanceResponse unmarshall(OpsBatchStopInstanceResponse opsBatchStopInstanceResponse, UnmarshallerContext _ctx) {
		
		opsBatchStopInstanceResponse.setRequestId(_ctx.stringValue("OpsBatchStopInstanceResponse.RequestId"));
		opsBatchStopInstanceResponse.setMessage(_ctx.stringValue("OpsBatchStopInstanceResponse.Message"));
		opsBatchStopInstanceResponse.setCode(_ctx.stringValue("OpsBatchStopInstanceResponse.Code"));
		opsBatchStopInstanceResponse.setSuccess(_ctx.booleanValue("OpsBatchStopInstanceResponse.Success"));

		Data data = new Data();
		data.setHasFailed(_ctx.booleanValue("OpsBatchStopInstanceResponse.Data.HasFailed"));
		data.setTaskId(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.TaskId"));

		List<OperateResponseModel> operateResponseModels = new ArrayList<OperateResponseModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels.Length"); i++) {
			OperateResponseModel operateResponseModel = new OperateResponseModel();
			operateResponseModel.setCurrentStatus(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].CurrentStatus"));
			operateResponseModel.setEcsId(_ctx.longValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].EcsId"));
			operateResponseModel.setPreviousStatus(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].PreviousStatus"));
			operateResponseModel.setCode(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].Code"));
			operateResponseModel.setMessage(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].Message"));
			operateResponseModel.setInstanceId(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].InstanceId"));
			operateResponseModel.setEcsAction(_ctx.stringValue("OpsBatchStopInstanceResponse.Data.OperateResponseModels["+ i +"].EcsAction"));

			operateResponseModels.add(operateResponseModel);
		}
		data.setOperateResponseModels(operateResponseModels);
		opsBatchStopInstanceResponse.setData(data);
	 
	 	return opsBatchStopInstanceResponse;
	}
}