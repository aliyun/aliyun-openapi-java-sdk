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
public class CreateFileSystemRequest extends RpcAcsRequest<CreateFileSystemResponse> {
	   

	private String throughputMode;

	private String description;

	private String dedicatedClusterId;

	private String dataRedundancyType;

	private String storageType;

	private String fileSystemName;

	private String inputRegionId;

	private Long spaceCapacity;

	private Integer partitionNumber;

	private Long provisionedThroughputInMiBps;

	private String zoneId;

	private String protocolType;

	private String storageSetName;
	public CreateFileSystemRequest() {
		super("DFS", "2018-06-20", "CreateFileSystem", "alidfs");
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

	public String getDedicatedClusterId() {
		return this.dedicatedClusterId;
	}

	public void setDedicatedClusterId(String dedicatedClusterId) {
		this.dedicatedClusterId = dedicatedClusterId;
		if(dedicatedClusterId != null){
			putQueryParameter("DedicatedClusterId", dedicatedClusterId);
		}
	}

	public String getDataRedundancyType() {
		return this.dataRedundancyType;
	}

	public void setDataRedundancyType(String dataRedundancyType) {
		this.dataRedundancyType = dataRedundancyType;
		if(dataRedundancyType != null){
			putQueryParameter("DataRedundancyType", dataRedundancyType);
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
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

	public Integer getPartitionNumber() {
		return this.partitionNumber;
	}

	public void setPartitionNumber(Integer partitionNumber) {
		this.partitionNumber = partitionNumber;
		if(partitionNumber != null){
			putQueryParameter("PartitionNumber", partitionNumber.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public String getStorageSetName() {
		return this.storageSetName;
	}

	public void setStorageSetName(String storageSetName) {
		this.storageSetName = storageSetName;
		if(storageSetName != null){
			putQueryParameter("StorageSetName", storageSetName);
		}
	}

	@Override
	public Class<CreateFileSystemResponse> getResponseClass() {
		return CreateFileSystemResponse.class;
	}

}
