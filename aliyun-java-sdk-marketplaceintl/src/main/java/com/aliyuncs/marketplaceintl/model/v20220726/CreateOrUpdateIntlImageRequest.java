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
public class CreateOrUpdateIntlImageRequest extends RpcAcsRequest<CreateOrUpdateIntlImageResponse> {
	   

	private String uid;

	private ProtocolInfo protocolInfo;

	private AccessInfo accessInfo;

	private BussinessInfo bussinessInfo;

	private String requestId;

	private String encryptData;

	private String commodityCode;

	private String callBackUrl;

	private BasicInfo basicInfo;
	public CreateOrUpdateIntlImageRequest() {
		super("marketplaceIntl", "2022-07-26", "CreateOrUpdateIntlImage");
		setMethod(MethodType.POST);
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

	public ProtocolInfo getProtocolInfo() {
		return this.protocolInfo;
	}

	public void setProtocolInfo(ProtocolInfo protocolInfo) {
		this.protocolInfo = protocolInfo;	
		if (protocolInfo != null) {
			
				putBodyParameter("ProtocolInfo.License" , protocolInfo.getLicense());
				putBodyParameter("ProtocolInfo.EarControlled" , protocolInfo.getEarControlled());
				putBodyParameter("ProtocolInfo.CustomsTarifNumber" , protocolInfo.getCustomsTarifNumber());
				putBodyParameter("ProtocolInfo.OfficialIdentificationNumber" , protocolInfo.getOfficialIdentificationNumber());
				putBodyParameter("ProtocolInfo.LicenseException" , protocolInfo.getLicenseException());
				putBodyParameter("ProtocolInfo.AgentName" , protocolInfo.getAgentName());
				putBodyParameter("ProtocolInfo.IdentificationMethod" , protocolInfo.getIdentificationMethod());
				putBodyParameter("ProtocolInfo.EccnCode" , protocolInfo.getEccnCode());
				putBodyParameter("ProtocolInfo.ProductCryType" , protocolInfo.getProductCryType());
				putBodyParameter("ProtocolInfo.FinalUserProtocol" , protocolInfo.getFinalUserProtocol());
				putBodyParameter("ProtocolInfo.LocalExportControlClassificationNumber" , protocolInfo.getLocalExportControlClassificationNumber());
				putBodyParameter("ProtocolInfo.ProductType" , protocolInfo.getProductType());
		}	
	}

	public AccessInfo getAccessInfo() {
		return this.accessInfo;
	}

	public void setAccessInfo(AccessInfo accessInfo) {
		this.accessInfo = accessInfo;	
		if (accessInfo != null) {
			
				if (accessInfo.getAccessDetail() != null) {
					
						putBodyParameter("AccessInfo.AccessDetail.ImageId" , accessInfo.getAccessDetail().getImageId());
						putBodyParameter("AccessInfo.AccessDetail.ImageName" , accessInfo.getAccessDetail().getImageName());
						putBodyParameter("AccessInfo.AccessDetail.AutoPublish" , accessInfo.getAccessDetail().getAutoPublish());
						putBodyParameter("AccessInfo.AccessDetail.ImageVersion" , accessInfo.getAccessDetail().getImageVersion());
						putBodyParameter("AccessInfo.AccessDetail.ReleaseRegionOption" , accessInfo.getAccessDetail().getReleaseRegionOption());
						putBodyParameter("AccessInfo.AccessDetail.ReleaseNote" , accessInfo.getAccessDetail().getReleaseNote());
						putBodyParameter("AccessInfo.AccessDetail.Ak" , accessInfo.getAccessDetail().getAk());
						putBodyParameter("AccessInfo.AccessDetail.Secret" , accessInfo.getAccessDetail().getSecret());
						putBodyParameter("AccessInfo.AccessDetail.Region" , accessInfo.getAccessDetail().getRegion());
				}
				putBodyParameter("AccessInfo.AutoPublish" , accessInfo.getAutoPublish());
				if (accessInfo.getImageConstraint() != null) {
					
						putBodyParameter("AccessInfo.ImageConstraint.SupportMoreNetworkCards" , accessInfo.getImageConstraint().getSupportMoreNetworkCards());
						if (accessInfo.getImageConstraint().getBaseConfig() != null) {
							
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MaxMemory" , accessInfo.getImageConstraint().getBaseConfig().getMaxMemory());
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MinDataDiskSize" , accessInfo.getImageConstraint().getBaseConfig().getMinDataDiskSize());
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MaxCpu" , accessInfo.getImageConstraint().getBaseConfig().getMaxCpu());
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MinBandwidth" , accessInfo.getImageConstraint().getBaseConfig().getMinBandwidth());
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MinSystemDiskSize" , accessInfo.getImageConstraint().getBaseConfig().getMinSystemDiskSize());
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MinCpu" , accessInfo.getImageConstraint().getBaseConfig().getMinCpu());
								putBodyParameter("AccessInfo.ImageConstraint.BaseConfig.MinMemory" , accessInfo.getImageConstraint().getBaseConfig().getMinMemory());
						}
						if (accessInfo.getImageConstraint().getCustomizeFamilyConstraints() != null) {
							for (String key1: accessInfo.getImageConstraint().getCustomizeFamilyConstraints().keySet() ) {
								putBodyParameter("AccessInfo.ImageConstraint.CustomizeFamilyConstraints.#" + key1.length() + "#" + key1 , accessInfo.getImageConstraint().getCustomizeFamilyConstraints().get(key1));
							}
						}
						if (accessInfo.getImageConstraint().getTcpPortRange() != null) {
							for (int depth1 = 0; depth1 < accessInfo.getImageConstraint().getTcpPortRange().size(); depth1++) {
								putBodyParameter("AccessInfo.ImageConstraint.TcpPortRange." + (depth1 + 1) , accessInfo.getImageConstraint().getTcpPortRange().get(depth1));
							}
						}
						if (accessInfo.getImageConstraint().getUdpPortRange() != null) {
							for (int depth1 = 0; depth1 < accessInfo.getImageConstraint().getUdpPortRange().size(); depth1++) {
								putBodyParameter("AccessInfo.ImageConstraint.UdpPortRange." + (depth1 + 1) , accessInfo.getImageConstraint().getUdpPortRange().get(depth1));
							}
						}
				}
				putBodyParameter("AccessInfo.Name" , accessInfo.getName());
				putBodyParameter("AccessInfo.ReleaseRegionOption" , accessInfo.getReleaseRegionOption());
				putBodyParameter("AccessInfo.Type" , accessInfo.getType());
				putBodyParameter("AccessInfo.ReleaseRegion" , accessInfo.getReleaseRegion());
		}	
	}

	public BussinessInfo getBussinessInfo() {
		return this.bussinessInfo;
	}

	public void setBussinessInfo(BussinessInfo bussinessInfo) {
		this.bussinessInfo = bussinessInfo;	
		if (bussinessInfo != null) {
			
				putBodyParameter("BussinessInfo.SeoDescription" , bussinessInfo.getSeoDescription());
				putBodyParameter("BussinessInfo.SeoKeywords" , bussinessInfo.getSeoKeywords());
				putBodyParameter("BussinessInfo.PipCode" , bussinessInfo.getPipCode());
				putBodyParameter("BussinessInfo.CategoryId" , bussinessInfo.getCategoryId());
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

	public String getCallBackUrl() {
		return this.callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
		if(callBackUrl != null){
			putBodyParameter("CallBackUrl", callBackUrl);
		}
	}

	public BasicInfo getBasicInfo() {
		return this.basicInfo;
	}

	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;	
		if (basicInfo != null) {
			
				putBodyParameter("BasicInfo.CommodityVideoStream" , basicInfo.getCommodityVideoStream());
				putBodyParameter("BasicInfo.CommodityAfterSale" , basicInfo.getCommodityAfterSale());
				putBodyParameter("BasicInfo.CommodityPictureName" , basicInfo.getCommodityPictureName());
				putBodyParameter("BasicInfo.CommodityIntroduction" , basicInfo.getCommodityIntroduction());
				putBodyParameter("BasicInfo.CommodityVideoUrl" , basicInfo.getCommodityVideoUrl());
				if (basicInfo.getCommodityQualification() != null) {
					for (int depth1 = 0; depth1 < basicInfo.getCommodityQualification().size(); depth1++) {
						putBodyParameter("BasicInfo.CommodityQualification." + (depth1 + 1) , basicInfo.getCommodityQualification().get(depth1));
					}
				}
				putBodyParameter("BasicInfo.CommodityPicture" , basicInfo.getCommodityPicture());
				putBodyParameter("BasicInfo.CommodityUserGuide" , basicInfo.getCommodityUserGuide());
				putBodyParameter("BasicInfo.CommodityRefundPolicy" , basicInfo.getCommodityRefundPolicy());
				putBodyParameter("BasicInfo.VideoSelect" , basicInfo.getVideoSelect());
				putBodyParameter("BasicInfo.CommodityFeature" , basicInfo.getCommodityFeature());
				putBodyParameter("BasicInfo.CommodityPictureStream" , basicInfo.getCommodityPictureStream());
				putBodyParameter("BasicInfo.CommodityVideoName" , basicInfo.getCommodityVideoName());
				putBodyParameter("BasicInfo.CommodityDetail" , basicInfo.getCommodityDetail());
		}	
	}

	public static class ProtocolInfo {

		private String license;

		private String earControlled;

		private String customsTarifNumber;

		private String officialIdentificationNumber;

		private String licenseException;

		private String agentName;

		private String identificationMethod;

		private String eccnCode;

		private String productCryType;

		private String finalUserProtocol;

		private String localExportControlClassificationNumber;

		private String productType;

		public String getLicense() {
			return this.license;
		}

		public void setLicense(String license) {
			this.license = license;
		}

		public String getEarControlled() {
			return this.earControlled;
		}

		public void setEarControlled(String earControlled) {
			this.earControlled = earControlled;
		}

		public String getCustomsTarifNumber() {
			return this.customsTarifNumber;
		}

		public void setCustomsTarifNumber(String customsTarifNumber) {
			this.customsTarifNumber = customsTarifNumber;
		}

		public String getOfficialIdentificationNumber() {
			return this.officialIdentificationNumber;
		}

		public void setOfficialIdentificationNumber(String officialIdentificationNumber) {
			this.officialIdentificationNumber = officialIdentificationNumber;
		}

		public String getLicenseException() {
			return this.licenseException;
		}

		public void setLicenseException(String licenseException) {
			this.licenseException = licenseException;
		}

		public String getAgentName() {
			return this.agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public String getIdentificationMethod() {
			return this.identificationMethod;
		}

		public void setIdentificationMethod(String identificationMethod) {
			this.identificationMethod = identificationMethod;
		}

		public String getEccnCode() {
			return this.eccnCode;
		}

		public void setEccnCode(String eccnCode) {
			this.eccnCode = eccnCode;
		}

		public String getProductCryType() {
			return this.productCryType;
		}

		public void setProductCryType(String productCryType) {
			this.productCryType = productCryType;
		}

		public String getFinalUserProtocol() {
			return this.finalUserProtocol;
		}

		public void setFinalUserProtocol(String finalUserProtocol) {
			this.finalUserProtocol = finalUserProtocol;
		}

		public String getLocalExportControlClassificationNumber() {
			return this.localExportControlClassificationNumber;
		}

		public void setLocalExportControlClassificationNumber(String localExportControlClassificationNumber) {
			this.localExportControlClassificationNumber = localExportControlClassificationNumber;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}
	}

	public static class AccessInfo {

		private AccessDetail accessDetail;

		private Boolean autoPublish;

		private ImageConstraint imageConstraint;

		private String name;

		private String releaseRegionOption;

		private Integer type;

		private String releaseRegion;

		public AccessDetail getAccessDetail() {
			return this.accessDetail;
		}

		public void setAccessDetail(AccessDetail accessDetail) {
			this.accessDetail = accessDetail;
		}

		public Boolean getAutoPublish() {
			return this.autoPublish;
		}

		public void setAutoPublish(Boolean autoPublish) {
			this.autoPublish = autoPublish;
		}

		public ImageConstraint getImageConstraint() {
			return this.imageConstraint;
		}

		public void setImageConstraint(ImageConstraint imageConstraint) {
			this.imageConstraint = imageConstraint;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getReleaseRegionOption() {
			return this.releaseRegionOption;
		}

		public void setReleaseRegionOption(String releaseRegionOption) {
			this.releaseRegionOption = releaseRegionOption;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getReleaseRegion() {
			return this.releaseRegion;
		}

		public void setReleaseRegion(String releaseRegion) {
			this.releaseRegion = releaseRegion;
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
	}

	public static class BussinessInfo {

		private String seoDescription;

		private String seoKeywords;

		private String pipCode;

		private String categoryId;

		public String getSeoDescription() {
			return this.seoDescription;
		}

		public void setSeoDescription(String seoDescription) {
			this.seoDescription = seoDescription;
		}

		public String getSeoKeywords() {
			return this.seoKeywords;
		}

		public void setSeoKeywords(String seoKeywords) {
			this.seoKeywords = seoKeywords;
		}

		public String getPipCode() {
			return this.pipCode;
		}

		public void setPipCode(String pipCode) {
			this.pipCode = pipCode;
		}

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
	}

	public static class BasicInfo {

		private String commodityVideoStream;

		private String commodityAfterSale;

		private String commodityPictureName;

		private String commodityIntroduction;

		private String commodityVideoUrl;

		private List<String> commodityQualification;

		private String commodityPicture;

		private String commodityUserGuide;

		private String commodityRefundPolicy;

		private String videoSelect;

		private String commodityFeature;

		private String commodityPictureStream;

		private String commodityVideoName;

		private String commodityDetail;

		public String getCommodityVideoStream() {
			return this.commodityVideoStream;
		}

		public void setCommodityVideoStream(String commodityVideoStream) {
			this.commodityVideoStream = commodityVideoStream;
		}

		public String getCommodityAfterSale() {
			return this.commodityAfterSale;
		}

		public void setCommodityAfterSale(String commodityAfterSale) {
			this.commodityAfterSale = commodityAfterSale;
		}

		public String getCommodityPictureName() {
			return this.commodityPictureName;
		}

		public void setCommodityPictureName(String commodityPictureName) {
			this.commodityPictureName = commodityPictureName;
		}

		public String getCommodityIntroduction() {
			return this.commodityIntroduction;
		}

		public void setCommodityIntroduction(String commodityIntroduction) {
			this.commodityIntroduction = commodityIntroduction;
		}

		public String getCommodityVideoUrl() {
			return this.commodityVideoUrl;
		}

		public void setCommodityVideoUrl(String commodityVideoUrl) {
			this.commodityVideoUrl = commodityVideoUrl;
		}

		public List<String> getCommodityQualification() {
			return this.commodityQualification;
		}

		public void setCommodityQualification(List<String> commodityQualification) {
			this.commodityQualification = commodityQualification;
		}

		public String getCommodityPicture() {
			return this.commodityPicture;
		}

		public void setCommodityPicture(String commodityPicture) {
			this.commodityPicture = commodityPicture;
		}

		public String getCommodityUserGuide() {
			return this.commodityUserGuide;
		}

		public void setCommodityUserGuide(String commodityUserGuide) {
			this.commodityUserGuide = commodityUserGuide;
		}

		public String getCommodityRefundPolicy() {
			return this.commodityRefundPolicy;
		}

		public void setCommodityRefundPolicy(String commodityRefundPolicy) {
			this.commodityRefundPolicy = commodityRefundPolicy;
		}

		public String getVideoSelect() {
			return this.videoSelect;
		}

		public void setVideoSelect(String videoSelect) {
			this.videoSelect = videoSelect;
		}

		public String getCommodityFeature() {
			return this.commodityFeature;
		}

		public void setCommodityFeature(String commodityFeature) {
			this.commodityFeature = commodityFeature;
		}

		public String getCommodityPictureStream() {
			return this.commodityPictureStream;
		}

		public void setCommodityPictureStream(String commodityPictureStream) {
			this.commodityPictureStream = commodityPictureStream;
		}

		public String getCommodityVideoName() {
			return this.commodityVideoName;
		}

		public void setCommodityVideoName(String commodityVideoName) {
			this.commodityVideoName = commodityVideoName;
		}

		public String getCommodityDetail() {
			return this.commodityDetail;
		}

		public void setCommodityDetail(String commodityDetail) {
			this.commodityDetail = commodityDetail;
		}
	}

	@Override
	public Class<CreateOrUpdateIntlImageResponse> getResponseClass() {
		return CreateOrUpdateIntlImageResponse.class;
	}

}
