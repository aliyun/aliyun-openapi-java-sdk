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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.ListSnapshotResponse;
import com.aliyuncs.dbfs.model.v20200418.ListSnapshotResponse.SnapshotsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSnapshotResponseUnmarshaller {

	public static ListSnapshotResponse unmarshall(ListSnapshotResponse listSnapshotResponse, UnmarshallerContext _ctx) {
		
		listSnapshotResponse.setRequestId(_ctx.stringValue("ListSnapshotResponse.RequestId"));
		listSnapshotResponse.setTotalCount(_ctx.integerValue("ListSnapshotResponse.TotalCount"));
		listSnapshotResponse.setPageSize(_ctx.integerValue("ListSnapshotResponse.PageSize"));
		listSnapshotResponse.setPageNumber(_ctx.integerValue("ListSnapshotResponse.PageNumber"));

		List<SnapshotsItem> snapshots = new ArrayList<SnapshotsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSnapshotResponse.Snapshots.Length"); i++) {
			SnapshotsItem snapshotsItem = new SnapshotsItem();
			snapshotsItem.setStatus(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].Status"));
			snapshotsItem.setCreationTime(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].CreationTime"));
			snapshotsItem.setProgress(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].Progress"));
			snapshotsItem.setSourceFsSize(_ctx.integerValue("ListSnapshotResponse.Snapshots["+ i +"].SourceFsSize"));
			snapshotsItem.setRetentionDays(_ctx.integerValue("ListSnapshotResponse.Snapshots["+ i +"].RetentionDays"));
			snapshotsItem.setRemainTime(_ctx.integerValue("ListSnapshotResponse.Snapshots["+ i +"].RemainTime"));
			snapshotsItem.setLastModifiedTime(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].LastModifiedTime"));
			snapshotsItem.setSnapshotType(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].SnapshotType"));
			snapshotsItem.setSnapshotName(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].SnapshotName"));
			snapshotsItem.setDescription(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].Description"));
			snapshotsItem.setSourceFsId(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].SourceFsId"));
			snapshotsItem.setSnapshotId(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].SnapshotId"));
			snapshotsItem.setCategory(_ctx.stringValue("ListSnapshotResponse.Snapshots["+ i +"].Category"));
			snapshotsItem.setSourceFsStripeWidth(_ctx.integerValue("ListSnapshotResponse.Snapshots["+ i +"].SourceFsStripeWidth"));

			snapshots.add(snapshotsItem);
		}
		listSnapshotResponse.setSnapshots(snapshots);
	 
	 	return listSnapshotResponse;
	}
}