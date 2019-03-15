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

import com.aliyuncs.emr.model.v20160408.ListRequiredServiceResponse;
import com.aliyuncs.emr.model.v20160408.ListRequiredServiceResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRequiredServiceResponseUnmarshaller {

	public static ListRequiredServiceResponse unmarshall(ListRequiredServiceResponse listRequiredServiceResponse, UnmarshallerContext context) {
		
		listRequiredServiceResponse.setRequestId(context.stringValue("ListRequiredServiceResponse.RequestId"));
		listRequiredServiceResponse.setNeedOtherService(context.booleanValue("ListRequiredServiceResponse.NeedOtherService"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("ListRequiredServiceResponse.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setServiceName(context.stringValue("ListRequiredServiceResponse.ServiceList["+ i +"].ServiceName"));
			service.setServiceDisplayName(context.stringValue("ListRequiredServiceResponse.ServiceList["+ i +"].ServiceDisplayName"));

			serviceList.add(service);
		}
		listRequiredServiceResponse.setServiceList(serviceList);
	 
	 	return listRequiredServiceResponse;
	}
}