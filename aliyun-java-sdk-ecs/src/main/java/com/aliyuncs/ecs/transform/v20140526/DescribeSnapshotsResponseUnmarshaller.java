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
		describeSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.TotalCount"));
		describeSnapshotsResponse.setNextToken(_ctx.stringValue("DescribeSnapshotsResponse.NextToken"));
		describeSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageSize"));
		describeSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setInstantAccess(_ctx.booleanValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstantAccess"));
			snapshot.setDescription(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setCategory(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Category"));
			snapshot.setKMSKeyId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].KMSKeyId"));
			snapshot.setResourceGroupId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ResourceGroupId"));
			snapshot.setEncrypted(_ctx.booleanValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Encrypted"));
			snapshot.setSnapshotLinkId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotLinkId"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setInstantAccessRetentionDays(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstantAccessRetentionDays"));
			snapshot.setSourceDiskId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSnapshotSN(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotSN"));
			snapshot.setSourceRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceRegionId"));
			snapshot.setAvailable(_ctx.booleanValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Available"));
			snapshot.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setProgress(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setUsage(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Usage"));
			snapshot.setProductCode(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].ProductCode"));
			snapshot.setSourceSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceSnapshotId"));
			snapshot.setRetentionDays(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RetentionDays"));
			snapshot.setSourceStorageType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceStorageType"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setFullSnapshotSizeInBytes(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].FullSnapshotSizeInBytes"));
			snapshot.setSourceDiskSize(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setCreationTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setLastModifiedTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].LastModifiedTime"));
			snapshot.setSnapshotType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			snapshot.setRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			snapshot.setRemainTime(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RemainTime"));
			snapshot.setSourceDiskType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			snapshot.setTags(tags);

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}