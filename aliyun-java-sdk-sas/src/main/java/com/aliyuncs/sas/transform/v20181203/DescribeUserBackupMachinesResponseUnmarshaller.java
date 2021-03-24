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

import com.aliyuncs.sas.model.v20181203.DescribeUserBackupMachinesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeUserBackupMachinesResponse.SimpleBackupMachine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBackupMachinesResponseUnmarshaller {

	public static DescribeUserBackupMachinesResponse unmarshall(DescribeUserBackupMachinesResponse describeUserBackupMachinesResponse, UnmarshallerContext _ctx) {
		
		describeUserBackupMachinesResponse.setRequestId(_ctx.stringValue("DescribeUserBackupMachinesResponse.RequestId"));

		List<SimpleBackupMachine> machines = new ArrayList<SimpleBackupMachine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserBackupMachinesResponse.Machines.Length"); i++) {
			SimpleBackupMachine simpleBackupMachine = new SimpleBackupMachine();
			simpleBackupMachine.setId(_ctx.longValue("DescribeUserBackupMachinesResponse.Machines["+ i +"].Id"));
			simpleBackupMachine.setUuid(_ctx.stringValue("DescribeUserBackupMachinesResponse.Machines["+ i +"].Uuid"));
			simpleBackupMachine.setPolicyName(_ctx.stringValue("DescribeUserBackupMachinesResponse.Machines["+ i +"].PolicyName"));

			machines.add(simpleBackupMachine);
		}
		describeUserBackupMachinesResponse.setMachines(machines);
	 
	 	return describeUserBackupMachinesResponse;
	}
}