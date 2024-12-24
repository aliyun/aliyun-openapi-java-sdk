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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.GetSolutionListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSolutionListResponse extends AcsResponse {

	private String message;

	private Boolean success;

	private String requestId;

	private List<ResultItem> result;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String ascriptionClassName;

		private String deployProduct2Name;

		private Long dcsId;

		private String dataError;

		private String itemType;

		private Long ukUseId;

		private Integer matchCnt;

		private String orgName;

		private String businessMode;

		private String brandName;

		private String item;

		private Boolean factoryInstall;

		private String requireType;

		private Integer modelLoad;

		private Integer serverAssignCnt;

		private Long osId;

		private Long consistentId;

		private Integer ladingProcessQty;

		private Long quotaPlanId;

		private String deliveryType;

		private Boolean dataFlag;

		private String projectTypeName;

		private String status;

		private String cbmOwner;

		private String productType;

		private String product3Name;

		private String scenario;

		private String networkArch;

		private String uid;

		private Long gmtCreate;

		private String scPlanIds;

		private Integer supplyQty;

		private Long id;

		private String assetReceiverNick;

		private Integer useCapacityCnt;

		private String orders;

		private String product3;

		private String product1;

		private String projectName;

		private String product2;

		private String sourceId;

		private String product1Name;

		private Integer moveExecuteQty;

		private Integer useL2PoolCnt;

		private String ascriptionClass;

		private String expectTurnOverDateStr;

		private String deployProduct1;

		private String dcsSource;

		private String deployProduct3;

		private String deployProduct2;

		private Integer moveQty;

		private String usePoolMoveDetail;

		private String logicZone;

		private String supplyArea;

		private String manufacturingBrandCode;

		private Boolean executeFlag;

		private String demandClass;

		private Integer moveDeliveredQty;

		private String tenantId;

		private String deployProduct3Name;

		private Boolean autoExecute;

		private Integer demandQty;

		private String businessType;

		private String idc;

		private String brandCode;

		private String creator;

		private Long brandId;

		private String installName;

		private String evaluateStatus;

		private Long manufacturingBrandId;

		private String safeYear;

		private String moveOrders;

		private String supplyLevel;

		private String requireTypeName;

		private String configModel;

		private String updater;

		private Long expectTurnOverDate;

		private String supplyType;

		private String deployProduct1Name;

		private Boolean install;

		private Integer useSupplyCnt;

		private String azone;

		private Integer purchaseCnt;

		private String shiftMethod;

		private Integer benefitOld;

		private String industryLine;

		private String purchaseOrders;

		private String fcstId;

		private String priority;

		private Integer usePlanCnt;

		private Integer rackAssignCnt;

		private String assignVersion;

		private String featureStr;

		private String executeError;

		private String assetReceiver;

		private Integer usePoolInPlaceCnt;

		private String sectionRackStatus;

		private String projectType;

		private String region;

		private Long sectionRackAvailableDate;

		private String dcsSourceId;

		private String operator;

		private String classZone;

		private String org;

		private String manualBrandName;

		private Long gmtModified;

		private String classZoneName;

		private String replenishUnit;

		private String source;

		private String product2Name;

		private Integer executeQty;

		private String usePoolInPlaceDetail;

		private Integer supplyDeliveredQty;

		private Map<Object,Object> features;

		private String projectCode;

		private Long installId;

		private Integer sectionRackAssignCnt;

		private Integer usePoolMoveCnt;

		private String appGroup;

		private String comments;

		private Integer usePoolCnt;

		private String osName;

		private String cluster;

		private Boolean ableExecute;

		private String usePoolDetail;

		private String businessTypeName;

		private Long useSupplyDate;

		private String preExecuteRequest;

		private String safeZone;

		private List<String> rackInfo;

		private DemandDeploy demandDeploy;

		private DemandItem demandItem;

		public String getAscriptionClassName() {
			return this.ascriptionClassName;
		}

		public void setAscriptionClassName(String ascriptionClassName) {
			this.ascriptionClassName = ascriptionClassName;
		}

		public String getDeployProduct2Name() {
			return this.deployProduct2Name;
		}

		public void setDeployProduct2Name(String deployProduct2Name) {
			this.deployProduct2Name = deployProduct2Name;
		}

		public Long getDcsId() {
			return this.dcsId;
		}

		public void setDcsId(Long dcsId) {
			this.dcsId = dcsId;
		}

		public String getDataError() {
			return this.dataError;
		}

		public void setDataError(String dataError) {
			this.dataError = dataError;
		}

		public String getItemType() {
			return this.itemType;
		}

		public void setItemType(String itemType) {
			this.itemType = itemType;
		}

		public Long getUkUseId() {
			return this.ukUseId;
		}

		public void setUkUseId(Long ukUseId) {
			this.ukUseId = ukUseId;
		}

		public Integer getMatchCnt() {
			return this.matchCnt;
		}

		public void setMatchCnt(Integer matchCnt) {
			this.matchCnt = matchCnt;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public String getBusinessMode() {
			return this.businessMode;
		}

		public void setBusinessMode(String businessMode) {
			this.businessMode = businessMode;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getItem() {
			return this.item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public Boolean getFactoryInstall() {
			return this.factoryInstall;
		}

		public void setFactoryInstall(Boolean factoryInstall) {
			this.factoryInstall = factoryInstall;
		}

		public String getRequireType() {
			return this.requireType;
		}

		public void setRequireType(String requireType) {
			this.requireType = requireType;
		}

		public Integer getModelLoad() {
			return this.modelLoad;
		}

		public void setModelLoad(Integer modelLoad) {
			this.modelLoad = modelLoad;
		}

		public Integer getServerAssignCnt() {
			return this.serverAssignCnt;
		}

		public void setServerAssignCnt(Integer serverAssignCnt) {
			this.serverAssignCnt = serverAssignCnt;
		}

		public Long getOsId() {
			return this.osId;
		}

		public void setOsId(Long osId) {
			this.osId = osId;
		}

		public Long getConsistentId() {
			return this.consistentId;
		}

		public void setConsistentId(Long consistentId) {
			this.consistentId = consistentId;
		}

		public Integer getLadingProcessQty() {
			return this.ladingProcessQty;
		}

		public void setLadingProcessQty(Integer ladingProcessQty) {
			this.ladingProcessQty = ladingProcessQty;
		}

		public Long getQuotaPlanId() {
			return this.quotaPlanId;
		}

		public void setQuotaPlanId(Long quotaPlanId) {
			this.quotaPlanId = quotaPlanId;
		}

		public String getDeliveryType() {
			return this.deliveryType;
		}

		public void setDeliveryType(String deliveryType) {
			this.deliveryType = deliveryType;
		}

		public Boolean getDataFlag() {
			return this.dataFlag;
		}

		public void setDataFlag(Boolean dataFlag) {
			this.dataFlag = dataFlag;
		}

		public String getProjectTypeName() {
			return this.projectTypeName;
		}

		public void setProjectTypeName(String projectTypeName) {
			this.projectTypeName = projectTypeName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCbmOwner() {
			return this.cbmOwner;
		}

		public void setCbmOwner(String cbmOwner) {
			this.cbmOwner = cbmOwner;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getProduct3Name() {
			return this.product3Name;
		}

		public void setProduct3Name(String product3Name) {
			this.product3Name = product3Name;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public String getNetworkArch() {
			return this.networkArch;
		}

		public void setNetworkArch(String networkArch) {
			this.networkArch = networkArch;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getScPlanIds() {
			return this.scPlanIds;
		}

		public void setScPlanIds(String scPlanIds) {
			this.scPlanIds = scPlanIds;
		}

		public Integer getSupplyQty() {
			return this.supplyQty;
		}

		public void setSupplyQty(Integer supplyQty) {
			this.supplyQty = supplyQty;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAssetReceiverNick() {
			return this.assetReceiverNick;
		}

		public void setAssetReceiverNick(String assetReceiverNick) {
			this.assetReceiverNick = assetReceiverNick;
		}

		public Integer getUseCapacityCnt() {
			return this.useCapacityCnt;
		}

		public void setUseCapacityCnt(Integer useCapacityCnt) {
			this.useCapacityCnt = useCapacityCnt;
		}

		public String getOrders() {
			return this.orders;
		}

		public void setOrders(String orders) {
			this.orders = orders;
		}

		public String getProduct3() {
			return this.product3;
		}

		public void setProduct3(String product3) {
			this.product3 = product3;
		}

		public String getProduct1() {
			return this.product1;
		}

		public void setProduct1(String product1) {
			this.product1 = product1;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProduct2() {
			return this.product2;
		}

		public void setProduct2(String product2) {
			this.product2 = product2;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getProduct1Name() {
			return this.product1Name;
		}

		public void setProduct1Name(String product1Name) {
			this.product1Name = product1Name;
		}

		public Integer getMoveExecuteQty() {
			return this.moveExecuteQty;
		}

		public void setMoveExecuteQty(Integer moveExecuteQty) {
			this.moveExecuteQty = moveExecuteQty;
		}

		public Integer getUseL2PoolCnt() {
			return this.useL2PoolCnt;
		}

		public void setUseL2PoolCnt(Integer useL2PoolCnt) {
			this.useL2PoolCnt = useL2PoolCnt;
		}

		public String getAscriptionClass() {
			return this.ascriptionClass;
		}

		public void setAscriptionClass(String ascriptionClass) {
			this.ascriptionClass = ascriptionClass;
		}

		public String getExpectTurnOverDateStr() {
			return this.expectTurnOverDateStr;
		}

		public void setExpectTurnOverDateStr(String expectTurnOverDateStr) {
			this.expectTurnOverDateStr = expectTurnOverDateStr;
		}

		public String getDeployProduct1() {
			return this.deployProduct1;
		}

		public void setDeployProduct1(String deployProduct1) {
			this.deployProduct1 = deployProduct1;
		}

		public String getDcsSource() {
			return this.dcsSource;
		}

		public void setDcsSource(String dcsSource) {
			this.dcsSource = dcsSource;
		}

		public String getDeployProduct3() {
			return this.deployProduct3;
		}

		public void setDeployProduct3(String deployProduct3) {
			this.deployProduct3 = deployProduct3;
		}

		public String getDeployProduct2() {
			return this.deployProduct2;
		}

		public void setDeployProduct2(String deployProduct2) {
			this.deployProduct2 = deployProduct2;
		}

		public Integer getMoveQty() {
			return this.moveQty;
		}

		public void setMoveQty(Integer moveQty) {
			this.moveQty = moveQty;
		}

		public String getUsePoolMoveDetail() {
			return this.usePoolMoveDetail;
		}

		public void setUsePoolMoveDetail(String usePoolMoveDetail) {
			this.usePoolMoveDetail = usePoolMoveDetail;
		}

		public String getLogicZone() {
			return this.logicZone;
		}

		public void setLogicZone(String logicZone) {
			this.logicZone = logicZone;
		}

		public String getSupplyArea() {
			return this.supplyArea;
		}

		public void setSupplyArea(String supplyArea) {
			this.supplyArea = supplyArea;
		}

		public String getManufacturingBrandCode() {
			return this.manufacturingBrandCode;
		}

		public void setManufacturingBrandCode(String manufacturingBrandCode) {
			this.manufacturingBrandCode = manufacturingBrandCode;
		}

		public Boolean getExecuteFlag() {
			return this.executeFlag;
		}

		public void setExecuteFlag(Boolean executeFlag) {
			this.executeFlag = executeFlag;
		}

		public String getDemandClass() {
			return this.demandClass;
		}

		public void setDemandClass(String demandClass) {
			this.demandClass = demandClass;
		}

		public Integer getMoveDeliveredQty() {
			return this.moveDeliveredQty;
		}

		public void setMoveDeliveredQty(Integer moveDeliveredQty) {
			this.moveDeliveredQty = moveDeliveredQty;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getDeployProduct3Name() {
			return this.deployProduct3Name;
		}

		public void setDeployProduct3Name(String deployProduct3Name) {
			this.deployProduct3Name = deployProduct3Name;
		}

		public Boolean getAutoExecute() {
			return this.autoExecute;
		}

		public void setAutoExecute(Boolean autoExecute) {
			this.autoExecute = autoExecute;
		}

		public Integer getDemandQty() {
			return this.demandQty;
		}

		public void setDemandQty(Integer demandQty) {
			this.demandQty = demandQty;
		}

		public String getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public String getBrandCode() {
			return this.brandCode;
		}

		public void setBrandCode(String brandCode) {
			this.brandCode = brandCode;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Long getBrandId() {
			return this.brandId;
		}

		public void setBrandId(Long brandId) {
			this.brandId = brandId;
		}

		public String getInstallName() {
			return this.installName;
		}

		public void setInstallName(String installName) {
			this.installName = installName;
		}

		public String getEvaluateStatus() {
			return this.evaluateStatus;
		}

		public void setEvaluateStatus(String evaluateStatus) {
			this.evaluateStatus = evaluateStatus;
		}

		public Long getManufacturingBrandId() {
			return this.manufacturingBrandId;
		}

		public void setManufacturingBrandId(Long manufacturingBrandId) {
			this.manufacturingBrandId = manufacturingBrandId;
		}

		public String getSafeYear() {
			return this.safeYear;
		}

		public void setSafeYear(String safeYear) {
			this.safeYear = safeYear;
		}

		public String getMoveOrders() {
			return this.moveOrders;
		}

		public void setMoveOrders(String moveOrders) {
			this.moveOrders = moveOrders;
		}

		public String getSupplyLevel() {
			return this.supplyLevel;
		}

		public void setSupplyLevel(String supplyLevel) {
			this.supplyLevel = supplyLevel;
		}

		public String getRequireTypeName() {
			return this.requireTypeName;
		}

		public void setRequireTypeName(String requireTypeName) {
			this.requireTypeName = requireTypeName;
		}

		public String getConfigModel() {
			return this.configModel;
		}

		public void setConfigModel(String configModel) {
			this.configModel = configModel;
		}

		public String getUpdater() {
			return this.updater;
		}

		public void setUpdater(String updater) {
			this.updater = updater;
		}

		public Long getExpectTurnOverDate() {
			return this.expectTurnOverDate;
		}

		public void setExpectTurnOverDate(Long expectTurnOverDate) {
			this.expectTurnOverDate = expectTurnOverDate;
		}

		public String getSupplyType() {
			return this.supplyType;
		}

		public void setSupplyType(String supplyType) {
			this.supplyType = supplyType;
		}

		public String getDeployProduct1Name() {
			return this.deployProduct1Name;
		}

		public void setDeployProduct1Name(String deployProduct1Name) {
			this.deployProduct1Name = deployProduct1Name;
		}

		public Boolean getInstall() {
			return this.install;
		}

		public void setInstall(Boolean install) {
			this.install = install;
		}

		public Integer getUseSupplyCnt() {
			return this.useSupplyCnt;
		}

		public void setUseSupplyCnt(Integer useSupplyCnt) {
			this.useSupplyCnt = useSupplyCnt;
		}

		public String getAzone() {
			return this.azone;
		}

		public void setAzone(String azone) {
			this.azone = azone;
		}

		public Integer getPurchaseCnt() {
			return this.purchaseCnt;
		}

		public void setPurchaseCnt(Integer purchaseCnt) {
			this.purchaseCnt = purchaseCnt;
		}

		public String getShiftMethod() {
			return this.shiftMethod;
		}

		public void setShiftMethod(String shiftMethod) {
			this.shiftMethod = shiftMethod;
		}

		public Integer getBenefitOld() {
			return this.benefitOld;
		}

		public void setBenefitOld(Integer benefitOld) {
			this.benefitOld = benefitOld;
		}

		public String getIndustryLine() {
			return this.industryLine;
		}

		public void setIndustryLine(String industryLine) {
			this.industryLine = industryLine;
		}

		public String getPurchaseOrders() {
			return this.purchaseOrders;
		}

		public void setPurchaseOrders(String purchaseOrders) {
			this.purchaseOrders = purchaseOrders;
		}

		public String getFcstId() {
			return this.fcstId;
		}

		public void setFcstId(String fcstId) {
			this.fcstId = fcstId;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Integer getUsePlanCnt() {
			return this.usePlanCnt;
		}

		public void setUsePlanCnt(Integer usePlanCnt) {
			this.usePlanCnt = usePlanCnt;
		}

		public Integer getRackAssignCnt() {
			return this.rackAssignCnt;
		}

		public void setRackAssignCnt(Integer rackAssignCnt) {
			this.rackAssignCnt = rackAssignCnt;
		}

		public String getAssignVersion() {
			return this.assignVersion;
		}

		public void setAssignVersion(String assignVersion) {
			this.assignVersion = assignVersion;
		}

		public String getFeatureStr() {
			return this.featureStr;
		}

		public void setFeatureStr(String featureStr) {
			this.featureStr = featureStr;
		}

		public String getExecuteError() {
			return this.executeError;
		}

		public void setExecuteError(String executeError) {
			this.executeError = executeError;
		}

		public String getAssetReceiver() {
			return this.assetReceiver;
		}

		public void setAssetReceiver(String assetReceiver) {
			this.assetReceiver = assetReceiver;
		}

		public Integer getUsePoolInPlaceCnt() {
			return this.usePoolInPlaceCnt;
		}

		public void setUsePoolInPlaceCnt(Integer usePoolInPlaceCnt) {
			this.usePoolInPlaceCnt = usePoolInPlaceCnt;
		}

		public String getSectionRackStatus() {
			return this.sectionRackStatus;
		}

		public void setSectionRackStatus(String sectionRackStatus) {
			this.sectionRackStatus = sectionRackStatus;
		}

		public String getProjectType() {
			return this.projectType;
		}

		public void setProjectType(String projectType) {
			this.projectType = projectType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getSectionRackAvailableDate() {
			return this.sectionRackAvailableDate;
		}

		public void setSectionRackAvailableDate(Long sectionRackAvailableDate) {
			this.sectionRackAvailableDate = sectionRackAvailableDate;
		}

		public String getDcsSourceId() {
			return this.dcsSourceId;
		}

		public void setDcsSourceId(String dcsSourceId) {
			this.dcsSourceId = dcsSourceId;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getClassZone() {
			return this.classZone;
		}

		public void setClassZone(String classZone) {
			this.classZone = classZone;
		}

		public String getOrg() {
			return this.org;
		}

		public void setOrg(String org) {
			this.org = org;
		}

		public String getManualBrandName() {
			return this.manualBrandName;
		}

		public void setManualBrandName(String manualBrandName) {
			this.manualBrandName = manualBrandName;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getClassZoneName() {
			return this.classZoneName;
		}

		public void setClassZoneName(String classZoneName) {
			this.classZoneName = classZoneName;
		}

		public String getReplenishUnit() {
			return this.replenishUnit;
		}

		public void setReplenishUnit(String replenishUnit) {
			this.replenishUnit = replenishUnit;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getProduct2Name() {
			return this.product2Name;
		}

		public void setProduct2Name(String product2Name) {
			this.product2Name = product2Name;
		}

		public Integer getExecuteQty() {
			return this.executeQty;
		}

		public void setExecuteQty(Integer executeQty) {
			this.executeQty = executeQty;
		}

		public String getUsePoolInPlaceDetail() {
			return this.usePoolInPlaceDetail;
		}

		public void setUsePoolInPlaceDetail(String usePoolInPlaceDetail) {
			this.usePoolInPlaceDetail = usePoolInPlaceDetail;
		}

		public Integer getSupplyDeliveredQty() {
			return this.supplyDeliveredQty;
		}

		public void setSupplyDeliveredQty(Integer supplyDeliveredQty) {
			this.supplyDeliveredQty = supplyDeliveredQty;
		}

		public Map<Object,Object> getFeatures() {
			return this.features;
		}

		public void setFeatures(Map<Object,Object> features) {
			this.features = features;
		}

		public String getProjectCode() {
			return this.projectCode;
		}

		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}

		public Long getInstallId() {
			return this.installId;
		}

		public void setInstallId(Long installId) {
			this.installId = installId;
		}

		public Integer getSectionRackAssignCnt() {
			return this.sectionRackAssignCnt;
		}

		public void setSectionRackAssignCnt(Integer sectionRackAssignCnt) {
			this.sectionRackAssignCnt = sectionRackAssignCnt;
		}

		public Integer getUsePoolMoveCnt() {
			return this.usePoolMoveCnt;
		}

		public void setUsePoolMoveCnt(Integer usePoolMoveCnt) {
			this.usePoolMoveCnt = usePoolMoveCnt;
		}

		public String getAppGroup() {
			return this.appGroup;
		}

		public void setAppGroup(String appGroup) {
			this.appGroup = appGroup;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public Integer getUsePoolCnt() {
			return this.usePoolCnt;
		}

		public void setUsePoolCnt(Integer usePoolCnt) {
			this.usePoolCnt = usePoolCnt;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public Boolean getAbleExecute() {
			return this.ableExecute;
		}

		public void setAbleExecute(Boolean ableExecute) {
			this.ableExecute = ableExecute;
		}

		public String getUsePoolDetail() {
			return this.usePoolDetail;
		}

		public void setUsePoolDetail(String usePoolDetail) {
			this.usePoolDetail = usePoolDetail;
		}

		public String getBusinessTypeName() {
			return this.businessTypeName;
		}

		public void setBusinessTypeName(String businessTypeName) {
			this.businessTypeName = businessTypeName;
		}

		public Long getUseSupplyDate() {
			return this.useSupplyDate;
		}

		public void setUseSupplyDate(Long useSupplyDate) {
			this.useSupplyDate = useSupplyDate;
		}

		public String getPreExecuteRequest() {
			return this.preExecuteRequest;
		}

		public void setPreExecuteRequest(String preExecuteRequest) {
			this.preExecuteRequest = preExecuteRequest;
		}

		public String getSafeZone() {
			return this.safeZone;
		}

		public void setSafeZone(String safeZone) {
			this.safeZone = safeZone;
		}

		public List<String> getRackInfo() {
			return this.rackInfo;
		}

		public void setRackInfo(List<String> rackInfo) {
			this.rackInfo = rackInfo;
		}

		public DemandDeploy getDemandDeploy() {
			return this.demandDeploy;
		}

		public void setDemandDeploy(DemandDeploy demandDeploy) {
			this.demandDeploy = demandDeploy;
		}

		public DemandItem getDemandItem() {
			return this.demandItem;
		}

		public void setDemandItem(DemandItem demandItem) {
			this.demandItem = demandItem;
		}

		public static class DemandDeploy {

			private String netArch;

			private String frameworkClass;

			private String deployMode;

			private String deployLocation;

			private String deployArch;

			private String nodeType;

			private String deployLevel;

			private String boxModel;

			private String publicNetWorkExport;

			private String boxUpLink;

			private String deployRole;

			private String boxDownLink;

			public String getNetArch() {
				return this.netArch;
			}

			public void setNetArch(String netArch) {
				this.netArch = netArch;
			}

			public String getFrameworkClass() {
				return this.frameworkClass;
			}

			public void setFrameworkClass(String frameworkClass) {
				this.frameworkClass = frameworkClass;
			}

			public String getDeployMode() {
				return this.deployMode;
			}

			public void setDeployMode(String deployMode) {
				this.deployMode = deployMode;
			}

			public String getDeployLocation() {
				return this.deployLocation;
			}

			public void setDeployLocation(String deployLocation) {
				this.deployLocation = deployLocation;
			}

			public String getDeployArch() {
				return this.deployArch;
			}

			public void setDeployArch(String deployArch) {
				this.deployArch = deployArch;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getDeployLevel() {
				return this.deployLevel;
			}

			public void setDeployLevel(String deployLevel) {
				this.deployLevel = deployLevel;
			}

			public String getBoxModel() {
				return this.boxModel;
			}

			public void setBoxModel(String boxModel) {
				this.boxModel = boxModel;
			}

			public String getPublicNetWorkExport() {
				return this.publicNetWorkExport;
			}

			public void setPublicNetWorkExport(String publicNetWorkExport) {
				this.publicNetWorkExport = publicNetWorkExport;
			}

			public String getBoxUpLink() {
				return this.boxUpLink;
			}

			public void setBoxUpLink(String boxUpLink) {
				this.boxUpLink = boxUpLink;
			}

			public String getDeployRole() {
				return this.deployRole;
			}

			public void setDeployRole(String deployRole) {
				this.deployRole = deployRole;
			}

			public String getBoxDownLink() {
				return this.boxDownLink;
			}

			public void setBoxDownLink(String boxDownLink) {
				this.boxDownLink = boxDownLink;
			}
		}

		public static class DemandItem {

			private String demandItemType;

			private ServerDTO serverDTO;

			private NetPackValue netPackValue;

			private PubNetAccessValue pubNetAccessValue;

			private ServiceValue serviceValue;

			private ComboValue comboValue;

			private RackValue rackValue;

			private ExchangeValue exchangeValue;

			public String getDemandItemType() {
				return this.demandItemType;
			}

			public void setDemandItemType(String demandItemType) {
				this.demandItemType = demandItemType;
			}

			public ServerDTO getServerDTO() {
				return this.serverDTO;
			}

			public void setServerDTO(ServerDTO serverDTO) {
				this.serverDTO = serverDTO;
			}

			public NetPackValue getNetPackValue() {
				return this.netPackValue;
			}

			public void setNetPackValue(NetPackValue netPackValue) {
				this.netPackValue = netPackValue;
			}

			public PubNetAccessValue getPubNetAccessValue() {
				return this.pubNetAccessValue;
			}

			public void setPubNetAccessValue(PubNetAccessValue pubNetAccessValue) {
				this.pubNetAccessValue = pubNetAccessValue;
			}

			public ServiceValue getServiceValue() {
				return this.serviceValue;
			}

			public void setServiceValue(ServiceValue serviceValue) {
				this.serviceValue = serviceValue;
			}

			public ComboValue getComboValue() {
				return this.comboValue;
			}

			public void setComboValue(ComboValue comboValue) {
				this.comboValue = comboValue;
			}

			public RackValue getRackValue() {
				return this.rackValue;
			}

			public void setRackValue(RackValue rackValue) {
				this.rackValue = rackValue;
			}

			public ExchangeValue getExchangeValue() {
				return this.exchangeValue;
			}

			public void setExchangeValue(ExchangeValue exchangeValue) {
				this.exchangeValue = exchangeValue;
			}

			public static class ServerDTO {

				private String config;

				private String model;

				private String nic;

				public String getConfig() {
					return this.config;
				}

				public void setConfig(String config) {
					this.config = config;
				}

				public String getModel() {
					return this.model;
				}

				public void setModel(String model) {
					this.model = model;
				}

				public String getNic() {
					return this.nic;
				}

				public void setNic(String nic) {
					this.nic = nic;
				}
			}

			public static class NetPackValue {

				private List<ItemListItem> itemList;

				public List<ItemListItem> getItemList() {
					return this.itemList;
				}

				public void setItemList(List<ItemListItem> itemList) {
					this.itemList = itemList;
				}

				public static class ItemListItem {

					private String role;

					private Long demandQty;

					private String resourceType;

					private String framework;

					private String remark;

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}

					public Long getDemandQty() {
						return this.demandQty;
					}

					public void setDemandQty(Long demandQty) {
						this.demandQty = demandQty;
					}

					public String getResourceType() {
						return this.resourceType;
					}

					public void setResourceType(String resourceType) {
						this.resourceType = resourceType;
					}

					public String getFramework() {
						return this.framework;
					}

					public void setFramework(String framework) {
						this.framework = framework;
					}

					public String getRemark() {
						return this.remark;
					}

					public void setRemark(String remark) {
						this.remark = remark;
					}
				}
			}

			public static class PubNetAccessValue {

				private List<ItemListItem2> itemList1;

				public List<ItemListItem2> getItemList1() {
					return this.itemList1;
				}

				public void setItemList1(List<ItemListItem2> itemList1) {
					this.itemList1 = itemList1;
				}

				public static class ItemListItem2 {

					private String price;

					private Float bandwidth;

					private String accessType;

					public String getPrice() {
						return this.price;
					}

					public void setPrice(String price) {
						this.price = price;
					}

					public Float getBandwidth() {
						return this.bandwidth;
					}

					public void setBandwidth(Float bandwidth) {
						this.bandwidth = bandwidth;
					}

					public String getAccessType() {
						return this.accessType;
					}

					public void setAccessType(String accessType) {
						this.accessType = accessType;
					}
				}
			}

			public static class ServiceValue {

				private List<ItemListItem4> itemList3;

				public List<ItemListItem4> getItemList3() {
					return this.itemList3;
				}

				public void setItemList3(List<ItemListItem4> itemList3) {
					this.itemList3 = itemList3;
				}

				public static class ItemListItem4 {

					private String serviceTypeName;

					private String area;

					private Float year;

					private String serviceType;

					private Integer amount;

					private String idc;

					private String serviceItemName;

					private String city;

					private String serviceItem;

					private String remark;

					public String getServiceTypeName() {
						return this.serviceTypeName;
					}

					public void setServiceTypeName(String serviceTypeName) {
						this.serviceTypeName = serviceTypeName;
					}

					public String getArea() {
						return this.area;
					}

					public void setArea(String area) {
						this.area = area;
					}

					public Float getYear() {
						return this.year;
					}

					public void setYear(Float year) {
						this.year = year;
					}

					public String getServiceType() {
						return this.serviceType;
					}

					public void setServiceType(String serviceType) {
						this.serviceType = serviceType;
					}

					public Integer getAmount() {
						return this.amount;
					}

					public void setAmount(Integer amount) {
						this.amount = amount;
					}

					public String getIdc() {
						return this.idc;
					}

					public void setIdc(String idc) {
						this.idc = idc;
					}

					public String getServiceItemName() {
						return this.serviceItemName;
					}

					public void setServiceItemName(String serviceItemName) {
						this.serviceItemName = serviceItemName;
					}

					public String getCity() {
						return this.city;
					}

					public void setCity(String city) {
						this.city = city;
					}

					public String getServiceItem() {
						return this.serviceItem;
					}

					public void setServiceItem(String serviceItem) {
						this.serviceItem = serviceItem;
					}

					public String getRemark() {
						return this.remark;
					}

					public void setRemark(String remark) {
						this.remark = remark;
					}
				}
			}

			public static class ComboValue {

				private String skuId;

				private List<ServerDemandListItem> serverDemandList;

				private List<WholeRackListItem> wholeRackList;

				public String getSkuId() {
					return this.skuId;
				}

				public void setSkuId(String skuId) {
					this.skuId = skuId;
				}

				public List<ServerDemandListItem> getServerDemandList() {
					return this.serverDemandList;
				}

				public void setServerDemandList(List<ServerDemandListItem> serverDemandList) {
					this.serverDemandList = serverDemandList;
				}

				public List<WholeRackListItem> getWholeRackList() {
					return this.wholeRackList;
				}

				public void setWholeRackList(List<WholeRackListItem> wholeRackList) {
					this.wholeRackList = wholeRackList;
				}

				public static class ServerDemandListItem {

					private String item;

					private String product3;

					private Integer agreedQuantity;

					private Integer quantity;

					private String skuId;

					private String appGroup;

					private List<String> snList;

					public String getItem() {
						return this.item;
					}

					public void setItem(String item) {
						this.item = item;
					}

					public String getProduct3() {
						return this.product3;
					}

					public void setProduct3(String product3) {
						this.product3 = product3;
					}

					public Integer getAgreedQuantity() {
						return this.agreedQuantity;
					}

					public void setAgreedQuantity(Integer agreedQuantity) {
						this.agreedQuantity = agreedQuantity;
					}

					public Integer getQuantity() {
						return this.quantity;
					}

					public void setQuantity(Integer quantity) {
						this.quantity = quantity;
					}

					public String getSkuId() {
						return this.skuId;
					}

					public void setSkuId(String skuId) {
						this.skuId = skuId;
					}

					public String getAppGroup() {
						return this.appGroup;
					}

					public void setAppGroup(String appGroup) {
						this.appGroup = appGroup;
					}

					public List<String> getSnList() {
						return this.snList;
					}

					public void setSnList(List<String> snList) {
						this.snList = snList;
					}
				}

				public static class WholeRackListItem {

					private String order;

					private String rackPackage;

					private List<ServerDemandListItem6> serverDemandList5;

					public String getOrder() {
						return this.order;
					}

					public void setOrder(String order) {
						this.order = order;
					}

					public String getRackPackage() {
						return this.rackPackage;
					}

					public void setRackPackage(String rackPackage) {
						this.rackPackage = rackPackage;
					}

					public List<ServerDemandListItem6> getServerDemandList5() {
						return this.serverDemandList5;
					}

					public void setServerDemandList5(List<ServerDemandListItem6> serverDemandList5) {
						this.serverDemandList5 = serverDemandList5;
					}

					public static class ServerDemandListItem6 {

						private String item;

						private String product3;

						private Integer agreedQuantity;

						private Integer quantity;

						private String skuId;

						private String appGroup;

						private List<String> snList7;

						public String getItem() {
							return this.item;
						}

						public void setItem(String item) {
							this.item = item;
						}

						public String getProduct3() {
							return this.product3;
						}

						public void setProduct3(String product3) {
							this.product3 = product3;
						}

						public Integer getAgreedQuantity() {
							return this.agreedQuantity;
						}

						public void setAgreedQuantity(Integer agreedQuantity) {
							this.agreedQuantity = agreedQuantity;
						}

						public Integer getQuantity() {
							return this.quantity;
						}

						public void setQuantity(Integer quantity) {
							this.quantity = quantity;
						}

						public String getSkuId() {
							return this.skuId;
						}

						public void setSkuId(String skuId) {
							this.skuId = skuId;
						}

						public String getAppGroup() {
							return this.appGroup;
						}

						public void setAppGroup(String appGroup) {
							this.appGroup = appGroup;
						}

						public List<String> getSnList7() {
							return this.snList7;
						}

						public void setSnList7(List<String> snList7) {
							this.snList7 = snList7;
						}
					}
				}
			}

			public static class RackValue {

				private List<ItemListItem9> itemList8;

				public List<ItemListItem9> getItemList8() {
					return this.itemList8;
				}

				public void setItemList8(List<ItemListItem9> itemList8) {
					this.itemList8 = itemList8;
				}

				public static class ItemListItem9 {

					private Integer rackNum;

					private String roomCode;

					private String power;

					private Float powUtilizationRate;

					public Integer getRackNum() {
						return this.rackNum;
					}

					public void setRackNum(Integer rackNum) {
						this.rackNum = rackNum;
					}

					public String getRoomCode() {
						return this.roomCode;
					}

					public void setRoomCode(String roomCode) {
						this.roomCode = roomCode;
					}

					public String getPower() {
						return this.power;
					}

					public void setPower(String power) {
						this.power = power;
					}

					public Float getPowUtilizationRate() {
						return this.powUtilizationRate;
					}

					public void setPowUtilizationRate(Float powUtilizationRate) {
						this.powUtilizationRate = powUtilizationRate;
					}
				}
			}

			public static class ExchangeValue {

				private List<ServerDemandListItem11> serverDemandList10;

				private List<String> exchangeList;

				public List<ServerDemandListItem11> getServerDemandList10() {
					return this.serverDemandList10;
				}

				public void setServerDemandList10(List<ServerDemandListItem11> serverDemandList10) {
					this.serverDemandList10 = serverDemandList10;
				}

				public List<String> getExchangeList() {
					return this.exchangeList;
				}

				public void setExchangeList(List<String> exchangeList) {
					this.exchangeList = exchangeList;
				}

				public static class ServerDemandListItem11 {

					private String item;

					private String product3;

					private Integer agreedQuantity;

					private Integer quantity;

					private String skuId;

					private String appGroup;

					private List<String> snList12;

					public String getItem() {
						return this.item;
					}

					public void setItem(String item) {
						this.item = item;
					}

					public String getProduct3() {
						return this.product3;
					}

					public void setProduct3(String product3) {
						this.product3 = product3;
					}

					public Integer getAgreedQuantity() {
						return this.agreedQuantity;
					}

					public void setAgreedQuantity(Integer agreedQuantity) {
						this.agreedQuantity = agreedQuantity;
					}

					public Integer getQuantity() {
						return this.quantity;
					}

					public void setQuantity(Integer quantity) {
						this.quantity = quantity;
					}

					public String getSkuId() {
						return this.skuId;
					}

					public void setSkuId(String skuId) {
						this.skuId = skuId;
					}

					public String getAppGroup() {
						return this.appGroup;
					}

					public void setAppGroup(String appGroup) {
						this.appGroup = appGroup;
					}

					public List<String> getSnList12() {
						return this.snList12;
					}

					public void setSnList12(List<String> snList12) {
						this.snList12 = snList12;
					}
				}
			}
		}
	}

	@Override
	public GetSolutionListResponse getInstance(UnmarshallerContext context) {
		return	GetSolutionListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
