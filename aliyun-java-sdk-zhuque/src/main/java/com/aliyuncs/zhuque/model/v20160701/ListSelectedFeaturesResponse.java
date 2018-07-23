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
import com.aliyuncs.zhuque.transform.v20160701.ListSelectedFeaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSelectedFeaturesResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private List<SelectComponentItem> selectComponent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<SelectComponentItem> getSelectComponent() {
		return this.selectComponent;
	}

	public void setSelectComponent(List<SelectComponentItem> selectComponent) {
		this.selectComponent = selectComponent;
	}

	public static class SelectComponentItem {

		private String category;

		private String commodity;

		private String commodityCode;

		private Boolean commodityMandatory;

		private String commodityType;

		private String module;

		private String moduleCode;

		private String moduleType;

		private Boolean mandatory;

		private String moduleDescription;

		private String detailedName;

		private Integer index;

		private Boolean installed;

		private Boolean isHidden;

		private Boolean isInvalid;

		private String invalidReason;

		private String priceSourceType;

		private String licenseUnit;

		private String capacity;

		private String product;

		private String feature;

		private String description;

		private Boolean selected;

		private Boolean isEdited;

		private Integer count;

		private Boolean hiddenSupportDisasterRecovery;

		private String deploymentLocation;

		private String updated;

		private List<FeatureListItem> featureList;

		private List<String> moduleDependencyList;

		private List<String> moduleExclusiveList;

		private List<String> priceSourceCodes;

		private List<String> exclusiveFeatureGroup;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCommodity() {
			return this.commodity;
		}

		public void setCommodity(String commodity) {
			this.commodity = commodity;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public Boolean getCommodityMandatory() {
			return this.commodityMandatory;
		}

		public void setCommodityMandatory(Boolean commodityMandatory) {
			this.commodityMandatory = commodityMandatory;
		}

		public String getCommodityType() {
			return this.commodityType;
		}

		public void setCommodityType(String commodityType) {
			this.commodityType = commodityType;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getModuleCode() {
			return this.moduleCode;
		}

		public void setModuleCode(String moduleCode) {
			this.moduleCode = moduleCode;
		}

		public String getModuleType() {
			return this.moduleType;
		}

		public void setModuleType(String moduleType) {
			this.moduleType = moduleType;
		}

		public Boolean getMandatory() {
			return this.mandatory;
		}

		public void setMandatory(Boolean mandatory) {
			this.mandatory = mandatory;
		}

		public String getModuleDescription() {
			return this.moduleDescription;
		}

		public void setModuleDescription(String moduleDescription) {
			this.moduleDescription = moduleDescription;
		}

		public String getDetailedName() {
			return this.detailedName;
		}

		public void setDetailedName(String detailedName) {
			this.detailedName = detailedName;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public Boolean getInstalled() {
			return this.installed;
		}

		public void setInstalled(Boolean installed) {
			this.installed = installed;
		}

		public Boolean getIsHidden() {
			return this.isHidden;
		}

		public void setIsHidden(Boolean isHidden) {
			this.isHidden = isHidden;
		}

		public Boolean getIsInvalid() {
			return this.isInvalid;
		}

		public void setIsInvalid(Boolean isInvalid) {
			this.isInvalid = isInvalid;
		}

		public String getInvalidReason() {
			return this.invalidReason;
		}

		public void setInvalidReason(String invalidReason) {
			this.invalidReason = invalidReason;
		}

		public String getPriceSourceType() {
			return this.priceSourceType;
		}

		public void setPriceSourceType(String priceSourceType) {
			this.priceSourceType = priceSourceType;
		}

		public String getLicenseUnit() {
			return this.licenseUnit;
		}

		public void setLicenseUnit(String licenseUnit) {
			this.licenseUnit = licenseUnit;
		}

		public String getCapacity() {
			return this.capacity;
		}

		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getSelected() {
			return this.selected;
		}

		public void setSelected(Boolean selected) {
			this.selected = selected;
		}

		public Boolean getIsEdited() {
			return this.isEdited;
		}

		public void setIsEdited(Boolean isEdited) {
			this.isEdited = isEdited;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Boolean getHiddenSupportDisasterRecovery() {
			return this.hiddenSupportDisasterRecovery;
		}

		public void setHiddenSupportDisasterRecovery(Boolean hiddenSupportDisasterRecovery) {
			this.hiddenSupportDisasterRecovery = hiddenSupportDisasterRecovery;
		}

		public String getDeploymentLocation() {
			return this.deploymentLocation;
		}

		public void setDeploymentLocation(String deploymentLocation) {
			this.deploymentLocation = deploymentLocation;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public List<FeatureListItem> getFeatureList() {
			return this.featureList;
		}

		public void setFeatureList(List<FeatureListItem> featureList) {
			this.featureList = featureList;
		}

		public List<String> getModuleDependencyList() {
			return this.moduleDependencyList;
		}

		public void setModuleDependencyList(List<String> moduleDependencyList) {
			this.moduleDependencyList = moduleDependencyList;
		}

		public List<String> getModuleExclusiveList() {
			return this.moduleExclusiveList;
		}

		public void setModuleExclusiveList(List<String> moduleExclusiveList) {
			this.moduleExclusiveList = moduleExclusiveList;
		}

		public List<String> getPriceSourceCodes() {
			return this.priceSourceCodes;
		}

		public void setPriceSourceCodes(List<String> priceSourceCodes) {
			this.priceSourceCodes = priceSourceCodes;
		}

		public List<String> getExclusiveFeatureGroup() {
			return this.exclusiveFeatureGroup;
		}

		public void setExclusiveFeatureGroup(List<String> exclusiveFeatureGroup) {
			this.exclusiveFeatureGroup = exclusiveFeatureGroup;
		}

		public static class FeatureListItem {

			private String product;

			private String feature;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getFeature() {
				return this.feature;
			}

			public void setFeature(String feature) {
				this.feature = feature;
			}
		}
	}

	@Override
	public ListSelectedFeaturesResponse getInstance(UnmarshallerContext context) {
		return	ListSelectedFeaturesResponseUnmarshaller.unmarshall(this, context);
	}
}
