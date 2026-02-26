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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeSnapshotsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSnapshotsResponse.SnapshotsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotsResponse.PageNumber"));
		describeSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageSize"));
		describeSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.TotalCount"));

		List<SnapshotsItem> snapshots = new ArrayList<SnapshotsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			SnapshotsItem snapshotsItem = new SnapshotsItem();
			snapshotsItem.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshotsItem.setCreationTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreationTime"));
			snapshotsItem.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshotsItem.setSize(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Size"));
			snapshotsItem.setSourceDiskId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshotsItem.setSourceDiskType(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshotsItem.setSourceDiskCategory(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskCategory"));
			snapshotsItem.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshotsItem.setDescription(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshotsItem.setEnsRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].EnsRegionId"));
			snapshotsItem.setSourceSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceSnapshotId"));
			snapshotsItem.setSourceEnsRegionId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceEnsRegionId"));

			snapshots.add(snapshotsItem);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}