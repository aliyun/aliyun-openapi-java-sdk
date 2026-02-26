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

import com.aliyuncs.dfs.model.v20180620.GetFileSystemResponse;
import com.aliyuncs.dfs.model.v20180620.GetFileSystemResponse.FileSystem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileSystemResponseUnmarshaller {

	public static GetFileSystemResponse unmarshall(GetFileSystemResponse getFileSystemResponse, UnmarshallerContext _ctx) {
		
		getFileSystemResponse.setRequestId(_ctx.stringValue("GetFileSystemResponse.RequestId"));

		FileSystem fileSystem = new FileSystem();
		fileSystem.setCreateTime(_ctx.stringValue("GetFileSystemResponse.FileSystem.CreateTime"));
		fileSystem.setProvisionedThroughputInMiBps(_ctx.longValue("GetFileSystemResponse.FileSystem.ProvisionedThroughputInMiBps"));
		fileSystem.setSpaceCapacity(_ctx.longValue("GetFileSystemResponse.FileSystem.SpaceCapacity"));
		fileSystem.setStorageType(_ctx.stringValue("GetFileSystemResponse.FileSystem.StorageType"));
		fileSystem.setUsedSpaceSize(_ctx.floatValue("GetFileSystemResponse.FileSystem.UsedSpaceSize"));
		fileSystem.setRegionId(_ctx.stringValue("GetFileSystemResponse.FileSystem.RegionId"));
		fileSystem.setFileSystemId(_ctx.stringValue("GetFileSystemResponse.FileSystem.FileSystemId"));
		fileSystem.setFileSystemName(_ctx.stringValue("GetFileSystemResponse.FileSystem.FileSystemName"));
		fileSystem.setDescription(_ctx.stringValue("GetFileSystemResponse.FileSystem.Description"));
		fileSystem.setMountPointCount(_ctx.longValue("GetFileSystemResponse.FileSystem.MountPointCount"));
		fileSystem.setThroughputMode(_ctx.stringValue("GetFileSystemResponse.FileSystem.ThroughputMode"));
		fileSystem.setZoneId(_ctx.stringValue("GetFileSystemResponse.FileSystem.ZoneId"));
		fileSystem.setNumberOfFiles(_ctx.longValue("GetFileSystemResponse.FileSystem.NumberOfFiles"));
		fileSystem.setStoragePackageId(_ctx.stringValue("GetFileSystemResponse.FileSystem.StoragePackageId"));
		fileSystem.setNumberOfDirectories(_ctx.longValue("GetFileSystemResponse.FileSystem.NumberOfDirectories"));
		fileSystem.setProtocolType(_ctx.stringValue("GetFileSystemResponse.FileSystem.ProtocolType"));
		fileSystem.setVersion(_ctx.stringValue("GetFileSystemResponse.FileSystem.Version"));
		fileSystem.setMeteringSpaceSize(_ctx.floatValue("GetFileSystemResponse.FileSystem.MeteringSpaceSize"));
		getFileSystemResponse.setFileSystem(fileSystem);
	 
	 	return getFileSystemResponse;
	}
}