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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.InstallAgentResponse;
import com.aliyuncs.edas.model.v20170801.InstallAgentResponse.ExecutionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallAgentResponseUnmarshaller {

	public static InstallAgentResponse unmarshall(InstallAgentResponse installAgentResponse, UnmarshallerContext context) {
		
		installAgentResponse.setRequestId(context.stringValue("InstallAgentResponse.RequestId"));
		installAgentResponse.setCode(context.integerValue("InstallAgentResponse.Code"));
		installAgentResponse.setMessage(context.stringValue("InstallAgentResponse.Message"));

		List<ExecutionResult> executionResultList = new ArrayList<ExecutionResult>();
		for (int i = 0; i < context.lengthValue("InstallAgentResponse.ExecutionResultList.Length"); i++) {
			ExecutionResult executionResult = new ExecutionResult();
			executionResult.setInstanceId(context.stringValue("InstallAgentResponse.ExecutionResultList["+ i +"].InstanceId"));
			executionResult.setStatus(context.stringValue("InstallAgentResponse.ExecutionResultList["+ i +"].Status"));
			executionResult.setFinishedTime(context.stringValue("InstallAgentResponse.ExecutionResultList["+ i +"].FinishedTime"));
			executionResult.setInvokeRecordStatus(context.stringValue("InstallAgentResponse.ExecutionResultList["+ i +"].InvokeRecordStatus"));
			executionResult.setSuccess(context.booleanValue("InstallAgentResponse.ExecutionResultList["+ i +"].Success"));

			executionResultList.add(executionResult);
		}
		installAgentResponse.setExecutionResultList(executionResultList);
	 
	 	return installAgentResponse;
	}
}