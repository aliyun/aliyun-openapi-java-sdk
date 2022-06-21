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

import com.aliyuncs.swas.model.v20170810.GetDiskSnapshotsResponse;
import com.aliyuncs.swas.model.v20170810.GetDiskSnapshotsResponse.DiskSnapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiskSnapshotsResponseUnmarshaller {

	public static GetDiskSnapshotsResponse unmarshall(GetDiskSnapshotsResponse getDiskSnapshotsResponse, UnmarshallerContext _ctx) {
		
		getDiskSnapshotsResponse.setRequestId(_ctx.stringValue("GetDiskSnapshotsResponse.RequestId"));
		getDiskSnapshotsResponse.setIsSuccess(_ctx.booleanValue("GetDiskSnapshotsResponse.IsSuccess"));
		getDiskSnapshotsResponse.setPageSize(_ctx.integerValue("GetDiskSnapshotsResponse.PageSize"));
		getDiskSnapshotsResponse.setPageNumber(_ctx.integerValue("GetDiskSnapshotsResponse.PageNumber"));
		getDiskSnapshotsResponse.setTotalCount(_ctx.integerValue("GetDiskSnapshotsResponse.TotalCount"));
		getDiskSnapshotsResponse.setCode(_ctx.stringValue("GetDiskSnapshotsResponse.Code"));

		List<DiskSnapshot> diskSnapshots = new ArrayList<DiskSnapshot>();
		for (int i = 0; i < _ctx.lengthValue("GetDiskSnapshotsResponse.DiskSnapshots.Length"); i++) {
			DiskSnapshot diskSnapshot = new DiskSnapshot();
			diskSnapshot.setStatus(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].Status"));
			diskSnapshot.setCreationTime(_ctx.longValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].CreationTime"));
			diskSnapshot.setProgress(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].Progress"));
			diskSnapshot.setRemark(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].Remark"));
			diskSnapshot.setSourceDiskName(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].SourceDiskName"));
			diskSnapshot.setSourceDiskSize(_ctx.integerValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].SourceDiskSize"));
			diskSnapshot.setRegionId(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].RegionId"));
			diskSnapshot.setSourceDiskId(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].SourceDiskId"));
			diskSnapshot.setRollBackTime(_ctx.longValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].RollBackTime"));
			diskSnapshot.setSnapshotName(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].SnapshotName"));
			diskSnapshot.setResourceType(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].ResourceType"));
			diskSnapshot.setSnapshotId(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].SnapshotId"));
			diskSnapshot.setZoneId(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].ZoneId"));
			diskSnapshot.setSourceDiskRemark(_ctx.stringValue("GetDiskSnapshotsResponse.DiskSnapshots["+ i +"].SourceDiskRemark"));

			diskSnapshots.add(diskSnapshot);
		}
		getDiskSnapshotsResponse.setDiskSnapshots(diskSnapshots);
	 
	 	return getDiskSnapshotsResponse;
	}
}