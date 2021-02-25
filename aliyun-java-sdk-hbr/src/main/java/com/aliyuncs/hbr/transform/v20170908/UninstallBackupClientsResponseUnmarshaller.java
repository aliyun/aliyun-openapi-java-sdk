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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.UninstallBackupClientsResponse;
import com.aliyuncs.hbr.model.v20170908.UninstallBackupClientsResponse.InstanceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class UninstallBackupClientsResponseUnmarshaller {

	public static UninstallBackupClientsResponse unmarshall(UninstallBackupClientsResponse uninstallBackupClientsResponse, UnmarshallerContext _ctx) {
		
		uninstallBackupClientsResponse.setRequestId(_ctx.stringValue("UninstallBackupClientsResponse.RequestId"));
		uninstallBackupClientsResponse.setCode(_ctx.stringValue("UninstallBackupClientsResponse.Code"));
		uninstallBackupClientsResponse.setMessage(_ctx.stringValue("UninstallBackupClientsResponse.Message"));
		uninstallBackupClientsResponse.setSuccess(_ctx.booleanValue("UninstallBackupClientsResponse.Success"));
		uninstallBackupClientsResponse.setTaskId(_ctx.stringValue("UninstallBackupClientsResponse.TaskId"));

		List<InstanceStatus> instanceStatuses = new ArrayList<InstanceStatus>();
		for (int i = 0; i < _ctx.lengthValue("UninstallBackupClientsResponse.InstanceStatuses.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setInstanceId(_ctx.stringValue("UninstallBackupClientsResponse.InstanceStatuses["+ i +"].InstanceId"));
			instanceStatus.setValidInstance(_ctx.booleanValue("UninstallBackupClientsResponse.InstanceStatuses["+ i +"].ValidInstance"));
			instanceStatus.setErrorCode(_ctx.stringValue("UninstallBackupClientsResponse.InstanceStatuses["+ i +"].ErrorCode"));

			instanceStatuses.add(instanceStatus);
		}
		uninstallBackupClientsResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return uninstallBackupClientsResponse;
	}
}