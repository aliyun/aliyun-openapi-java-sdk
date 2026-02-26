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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetServiceMethodPageResponse;
import com.aliyuncs.mse.model.v20190531.GetServiceMethodPageResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetServiceMethodPageResponse.Data.Method;
import com.aliyuncs.mse.model.v20190531.GetServiceMethodPageResponse.Data.Method.ParameterDefinition;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceMethodPageResponseUnmarshaller {

	public static GetServiceMethodPageResponse unmarshall(GetServiceMethodPageResponse getServiceMethodPageResponse, UnmarshallerContext _ctx) {
		
		getServiceMethodPageResponse.setRequestId(_ctx.stringValue("GetServiceMethodPageResponse.RequestId"));
		getServiceMethodPageResponse.setSuccess(_ctx.booleanValue("GetServiceMethodPageResponse.Success"));
		getServiceMethodPageResponse.setHttpStatusCode(_ctx.integerValue("GetServiceMethodPageResponse.HttpStatusCode"));
		getServiceMethodPageResponse.setMessage(_ctx.stringValue("GetServiceMethodPageResponse.Message"));
		getServiceMethodPageResponse.setCode(_ctx.integerValue("GetServiceMethodPageResponse.Code"));

		Data data = new Data();
		data.setTotalSize(_ctx.integerValue("GetServiceMethodPageResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("GetServiceMethodPageResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetServiceMethodPageResponse.Data.PageSize"));

		List<Method> result = new ArrayList<Method>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result.Length"); i++) {
			Method method = new Method();
			method.setNameDetail(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].NameDetail"));
			method.setReturnDetails(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ReturnDetails"));
			method.setName(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].Name"));
			method.setMethodController(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].MethodController"));
			method.setReturnType(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ReturnType"));

			List<String> parameterDetails = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDetails.Length"); j++) {
				parameterDetails.add(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDetails["+ j +"]"));
			}
			method.setParameterDetails(parameterDetails);

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].Paths["+ j +"]"));
			}
			method.setPaths(paths);

			List<String> parameterTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterTypes.Length"); j++) {
				parameterTypes.add(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterTypes["+ j +"]"));
			}
			method.setParameterTypes(parameterTypes);

			List<String> requestMethods = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result["+ i +"].RequestMethods.Length"); j++) {
				requestMethods.add(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].RequestMethods["+ j +"]"));
			}
			method.setRequestMethods(requestMethods);

			List<ParameterDefinition> parameterDefinitions = new ArrayList<ParameterDefinition>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDefinitions.Length"); j++) {
				ParameterDefinition parameterDefinition = new ParameterDefinition();
				parameterDefinition.setType(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDefinitions["+ j +"].Type"));
				parameterDefinition.setDescription(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDefinitions["+ j +"].Description"));
				parameterDefinition.setName(_ctx.stringValue("GetServiceMethodPageResponse.Data.Result["+ i +"].ParameterDefinitions["+ j +"].Name"));

				parameterDefinitions.add(parameterDefinition);
			}
			method.setParameterDefinitions(parameterDefinitions);

			result.add(method);
		}
		data.setResult(result);
		getServiceMethodPageResponse.setData(data);
	 
	 	return getServiceMethodPageResponse;
	}
}