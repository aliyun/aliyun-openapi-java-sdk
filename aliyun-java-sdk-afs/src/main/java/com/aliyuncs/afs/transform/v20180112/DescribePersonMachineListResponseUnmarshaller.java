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

package com.aliyuncs.afs.transform.v20180112;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.afs.model.v20180112.DescribePersonMachineListResponse;
import com.aliyuncs.afs.model.v20180112.DescribePersonMachineListResponse.PersonMachineRes;
import com.aliyuncs.afs.model.v20180112.DescribePersonMachineListResponse.PersonMachineRes.PersonMachine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePersonMachineListResponseUnmarshaller {

	public static DescribePersonMachineListResponse unmarshall(DescribePersonMachineListResponse describePersonMachineListResponse, UnmarshallerContext context) {
		
		describePersonMachineListResponse.setRequestId(context.stringValue("DescribePersonMachineListResponse.RequestId"));
		describePersonMachineListResponse.setBizCode(context.stringValue("DescribePersonMachineListResponse.BizCode"));

		PersonMachineRes personMachineRes = new PersonMachineRes();
		personMachineRes.setHasConfiguration(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.HasConfiguration"));

		List<PersonMachine> personMachines = new ArrayList<PersonMachine>();
		for (int i = 0; i < context.lengthValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines.Length"); i++) {
			PersonMachine personMachine = new PersonMachine();
			personMachine.setConfigurationName(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].ConfigurationName"));
			personMachine.setAppkey(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].Appkey"));
			personMachine.setConfigurationMethod(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].ConfigurationMethod"));
			personMachine.setApplyType(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].ApplyType"));
			personMachine.setScene(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].Scene"));
			personMachine.setLastUpdate(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].LastUpdate"));
			personMachine.setExtId(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].ExtId"));
			personMachine.setSceneOriginal(context.stringValue("DescribePersonMachineListResponse.PersonMachineRes.PersonMachines["+ i +"].SceneOriginal"));

			personMachines.add(personMachine);
		}
		personMachineRes.setPersonMachines(personMachines);
		describePersonMachineListResponse.setPersonMachineRes(personMachineRes);
	 
	 	return describePersonMachineListResponse;
	}
}