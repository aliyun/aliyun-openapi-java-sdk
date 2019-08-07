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

import com.aliyuncs.webplus.model.v20190320.DryRunCreateAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.DryRunCreateAppEnvResponse.DryRunInfo;
import com.aliyuncs.webplus.model.v20190320.DryRunCreateAppEnvResponse.DryRunInfo.Operation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DryRunCreateAppEnvResponseUnmarshaller {

	public static DryRunCreateAppEnvResponse unmarshall(DryRunCreateAppEnvResponse dryRunCreateAppEnvResponse, UnmarshallerContext _ctx) {
		
		dryRunCreateAppEnvResponse.setRequestId(_ctx.stringValue("DryRunCreateAppEnvResponse.RequestId"));
		dryRunCreateAppEnvResponse.setCode(_ctx.stringValue("DryRunCreateAppEnvResponse.Code"));
		dryRunCreateAppEnvResponse.setMessage(_ctx.stringValue("DryRunCreateAppEnvResponse.Message"));

		DryRunInfo dryRunInfo = new DryRunInfo();

		List<Operation> operations = new ArrayList<Operation>();
		for (int i = 0; i < _ctx.lengthValue("DryRunCreateAppEnvResponse.DryRunInfo.Operations.Length"); i++) {
			Operation operation = new Operation();
			operation.setOperationType(_ctx.stringValue("DryRunCreateAppEnvResponse.DryRunInfo.Operations["+ i +"].OperationType"));
			operation.setOperationDescription(_ctx.stringValue("DryRunCreateAppEnvResponse.DryRunInfo.Operations["+ i +"].OperationDescription"));

			operations.add(operation);
		}
		dryRunInfo.setOperations(operations);
		dryRunCreateAppEnvResponse.setDryRunInfo(dryRunInfo);
	 
	 	return dryRunCreateAppEnvResponse;
	}
}