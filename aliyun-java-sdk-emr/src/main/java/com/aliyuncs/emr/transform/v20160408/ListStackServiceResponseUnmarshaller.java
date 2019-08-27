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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListStackServiceResponse;
import com.aliyuncs.emr.model.v20160408.ListStackServiceResponse.Service;
import com.aliyuncs.emr.model.v20160408.ListStackServiceResponse.Service.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackServiceResponseUnmarshaller {

	public static ListStackServiceResponse unmarshall(ListStackServiceResponse listStackServiceResponse, UnmarshallerContext _ctx) {
		
		listStackServiceResponse.setRequestId(_ctx.stringValue("ListStackServiceResponse.RequestId"));
		listStackServiceResponse.setStackName(_ctx.stringValue("ListStackServiceResponse.StackName"));
		listStackServiceResponse.setStackVersion(_ctx.stringValue("ListStackServiceResponse.StackVersion"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListStackServiceResponse.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setServiceName(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].ServiceName"));
			service.setDisplayName(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].DisplayName"));
			service.setVersion(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].Version"));
			service.setEcmVersion(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].EcmVersion"));
			service.setComment(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].Comment"));

			List<Component> componentList = new ArrayList<Component>();
			for (int j = 0; j < _ctx.lengthValue("ListStackServiceResponse.ServiceList["+ i +"].ComponentList.Length"); j++) {
				Component component = new Component();
				component.setComponentName(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].ComponentList["+ j +"].ComponentName"));
				component.setComponentDisplayName(_ctx.stringValue("ListStackServiceResponse.ServiceList["+ i +"].ComponentList["+ j +"].ComponentDisplayName"));

				componentList.add(component);
			}
			service.setComponentList(componentList);

			serviceList.add(service);
		}
		listStackServiceResponse.setServiceList(serviceList);
	 
	 	return listStackServiceResponse;
	}
}