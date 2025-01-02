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

package com.aliyuncs.dfs.transform.v20180620;

import com.aliyuncs.dfs.model.v20180620.GetMountPointResponse;
import com.aliyuncs.dfs.model.v20180620.GetMountPointResponse.MountPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMountPointResponseUnmarshaller {

	public static GetMountPointResponse unmarshall(GetMountPointResponse getMountPointResponse, UnmarshallerContext _ctx) {
		
		getMountPointResponse.setRequestId(_ctx.stringValue("GetMountPointResponse.RequestId"));

		MountPoint mountPoint = new MountPoint();
		mountPoint.setStatus(_ctx.stringValue("GetMountPointResponse.MountPoint.Status"));
		mountPoint.setVpcId(_ctx.stringValue("GetMountPointResponse.MountPoint.VpcId"));
		mountPoint.setFileSystemId(_ctx.stringValue("GetMountPointResponse.MountPoint.FileSystemId"));
		mountPoint.setVSwitchId(_ctx.stringValue("GetMountPointResponse.MountPoint.VSwitchId"));
		mountPoint.setMountPointId(_ctx.stringValue("GetMountPointResponse.MountPoint.MountPointId"));
		mountPoint.setDescription(_ctx.stringValue("GetMountPointResponse.MountPoint.Description"));
		mountPoint.setAccessGroupId(_ctx.stringValue("GetMountPointResponse.MountPoint.AccessGroupId"));
		mountPoint.setCreateTime(_ctx.stringValue("GetMountPointResponse.MountPoint.CreateTime"));
		mountPoint.setNetworkType(_ctx.stringValue("GetMountPointResponse.MountPoint.NetworkType"));
		mountPoint.setMountPointDomain(_ctx.stringValue("GetMountPointResponse.MountPoint.MountPointDomain"));
		mountPoint.setRegionId(_ctx.stringValue("GetMountPointResponse.MountPoint.RegionId"));
		mountPoint.setMountPointAlias(_ctx.stringValue("GetMountPointResponse.MountPoint.MountPointAlias"));
		getMountPointResponse.setMountPoint(mountPoint);
	 
	 	return getMountPointResponse;
	}
}