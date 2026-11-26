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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListAIServicesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListAIServicesResponse.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIServicesResponseUnmarshaller {

	public static ListAIServicesResponse unmarshall(ListAIServicesResponse listAIServicesResponse, UnmarshallerContext _ctx) {
		
		listAIServicesResponse.setRequestId(_ctx.stringValue("ListAIServicesResponse.RequestId"));
		listAIServicesResponse.setTotalRecordCount(_ctx.stringValue("ListAIServicesResponse.TotalRecordCount"));
		listAIServicesResponse.setPageRecordCount(_ctx.stringValue("ListAIServicesResponse.PageRecordCount"));
		listAIServicesResponse.setPageNumber(_ctx.stringValue("ListAIServicesResponse.PageNumber"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAIServicesResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setStatus(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].Status"));
			servicesItem.setServiceAccount(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].ServiceAccount"));
			servicesItem.setPrivateApiDevUrl(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].PrivateApiDevUrl"));
			servicesItem.setDescription(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].Description"));
			servicesItem.setPublicWorkbenchUrl(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].PublicWorkbenchUrl"));
			servicesItem.setPublicApiDevUrl(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].PublicApiDevUrl"));
			servicesItem.setSecurityIpList(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].SecurityIpList"));
			servicesItem.setCreateTime(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].CreateTime"));
			servicesItem.setPrivateWorkbenchUrl(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].PrivateWorkbenchUrl"));
			servicesItem.setServiceId(_ctx.stringValue("ListAIServicesResponse.Services["+ i +"].ServiceId"));

			services.add(servicesItem);
		}
		listAIServicesResponse.setServices(services);
	 
	 	return listAIServicesResponse;
	}
}