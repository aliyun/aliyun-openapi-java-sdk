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

import com.aliyuncs.mpserverless.model.v20190930.DescribeFunctionResponse;
import com.aliyuncs.mpserverless.model.v20190930.DescribeFunctionResponse.Function;
import com.aliyuncs.mpserverless.model.v20190930.DescribeFunctionResponse.Function.FunctionSpec;
import com.aliyuncs.mpserverless.model.v20190930.DescribeFunctionResponse.Function.FunctionSpec.CustomVariable;
import com.aliyuncs.mpserverless.model.v20190930.DescribeFunctionResponse.LastDeployment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFunctionResponseUnmarshaller {

	public static DescribeFunctionResponse unmarshall(DescribeFunctionResponse describeFunctionResponse, UnmarshallerContext _ctx) {
		
		describeFunctionResponse.setRequestId(_ctx.stringValue("DescribeFunctionResponse.RequestId"));
		describeFunctionResponse.setHttpStatusCode(_ctx.stringValue("DescribeFunctionResponse.HttpStatusCode"));
		describeFunctionResponse.setSuccess(_ctx.booleanValue("DescribeFunctionResponse.Success"));
		describeFunctionResponse.setCode(_ctx.stringValue("DescribeFunctionResponse.Code"));
		describeFunctionResponse.setMessage(_ctx.stringValue("DescribeFunctionResponse.Message"));

		Function function = new Function();
		function.setFunctionId(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionId"));
		function.setFunctionName(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionName"));
		function.setFunctionDesc(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionDesc"));
		function.setCreateTime(_ctx.stringValue("DescribeFunctionResponse.Function.CreateTime"));
		function.setUpdateTime(_ctx.stringValue("DescribeFunctionResponse.Function.UpdateTime"));

		FunctionSpec functionSpec = new FunctionSpec();
		functionSpec.setRuntime(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionSpec.Runtime"));
		functionSpec.setMemory(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionSpec.Memory"));
		functionSpec.setTimeout(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionSpec.Timeout"));

		List<CustomVariable> customVariables = new ArrayList<CustomVariable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFunctionResponse.Function.FunctionSpec.CustomVariables.Length"); i++) {
			CustomVariable customVariable = new CustomVariable();
			customVariable.setName(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionSpec.CustomVariables["+ i +"].Name"));
			customVariable.setValue(_ctx.stringValue("DescribeFunctionResponse.Function.FunctionSpec.CustomVariables["+ i +"].Value"));

			customVariables.add(customVariable);
		}
		functionSpec.setCustomVariables(customVariables);
		function.setFunctionSpec(functionSpec);
		describeFunctionResponse.setFunction(function);

		LastDeployment lastDeployment = new LastDeployment();
		lastDeployment.setDeploymentId(_ctx.stringValue("DescribeFunctionResponse.LastDeployment.DeploymentId"));
		lastDeployment.setDeploymentVersion(_ctx.stringValue("DescribeFunctionResponse.LastDeployment.DeploymentVersion"));
		lastDeployment.setArtifactDownloadUrl(_ctx.stringValue("DescribeFunctionResponse.LastDeployment.ArtifactDownloadUrl"));
		lastDeployment.setCreateTime(_ctx.stringValue("DescribeFunctionResponse.LastDeployment.CreateTime"));
		lastDeployment.setUpdateTime(_ctx.stringValue("DescribeFunctionResponse.LastDeployment.UpdateTime"));
		describeFunctionResponse.setLastDeployment(lastDeployment);
	 
	 	return describeFunctionResponse;
	}
}