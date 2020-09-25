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

import com.aliyuncs.sas.model.v20181203.DescribeWarningMachinesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWarningMachinesResponse.WarningMachine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWarningMachinesResponseUnmarshaller {

	public static DescribeWarningMachinesResponse unmarshall(DescribeWarningMachinesResponse describeWarningMachinesResponse, UnmarshallerContext _ctx) {
		
		describeWarningMachinesResponse.setRequestId(_ctx.stringValue("DescribeWarningMachinesResponse.RequestId"));
		describeWarningMachinesResponse.setCount(_ctx.integerValue("DescribeWarningMachinesResponse.Count"));
		describeWarningMachinesResponse.setPageSize(_ctx.integerValue("DescribeWarningMachinesResponse.PageSize"));
		describeWarningMachinesResponse.setTotalCount(_ctx.integerValue("DescribeWarningMachinesResponse.TotalCount"));
		describeWarningMachinesResponse.setCurrentPage(_ctx.integerValue("DescribeWarningMachinesResponse.CurrentPage"));

		List<WarningMachine> warningMachines = new ArrayList<WarningMachine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWarningMachinesResponse.WarningMachines.Length"); i++) {
			WarningMachine warningMachine = new WarningMachine();
			warningMachine.setUuid(_ctx.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].Uuid"));
			warningMachine.setInstanceName(_ctx.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].InstanceName"));
			warningMachine.setInstanceId(_ctx.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].InstanceId"));
			warningMachine.setRegionId(_ctx.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].RegionId"));
			warningMachine.setInternetIp(_ctx.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].InternetIp"));
			warningMachine.setIntranetIp(_ctx.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].IntranetIp"));
			warningMachine.setPassCount(_ctx.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].PassCount"));
			warningMachine.setHighWarningCount(_ctx.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].HighWarningCount"));
			warningMachine.setMediumWarningCount(_ctx.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].MediumWarningCount"));
			warningMachine.setLowWarningCount(_ctx.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].LowWarningCount"));
			warningMachine.setStatus(_ctx.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].Status"));

			warningMachines.add(warningMachine);
		}
		describeWarningMachinesResponse.setWarningMachines(warningMachines);
	 
	 	return describeWarningMachinesResponse;
	}
}