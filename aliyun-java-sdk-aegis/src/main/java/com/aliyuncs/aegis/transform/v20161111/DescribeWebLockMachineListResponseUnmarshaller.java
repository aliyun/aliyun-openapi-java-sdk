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

import com.aliyuncs.aegis.model.v20161111.DescribeWebLockMachineListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWebLockMachineListResponse.MachineInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockMachineListResponseUnmarshaller {

	public static DescribeWebLockMachineListResponse unmarshall(DescribeWebLockMachineListResponse describeWebLockMachineListResponse, UnmarshallerContext context) {
		
		describeWebLockMachineListResponse.setRequestId(context.stringValue("DescribeWebLockMachineListResponse.RequestId"));
		describeWebLockMachineListResponse.setTotalCount(context.integerValue("DescribeWebLockMachineListResponse.TotalCount"));

		List<MachineInfo> machineList = new ArrayList<MachineInfo>();
		for (int i = 0; i < context.lengthValue("DescribeWebLockMachineListResponse.MachineList.Length"); i++) {
			MachineInfo machineInfo = new MachineInfo();
			machineInfo.setUuid(context.stringValue("DescribeWebLockMachineListResponse.MachineList["+ i +"].Uuid"));
			machineInfo.setInternetIp(context.stringValue("DescribeWebLockMachineListResponse.MachineList["+ i +"].InternetIp"));
			machineInfo.setIntranetIp(context.stringValue("DescribeWebLockMachineListResponse.MachineList["+ i +"].IntranetIp"));
			machineInfo.setInstanceId(context.stringValue("DescribeWebLockMachineListResponse.MachineList["+ i +"].InstanceId"));
			machineInfo.setInstanceName(context.stringValue("DescribeWebLockMachineListResponse.MachineList["+ i +"].InstanceName"));
			machineInfo.setStatus(context.stringValue("DescribeWebLockMachineListResponse.MachineList["+ i +"].Status"));

			machineList.add(machineInfo);
		}
		describeWebLockMachineListResponse.setMachineList(machineList);
	 
	 	return describeWebLockMachineListResponse;
	}
}