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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWarningMachinesResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWarningMachinesResponse.WarningMachine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWarningMachinesResponseUnmarshaller {

	public static DescribeWarningMachinesResponse unmarshall(DescribeWarningMachinesResponse describeWarningMachinesResponse, UnmarshallerContext context) {
		
		describeWarningMachinesResponse.setRequestId(context.stringValue("DescribeWarningMachinesResponse.RequestId"));
		describeWarningMachinesResponse.setCount(context.integerValue("DescribeWarningMachinesResponse.Count"));
		describeWarningMachinesResponse.setPageSize(context.integerValue("DescribeWarningMachinesResponse.PageSize"));
		describeWarningMachinesResponse.setTotalCount(context.integerValue("DescribeWarningMachinesResponse.TotalCount"));
		describeWarningMachinesResponse.setCurrentPage(context.integerValue("DescribeWarningMachinesResponse.CurrentPage"));

		List<WarningMachine> warningMachines = new ArrayList<WarningMachine>();
		for (int i = 0; i < context.lengthValue("DescribeWarningMachinesResponse.WarningMachines.Length"); i++) {
			WarningMachine warningMachine = new WarningMachine();
			warningMachine.setUuid(context.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].Uuid"));
			warningMachine.setMachineName(context.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].MachineName"));
			warningMachine.setInternetIp(context.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].InternetIp"));
			warningMachine.setIntranetIp(context.stringValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].IntranetIp"));
			warningMachine.setPassCount(context.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].PassCount"));
			warningMachine.setHighWarningCount(context.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].HighWarningCount"));
			warningMachine.setMediumWarningCount(context.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].MediumWarningCount"));
			warningMachine.setLowWarningCount(context.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].LowWarningCount"));
			warningMachine.setStatus(context.integerValue("DescribeWarningMachinesResponse.WarningMachines["+ i +"].Status"));

			warningMachines.add(warningMachine);
		}
		describeWarningMachinesResponse.setWarningMachines(warningMachines);
	 
	 	return describeWarningMachinesResponse;
	}
}