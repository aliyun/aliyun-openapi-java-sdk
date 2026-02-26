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

import com.aliyuncs.csas.model.v20230120.ListUninstallApplicationsResponse;
import com.aliyuncs.csas.model.v20230120.ListUninstallApplicationsResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUninstallApplicationsResponseUnmarshaller {

	public static ListUninstallApplicationsResponse unmarshall(ListUninstallApplicationsResponse listUninstallApplicationsResponse, UnmarshallerContext _ctx) {
		
		listUninstallApplicationsResponse.setRequestId(_ctx.stringValue("ListUninstallApplicationsResponse.RequestId"));
		listUninstallApplicationsResponse.setTotalNum(_ctx.longValue("ListUninstallApplicationsResponse.TotalNum"));

		List<DataList> applications = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListUninstallApplicationsResponse.Applications.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setDevTag(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].DevTag"));
			dataList.setDevType(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].DevType"));
			dataList.setMac(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].Mac"));
			dataList.setHostname(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].Hostname"));
			dataList.setUsername(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].Username"));
			dataList.setSaseUserId(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].SaseUserId"));
			dataList.setDepartment(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].Department"));
			dataList.setReason(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].Reason"));
			dataList.setStatus(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].Status"));
			dataList.setApplicationId(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].ApplicationId"));
			dataList.setIsUninstall(_ctx.booleanValue("ListUninstallApplicationsResponse.Applications["+ i +"].IsUninstall"));
			dataList.setCreateTime(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].CreateTime"));
			dataList.setIdpName(_ctx.stringValue("ListUninstallApplicationsResponse.Applications["+ i +"].IdpName"));

			applications.add(dataList);
		}
		listUninstallApplicationsResponse.setApplications(applications);
	 
	 	return listUninstallApplicationsResponse;
	}
}