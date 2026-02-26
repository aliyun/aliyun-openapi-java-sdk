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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckReceiveRequest extends RpcAcsRequest<CheckReceiveResponse> {
	   

	@SerializedName("demandRequestList")
	private List<DemandRequestList> demandRequestList;
	public CheckReceiveRequest() {
		super("brinekingdom", "2019-06-27", "CheckReceive");
		setMethod(MethodType.POST);
	}

	public List<DemandRequestList> getDemandRequestList() {
		return this.demandRequestList;
	}

	public void setDemandRequestList(List<DemandRequestList> demandRequestList) {
		this.demandRequestList = demandRequestList;	
		if (demandRequestList != null) {
			putQueryParameter("DemandRequestList" , new Gson().toJson(demandRequestList));
		}	
	}

	public static class DemandRequestList {

		@SerializedName("Cluster")
		private String cluster;

		@SerializedName("RackInfo")
		private List<String> rackInfo;

		@SerializedName("SafeZone")
		private String safeZone;

		@SerializedName("ChangeCnt")
		private Integer changeCnt;

		@SerializedName("ExpectTurnOverDateStr")
		private String expectTurnOverDateStr;

		@SerializedName("ProjectCode")
		private String projectCode;

		@SerializedName("Source")
		private String source;

		@SerializedName("SupplyLevel")
		private String supplyLevel;

		@SerializedName("Operator")
		private String operator;

		@SerializedName("BusinessType")
		private String businessType;

		@SerializedName("ProductType")
		private String productType;

		@SerializedName("Product3")
		private String product3;

		@SerializedName("Features")
		private Map<String,String> features;

		@SerializedName("FactoryInstall")
		private Boolean factoryInstall;

		@SerializedName("ShiftMethod")
		private String shiftMethod;

		@SerializedName("DemandDeploy")
		private DemandDeploy demandDeploy;

		@SerializedName("AssetReceiverNick")
		private String assetReceiverNick;

		@SerializedName("Azone")
		private String azone;

		@SerializedName("OsName")
		private String osName;

		@SerializedName("ProjectTypeName")
		private String projectTypeName;

		@SerializedName("Item")
		private String item;

		@SerializedName("ProjectName")
		private String projectName;

		@SerializedName("Idc")
		private String idc;

		@SerializedName("AssetReceiver")
		private String assetReceiver;

		@SerializedName("Priority")
		private String priority;

		@SerializedName("SupplyCnt")
		private Integer supplyCnt;

		@SerializedName("RequireType")
		private String requireType;

		@SerializedName("Install")
		private Boolean install;

		@SerializedName("ModelLoad")
		private Integer modelLoad;

		@SerializedName("Region")
		private String region;

		@SerializedName("AscriptionClassName")
		private String ascriptionClassName;

		@SerializedName("OsId")
		private Long osId;

		@SerializedName("InstallId")
		private Long installId;

		@SerializedName("Uid")
		private String uid;

		@SerializedName("Scenario")
		private String scenario;

		@SerializedName("DemandQty")
		private Integer demandQty;

		@SerializedName("TenantId")
		private String tenantId;

		@SerializedName("ClassZone")
		private String classZone;

		@SerializedName("AscriptionClass")
		private String ascriptionClass;

		@SerializedName("ProjectType")
		private String projectType;

		@SerializedName("NetworkArch")
		private String networkArch;

		@SerializedName("SourceId")
		private String sourceId;

		@SerializedName("Comments")
		private String comments;

		@SerializedName("Org")
		private String org;

		@SerializedName("MoveCnt")
		private Integer moveCnt;

		@SerializedName("InstallName")
		private String installName;

		@SerializedName("DemandItem")
		private DemandItem demandItem;

		@SerializedName("DeployProduct3")
		private String deployProduct3;

		@SerializedName("BenefitOld")
		private Integer benefitOld;

		@SerializedName("DemandClass")
		private String demandClass;

		@SerializedName("ItemType")
		private String itemType;

		@SerializedName("AppGroup")
		private String appGroup;

		@SerializedName("LogicZone")
		private String logicZone;

		@SerializedName("ConsistentDemandId")
		private Long consistentDemandId;

		@SerializedName("ReplenishUnit")
		private String replenishUnit;

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public List<String> getRackInfo() {
			return this.rackInfo;
		}

		public void setRackInfo(List<String> rackInfo) {
			this.rackInfo = rackInfo;
		}

		public String getSafeZone() {
			return this.safeZone;
		}

		public void setSafeZone(String safeZone) {
			this.safeZone = safeZone;
		}

		public Integer getChangeCnt() {
			return this.changeCnt;
		}

		public void setChangeCnt(Integer changeCnt) {
			this.changeCnt = changeCnt;
		}

		public String getExpectTurnOverDateStr() {
			return this.expectTurnOverDateStr;
		}

		public void setExpectTurnOverDateStr(String expectTurnOverDateStr) {
			this.expectTurnOverDateStr = expectTurnOverDateStr;
		}

		public String getProjectCode() {
			return this.projectCode;
		}

		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSupplyLevel() {
			return this.supplyLevel;
		}

		public void setSupplyLevel(String supplyLevel) {
			this.supplyLevel = supplyLevel;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getProduct3() {
			return this.product3;
		}

		public void setProduct3(String product3) {
			this.product3 = product3;
		}

		public Map<String,String> getFeatures() {
			return this.features;
		}

		public void setFeatures(Map<String,String> features) {
			this.features = features;
		}

		public Boolean getFactoryInstall() {
			return this.factoryInstall;
		}

		public void setFactoryInstall(Boolean factoryInstall) {
			this.factoryInstall = factoryInstall;
		}

		public String getShiftMethod() {
			return this.shiftMethod;
		}

		public void setShiftMethod(String shiftMethod) {
			this.shiftMethod = shiftMethod;
		}

		public DemandDeploy getDemandDeploy() {
			return this.demandDeploy;
		}

		public void setDemandDeploy(DemandDeploy demandDeploy) {
			this.demandDeploy = demandDeploy;
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

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getProjectTypeName() {
			return this.projectTypeName;
		}

		public void setProjectTypeName(String projectTypeName) {
			this.projectTypeName = projectTypeName;
		}

		public String getItem() {
			return this.item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public String getAssetReceiver() {
			return this.assetReceiver;
		}

		public void setAssetReceiver(String assetReceiver) {
			this.assetReceiver = assetReceiver;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Integer getSupplyCnt() {
			return this.supplyCnt;
		}

		public void setSupplyCnt(Integer supplyCnt) {
			this.supplyCnt = supplyCnt;
		}

		public String getRequireType() {
			return this.requireType;
		}

		public void setRequireType(String requireType) {
			this.requireType = requireType;
		}

		public Boolean getInstall() {
			return this.install;
		}

		public void setInstall(Boolean install) {
			this.install = install;
		}

		public Integer getModelLoad() {
			return this.modelLoad;
		}

		public void setModelLoad(Integer modelLoad) {
			this.modelLoad = modelLoad;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getAscriptionClassName() {
			return this.ascriptionClassName;
		}

		public void setAscriptionClassName(String ascriptionClassName) {
			this.ascriptionClassName = ascriptionClassName;
		}

		public Long getOsId() {
			return this.osId;
		}

		public void setOsId(Long osId) {
			this.osId = osId;
		}

		public Long getInstallId() {
			return this.installId;
		}

		public void setInstallId(Long installId) {
			this.installId = installId;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public Integer getDemandQty() {
			return this.demandQty;
		}

		public void setDemandQty(Integer demandQty) {
			this.demandQty = demandQty;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getClassZone() {
			return this.classZone;
		}

		public void setClassZone(String classZone) {
			this.classZone = classZone;
		}

		public String getAscriptionClass() {
			return this.ascriptionClass;
		}

		public void setAscriptionClass(String ascriptionClass) {
			this.ascriptionClass = ascriptionClass;
		}

		public String getProjectType() {
			return this.projectType;
		}

		public void setProjectType(String projectType) {
			this.projectType = projectType;
		}

		public String getNetworkArch() {
			return this.networkArch;
		}

		public void setNetworkArch(String networkArch) {
			this.networkArch = networkArch;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getOrg() {
			return this.org;
		}

		public void setOrg(String org) {
			this.org = org;
		}

		public Integer getMoveCnt() {
			return this.moveCnt;
		}

		public void setMoveCnt(Integer moveCnt) {
			this.moveCnt = moveCnt;
		}

		public String getInstallName() {
			return this.installName;
		}

		public void setInstallName(String installName) {
			this.installName = installName;
		}

		public DemandItem getDemandItem() {
			return this.demandItem;
		}

		public void setDemandItem(DemandItem demandItem) {
			this.demandItem = demandItem;
		}

		public String getDeployProduct3() {
			return this.deployProduct3;
		}

		public void setDeployProduct3(String deployProduct3) {
			this.deployProduct3 = deployProduct3;
		}

		public Integer getBenefitOld() {
			return this.benefitOld;
		}

		public void setBenefitOld(Integer benefitOld) {
			this.benefitOld = benefitOld;
		}

		public String getDemandClass() {
			return this.demandClass;
		}

		public void setDemandClass(String demandClass) {
			this.demandClass = demandClass;
		}

		public String getItemType() {
			return this.itemType;
		}

		public void setItemType(String itemType) {
			this.itemType = itemType;
		}

		public String getAppGroup() {
			return this.appGroup;
		}

		public void setAppGroup(String appGroup) {
			this.appGroup = appGroup;
		}

		public String getLogicZone() {
			return this.logicZone;
		}

		public void setLogicZone(String logicZone) {
			this.logicZone = logicZone;
		}

		public Long getConsistentDemandId() {
			return this.consistentDemandId;
		}

		public void setConsistentDemandId(Long consistentDemandId) {
			this.consistentDemandId = consistentDemandId;
		}

		public String getReplenishUnit() {
			return this.replenishUnit;
		}

		public void setReplenishUnit(String replenishUnit) {
			this.replenishUnit = replenishUnit;
		}

		public static class DemandDeploy {

			@SerializedName("DeployRole")
			private String deployRole;

			@SerializedName("NodeType")
			private String nodeType;

			@SerializedName("DeployLevel")
			private String deployLevel;

			@SerializedName("DeployLocation")
			private String deployLocation;

			@SerializedName("FrameworkClass")
			private String frameworkClass;

			public String getDeployRole() {
				return this.deployRole;
			}

			public void setDeployRole(String deployRole) {
				this.deployRole = deployRole;
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

			public String getDeployLocation() {
				return this.deployLocation;
			}

			public void setDeployLocation(String deployLocation) {
				this.deployLocation = deployLocation;
			}

			public String getFrameworkClass() {
				return this.frameworkClass;
			}

			public void setFrameworkClass(String frameworkClass) {
				this.frameworkClass = frameworkClass;
			}
		}

		public static class DemandItem {

			@SerializedName("ServerDTO")
			private ServerDTO serverDTO;

			@SerializedName("ExchangeValue")
			private ExchangeValue exchangeValue;

			@SerializedName("DemandItemType")
			private String demandItemType;

			@SerializedName("ComboValue")
			private ComboValue comboValue;

			public ServerDTO getServerDTO() {
				return this.serverDTO;
			}

			public void setServerDTO(ServerDTO serverDTO) {
				this.serverDTO = serverDTO;
			}

			public ExchangeValue getExchangeValue() {
				return this.exchangeValue;
			}

			public void setExchangeValue(ExchangeValue exchangeValue) {
				this.exchangeValue = exchangeValue;
			}

			public String getDemandItemType() {
				return this.demandItemType;
			}

			public void setDemandItemType(String demandItemType) {
				this.demandItemType = demandItemType;
			}

			public ComboValue getComboValue() {
				return this.comboValue;
			}

			public void setComboValue(ComboValue comboValue) {
				this.comboValue = comboValue;
			}

			public static class ServerDTO {

				@SerializedName("Nic")
				private String nic;

				@SerializedName("Model")
				private String model;

				@SerializedName("Config")
				private String config;

				public String getNic() {
					return this.nic;
				}

				public void setNic(String nic) {
					this.nic = nic;
				}

				public String getModel() {
					return this.model;
				}

				public void setModel(String model) {
					this.model = model;
				}

				public String getConfig() {
					return this.config;
				}

				public void setConfig(String config) {
					this.config = config;
				}
			}

			public static class ExchangeValue {

				@SerializedName("ExchangeList")
				private List<String> exchangeList;

				@SerializedName("ServerDemandList")
				private List<ServerDemandListItem> serverDemandList;

				public List<String> getExchangeList() {
					return this.exchangeList;
				}

				public void setExchangeList(List<String> exchangeList) {
					this.exchangeList = exchangeList;
				}

				public List<ServerDemandListItem> getServerDemandList() {
					return this.serverDemandList;
				}

				public void setServerDemandList(List<ServerDemandListItem> serverDemandList) {
					this.serverDemandList = serverDemandList;
				}

				public static class ServerDemandListItem {

					@SerializedName("Item")
					private String item;

					@SerializedName("Quantity")
					private Integer quantity;

					@SerializedName("AppGroup")
					private String appGroup;

					@SerializedName("AgreedQuantity")
					private Integer agreedQuantity;

					@SerializedName("SnList")
					private List<String> snList;

					@SerializedName("Product3")
					private String product3;

					public String getItem() {
						return this.item;
					}

					public void setItem(String item) {
						this.item = item;
					}

					public Integer getQuantity() {
						return this.quantity;
					}

					public void setQuantity(Integer quantity) {
						this.quantity = quantity;
					}

					public String getAppGroup() {
						return this.appGroup;
					}

					public void setAppGroup(String appGroup) {
						this.appGroup = appGroup;
					}

					public Integer getAgreedQuantity() {
						return this.agreedQuantity;
					}

					public void setAgreedQuantity(Integer agreedQuantity) {
						this.agreedQuantity = agreedQuantity;
					}

					public List<String> getSnList() {
						return this.snList;
					}

					public void setSnList(List<String> snList) {
						this.snList = snList;
					}

					public String getProduct3() {
						return this.product3;
					}

					public void setProduct3(String product3) {
						this.product3 = product3;
					}
				}
			}

			public static class ComboValue {

				@SerializedName("SkuId")
				private String skuId;

				@SerializedName("ServerDemandList")
				private List<ServerDemandListItem> serverDemandList;

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

				public static class ServerDemandListItem {

					@SerializedName("Item")
					private String item;

					@SerializedName("Quantity")
					private Integer quantity;

					@SerializedName("AppGroup")
					private String appGroup;

					@SerializedName("AgreedQuantity")
					private Integer agreedQuantity;

					@SerializedName("SnList")
					private List<String> snList;

					@SerializedName("Product3")
					private String product3;

					public String getItem() {
						return this.item;
					}

					public void setItem(String item) {
						this.item = item;
					}

					public Integer getQuantity() {
						return this.quantity;
					}

					public void setQuantity(Integer quantity) {
						this.quantity = quantity;
					}

					public String getAppGroup() {
						return this.appGroup;
					}

					public void setAppGroup(String appGroup) {
						this.appGroup = appGroup;
					}

					public Integer getAgreedQuantity() {
						return this.agreedQuantity;
					}

					public void setAgreedQuantity(Integer agreedQuantity) {
						this.agreedQuantity = agreedQuantity;
					}

					public List<String> getSnList() {
						return this.snList;
					}

					public void setSnList(List<String> snList) {
						this.snList = snList;
					}

					public String getProduct3() {
						return this.product3;
					}

					public void setProduct3(String product3) {
						this.product3 = product3;
					}
				}
			}
		}
	}

	@Override
	public Class<CheckReceiveResponse> getResponseClass() {
		return CheckReceiveResponse.class;
	}

}
