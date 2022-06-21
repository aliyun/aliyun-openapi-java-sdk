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

import com.aliyuncs.swas.model.v20170810.GetServerSnapshotsResponse;
import com.aliyuncs.swas.model.v20170810.GetServerSnapshotsResponse.ServerSnapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerSnapshotsResponseUnmarshaller {

	public static GetServerSnapshotsResponse unmarshall(GetServerSnapshotsResponse getServerSnapshotsResponse, UnmarshallerContext _ctx) {
		
		getServerSnapshotsResponse.setRequestId(_ctx.stringValue("GetServerSnapshotsResponse.RequestId"));
		getServerSnapshotsResponse.setIsSuccess(_ctx.booleanValue("GetServerSnapshotsResponse.IsSuccess"));
		getServerSnapshotsResponse.setPageSize(_ctx.integerValue("GetServerSnapshotsResponse.PageSize"));
		getServerSnapshotsResponse.setPageNumber(_ctx.integerValue("GetServerSnapshotsResponse.PageNumber"));
		getServerSnapshotsResponse.setTotalCount(_ctx.integerValue("GetServerSnapshotsResponse.TotalCount"));
		getServerSnapshotsResponse.setCode(_ctx.stringValue("GetServerSnapshotsResponse.Code"));

		List<ServerSnapshot> serverSnapshots = new ArrayList<ServerSnapshot>();
		for (int i = 0; i < _ctx.lengthValue("GetServerSnapshotsResponse.ServerSnapshots.Length"); i++) {
			ServerSnapshot serverSnapshot = new ServerSnapshot();
			serverSnapshot.setStatus(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].Status"));
			serverSnapshot.setCreationTime(_ctx.longValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].CreationTime"));
			serverSnapshot.setProgress(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].Progress"));
			serverSnapshot.setRemark(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].Remark"));
			serverSnapshot.setSourceDiskName(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SourceDiskName"));
			serverSnapshot.setSourceDiskSize(_ctx.integerValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SourceDiskSize"));
			serverSnapshot.setRegionId(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].RegionId"));
			serverSnapshot.setSourceDiskId(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SourceDiskId"));
			serverSnapshot.setRollBackTime(_ctx.longValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].RollBackTime"));
			serverSnapshot.setSourceServerName(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SourceServerName"));
			serverSnapshot.setSnapshotName(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SnapshotName"));
			serverSnapshot.setResourceType(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].ResourceType"));
			serverSnapshot.setSnapshotId(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SnapshotId"));
			serverSnapshot.setSourceServerUid(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SourceServerUid"));
			serverSnapshot.setZoneId(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].ZoneId"));
			serverSnapshot.setSourceDiskRemark(_ctx.stringValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SourceDiskRemark"));
			serverSnapshot.setSupportImage(_ctx.longValue("GetServerSnapshotsResponse.ServerSnapshots["+ i +"].SupportImage"));

			serverSnapshots.add(serverSnapshot);
		}
		getServerSnapshotsResponse.setServerSnapshots(serverSnapshots);
	 
	 	return getServerSnapshotsResponse;
	}
}