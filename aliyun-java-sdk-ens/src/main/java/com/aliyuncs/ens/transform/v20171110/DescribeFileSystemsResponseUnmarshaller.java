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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeFileSystemsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeFileSystemsResponse.FileSystemsItem;
import com.aliyuncs.ens.model.v20171110.DescribeFileSystemsResponse.FileSystemsItem.MountTargetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileSystemsResponseUnmarshaller {

	public static DescribeFileSystemsResponse unmarshall(DescribeFileSystemsResponse describeFileSystemsResponse, UnmarshallerContext _ctx) {
		
		describeFileSystemsResponse.setRequestId(_ctx.stringValue("DescribeFileSystemsResponse.RequestId"));
		describeFileSystemsResponse.setPageNumber(_ctx.integerValue("DescribeFileSystemsResponse.PageNumber"));
		describeFileSystemsResponse.setPageSize(_ctx.integerValue("DescribeFileSystemsResponse.PageSize"));
		describeFileSystemsResponse.setTotalCount(_ctx.integerValue("DescribeFileSystemsResponse.TotalCount"));

		List<FileSystemsItem> fileSystems = new ArrayList<FileSystemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystemsItem fileSystemsItem = new FileSystemsItem();
			fileSystemsItem.setFileSystemId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystemsItem.setFileSystemName(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].FileSystemName"));
			fileSystemsItem.setEnsRegionId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].EnsRegionId"));
			fileSystemsItem.setStorageType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].StorageType"));
			fileSystemsItem.setProtocolType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ProtocolType"));
			fileSystemsItem.setCapacity(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Capacity"));
			fileSystemsItem.setMeteredSize(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MeteredSize"));
			fileSystemsItem.setStatus(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Status"));
			fileSystemsItem.setPayType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].PayType"));
			fileSystemsItem.setCreationTime(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].CreationTime"));

			List<MountTargetsItem> mountTargets = new ArrayList<MountTargetsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets.Length"); j++) {
				MountTargetsItem mountTargetsItem = new MountTargetsItem();
				mountTargetsItem.setMountTargetDomain(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].MountTargetDomain"));
				mountTargetsItem.setMountTargetName(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].MountTargetName"));
				mountTargetsItem.setNetWorkId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].NetWorkId"));
				mountTargetsItem.setStatus(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].Status"));

				mountTargets.add(mountTargetsItem);
			}
			fileSystemsItem.setMountTargets(mountTargets);

			fileSystems.add(fileSystemsItem);
		}
		describeFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return describeFileSystemsResponse;
	}
}