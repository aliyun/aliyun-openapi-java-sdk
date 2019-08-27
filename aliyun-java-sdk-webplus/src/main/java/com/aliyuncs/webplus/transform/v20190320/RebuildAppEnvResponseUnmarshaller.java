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

import com.aliyuncs.webplus.model.v20190320.RebuildAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.RebuildAppEnvResponse.EnvChangeDetail;
import com.aliyuncs.webplus.model.v20190320.RebuildAppEnvResponse.EnvChangeDetail.Operation;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebuildAppEnvResponseUnmarshaller {

	public static RebuildAppEnvResponse unmarshall(RebuildAppEnvResponse rebuildAppEnvResponse, UnmarshallerContext _ctx) {
		
		rebuildAppEnvResponse.setRequestId(_ctx.stringValue("RebuildAppEnvResponse.RequestId"));
		rebuildAppEnvResponse.setCode(_ctx.stringValue("RebuildAppEnvResponse.Code"));
		rebuildAppEnvResponse.setMessage(_ctx.stringValue("RebuildAppEnvResponse.Message"));

		EnvChangeDetail envChangeDetail = new EnvChangeDetail();
		envChangeDetail.setEnvId(_ctx.stringValue("RebuildAppEnvResponse.EnvChangeDetail.EnvId"));
		envChangeDetail.setChangeId(_ctx.stringValue("RebuildAppEnvResponse.EnvChangeDetail.ChangeId"));
		envChangeDetail.setStartTime(_ctx.stringValue("RebuildAppEnvResponse.EnvChangeDetail.StartTime"));

		List<Operation> operations = new ArrayList<Operation>();
		for (int i = 0; i < _ctx.lengthValue("RebuildAppEnvResponse.EnvChangeDetail.Operations.Length"); i++) {
			Operation operation = new Operation();
			operation.setOperationType(_ctx.stringValue("RebuildAppEnvResponse.EnvChangeDetail.Operations["+ i +"].OperationType"));
			operation.setOperationDescription(_ctx.stringValue("RebuildAppEnvResponse.EnvChangeDetail.Operations["+ i +"].OperationDescription"));

			operations.add(operation);
		}
		envChangeDetail.setOperations(operations);
		rebuildAppEnvResponse.setEnvChangeDetail(envChangeDetail);
	 
	 	return rebuildAppEnvResponse;
	}
}