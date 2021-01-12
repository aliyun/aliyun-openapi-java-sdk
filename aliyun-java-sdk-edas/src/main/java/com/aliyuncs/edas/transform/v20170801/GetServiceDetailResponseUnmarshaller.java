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

import com.aliyuncs.edas.model.v20170801.GetServiceDetailResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceDetailResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetServiceDetailResponse.Data.Method;
import com.aliyuncs.edas.model.v20170801.GetServiceDetailResponse.Data.Method.ReturnDefinition;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceDetailResponseUnmarshaller {

	public static GetServiceDetailResponse unmarshall(GetServiceDetailResponse getServiceDetailResponse, UnmarshallerContext _ctx) {
		
		getServiceDetailResponse.setCode(_ctx.integerValue("GetServiceDetailResponse.Code"));
		getServiceDetailResponse.setMessage(_ctx.stringValue("GetServiceDetailResponse.Message"));
		getServiceDetailResponse.setSuccess(_ctx.booleanValue("GetServiceDetailResponse.Success"));

		Data data = new Data();
		data.setServiceName(_ctx.stringValue("GetServiceDetailResponse.Data.ServiceName"));
		data.setEdasAppName(_ctx.stringValue("GetServiceDetailResponse.Data.EdasAppName"));
		data.setDubboApplicationName(_ctx.stringValue("GetServiceDetailResponse.Data.DubboApplicationName"));
		data.setSpringApplicationName(_ctx.stringValue("GetServiceDetailResponse.Data.SpringApplicationName"));
		data.setServiceType(_ctx.stringValue("GetServiceDetailResponse.Data.ServiceType"));
		data.setRegistryType(_ctx.stringValue("GetServiceDetailResponse.Data.RegistryType"));
		data.setVersion(_ctx.stringValue("GetServiceDetailResponse.Data.Version"));
		data.setGroup(_ctx.stringValue("GetServiceDetailResponse.Data.Group"));
		data.setMetadata(_ctx.stringValue("GetServiceDetailResponse.Data.Metadata"));

		List<Method> methods = new ArrayList<Method>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceDetailResponse.Data.Methods.Length"); i++) {
			Method method = new Method();
			method.setName(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].Name"));
			method.setReturnType(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ReturnType"));
			method.setMethodController(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].MethodController"));
			method.setParameterNames(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ParameterNames"));
			method.setNameDetail(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].NameDetail"));
			method.setReturnDetails(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ReturnDetails"));
			method.setParameterTypes(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ParameterTypes"));
			method.setParameterDetails(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ParameterDetails"));
			method.setRequestMethods(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].RequestMethods"));
			method.setPaths(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].Paths"));
			method.setParameterDefinitions(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ParameterDefinitions"));

			ReturnDefinition returnDefinition = new ReturnDefinition();
			returnDefinition.setId(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ReturnDefinition.Id"));
			returnDefinition.setType(_ctx.stringValue("GetServiceDetailResponse.Data.Methods["+ i +"].ReturnDefinition.Type"));
			method.setReturnDefinition(returnDefinition);

			methods.add(method);
		}
		data.setMethods(methods);
		getServiceDetailResponse.setData(data);
	 
	 	return getServiceDetailResponse;
	}
}