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

import com.aliyuncs.edas.model.v20170801.ListPublishedServicesResponse;
import com.aliyuncs.edas.model.v20170801.ListPublishedServicesResponse.ListPublishedServices;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublishedServicesResponseUnmarshaller {

	public static ListPublishedServicesResponse unmarshall(ListPublishedServicesResponse listPublishedServicesResponse, UnmarshallerContext context) {
		
		listPublishedServicesResponse.setRequestId(context.stringValue("ListPublishedServicesResponse.RequestId"));
		listPublishedServicesResponse.setCode(context.integerValue("ListPublishedServicesResponse.Code"));
		listPublishedServicesResponse.setMessage(context.stringValue("ListPublishedServicesResponse.Message"));

		List<ListPublishedServices> publishedServicesList = new ArrayList<ListPublishedServices>();
		for (int i = 0; i < context.lengthValue("ListPublishedServicesResponse.PublishedServicesList.Length"); i++) {
			ListPublishedServices listPublishedServices = new ListPublishedServices();
			listPublishedServices.setAppId(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].AppId"));
			listPublishedServices.setDockerApplication(context.booleanValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].DockerApplication"));
			listPublishedServices.setGroup2Ip(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Group2Ip"));
			listPublishedServices.setName(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Name"));
			listPublishedServices.setType(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Type"));
			listPublishedServices.setVersion(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Version"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Groups.Length"); j++) {
				groups.add(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Groups["+ j +"]"));
			}
			listPublishedServices.setGroups(groups);

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Ips.Length"); j++) {
				ips.add(context.stringValue("ListPublishedServicesResponse.PublishedServicesList["+ i +"].Ips["+ j +"]"));
			}
			listPublishedServices.setIps(ips);

			publishedServicesList.add(listPublishedServices);
		}
		listPublishedServicesResponse.setPublishedServicesList(publishedServicesList);
	 
	 	return listPublishedServicesResponse;
	}
}