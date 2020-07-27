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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeSnapshotsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeSnapshotsResponse.RequestId"));
		describeSnapshotsResponse.setTotalCount(_ctx.integerValue("DescribeSnapshotsResponse.TotalCount"));
		describeSnapshotsResponse.setPageSize(_ctx.integerValue("DescribeSnapshotsResponse.PageSize"));
		describeSnapshotsResponse.setPageNumber(_ctx.integerValue("DescribeSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setCreateTime(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setDescription(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setProgress(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setRemainTime(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RemainTime"));
			snapshot.setRetentionDays(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RetentionDays"));
			snapshot.setSnapshotId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setSourceFileSystemId(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceFileSystemId"));
			snapshot.setSourceFileSystemSize(_ctx.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceFileSystemSize"));
			snapshot.setStatus(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setEncryptType(_ctx.integerValue("DescribeSnapshotsResponse.Snapshots["+ i +"].EncryptType"));
			snapshot.setSourceFileSystemVersion(_ctx.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SourceFileSystemVersion"));

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}