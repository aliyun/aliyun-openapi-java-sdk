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

import com.aliyuncs.nas.model.v20170626.CPFSDescribeFileSystemsResponse;
import com.aliyuncs.nas.model.v20170626.CPFSDescribeFileSystemsResponse.FileSystem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CPFSDescribeFileSystemsResponseUnmarshaller {

	public static CPFSDescribeFileSystemsResponse unmarshall(CPFSDescribeFileSystemsResponse cPFSDescribeFileSystemsResponse, UnmarshallerContext context) {
		
		cPFSDescribeFileSystemsResponse.setRequestId(context.stringValue("CPFSDescribeFileSystemsResponse.RequestId"));
		cPFSDescribeFileSystemsResponse.setTotalCount(context.integerValue("CPFSDescribeFileSystemsResponse.TotalCount"));
		cPFSDescribeFileSystemsResponse.setPageSize(context.integerValue("CPFSDescribeFileSystemsResponse.PageSize"));
		cPFSDescribeFileSystemsResponse.setPageNumber(context.integerValue("CPFSDescribeFileSystemsResponse.PageNumber"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < context.lengthValue("CPFSDescribeFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setFsId(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].fsId"));
			fileSystem.setFsDesc(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].fsDesc"));
			fileSystem.setFsSpec(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].fsSpec"));
			fileSystem.setBandwidth(context.longValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].bandwidth"));
			fileSystem.setCapacity(context.longValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].capacity"));
			fileSystem.setMeteredSize(context.longValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].meteredSize"));
			fileSystem.setCreateTime(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].createTime"));
			fileSystem.setNetworkType(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].networkType"));
			fileSystem.setMountTargets(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].mountTargets"));
			fileSystem.setRegionId(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].regionId"));
			fileSystem.setZoneId(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].zoneId"));
			fileSystem.setVpcId(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].vpcId"));
			fileSystem.setVSwitchId(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].vSwitchId"));
			fileSystem.setStatus(context.stringValue("CPFSDescribeFileSystemsResponse.FileSystems["+ i +"].status"));

			fileSystems.add(fileSystem);
		}
		cPFSDescribeFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return cPFSDescribeFileSystemsResponse;
	}
}