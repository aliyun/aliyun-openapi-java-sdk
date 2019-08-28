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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.UpgradeBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeBackupPlanResponseUnmarshaller {

	public static UpgradeBackupPlanResponse unmarshall(UpgradeBackupPlanResponse upgradeBackupPlanResponse, UnmarshallerContext _ctx) {
		
		upgradeBackupPlanResponse.setRequestId(_ctx.stringValue("UpgradeBackupPlanResponse.RequestId"));
		upgradeBackupPlanResponse.setSuccess(_ctx.booleanValue("UpgradeBackupPlanResponse.Success"));
		upgradeBackupPlanResponse.setErrCode(_ctx.stringValue("UpgradeBackupPlanResponse.ErrCode"));
		upgradeBackupPlanResponse.setErrMessage(_ctx.stringValue("UpgradeBackupPlanResponse.ErrMessage"));
		upgradeBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("UpgradeBackupPlanResponse.HttpStatusCode"));
		upgradeBackupPlanResponse.setBackupPlanId(_ctx.stringValue("UpgradeBackupPlanResponse.BackupPlanId"));
		upgradeBackupPlanResponse.setOrderId(_ctx.stringValue("UpgradeBackupPlanResponse.OrderId"));
	 
	 	return upgradeBackupPlanResponse;
	}
}