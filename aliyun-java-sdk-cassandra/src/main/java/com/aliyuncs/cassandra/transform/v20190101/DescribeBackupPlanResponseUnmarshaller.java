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

package com.aliyuncs.cassandra.transform.v20190101;

import com.aliyuncs.cassandra.model.v20190101.DescribeBackupPlanResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeBackupPlanResponse.BackupPlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlanResponseUnmarshaller {

	public static DescribeBackupPlanResponse unmarshall(DescribeBackupPlanResponse describeBackupPlanResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlanResponse.setRequestId(_ctx.stringValue("DescribeBackupPlanResponse.RequestId"));

		BackupPlan backupPlan = new BackupPlan();
		backupPlan.setClusterId(_ctx.stringValue("DescribeBackupPlanResponse.BackupPlan.ClusterId"));
		backupPlan.setDataCenterId(_ctx.stringValue("DescribeBackupPlanResponse.BackupPlan.DataCenterId"));
		backupPlan.setCreatedTime(_ctx.stringValue("DescribeBackupPlanResponse.BackupPlan.CreatedTime"));
		backupPlan.setBackupTime(_ctx.stringValue("DescribeBackupPlanResponse.BackupPlan.BackupTime"));
		backupPlan.setBackupPeriod(_ctx.stringValue("DescribeBackupPlanResponse.BackupPlan.BackupPeriod"));
		backupPlan.setRetentionPeriod(_ctx.integerValue("DescribeBackupPlanResponse.BackupPlan.RetentionPeriod"));
		backupPlan.setActive(_ctx.booleanValue("DescribeBackupPlanResponse.BackupPlan.Active"));
		describeBackupPlanResponse.setBackupPlan(backupPlan);
	 
	 	return describeBackupPlanResponse;
	}
}