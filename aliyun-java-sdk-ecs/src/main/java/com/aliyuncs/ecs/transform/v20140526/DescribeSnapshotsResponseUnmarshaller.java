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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setNextToken(_ctx.stringValue("DescribeSnapshotsResponse.NextToken"));
		describeSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageSize"));
		describeSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotsResponse.PageNumber"));
		describeSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.TotalCount"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setCreationTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setProgress(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setInstantAccess(_ctx.booleanValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstantAccess"));
			snapshot.setRemainTime(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RemainTime"));
			snapshot.setSourceDiskSize(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setRetentionDays(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RetentionDays"));
			snapshot.setSourceDiskType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshot.setSourceStorageType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceStorageType"));
			snapshot.setUsage(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Usage"));
			snapshot.setLastModifiedTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].LastModifiedTime"));
			snapshot.setEncrypted(_ctx.booleanValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Encrypted"));
			snapshot.setSnapshotType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			snapshot.setSourceDiskId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setInstantAccessRetentionDays(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstantAccessRetentionDays"));
			snapshot.setDescription(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setResourceGroupId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ResourceGroupId"));
			snapshot.setCategory(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Category"));
			snapshot.setKMSKeyId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].KMSKeyId"));
			snapshot.setSnapshotSN(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotSN"));
			snapshot.setProductCode(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ProductCode"));
			snapshot.setSourceSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceSnapshotId"));
			snapshot.setSourceRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceRegionId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			snapshot.setTags(tags);

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}