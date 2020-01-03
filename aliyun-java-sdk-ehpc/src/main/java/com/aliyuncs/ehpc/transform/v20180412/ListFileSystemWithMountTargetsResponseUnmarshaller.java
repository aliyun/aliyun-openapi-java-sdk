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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListFileSystemWithMountTargetsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListFileSystemWithMountTargetsResponse.FileSystems;
import com.aliyuncs.ehpc.model.v20180412.ListFileSystemWithMountTargetsResponse.FileSystems.MountTargets;
import com.aliyuncs.ehpc.model.v20180412.ListFileSystemWithMountTargetsResponse.FileSystems.Packages;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFileSystemWithMountTargetsResponseUnmarshaller {

	public static ListFileSystemWithMountTargetsResponse unmarshall(ListFileSystemWithMountTargetsResponse listFileSystemWithMountTargetsResponse, UnmarshallerContext _ctx) {
		
		listFileSystemWithMountTargetsResponse.setRequestId(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.RequestId"));
		listFileSystemWithMountTargetsResponse.setTotalCount(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.TotalCount"));
		listFileSystemWithMountTargetsResponse.setPageNumber(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.PageNumber"));
		listFileSystemWithMountTargetsResponse.setPageSize(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.PageSize"));

		List<FileSystems> fileSystemList = new ArrayList<FileSystems>();
		for (int i = 0; i < _ctx.lengthValue("ListFileSystemWithMountTargetsResponse.FileSystemList.Length"); i++) {
			FileSystems fileSystems = new FileSystems();
			fileSystems.setRegionId(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].RegionId"));
			fileSystems.setFileSystemId(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].FileSystemId"));
			fileSystems.setFileSystemType(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].FileSystemType"));
			fileSystems.setProtocolType(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].ProtocolType"));
			fileSystems.setCreateTime(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].CreateTime"));
			fileSystems.setDestription(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].Destription"));
			fileSystems.setStorageType(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].StorageType"));
			fileSystems.setMeteredSize(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MeteredSize"));
			fileSystems.setCapacity(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].Capacity"));
			fileSystems.setEncryptType(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].EncryptType"));
			fileSystems.setBandWidth(_ctx.integerValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].BandWidth"));
			fileSystems.setStatus(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].Status"));

			List<Packages> packageList = new ArrayList<Packages>();
			for (int j = 0; j < _ctx.lengthValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].PackageList.Length"); j++) {
				Packages packages = new Packages();
				packages.setPackageId(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].PackageList["+ j +"].PackageId"));

				packageList.add(packages);
			}
			fileSystems.setPackageList(packageList);

			List<MountTargets> mountTargetList = new ArrayList<MountTargets>();
			for (int j = 0; j < _ctx.lengthValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList.Length"); j++) {
				MountTargets mountTargets = new MountTargets();
				mountTargets.setMountTargetDomain(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].MountTargetDomain"));
				mountTargets.setStatus(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].Status"));
				mountTargets.setNetworkType(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].NetworkType"));
				mountTargets.setVswId(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VswId"));
				mountTargets.setVpcId(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VpcId"));
				mountTargets.setAccessGroup(_ctx.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].AccessGroup"));

				mountTargetList.add(mountTargets);
			}
			fileSystems.setMountTargetList(mountTargetList);

			fileSystemList.add(fileSystems);
		}
		listFileSystemWithMountTargetsResponse.setFileSystemList(fileSystemList);
	 
	 	return listFileSystemWithMountTargetsResponse;
	}
}