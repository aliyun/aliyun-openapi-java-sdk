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

import com.aliyuncs.swas.model.v20170810.GetServerSnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerSnapshotResponseUnmarshaller {

	public static GetServerSnapshotResponse unmarshall(GetServerSnapshotResponse getServerSnapshotResponse, UnmarshallerContext _ctx) {
		
		getServerSnapshotResponse.setRequestId(_ctx.stringValue("GetServerSnapshotResponse.RequestId"));
		getServerSnapshotResponse.setStatus(_ctx.stringValue("GetServerSnapshotResponse.Status"));
		getServerSnapshotResponse.setIsSuccess(_ctx.booleanValue("GetServerSnapshotResponse.IsSuccess"));
		getServerSnapshotResponse.setRollBackTime(_ctx.longValue("GetServerSnapshotResponse.RollBackTime"));
		getServerSnapshotResponse.setProgress(_ctx.stringValue("GetServerSnapshotResponse.Progress"));
		getServerSnapshotResponse.setSourceServerName(_ctx.stringValue("GetServerSnapshotResponse.SourceServerName"));
		getServerSnapshotResponse.setZoneId(_ctx.stringValue("GetServerSnapshotResponse.ZoneId"));
		getServerSnapshotResponse.setSourceDiskName(_ctx.stringValue("GetServerSnapshotResponse.SourceDiskName"));
		getServerSnapshotResponse.setResourceType(_ctx.stringValue("GetServerSnapshotResponse.ResourceType"));
		getServerSnapshotResponse.setSnapshotName(_ctx.stringValue("GetServerSnapshotResponse.SnapshotName"));
		getServerSnapshotResponse.setCode(_ctx.stringValue("GetServerSnapshotResponse.Code"));
		getServerSnapshotResponse.setSourceDiskId(_ctx.stringValue("GetServerSnapshotResponse.SourceDiskId"));
		getServerSnapshotResponse.setSourceDiskRemark(_ctx.stringValue("GetServerSnapshotResponse.SourceDiskRemark"));
		getServerSnapshotResponse.setRemark(_ctx.stringValue("GetServerSnapshotResponse.Remark"));
		getServerSnapshotResponse.setSnapshotId(_ctx.stringValue("GetServerSnapshotResponse.SnapshotId"));
		getServerSnapshotResponse.setSourceServerUid(_ctx.stringValue("GetServerSnapshotResponse.SourceServerUid"));
		getServerSnapshotResponse.setSourceDiskSize(_ctx.integerValue("GetServerSnapshotResponse.SourceDiskSize"));
		getServerSnapshotResponse.setCreationTime(_ctx.longValue("GetServerSnapshotResponse.CreationTime"));
		getServerSnapshotResponse.setRegionId(_ctx.stringValue("GetServerSnapshotResponse.RegionId"));
	 
	 	return getServerSnapshotResponse;
	}
}