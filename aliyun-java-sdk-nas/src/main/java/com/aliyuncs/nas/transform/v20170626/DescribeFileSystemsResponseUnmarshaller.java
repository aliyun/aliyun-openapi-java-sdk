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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem.MountTarget;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileSystemsResponseUnmarshaller {

	public static DescribeFileSystemsResponse unmarshall(DescribeFileSystemsResponse describeFileSystemsResponse, UnmarshallerContext context) {
		
		describeFileSystemsResponse.setRequestId(context.stringValue("DescribeFileSystemsResponse.RequestId"));
		describeFileSystemsResponse.setTotalCount(context.integerValue("DescribeFileSystemsResponse.TotalCount"));
		describeFileSystemsResponse.setPageSize(context.integerValue("DescribeFileSystemsResponse.PageSize"));
		describeFileSystemsResponse.setPageNumber(context.integerValue("DescribeFileSystemsResponse.PageNumber"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < context.lengthValue("DescribeFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setFileSystemId(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystem.setDescription(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Description"));
			fileSystem.setCreateTime(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].CreateTime"));
			fileSystem.setRegionId(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].RegionId"));
			fileSystem.setProtocolType(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ProtocolType"));
			fileSystem.setStorageType(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].StorageType"));
			fileSystem.setMeteredSize(context.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MeteredSize"));
			fileSystem.setZoneId(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ZoneId"));
			fileSystem.setBandwidth(context.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Bandwidth"));
			fileSystem.setCapacity(context.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Capacity"));
			fileSystem.setDestription(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Destription"));

			List<MountTarget> mountTargets = new ArrayList<MountTarget>();
			for (int j = 0; j < context.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets.Length"); j++) {
				MountTarget mountTarget = new MountTarget();
				mountTarget.setMountTargetDomain(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].MountTargetDomain"));
				mountTarget.setNetworkType(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].NetworkType"));
				mountTarget.setVpcId(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].VpcId"));
				mountTarget.setVswId(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].VswId"));
				mountTarget.setAccessGroupName(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].AccessGroupName"));
				mountTarget.setStatus(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].Status"));

				mountTargets.add(mountTarget);
			}
			fileSystem.setMountTargets(mountTargets);

			List<_Package> packages = new ArrayList<_Package>();
			for (int j = 0; j < context.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages.Length"); j++) {
				_Package _package = new _Package();
				_package.setPackageId(context.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages["+ j +"].PackageId"));

				packages.add(_package);
			}
			fileSystem.setPackages(packages);

			fileSystems.add(fileSystem);
		}
		describeFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return describeFileSystemsResponse;
	}
}