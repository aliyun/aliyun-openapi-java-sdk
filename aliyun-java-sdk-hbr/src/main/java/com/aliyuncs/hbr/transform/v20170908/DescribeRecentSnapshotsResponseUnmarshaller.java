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

import com.aliyuncs.hbr.model.v20170908.DescribeRecentSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeRecentSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecentSnapshotsResponseUnmarshaller {

	public static DescribeRecentSnapshotsResponse unmarshall(DescribeRecentSnapshotsResponse describeRecentSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeRecentSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeRecentSnapshotsResponse.RequestId"));
		describeRecentSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeRecentSnapshotsResponse.Success"));
		describeRecentSnapshotsResponse.setCode(_ctx.stringValue("DescribeRecentSnapshotsResponse.Code"));
		describeRecentSnapshotsResponse.setMessage(_ctx.stringValue("DescribeRecentSnapshotsResponse.Message"));
		describeRecentSnapshotsResponse.setTotalCount(_ctx.longValue("DescribeRecentSnapshotsResponse.TotalCount"));
		describeRecentSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeRecentSnapshotsResponse.PageSize"));
		describeRecentSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeRecentSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecentSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setCreatedTime(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSourceType(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setJobId(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setBackupType(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setStatus(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setParentSnapshotHash(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			snapshot.setStartTime(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setRetention(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setFileSystemId(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].FileSystemId"));
			snapshot.setCreateTime(_ctx.longValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setBucket(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setPrefix(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setBucket1(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setPrefix2(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setInstanceId(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setPath(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Path"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeRecentSnapshotsResponse.Snapshots["+ i +"].Paths["+ j +"]"));
			}
			snapshot.setPaths(paths);

			snapshots.add(snapshot);
		}
		describeRecentSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeRecentSnapshotsResponse;
	}
}