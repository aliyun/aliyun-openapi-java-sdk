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

import com.aliyuncs.csas.model.v20230120.ListExcessiveDeviceRegistrationApplicationsResponse;
import com.aliyuncs.csas.model.v20230120.ListExcessiveDeviceRegistrationApplicationsResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExcessiveDeviceRegistrationApplicationsResponseUnmarshaller {

	public static ListExcessiveDeviceRegistrationApplicationsResponse unmarshall(ListExcessiveDeviceRegistrationApplicationsResponse listExcessiveDeviceRegistrationApplicationsResponse, UnmarshallerContext _ctx) {
		
		listExcessiveDeviceRegistrationApplicationsResponse.setRequestId(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.RequestId"));
		listExcessiveDeviceRegistrationApplicationsResponse.setTotalNum(_ctx.longValue("ListExcessiveDeviceRegistrationApplicationsResponse.TotalNum"));

		List<DataList> applications = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setDeviceTag(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].DeviceTag"));
			dataList.setDeviceType(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].DeviceType"));
			dataList.setHostname(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].Hostname"));
			dataList.setUsername(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].Username"));
			dataList.setSaseUserId(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].SaseUserId"));
			dataList.setDepartment(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].Department"));
			dataList.setMac(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].Mac"));
			dataList.setIsUsed(_ctx.booleanValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].IsUsed"));
			dataList.setStatus(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].Status"));
			dataList.setCreateTime(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].CreateTime"));
			dataList.setDescription(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].Description"));
			dataList.setApplicationId(_ctx.stringValue("ListExcessiveDeviceRegistrationApplicationsResponse.Applications["+ i +"].ApplicationId"));

			applications.add(dataList);
		}
		listExcessiveDeviceRegistrationApplicationsResponse.setApplications(applications);
	 
	 	return listExcessiveDeviceRegistrationApplicationsResponse;
	}
}