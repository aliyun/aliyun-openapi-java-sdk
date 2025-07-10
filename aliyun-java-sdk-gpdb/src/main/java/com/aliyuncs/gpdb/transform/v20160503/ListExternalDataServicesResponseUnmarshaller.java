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

import com.aliyuncs.gpdb.model.v20160503.ListExternalDataServicesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListExternalDataServicesResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExternalDataServicesResponseUnmarshaller {

	public static ListExternalDataServicesResponse unmarshall(ListExternalDataServicesResponse listExternalDataServicesResponse, UnmarshallerContext _ctx) {
		
		listExternalDataServicesResponse.setRequestId(_ctx.stringValue("ListExternalDataServicesResponse.RequestId"));
		listExternalDataServicesResponse.setTotalRecordCount(_ctx.integerValue("ListExternalDataServicesResponse.TotalRecordCount"));
		listExternalDataServicesResponse.setPageNumber(_ctx.integerValue("ListExternalDataServicesResponse.PageNumber"));

		List<Items> serviceItems = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListExternalDataServicesResponse.ServiceItems.Length"); i++) {
			Items items = new Items();
			items.setServiceId(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].ServiceId"));
			items.setServiceType(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].ServiceType"));
			items.setServiceName(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].ServiceName"));
			items.setServiceDescription(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].ServiceDescription"));
			items.setServiceSpec(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].ServiceSpec"));
			items.setStatus(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].Status"));
			items.setCreateTime(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].CreateTime"));
			items.setModifyTime(_ctx.stringValue("ListExternalDataServicesResponse.ServiceItems["+ i +"].ModifyTime"));

			serviceItems.add(items);
		}
		listExternalDataServicesResponse.setServiceItems(serviceItems);
	 
	 	return listExternalDataServicesResponse;
	}
}