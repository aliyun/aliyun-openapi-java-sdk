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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetServiceExtensionsResponse;
import com.aliyuncs.ccc.model.v20170705.GetServiceExtensionsResponse.ServiceExtension;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceExtensionsResponseUnmarshaller {

	public static GetServiceExtensionsResponse unmarshall(GetServiceExtensionsResponse getServiceExtensionsResponse, UnmarshallerContext _ctx) {
		
		getServiceExtensionsResponse.setRequestId(_ctx.stringValue("GetServiceExtensionsResponse.RequestId"));
		getServiceExtensionsResponse.setSuccess(_ctx.booleanValue("GetServiceExtensionsResponse.Success"));
		getServiceExtensionsResponse.setCode(_ctx.stringValue("GetServiceExtensionsResponse.Code"));
		getServiceExtensionsResponse.setMessage(_ctx.stringValue("GetServiceExtensionsResponse.Message"));
		getServiceExtensionsResponse.setHttpStatusCode(_ctx.integerValue("GetServiceExtensionsResponse.HttpStatusCode"));

		List<ServiceExtension> serviceExtensions = new ArrayList<ServiceExtension>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceExtensionsResponse.ServiceExtensions.Length"); i++) {
			ServiceExtension serviceExtension = new ServiceExtension();
			serviceExtension.setName(_ctx.stringValue("GetServiceExtensionsResponse.ServiceExtensions["+ i +"].Name"));
			serviceExtension.setNumber(_ctx.stringValue("GetServiceExtensionsResponse.ServiceExtensions["+ i +"].Number"));

			serviceExtensions.add(serviceExtension);
		}
		getServiceExtensionsResponse.setServiceExtensions(serviceExtensions);
	 
	 	return getServiceExtensionsResponse;
	}
}