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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaintenanceAttributesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaintenanceAttributesResponse.MaintenanceAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaintenanceAttributesResponse.MaintenanceAttribute.ActionOnMaintenance;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaintenanceAttributesResponse.MaintenanceAttribute.MaintenanceWindow;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaintenanceAttributesResponse.MaintenanceAttribute.ReleaseWindow;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeMaintenanceAttributesResponseUnmarshaller {

	public static OpsDescribeMaintenanceAttributesResponse unmarshall(OpsDescribeMaintenanceAttributesResponse opsDescribeMaintenanceAttributesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeMaintenanceAttributesResponse.setRequestId(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.RequestId"));
		opsDescribeMaintenanceAttributesResponse.setPageNumber(_ctx.integerValue("OpsDescribeMaintenanceAttributesResponse.PageNumber"));
		opsDescribeMaintenanceAttributesResponse.setPageSize(_ctx.integerValue("OpsDescribeMaintenanceAttributesResponse.PageSize"));
		opsDescribeMaintenanceAttributesResponse.setTotal(_ctx.integerValue("OpsDescribeMaintenanceAttributesResponse.Total"));

		List<MaintenanceAttribute> maintenanceAttributes = new ArrayList<MaintenanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes.Length"); i++) {
			MaintenanceAttribute maintenanceAttribute = new MaintenanceAttribute();
			maintenanceAttribute.setPropertyId(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].PropertyId"));
			maintenanceAttribute.setLevel(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].Level"));
			maintenanceAttribute.setInstanceId(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].InstanceId"));
			maintenanceAttribute.setLiveMigration(_ctx.booleanValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].LiveMigration"));
			maintenanceAttribute.setNotifyOnMaintenance(_ctx.booleanValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].NotifyOnMaintenance"));

			ActionOnMaintenance actionOnMaintenance = new ActionOnMaintenance();
			actionOnMaintenance.setValue(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.Value"));
			actionOnMaintenance.setDefaultValue(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.DefaultValue"));
			actionOnMaintenance.setCanRecover(_ctx.integerValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.CanRecover"));

			List<String> supportedValues = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.SupportedValues.Length"); j++) {
				supportedValues.add(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ActionOnMaintenance.SupportedValues["+ j +"]"));
			}
			actionOnMaintenance.setSupportedValues(supportedValues);
			maintenanceAttribute.setActionOnMaintenance(actionOnMaintenance);

			List<MaintenanceWindow> maintenanceWindows = new ArrayList<MaintenanceWindow>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].MaintenanceWindows.Length"); j++) {
				MaintenanceWindow maintenanceWindow = new MaintenanceWindow();
				maintenanceWindow.setStartTime(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].MaintenanceWindows["+ j +"].StartTime"));
				maintenanceWindow.setEndTime(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].MaintenanceWindows["+ j +"].EndTime"));

				maintenanceWindows.add(maintenanceWindow);
			}
			maintenanceAttribute.setMaintenanceWindows(maintenanceWindows);

			List<ReleaseWindow> releaseWindows = new ArrayList<ReleaseWindow>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ReleaseWindows.Length"); j++) {
				ReleaseWindow releaseWindow = new ReleaseWindow();
				releaseWindow.setStartTime(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ReleaseWindows["+ j +"].StartTime"));
				releaseWindow.setEndTime(_ctx.stringValue("OpsDescribeMaintenanceAttributesResponse.MaintenanceAttributes["+ i +"].ReleaseWindows["+ j +"].EndTime"));

				releaseWindows.add(releaseWindow);
			}
			maintenanceAttribute.setReleaseWindows(releaseWindows);

			maintenanceAttributes.add(maintenanceAttribute);
		}
		opsDescribeMaintenanceAttributesResponse.setMaintenanceAttributes(maintenanceAttributes);
	 
	 	return opsDescribeMaintenanceAttributesResponse;
	}
}