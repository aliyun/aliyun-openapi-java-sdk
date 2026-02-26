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

import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningMachinesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningMachinesResponse.Machine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckWarningMachinesResponseUnmarshaller {

	public static DescribeCheckWarningMachinesResponse unmarshall(DescribeCheckWarningMachinesResponse describeCheckWarningMachinesResponse, UnmarshallerContext _ctx) {
		
		describeCheckWarningMachinesResponse.setRequestId(_ctx.stringValue("DescribeCheckWarningMachinesResponse.RequestId"));
		describeCheckWarningMachinesResponse.setCount(_ctx.integerValue("DescribeCheckWarningMachinesResponse.Count"));

		List<Machine> machines = new ArrayList<Machine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckWarningMachinesResponse.Machines.Length"); i++) {
			Machine machine = new Machine();
			machine.setUuid(_ctx.stringValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].Uuid"));
			machine.setInstanceName(_ctx.stringValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].InstanceName"));
			machine.setInternetIp(_ctx.stringValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].InternetIp"));
			machine.setIntranetIp(_ctx.stringValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].IntranetIp"));
			machine.setInstanceId(_ctx.stringValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].InstanceId"));
			machine.setRegionId(_ctx.stringValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].RegionId"));
			machine.setBind(_ctx.booleanValue("DescribeCheckWarningMachinesResponse.Machines["+ i +"].Bind"));

			machines.add(machine);
		}
		describeCheckWarningMachinesResponse.setMachines(machines);
	 
	 	return describeCheckWarningMachinesResponse;
	}
}