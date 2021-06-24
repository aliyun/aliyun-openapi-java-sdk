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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMountedSnapshotsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMountedSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeMountedSnapshotsResponseUnmarshaller {

	public static OpsDescribeMountedSnapshotsResponse unmarshall(OpsDescribeMountedSnapshotsResponse opsDescribeMountedSnapshotsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeMountedSnapshotsResponse.setRequestId(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.RequestId"));
		opsDescribeMountedSnapshotsResponse.setTotalCount(_ctx.integerValue("OpsDescribeMountedSnapshotsResponse.TotalCount"));
		opsDescribeMountedSnapshotsResponse.setPageSize(_ctx.integerValue("OpsDescribeMountedSnapshotsResponse.PageSize"));
		opsDescribeMountedSnapshotsResponse.setPageNumber(_ctx.integerValue("OpsDescribeMountedSnapshotsResponse.PageNumber"));

		List<Snapshot> mountedSnapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots["+ i +"].Status"));
			snapshot.setResourceOwnerId(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots["+ i +"].ResourceOwnerId"));
			snapshot.setSnapshotId(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots["+ i +"].SnapshotId"));
			snapshot.setLastAttachedTime(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots["+ i +"].LastAttachedTime"));
			snapshot.setDevice(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots["+ i +"].Device"));
			snapshot.setInstanceId(_ctx.stringValue("OpsDescribeMountedSnapshotsResponse.MountedSnapshots["+ i +"].InstanceId"));

			mountedSnapshots.add(snapshot);
		}
		opsDescribeMountedSnapshotsResponse.setMountedSnapshots(mountedSnapshots);
	 
	 	return opsDescribeMountedSnapshotsResponse;
	}
}