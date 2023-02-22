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

import com.aliyuncs.sas.model.v20181203.DescribeBackupMachineStatusResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackupMachineStatusResponse.BackupMachineStatus;
import com.aliyuncs.sas.model.v20181203.DescribeBackupMachineStatusResponse.BackupMachineStatus.BackupErrorMsg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupMachineStatusResponseUnmarshaller {

	public static DescribeBackupMachineStatusResponse unmarshall(DescribeBackupMachineStatusResponse describeBackupMachineStatusResponse, UnmarshallerContext _ctx) {
		
		describeBackupMachineStatusResponse.setRequestId(_ctx.stringValue("DescribeBackupMachineStatusResponse.RequestId"));

		BackupMachineStatus backupMachineStatus = new BackupMachineStatus();
		backupMachineStatus.setStatus(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.Status"));
		backupMachineStatus.setUuid(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.Uuid"));
		backupMachineStatus.setVaultId(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.VaultId"));
		backupMachineStatus.setErrorCode(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorCode"));
		backupMachineStatus.setSavedBackupCount(_ctx.integerValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.SavedBackupCount"));
		backupMachineStatus.setInstanceId(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.InstanceId"));
		backupMachineStatus.setClientStatus(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ClientStatus"));
		backupMachineStatus.setRegionId(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.RegionId"));
		backupMachineStatus.setClientVersion(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ClientVersion"));
		backupMachineStatus.setClientId(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ClientId"));

		List<BackupErrorMsg> errorList = new ArrayList<BackupErrorMsg>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList.Length"); i++) {
			BackupErrorMsg backupErrorMsg = new BackupErrorMsg();
			backupErrorMsg.setKey(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].Key"));
			backupErrorMsg.setErrorFile(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorFile"));
			backupErrorMsg.setRequestId(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].RequestId"));
			backupErrorMsg.setErrorFileUrl(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorFileUrl"));
			backupErrorMsg.setErrorCode(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorCode"));
			backupErrorMsg.setErrorStatus(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorStatus"));
			backupErrorMsg.setPath(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].Path"));
			backupErrorMsg.setErrorMsg(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorMsg"));
			backupErrorMsg.setErrorType(_ctx.stringValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorType"));
			backupErrorMsg.setErrorTime(_ctx.longValue("DescribeBackupMachineStatusResponse.BackupMachineStatus.ErrorList["+ i +"].ErrorTime"));

			errorList.add(backupErrorMsg);
		}
		backupMachineStatus.setErrorList(errorList);
		describeBackupMachineStatusResponse.setBackupMachineStatus(backupMachineStatus);
	 
	 	return describeBackupMachineStatusResponse;
	}
}