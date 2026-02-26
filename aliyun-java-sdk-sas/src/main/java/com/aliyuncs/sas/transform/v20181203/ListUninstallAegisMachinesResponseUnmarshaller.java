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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListUninstallAegisMachinesResponse;
import com.aliyuncs.sas.model.v20181203.ListUninstallAegisMachinesResponse.Machine;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUninstallAegisMachinesResponseUnmarshaller {

	public static ListUninstallAegisMachinesResponse unmarshall(ListUninstallAegisMachinesResponse listUninstallAegisMachinesResponse, UnmarshallerContext _ctx) {
		
		listUninstallAegisMachinesResponse.setRequestId(_ctx.stringValue("ListUninstallAegisMachinesResponse.RequestId"));
		listUninstallAegisMachinesResponse.setCurrentPage(_ctx.integerValue("ListUninstallAegisMachinesResponse.CurrentPage"));
		listUninstallAegisMachinesResponse.setPageSize(_ctx.integerValue("ListUninstallAegisMachinesResponse.PageSize"));
		listUninstallAegisMachinesResponse.setTotalCount(_ctx.integerValue("ListUninstallAegisMachinesResponse.TotalCount"));

		List<Machine> machineList = new ArrayList<Machine>();
		for (int i = 0; i < _ctx.lengthValue("ListUninstallAegisMachinesResponse.MachineList.Length"); i++) {
			Machine machine = new Machine();
			machine.setUuid(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].Uuid"));
			machine.setMachineRegion(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].MachineRegion"));
			machine.setInternetIp(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].InternetIp"));
			machine.setVendorName(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].VendorName"));
			machine.setInstanceName(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].InstanceName"));
			machine.setOs(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].Os"));
			machine.setInstanceId(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].InstanceId"));
			machine.setIntranetIp(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].IntranetIp"));
			machine.setVendor(_ctx.integerValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].Vendor"));
			machine.setRegionId(_ctx.stringValue("ListUninstallAegisMachinesResponse.MachineList["+ i +"].RegionId"));

			machineList.add(machine);
		}
		listUninstallAegisMachinesResponse.setMachineList(machineList);
	 
	 	return listUninstallAegisMachinesResponse;
	}
}