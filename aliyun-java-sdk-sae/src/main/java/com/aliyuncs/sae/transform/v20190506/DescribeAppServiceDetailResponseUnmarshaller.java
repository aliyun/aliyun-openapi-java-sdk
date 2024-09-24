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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeAppServiceDetailResponse;
import com.aliyuncs.sae.model.v20190506.DescribeAppServiceDetailResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeAppServiceDetailResponse.Data.Method;
import com.aliyuncs.sae.model.v20190506.DescribeAppServiceDetailResponse.Data.Method.ParameterDefinition;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppServiceDetailResponseUnmarshaller {

	public static DescribeAppServiceDetailResponse unmarshall(DescribeAppServiceDetailResponse describeAppServiceDetailResponse, UnmarshallerContext _ctx) {
		
		describeAppServiceDetailResponse.setRequestId(_ctx.stringValue("DescribeAppServiceDetailResponse.RequestId"));
		describeAppServiceDetailResponse.setMessage(_ctx.stringValue("DescribeAppServiceDetailResponse.Message"));
		describeAppServiceDetailResponse.setTraceId(_ctx.stringValue("DescribeAppServiceDetailResponse.TraceId"));
		describeAppServiceDetailResponse.setErrorCode(_ctx.stringValue("DescribeAppServiceDetailResponse.ErrorCode"));
		describeAppServiceDetailResponse.setCode(_ctx.stringValue("DescribeAppServiceDetailResponse.Code"));
		describeAppServiceDetailResponse.setSuccess(_ctx.booleanValue("DescribeAppServiceDetailResponse.Success"));

		Data data = new Data();
		data.setGroup(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Group"));
		data.setServiceName(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.ServiceName"));
		data.setVersion(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Version"));
		data.setServiceType(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.ServiceType"));
		data.setServiceProtocol(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.ServiceProtocol"));
		data.setEdasAppName(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.EdasAppName"));
		data.setMetadata(_ctx.mapValue("DescribeAppServiceDetailResponse.Data.Metadata"));
		data.setSpringApplicationName(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.SpringApplicationName"));
		data.setDubboApplicationName(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.DubboApplicationName"));

		List<Long> servicePorts = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.ServicePorts.Length"); i++) {
			servicePorts.add(_ctx.longValue("DescribeAppServiceDetailResponse.Data.ServicePorts["+ i +"]"));
		}
		data.setServicePorts(servicePorts);

		List<String> serviceTags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.ServiceTags.Length"); i++) {
			serviceTags.add(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.ServiceTags["+ i +"]"));
		}
		data.setServiceTags(serviceTags);

		List<Method> methods = new ArrayList<Method>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.Methods.Length"); i++) {
			Method method = new Method();
			method.setMethodController(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].MethodController"));
			method.setReturnType(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ReturnType"));
			method.setReturnDetails(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ReturnDetails"));
			method.setName(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].Name"));
			method.setNameDetail(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].NameDetail"));

			List<String> parameterDetails = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterDetails.Length"); j++) {
				parameterDetails.add(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterDetails["+ j +"]"));
			}
			method.setParameterDetails(parameterDetails);

			List<String> requestMethods = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].RequestMethods.Length"); j++) {
				requestMethods.add(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].RequestMethods["+ j +"]"));
			}
			method.setRequestMethods(requestMethods);

			List<String> parameterTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterTypes.Length"); j++) {
				parameterTypes.add(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterTypes["+ j +"]"));
			}
			method.setParameterTypes(parameterTypes);

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].Paths["+ j +"]"));
			}
			method.setPaths(paths);

			List<ParameterDefinition> parameterDefinitions = new ArrayList<ParameterDefinition>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterDefinitions.Length"); j++) {
				ParameterDefinition parameterDefinition = new ParameterDefinition();
				parameterDefinition.setType(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterDefinitions["+ j +"].Type"));
				parameterDefinition.setDescription(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterDefinitions["+ j +"].Description"));
				parameterDefinition.setName(_ctx.stringValue("DescribeAppServiceDetailResponse.Data.Methods["+ i +"].ParameterDefinitions["+ j +"].Name"));

				parameterDefinitions.add(parameterDefinition);
			}
			method.setParameterDefinitions(parameterDefinitions);

			methods.add(method);
		}
		data.setMethods(methods);
		describeAppServiceDetailResponse.setData(data);
	 
	 	return describeAppServiceDetailResponse;
	}
}