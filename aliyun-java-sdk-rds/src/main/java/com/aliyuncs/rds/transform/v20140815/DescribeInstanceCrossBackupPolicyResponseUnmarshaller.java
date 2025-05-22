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

	public static DescribeInstanceCrossBackupPolicyResponse unmarshall(DescribeInstanceCrossBackupPolicyResponse describeInstanceCrossBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeInstanceCrossBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.RequestId"));
		describeInstanceCrossBackupPolicyResponse.setBackupEnabled(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.BackupEnabled"));
		describeInstanceCrossBackupPolicyResponse.setBackupEnabledTime(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.BackupEnabledTime"));
		describeInstanceCrossBackupPolicyResponse.setCrossBackupRegion(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.CrossBackupRegion"));
		describeInstanceCrossBackupPolicyResponse.setCrossBackupType(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.CrossBackupType"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceDescription(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceDescription"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceId(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceId"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceStatus(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceStatus"));
		describeInstanceCrossBackupPolicyResponse.setDBInstanceStatusDesc(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.DBInstanceStatusDesc"));
		describeInstanceCrossBackupPolicyResponse.setEndpoint(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.Endpoint"));
		describeInstanceCrossBackupPolicyResponse.setEngine(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.Engine"));
		describeInstanceCrossBackupPolicyResponse.setEngineVersion(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.EngineVersion"));
		describeInstanceCrossBackupPolicyResponse.setLockMode(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.LockMode"));
		describeInstanceCrossBackupPolicyResponse.setLogBackupEnabled(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.LogBackupEnabled"));
		describeInstanceCrossBackupPolicyResponse.setLogBackupEnabledTime(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.LogBackupEnabledTime"));
		describeInstanceCrossBackupPolicyResponse.setRegionId(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.RegionId"));
		describeInstanceCrossBackupPolicyResponse.setRelService(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.RelService"));
		describeInstanceCrossBackupPolicyResponse.setRelServiceId(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.RelServiceId"));
		describeInstanceCrossBackupPolicyResponse.setRetentType(_ctx.integerValue("DescribeInstanceCrossBackupPolicyResponse.RetentType"));
		describeInstanceCrossBackupPolicyResponse.setRetention(_ctx.integerValue("DescribeInstanceCrossBackupPolicyResponse.Retention"));
		describeInstanceCrossBackupPolicyResponse.setStorageOwner(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.StorageOwner"));
		describeInstanceCrossBackupPolicyResponse.setStorageType(_ctx.stringValue("DescribeInstanceCrossBackupPolicyResponse.StorageType"));
	 
	 	return describeInstanceCrossBackupPolicyResponse;
	}
}