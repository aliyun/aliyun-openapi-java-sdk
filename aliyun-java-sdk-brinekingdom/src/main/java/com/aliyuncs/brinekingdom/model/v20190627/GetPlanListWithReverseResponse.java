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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.GetPlanListWithReverseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPlanListWithReverseResponse extends AcsResponse {

	private String errorMessage;

	private Boolean success;

	private String resultCode;

	private String requestId;

	private Result result;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long currentPage;

		private Long pageCount;

		private Long pageSize;

		private Long totalCount;

		private List<DataListItem> dataList;

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Long pageCount) {
			this.pageCount = pageCount;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private String agreement;

			private Long appGroupId;

			private String appGroupName;

			private String assetReceiver;

			private String assetReceiverNick;

			private String azone;

			private Integer benefitOld;

			private String business;

			private String businessMode;

			private String businessModeName;

			private String businessName;

			private String cbmDemander;

			private String classZoneCode;

			private String classZoneName;

			private String cloudDeployProduct1Name;

			private String cloudDeployProduct2Name;

			private String cloudDeployProduct3;

			private String cloudDeployProduct3Name;

			private String cmC;

			private String cmP;

			private String cmU;

			private String cmV;

			private Long cnt;

			private String comment;

			private String creator;

			private String creatorNic;

			private Long deliveryAmount;

			private Long expireDate;

			private Long highCnt;

			private Long id;

			private Long install;

			private Long installId;

			private String installName;

			private Long ladingStatus;

			private String logicZoneCode;

			private String logicZoneName;

			private String machineType;

			private Long manufacturerBrand;

			private String manufacturerBrandName;

			private Integer modelLoad;

			private String msg;

			private Long nakedDelivery;

			private String netArch;

			private String nic;

			private String orgKey;

			private Long osId;

			private String osName;

			private String outId;

			private Long pickAmount;

			private Long planType;

			private String priority;

			private String processId;

			private String product1;

			private String product1Name;

			private String product2;

			private String product2Name;

			private String product3;

			private String product3Name;

			private String projectCode;

			private String projectName;

			private String projectType;

			private String projectTypeName;

			private Long quotaPlanId;

			private String region;

			private String requireType;

			private String requireTypeName;

			private String roomCode;

			private String safeYear;

			private String safeZoneCode;

			private String safeZoneName;

			private String scenario;

			private String source;

			private Long status;

			private String subLine;

			private String subLineName;

			private Integer success;

			private Long time;

			private List<SplitDataListItem> splitDataList;

			public String getAgreement() {
				return this.agreement;
			}

			public void setAgreement(String agreement) {
				this.agreement = agreement;
			}

			public Long getAppGroupId() {
				return this.appGroupId;
			}

			public void setAppGroupId(Long appGroupId) {
				this.appGroupId = appGroupId;
			}

			public String getAppGroupName() {
				return this.appGroupName;
			}

			public void setAppGroupName(String appGroupName) {
				this.appGroupName = appGroupName;
			}

			public String getAssetReceiver() {
				return this.assetReceiver;
			}

			public void setAssetReceiver(String assetReceiver) {
				this.assetReceiver = assetReceiver;
			}

			public String getAssetReceiverNick() {
				return this.assetReceiverNick;
			}

			public void setAssetReceiverNick(String assetReceiverNick) {
				this.assetReceiverNick = assetReceiverNick;
			}

			public String getAzone() {
				return this.azone;
			}

			public void setAzone(String azone) {
				this.azone = azone;
			}

			public Integer getBenefitOld() {
				return this.benefitOld;
			}

			public void setBenefitOld(Integer benefitOld) {
				this.benefitOld = benefitOld;
			}

			public String getBusiness() {
				return this.business;
			}

			public void setBusiness(String business) {
				this.business = business;
			}

			public String getBusinessMode() {
				return this.businessMode;
			}

			public void setBusinessMode(String businessMode) {
				this.businessMode = businessMode;
			}

			public String getBusinessModeName() {
				return this.businessModeName;
			}

			public void setBusinessModeName(String businessModeName) {
				this.businessModeName = businessModeName;
			}

			public String getBusinessName() {
				return this.businessName;
			}

			public void setBusinessName(String businessName) {
				this.businessName = businessName;
			}

			public String getCbmDemander() {
				return this.cbmDemander;
			}

			public void setCbmDemander(String cbmDemander) {
				this.cbmDemander = cbmDemander;
			}

			public String getClassZoneCode() {
				return this.classZoneCode;
			}

			public void setClassZoneCode(String classZoneCode) {
				this.classZoneCode = classZoneCode;
			}

			public String getClassZoneName() {
				return this.classZoneName;
			}

			public void setClassZoneName(String classZoneName) {
				this.classZoneName = classZoneName;
			}

			public String getCloudDeployProduct1Name() {
				return this.cloudDeployProduct1Name;
			}

			public void setCloudDeployProduct1Name(String cloudDeployProduct1Name) {
				this.cloudDeployProduct1Name = cloudDeployProduct1Name;
			}

			public String getCloudDeployProduct2Name() {
				return this.cloudDeployProduct2Name;
			}

			public void setCloudDeployProduct2Name(String cloudDeployProduct2Name) {
				this.cloudDeployProduct2Name = cloudDeployProduct2Name;
			}

			public String getCloudDeployProduct3() {
				return this.cloudDeployProduct3;
			}

			public void setCloudDeployProduct3(String cloudDeployProduct3) {
				this.cloudDeployProduct3 = cloudDeployProduct3;
			}

			public String getCloudDeployProduct3Name() {
				return this.cloudDeployProduct3Name;
			}

			public void setCloudDeployProduct3Name(String cloudDeployProduct3Name) {
				this.cloudDeployProduct3Name = cloudDeployProduct3Name;
			}

			public String getCmC() {
				return this.cmC;
			}

			public void setCmC(String cmC) {
				this.cmC = cmC;
			}

			public String getCmP() {
				return this.cmP;
			}

			public void setCmP(String cmP) {
				this.cmP = cmP;
			}

			public String getCmU() {
				return this.cmU;
			}

			public void setCmU(String cmU) {
				this.cmU = cmU;
			}

			public String getCmV() {
				return this.cmV;
			}

			public void setCmV(String cmV) {
				this.cmV = cmV;
			}

			public Long getCnt() {
				return this.cnt;
			}

			public void setCnt(Long cnt) {
				this.cnt = cnt;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreatorNic() {
				return this.creatorNic;
			}

			public void setCreatorNic(String creatorNic) {
				this.creatorNic = creatorNic;
			}

			public Long getDeliveryAmount() {
				return this.deliveryAmount;
			}

			public void setDeliveryAmount(Long deliveryAmount) {
				this.deliveryAmount = deliveryAmount;
			}

			public Long getExpireDate() {
				return this.expireDate;
			}

			public void setExpireDate(Long expireDate) {
				this.expireDate = expireDate;
			}

			public Long getHighCnt() {
				return this.highCnt;
			}

			public void setHighCnt(Long highCnt) {
				this.highCnt = highCnt;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getInstall() {
				return this.install;
			}

			public void setInstall(Long install) {
				this.install = install;
			}

			public Long getInstallId() {
				return this.installId;
			}

			public void setInstallId(Long installId) {
				this.installId = installId;
			}

			public String getInstallName() {
				return this.installName;
			}

			public void setInstallName(String installName) {
				this.installName = installName;
			}

			public Long getLadingStatus() {
				return this.ladingStatus;
			}

			public void setLadingStatus(Long ladingStatus) {
				this.ladingStatus = ladingStatus;
			}

			public String getLogicZoneCode() {
				return this.logicZoneCode;
			}

			public void setLogicZoneCode(String logicZoneCode) {
				this.logicZoneCode = logicZoneCode;
			}

			public String getLogicZoneName() {
				return this.logicZoneName;
			}

			public void setLogicZoneName(String logicZoneName) {
				this.logicZoneName = logicZoneName;
			}

			public String getMachineType() {
				return this.machineType;
			}

			public void setMachineType(String machineType) {
				this.machineType = machineType;
			}

			public Long getManufacturerBrand() {
				return this.manufacturerBrand;
			}

			public void setManufacturerBrand(Long manufacturerBrand) {
				this.manufacturerBrand = manufacturerBrand;
			}

			public String getManufacturerBrandName() {
				return this.manufacturerBrandName;
			}

			public void setManufacturerBrandName(String manufacturerBrandName) {
				this.manufacturerBrandName = manufacturerBrandName;
			}

			public Integer getModelLoad() {
				return this.modelLoad;
			}

			public void setModelLoad(Integer modelLoad) {
				this.modelLoad = modelLoad;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public Long getNakedDelivery() {
				return this.nakedDelivery;
			}

			public void setNakedDelivery(Long nakedDelivery) {
				this.nakedDelivery = nakedDelivery;
			}

			public String getNetArch() {
				return this.netArch;
			}

			public void setNetArch(String netArch) {
				this.netArch = netArch;
			}

			public String getNic() {
				return this.nic;
			}

			public void setNic(String nic) {
				this.nic = nic;
			}

			public String getOrgKey() {
				return this.orgKey;
			}

			public void setOrgKey(String orgKey) {
				this.orgKey = orgKey;
			}

			public Long getOsId() {
				return this.osId;
			}

			public void setOsId(Long osId) {
				this.osId = osId;
			}

			public String getOsName() {
				return this.osName;
			}

			public void setOsName(String osName) {
				this.osName = osName;
			}

			public String getOutId() {
				return this.outId;
			}

			public void setOutId(String outId) {
				this.outId = outId;
			}

			public Long getPickAmount() {
				return this.pickAmount;
			}

			public void setPickAmount(Long pickAmount) {
				this.pickAmount = pickAmount;
			}

			public Long getPlanType() {
				return this.planType;
			}

			public void setPlanType(Long planType) {
				this.planType = planType;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}

			public String getProcessId() {
				return this.processId;
			}

			public void setProcessId(String processId) {
				this.processId = processId;
			}

			public String getProduct1() {
				return this.product1;
			}

			public void setProduct1(String product1) {
				this.product1 = product1;
			}

			public String getProduct1Name() {
				return this.product1Name;
			}

			public void setProduct1Name(String product1Name) {
				this.product1Name = product1Name;
			}

			public String getProduct2() {
				return this.product2;
			}

			public void setProduct2(String product2) {
				this.product2 = product2;
			}

			public String getProduct2Name() {
				return this.product2Name;
			}

			public void setProduct2Name(String product2Name) {
				this.product2Name = product2Name;
			}

			public String getProduct3() {
				return this.product3;
			}

			public void setProduct3(String product3) {
				this.product3 = product3;
			}

			public String getProduct3Name() {
				return this.product3Name;
			}

			public void setProduct3Name(String product3Name) {
				this.product3Name = product3Name;
			}

			public String getProjectCode() {
				return this.projectCode;
			}

			public void setProjectCode(String projectCode) {
				this.projectCode = projectCode;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectType() {
				return this.projectType;
			}

			public void setProjectType(String projectType) {
				this.projectType = projectType;
			}

			public String getProjectTypeName() {
				return this.projectTypeName;
			}

			public void setProjectTypeName(String projectTypeName) {
				this.projectTypeName = projectTypeName;
			}

			public Long getQuotaPlanId() {
				return this.quotaPlanId;
			}

			public void setQuotaPlanId(Long quotaPlanId) {
				this.quotaPlanId = quotaPlanId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getRequireType() {
				return this.requireType;
			}

			public void setRequireType(String requireType) {
				this.requireType = requireType;
			}

			public String getRequireTypeName() {
				return this.requireTypeName;
			}

			public void setRequireTypeName(String requireTypeName) {
				this.requireTypeName = requireTypeName;
			}

			public String getRoomCode() {
				return this.roomCode;
			}

			public void setRoomCode(String roomCode) {
				this.roomCode = roomCode;
			}

			public String getSafeYear() {
				return this.safeYear;
			}

			public void setSafeYear(String safeYear) {
				this.safeYear = safeYear;
			}

			public String getSafeZoneCode() {
				return this.safeZoneCode;
			}

			public void setSafeZoneCode(String safeZoneCode) {
				this.safeZoneCode = safeZoneCode;
			}

			public String getSafeZoneName() {
				return this.safeZoneName;
			}

			public void setSafeZoneName(String safeZoneName) {
				this.safeZoneName = safeZoneName;
			}

			public String getScenario() {
				return this.scenario;
			}

			public void setScenario(String scenario) {
				this.scenario = scenario;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getSubLine() {
				return this.subLine;
			}

			public void setSubLine(String subLine) {
				this.subLine = subLine;
			}

			public String getSubLineName() {
				return this.subLineName;
			}

			public void setSubLineName(String subLineName) {
				this.subLineName = subLineName;
			}

			public Integer getSuccess() {
				return this.success;
			}

			public void setSuccess(Integer success) {
				this.success = success;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public List<SplitDataListItem> getSplitDataList() {
				return this.splitDataList;
			}

			public void setSplitDataList(List<SplitDataListItem> splitDataList) {
				this.splitDataList = splitDataList;
			}

			public static class SplitDataListItem {

				private String addStatus;

				private Long appGroupId;

				private String appGroupName;

				private String assetReceiver;

				private String assetReceiverNick;

				private String azone;

				private Long benefitOld;

				private String business;

				private String businessMode;

				private String businessModeName;

				private String businessName;

				private String cbmDemander;

				private String classZoneCode;

				private String classZoneName;

				private String cloudDeployProduct1Name;

				private String cloudDeployProduct2Name;

				private String cloudDeployProduct3;

				private String cloudDeployProduct3Name;

				private String cmC;

				private String cmP;

				private String cmU;

				private String cmV;

				private Long cnt;

				private String comment;

				private String country;

				private String creator;

				private String creatorNic;

				private String dcosStatus;

				private Long demandStatus;

				private String error;

				private Long gmtCreate;

				private Long gmtModified;

				private Integer highCnt;

				private Long id;

				private Integer install;

				private Long installId;

				private String installName;

				private Long ladingStatus;

				private String logicZoneCode;

				private String logicZoneName;

				private String machineType;

				private Long manufacturerBrand;

				private String manufacturerBrandName;

				private Integer modelLoad;

				private Long nakedDelivery;

				private String netArch;

				private Long newPlanId;

				private String nic;

				private String org;

				private Long originId;

				private Long osId;

				private String osName;

				private String outId;

				private String planChangeReason;

				private Long planType;

				private String priority;

				private String processId;

				private String product1;

				private String product1Name;

				private String product2;

				private String product2Name;

				private String product3;

				private String product3Name;

				private String projectCode;

				private String projectName;

				private String projectType;

				private String projectTypeName;

				private Long quotaPlanId;

				private String region;

				private String requireType;

				private String requireTypeName;

				private String reverseStatus;

				private String reverseType;

				private String roomCode;

				private String safeYear;

				private String safeZoneCode;

				private String safeZoneName;

				private String scStatus;

				private String scenario;

				private String stockStatus;

				private String subLine;

				private String subLineName;

				private Long time;

				public String getAddStatus() {
					return this.addStatus;
				}

				public void setAddStatus(String addStatus) {
					this.addStatus = addStatus;
				}

				public Long getAppGroupId() {
					return this.appGroupId;
				}

				public void setAppGroupId(Long appGroupId) {
					this.appGroupId = appGroupId;
				}

				public String getAppGroupName() {
					return this.appGroupName;
				}

				public void setAppGroupName(String appGroupName) {
					this.appGroupName = appGroupName;
				}

				public String getAssetReceiver() {
					return this.assetReceiver;
				}

				public void setAssetReceiver(String assetReceiver) {
					this.assetReceiver = assetReceiver;
				}

				public String getAssetReceiverNick() {
					return this.assetReceiverNick;
				}

				public void setAssetReceiverNick(String assetReceiverNick) {
					this.assetReceiverNick = assetReceiverNick;
				}

				public String getAzone() {
					return this.azone;
				}

				public void setAzone(String azone) {
					this.azone = azone;
				}

				public Long getBenefitOld() {
					return this.benefitOld;
				}

				public void setBenefitOld(Long benefitOld) {
					this.benefitOld = benefitOld;
				}

				public String getBusiness() {
					return this.business;
				}

				public void setBusiness(String business) {
					this.business = business;
				}

				public String getBusinessMode() {
					return this.businessMode;
				}

				public void setBusinessMode(String businessMode) {
					this.businessMode = businessMode;
				}

				public String getBusinessModeName() {
					return this.businessModeName;
				}

				public void setBusinessModeName(String businessModeName) {
					this.businessModeName = businessModeName;
				}

				public String getBusinessName() {
					return this.businessName;
				}

				public void setBusinessName(String businessName) {
					this.businessName = businessName;
				}

				public String getCbmDemander() {
					return this.cbmDemander;
				}

				public void setCbmDemander(String cbmDemander) {
					this.cbmDemander = cbmDemander;
				}

				public String getClassZoneCode() {
					return this.classZoneCode;
				}

				public void setClassZoneCode(String classZoneCode) {
					this.classZoneCode = classZoneCode;
				}

				public String getClassZoneName() {
					return this.classZoneName;
				}

				public void setClassZoneName(String classZoneName) {
					this.classZoneName = classZoneName;
				}

				public String getCloudDeployProduct1Name() {
					return this.cloudDeployProduct1Name;
				}

				public void setCloudDeployProduct1Name(String cloudDeployProduct1Name) {
					this.cloudDeployProduct1Name = cloudDeployProduct1Name;
				}

				public String getCloudDeployProduct2Name() {
					return this.cloudDeployProduct2Name;
				}

				public void setCloudDeployProduct2Name(String cloudDeployProduct2Name) {
					this.cloudDeployProduct2Name = cloudDeployProduct2Name;
				}

				public String getCloudDeployProduct3() {
					return this.cloudDeployProduct3;
				}

				public void setCloudDeployProduct3(String cloudDeployProduct3) {
					this.cloudDeployProduct3 = cloudDeployProduct3;
				}

				public String getCloudDeployProduct3Name() {
					return this.cloudDeployProduct3Name;
				}

				public void setCloudDeployProduct3Name(String cloudDeployProduct3Name) {
					this.cloudDeployProduct3Name = cloudDeployProduct3Name;
				}

				public String getCmC() {
					return this.cmC;
				}

				public void setCmC(String cmC) {
					this.cmC = cmC;
				}

				public String getCmP() {
					return this.cmP;
				}

				public void setCmP(String cmP) {
					this.cmP = cmP;
				}

				public String getCmU() {
					return this.cmU;
				}

				public void setCmU(String cmU) {
					this.cmU = cmU;
				}

				public String getCmV() {
					return this.cmV;
				}

				public void setCmV(String cmV) {
					this.cmV = cmV;
				}

				public Long getCnt() {
					return this.cnt;
				}

				public void setCnt(Long cnt) {
					this.cnt = cnt;
				}

				public String getComment() {
					return this.comment;
				}

				public void setComment(String comment) {
					this.comment = comment;
				}

				public String getCountry() {
					return this.country;
				}

				public void setCountry(String country) {
					this.country = country;
				}

				public String getCreator() {
					return this.creator;
				}

				public void setCreator(String creator) {
					this.creator = creator;
				}

				public String getCreatorNic() {
					return this.creatorNic;
				}

				public void setCreatorNic(String creatorNic) {
					this.creatorNic = creatorNic;
				}

				public String getDcosStatus() {
					return this.dcosStatus;
				}

				public void setDcosStatus(String dcosStatus) {
					this.dcosStatus = dcosStatus;
				}

				public Long getDemandStatus() {
					return this.demandStatus;
				}

				public void setDemandStatus(Long demandStatus) {
					this.demandStatus = demandStatus;
				}

				public String getError() {
					return this.error;
				}

				public void setError(String error) {
					this.error = error;
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

				public Integer getHighCnt() {
					return this.highCnt;
				}

				public void setHighCnt(Integer highCnt) {
					this.highCnt = highCnt;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Integer getInstall() {
					return this.install;
				}

				public void setInstall(Integer install) {
					this.install = install;
				}

				public Long getInstallId() {
					return this.installId;
				}

				public void setInstallId(Long installId) {
					this.installId = installId;
				}

				public String getInstallName() {
					return this.installName;
				}

				public void setInstallName(String installName) {
					this.installName = installName;
				}

				public Long getLadingStatus() {
					return this.ladingStatus;
				}

				public void setLadingStatus(Long ladingStatus) {
					this.ladingStatus = ladingStatus;
				}

				public String getLogicZoneCode() {
					return this.logicZoneCode;
				}

				public void setLogicZoneCode(String logicZoneCode) {
					this.logicZoneCode = logicZoneCode;
				}

				public String getLogicZoneName() {
					return this.logicZoneName;
				}

				public void setLogicZoneName(String logicZoneName) {
					this.logicZoneName = logicZoneName;
				}

				public String getMachineType() {
					return this.machineType;
				}

				public void setMachineType(String machineType) {
					this.machineType = machineType;
				}

				public Long getManufacturerBrand() {
					return this.manufacturerBrand;
				}

				public void setManufacturerBrand(Long manufacturerBrand) {
					this.manufacturerBrand = manufacturerBrand;
				}

				public String getManufacturerBrandName() {
					return this.manufacturerBrandName;
				}

				public void setManufacturerBrandName(String manufacturerBrandName) {
					this.manufacturerBrandName = manufacturerBrandName;
				}

				public Integer getModelLoad() {
					return this.modelLoad;
				}

				public void setModelLoad(Integer modelLoad) {
					this.modelLoad = modelLoad;
				}

				public Long getNakedDelivery() {
					return this.nakedDelivery;
				}

				public void setNakedDelivery(Long nakedDelivery) {
					this.nakedDelivery = nakedDelivery;
				}

				public String getNetArch() {
					return this.netArch;
				}

				public void setNetArch(String netArch) {
					this.netArch = netArch;
				}

				public Long getNewPlanId() {
					return this.newPlanId;
				}

				public void setNewPlanId(Long newPlanId) {
					this.newPlanId = newPlanId;
				}

				public String getNic() {
					return this.nic;
				}

				public void setNic(String nic) {
					this.nic = nic;
				}

				public String getOrg() {
					return this.org;
				}

				public void setOrg(String org) {
					this.org = org;
				}

				public Long getOriginId() {
					return this.originId;
				}

				public void setOriginId(Long originId) {
					this.originId = originId;
				}

				public Long getOsId() {
					return this.osId;
				}

				public void setOsId(Long osId) {
					this.osId = osId;
				}

				public String getOsName() {
					return this.osName;
				}

				public void setOsName(String osName) {
					this.osName = osName;
				}

				public String getOutId() {
					return this.outId;
				}

				public void setOutId(String outId) {
					this.outId = outId;
				}

				public String getPlanChangeReason() {
					return this.planChangeReason;
				}

				public void setPlanChangeReason(String planChangeReason) {
					this.planChangeReason = planChangeReason;
				}

				public Long getPlanType() {
					return this.planType;
				}

				public void setPlanType(Long planType) {
					this.planType = planType;
				}

				public String getPriority() {
					return this.priority;
				}

				public void setPriority(String priority) {
					this.priority = priority;
				}

				public String getProcessId() {
					return this.processId;
				}

				public void setProcessId(String processId) {
					this.processId = processId;
				}

				public String getProduct1() {
					return this.product1;
				}

				public void setProduct1(String product1) {
					this.product1 = product1;
				}

				public String getProduct1Name() {
					return this.product1Name;
				}

				public void setProduct1Name(String product1Name) {
					this.product1Name = product1Name;
				}

				public String getProduct2() {
					return this.product2;
				}

				public void setProduct2(String product2) {
					this.product2 = product2;
				}

				public String getProduct2Name() {
					return this.product2Name;
				}

				public void setProduct2Name(String product2Name) {
					this.product2Name = product2Name;
				}

				public String getProduct3() {
					return this.product3;
				}

				public void setProduct3(String product3) {
					this.product3 = product3;
				}

				public String getProduct3Name() {
					return this.product3Name;
				}

				public void setProduct3Name(String product3Name) {
					this.product3Name = product3Name;
				}

				public String getProjectCode() {
					return this.projectCode;
				}

				public void setProjectCode(String projectCode) {
					this.projectCode = projectCode;
				}

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}

				public String getProjectType() {
					return this.projectType;
				}

				public void setProjectType(String projectType) {
					this.projectType = projectType;
				}

				public String getProjectTypeName() {
					return this.projectTypeName;
				}

				public void setProjectTypeName(String projectTypeName) {
					this.projectTypeName = projectTypeName;
				}

				public Long getQuotaPlanId() {
					return this.quotaPlanId;
				}

				public void setQuotaPlanId(Long quotaPlanId) {
					this.quotaPlanId = quotaPlanId;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getRequireType() {
					return this.requireType;
				}

				public void setRequireType(String requireType) {
					this.requireType = requireType;
				}

				public String getRequireTypeName() {
					return this.requireTypeName;
				}

				public void setRequireTypeName(String requireTypeName) {
					this.requireTypeName = requireTypeName;
				}

				public String getReverseStatus() {
					return this.reverseStatus;
				}

				public void setReverseStatus(String reverseStatus) {
					this.reverseStatus = reverseStatus;
				}

				public String getReverseType() {
					return this.reverseType;
				}

				public void setReverseType(String reverseType) {
					this.reverseType = reverseType;
				}

				public String getRoomCode() {
					return this.roomCode;
				}

				public void setRoomCode(String roomCode) {
					this.roomCode = roomCode;
				}

				public String getSafeYear() {
					return this.safeYear;
				}

				public void setSafeYear(String safeYear) {
					this.safeYear = safeYear;
				}

				public String getSafeZoneCode() {
					return this.safeZoneCode;
				}

				public void setSafeZoneCode(String safeZoneCode) {
					this.safeZoneCode = safeZoneCode;
				}

				public String getSafeZoneName() {
					return this.safeZoneName;
				}

				public void setSafeZoneName(String safeZoneName) {
					this.safeZoneName = safeZoneName;
				}

				public String getScStatus() {
					return this.scStatus;
				}

				public void setScStatus(String scStatus) {
					this.scStatus = scStatus;
				}

				public String getScenario() {
					return this.scenario;
				}

				public void setScenario(String scenario) {
					this.scenario = scenario;
				}

				public String getStockStatus() {
					return this.stockStatus;
				}

				public void setStockStatus(String stockStatus) {
					this.stockStatus = stockStatus;
				}

				public String getSubLine() {
					return this.subLine;
				}

				public void setSubLine(String subLine) {
					this.subLine = subLine;
				}

				public String getSubLineName() {
					return this.subLineName;
				}

				public void setSubLineName(String subLineName) {
					this.subLineName = subLineName;
				}

				public Long getTime() {
					return this.time;
				}

				public void setTime(Long time) {
					this.time = time;
				}
			}
		}
	}

	@Override
	public GetPlanListWithReverseResponse getInstance(UnmarshallerContext context) {
		return	GetPlanListWithReverseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
