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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetSnapshotsResponse;
import com.aliyuncs.swas.model.v20170810.GetSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSnapshotsResponseUnmarshaller {

	public static GetSnapshotsResponse unmarshall(GetSnapshotsResponse getSnapshotsResponse, UnmarshallerContext _ctx) {
		
		getSnapshotsResponse.setRequestId(_ctx.stringValue("GetSnapshotsResponse.RequestId"));
		getSnapshotsResponse.setIsSuccess(_ctx.booleanValue("GetSnapshotsResponse.IsSuccess"));
		getSnapshotsResponse.setCode(_ctx.stringValue("GetSnapshotsResponse.Code"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("GetSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setStatus(_ctx.stringValue("GetSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setRollBackTime(_ctx.longValue("GetSnapshotsResponse.Snapshots["+ i +"].RollBackTime"));
			snapshot.setProgress(_ctx.stringValue("GetSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setRemark(_ctx.stringValue("GetSnapshotsResponse.Snapshots["+ i +"].Remark"));
			snapshot.setCreateTime(_ctx.longValue("GetSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setName(_ctx.stringValue("GetSnapshotsResponse.Snapshots["+ i +"].Name"));
			snapshot.setSnapshotsUid(_ctx.stringValue("GetSnapshotsResponse.Snapshots["+ i +"].SnapshotsUid"));

			snapshots.add(snapshot);
		}
		getSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return getSnapshotsResponse;
	}
}