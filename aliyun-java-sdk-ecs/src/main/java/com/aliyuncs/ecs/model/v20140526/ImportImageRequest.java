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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportImageRequest extends RpcAcsRequest<ImportImageResponse> {
	   

	private List<DiskDeviceMapping> diskDeviceMappings;

	private Long resourceOwnerId;

	private String description;

	private String platform;

	private String imageName;

	private String architecture;

	private String licenseType;

	private String resourceOwnerAccount;

	private String roleName;

	private String oSType;

	private Long ownerId;
	public ImportImageRequest() {
		super("Ecs", "2014-05-26", "ImportImage", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DiskDeviceMapping> getDiskDeviceMappings() {
		return this.diskDeviceMappings;
	}

	public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
		this.diskDeviceMappings = diskDeviceMappings;	
		if (diskDeviceMappings != null) {
			for (int depth1 = 0; depth1 < diskDeviceMappings.size(); depth1++) {
				putQueryParameter("DiskDeviceMapping." + (depth1 + 1) + ".OSSBucket" , diskDeviceMappings.get(depth1).getOSSBucket());
				putQueryParameter("DiskDeviceMapping." + (depth1 + 1) + ".DiskImSize" , diskDeviceMappings.get(depth1).getDiskImSize());
				putQueryParameter("DiskDeviceMapping." + (depth1 + 1) + ".Format" , diskDeviceMappings.get(depth1).getFormat());
				putQueryParameter("DiskDeviceMapping." + (depth1 + 1) + ".Device" , diskDeviceMappings.get(depth1).getDevice());
				putQueryParameter("DiskDeviceMapping." + (depth1 + 1) + ".OSSObject" , diskDeviceMappings.get(depth1).getOSSObject());
				putQueryParameter("DiskDeviceMapping." + (depth1 + 1) + ".DiskImageSize" , diskDeviceMappings.get(depth1).getDiskImageSize());
			}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
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

	public String getLicenseType() {
		return this.licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
		if(licenseType != null){
			putQueryParameter("LicenseType", licenseType);
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
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

	public static class DiskDeviceMapping {

		private String oSSBucket;

		private Integer diskImSize;

		private String format;

		private String device;

		private String oSSObject;

		private Integer diskImageSize;

		public String getOSSBucket() {
			return this.oSSBucket;
		}

		public void setOSSBucket(String oSSBucket) {
			this.oSSBucket = oSSBucket;
		}

		public Integer getDiskImSize() {
			return this.diskImSize;
		}

		public void setDiskImSize(Integer diskImSize) {
			this.diskImSize = diskImSize;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getOSSObject() {
			return this.oSSObject;
		}

		public void setOSSObject(String oSSObject) {
			this.oSSObject = oSSObject;
		}

		public Integer getDiskImageSize() {
			return this.diskImageSize;
		}

		public void setDiskImageSize(Integer diskImageSize) {
			this.diskImageSize = diskImageSize;
		}
	}

	@Override
	public Class<ImportImageResponse> getResponseClass() {
		return ImportImageResponse.class;
	}

}
