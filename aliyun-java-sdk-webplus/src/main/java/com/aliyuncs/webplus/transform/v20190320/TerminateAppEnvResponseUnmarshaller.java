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

import com.aliyuncs.webplus.model.v20190320.TerminateAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.TerminateAppEnvResponse.EnvChangeDetail;
import com.aliyuncs.webplus.model.v20190320.TerminateAppEnvResponse.EnvChangeDetail.Operation;
import com.aliyuncs.transform.UnmarshallerContext;


public class TerminateAppEnvResponseUnmarshaller {

	public static TerminateAppEnvResponse unmarshall(TerminateAppEnvResponse terminateAppEnvResponse, UnmarshallerContext _ctx) {
		
		terminateAppEnvResponse.setRequestId(_ctx.stringValue("TerminateAppEnvResponse.RequestId"));
		terminateAppEnvResponse.setCode(_ctx.stringValue("TerminateAppEnvResponse.Code"));
		terminateAppEnvResponse.setMessage(_ctx.stringValue("TerminateAppEnvResponse.Message"));

		EnvChangeDetail envChangeDetail = new EnvChangeDetail();
		envChangeDetail.setEnvId(_ctx.stringValue("TerminateAppEnvResponse.EnvChangeDetail.EnvId"));
		envChangeDetail.setChangeId(_ctx.stringValue("TerminateAppEnvResponse.EnvChangeDetail.ChangeId"));
		envChangeDetail.setStartTime(_ctx.stringValue("TerminateAppEnvResponse.EnvChangeDetail.StartTime"));

		List<Operation> operations = new ArrayList<Operation>();
		for (int i = 0; i < _ctx.lengthValue("TerminateAppEnvResponse.EnvChangeDetail.Operations.Length"); i++) {
			Operation operation = new Operation();
			operation.setOperationType(_ctx.stringValue("TerminateAppEnvResponse.EnvChangeDetail.Operations["+ i +"].OperationType"));
			operation.setOperationDescription(_ctx.stringValue("TerminateAppEnvResponse.EnvChangeDetail.Operations["+ i +"].OperationDescription"));

			operations.add(operation);
		}
		envChangeDetail.setOperations(operations);
		terminateAppEnvResponse.setEnvChangeDetail(envChangeDetail);
	 
	 	return terminateAppEnvResponse;
	}
}