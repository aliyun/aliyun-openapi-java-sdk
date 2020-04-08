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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeBackupPlansResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeBackupPlansResponse.BackupPlan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlansResponseUnmarshaller {

	public static DescribeBackupPlansResponse unmarshall(DescribeBackupPlansResponse describeBackupPlansResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlansResponse.setRequestId(_ctx.stringValue("DescribeBackupPlansResponse.RequestId"));

		List<BackupPlan> backupPlans = new ArrayList<BackupPlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans.Length"); i++) {
			BackupPlan backupPlan = new BackupPlan();
			backupPlan.setClusterId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].ClusterId"));
			backupPlan.setDataCenterId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].DataCenterId"));
			backupPlan.setCreatedTime(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CreatedTime"));
			backupPlan.setBackupTime(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].BackupTime"));
			backupPlan.setBackupPeriod(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].BackupPeriod"));
			backupPlan.setRetentionPeriod(_ctx.integerValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].RetentionPeriod"));
			backupPlan.setActive(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Active"));

			backupPlans.add(backupPlan);
		}
		describeBackupPlansResponse.setBackupPlans(backupPlans);
	 
	 	return describeBackupPlansResponse;
	}
}