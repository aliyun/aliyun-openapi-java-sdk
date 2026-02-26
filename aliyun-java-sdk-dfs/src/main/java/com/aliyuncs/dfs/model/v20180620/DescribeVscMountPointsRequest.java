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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeVscMountPointsRequest extends RpcAcsRequest<DescribeVscMountPointsResponse> {
	   

	private String vscId;

	private String inputRegionId;

	private String mountPointId;

	private String fileSystemId;

	private String instanceId;

	private String status;
	public DescribeVscMountPointsRequest() {
		super("DFS", "2018-06-20", "DescribeVscMountPoints", "alidfs");
		setMethod(MethodType.POST);
	}

	public String getVscId() {
		return this.vscId;
	}

	public void setVscId(String vscId) {
		this.vscId = vscId;
		if(vscId != null){
			putQueryParameter("VscId", vscId);
		}
	}

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public String getMountPointId() {
		return this.mountPointId;
	}

	public void setMountPointId(String mountPointId) {
		this.mountPointId = mountPointId;
		if(mountPointId != null){
			putQueryParameter("MountPointId", mountPointId);
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeVscMountPointsResponse> getResponseClass() {
		return DescribeVscMountPointsResponse.class;
	}

}
