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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeNASFileSystemsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeNASFileSystemsResponse.FileSystem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNASFileSystemsResponseUnmarshaller {

	public static DescribeNASFileSystemsResponse unmarshall(DescribeNASFileSystemsResponse describeNASFileSystemsResponse, UnmarshallerContext _ctx) {
		
		describeNASFileSystemsResponse.setRequestId(_ctx.stringValue("DescribeNASFileSystemsResponse.RequestId"));
		describeNASFileSystemsResponse.setNextToken(_ctx.stringValue("DescribeNASFileSystemsResponse.NextToken"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNASFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setCapacity(_ctx.longValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].Capacity"));
			fileSystem.setMountTargetStatus(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].MountTargetStatus"));
			fileSystem.setCreateTime(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].CreateTime"));
			fileSystem.setOfficeSiteId(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].OfficeSiteId"));
			fileSystem.setSupportAcl(_ctx.booleanValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].SupportAcl"));
			fileSystem.setStorageType(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].StorageType"));
			fileSystem.setOfficeSiteName(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].OfficeSiteName"));
			fileSystem.setRegionId(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].RegionId"));
			fileSystem.setFileSystemId(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystem.setFileSystemType(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].FileSystemType"));
			fileSystem.setFileSystemName(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].FileSystemName"));
			fileSystem.setMeteredSize(_ctx.longValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].MeteredSize"));
			fileSystem.setMountTargetDomain(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].MountTargetDomain"));
			fileSystem.setDescription(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].Description"));
			fileSystem.setZoneId(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].ZoneId"));
			fileSystem.setFileSystemStatus(_ctx.stringValue("DescribeNASFileSystemsResponse.FileSystems["+ i +"].FileSystemStatus"));

			fileSystems.add(fileSystem);
		}
		describeNASFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return describeNASFileSystemsResponse;
	}
}