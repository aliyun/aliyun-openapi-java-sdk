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

import com.aliyuncs.ehpc.model.v20180412.ListCpfsFileSystemsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListCpfsFileSystemsResponse.FileSystems;
import com.aliyuncs.ehpc.model.v20180412.ListCpfsFileSystemsResponse.FileSystems.MountTargets;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCpfsFileSystemsResponseUnmarshaller {

	public static ListCpfsFileSystemsResponse unmarshall(ListCpfsFileSystemsResponse listCpfsFileSystemsResponse, UnmarshallerContext context) {
		
		listCpfsFileSystemsResponse.setRequestId(context.stringValue("ListCpfsFileSystemsResponse.RequestId"));
		listCpfsFileSystemsResponse.setTotalCount(context.integerValue("ListCpfsFileSystemsResponse.TotalCount"));
		listCpfsFileSystemsResponse.setPageNumber(context.integerValue("ListCpfsFileSystemsResponse.PageNumber"));
		listCpfsFileSystemsResponse.setPageSize(context.integerValue("ListCpfsFileSystemsResponse.PageSize"));

		List<FileSystems> fileSystemList = new ArrayList<FileSystems>();
		for (int i = 0; i < context.lengthValue("ListCpfsFileSystemsResponse.FileSystemList.Length"); i++) {
			FileSystems fileSystems = new FileSystems();
			fileSystems.setRegionId(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].RegionId"));
			fileSystems.setZoneId(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].ZoneId"));
			fileSystems.setFileSystemId(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].FileSystemId"));
			fileSystems.setCreateTime(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].CreateTime"));
			fileSystems.setDestription(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].Destription"));
			fileSystems.setProtocolType(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].ProtocolType"));
			fileSystems.setCapacity(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].Capacity"));

			List<MountTargets> mountTargetList = new ArrayList<MountTargets>();
			for (int j = 0; j < context.lengthValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList.Length"); j++) {
				MountTargets mountTargets = new MountTargets();
				mountTargets.setMountTargetDomain(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].MountTargetDomain"));
				mountTargets.setStatus(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].Status"));
				mountTargets.setNetworkType(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].NetworkType"));
				mountTargets.setVswId(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VswId"));
				mountTargets.setVpcId(context.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VpcId"));

				mountTargetList.add(mountTargets);
			}
			fileSystems.setMountTargetList(mountTargetList);

			fileSystemList.add(fileSystems);
		}
		listCpfsFileSystemsResponse.setFileSystemList(fileSystemList);
	 
	 	return listCpfsFileSystemsResponse;
	}
}