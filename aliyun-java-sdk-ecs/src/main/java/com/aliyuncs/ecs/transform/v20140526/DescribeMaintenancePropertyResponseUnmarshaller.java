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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeMaintenancePropertyResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeMaintenancePropertyResponse.MaintenanceProperty;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMaintenancePropertyResponseUnmarshaller {

	public static DescribeMaintenancePropertyResponse unmarshall(DescribeMaintenancePropertyResponse describeMaintenancePropertyResponse, UnmarshallerContext _ctx) {
		
		describeMaintenancePropertyResponse.setRequestId(_ctx.stringValue("DescribeMaintenancePropertyResponse.RequestId"));
		describeMaintenancePropertyResponse.setTotalCount(_ctx.integerValue("DescribeMaintenancePropertyResponse.TotalCount"));
		describeMaintenancePropertyResponse.setPageNumber(_ctx.integerValue("DescribeMaintenancePropertyResponse.PageNumber"));
		describeMaintenancePropertyResponse.setPageSize(_ctx.integerValue("DescribeMaintenancePropertyResponse.PageSize"));

		List<MaintenanceProperty> maintenancePropertySet = new ArrayList<MaintenanceProperty>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMaintenancePropertyResponse.MaintenancePropertySet.Length"); i++) {
			MaintenanceProperty maintenanceProperty = new MaintenanceProperty();
			maintenanceProperty.setInstanceId(_ctx.stringValue("DescribeMaintenancePropertyResponse.MaintenancePropertySet["+ i +"].InstanceId"));
			maintenanceProperty.setStartTime(_ctx.stringValue("DescribeMaintenancePropertyResponse.MaintenancePropertySet["+ i +"].StartTime"));
			maintenanceProperty.setEndTime(_ctx.stringValue("DescribeMaintenancePropertyResponse.MaintenancePropertySet["+ i +"].EndTime"));
			maintenanceProperty.setActionOnMaintenance(_ctx.stringValue("DescribeMaintenancePropertyResponse.MaintenancePropertySet["+ i +"].ActionOnMaintenance"));

			maintenancePropertySet.add(maintenanceProperty);
		}
		describeMaintenancePropertyResponse.setMaintenancePropertySet(maintenancePropertySet);
	 
	 	return describeMaintenancePropertyResponse;
	}
}