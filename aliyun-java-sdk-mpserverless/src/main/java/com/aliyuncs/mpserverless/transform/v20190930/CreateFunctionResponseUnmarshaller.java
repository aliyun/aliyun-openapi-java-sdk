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

package com.aliyuncs.mpserverless.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190930.CreateFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190930.CreateFunctionResponse.FunctionSpec;
import com.aliyuncs.mpserverless.model.v20190930.CreateFunctionResponse.FunctionSpec.CustomVariable;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFunctionResponseUnmarshaller {

	public static CreateFunctionResponse unmarshall(CreateFunctionResponse createFunctionResponse, UnmarshallerContext _ctx) {
		
		createFunctionResponse.setRequestId(_ctx.stringValue("CreateFunctionResponse.RequestId"));
		createFunctionResponse.setHttpStatusCode(_ctx.stringValue("CreateFunctionResponse.HttpStatusCode"));
		createFunctionResponse.setSuccess(_ctx.booleanValue("CreateFunctionResponse.Success"));
		createFunctionResponse.setCode(_ctx.stringValue("CreateFunctionResponse.Code"));
		createFunctionResponse.setMessage(_ctx.stringValue("CreateFunctionResponse.Message"));
		createFunctionResponse.setFunctionId(_ctx.stringValue("CreateFunctionResponse.FunctionId"));
		createFunctionResponse.setFunctionName(_ctx.stringValue("CreateFunctionResponse.FunctionName"));
		createFunctionResponse.setFunctionDesc(_ctx.stringValue("CreateFunctionResponse.FunctionDesc"));
		createFunctionResponse.setCreateTime(_ctx.stringValue("CreateFunctionResponse.CreateTime"));
		createFunctionResponse.setUpdateTime(_ctx.stringValue("CreateFunctionResponse.UpdateTime"));

		FunctionSpec functionSpec = new FunctionSpec();
		functionSpec.setRuntime(_ctx.stringValue("CreateFunctionResponse.FunctionSpec.Runtime"));
		functionSpec.setMemory(_ctx.stringValue("CreateFunctionResponse.FunctionSpec.Memory"));
		functionSpec.setTimeout(_ctx.stringValue("CreateFunctionResponse.FunctionSpec.Timeout"));

		List<CustomVariable> customVariables = new ArrayList<CustomVariable>();
		for (int i = 0; i < _ctx.lengthValue("CreateFunctionResponse.FunctionSpec.CustomVariables.Length"); i++) {
			CustomVariable customVariable = new CustomVariable();
			customVariable.setName(_ctx.stringValue("CreateFunctionResponse.FunctionSpec.CustomVariables["+ i +"].Name"));
			customVariable.setValue(_ctx.stringValue("CreateFunctionResponse.FunctionSpec.CustomVariables["+ i +"].Value"));

			customVariables.add(customVariable);
		}
		functionSpec.setCustomVariables(customVariables);
		createFunctionResponse.setFunctionSpec(functionSpec);
	 
	 	return createFunctionResponse;
	}
}