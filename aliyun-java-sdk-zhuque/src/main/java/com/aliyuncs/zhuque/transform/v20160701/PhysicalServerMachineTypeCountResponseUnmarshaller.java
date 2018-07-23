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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.PhysicalServerMachineTypeCountResponse;
import com.aliyuncs.zhuque.model.v20160701.PhysicalServerMachineTypeCountResponse.ProjectItem;
import com.aliyuncs.zhuque.model.v20160701.PhysicalServerMachineTypeCountResponse.ProjectItem.ServerItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhysicalServerMachineTypeCountResponseUnmarshaller {

	public static PhysicalServerMachineTypeCountResponse unmarshall(PhysicalServerMachineTypeCountResponse physicalServerMachineTypeCountResponse, UnmarshallerContext context) {
		
		physicalServerMachineTypeCountResponse.setRequestId(context.stringValue("PhysicalServerMachineTypeCountResponse.RequestId"));

		List<ProjectItem> data = new ArrayList<ProjectItem>();
		for (int i = 0; i < context.lengthValue("PhysicalServerMachineTypeCountResponse.Data.Length"); i++) {
			ProjectItem projectItem = new ProjectItem();
			projectItem.setProjectId(context.stringValue("PhysicalServerMachineTypeCountResponse.Data["+ i +"].ProjectId"));

			List<ServerItem> serverList = new ArrayList<ServerItem>();
			for (int j = 0; j < context.lengthValue("PhysicalServerMachineTypeCountResponse.Data["+ i +"].ServerList.Length"); j++) {
				ServerItem serverItem = new ServerItem();
				serverItem.setMachineType(context.stringValue("PhysicalServerMachineTypeCountResponse.Data["+ i +"].ServerList["+ j +"].MachineType"));
				serverItem.setTotalServerCountByMachineType(context.integerValue("PhysicalServerMachineTypeCountResponse.Data["+ i +"].ServerList["+ j +"].TotalServerCountByMachineType"));

				serverList.add(serverItem);
			}
			projectItem.setServerList(serverList);

			data.add(projectItem);
		}
		physicalServerMachineTypeCountResponse.setData(data);
	 
	 	return physicalServerMachineTypeCountResponse;
	}
}