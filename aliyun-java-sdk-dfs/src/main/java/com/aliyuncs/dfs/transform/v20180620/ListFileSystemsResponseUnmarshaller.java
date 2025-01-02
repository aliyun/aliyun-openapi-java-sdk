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

import com.aliyuncs.dfs.model.v20180620.ListFileSystemsResponse;
import com.aliyuncs.dfs.model.v20180620.ListFileSystemsResponse.FileSystem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFileSystemsResponseUnmarshaller {

	public static ListFileSystemsResponse unmarshall(ListFileSystemsResponse listFileSystemsResponse, UnmarshallerContext _ctx) {
		
		listFileSystemsResponse.setRequestId(_ctx.stringValue("ListFileSystemsResponse.RequestId"));
		listFileSystemsResponse.setTotalCount(_ctx.integerValue("ListFileSystemsResponse.TotalCount"));
		listFileSystemsResponse.setNextToken(_ctx.stringValue("ListFileSystemsResponse.NextToken"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < _ctx.lengthValue("ListFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setCreateTime(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].CreateTime"));
			fileSystem.setProvisionedThroughputInMiBps(_ctx.longValue("ListFileSystemsResponse.FileSystems["+ i +"].ProvisionedThroughputInMiBps"));
			fileSystem.setSpaceCapacity(_ctx.longValue("ListFileSystemsResponse.FileSystems["+ i +"].SpaceCapacity"));
			fileSystem.setStorageType(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].StorageType"));
			fileSystem.setUsedSpaceSize(_ctx.floatValue("ListFileSystemsResponse.FileSystems["+ i +"].UsedSpaceSize"));
			fileSystem.setRegionId(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].RegionId"));
			fileSystem.setFileSystemId(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystem.setFileSystemName(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].FileSystemName"));
			fileSystem.setDescription(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].Description"));
			fileSystem.setMountPointCount(_ctx.longValue("ListFileSystemsResponse.FileSystems["+ i +"].MountPointCount"));
			fileSystem.setThroughputMode(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].ThroughputMode"));
			fileSystem.setZoneId(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].ZoneId"));
			fileSystem.setNumberOfFiles(_ctx.longValue("ListFileSystemsResponse.FileSystems["+ i +"].NumberOfFiles"));
			fileSystem.setStoragePackageId(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].StoragePackageId"));
			fileSystem.setNumberOfDirectories(_ctx.longValue("ListFileSystemsResponse.FileSystems["+ i +"].NumberOfDirectories"));
			fileSystem.setProtocolType(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].ProtocolType"));
			fileSystem.setVersion(_ctx.stringValue("ListFileSystemsResponse.FileSystems["+ i +"].Version"));
			fileSystem.setMeteringSpaceSize(_ctx.floatValue("ListFileSystemsResponse.FileSystems["+ i +"].MeteringSpaceSize"));

			fileSystems.add(fileSystem);
		}
		listFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return listFileSystemsResponse;
	}
}