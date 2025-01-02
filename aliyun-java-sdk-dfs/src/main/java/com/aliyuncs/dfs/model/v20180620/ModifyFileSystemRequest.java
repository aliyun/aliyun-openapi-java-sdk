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
public class ModifyFileSystemRequest extends RpcAcsRequest<ModifyFileSystemResponse> {
	   

	private String throughputMode;

	private String description;

	private String fileSystemName;

	private String inputRegionId;

	private Long spaceCapacity;

	private String fileSystemId;

	private Long provisionedThroughputInMiBps;
	public ModifyFileSystemRequest() {
		super("DFS", "2018-06-20", "ModifyFileSystem", "alidfs");
		setMethod(MethodType.POST);
	}

	public String getThroughputMode() {
		return this.throughputMode;
	}

	public void setThroughputMode(String throughputMode) {
		this.throughputMode = throughputMode;
		if(throughputMode != null){
			putQueryParameter("ThroughputMode", throughputMode);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getFileSystemName() {
		return this.fileSystemName;
	}

	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
		if(fileSystemName != null){
			putQueryParameter("FileSystemName", fileSystemName);
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

	public Long getSpaceCapacity() {
		return this.spaceCapacity;
	}

	public void setSpaceCapacity(Long spaceCapacity) {
		this.spaceCapacity = spaceCapacity;
		if(spaceCapacity != null){
			putQueryParameter("SpaceCapacity", spaceCapacity.toString());
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

	public Long getProvisionedThroughputInMiBps() {
		return this.provisionedThroughputInMiBps;
	}

	public void setProvisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
		this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
		if(provisionedThroughputInMiBps != null){
			putQueryParameter("ProvisionedThroughputInMiBps", provisionedThroughputInMiBps.toString());
		}
	}

	@Override
	public Class<ModifyFileSystemResponse> getResponseClass() {
		return ModifyFileSystemResponse.class;
	}

}
