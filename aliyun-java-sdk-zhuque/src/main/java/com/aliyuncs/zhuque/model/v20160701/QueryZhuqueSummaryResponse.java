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

package com.aliyuncs.zhuque.model.v20160701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.QueryZhuqueSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryZhuqueSummaryResponse extends AcsResponse {

	private String requestId;

	private String cloudInstanceId;

	private String cloudInstanceName;

	private String propertyMode;

	private String versionStatus;

	private List<IdcItem> idcList;

	private ControllerItem controllerItem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCloudInstanceId() {
		return this.cloudInstanceId;
	}

	public void setCloudInstanceId(String cloudInstanceId) {
		this.cloudInstanceId = cloudInstanceId;
	}

	public String getCloudInstanceName() {
		return this.cloudInstanceName;
	}

	public void setCloudInstanceName(String cloudInstanceName) {
		this.cloudInstanceName = cloudInstanceName;
	}

	public String getPropertyMode() {
		return this.propertyMode;
	}

	public void setPropertyMode(String propertyMode) {
		this.propertyMode = propertyMode;
	}

	public String getVersionStatus() {
		return this.versionStatus;
	}

	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

	public List<IdcItem> getIdcList() {
		return this.idcList;
	}

	public void setIdcList(List<IdcItem> idcList) {
		this.idcList = idcList;
	}

	public ControllerItem getControllerItem() {
		return this.controllerItem;
	}

	public void setControllerItem(ControllerItem controllerItem) {
		this.controllerItem = controllerItem;
	}

	public static class IdcItem {

		private String idcId;

		private Integer ncCount;

		private List<SummaryItem> summaryItemList;

		private List<NetworkDeviceItem> networkDeviceItemList;

		private ControllerItemOfIdc controllerItemOfIdc;

		public String getIdcId() {
			return this.idcId;
		}

		public void setIdcId(String idcId) {
			this.idcId = idcId;
		}

		public Integer getNcCount() {
			return this.ncCount;
		}

		public void setNcCount(Integer ncCount) {
			this.ncCount = ncCount;
		}

		public List<SummaryItem> getSummaryItemList() {
			return this.summaryItemList;
		}

		public void setSummaryItemList(List<SummaryItem> summaryItemList) {
			this.summaryItemList = summaryItemList;
		}

		public List<NetworkDeviceItem> getNetworkDeviceItemList() {
			return this.networkDeviceItemList;
		}

		public void setNetworkDeviceItemList(List<NetworkDeviceItem> networkDeviceItemList) {
			this.networkDeviceItemList = networkDeviceItemList;
		}

		public ControllerItemOfIdc getControllerItemOfIdc() {
			return this.controllerItemOfIdc;
		}

		public void setControllerItemOfIdc(ControllerItemOfIdc controllerItemOfIdc) {
			this.controllerItemOfIdc = controllerItemOfIdc;
		}

		public static class SummaryItem {

			private String commodityCode;

			private Integer ncCount;

			private List<MachineTypeCountItemOfCommodity> ncCountByMachineTypeOfCommodity;

			private List<SpecificationItem> specificationItemList;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public Integer getNcCount() {
				return this.ncCount;
			}

			public void setNcCount(Integer ncCount) {
				this.ncCount = ncCount;
			}

			public List<MachineTypeCountItemOfCommodity> getNcCountByMachineTypeOfCommodity() {
				return this.ncCountByMachineTypeOfCommodity;
			}

			public void setNcCountByMachineTypeOfCommodity(List<MachineTypeCountItemOfCommodity> ncCountByMachineTypeOfCommodity) {
				this.ncCountByMachineTypeOfCommodity = ncCountByMachineTypeOfCommodity;
			}

			public List<SpecificationItem> getSpecificationItemList() {
				return this.specificationItemList;
			}

			public void setSpecificationItemList(List<SpecificationItem> specificationItemList) {
				this.specificationItemList = specificationItemList;
			}

			public static class MachineTypeCountItemOfCommodity {

				private String machineType;

				private String machineTypeCode;

				private Integer count;

				public String getMachineType() {
					return this.machineType;
				}

				public void setMachineType(String machineType) {
					this.machineType = machineType;
				}

				public String getMachineTypeCode() {
					return this.machineTypeCode;
				}

				public void setMachineTypeCode(String machineTypeCode) {
					this.machineTypeCode = machineTypeCode;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}

			public static class SpecificationItem {

				private String specificationCode;

				private Integer specificationCount;

				private String specificationUnit;

				private Integer ncCount;

				private List<MachineTypeCountItemOfModule> ncCountByMachineTypeOfModule;

				public String getSpecificationCode() {
					return this.specificationCode;
				}

				public void setSpecificationCode(String specificationCode) {
					this.specificationCode = specificationCode;
				}

				public Integer getSpecificationCount() {
					return this.specificationCount;
				}

				public void setSpecificationCount(Integer specificationCount) {
					this.specificationCount = specificationCount;
				}

				public String getSpecificationUnit() {
					return this.specificationUnit;
				}

				public void setSpecificationUnit(String specificationUnit) {
					this.specificationUnit = specificationUnit;
				}

				public Integer getNcCount() {
					return this.ncCount;
				}

				public void setNcCount(Integer ncCount) {
					this.ncCount = ncCount;
				}

				public List<MachineTypeCountItemOfModule> getNcCountByMachineTypeOfModule() {
					return this.ncCountByMachineTypeOfModule;
				}

				public void setNcCountByMachineTypeOfModule(List<MachineTypeCountItemOfModule> ncCountByMachineTypeOfModule) {
					this.ncCountByMachineTypeOfModule = ncCountByMachineTypeOfModule;
				}

				public static class MachineTypeCountItemOfModule {

					private String machineType;

					private String machineTypeCode;

					private Integer count;

					public String getMachineType() {
						return this.machineType;
					}

					public void setMachineType(String machineType) {
						this.machineType = machineType;
					}

					public String getMachineTypeCode() {
						return this.machineTypeCode;
					}

					public void setMachineTypeCode(String machineTypeCode) {
						this.machineTypeCode = machineTypeCode;
					}

					public Integer getCount() {
						return this.count;
					}

					public void setCount(Integer count) {
						this.count = count;
					}
				}
			}
		}

		public static class NetworkDeviceItem {

			private String commodityCode;

			private String role;

			private String displayName;

			private Integer count;

			private String manufacturer;

			private String model;

			private Integer purchasePackId;

			private List<SubModel> subModelList;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getManufacturer() {
				return this.manufacturer;
			}

			public void setManufacturer(String manufacturer) {
				this.manufacturer = manufacturer;
			}

			public String getModel() {
				return this.model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public Integer getPurchasePackId() {
				return this.purchasePackId;
			}

			public void setPurchasePackId(Integer purchasePackId) {
				this.purchasePackId = purchasePackId;
			}

			public List<SubModel> getSubModelList() {
				return this.subModelList;
			}

			public void setSubModelList(List<SubModel> subModelList) {
				this.subModelList = subModelList;
			}

			public static class SubModel {

				private String specificationCode;

				private String displayName;

				private Integer count;

				private String manufacturer;

				private String model;

				private String note;

				public String getSpecificationCode() {
					return this.specificationCode;
				}

				public void setSpecificationCode(String specificationCode) {
					this.specificationCode = specificationCode;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}

				public String getManufacturer() {
					return this.manufacturer;
				}

				public void setManufacturer(String manufacturer) {
					this.manufacturer = manufacturer;
				}

				public String getModel() {
					return this.model;
				}

				public void setModel(String model) {
					this.model = model;
				}

				public String getNote() {
					return this.note;
				}

				public void setNote(String note) {
					this.note = note;
				}
			}
		}

		public static class ControllerItemOfIdc {

			private String commodityCode;

			private Integer ncCount;

			private List<MachineTypeCountItemOfController> ncCountByMachineTypeOfController;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public Integer getNcCount() {
				return this.ncCount;
			}

			public void setNcCount(Integer ncCount) {
				this.ncCount = ncCount;
			}

			public List<MachineTypeCountItemOfController> getNcCountByMachineTypeOfController() {
				return this.ncCountByMachineTypeOfController;
			}

			public void setNcCountByMachineTypeOfController(List<MachineTypeCountItemOfController> ncCountByMachineTypeOfController) {
				this.ncCountByMachineTypeOfController = ncCountByMachineTypeOfController;
			}

			public static class MachineTypeCountItemOfController {

				private String machineType;

				private String machineTypeCode;

				private Integer count;

				public String getMachineType() {
					return this.machineType;
				}

				public void setMachineType(String machineType) {
					this.machineType = machineType;
				}

				public String getMachineTypeCode() {
					return this.machineTypeCode;
				}

				public void setMachineTypeCode(String machineTypeCode) {
					this.machineTypeCode = machineTypeCode;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}
		}
	}

	public static class ControllerItem {

		private String cloudInstanceId;

		private String controllerCode;

		private PublicList publicList;

		public String getCloudInstanceId() {
			return this.cloudInstanceId;
		}

		public void setCloudInstanceId(String cloudInstanceId) {
			this.cloudInstanceId = cloudInstanceId;
		}

		public String getControllerCode() {
			return this.controllerCode;
		}

		public void setControllerCode(String controllerCode) {
			this.controllerCode = controllerCode;
		}

		public PublicList getPublicList() {
			return this.publicList;
		}

		public void setPublicList(PublicList publicList) {
			this.publicList = publicList;
		}

		public static class PublicList {

			private Integer ncCount;

			private List<ControllerSpecificationItem> controllerSpecificationItemList;

			public Integer getNcCount() {
				return this.ncCount;
			}

			public void setNcCount(Integer ncCount) {
				this.ncCount = ncCount;
			}

			public List<ControllerSpecificationItem> getControllerSpecificationItemList() {
				return this.controllerSpecificationItemList;
			}

			public void setControllerSpecificationItemList(List<ControllerSpecificationItem> controllerSpecificationItemList) {
				this.controllerSpecificationItemList = controllerSpecificationItemList;
			}

			public static class ControllerSpecificationItem {

				private String specificationCode;

				private Integer specificationCount;

				private String specificationUnit;

				public String getSpecificationCode() {
					return this.specificationCode;
				}

				public void setSpecificationCode(String specificationCode) {
					this.specificationCode = specificationCode;
				}

				public Integer getSpecificationCount() {
					return this.specificationCount;
				}

				public void setSpecificationCount(Integer specificationCount) {
					this.specificationCount = specificationCount;
				}

				public String getSpecificationUnit() {
					return this.specificationUnit;
				}

				public void setSpecificationUnit(String specificationUnit) {
					this.specificationUnit = specificationUnit;
				}
			}
		}
	}

	@Override
	public QueryZhuqueSummaryResponse getInstance(UnmarshallerContext context) {
		return	QueryZhuqueSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
