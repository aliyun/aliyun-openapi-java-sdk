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

import com.aliyuncs.ecsops.model.v20160401.OpsBatchRestartInstanceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchRestartInstanceResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchRestartInstanceResponse.Data.OperateResponseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsBatchRestartInstanceResponseUnmarshaller {

	public static OpsBatchRestartInstanceResponse unmarshall(OpsBatchRestartInstanceResponse opsBatchRestartInstanceResponse, UnmarshallerContext _ctx) {
		
		opsBatchRestartInstanceResponse.setRequestId(_ctx.stringValue("OpsBatchRestartInstanceResponse.RequestId"));
		opsBatchRestartInstanceResponse.setMessage(_ctx.stringValue("OpsBatchRestartInstanceResponse.Message"));
		opsBatchRestartInstanceResponse.setCode(_ctx.stringValue("OpsBatchRestartInstanceResponse.Code"));
		opsBatchRestartInstanceResponse.setSuccess(_ctx.booleanValue("OpsBatchRestartInstanceResponse.Success"));

		Data data = new Data();
		data.setHasFailed(_ctx.booleanValue("OpsBatchRestartInstanceResponse.Data.HasFailed"));
		data.setTaskId(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.TaskId"));

		List<OperateResponseModel> operateResponseModels = new ArrayList<OperateResponseModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels.Length"); i++) {
			OperateResponseModel operateResponseModel = new OperateResponseModel();
			operateResponseModel.setCurrentStatus(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].CurrentStatus"));
			operateResponseModel.setEcsId(_ctx.longValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].EcsId"));
			operateResponseModel.setPreviousStatus(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].PreviousStatus"));
			operateResponseModel.setCode(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].Code"));
			operateResponseModel.setMessage(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].Message"));
			operateResponseModel.setInstanceId(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].InstanceId"));
			operateResponseModel.setEcsAction(_ctx.stringValue("OpsBatchRestartInstanceResponse.Data.OperateResponseModels["+ i +"].EcsAction"));

			operateResponseModels.add(operateResponseModel);
		}
		data.setOperateResponseModels(operateResponseModels);
		opsBatchRestartInstanceResponse.setData(data);
	 
	 	return opsBatchRestartInstanceResponse;
	}
}