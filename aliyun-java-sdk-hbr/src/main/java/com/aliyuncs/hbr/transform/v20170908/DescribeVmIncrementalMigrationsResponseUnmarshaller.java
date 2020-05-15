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

import com.aliyuncs.hbr.model.v20170908.DescribeVmIncrementalMigrationsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmIncrementalMigrationsResponse.IncrementalMigration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmIncrementalMigrationsResponseUnmarshaller {

	public static DescribeVmIncrementalMigrationsResponse unmarshall(DescribeVmIncrementalMigrationsResponse describeVmIncrementalMigrationsResponse, UnmarshallerContext _ctx) {
		
		describeVmIncrementalMigrationsResponse.setRequestId(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.RequestId"));
		describeVmIncrementalMigrationsResponse.setSuccess(_ctx.booleanValue("DescribeVmIncrementalMigrationsResponse.Success"));
		describeVmIncrementalMigrationsResponse.setCode(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.Code"));
		describeVmIncrementalMigrationsResponse.setMessage(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.Message"));
		describeVmIncrementalMigrationsResponse.setTotalCount(_ctx.longValue("DescribeVmIncrementalMigrationsResponse.TotalCount"));
		describeVmIncrementalMigrationsResponse.setPageNumber(_ctx.integerValue("DescribeVmIncrementalMigrationsResponse.PageNumber"));
		describeVmIncrementalMigrationsResponse.setPageSize(_ctx.integerValue("DescribeVmIncrementalMigrationsResponse.PageSize"));

		List<IncrementalMigration> incrementalMigrations = new ArrayList<IncrementalMigration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations.Length"); i++) {
			IncrementalMigration incrementalMigration = new IncrementalMigration();
			incrementalMigration.setVmId(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].VmId"));
			incrementalMigration.setSyncId(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].SyncId"));
			incrementalMigration.setClientId(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].ClientId"));
			incrementalMigration.setSnapshotId(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].SnapshotId"));
			incrementalMigration.setBackupPlanId(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].BackupPlanId"));
			incrementalMigration.setFinalSync(_ctx.booleanValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].FinalSync"));
			incrementalMigration.setStatus(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].Status"));
			incrementalMigration.setMessage(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].Message"));
			incrementalMigration.setStartTime(_ctx.longValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].StartTime"));
			incrementalMigration.setUpdatedTime(_ctx.longValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].UpdatedTime"));
			incrementalMigration.setClientName(_ctx.stringValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].ClientName"));
			incrementalMigration.setSnapshotDuration(_ctx.longValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].SnapshotDuration"));
			incrementalMigration.setCompleteTime(_ctx.longValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].CompleteTime"));
			incrementalMigration.setSnapshotBytesTotal(_ctx.longValue("DescribeVmIncrementalMigrationsResponse.IncrementalMigrations["+ i +"].SnapshotBytesTotal"));

			incrementalMigrations.add(incrementalMigration);
		}
		describeVmIncrementalMigrationsResponse.setIncrementalMigrations(incrementalMigrations);
	 
	 	return describeVmIncrementalMigrationsResponse;
	}
}