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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeNasFileSystemsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeNasFileSystemsResponse.FileSystem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNasFileSystemsResponseUnmarshaller {

	public static DescribeNasFileSystemsResponse unmarshall(DescribeNasFileSystemsResponse describeNasFileSystemsResponse, UnmarshallerContext _ctx) {
		
		describeNasFileSystemsResponse.setRequestId(_ctx.stringValue("DescribeNasFileSystemsResponse.RequestId"));
		describeNasFileSystemsResponse.setSuccess(_ctx.booleanValue("DescribeNasFileSystemsResponse.Success"));
		describeNasFileSystemsResponse.setCode(_ctx.stringValue("DescribeNasFileSystemsResponse.Code"));
		describeNasFileSystemsResponse.setMessage(_ctx.stringValue("DescribeNasFileSystemsResponse.Message"));
		describeNasFileSystemsResponse.setTotalCount(_ctx.longValue("DescribeNasFileSystemsResponse.TotalCount"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNasFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setCreateTime(_ctx.longValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].CreateTime"));
			fileSystem.setProtocolType(_ctx.stringValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].ProtocolType"));
			fileSystem.setMountTargetCount(_ctx.integerValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].MountTargetCount"));
			fileSystem.setStorageType(_ctx.stringValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].StorageType"));
			fileSystem.setFileSystemId(_ctx.stringValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystem.setMeteredSize(_ctx.longValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].MeteredSize"));
			fileSystem.setFileSystemDesc(_ctx.stringValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].FileSystemDesc"));
			fileSystem.setZoneId(_ctx.stringValue("DescribeNasFileSystemsResponse.FileSystems["+ i +"].ZoneId"));

			fileSystems.add(fileSystem);
		}
		describeNasFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return describeNasFileSystemsResponse;
	}
}