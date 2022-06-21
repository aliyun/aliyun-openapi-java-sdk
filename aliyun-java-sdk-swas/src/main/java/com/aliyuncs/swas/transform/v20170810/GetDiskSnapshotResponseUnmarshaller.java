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

import com.aliyuncs.swas.model.v20170810.GetDiskSnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiskSnapshotResponseUnmarshaller {

	public static GetDiskSnapshotResponse unmarshall(GetDiskSnapshotResponse getDiskSnapshotResponse, UnmarshallerContext _ctx) {
		
		getDiskSnapshotResponse.setRequestId(_ctx.stringValue("GetDiskSnapshotResponse.RequestId"));
		getDiskSnapshotResponse.setStatus(_ctx.stringValue("GetDiskSnapshotResponse.Status"));
		getDiskSnapshotResponse.setIsSuccess(_ctx.booleanValue("GetDiskSnapshotResponse.IsSuccess"));
		getDiskSnapshotResponse.setRollBackTime(_ctx.longValue("GetDiskSnapshotResponse.RollBackTime"));
		getDiskSnapshotResponse.setProgress(_ctx.stringValue("GetDiskSnapshotResponse.Progress"));
		getDiskSnapshotResponse.setZoneId(_ctx.stringValue("GetDiskSnapshotResponse.ZoneId"));
		getDiskSnapshotResponse.setSourceDiskName(_ctx.stringValue("GetDiskSnapshotResponse.SourceDiskName"));
		getDiskSnapshotResponse.setResourceType(_ctx.stringValue("GetDiskSnapshotResponse.ResourceType"));
		getDiskSnapshotResponse.setSnapshotName(_ctx.stringValue("GetDiskSnapshotResponse.SnapshotName"));
		getDiskSnapshotResponse.setCode(_ctx.stringValue("GetDiskSnapshotResponse.Code"));
		getDiskSnapshotResponse.setSourceDiskId(_ctx.stringValue("GetDiskSnapshotResponse.SourceDiskId"));
		getDiskSnapshotResponse.setSourceDiskRemark(_ctx.stringValue("GetDiskSnapshotResponse.SourceDiskRemark"));
		getDiskSnapshotResponse.setRemark(_ctx.stringValue("GetDiskSnapshotResponse.Remark"));
		getDiskSnapshotResponse.setSnapshotId(_ctx.stringValue("GetDiskSnapshotResponse.SnapshotId"));
		getDiskSnapshotResponse.setSourceDiskSize(_ctx.integerValue("GetDiskSnapshotResponse.SourceDiskSize"));
		getDiskSnapshotResponse.setCreationTime(_ctx.longValue("GetDiskSnapshotResponse.CreationTime"));
		getDiskSnapshotResponse.setRegionId(_ctx.stringValue("GetDiskSnapshotResponse.RegionId"));
	 
	 	return getDiskSnapshotResponse;
	}
}