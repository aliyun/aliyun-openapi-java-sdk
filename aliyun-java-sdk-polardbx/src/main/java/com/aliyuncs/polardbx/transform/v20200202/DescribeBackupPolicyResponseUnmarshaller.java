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

import com.aliyuncs.polardbx.model.v20200202.DescribeBackupPolicyResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeBackupPolicyResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setMessage(_ctx.stringValue("DescribeBackupPolicyResponse.Message"));
		describeBackupPolicyResponse.setSuccess(_ctx.booleanValue("DescribeBackupPolicyResponse.Success"));

		List<Account> data = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPolicyResponse.Data.Length"); i++) {
			Account account = new Account();
			account.setDBInstanceName(_ctx.stringValue("DescribeBackupPolicyResponse.Data["+ i +"].DBInstanceName"));
			account.setBackupType(_ctx.stringValue("DescribeBackupPolicyResponse.Data["+ i +"].BackupType"));
			account.setBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.Data["+ i +"].BackupPeriod"));
			account.setBackupPlanBegin(_ctx.stringValue("DescribeBackupPolicyResponse.Data["+ i +"].BackupPlanBegin"));
			account.setBackupSetRetention(_ctx.integerValue("DescribeBackupPolicyResponse.Data["+ i +"].BackupSetRetention"));
			account.setIsEnabled(_ctx.integerValue("DescribeBackupPolicyResponse.Data["+ i +"].IsEnabled"));
			account.setBackupWay(_ctx.stringValue("DescribeBackupPolicyResponse.Data["+ i +"].BackupWay"));
			account.setRemoveLogRetention(_ctx.integerValue("DescribeBackupPolicyResponse.Data["+ i +"].RemoveLogRetention"));
			account.setLocalLogRetention(_ctx.integerValue("DescribeBackupPolicyResponse.Data["+ i +"].LocalLogRetention"));
			account.setLogLocalRetentionSpace(_ctx.integerValue("DescribeBackupPolicyResponse.Data["+ i +"].LogLocalRetentionSpace"));
			account.setForceCleanOnHighSpaceUsage(_ctx.integerValue("DescribeBackupPolicyResponse.Data["+ i +"].ForceCleanOnHighSpaceUsage"));

			data.add(account);
		}
		describeBackupPolicyResponse.setData(data);
	 
	 	return describeBackupPolicyResponse;
	}
}