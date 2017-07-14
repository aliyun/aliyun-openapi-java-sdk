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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ImportImageRequest extends RpcAcsRequest<ImportImageResponse> {
	
	public ImportImageRequest() {
		super("Ecs", "2014-05-26", "ImportImage", "ecs");
	}

	private List<DiskDeviceMapping> diskDeviceMappings;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String imageName;

	private String roleName;

	private String description;

	private String oSType;

	private Long ownerId;

	private String platform;

	private String architecture;

	public List<DiskDeviceMapping> getDiskDeviceMappings() {
		return this.diskDeviceMappings;
	}

	public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMapping) {
		this.diskDeviceMappings = diskDeviceMapping;	
		for (int i = 0; i < diskDeviceMapping.size(); i++) {
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".Format" , diskDeviceMapping.get(i).getFormat());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".OSSBucket" , diskDeviceMapping.get(i).getOSSBucket());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".OSSObject" , diskDeviceMapping.get(i).getOSSObject());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".DiskImSize" , diskDeviceMapping.get(i).getDiskImSize());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".DiskImageSize" , diskDeviceMapping.get(i).getDiskImageSize());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".Device" , diskDeviceMapping.get(i).getDevice());
		}	
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
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

	public String getOSType() {
		return this.oSType;
	}

	public void setOSType(String oSType) {
		this.oSType = oSType;
		if(oSType != null){
			putQueryParameter("OSType", oSType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
		}
	}

	public static class DiskDeviceMapping {

		private String format;

		private String oSSBucket;

		private String oSSObject;

		private Integer diskImSize;

		private Integer diskImageSize;

		private String device;

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getOSSBucket() {
			return this.oSSBucket;
		}

		public void setOSSBucket(String oSSBucket) {
			this.oSSBucket = oSSBucket;
		}

		public String getOSSObject() {
			return this.oSSObject;
		}

		public void setOSSObject(String oSSObject) {
			this.oSSObject = oSSObject;
		}

		public Integer getDiskImSize() {
			return this.diskImSize;
		}

		public void setDiskImSize(Integer diskImSize) {
			this.diskImSize = diskImSize;
		}

		public Integer getDiskImageSize() {
			return this.diskImageSize;
		}

		public void setDiskImageSize(Integer diskImageSize) {
			this.diskImageSize = diskImageSize;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}
	}

	@Override
	public Class<ImportImageResponse> getResponseClass() {
		return ImportImageResponse.class;
	}

}
