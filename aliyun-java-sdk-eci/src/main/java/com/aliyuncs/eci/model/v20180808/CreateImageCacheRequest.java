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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

import java.util.List;

/**
 * @author auto create
 */
public class CreateImageCacheRequest extends RpcAcsRequest<CreateImageCacheResponse> {


	private Long resourceOwnerId;

	private String clientToken;

	private String securityGroupId;

	private String imageCacheName;

	private String resourceGroupId;

	private Integer imageCacheSize;

	private Integer retentionDays;

	private List<ImageRegistryCredential> imageRegistryCredentials;

	private String eipInstanceId;

	private List<String> images;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String vSwitchId;

	private String zoneId;

	private Boolean autoMatchImageCache;

	private Boolean flash;

	private List<AcrRegistryInfo> acrRegistryInfos;

	public CreateImageCacheRequest() {
		super("Eci", "2018-08-08", "CreateImageCache", "eci");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if (resourceOwnerId != null) {
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if (clientToken != null) {
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if (securityGroupId != null) {
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getImageCacheName() {
		return this.imageCacheName;
	}

	public void setImageCacheName(String imageCacheName) {
		this.imageCacheName = imageCacheName;
		if (imageCacheName != null) {
			putQueryParameter("ImageCacheName", imageCacheName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if (resourceGroupId != null) {
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		if (retentionDays != null) {
			putQueryParameter("RetentionDays", retentionDays.toString());
		}
	}

	public Integer getImageCacheSize() {
		return this.imageCacheSize;
	}

	public void setImageCacheSize(Integer imageCacheSize) {
		this.imageCacheSize = imageCacheSize;
		if (imageCacheSize != null) {
			putQueryParameter("ImageCacheSize", imageCacheSize.toString());
		}
	}

	public List<ImageRegistryCredential> getImageRegistryCredentials() {
		return this.imageRegistryCredentials;
	}

	public void setImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
		this.imageRegistryCredentials = imageRegistryCredentials;
		if (imageRegistryCredentials != null) {
			for (int depth1 = 0; depth1 < imageRegistryCredentials.size(); depth1++) {
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Server", imageRegistryCredentials.get(depth1).getServer());
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".UserName", imageRegistryCredentials.get(depth1).getUserName());
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Password", imageRegistryCredentials.get(depth1).getPassword());
			}
		}
	}


	public String getEipInstanceId() {
		return this.eipInstanceId;
	}

	public void setEipInstanceId(String eipInstanceId) {
		this.eipInstanceId = eipInstanceId;
		if (eipInstanceId != null) {
			putQueryParameter("EipInstanceId", eipInstanceId);
		}
	}

	public List<String> getImages() {
		return this.images;
	}

	public void setImages(List<String> images) {
		this.images = images;
		if (images != null) {
			for (int i = 0; i < images.size(); i++) {
				putQueryParameter("Image." + (i + 1), images.get(i));
			}
		}
	}


	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if (resourceOwnerAccount != null) {
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if (ownerAccount != null) {
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if (ownerId != null) {
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if (vSwitchId != null) {
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if (zoneId != null) {
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Boolean getAutoMatchImageCache() {
		return this.autoMatchImageCache;
	}

	public void setAutoMatchImageCache(Boolean autoMatchImageCache) {
		this.autoMatchImageCache = autoMatchImageCache;
		if (autoMatchImageCache != null) {
			putQueryParameter("AutoMatchImageCache", autoMatchImageCache.toString());
		}
	}

	public Boolean getFlash() {
		return this.flash;
	}

	public void setFlash(Boolean flash) {
		this.flash = flash;
		if (null != flash) {
			putQueryParameter("Flash", flash.toString());
		}
	}

	public List<AcrRegistryInfo> getAcrRegistryInfos() {
		return this.acrRegistryInfos;
	}

	public void setAcrRegistryInfos(List<AcrRegistryInfo> acrRegistryInfos) {
		this.acrRegistryInfos = acrRegistryInfos;
		if (acrRegistryInfos != null) {
			for (int depth1 = 0; depth1 < acrRegistryInfos.size(); depth1++) {
				if (acrRegistryInfos.get(depth1).getDomains() != null) {
					for (int i = 0; i < acrRegistryInfos.get(depth1).getDomains().size(); i++) {
						putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".Domain." + (i + 1), acrRegistryInfos.get(depth1).getDomains().get(i));
					}
				}
				putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".InstanceId", acrRegistryInfos.get(depth1).getInstanceId());
				putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".InstanceName", acrRegistryInfos.get(depth1).getInstanceName());
				putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".RegionId", acrRegistryInfos.get(depth1).getRegionId());
			}
		}
	}

	public static class ImageRegistryCredential {

		private String server;

		private String userName;

		private String password;

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}

	public static class AcrRegistryInfo {
		private String instanceName;

		private String instanceId;

		private String regionId;

		private List<String> domains;

		public List<String> getDomains() {
			return this.domains;
		}

		public void setDomains(List<String> domains) {
			this.domains = domains;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public Class<CreateImageCacheResponse> getResponseClass() {
		return CreateImageCacheResponse.class;
	}

}
