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

import com.aliyuncs.hbr.model.v20170908.UpgradeBackupClientsResponse;
import com.aliyuncs.hbr.model.v20170908.UpgradeBackupClientsResponse.InstanceStatusesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeBackupClientsResponseUnmarshaller {

	public static UpgradeBackupClientsResponse unmarshall(UpgradeBackupClientsResponse upgradeBackupClientsResponse, UnmarshallerContext _ctx) {
		
		upgradeBackupClientsResponse.setRequestId(_ctx.stringValue("UpgradeBackupClientsResponse.RequestId"));
		upgradeBackupClientsResponse.setCode(_ctx.stringValue("UpgradeBackupClientsResponse.Code"));
		upgradeBackupClientsResponse.setMessage(_ctx.stringValue("UpgradeBackupClientsResponse.Message"));
		upgradeBackupClientsResponse.setSuccess(_ctx.booleanValue("UpgradeBackupClientsResponse.Success"));
		upgradeBackupClientsResponse.setTaskId(_ctx.stringValue("UpgradeBackupClientsResponse.TaskId"));

		List<InstanceStatusesItem> instanceStatuses = new ArrayList<InstanceStatusesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpgradeBackupClientsResponse.InstanceStatuses.Length"); i++) {
			InstanceStatusesItem instanceStatusesItem = new InstanceStatusesItem();
			instanceStatusesItem.setInstanceId(_ctx.stringValue("UpgradeBackupClientsResponse.InstanceStatuses["+ i +"].InstanceId"));
			instanceStatusesItem.setValidInstance(_ctx.booleanValue("UpgradeBackupClientsResponse.InstanceStatuses["+ i +"].ValidInstance"));
			instanceStatusesItem.setErrorCode(_ctx.stringValue("UpgradeBackupClientsResponse.InstanceStatuses["+ i +"].ErrorCode"));

			instanceStatuses.add(instanceStatusesItem);
		}
		upgradeBackupClientsResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return upgradeBackupClientsResponse;
	}
}