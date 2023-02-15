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

import com.aliyuncs.hbr.model.v20170908.DescribeOtsTableSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeOtsTableSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOtsTableSnapshotsResponseUnmarshaller {

	public static DescribeOtsTableSnapshotsResponse unmarshall(DescribeOtsTableSnapshotsResponse describeOtsTableSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeOtsTableSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.RequestId"));
		describeOtsTableSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeOtsTableSnapshotsResponse.Success"));
		describeOtsTableSnapshotsResponse.setCode(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Code"));
		describeOtsTableSnapshotsResponse.setMessage(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Message"));
		describeOtsTableSnapshotsResponse.setLimit(_ctx.integerValue("DescribeOtsTableSnapshotsResponse.Limit"));
		describeOtsTableSnapshotsResponse.setNextToken(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.NextToken"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOtsTableSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setVaultId(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].VaultId"));
			snapshot.setBackupType(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setCreateTime(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setActualBytes(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setSourceType(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setRetention(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setCreatedTime(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setParentSnapshotHash(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			snapshot.setStartTime(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setJobId(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setInstanceName(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].InstanceName"));
			snapshot.setTableName(_ctx.stringValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].TableName"));
			snapshot.setRangeStart(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].RangeStart"));
			snapshot.setRangeEnd(_ctx.longValue("DescribeOtsTableSnapshotsResponse.Snapshots["+ i +"].RangeEnd"));

			snapshots.add(snapshot);
		}
		describeOtsTableSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeOtsTableSnapshotsResponse;
	}
}