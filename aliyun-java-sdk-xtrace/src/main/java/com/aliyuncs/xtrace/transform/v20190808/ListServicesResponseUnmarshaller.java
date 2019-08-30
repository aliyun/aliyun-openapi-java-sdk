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

package com.aliyuncs.xtrace.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xtrace.model.v20190808.ListServicesResponse;
import com.aliyuncs.xtrace.model.v20190808.ListServicesResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListServicesResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setServiceName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceName"));
			service.setPid(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Pid"));
			service.setRegionId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].RegionId"));

			services.add(service);
		}
		listServicesResponse.setServices(services);
	 
	 	return listServicesResponse;
	}
}