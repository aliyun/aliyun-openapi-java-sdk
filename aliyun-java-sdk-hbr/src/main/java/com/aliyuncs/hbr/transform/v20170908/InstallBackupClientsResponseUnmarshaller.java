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

import com.aliyuncs.hbr.model.v20170908.InstallBackupClientsResponse;
import com.aliyuncs.hbr.model.v20170908.InstallBackupClientsResponse.InstanceStatusesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallBackupClientsResponseUnmarshaller {

	public static InstallBackupClientsResponse unmarshall(InstallBackupClientsResponse installBackupClientsResponse, UnmarshallerContext _ctx) {
		
		installBackupClientsResponse.setRequestId(_ctx.stringValue("InstallBackupClientsResponse.RequestId"));
		installBackupClientsResponse.setCode(_ctx.stringValue("InstallBackupClientsResponse.Code"));
		installBackupClientsResponse.setMessage(_ctx.stringValue("InstallBackupClientsResponse.Message"));
		installBackupClientsResponse.setSuccess(_ctx.booleanValue("InstallBackupClientsResponse.Success"));
		installBackupClientsResponse.setTaskId(_ctx.stringValue("InstallBackupClientsResponse.TaskId"));

		List<InstanceStatusesItem> instanceStatuses = new ArrayList<InstanceStatusesItem>();
		for (int i = 0; i < _ctx.lengthValue("InstallBackupClientsResponse.InstanceStatuses.Length"); i++) {
			InstanceStatusesItem instanceStatusesItem = new InstanceStatusesItem();
			instanceStatusesItem.setInstanceId(_ctx.stringValue("InstallBackupClientsResponse.InstanceStatuses["+ i +"].InstanceId"));
			instanceStatusesItem.setValidInstance(_ctx.booleanValue("InstallBackupClientsResponse.InstanceStatuses["+ i +"].ValidInstance"));
			instanceStatusesItem.setErrorCode(_ctx.stringValue("InstallBackupClientsResponse.InstanceStatuses["+ i +"].ErrorCode"));

			instanceStatuses.add(instanceStatusesItem);
		}
		installBackupClientsResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return installBackupClientsResponse;
	}
}