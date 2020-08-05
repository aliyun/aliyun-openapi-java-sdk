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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSnapshotsResponseUnmarshaller {

	public static ListSnapshotsResponse unmarshall(ListSnapshotsResponse listSnapshotsResponse, UnmarshallerContext _ctx) {
		
		listSnapshotsResponse.setRequestId(_ctx.stringValue("ListSnapshotsResponse.RequestId"));
		listSnapshotsResponse.setPageNumber(_ctx.integerValue("ListSnapshotsResponse.PageNumber"));
		listSnapshotsResponse.setPageSize(_ctx.integerValue("ListSnapshotsResponse.PageSize"));
		listSnapshotsResponse.setTotalCount(_ctx.integerValue("ListSnapshotsResponse.TotalCount"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("ListSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setRegionId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			snapshot.setSnapshotId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSnapshotName(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setRemark(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Remark"));
			snapshot.setCreationTime(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshot.setProgress(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setStatus(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setSourceDiskId(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSourceDiskType(_ctx.stringValue("ListSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));

			snapshots.add(snapshot);
		}
		listSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return listSnapshotsResponse;
	}
}