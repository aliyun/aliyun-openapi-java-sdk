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

import com.aliyuncs.gpdb.model.v20160503.ListModelOperatorServicesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListModelOperatorServicesResponse.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelOperatorServicesResponseUnmarshaller {

	public static ListModelOperatorServicesResponse unmarshall(ListModelOperatorServicesResponse listModelOperatorServicesResponse, UnmarshallerContext _ctx) {
		
		listModelOperatorServicesResponse.setRequestId(_ctx.stringValue("ListModelOperatorServicesResponse.RequestId"));
		listModelOperatorServicesResponse.setTotalRecordCount(_ctx.integerValue("ListModelOperatorServicesResponse.TotalRecordCount"));
		listModelOperatorServicesResponse.setPageRecordCount(_ctx.integerValue("ListModelOperatorServicesResponse.PageRecordCount"));
		listModelOperatorServicesResponse.setPageNumber(_ctx.integerValue("ListModelOperatorServicesResponse.PageNumber"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModelOperatorServicesResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setStatus(_ctx.stringValue("ListModelOperatorServicesResponse.Services["+ i +"].Status"));
			servicesItem.setServiceId(_ctx.stringValue("ListModelOperatorServicesResponse.Services["+ i +"].ServiceId"));

			services.add(servicesItem);
		}
		listModelOperatorServicesResponse.setServices(services);
	 
	 	return listModelOperatorServicesResponse;
	}
}