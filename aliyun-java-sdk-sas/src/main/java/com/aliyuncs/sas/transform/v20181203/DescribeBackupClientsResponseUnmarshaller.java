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

import com.aliyuncs.sas.model.v20181203.DescribeBackupClientsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackupClientsResponse.BackupMachineDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupClientsResponseUnmarshaller {

	public static DescribeBackupClientsResponse unmarshall(DescribeBackupClientsResponse describeBackupClientsResponse, UnmarshallerContext _ctx) {
		
		describeBackupClientsResponse.setRequestId(_ctx.stringValue("DescribeBackupClientsResponse.RequestId"));

		List<BackupMachineDTO> clients = new ArrayList<BackupMachineDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupClientsResponse.Clients.Length"); i++) {
			BackupMachineDTO backupMachineDTO = new BackupMachineDTO();
			backupMachineDTO.setUuid(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Uuid"));
			backupMachineDTO.setInstanceId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].InstanceId"));
			backupMachineDTO.setClientId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientId"));
			backupMachineDTO.setClientStatus(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientStatus"));

			clients.add(backupMachineDTO);
		}
		describeBackupClientsResponse.setClients(clients);
	 
	 	return describeBackupClientsResponse;
	}
}