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

import com.aliyuncs.hbr.model.v20170908.DescribeVmMigrationPlanResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmMigrationPlanResponse.Migration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmMigrationPlanResponseUnmarshaller {

	public static DescribeVmMigrationPlanResponse unmarshall(DescribeVmMigrationPlanResponse describeVmMigrationPlanResponse, UnmarshallerContext _ctx) {
		
		describeVmMigrationPlanResponse.setRequestId(_ctx.stringValue("DescribeVmMigrationPlanResponse.RequestId"));
		describeVmMigrationPlanResponse.setSuccess(_ctx.booleanValue("DescribeVmMigrationPlanResponse.Success"));
		describeVmMigrationPlanResponse.setCode(_ctx.stringValue("DescribeVmMigrationPlanResponse.Code"));
		describeVmMigrationPlanResponse.setMessage(_ctx.stringValue("DescribeVmMigrationPlanResponse.Message"));
		describeVmMigrationPlanResponse.setTotalCount(_ctx.longValue("DescribeVmMigrationPlanResponse.TotalCount"));
		describeVmMigrationPlanResponse.setPageNumber(_ctx.integerValue("DescribeVmMigrationPlanResponse.PageNumber"));
		describeVmMigrationPlanResponse.setPageSize(_ctx.integerValue("DescribeVmMigrationPlanResponse.PageSize"));

		List<Migration> migrations = new ArrayList<Migration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmMigrationPlanResponse.Migrations.Length"); i++) {
			Migration migration = new Migration();
			migration.setVmId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].VmId"));
			migration.setBackupPlanId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].BackupPlanId"));
			migration.setServerType(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ServerType"));
			migration.setVmName(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].VmName"));
			migration.setExtra(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].Extra"));
			migration.setHypervisorId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].HypervisorId"));
			migration.setServerId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ServerId"));
			migration.setVmSnapshotId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].VmSnapshotId"));
			migration.setVSwitchId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].VSwitchId"));
			migration.setInstanceType(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].InstanceType"));
			migration.setPrivateIpAddress(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].PrivateIpAddress"));
			migration.setDiskCategory(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].DiskCategory"));
			migration.setSecurityGroup(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].SecurityGroup"));
			migration.setAllocationPublicIp(_ctx.booleanValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].AllocationPublicIp"));
			migration.setCreateImage(_ctx.booleanValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].CreateImage"));
			migration.setBootAfterMigration(_ctx.booleanValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].BootAfterMigration"));
			migration.setRestoreId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].RestoreId"));
			migration.setProgress(_ctx.integerValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].Progress"));
			migration.setEcsInstanceId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].EcsInstanceId"));
			migration.setErrorMessage(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ErrorMessage"));
			migration.setImageId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ImageId"));
			migration.setCreatedTime(_ctx.longValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].CreatedTime"));
			migration.setUpdatedTime(_ctx.longValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].UpdatedTime"));
			migration.setVmInfo(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].VmInfo"));
			migration.setForceSilentSnapshot(_ctx.booleanValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ForceSilentSnapshot"));
			migration.setIncrementalSyncState(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].IncrementalSyncState"));
			migration.setGarbageImageIds(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].GarbageImageIds"));
			migration.setTestRestore(_ctx.booleanValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].TestRestore"));
			migration.setClientId(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ClientId"));
			migration.setClientName(_ctx.stringValue("DescribeVmMigrationPlanResponse.Migrations["+ i +"].ClientName"));

			migrations.add(migration);
		}
		describeVmMigrationPlanResponse.setMigrations(migrations);
	 
	 	return describeVmMigrationPlanResponse;
	}
}