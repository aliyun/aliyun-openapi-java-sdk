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

package com.aliyuncs.marketplaceintl.model.v20220726;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddIntlImageProductVersionRequest extends RpcAcsRequest<AddIntlImageProductVersionResponse> {
	   

	private AccessDetail accessDetail;

	private String uid;

	private String requestId;

	private ImageConstraint imageConstraint;

	private String encryptData;

	private String commodityCode;
	public AddIntlImageProductVersionRequest() {
		super("marketplaceIntl", "2022-07-26", "AddIntlImageProductVersion");
		setMethod(MethodType.POST);
	}

	public AccessDetail getAccessDetail() {
		return this.accessDetail;
	}

	public void setAccessDetail(AccessDetail accessDetail) {
		this.accessDetail = accessDetail;	
		if (accessDetail != null) {
			
				putBodyParameter("AccessDetail.ImageId" , accessDetail.getImageId());
				putBodyParameter("AccessDetail.ImageName" , accessDetail.getImageName());
				putBodyParameter("AccessDetail.AutoPublish" , accessDetail.getAutoPublish());
				putBodyParameter("AccessDetail.ImageVersion" , accessDetail.getImageVersion());
				putBodyParameter("AccessDetail.ReleaseRegionOption" , accessDetail.getReleaseRegionOption());
				putBodyParameter("AccessDetail.ReleaseNote" , accessDetail.getReleaseNote());
				putBodyParameter("AccessDetail.Ak" , accessDetail.getAk());
				putBodyParameter("AccessDetail.Secret" , accessDetail.getSecret());
				putBodyParameter("AccessDetail.Region" , accessDetail.getRegion());
		}	
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putBodyParameter("Uid", uid);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public ImageConstraint getImageConstraint() {
		return this.imageConstraint;
	}

	public void setImageConstraint(ImageConstraint imageConstraint) {
		this.imageConstraint = imageConstraint;	
		if (imageConstraint != null) {
			
				putBodyParameter("ImageConstraint.SupportMoreNetworkCards" , imageConstraint.getSupportMoreNetworkCards());
				if (imageConstraint.getBaseConfig() != null) {
					
						putBodyParameter("ImageConstraint.BaseConfig.MaxMemory" , imageConstraint.getBaseConfig().getMaxMemory());
						putBodyParameter("ImageConstraint.BaseConfig.MinDataDiskSize" , imageConstraint.getBaseConfig().getMinDataDiskSize());
						putBodyParameter("ImageConstraint.BaseConfig.MaxCpu" , imageConstraint.getBaseConfig().getMaxCpu());
						putBodyParameter("ImageConstraint.BaseConfig.MinBandwidth" , imageConstraint.getBaseConfig().getMinBandwidth());
						putBodyParameter("ImageConstraint.BaseConfig.MinSystemDiskSize" , imageConstraint.getBaseConfig().getMinSystemDiskSize());
						putBodyParameter("ImageConstraint.BaseConfig.MinCpu" , imageConstraint.getBaseConfig().getMinCpu());
						putBodyParameter("ImageConstraint.BaseConfig.MinMemory" , imageConstraint.getBaseConfig().getMinMemory());
				}
				if (imageConstraint.getCustomizeFamilyConstraints() != null) {
					for (String key1: imageConstraint.getCustomizeFamilyConstraints().keySet() ) {
						putBodyParameter("ImageConstraint.CustomizeFamilyConstraints.#" + key1.length() + "#" + key1 , imageConstraint.getCustomizeFamilyConstraints().get(key1));
					}
				}
				if (imageConstraint.getTcpPortRange() != null) {
					for (int depth1 = 0; depth1 < imageConstraint.getTcpPortRange().size(); depth1++) {
						putBodyParameter("ImageConstraint.TcpPortRange." + (depth1 + 1) , imageConstraint.getTcpPortRange().get(depth1));
					}
				}
				if (imageConstraint.getUdpPortRange() != null) {
					for (int depth1 = 0; depth1 < imageConstraint.getUdpPortRange().size(); depth1++) {
						putBodyParameter("ImageConstraint.UdpPortRange." + (depth1 + 1) , imageConstraint.getUdpPortRange().get(depth1));
					}
				}
		}	
	}

	public String getEncryptData() {
		return this.encryptData;
	}

	public void setEncryptData(String encryptData) {
		this.encryptData = encryptData;
		if(encryptData != null){
			putBodyParameter("EncryptData", encryptData);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putBodyParameter("CommodityCode", commodityCode);
		}
	}

	public static class AccessDetail {

		private String imageId;

		private String imageName;

		private Boolean autoPublish;

		private String imageVersion;

		private String releaseRegionOption;

		private String releaseNote;

		private String ak;

		private String secret;

		private String region;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Boolean getAutoPublish() {
			return this.autoPublish;
		}

		public void setAutoPublish(Boolean autoPublish) {
			this.autoPublish = autoPublish;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getReleaseRegionOption() {
			return this.releaseRegionOption;
		}

		public void setReleaseRegionOption(String releaseRegionOption) {
			this.releaseRegionOption = releaseRegionOption;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public String getAk() {
			return this.ak;
		}

		public void setAk(String ak) {
			this.ak = ak;
		}

		public String getSecret() {
			return this.secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	public static class ImageConstraint {

		private Boolean supportMoreNetworkCards;

		private BaseConfig baseConfig;

		private Map<String,Object> customizeFamilyConstraints;

		private List<String> tcpPortRange;

		private List<String> udpPortRange;

		public Boolean getSupportMoreNetworkCards() {
			return this.supportMoreNetworkCards;
		}

		public void setSupportMoreNetworkCards(Boolean supportMoreNetworkCards) {
			this.supportMoreNetworkCards = supportMoreNetworkCards;
		}

		public BaseConfig getBaseConfig() {
			return this.baseConfig;
		}

		public void setBaseConfig(BaseConfig baseConfig) {
			this.baseConfig = baseConfig;
		}

		public Map<String,Object> getCustomizeFamilyConstraints() {
			return this.customizeFamilyConstraints;
		}

		public void setCustomizeFamilyConstraints(Map<String,Object> customizeFamilyConstraints) {
			this.customizeFamilyConstraints = customizeFamilyConstraints;
		}

		public List<String> getTcpPortRange() {
			return this.tcpPortRange;
		}

		public void setTcpPortRange(List<String> tcpPortRange) {
			this.tcpPortRange = tcpPortRange;
		}

		public List<String> getUdpPortRange() {
			return this.udpPortRange;
		}

		public void setUdpPortRange(List<String> udpPortRange) {
			this.udpPortRange = udpPortRange;
		}

		public static class BaseConfig {

			private Float maxMemory;

			private Integer minDataDiskSize;

			private Integer maxCpu;

			private Integer minBandwidth;

			private Integer minSystemDiskSize;

			private Integer minCpu;

			private Float minMemory;

			public Float getMaxMemory() {
				return this.maxMemory;
			}

			public void setMaxMemory(Float maxMemory) {
				this.maxMemory = maxMemory;
			}

			public Integer getMinDataDiskSize() {
				return this.minDataDiskSize;
			}

			public void setMinDataDiskSize(Integer minDataDiskSize) {
				this.minDataDiskSize = minDataDiskSize;
			}

			public Integer getMaxCpu() {
				return this.maxCpu;
			}

			public void setMaxCpu(Integer maxCpu) {
				this.maxCpu = maxCpu;
			}

			public Integer getMinBandwidth() {
				return this.minBandwidth;
			}

			public void setMinBandwidth(Integer minBandwidth) {
				this.minBandwidth = minBandwidth;
			}

			public Integer getMinSystemDiskSize() {
				return this.minSystemDiskSize;
			}

			public void setMinSystemDiskSize(Integer minSystemDiskSize) {
				this.minSystemDiskSize = minSystemDiskSize;
			}

			public Integer getMinCpu() {
				return this.minCpu;
			}

			public void setMinCpu(Integer minCpu) {
				this.minCpu = minCpu;
			}

			public Float getMinMemory() {
				return this.minMemory;
			}

			public void setMinMemory(Float minMemory) {
				this.minMemory = minMemory;
			}
		}
	}

	@Override
	public Class<AddIntlImageProductVersionResponse> getResponseClass() {
		return AddIntlImageProductVersionResponse.class;
	}

}
