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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeBlockVolumeSnapshotsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeBlockVolumeSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlockVolumeSnapshotsResponseUnmarshaller {

	public static DescribeBlockVolumeSnapshotsResponse unmarshall(DescribeBlockVolumeSnapshotsResponse describeBlockVolumeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeBlockVolumeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeBlockVolumeSnapshotsResponse.RequestId"));
		describeBlockVolumeSnapshotsResponse.setSuccess(_ctx.booleanValue("DescribeBlockVolumeSnapshotsResponse.Success"));
		describeBlockVolumeSnapshotsResponse.setCode(_ctx.stringValue("DescribeBlockVolumeSnapshotsResponse.Code"));
		describeBlockVolumeSnapshotsResponse.setMessage(_ctx.stringValue("DescribeBlockVolumeSnapshotsResponse.Message"));
		describeBlockVolumeSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeBlockVolumeSnapshotsResponse.TotalCount"));
		describeBlockVolumeSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeBlockVolumeSnapshotsResponse.PageNumber"));
		describeBlockVolumeSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeBlockVolumeSnapshotsResponse.PageSize"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBlockVolumeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setSnapshotName(_ctx.stringValue("DescribeBlockVolumeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setCreateTime(_ctx.longValue("DescribeBlockVolumeSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setSize(_ctx.longValue("DescribeBlockVolumeSnapshotsResponse.Snapshots["+ i +"].Size"));

			snapshots.add(snapshot);
		}
		describeBlockVolumeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeBlockVolumeSnapshotsResponse;
	}
}