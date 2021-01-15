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

import com.aliyuncs.hbr.model.v20170908.DescribeUdmSnapshotsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeUdmSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUdmSnapshotsResponseUnmarshaller {

	public static DescribeUdmSnapshotsResponse unmarshall(DescribeUdmSnapshotsResponse describeUdmSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeUdmSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeUdmSnapshotsResponse.RequestId"));
		describeUdmSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeUdmSnapshotsResponse.Success"));
		describeUdmSnapshotsResponse.setCode(_ctx.stringValue("DescribeUdmSnapshotsResponse.Code"));
		describeUdmSnapshotsResponse.setMessage(_ctx.stringValue("DescribeUdmSnapshotsResponse.Message"));
		describeUdmSnapshotsResponse.setTotalCount(_ctx.longValue("DescribeUdmSnapshotsResponse.TotalCount"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUdmSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setCreatedTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].UpdatedTime"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSourceType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].SourceType"));
			snapshot.setJobId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].JobId"));
			snapshot.setBackupType(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].BackupType"));
			snapshot.setStatus(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].SnapshotHash"));
			snapshot.setParentSnapshotHash(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].ParentSnapshotHash"));
			snapshot.setStartTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].StartTime"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].CompleteTime"));
			snapshot.setRetention(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Retention"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].BytesTotal"));
			snapshot.setFileSystemId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].FileSystemId"));
			snapshot.setCreateTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setBucket(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setPrefix(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setBucket1(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Bucket"));
			snapshot.setPrefix2(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Prefix"));
			snapshot.setInstanceId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setDiskId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].DiskId"));
			snapshot.setNativeSnapshotId(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].NativeSnapshotId"));
			snapshot.setActualBytes(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].ActualBytes"));
			snapshot.setRealSnapshotTime(_ctx.longValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].RealSnapshotTime"));
			snapshot.setNativeSnapshotInfo(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].NativeSnapshotInfo"));
			snapshot.setDetail(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Detail"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeUdmSnapshotsResponse.Snapshots["+ i +"].Paths["+ j +"]"));
			}
			snapshot.setPaths(paths);

			snapshots.add(snapshot);
		}
		describeUdmSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeUdmSnapshotsResponse;
	}
}