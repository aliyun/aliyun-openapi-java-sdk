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

import com.aliyuncs.sas.model.v20181203.DescribeOfflineMachinesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeOfflineMachinesResponse.Machine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOfflineMachinesResponseUnmarshaller {

	public static DescribeOfflineMachinesResponse unmarshall(DescribeOfflineMachinesResponse describeOfflineMachinesResponse, UnmarshallerContext _ctx) {
		
		describeOfflineMachinesResponse.setRequestId(_ctx.stringValue("DescribeOfflineMachinesResponse.RequestId"));
		describeOfflineMachinesResponse.setCurrentPage(_ctx.integerValue("DescribeOfflineMachinesResponse.CurrentPage"));
		describeOfflineMachinesResponse.setPageSize(_ctx.integerValue("DescribeOfflineMachinesResponse.PageSize"));
		describeOfflineMachinesResponse.setTotalCount(_ctx.integerValue("DescribeOfflineMachinesResponse.TotalCount"));

		List<Machine> machineList = new ArrayList<Machine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOfflineMachinesResponse.MachineList.Length"); i++) {
			Machine machine = new Machine();
			machine.setUuid(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].Uuid"));
			machine.setMachineRegion(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].MachineRegion"));
			machine.setInternetIp(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].InternetIp"));
			machine.setVendorName(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].VendorName"));
			machine.setInstanceName(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].InstanceName"));
			machine.setOs(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].Os"));
			machine.setInstanceId(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].InstanceId"));
			machine.setIntranetIp(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].IntranetIp"));
			machine.setVendor(_ctx.integerValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].Vendor"));
			machine.setRegionId(_ctx.stringValue("DescribeOfflineMachinesResponse.MachineList["+ i +"].RegionId"));

			machineList.add(machine);
		}
		describeOfflineMachinesResponse.setMachineList(machineList);
	 
	 	return describeOfflineMachinesResponse;
	}
}