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

import com.aliyuncs.csas.model.v20230120.UpdateUninstallApplicationsStatusResponse;
import com.aliyuncs.csas.model.v20230120.UpdateUninstallApplicationsStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUninstallApplicationsStatusResponseUnmarshaller {

	public static UpdateUninstallApplicationsStatusResponse unmarshall(UpdateUninstallApplicationsStatusResponse updateUninstallApplicationsStatusResponse, UnmarshallerContext _ctx) {
		
		updateUninstallApplicationsStatusResponse.setRequestId(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.RequestId"));

		List<Data> applications = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("UpdateUninstallApplicationsStatusResponse.Applications.Length"); i++) {
			Data data = new Data();
			data.setDevTag(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].DevTag"));
			data.setDevType(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].DevType"));
			data.setMac(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].Mac"));
			data.setHostname(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].Hostname"));
			data.setUsername(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].Username"));
			data.setSaseUserId(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].SaseUserId"));
			data.setDepartment(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].Department"));
			data.setReason(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].Reason"));
			data.setStatus(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].Status"));
			data.setApplicationId(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].ApplicationId"));
			data.setIsUninstall(_ctx.booleanValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].IsUninstall"));
			data.setIdpName(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].IdpName"));
			data.setCreateTime(_ctx.stringValue("UpdateUninstallApplicationsStatusResponse.Applications["+ i +"].CreateTime"));

			applications.add(data);
		}
		updateUninstallApplicationsStatusResponse.setApplications(applications);
	 
	 	return updateUninstallApplicationsStatusResponse;
	}
}