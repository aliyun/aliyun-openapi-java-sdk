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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.UpdateAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.UpdateAppEnvResponse.EnvChangeDetail;
import com.aliyuncs.webplus.model.v20190320.UpdateAppEnvResponse.EnvChangeDetail.Operation;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppEnvResponseUnmarshaller {

	public static UpdateAppEnvResponse unmarshall(UpdateAppEnvResponse updateAppEnvResponse, UnmarshallerContext _ctx) {
		
		updateAppEnvResponse.setRequestId(_ctx.stringValue("UpdateAppEnvResponse.RequestId"));
		updateAppEnvResponse.setCode(_ctx.stringValue("UpdateAppEnvResponse.Code"));
		updateAppEnvResponse.setMessage(_ctx.stringValue("UpdateAppEnvResponse.Message"));

		EnvChangeDetail envChangeDetail = new EnvChangeDetail();
		envChangeDetail.setEnvId(_ctx.stringValue("UpdateAppEnvResponse.EnvChangeDetail.EnvId"));
		envChangeDetail.setChangeId(_ctx.stringValue("UpdateAppEnvResponse.EnvChangeDetail.ChangeId"));
		envChangeDetail.setStartTime(_ctx.stringValue("UpdateAppEnvResponse.EnvChangeDetail.StartTime"));

		List<Operation> operations = new ArrayList<Operation>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppEnvResponse.EnvChangeDetail.Operations.Length"); i++) {
			Operation operation = new Operation();
			operation.setOperationType(_ctx.stringValue("UpdateAppEnvResponse.EnvChangeDetail.Operations["+ i +"].OperationType"));
			operation.setOperationDescription(_ctx.stringValue("UpdateAppEnvResponse.EnvChangeDetail.Operations["+ i +"].OperationDescription"));

			operations.add(operation);
		}
		envChangeDetail.setOperations(operations);
		updateAppEnvResponse.setEnvChangeDetail(envChangeDetail);
	 
	 	return updateAppEnvResponse;
	}
}