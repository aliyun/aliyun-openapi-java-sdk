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

import com.aliyuncs.nas.model.v20170626.CPFSCreateFileSystemResponse;
import com.aliyuncs.nas.model.v20170626.CPFSCreateFileSystemResponse.FileSystem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CPFSCreateFileSystemResponseUnmarshaller {

	public static CPFSCreateFileSystemResponse unmarshall(CPFSCreateFileSystemResponse cPFSCreateFileSystemResponse, UnmarshallerContext context) {
		
		cPFSCreateFileSystemResponse.setRequestId(context.stringValue("CPFSCreateFileSystemResponse.RequestId"));

		FileSystem fileSystem = new FileSystem();
		fileSystem.setFsId(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.fsId"));
		fileSystem.setFsDesc(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.fsDesc"));
		fileSystem.setFsSpec(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.fsSpec"));
		fileSystem.setBandwidth(context.longValue("CPFSCreateFileSystemResponse.FileSystem.bandwidth"));
		fileSystem.setCapacity(context.longValue("CPFSCreateFileSystemResponse.FileSystem.capacity"));
		fileSystem.setMeteredSize(context.longValue("CPFSCreateFileSystemResponse.FileSystem.meteredSize"));
		fileSystem.setCreateTime(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.createTime"));
		fileSystem.setNetworkType(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.networkType"));
		fileSystem.setMountTargets(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.mountTargets"));
		fileSystem.setRegionId(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.regionId"));
		fileSystem.setZoneId(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.zoneId"));
		fileSystem.setVpcId(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.vpcId"));
		fileSystem.setVSwitchId(context.stringValue("CPFSCreateFileSystemResponse.FileSystem.vSwitchId"));
		cPFSCreateFileSystemResponse.setFileSystem(fileSystem);
	 
	 	return cPFSCreateFileSystemResponse;
	}
}