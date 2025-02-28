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

package com.aliyuncs.bpstudio.model.v20210931;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.GetApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String description;

		private String imageURL;

		private String applicationId;

		private String name;

		private String templateId;

		private String createTime;

		private String resourceGroupId;

		private String status;

		private String error;

		private Double deployPercent;

		private List<Item> priceList;

		private List<Item1> checklist;

		private List<Item2> resourceList;

		private List<Item3> complianceList;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public Double getDeployPercent() {
			return this.deployPercent;
		}

		public void setDeployPercent(Double deployPercent) {
			this.deployPercent = deployPercent;
		}

		public List<Item> getPriceList() {
			return this.priceList;
		}

		public void setPriceList(List<Item> priceList) {
			this.priceList = priceList;
		}

		public List<Item1> getChecklist() {
			return this.checklist;
		}

		public void setChecklist(List<Item1> checklist) {
			this.checklist = checklist;
		}

		public List<Item2> getResourceList() {
			return this.resourceList;
		}

		public void setResourceList(List<Item2> resourceList) {
			this.resourceList = resourceList;
		}

		public List<Item3> getComplianceList() {
			return this.complianceList;
		}

		public void setComplianceList(List<Item3> complianceList) {
			this.complianceList = complianceList;
		}

		public static class Item {

			private String resourceCode;

			private String instanceName;

			private Double originalPrice;

			private Double onePrice;

			private Integer period;

			private Integer count;

			private String priceUnit;

			private Double price;

			private String chargeType;

			private String region;

			private String specification;

			private String lifecycle;

			private String remark;

			private String type;

			public String getResourceCode() {
				return this.resourceCode;
			}

			public void setResourceCode(String resourceCode) {
				this.resourceCode = resourceCode;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Double getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Double originalPrice) {
				this.originalPrice = originalPrice;
			}

			public Double getOnePrice() {
				return this.onePrice;
			}

			public void setOnePrice(Double onePrice) {
				this.onePrice = onePrice;
			}

			public Integer getPeriod() {
				return this.period;
			}

			public void setPeriod(Integer period) {
				this.period = period;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getPriceUnit() {
				return this.priceUnit;
			}

			public void setPriceUnit(String priceUnit) {
				this.priceUnit = priceUnit;
			}

			public Double getPrice() {
				return this.price;
			}

			public void setPrice(Double price) {
				this.price = price;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getSpecification() {
				return this.specification;
			}

			public void setSpecification(String specification) {
				this.specification = specification;
			}

			public String getLifecycle() {
				return this.lifecycle;
			}

			public void setLifecycle(String lifecycle) {
				this.lifecycle = lifecycle;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class Item1 {

			private String resourceCode;

			private String resourceName;

			private String region;

			private String result;

			private String remark;

			private String specification;

			private String lifecycle;

			public String getResourceCode() {
				return this.resourceCode;
			}

			public void setResourceCode(String resourceCode) {
				this.resourceCode = resourceCode;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getResult() {
				return this.result;
			}

			public void setResult(String result) {
				this.result = result;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getSpecification() {
				return this.specification;
			}

			public void setSpecification(String specification) {
				this.specification = specification;
			}

			public String getLifecycle() {
				return this.lifecycle;
			}

			public void setLifecycle(String lifecycle) {
				this.lifecycle = lifecycle;
			}
		}

		public static class Item2 {

			private String status;

			private String resourceCode;

			private String resourceName;

			private String resourceId;

			private String chargeType;

			private String resourceType;

			private String remark;

			private String lifecycle;

			private String nodeLabel;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getResourceCode() {
				return this.resourceCode;
			}

			public void setResourceCode(String resourceCode) {
				this.resourceCode = resourceCode;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getLifecycle() {
				return this.lifecycle;
			}

			public void setLifecycle(String lifecycle) {
				this.lifecycle = lifecycle;
			}

			public String getNodeLabel() {
				return this.nodeLabel;
			}

			public void setNodeLabel(String nodeLabel) {
				this.nodeLabel = nodeLabel;
			}
		}

		public static class Item3 {

			private String resourceName;

			private String resourceCode;

			private List<Item4> rules;

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceCode() {
				return this.resourceCode;
			}

			public void setResourceCode(String resourceCode) {
				this.resourceCode = resourceCode;
			}

			public List<Item4> getRules() {
				return this.rules;
			}

			public void setRules(List<Item4> rules) {
				this.rules = rules;
			}

			public static class Item4 {

				private String ruleId;

				private String ruleDetail;

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}

				public String getRuleDetail() {
					return this.ruleDetail;
				}

				public void setRuleDetail(String ruleDetail) {
					this.ruleDetail = ruleDetail;
				}
			}
		}
	}

	@Override
	public GetApplicationResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
