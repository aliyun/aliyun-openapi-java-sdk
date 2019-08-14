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

import com.aliyuncs.edas.model.v20170801.ListMethodsResponse;
import com.aliyuncs.edas.model.v20170801.ListMethodsResponse.ServiceMethod;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMethodsResponseUnmarshaller {

	public static ListMethodsResponse unmarshall(ListMethodsResponse listMethodsResponse, UnmarshallerContext _ctx) {
		
		listMethodsResponse.setRequestId(_ctx.stringValue("ListMethodsResponse.RequestId"));
		listMethodsResponse.setCode(_ctx.integerValue("ListMethodsResponse.Code"));
		listMethodsResponse.setMessage(_ctx.stringValue("ListMethodsResponse.Message"));

		List<ServiceMethod> serviceMethodList = new ArrayList<ServiceMethod>();
		for (int i = 0; i < _ctx.lengthValue("ListMethodsResponse.ServiceMethodList.Length"); i++) {
			ServiceMethod serviceMethod = new ServiceMethod();
			serviceMethod.setAppName(_ctx.stringValue("ListMethodsResponse.ServiceMethodList["+ i +"].AppName"));
			serviceMethod.setServiceName(_ctx.stringValue("ListMethodsResponse.ServiceMethodList["+ i +"].ServiceName"));
			serviceMethod.setMethodName(_ctx.stringValue("ListMethodsResponse.ServiceMethodList["+ i +"].MethodName"));
			serviceMethod.setOutput(_ctx.stringValue("ListMethodsResponse.ServiceMethodList["+ i +"].Output"));

			List<String> inputParams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMethodsResponse.ServiceMethodList["+ i +"].InputParams.Length"); j++) {
				inputParams.add(_ctx.stringValue("ListMethodsResponse.ServiceMethodList["+ i +"].InputParams["+ j +"]"));
			}
			serviceMethod.setInputParams(inputParams);

			List<String> paramTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMethodsResponse.ServiceMethodList["+ i +"].ParamTypes.Length"); j++) {
				paramTypes.add(_ctx.stringValue("ListMethodsResponse.ServiceMethodList["+ i +"].ParamTypes["+ j +"]"));
			}
			serviceMethod.setParamTypes(paramTypes);

			serviceMethodList.add(serviceMethod);
		}
		listMethodsResponse.setServiceMethodList(serviceMethodList);
	 
	 	return listMethodsResponse;
	}
}