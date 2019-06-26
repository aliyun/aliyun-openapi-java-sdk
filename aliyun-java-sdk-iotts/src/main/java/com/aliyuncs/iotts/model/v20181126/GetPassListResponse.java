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

package com.aliyuncs.iotts.model.v20181126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotts.transform.v20181126.GetPassListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPassListResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private String swAuths;

		private String swSecurities;

		private Integer swIsAt;

		private Integer swIsOta;

		private String swForms;

		private String swCertifiedUrl;

		private String hwApplyType;

		private String funcEnumIds;

		private String funcInfo;

		private List<ListItem> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public String getSwAuths() {
			return this.swAuths;
		}

		public void setSwAuths(String swAuths) {
			this.swAuths = swAuths;
		}

		public String getSwSecurities() {
			return this.swSecurities;
		}

		public void setSwSecurities(String swSecurities) {
			this.swSecurities = swSecurities;
		}

		public Integer getSwIsAt() {
			return this.swIsAt;
		}

		public void setSwIsAt(Integer swIsAt) {
			this.swIsAt = swIsAt;
		}

		public Integer getSwIsOta() {
			return this.swIsOta;
		}

		public void setSwIsOta(Integer swIsOta) {
			this.swIsOta = swIsOta;
		}

		public String getSwForms() {
			return this.swForms;
		}

		public void setSwForms(String swForms) {
			this.swForms = swForms;
		}

		public String getSwCertifiedUrl() {
			return this.swCertifiedUrl;
		}

		public void setSwCertifiedUrl(String swCertifiedUrl) {
			this.swCertifiedUrl = swCertifiedUrl;
		}

		public String getHwApplyType() {
			return this.hwApplyType;
		}

		public void setHwApplyType(String hwApplyType) {
			this.hwApplyType = hwApplyType;
		}

		public String getFuncEnumIds() {
			return this.funcEnumIds;
		}

		public void setFuncEnumIds(String funcEnumIds) {
			this.funcEnumIds = funcEnumIds;
		}

		public String getFuncInfo() {
			return this.funcInfo;
		}

		public void setFuncInfo(String funcInfo) {
			this.funcInfo = funcInfo;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long id;

			private Long jobId;

			private Long certifyId;

			private Long gmtCreate;

			private Long gmtModified;

			private String company;

			private String brand;

			private String model;

			private String protocols;

			private String protocolT;

			private Integer deviceType;

			private String deviceTypeT;

			private Integer serviceType;

			private String serviceTypeT;

			private Integer certifyType;

			private String certifyTypeT;

			private Integer suitId;

			private String detectionIds;

			private String detectionIdsT;

			private String hwChipBrand;

			private String hwChipModel;

			private String hwChipArch;

			private String hwChipFreq;

			private String hwRficModel;

			private Integer hwRam;

			private Integer hwRom;

			private Integer hwFlash;

			private String hwWorkVol;

			private String hwWorkTemp;

			private Integer hwBaudrate;

			private String hwPack;

			private String hwSize;

			private String hwBoardModel;

			private String hwNominalVol;

			private String hwPowerMode;

			private String swOs;

			private String swOsVersion;

			private String swFirmVersion;

			private String swChannels;

			private String swGit;

			private String swEnv;

			private String urlPhotoFace;

			private String urlPhotoBack;

			private String urlPhotoLink;

			private String routineKey;

			private Long gmtPass;

			private String buyLink;

			private String hwVersion;

			private Integer chipType;

			private String chipTypeT;

			private String suitName;

			private String certifyPlanT;

			private Integer level;

			private String levelT;

			private String deviceTypeType;

			private String firmwareVersion;

			private String logoUrl;

			private String swProtocolType;

			private String swModuleIo;

			private Integer terminalType;

			private String terminalTypeT;

			private Integer routerType;

			private Integer certifyPlan;

			private Integer certifyPlanType;

			private String hwLoraFreqType;

			private String hwLoraFreqRange;

			private String hwLoraAntBandwidth;

			private String hwLoraDuplexMode;

			private String hwLoraRxCount;

			private String hwLoraTxCount;

			private String hwLoraClassMode;

			private String hwLoraUseModel;

			private String hwLoraIsRelay;

			private String swLoraRuleVersion;

			private String swLoraGwmpVersion;

			private String swLoraWanVersion;

			private String swLoraMac;

			private String swLoraKey;

			private String swIotsdkVersion;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getJobId() {
				return this.jobId;
			}

			public void setJobId(Long jobId) {
				this.jobId = jobId;
			}

			public Long getCertifyId() {
				return this.certifyId;
			}

			public void setCertifyId(Long certifyId) {
				this.certifyId = certifyId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getCompany() {
				return this.company;
			}

			public void setCompany(String company) {
				this.company = company;
			}

			public String getBrand() {
				return this.brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public String getModel() {
				return this.model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getProtocols() {
				return this.protocols;
			}

			public void setProtocols(String protocols) {
				this.protocols = protocols;
			}

			public String getProtocolT() {
				return this.protocolT;
			}

			public void setProtocolT(String protocolT) {
				this.protocolT = protocolT;
			}

			public Integer getDeviceType() {
				return this.deviceType;
			}

			public void setDeviceType(Integer deviceType) {
				this.deviceType = deviceType;
			}

			public String getDeviceTypeT() {
				return this.deviceTypeT;
			}

			public void setDeviceTypeT(String deviceTypeT) {
				this.deviceTypeT = deviceTypeT;
			}

			public Integer getServiceType() {
				return this.serviceType;
			}

			public void setServiceType(Integer serviceType) {
				this.serviceType = serviceType;
			}

			public String getServiceTypeT() {
				return this.serviceTypeT;
			}

			public void setServiceTypeT(String serviceTypeT) {
				this.serviceTypeT = serviceTypeT;
			}

			public Integer getCertifyType() {
				return this.certifyType;
			}

			public void setCertifyType(Integer certifyType) {
				this.certifyType = certifyType;
			}

			public String getCertifyTypeT() {
				return this.certifyTypeT;
			}

			public void setCertifyTypeT(String certifyTypeT) {
				this.certifyTypeT = certifyTypeT;
			}

			public Integer getSuitId() {
				return this.suitId;
			}

			public void setSuitId(Integer suitId) {
				this.suitId = suitId;
			}

			public String getDetectionIds() {
				return this.detectionIds;
			}

			public void setDetectionIds(String detectionIds) {
				this.detectionIds = detectionIds;
			}

			public String getDetectionIdsT() {
				return this.detectionIdsT;
			}

			public void setDetectionIdsT(String detectionIdsT) {
				this.detectionIdsT = detectionIdsT;
			}

			public String getHwChipBrand() {
				return this.hwChipBrand;
			}

			public void setHwChipBrand(String hwChipBrand) {
				this.hwChipBrand = hwChipBrand;
			}

			public String getHwChipModel() {
				return this.hwChipModel;
			}

			public void setHwChipModel(String hwChipModel) {
				this.hwChipModel = hwChipModel;
			}

			public String getHwChipArch() {
				return this.hwChipArch;
			}

			public void setHwChipArch(String hwChipArch) {
				this.hwChipArch = hwChipArch;
			}

			public String getHwChipFreq() {
				return this.hwChipFreq;
			}

			public void setHwChipFreq(String hwChipFreq) {
				this.hwChipFreq = hwChipFreq;
			}

			public String getHwRficModel() {
				return this.hwRficModel;
			}

			public void setHwRficModel(String hwRficModel) {
				this.hwRficModel = hwRficModel;
			}

			public Integer getHwRam() {
				return this.hwRam;
			}

			public void setHwRam(Integer hwRam) {
				this.hwRam = hwRam;
			}

			public Integer getHwRom() {
				return this.hwRom;
			}

			public void setHwRom(Integer hwRom) {
				this.hwRom = hwRom;
			}

			public Integer getHwFlash() {
				return this.hwFlash;
			}

			public void setHwFlash(Integer hwFlash) {
				this.hwFlash = hwFlash;
			}

			public String getHwWorkVol() {
				return this.hwWorkVol;
			}

			public void setHwWorkVol(String hwWorkVol) {
				this.hwWorkVol = hwWorkVol;
			}

			public String getHwWorkTemp() {
				return this.hwWorkTemp;
			}

			public void setHwWorkTemp(String hwWorkTemp) {
				this.hwWorkTemp = hwWorkTemp;
			}

			public Integer getHwBaudrate() {
				return this.hwBaudrate;
			}

			public void setHwBaudrate(Integer hwBaudrate) {
				this.hwBaudrate = hwBaudrate;
			}

			public String getHwPack() {
				return this.hwPack;
			}

			public void setHwPack(String hwPack) {
				this.hwPack = hwPack;
			}

			public String getHwSize() {
				return this.hwSize;
			}

			public void setHwSize(String hwSize) {
				this.hwSize = hwSize;
			}

			public String getHwBoardModel() {
				return this.hwBoardModel;
			}

			public void setHwBoardModel(String hwBoardModel) {
				this.hwBoardModel = hwBoardModel;
			}

			public String getHwNominalVol() {
				return this.hwNominalVol;
			}

			public void setHwNominalVol(String hwNominalVol) {
				this.hwNominalVol = hwNominalVol;
			}

			public String getHwPowerMode() {
				return this.hwPowerMode;
			}

			public void setHwPowerMode(String hwPowerMode) {
				this.hwPowerMode = hwPowerMode;
			}

			public String getSwOs() {
				return this.swOs;
			}

			public void setSwOs(String swOs) {
				this.swOs = swOs;
			}

			public String getSwOsVersion() {
				return this.swOsVersion;
			}

			public void setSwOsVersion(String swOsVersion) {
				this.swOsVersion = swOsVersion;
			}

			public String getSwFirmVersion() {
				return this.swFirmVersion;
			}

			public void setSwFirmVersion(String swFirmVersion) {
				this.swFirmVersion = swFirmVersion;
			}

			public String getSwChannels() {
				return this.swChannels;
			}

			public void setSwChannels(String swChannels) {
				this.swChannels = swChannels;
			}

			public String getSwGit() {
				return this.swGit;
			}

			public void setSwGit(String swGit) {
				this.swGit = swGit;
			}

			public String getSwEnv() {
				return this.swEnv;
			}

			public void setSwEnv(String swEnv) {
				this.swEnv = swEnv;
			}

			public String getUrlPhotoFace() {
				return this.urlPhotoFace;
			}

			public void setUrlPhotoFace(String urlPhotoFace) {
				this.urlPhotoFace = urlPhotoFace;
			}

			public String getUrlPhotoBack() {
				return this.urlPhotoBack;
			}

			public void setUrlPhotoBack(String urlPhotoBack) {
				this.urlPhotoBack = urlPhotoBack;
			}

			public String getUrlPhotoLink() {
				return this.urlPhotoLink;
			}

			public void setUrlPhotoLink(String urlPhotoLink) {
				this.urlPhotoLink = urlPhotoLink;
			}

			public String getRoutineKey() {
				return this.routineKey;
			}

			public void setRoutineKey(String routineKey) {
				this.routineKey = routineKey;
			}

			public Long getGmtPass() {
				return this.gmtPass;
			}

			public void setGmtPass(Long gmtPass) {
				this.gmtPass = gmtPass;
			}

			public String getBuyLink() {
				return this.buyLink;
			}

			public void setBuyLink(String buyLink) {
				this.buyLink = buyLink;
			}

			public String getHwVersion() {
				return this.hwVersion;
			}

			public void setHwVersion(String hwVersion) {
				this.hwVersion = hwVersion;
			}

			public Integer getChipType() {
				return this.chipType;
			}

			public void setChipType(Integer chipType) {
				this.chipType = chipType;
			}

			public String getChipTypeT() {
				return this.chipTypeT;
			}

			public void setChipTypeT(String chipTypeT) {
				this.chipTypeT = chipTypeT;
			}

			public String getSuitName() {
				return this.suitName;
			}

			public void setSuitName(String suitName) {
				this.suitName = suitName;
			}

			public String getCertifyPlanT() {
				return this.certifyPlanT;
			}

			public void setCertifyPlanT(String certifyPlanT) {
				this.certifyPlanT = certifyPlanT;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public String getLevelT() {
				return this.levelT;
			}

			public void setLevelT(String levelT) {
				this.levelT = levelT;
			}

			public String getDeviceTypeType() {
				return this.deviceTypeType;
			}

			public void setDeviceTypeType(String deviceTypeType) {
				this.deviceTypeType = deviceTypeType;
			}

			public String getFirmwareVersion() {
				return this.firmwareVersion;
			}

			public void setFirmwareVersion(String firmwareVersion) {
				this.firmwareVersion = firmwareVersion;
			}

			public String getLogoUrl() {
				return this.logoUrl;
			}

			public void setLogoUrl(String logoUrl) {
				this.logoUrl = logoUrl;
			}

			public String getSwProtocolType() {
				return this.swProtocolType;
			}

			public void setSwProtocolType(String swProtocolType) {
				this.swProtocolType = swProtocolType;
			}

			public String getSwModuleIo() {
				return this.swModuleIo;
			}

			public void setSwModuleIo(String swModuleIo) {
				this.swModuleIo = swModuleIo;
			}

			public Integer getTerminalType() {
				return this.terminalType;
			}

			public void setTerminalType(Integer terminalType) {
				this.terminalType = terminalType;
			}

			public String getTerminalTypeT() {
				return this.terminalTypeT;
			}

			public void setTerminalTypeT(String terminalTypeT) {
				this.terminalTypeT = terminalTypeT;
			}

			public Integer getRouterType() {
				return this.routerType;
			}

			public void setRouterType(Integer routerType) {
				this.routerType = routerType;
			}

			public Integer getCertifyPlan() {
				return this.certifyPlan;
			}

			public void setCertifyPlan(Integer certifyPlan) {
				this.certifyPlan = certifyPlan;
			}

			public Integer getCertifyPlanType() {
				return this.certifyPlanType;
			}

			public void setCertifyPlanType(Integer certifyPlanType) {
				this.certifyPlanType = certifyPlanType;
			}

			public String getHwLoraFreqType() {
				return this.hwLoraFreqType;
			}

			public void setHwLoraFreqType(String hwLoraFreqType) {
				this.hwLoraFreqType = hwLoraFreqType;
			}

			public String getHwLoraFreqRange() {
				return this.hwLoraFreqRange;
			}

			public void setHwLoraFreqRange(String hwLoraFreqRange) {
				this.hwLoraFreqRange = hwLoraFreqRange;
			}

			public String getHwLoraAntBandwidth() {
				return this.hwLoraAntBandwidth;
			}

			public void setHwLoraAntBandwidth(String hwLoraAntBandwidth) {
				this.hwLoraAntBandwidth = hwLoraAntBandwidth;
			}

			public String getHwLoraDuplexMode() {
				return this.hwLoraDuplexMode;
			}

			public void setHwLoraDuplexMode(String hwLoraDuplexMode) {
				this.hwLoraDuplexMode = hwLoraDuplexMode;
			}

			public String getHwLoraRxCount() {
				return this.hwLoraRxCount;
			}

			public void setHwLoraRxCount(String hwLoraRxCount) {
				this.hwLoraRxCount = hwLoraRxCount;
			}

			public String getHwLoraTxCount() {
				return this.hwLoraTxCount;
			}

			public void setHwLoraTxCount(String hwLoraTxCount) {
				this.hwLoraTxCount = hwLoraTxCount;
			}

			public String getHwLoraClassMode() {
				return this.hwLoraClassMode;
			}

			public void setHwLoraClassMode(String hwLoraClassMode) {
				this.hwLoraClassMode = hwLoraClassMode;
			}

			public String getHwLoraUseModel() {
				return this.hwLoraUseModel;
			}

			public void setHwLoraUseModel(String hwLoraUseModel) {
				this.hwLoraUseModel = hwLoraUseModel;
			}

			public String getHwLoraIsRelay() {
				return this.hwLoraIsRelay;
			}

			public void setHwLoraIsRelay(String hwLoraIsRelay) {
				this.hwLoraIsRelay = hwLoraIsRelay;
			}

			public String getSwLoraRuleVersion() {
				return this.swLoraRuleVersion;
			}

			public void setSwLoraRuleVersion(String swLoraRuleVersion) {
				this.swLoraRuleVersion = swLoraRuleVersion;
			}

			public String getSwLoraGwmpVersion() {
				return this.swLoraGwmpVersion;
			}

			public void setSwLoraGwmpVersion(String swLoraGwmpVersion) {
				this.swLoraGwmpVersion = swLoraGwmpVersion;
			}

			public String getSwLoraWanVersion() {
				return this.swLoraWanVersion;
			}

			public void setSwLoraWanVersion(String swLoraWanVersion) {
				this.swLoraWanVersion = swLoraWanVersion;
			}

			public String getSwLoraMac() {
				return this.swLoraMac;
			}

			public void setSwLoraMac(String swLoraMac) {
				this.swLoraMac = swLoraMac;
			}

			public String getSwLoraKey() {
				return this.swLoraKey;
			}

			public void setSwLoraKey(String swLoraKey) {
				this.swLoraKey = swLoraKey;
			}

			public String getSwIotsdkVersion() {
				return this.swIotsdkVersion;
			}

			public void setSwIotsdkVersion(String swIotsdkVersion) {
				this.swIotsdkVersion = swIotsdkVersion;
			}
		}
	}

	@Override
	public GetPassListResponse getInstance(UnmarshallerContext context) {
		return	GetPassListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
