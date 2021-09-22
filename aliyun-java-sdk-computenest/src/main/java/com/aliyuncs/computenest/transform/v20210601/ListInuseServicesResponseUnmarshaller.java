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

package com.aliyuncs.computenest.transform.v20210601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenest.model.v20210601.ListInuseServicesResponse;
import com.aliyuncs.computenest.model.v20210601.ListInuseServicesResponse.Service;
import com.aliyuncs.computenest.model.v20210601.ListInuseServicesResponse.Service.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInuseServicesResponseUnmarshaller {

	public static ListInuseServicesResponse unmarshall(ListInuseServicesResponse listInuseServicesResponse, UnmarshallerContext _ctx) {
		
		listInuseServicesResponse.setRequestId(_ctx.stringValue("ListInuseServicesResponse.RequestId"));
		listInuseServicesResponse.setNextToken(_ctx.stringValue("ListInuseServicesResponse.NextToken"));
		listInuseServicesResponse.setTotalCount(_ctx.stringValue("ListInuseServicesResponse.TotalCount"));
		listInuseServicesResponse.setMaxResults(_ctx.stringValue("ListInuseServicesResponse.MaxResults"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListInuseServicesResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setStatus(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].Status"));
			service.setPublishTime(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].PublishTime"));
			service.setVersion(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].Version"));
			service.setDeployType(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].DeployType"));
			service.setServiceId(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].ServiceId"));
			service.setSupplierUrl(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].SupplierUrl"));
			service.setServiceType(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].ServiceType"));
			service.setSupplierName(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].SupplierName"));
			service.setCommodityCode(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].CommodityCode"));

			List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListInuseServicesResponse.Services["+ i +"].ServiceInfos.Length"); j++) {
				ServiceInfo serviceInfo = new ServiceInfo();
				serviceInfo.setLocale(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Locale"));
				serviceInfo.setImage(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Image"));
				serviceInfo.setName(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Name"));
				serviceInfo.setShortDescription(_ctx.stringValue("ListInuseServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].ShortDescription"));

				serviceInfos.add(serviceInfo);
			}
			service.setServiceInfos(serviceInfos);

			services.add(service);
		}
		listInuseServicesResponse.setServices(services);
	 
	 	return listInuseServicesResponse;
	}
}