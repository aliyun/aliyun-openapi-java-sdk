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

import com.aliyuncs.csas.model.v20230120.UpdateExcessiveDeviceRegistrationApplicationsStatusResponse;
import com.aliyuncs.csas.model.v20230120.UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateExcessiveDeviceRegistrationApplicationsStatusResponseUnmarshaller {

	public static UpdateExcessiveDeviceRegistrationApplicationsStatusResponse unmarshall(UpdateExcessiveDeviceRegistrationApplicationsStatusResponse updateExcessiveDeviceRegistrationApplicationsStatusResponse, UnmarshallerContext _ctx) {
		
		updateExcessiveDeviceRegistrationApplicationsStatusResponse.setRequestId(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.RequestId"));

		List<Data> applications = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications.Length"); i++) {
			Data data = new Data();
			data.setDeviceTag(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].DeviceTag"));
			data.setDeviceType(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].DeviceType"));
			data.setHostname(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].Hostname"));
			data.setUsername(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].Username"));
			data.setSaseUserId(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].SaseUserId"));
			data.setDepartment(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].Department"));
			data.setMac(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].Mac"));
			data.setIsUsed(_ctx.booleanValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].IsUsed"));
			data.setStatus(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].Status"));
			data.setCreateTime(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].CreateTime"));
			data.setDescription(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].Description"));
			data.setApplicationId(_ctx.stringValue("UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.Applications["+ i +"].ApplicationId"));

			applications.add(data);
		}
		updateExcessiveDeviceRegistrationApplicationsStatusResponse.setApplications(applications);
	 
	 	return updateExcessiveDeviceRegistrationApplicationsStatusResponse;
	}
}