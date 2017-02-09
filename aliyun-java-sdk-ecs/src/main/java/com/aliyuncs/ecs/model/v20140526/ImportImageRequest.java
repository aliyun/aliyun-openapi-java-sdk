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

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String imageName;

	private String description;

	private String architecture;

	private String oSType;

	private String platform;

	private String roleName;

	public List<DiskDeviceMapping> getDiskDeviceMappings() {
		return this.diskDeviceMappings;
	}

	public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
		this.diskDeviceMappings = diskDeviceMappings;	
		for (int i = 0; i < diskDeviceMappings.size(); i++) {
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".Format" , diskDeviceMappings.get(i).getFormat());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".OSSBucket" , diskDeviceMappings.get(i).getOSSBucket());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".OSSObject" , diskDeviceMappings.get(i).getOSSObject());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".DiskImSize" , diskDeviceMappings.get(i).getDiskImSize());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".DiskImageSize" , diskDeviceMappings.get(i).getDiskImageSize());
			putQueryParameter("DiskDeviceMapping." + (i + 1) + ".Device" , diskDeviceMappings.get(i).getDevice());
		}	
	}

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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		putQueryParameter("RoleName", roleName);
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
