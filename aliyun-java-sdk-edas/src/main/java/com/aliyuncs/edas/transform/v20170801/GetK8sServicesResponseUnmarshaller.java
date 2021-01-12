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

import com.aliyuncs.edas.model.v20170801.GetK8sServicesResponse;
import com.aliyuncs.edas.model.v20170801.GetK8sServicesResponse.ServicesItem;
import com.aliyuncs.edas.model.v20170801.GetK8sServicesResponse.ServicesItem.ServicePortsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetK8sServicesResponseUnmarshaller {

	public static GetK8sServicesResponse unmarshall(GetK8sServicesResponse getK8sServicesResponse, UnmarshallerContext _ctx) {
		
		getK8sServicesResponse.setRequestId(_ctx.stringValue("GetK8sServicesResponse.RequestId"));
		getK8sServicesResponse.setCode(_ctx.integerValue("GetK8sServicesResponse.Code"));
		getK8sServicesResponse.setMessage(_ctx.stringValue("GetK8sServicesResponse.Message"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sServicesResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setName(_ctx.stringValue("GetK8sServicesResponse.Services["+ i +"].Name"));
			servicesItem.setType(_ctx.stringValue("GetK8sServicesResponse.Services["+ i +"].Type"));
			servicesItem.setClusterIP(_ctx.stringValue("GetK8sServicesResponse.Services["+ i +"].ClusterIP"));

			List<ServicePortsItem> servicePorts = new ArrayList<ServicePortsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetK8sServicesResponse.Services["+ i +"].ServicePorts.Length"); j++) {
				ServicePortsItem servicePortsItem = new ServicePortsItem();
				servicePortsItem.setBizProtocol(_ctx.stringValue("GetK8sServicesResponse.Services["+ i +"].ServicePorts["+ j +"].Protocol"));
				servicePortsItem.setPort(_ctx.integerValue("GetK8sServicesResponse.Services["+ i +"].ServicePorts["+ j +"].Port"));
				servicePortsItem.setTargetPort(_ctx.stringValue("GetK8sServicesResponse.Services["+ i +"].ServicePorts["+ j +"].TargetPort"));
				servicePortsItem.setNodePort(_ctx.integerValue("GetK8sServicesResponse.Services["+ i +"].ServicePorts["+ j +"].NodePort"));

				servicePorts.add(servicePortsItem);
			}
			servicesItem.setServicePorts(servicePorts);

			services.add(servicesItem);
		}
		getK8sServicesResponse.setServices(services);
	 
	 	return getK8sServicesResponse;
	}
}