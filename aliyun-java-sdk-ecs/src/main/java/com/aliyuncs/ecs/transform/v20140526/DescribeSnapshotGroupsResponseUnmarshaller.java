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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotGroupsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotGroupsResponse.SnapshotGroup;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotGroupsResponse.SnapshotGroup.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotGroupsResponseUnmarshaller {

	public static DescribeSnapshotGroupsResponse unmarshall(DescribeSnapshotGroupsResponse describeSnapshotGroupsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotGroupsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotGroupsResponse.RequestId"));
		describeSnapshotGroupsResponse.setNextToken(_ctx.stringValue("DescribeSnapshotGroupsResponse.NextToken"));

		List<SnapshotGroup> snapshotGroups = new ArrayList<SnapshotGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotGroupsResponse.SnapshotGroups.Length"); i++) {
			SnapshotGroup snapshotGroup = new SnapshotGroup();
			snapshotGroup.setInstanceId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].InstanceId"));
			snapshotGroup.setSnapshotGroupId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].SnapshotGroupId"));
			snapshotGroup.setStatus(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Status"));
			snapshotGroup.setName(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Name"));
			snapshotGroup.setDescription(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Description"));
			snapshotGroup.setCreationTime(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].CreationTime"));
			snapshotGroup.setProgressStatus(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].ProgressStatus"));

			List<Snapshot> snapshots = new ArrayList<Snapshot>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots.Length"); j++) {
				Snapshot snapshot = new Snapshot();
				snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].SnapshotId"));
				snapshot.setProgress(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].Progress"));
				snapshot.setSourceDiskId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].SourceDiskId"));
				snapshot.setSourceDiskType(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].SourceDiskType"));
				snapshot.setInstantAccess(_ctx.booleanValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].InstantAccess"));
				snapshot.setInstantAccessRetentionDays(_ctx.integerValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].InstantAccessRetentionDays"));

				snapshots.add(snapshot);
			}
			snapshotGroup.setSnapshots(snapshots);

			snapshotGroups.add(snapshotGroup);
		}
		describeSnapshotGroupsResponse.setSnapshotGroups(snapshotGroups);
	 
	 	return describeSnapshotGroupsResponse;
	}
}