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

import com.aliyuncs.gpdb.model.v20160503.ListStreamingDataServicesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListStreamingDataServicesResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStreamingDataServicesResponseUnmarshaller {

	public static ListStreamingDataServicesResponse unmarshall(ListStreamingDataServicesResponse listStreamingDataServicesResponse, UnmarshallerContext _ctx) {
		
		listStreamingDataServicesResponse.setRequestId(_ctx.stringValue("ListStreamingDataServicesResponse.RequestId"));
		listStreamingDataServicesResponse.setTotalRecordCount(_ctx.integerValue("ListStreamingDataServicesResponse.TotalRecordCount"));

		List<Items> serviceItems = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListStreamingDataServicesResponse.ServiceItems.Length"); i++) {
			Items items = new Items();
			items.setStatus(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].Status"));
			items.setServicePort(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServicePort"));
			items.setModifyTime(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ModifyTime"));
			items.setServiceIp(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceIp"));
			items.setServiceManaged(_ctx.booleanValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceManaged"));
			items.setServiceName(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceName"));
			items.setServiceType(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceType"));
			items.setServiceDescription(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceDescription"));
			items.setCreateTime(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].CreateTime"));
			items.setServiceSpec(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceSpec"));
			items.setServiceOwnerId(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceOwnerId"));
			items.setServiceId(_ctx.stringValue("ListStreamingDataServicesResponse.ServiceItems["+ i +"].ServiceId"));

			serviceItems.add(items);
		}
		listStreamingDataServicesResponse.setServiceItems(serviceItems);
	 
	 	return listStreamingDataServicesResponse;
	}
}