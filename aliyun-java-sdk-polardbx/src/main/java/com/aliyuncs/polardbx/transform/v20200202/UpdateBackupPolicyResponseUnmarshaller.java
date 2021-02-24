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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.UpdateBackupPolicyResponse;
import com.aliyuncs.polardbx.model.v20200202.UpdateBackupPolicyResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBackupPolicyResponseUnmarshaller {

	public static UpdateBackupPolicyResponse unmarshall(UpdateBackupPolicyResponse updateBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		updateBackupPolicyResponse.setRequestId(_ctx.stringValue("UpdateBackupPolicyResponse.RequestId"));
		updateBackupPolicyResponse.setMessage(_ctx.stringValue("UpdateBackupPolicyResponse.Message"));
		updateBackupPolicyResponse.setSuccess(_ctx.booleanValue("UpdateBackupPolicyResponse.Success"));

		List<Account> data = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("UpdateBackupPolicyResponse.Data.Length"); i++) {
			Account account = new Account();
			account.setDBInstanceName(_ctx.stringValue("UpdateBackupPolicyResponse.Data["+ i +"].DBInstanceName"));
			account.setBackupType(_ctx.stringValue("UpdateBackupPolicyResponse.Data["+ i +"].BackupType"));
			account.setBackupPeriod(_ctx.stringValue("UpdateBackupPolicyResponse.Data["+ i +"].BackupPeriod"));
			account.setBackupPlanBegin(_ctx.stringValue("UpdateBackupPolicyResponse.Data["+ i +"].BackupPlanBegin"));
			account.setBackupSetRetention(_ctx.integerValue("UpdateBackupPolicyResponse.Data["+ i +"].BackupSetRetention"));
			account.setIsEnabled(_ctx.integerValue("UpdateBackupPolicyResponse.Data["+ i +"].IsEnabled"));
			account.setBackupWay(_ctx.stringValue("UpdateBackupPolicyResponse.Data["+ i +"].BackupWay"));
			account.setRemoveLogRetention(_ctx.integerValue("UpdateBackupPolicyResponse.Data["+ i +"].RemoveLogRetention"));
			account.setLocalLogRetention(_ctx.integerValue("UpdateBackupPolicyResponse.Data["+ i +"].LocalLogRetention"));
			account.setLogLocalRetentionSpace(_ctx.integerValue("UpdateBackupPolicyResponse.Data["+ i +"].LogLocalRetentionSpace"));
			account.setForceCleanOnHighSpaceUsage(_ctx.integerValue("UpdateBackupPolicyResponse.Data["+ i +"].ForceCleanOnHighSpaceUsage"));

			data.add(account);
		}
		updateBackupPolicyResponse.setData(data);
	 
	 	return updateBackupPolicyResponse;
	}
}