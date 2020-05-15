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

import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlServerSnapshotsResponseUnmarshaller {

	public static DescribeSqlServerSnapshotsResponse unmarshall(DescribeSqlServerSnapshotsResponse describeSqlServerSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSqlServerSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.RequestId"));
		describeSqlServerSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeSqlServerSnapshotsResponse.Success"));
		describeSqlServerSnapshotsResponse.setCode(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Code"));
		describeSqlServerSnapshotsResponse.setMessage(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Message"));
		describeSqlServerSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeSqlServerSnapshotsResponse.TotalCount"));
		describeSqlServerSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeSqlServerSnapshotsResponse.PageSize"));
		describeSqlServerSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeSqlServerSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlServerSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setVaultId(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			snapshot.setClusterId(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].ClusterId"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setPlanId(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].PlanId"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setStartTime(_ctx.longValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setBackupType(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setDatabaseId(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].DatabaseId"));
			snapshot.setDatabaseName(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].DatabaseName"));
			snapshot.setStatus(_ctx.stringValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setExpireTime(_ctx.longValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].ExpireTime"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeSqlServerSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));

			snapshots.add(snapshot);
		}
		describeSqlServerSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSqlServerSnapshotsResponse;
	}
}