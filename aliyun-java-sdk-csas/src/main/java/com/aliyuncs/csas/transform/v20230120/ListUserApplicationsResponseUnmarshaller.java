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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListUserApplicationsResponse;
import com.aliyuncs.csas.model.v20230120.ListUserApplicationsResponse.ApplicationsItem;
import com.aliyuncs.csas.model.v20230120.ListUserApplicationsResponse.ApplicationsItem.PortRangesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserApplicationsResponseUnmarshaller {

	public static ListUserApplicationsResponse unmarshall(ListUserApplicationsResponse listUserApplicationsResponse, UnmarshallerContext _ctx) {
		
		listUserApplicationsResponse.setRequestId(_ctx.stringValue("ListUserApplicationsResponse.RequestId"));
		listUserApplicationsResponse.setTotalNum(_ctx.integerValue("ListUserApplicationsResponse.TotalNum"));

		List<ApplicationsItem> applications = new ArrayList<ApplicationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserApplicationsResponse.Applications.Length"); i++) {
			ApplicationsItem applicationsItem = new ApplicationsItem();
			applicationsItem.setName(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].Name"));
			applicationsItem.setApplicationId(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].ApplicationId"));
			applicationsItem.setBizProtocol(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].Protocol"));
			applicationsItem.setAction(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].Action"));

			List<String> addresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserApplicationsResponse.Applications["+ i +"].Addresses.Length"); j++) {
				addresses.add(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].Addresses["+ j +"]"));
			}
			applicationsItem.setAddresses(addresses);

			List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserApplicationsResponse.Applications["+ i +"].PortRanges.Length"); j++) {
				PortRangesItem portRangesItem = new PortRangesItem();
				portRangesItem.setBegin(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].PortRanges["+ j +"].Begin"));
				portRangesItem.setEnd(_ctx.stringValue("ListUserApplicationsResponse.Applications["+ i +"].PortRanges["+ j +"].End"));

				portRanges.add(portRangesItem);
			}
			applicationsItem.setPortRanges(portRanges);

			applications.add(applicationsItem);
		}
		listUserApplicationsResponse.setApplications(applications);
	 
	 	return listUserApplicationsResponse;
	}
}