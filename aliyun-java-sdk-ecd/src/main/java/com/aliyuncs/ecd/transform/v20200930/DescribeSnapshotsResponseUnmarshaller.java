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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeSnapshotsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setNextToken(_ctx.stringValue("DescribeSnapshotsResponse.NextToken"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setDesktopId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].DesktopId"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setDescription(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setSnapshotType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			snapshot.setSourceDiskSize(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setSourceDiskType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshot.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setCreationTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setProgress(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setRemainTime(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RemainTime"));

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}