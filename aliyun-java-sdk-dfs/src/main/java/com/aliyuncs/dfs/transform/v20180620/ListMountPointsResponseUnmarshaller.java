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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.ListMountPointsResponse;
import com.aliyuncs.dfs.model.v20180620.ListMountPointsResponse.MountPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMountPointsResponseUnmarshaller {

	public static ListMountPointsResponse unmarshall(ListMountPointsResponse listMountPointsResponse, UnmarshallerContext _ctx) {
		
		listMountPointsResponse.setRequestId(_ctx.stringValue("ListMountPointsResponse.RequestId"));
		listMountPointsResponse.setTotalCount(_ctx.integerValue("ListMountPointsResponse.TotalCount"));
		listMountPointsResponse.setNextToken(_ctx.stringValue("ListMountPointsResponse.NextToken"));

		List<MountPoint> mountPoints = new ArrayList<MountPoint>();
		for (int i = 0; i < _ctx.lengthValue("ListMountPointsResponse.MountPoints.Length"); i++) {
			MountPoint mountPoint = new MountPoint();
			mountPoint.setStatus(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].Status"));
			mountPoint.setVpcId(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].VpcId"));
			mountPoint.setFileSystemId(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].FileSystemId"));
			mountPoint.setVSwitchId(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].VSwitchId"));
			mountPoint.setMountPointId(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].MountPointId"));
			mountPoint.setDescription(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].Description"));
			mountPoint.setAccessGroupId(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].AccessGroupId"));
			mountPoint.setCreateTime(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].CreateTime"));
			mountPoint.setNetworkType(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].NetworkType"));
			mountPoint.setMountPointDomain(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].MountPointDomain"));
			mountPoint.setRegionId(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].RegionId"));
			mountPoint.setMountPointAlias(_ctx.stringValue("ListMountPointsResponse.MountPoints["+ i +"].MountPointAlias"));

			mountPoints.add(mountPoint);
		}
		listMountPointsResponse.setMountPoints(mountPoints);
	 
	 	return listMountPointsResponse;
	}
}