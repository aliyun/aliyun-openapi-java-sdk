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

import com.aliyuncs.mpserverless.model.v20190930.ListFunctionsResponse;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionsResponse.Function;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionsResponse.Function.FunctionSpec;
import com.aliyuncs.mpserverless.model.v20190930.ListFunctionsResponse.Function.FunctionSpec.CustomVariable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionsResponseUnmarshaller {

	public static ListFunctionsResponse unmarshall(ListFunctionsResponse listFunctionsResponse, UnmarshallerContext _ctx) {
		
		listFunctionsResponse.setRequestId(_ctx.stringValue("ListFunctionsResponse.RequestId"));
		listFunctionsResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionsResponse.HttpStatusCode"));
		listFunctionsResponse.setSuccess(_ctx.booleanValue("ListFunctionsResponse.Success"));
		listFunctionsResponse.setCode(_ctx.stringValue("ListFunctionsResponse.Code"));
		listFunctionsResponse.setMessage(_ctx.stringValue("ListFunctionsResponse.Message"));
		listFunctionsResponse.setCode1(_ctx.stringValue("ListFunctionsResponse.Code"));
		listFunctionsResponse.setMessage2(_ctx.stringValue("ListFunctionsResponse.Message"));
		listFunctionsResponse.setPageSize(_ctx.integerValue("ListFunctionsResponse.PageSize"));
		listFunctionsResponse.setPageNumber(_ctx.integerValue("ListFunctionsResponse.PageNumber"));
		listFunctionsResponse.setTotalCount(_ctx.integerValue("ListFunctionsResponse.TotalCount"));

		List<Function> functions = new ArrayList<Function>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionsResponse.Functions.Length"); i++) {
			Function function = new Function();
			function.setFunctionId(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionId"));
			function.setFunctionName(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionName"));
			function.setFunctionDesc(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionDesc"));
			function.setCreateTime(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].CreateTime"));
			function.setUpdateTime(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].UpdateTime"));

			FunctionSpec functionSpec = new FunctionSpec();
			functionSpec.setRuntime(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionSpec.Runtime"));
			functionSpec.setMemory(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionSpec.Memory"));
			functionSpec.setTimeout(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionSpec.Timeout"));

			List<CustomVariable> customVariables = new ArrayList<CustomVariable>();
			for (int j = 0; j < _ctx.lengthValue("ListFunctionsResponse.Functions["+ i +"].FunctionSpec.CustomVariables.Length"); j++) {
				CustomVariable customVariable = new CustomVariable();
				customVariable.setName(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionSpec.CustomVariables["+ j +"].Name"));
				customVariable.setValue(_ctx.stringValue("ListFunctionsResponse.Functions["+ i +"].FunctionSpec.CustomVariables["+ j +"].Value"));

				customVariables.add(customVariable);
			}
			functionSpec.setCustomVariables(customVariables);
			function.setFunctionSpec(functionSpec);

			functions.add(function);
		}
		listFunctionsResponse.setFunctions(functions);
	 
	 	return listFunctionsResponse;
	}
}