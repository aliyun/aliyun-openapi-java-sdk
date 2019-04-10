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

	public static ListFileSystemWithMountTargetsResponse unmarshall(ListFileSystemWithMountTargetsResponse listFileSystemWithMountTargetsResponse, UnmarshallerContext context) {
		
		listFileSystemWithMountTargetsResponse.setRequestId(context.stringValue("ListFileSystemWithMountTargetsResponse.RequestId"));
		listFileSystemWithMountTargetsResponse.setTotalCount(context.integerValue("ListFileSystemWithMountTargetsResponse.TotalCount"));
		listFileSystemWithMountTargetsResponse.setPageNumber(context.integerValue("ListFileSystemWithMountTargetsResponse.PageNumber"));
		listFileSystemWithMountTargetsResponse.setPageSize(context.integerValue("ListFileSystemWithMountTargetsResponse.PageSize"));

		List<FileSystems> fileSystemList = new ArrayList<FileSystems>();
		for (int i = 0; i < context.lengthValue("ListFileSystemWithMountTargetsResponse.FileSystemList.Length"); i++) {
			FileSystems fileSystems = new FileSystems();
			fileSystems.setRegionId(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].RegionId"));
			fileSystems.setFileSystemId(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].FileSystemId"));
			fileSystems.setProtocolType(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].ProtocolType"));
			fileSystems.setCreateTime(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].CreateTime"));
			fileSystems.setDestription(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].Destription"));
			fileSystems.setStorageType(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].StorageType"));
			fileSystems.setMeteredSize(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MeteredSize"));

			List<Packages> packageList = new ArrayList<Packages>();
			for (int j = 0; j < context.lengthValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].PackageList.Length"); j++) {
				Packages packages = new Packages();
				packages.setPackageId(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].PackageList["+ j +"].PackageId"));

				packageList.add(packages);
			}
			fileSystems.setPackageList(packageList);

			List<MountTargets> mountTargetList = new ArrayList<MountTargets>();
			for (int j = 0; j < context.lengthValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList.Length"); j++) {
				MountTargets mountTargets = new MountTargets();
				mountTargets.setMountTargetDomain(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].MountTargetDomain"));
				mountTargets.setStatus(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].Status"));
				mountTargets.setNetworkType(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].NetworkType"));
				mountTargets.setVswId(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VswId"));
				mountTargets.setVpcId(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VpcId"));
				mountTargets.setAccessGroup(context.stringValue("ListFileSystemWithMountTargetsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].AccessGroup"));

				mountTargetList.add(mountTargets);
			}
			fileSystems.setMountTargetList(mountTargetList);

			fileSystemList.add(fileSystems);
		}
		listFileSystemWithMountTargetsResponse.setFileSystemList(fileSystemList);
	 
	 	return listFileSystemWithMountTargetsResponse;
	}
}