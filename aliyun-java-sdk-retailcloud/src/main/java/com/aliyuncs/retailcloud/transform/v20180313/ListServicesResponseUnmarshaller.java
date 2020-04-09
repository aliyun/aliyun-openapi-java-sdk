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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListServicesResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListServicesResponse.ServiceInstance;
import com.aliyuncs.retailcloud.model.v20180313.ListServicesResponse.ServiceInstance.ServicePortMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));
		listServicesResponse.setCode(_ctx.integerValue("ListServicesResponse.Code"));
		listServicesResponse.setErrorMsg(_ctx.stringValue("ListServicesResponse.ErrorMsg"));
		listServicesResponse.setPageNumber(_ctx.integerValue("ListServicesResponse.PageNumber"));
		listServicesResponse.setPageSize(_ctx.integerValue("ListServicesResponse.PageSize"));
		listServicesResponse.setTotalCount(_ctx.longValue("ListServicesResponse.TotalCount"));
		listServicesResponse.setClusterIP(_ctx.stringValue("ListServicesResponse.ClusterIP"));
		listServicesResponse.setClusterIP1(_ctx.stringValue("ListServicesResponse.ClusterIP"));

		List<ServiceInstance> data = new ArrayList<ServiceInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListServicesResponse.Data.Length"); i++) {
			ServiceInstance serviceInstance = new ServiceInstance();
			serviceInstance.setAppId(_ctx.longValue("ListServicesResponse.Data["+ i +"].AppId"));
			serviceInstance.setEnvId(_ctx.longValue("ListServicesResponse.Data["+ i +"].EnvId"));
			serviceInstance.setHeadless(_ctx.booleanValue("ListServicesResponse.Data["+ i +"].Headless"));
			serviceInstance.setK8sServiceId(_ctx.stringValue("ListServicesResponse.Data["+ i +"].K8sServiceId"));
			serviceInstance.setName(_ctx.stringValue("ListServicesResponse.Data["+ i +"].Name"));
			serviceInstance.setServiceId(_ctx.longValue("ListServicesResponse.Data["+ i +"].ServiceId"));
			serviceInstance.setServiceType(_ctx.stringValue("ListServicesResponse.Data["+ i +"].ServiceType"));
			serviceInstance.setClusterIP(_ctx.stringValue("ListServicesResponse.Data["+ i +"].ClusterIP"));

			List<ServicePortMapping> portMappings = new ArrayList<ServicePortMapping>();
			for (int j = 0; j < _ctx.lengthValue("ListServicesResponse.Data["+ i +"].PortMappings.Length"); j++) {
				ServicePortMapping servicePortMapping = new ServicePortMapping();
				servicePortMapping.setName(_ctx.stringValue("ListServicesResponse.Data["+ i +"].PortMappings["+ j +"].Name"));
				servicePortMapping.setNodePort(_ctx.integerValue("ListServicesResponse.Data["+ i +"].PortMappings["+ j +"].NodePort"));
				servicePortMapping.setPort(_ctx.integerValue("ListServicesResponse.Data["+ i +"].PortMappings["+ j +"].Port"));
				servicePortMapping.setBizProtocol(_ctx.stringValue("ListServicesResponse.Data["+ i +"].PortMappings["+ j +"].Protocol"));
				servicePortMapping.setTargetPort(_ctx.stringValue("ListServicesResponse.Data["+ i +"].PortMappings["+ j +"].TargetPort"));

				portMappings.add(servicePortMapping);
			}
			serviceInstance.setPortMappings(portMappings);

			data.add(serviceInstance);
		}
		listServicesResponse.setData(data);
	 
	 	return listServicesResponse;
	}
}