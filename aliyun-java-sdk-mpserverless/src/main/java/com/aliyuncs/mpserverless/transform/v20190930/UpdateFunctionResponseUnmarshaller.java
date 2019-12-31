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

import com.aliyuncs.mpserverless.model.v20190930.UpdateFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190930.UpdateFunctionResponse.FunctionSpec;
import com.aliyuncs.mpserverless.model.v20190930.UpdateFunctionResponse.FunctionSpec.CustomVariable;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFunctionResponseUnmarshaller {

	public static UpdateFunctionResponse unmarshall(UpdateFunctionResponse updateFunctionResponse, UnmarshallerContext _ctx) {
		
		updateFunctionResponse.setRequestId(_ctx.stringValue("UpdateFunctionResponse.RequestId"));
		updateFunctionResponse.setHttpStatusCode(_ctx.stringValue("UpdateFunctionResponse.HttpStatusCode"));
		updateFunctionResponse.setSuccess(_ctx.booleanValue("UpdateFunctionResponse.Success"));
		updateFunctionResponse.setCode(_ctx.stringValue("UpdateFunctionResponse.Code"));
		updateFunctionResponse.setMessage(_ctx.stringValue("UpdateFunctionResponse.Message"));
		updateFunctionResponse.setCode1(_ctx.stringValue("UpdateFunctionResponse.Code"));
		updateFunctionResponse.setMessage2(_ctx.stringValue("UpdateFunctionResponse.Message"));
		updateFunctionResponse.setFunctionId(_ctx.stringValue("UpdateFunctionResponse.FunctionId"));
		updateFunctionResponse.setFunctionName(_ctx.stringValue("UpdateFunctionResponse.FunctionName"));
		updateFunctionResponse.setFunctionDesc(_ctx.stringValue("UpdateFunctionResponse.FunctionDesc"));
		updateFunctionResponse.setCreateTime(_ctx.stringValue("UpdateFunctionResponse.CreateTime"));
		updateFunctionResponse.setUpdateTime(_ctx.stringValue("UpdateFunctionResponse.UpdateTime"));

		FunctionSpec functionSpec = new FunctionSpec();
		functionSpec.setRuntime(_ctx.stringValue("UpdateFunctionResponse.FunctionSpec.Runtime"));
		functionSpec.setMemory(_ctx.stringValue("UpdateFunctionResponse.FunctionSpec.Memory"));
		functionSpec.setTimeout(_ctx.stringValue("UpdateFunctionResponse.FunctionSpec.Timeout"));

		List<CustomVariable> customVariables = new ArrayList<CustomVariable>();
		for (int i = 0; i < _ctx.lengthValue("UpdateFunctionResponse.FunctionSpec.CustomVariables.Length"); i++) {
			CustomVariable customVariable = new CustomVariable();
			customVariable.setName(_ctx.stringValue("UpdateFunctionResponse.FunctionSpec.CustomVariables["+ i +"].Name"));
			customVariable.setValue(_ctx.stringValue("UpdateFunctionResponse.FunctionSpec.CustomVariables["+ i +"].Value"));

			customVariables.add(customVariable);
		}
		functionSpec.setCustomVariables(customVariables);
		updateFunctionResponse.setFunctionSpec(functionSpec);
	 
	 	return updateFunctionResponse;
	}
}