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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse.Service;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse.Service.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));
		listServicesResponse.setNextToken(_ctx.stringValue("ListServicesResponse.NextToken"));
		listServicesResponse.setTotalCount(_ctx.stringValue("ListServicesResponse.TotalCount"));
		listServicesResponse.setMaxResults(_ctx.integerValue("ListServicesResponse.MaxResults"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListServicesResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setStatus(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Status"));
			service.setDefaultVersion(_ctx.booleanValue("ListServicesResponse.Services["+ i +"].DefaultVersion"));
			service.setPublishTime(_ctx.stringValue("ListServicesResponse.Services["+ i +"].PublishTime"));
			service.setVersion(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Version"));
			service.setDeployType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].DeployType"));
			service.setServiceId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceId"));
			service.setSupplierUrl(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SupplierUrl"));
			service.setServiceType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceType"));
			service.setSupplierName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SupplierName"));
			service.setCommodityCode(_ctx.stringValue("ListServicesResponse.Services["+ i +"].CommodityCode"));

			List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListServicesResponse.Services["+ i +"].ServiceInfos.Length"); j++) {
				ServiceInfo serviceInfo = new ServiceInfo();
				serviceInfo.setLocale(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Locale"));
				serviceInfo.setImage(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Image"));
				serviceInfo.setName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Name"));
				serviceInfo.setShortDescription(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].ShortDescription"));

				serviceInfos.add(serviceInfo);
			}
			service.setServiceInfos(serviceInfos);

			services.add(service);
		}
		listServicesResponse.setServices(services);
	 
	 	return listServicesResponse;
	}
}