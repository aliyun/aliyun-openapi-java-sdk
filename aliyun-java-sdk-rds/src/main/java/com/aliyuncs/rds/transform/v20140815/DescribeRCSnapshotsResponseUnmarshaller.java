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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCSnapshotsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCSnapshotsResponseUnmarshaller {

	public static DescribeRCSnapshotsResponse unmarshall(DescribeRCSnapshotsResponse describeRCSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeRCSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeRCSnapshotsResponse.RequestId"));
		describeRCSnapshotsResponse.setPageNumber(_ctx.longValue("DescribeRCSnapshotsResponse.PageNumber"));
		describeRCSnapshotsResponse.setPageSize(_ctx.longValue("DescribeRCSnapshotsResponse.PageSize"));
		describeRCSnapshotsResponse.setTotalCount(_ctx.longValue("DescribeRCSnapshotsResponse.TotalCount"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setAvailable(_ctx.booleanValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Available"));
			snapshot.setCategory(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Category"));
			snapshot.setCreationTime(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setDescription(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setEncrypted(_ctx.booleanValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Encrypted"));
			snapshot.setInstantAccess(_ctx.booleanValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].InstantAccess"));
			snapshot.setProgress(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setRegionId(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setSnapshotType(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			snapshot.setSourceDiskId(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSourceDiskSize(_ctx.longValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setSourceDiskType(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshot.setSourceStorageType(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].SourceStorageType"));
			snapshot.setStatus(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setUsage(_ctx.stringValue("DescribeRCSnapshotsResponse.Snapshots["+ i +"].Usage"));

			snapshots.add(snapshot);
		}
		describeRCSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeRCSnapshotsResponse;
	}
}