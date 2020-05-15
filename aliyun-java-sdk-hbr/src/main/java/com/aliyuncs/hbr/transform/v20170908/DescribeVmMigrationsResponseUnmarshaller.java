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

import com.aliyuncs.hbr.model.v20170908.DescribeVmMigrationsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmMigrationsResponse.Migration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmMigrationsResponseUnmarshaller {

	public static DescribeVmMigrationsResponse unmarshall(DescribeVmMigrationsResponse describeVmMigrationsResponse, UnmarshallerContext _ctx) {
		
		describeVmMigrationsResponse.setRequestId(_ctx.stringValue("DescribeVmMigrationsResponse.RequestId"));
		describeVmMigrationsResponse.setSuccess(_ctx.booleanValue("DescribeVmMigrationsResponse.Success"));
		describeVmMigrationsResponse.setCode(_ctx.stringValue("DescribeVmMigrationsResponse.Code"));
		describeVmMigrationsResponse.setMessage(_ctx.stringValue("DescribeVmMigrationsResponse.Message"));
		describeVmMigrationsResponse.setTotalCount(_ctx.longValue("DescribeVmMigrationsResponse.TotalCount"));
		describeVmMigrationsResponse.setPageNumber(_ctx.integerValue("DescribeVmMigrationsResponse.PageNumber"));
		describeVmMigrationsResponse.setPageSize(_ctx.integerValue("DescribeVmMigrationsResponse.PageSize"));

		List<Migration> migrations = new ArrayList<Migration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmMigrationsResponse.Migrations.Length"); i++) {
			Migration migration = new Migration();
			migration.setVmId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].VmId"));
			migration.setBackupPlanId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].BackupPlanId"));
			migration.setServerType(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ServerType"));
			migration.setVmName(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].VmName"));
			migration.setExtra(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].Extra"));
			migration.setHypervisorId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].HypervisorId"));
			migration.setServerId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ServerId"));
			migration.setVmSnapshotId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].VmSnapshotId"));
			migration.setVSwitchId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].VSwitchId"));
			migration.setInstanceType(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].InstanceType"));
			migration.setPrivateIpAddress(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].PrivateIpAddress"));
			migration.setDiskCategory(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].DiskCategory"));
			migration.setSecurityGroup(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].SecurityGroup"));
			migration.setAllocationPublicIp(_ctx.booleanValue("DescribeVmMigrationsResponse.Migrations["+ i +"].AllocationPublicIp"));
			migration.setCreateImage(_ctx.booleanValue("DescribeVmMigrationsResponse.Migrations["+ i +"].CreateImage"));
			migration.setBootAfterMigration(_ctx.booleanValue("DescribeVmMigrationsResponse.Migrations["+ i +"].BootAfterMigration"));
			migration.setRestoreId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].RestoreId"));
			migration.setProgress(_ctx.integerValue("DescribeVmMigrationsResponse.Migrations["+ i +"].Progress"));
			migration.setEcsInstanceId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].EcsInstanceId"));
			migration.setErrorMessage(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ErrorMessage"));
			migration.setImageId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ImageId"));
			migration.setCreatedTime(_ctx.longValue("DescribeVmMigrationsResponse.Migrations["+ i +"].CreatedTime"));
			migration.setUpdatedTime(_ctx.longValue("DescribeVmMigrationsResponse.Migrations["+ i +"].UpdatedTime"));
			migration.setVmInfo(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].VmInfo"));
			migration.setForceSilentSnapshot(_ctx.booleanValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ForceSilentSnapshot"));
			migration.setIncrementalSyncState(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].IncrementalSyncState"));
			migration.setGarbageImageIds(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].GarbageImageIds"));
			migration.setTestRestore(_ctx.booleanValue("DescribeVmMigrationsResponse.Migrations["+ i +"].TestRestore"));
			migration.setClientId(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ClientId"));
			migration.setClientName(_ctx.stringValue("DescribeVmMigrationsResponse.Migrations["+ i +"].ClientName"));
			migration.setPendingRestore(_ctx.booleanValue("DescribeVmMigrationsResponse.Migrations["+ i +"].PendingRestore"));

			migrations.add(migration);
		}
		describeVmMigrationsResponse.setMigrations(migrations);
	 
	 	return describeVmMigrationsResponse;
	}
}