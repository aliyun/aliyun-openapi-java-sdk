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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeInstanceCrossBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceCrossBackupPolicyResponseUnmarshaller {

	public static DescribeInstanceCrossBackupPolicyResponse unmarshall(DescribeInstanceCrossBackupPolicyResponse describeInstanceCrossBackupPolicyResponse, UnmarshallerContext context) {
		
		describeInstanceCrossBackupPolicyResponse.setRequestId(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.RequestId"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceId(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceId"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceDescription(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceDescription"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceStatus(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceStatus"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceStatusDesc(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceStatusDesc"));
		describeInstanceCrossBackupPolicyResponse.setEngine(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.Engine"));
		describeInstanceCrossBackupPolicyResponse.setEngineVersion(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.EngineVersion"));
		describeInstanceCrossBackupPolicyResponse.setRegionId(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.RegionId"));
		describeInstanceCrossBackupPolicyResponse.setCrossBackupRegion(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.CrossBackupRegion"));
		describeInstanceCrossBackupPolicyResponse.setCrossBackupType(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.CrossBackupType"));
		describeInstanceCrossBackupPolicyResponse.setBackupEnabledTime(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.BackupEnabledTime"));
		describeInstanceCrossBackupPolicyResponse.setBackupEnabled(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.BackupEnabled"));
		describeInstanceCrossBackupPolicyResponse.setLogBackupEnabled(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.LogBackupEnabled"));
		describeInstanceCrossBackupPolicyResponse.setLogBackupEnabledTime(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.LogBackupEnabledTime"));
		describeInstanceCrossBackupPolicyResponse.setStorageOwner(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.StorageOwner"));
		describeInstanceCrossBackupPolicyResponse.setStorageType(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.StorageType"));
		describeInstanceCrossBackupPolicyResponse.setEndpoint(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.Endpoint"));
		describeInstanceCrossBackupPolicyResponse.setRetentType(context.integerValue("DescribeInstanceCrossBackupPolicyResponse.RetentType"));
		describeInstanceCrossBackupPolicyResponse.setRetention(context.integerValue("DescribeInstanceCrossBackupPolicyResponse.Retention"));
		describeInstanceCrossBackupPolicyResponse.setLockMode(context.stringValue("DescribeInstanceCrossBackupPolicyResponse.LockMode"));
	 
	 	return describeInstanceCrossBackupPolicyResponse;
	}
}