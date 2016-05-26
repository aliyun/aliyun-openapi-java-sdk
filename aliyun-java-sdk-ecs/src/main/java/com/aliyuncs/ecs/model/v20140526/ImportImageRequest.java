/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ImportImageRequest extends RpcAcsRequest<ImportImageResponse> {
	
	public ImportImageRequest() {
		super("Ecs", "2014-05-26", "ImportImage", "ecs");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String imageName;

	private String description;

	private String architecture;

	private String oSType;

	private String platform;

	private String diskDeviceMapping1Format;

	private String diskDeviceMapping1OSSBucket;

	private String diskDeviceMapping1OSSObject;

	private Integer diskDeviceMapping1DiskImSize;

	private String diskDeviceMapping1Device;

	private String roleName;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		putQueryParameter("ImageName", imageName);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		putQueryParameter("Architecture", architecture);
	}

	public String getOSType() {
		return this.oSType;
	}

	public void setOSType(String oSType) {
		this.oSType = oSType;
		putQueryParameter("OSType", oSType);
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		putQueryParameter("Platform", platform);
	}

	public String getDiskDeviceMapping1Format() {
		return this.diskDeviceMapping1Format;
	}

	public void setDiskDeviceMapping1Format(String diskDeviceMapping1Format) {
		this.diskDeviceMapping1Format = diskDeviceMapping1Format;
		putQueryParameter("DiskDeviceMapping.1.Format", diskDeviceMapping1Format);
	}

	public String getDiskDeviceMapping1OSSBucket() {
		return this.diskDeviceMapping1OSSBucket;
	}

	public void setDiskDeviceMapping1OSSBucket(String diskDeviceMapping1OSSBucket) {
		this.diskDeviceMapping1OSSBucket = diskDeviceMapping1OSSBucket;
		putQueryParameter("DiskDeviceMapping.1.OSSBucket", diskDeviceMapping1OSSBucket);
	}

	public String getDiskDeviceMapping1OSSObject() {
		return this.diskDeviceMapping1OSSObject;
	}

	public void setDiskDeviceMapping1OSSObject(String diskDeviceMapping1OSSObject) {
		this.diskDeviceMapping1OSSObject = diskDeviceMapping1OSSObject;
		putQueryParameter("DiskDeviceMapping.1.OSSObject", diskDeviceMapping1OSSObject);
	}

	public Integer getDiskDeviceMapping1DiskImSize() {
		return this.diskDeviceMapping1DiskImSize;
	}

	public void setDiskDeviceMapping1DiskImSize(Integer diskDeviceMapping1DiskImSize) {
		this.diskDeviceMapping1DiskImSize = diskDeviceMapping1DiskImSize;
		putQueryParameter("DiskDeviceMapping.1.DiskImSize", diskDeviceMapping1DiskImSize);
	}

	public String getDiskDeviceMapping1Device() {
		return this.diskDeviceMapping1Device;
	}

	public void setDiskDeviceMapping1Device(String diskDeviceMapping1Device) {
		this.diskDeviceMapping1Device = diskDeviceMapping1Device;
		putQueryParameter("DiskDeviceMapping.1.Device", diskDeviceMapping1Device);
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		putQueryParameter("RoleName", roleName);
	}

	@Override
	public Class<ImportImageResponse> getResponseClass() {
		return ImportImageResponse.class;
	}

}
