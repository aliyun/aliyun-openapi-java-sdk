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
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotGroupsResponse.SnapshotGroup.Snapshot.Tag2;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotGroupsResponse.SnapshotGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotGroupsResponseUnmarshaller {

	public static DescribeSnapshotGroupsResponse unmarshall(DescribeSnapshotGroupsResponse describeSnapshotGroupsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotGroupsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotGroupsResponse.RequestId"));
		describeSnapshotGroupsResponse.setNextToken(_ctx.stringValue("DescribeSnapshotGroupsResponse.NextToken"));

		List<SnapshotGroup> snapshotGroups = new ArrayList<SnapshotGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotGroupsResponse.SnapshotGroups.Length"); i++) {
			SnapshotGroup snapshotGroup = new SnapshotGroup();
			snapshotGroup.setStatus(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Status"));
			snapshotGroup.setCreationTime(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].CreationTime"));
			snapshotGroup.setDescription(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Description"));
			snapshotGroup.setProgressStatus(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].ProgressStatus"));
			snapshotGroup.setSnapshotGroupId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].SnapshotGroupId"));
			snapshotGroup.setInstanceId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].InstanceId"));
			snapshotGroup.setName(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Name"));
			snapshotGroup.setResourceGroupId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			snapshotGroup.setTags(tags);

			List<Snapshot> snapshots = new ArrayList<Snapshot>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots.Length"); j++) {
				Snapshot snapshot = new Snapshot();
				snapshot.setSourceDiskId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].SourceDiskId"));
				snapshot.setProgress(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].Progress"));
				snapshot.setInstantAccessRetentionDays(_ctx.integerValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].InstantAccessRetentionDays"));
				snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].SnapshotId"));
				snapshot.setInstantAccess(_ctx.booleanValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].InstantAccess"));
				snapshot.setSourceDiskType(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].SourceDiskType"));

				List<Tag2> tags1 = new ArrayList<Tag2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].Tags.Length"); k++) {
					Tag2 tag2 = new Tag2();
					tag2.setKey(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].Tags["+ k +"].Key"));
					tag2.setValue(_ctx.stringValue("DescribeSnapshotGroupsResponse.SnapshotGroups["+ i +"].Snapshots["+ j +"].Tags["+ k +"].Value"));

					tags1.add(tag2);
				}
				snapshot.setTags1(tags1);

				snapshots.add(snapshot);
			}
			snapshotGroup.setSnapshots(snapshots);

			snapshotGroups.add(snapshotGroup);
		}
		describeSnapshotGroupsResponse.setSnapshotGroups(snapshotGroups);
	 
	 	return describeSnapshotGroupsResponse;
	}
}