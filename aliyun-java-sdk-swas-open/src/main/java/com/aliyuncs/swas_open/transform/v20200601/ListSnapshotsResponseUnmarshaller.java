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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListSnapshotsResponse;
import com.aliyuncs.swas_open.model.v20200601.ListSnapshotsResponse.Snapshot;
import com.aliyuncs.swas_open.model.v20200601.ListSnapshotsResponse.Snapshot.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSnapshotsResponseUnmarshaller {

	public static ListSnapshotsResponse unmarshall(ListSnapshotsResponse listSnapshotsResponse, UnmarshallerContext _ctx) {
		
		listSnapshotsResponse.setRequestId(_ctx.stringValue("ListSnapshotsResponse.RequestId"));
		listSnapshotsResponse.setTotalCount(_ctx.integerValue("ListSnapshotsResponse.TotalCount"));
		listSnapshotsResponse.setPageSize(_ctx.integerValue("ListSnapshotsResponse.PageSize"));
		listSnapshotsResponse.setPageNumber(_ctx.integerValue("ListSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("ListSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setCreationTime(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setSourceDiskId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSnapshotName(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setProgress(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setRemark(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Remark"));
			snapshot.setSnapshotId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSourceDiskType(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshot.setRegionId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			snapshot.setInstanceId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setRollbackTime(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].RollbackTime"));
			snapshot.setResourceGroupId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListSnapshotsResponse.Snapshots["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			snapshot.setTags(tags);

			snapshots.add(snapshot);
		}
		listSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return listSnapshotsResponse;
	}
}