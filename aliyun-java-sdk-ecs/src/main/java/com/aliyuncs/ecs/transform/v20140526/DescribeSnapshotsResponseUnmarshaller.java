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

import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse.Snapshot.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext context) {
		
		describeSnapshotsResponse.setRequestId(context.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setTotalCount(context.integerValue("DescribeSnapshotsResponse.TotalCount"));
		describeSnapshotsResponse.setPageNumber(context.integerValue("DescribeSnapshotsResponse.PageNumber"));
		describeSnapshotsResponse.setPageSize(context.integerValue("DescribeSnapshotsResponse.PageSize"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < context.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setSnapshotId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSnapshotName(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setProgress(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setProductCode(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ProductCode"));
			snapshot.setSourceDiskId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSourceDiskType(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshot.setRetentionDays(context.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RetentionDays"));
			snapshot.setEncrypted(context.booleanValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Encrypted"));
			snapshot.setSourceDiskSize(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setDescription(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setCreationTime(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setStatus(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setUsage(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Usage"));
			snapshot.setSourceStorageType(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceStorageType"));
			snapshot.setRemainTime(context.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RemainTime"));
			snapshot.setResourceGroupId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			snapshot.setTags(tags);

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}