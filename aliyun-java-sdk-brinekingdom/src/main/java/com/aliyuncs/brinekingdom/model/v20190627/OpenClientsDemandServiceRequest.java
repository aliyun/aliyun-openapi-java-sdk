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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpenClientsDemandServiceRequest extends RpcAcsRequest<OpenClientsDemandServiceResponse> {
	   

	private String cluster;

	private String safeZone;

	private String projectCode;

	private String source;

	private Long osId;

	private String supplyLevel;

	private Long installId;

	private String operator;

	private String product3;

	private String productType;

	private String businessType;

	private String uid;

	private Map<String,String> features;

	private Boolean factoryInstall;

	private String scenario;

	private String shiftMethod;

	private Integer demandQty;

	private String tenantId;

	private String classZone;

	private String azone;

	private String osName;

	private String networkArch;

	private String sourceId;

	private String item;

	private String projectName;

	private String comments;

	private String org;

	private Boolean autoApprove;

	private String installName;

	private String idc;

	private DemandItem demandItem;

	private String priority;

	private Long clientsDemandId;

	private String demandClass;

	private String itemType;

	private String requireType;

	private String appGroup;

	private String sourceStatus;

	private Boolean install;

	private String logicZone;

	private String replenishUnit;

	private String expectTurnOverDate;
	public OpenClientsDemandServiceRequest() {
		super("brinekingdom", "2019-06-27", "OpenClientsDemandService");
		setMethod(MethodType.POST);
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public String getSafeZone() {
		return this.safeZone;
	}

	public void setSafeZone(String safeZone) {
		this.safeZone = safeZone;
		if(safeZone != null){
			putQueryParameter("SafeZone", safeZone);
		}
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
		if(projectCode != null){
			putQueryParameter("ProjectCode", projectCode);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Long getOsId() {
		return this.osId;
	}

	public void setOsId(Long osId) {
		this.osId = osId;
		if(osId != null){
			putQueryParameter("OsId", osId.toString());
		}
	}

	public String getSupplyLevel() {
		return this.supplyLevel;
	}

	public void setSupplyLevel(String supplyLevel) {
		this.supplyLevel = supplyLevel;
		if(supplyLevel != null){
			putQueryParameter("SupplyLevel", supplyLevel);
		}
	}

	public Long getInstallId() {
		return this.installId;
	}

	public void setInstallId(Long installId) {
		this.installId = installId;
		if(installId != null){
			putQueryParameter("InstallId", installId.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getProduct3() {
		return this.product3;
	}

	public void setProduct3(String product3) {
		this.product3 = product3;
		if(product3 != null){
			putQueryParameter("Product3", product3);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType);
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public Map<String,String> getFeatures() {
		return this.features;
	}

	public void setFeatures(Map<String,String> features) {
		this.features = features;	
		if (features != null) {
			for (String key1: features.keySet() ) {
				putQueryParameter("Features.#" + key1.length() + "#" + key1 , features.get(key1));
			}
		}	
	}

	public Boolean getFactoryInstall() {
		return this.factoryInstall;
	}

	public void setFactoryInstall(Boolean factoryInstall) {
		this.factoryInstall = factoryInstall;
		if(factoryInstall != null){
			putQueryParameter("FactoryInstall", factoryInstall.toString());
		}
	}

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
		if(scenario != null){
			putQueryParameter("Scenario", scenario);
		}
	}

	public String getShiftMethod() {
		return this.shiftMethod;
	}

	public void setShiftMethod(String shiftMethod) {
		this.shiftMethod = shiftMethod;
		if(shiftMethod != null){
			putQueryParameter("ShiftMethod", shiftMethod);
		}
	}

	public Integer getDemandQty() {
		return this.demandQty;
	}

	public void setDemandQty(Integer demandQty) {
		this.demandQty = demandQty;
		if(demandQty != null){
			putQueryParameter("DemandQty", demandQty.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getClassZone() {
		return this.classZone;
	}

	public void setClassZone(String classZone) {
		this.classZone = classZone;
		if(classZone != null){
			putQueryParameter("ClassZone", classZone);
		}
	}

	public String getAzone() {
		return this.azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
		if(azone != null){
			putQueryParameter("Azone", azone);
		}
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
		if(osName != null){
			putQueryParameter("OsName", osName);
		}
	}

	public String getNetworkArch() {
		return this.networkArch;
	}

	public void setNetworkArch(String networkArch) {
		this.networkArch = networkArch;
		if(networkArch != null){
			putQueryParameter("NetworkArch", networkArch);
		}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId);
		}
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
		if(item != null){
			putQueryParameter("Item", item);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
		if(comments != null){
			putQueryParameter("Comments", comments);
		}
	}

	public String getOrg() {
		return this.org;
	}

	public void setOrg(String org) {
		this.org = org;
		if(org != null){
			putQueryParameter("Org", org);
		}
	}

	public Boolean getAutoApprove() {
		return this.autoApprove;
	}

	public void setAutoApprove(Boolean autoApprove) {
		this.autoApprove = autoApprove;
		if(autoApprove != null){
			putQueryParameter("AutoApprove", autoApprove.toString());
		}
	}

	public String getInstallName() {
		return this.installName;
	}

	public void setInstallName(String installName) {
		this.installName = installName;
		if(installName != null){
			putQueryParameter("InstallName", installName);
		}
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
		if(idc != null){
			putQueryParameter("Idc", idc);
		}
	}

	public DemandItem getDemandItem() {
		return this.demandItem;
	}

	public void setDemandItem(DemandItem demandItem) {
		this.demandItem = demandItem;	
		if (demandItem != null) {
			
				if (demandItem.getServerDTO() != null) {
					
						putQueryParameter("DemandItem.ServerDTO.Nic" , demandItem.getServerDTO().getNic());
						putQueryParameter("DemandItem.ServerDTO.Model" , demandItem.getServerDTO().getModel());
						putQueryParameter("DemandItem.ServerDTO.Config" , demandItem.getServerDTO().getConfig());
				}
				if (demandItem.getExchangeValue() != null) {
					
						if (demandItem.getExchangeValue().getExchangeList() != null) {
							for (int depth1 = 0; depth1 < demandItem.getExchangeValue().getExchangeList().size(); depth1++) {
								putQueryParameter("DemandItem.ExchangeValue.ExchangeList." + (depth1 + 1) , demandItem.getExchangeValue().getExchangeList().get(depth1));
							}
						}
						if (demandItem.getExchangeValue().getServerDemandList() != null) {
							for (int depth1 = 0; depth1 < demandItem.getExchangeValue().getServerDemandList().size(); depth1++) {
								if (demandItem.getExchangeValue().getServerDemandList().get(depth1) != null) {
									
										putQueryParameter("DemandItem.ExchangeValue.ServerDemandList." + (depth1 + 1) + ".Item" , demandItem.getExchangeValue().getServerDemandList().get(depth1).getItem());
										putQueryParameter("DemandItem.ExchangeValue.ServerDemandList." + (depth1 + 1) + ".Quantity" , demandItem.getExchangeValue().getServerDemandList().get(depth1).getQuantity());
										putQueryParameter("DemandItem.ExchangeValue.ServerDemandList." + (depth1 + 1) + ".AppGroup" , demandItem.getExchangeValue().getServerDemandList().get(depth1).getAppGroup());
										putQueryParameter("DemandItem.ExchangeValue.ServerDemandList." + (depth1 + 1) + ".AgreedQuantity" , demandItem.getExchangeValue().getServerDemandList().get(depth1).getAgreedQuantity());
										if (demandItem.getExchangeValue().getServerDemandList().get(depth1).getSnList() != null) {
											for (int depth2 = 0; depth2 < demandItem.getExchangeValue().getServerDemandList().get(depth1).getSnList().size(); depth2++) {
												putQueryParameter("DemandItem.ExchangeValue.ServerDemandList." + (depth1 + 1) + ".SnList." + (depth2 + 1) , demandItem.getExchangeValue().getServerDemandList().get(depth1).getSnList().get(depth2));
											}
										}
										putQueryParameter("DemandItem.ExchangeValue.ServerDemandList." + (depth1 + 1) + ".Product3" , demandItem.getExchangeValue().getServerDemandList().get(depth1).getProduct3());
								}
							}
						}
				}
				putQueryParameter("DemandItem.DemandItemType" , demandItem.getDemandItemType());
				if (demandItem.getComboValue() != null) {
					
						putQueryParameter("DemandItem.ComboValue.SkuId" , demandItem.getComboValue().getSkuId());
						if (demandItem.getComboValue().getServerDemandList() != null) {
							for (int depth1 = 0; depth1 < demandItem.getComboValue().getServerDemandList().size(); depth1++) {
								if (demandItem.getComboValue().getServerDemandList().get(depth1) != null) {
									
										putQueryParameter("DemandItem.ComboValue.ServerDemandList." + (depth1 + 1) + ".Item" , demandItem.getComboValue().getServerDemandList().get(depth1).getItem());
										putQueryParameter("DemandItem.ComboValue.ServerDemandList." + (depth1 + 1) + ".Quantity" , demandItem.getComboValue().getServerDemandList().get(depth1).getQuantity());
										putQueryParameter("DemandItem.ComboValue.ServerDemandList." + (depth1 + 1) + ".AppGroup" , demandItem.getComboValue().getServerDemandList().get(depth1).getAppGroup());
										putQueryParameter("DemandItem.ComboValue.ServerDemandList." + (depth1 + 1) + ".AgreedQuantity" , demandItem.getComboValue().getServerDemandList().get(depth1).getAgreedQuantity());
										if (demandItem.getComboValue().getServerDemandList().get(depth1).getSnList() != null) {
											for (int depth2 = 0; depth2 < demandItem.getComboValue().getServerDemandList().get(depth1).getSnList().size(); depth2++) {
												putQueryParameter("DemandItem.ComboValue.ServerDemandList." + (depth1 + 1) + ".SnList." + (depth2 + 1) , demandItem.getComboValue().getServerDemandList().get(depth1).getSnList().get(depth2));
											}
										}
										putQueryParameter("DemandItem.ComboValue.ServerDemandList." + (depth1 + 1) + ".Product3" , demandItem.getComboValue().getServerDemandList().get(depth1).getProduct3());
								}
							}
						}
				}
		}	
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public Long getClientsDemandId() {
		return this.clientsDemandId;
	}

	public void setClientsDemandId(Long clientsDemandId) {
		this.clientsDemandId = clientsDemandId;
		if(clientsDemandId != null){
			putQueryParameter("ClientsDemandId", clientsDemandId.toString());
		}
	}

	public String getDemandClass() {
		return this.demandClass;
	}

	public void setDemandClass(String demandClass) {
		this.demandClass = demandClass;
		if(demandClass != null){
			putQueryParameter("DemandClass", demandClass);
		}
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
		if(itemType != null){
			putQueryParameter("ItemType", itemType);
		}
	}

	public String getRequireType() {
		return this.requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
		if(requireType != null){
			putQueryParameter("RequireType", requireType);
		}
	}

	public String getAppGroup() {
		return this.appGroup;
	}

	public void setAppGroup(String appGroup) {
		this.appGroup = appGroup;
		if(appGroup != null){
			putQueryParameter("AppGroup", appGroup);
		}
	}

	public String getSourceStatus() {
		return this.sourceStatus;
	}

	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
		if(sourceStatus != null){
			putQueryParameter("SourceStatus", sourceStatus);
		}
	}

	public Boolean getInstall() {
		return this.install;
	}

	public void setInstall(Boolean install) {
		this.install = install;
		if(install != null){
			putQueryParameter("Install", install.toString());
		}
	}

	public String getLogicZone() {
		return this.logicZone;
	}

	public void setLogicZone(String logicZone) {
		this.logicZone = logicZone;
		if(logicZone != null){
			putQueryParameter("LogicZone", logicZone);
		}
	}

	public String getReplenishUnit() {
		return this.replenishUnit;
	}

	public void setReplenishUnit(String replenishUnit) {
		this.replenishUnit = replenishUnit;
		if(replenishUnit != null){
			putQueryParameter("ReplenishUnit", replenishUnit);
		}
	}

	public String getExpectTurnOverDate() {
		return this.expectTurnOverDate;
	}

	public void setExpectTurnOverDate(String expectTurnOverDate) {
		this.expectTurnOverDate = expectTurnOverDate;
		if(expectTurnOverDate != null){
			putQueryParameter("ExpectTurnOverDate", expectTurnOverDate);
		}
	}

	public static class DemandItem {

		private ServerDTO serverDTO;

		private ExchangeValue exchangeValue;

		private String demandItemType;

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

			private String nic;

			private String model;

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

			private List<String> exchangeList;

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

				private String item;

				private Integer quantity;

				private String appGroup;

				private Integer agreedQuantity;

				private List<String> snList;

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

			private String skuId;

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

				private String item;

				private Integer quantity;

				private String appGroup;

				private Integer agreedQuantity;

				private List<String> snList;

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

	@Override
	public Class<OpenClientsDemandServiceResponse> getResponseClass() {
		return OpenClientsDemandServiceResponse.class;
	}

}
