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

import com.aliyuncs.mse.model.v20190531.GetServiceListResponse;
import com.aliyuncs.mse.model.v20190531.GetServiceListResponse.MscServiceDetailResponse;
import com.aliyuncs.mse.model.v20190531.GetServiceListResponse.MscServiceDetailResponse.Method;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceListResponseUnmarshaller {

	public static GetServiceListResponse unmarshall(GetServiceListResponse getServiceListResponse, UnmarshallerContext _ctx) {
		
		getServiceListResponse.setRequestId(_ctx.stringValue("GetServiceListResponse.RequestId"));
		getServiceListResponse.setHttpStatusCode(_ctx.integerValue("GetServiceListResponse.HttpStatusCode"));
		getServiceListResponse.setMessage(_ctx.stringValue("GetServiceListResponse.Message"));
		getServiceListResponse.setCode(_ctx.integerValue("GetServiceListResponse.Code"));
		getServiceListResponse.setSuccess(_ctx.booleanValue("GetServiceListResponse.Success"));

		List<MscServiceDetailResponse> data = new ArrayList<MscServiceDetailResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceListResponse.Data.Length"); i++) {
			MscServiceDetailResponse mscServiceDetailResponse = new MscServiceDetailResponse();
			mscServiceDetailResponse.setEdasAppName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].EdasAppName"));
			mscServiceDetailResponse.setDubboApplicationName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].DubboApplicationName"));
			mscServiceDetailResponse.setVersion(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Version"));
			mscServiceDetailResponse.setSpringApplicationName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].SpringApplicationName"));
			mscServiceDetailResponse.setRegistryType(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].RegistryType"));
			mscServiceDetailResponse.setServiceType(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].ServiceType"));
			mscServiceDetailResponse.setServiceName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].ServiceName"));
			mscServiceDetailResponse.setMetadata(_ctx.mapValue("GetServiceListResponse.Data["+ i +"].Metadata"));
			mscServiceDetailResponse.setGroup(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Group"));

			List<Method> methods = new ArrayList<Method>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceListResponse.Data["+ i +"].Methods.Length"); j++) {
				Method method = new Method();
				method.setName(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].Name"));
				method.setMethodController(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].MethodController"));
				method.setReturnType(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ReturnType"));

				List<String> paths = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].Paths.Length"); k++) {
					paths.add(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].Paths["+ k +"]"));
				}
				method.setPaths(paths);

				List<String> parameterTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ParameterTypes.Length"); k++) {
					parameterTypes.add(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].ParameterTypes["+ k +"]"));
				}
				method.setParameterTypes(parameterTypes);

				List<String> requestMethods = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].RequestMethods.Length"); k++) {
					requestMethods.add(_ctx.stringValue("GetServiceListResponse.Data["+ i +"].Methods["+ j +"].RequestMethods["+ k +"]"));
				}
				method.setRequestMethods(requestMethods);

				methods.add(method);
			}
			mscServiceDetailResponse.setMethods(methods);

			data.add(mscServiceDetailResponse);
		}
		getServiceListResponse.setData(data);
	 
	 	return getServiceListResponse;
	}
}