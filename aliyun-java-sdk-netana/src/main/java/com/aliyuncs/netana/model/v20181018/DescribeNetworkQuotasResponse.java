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

package com.aliyuncs.netana.model.v20181018;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20181018.DescribeNetworkQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkQuotasResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<NetworkQuota> networkQuotas;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NetworkQuota> getNetworkQuotas() {
		return this.networkQuotas;
	}

	public void setNetworkQuotas(List<NetworkQuota> networkQuotas) {
		this.networkQuotas = networkQuotas;
	}

	public static class NetworkQuota {

		private String resourceType;

		private String product;

		private List<Privilege> privileges;

		private List<NetworkQuotaInfo> networkQuotaInfos;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public List<Privilege> getPrivileges() {
			return this.privileges;
		}

		public void setPrivileges(List<Privilege> privileges) {
			this.privileges = privileges;
		}

		public List<NetworkQuotaInfo> getNetworkQuotaInfos() {
			return this.networkQuotaInfos;
		}

		public void setNetworkQuotaInfos(List<NetworkQuotaInfo> networkQuotaInfos) {
			this.networkQuotaInfos = networkQuotaInfos;
		}

		public static class Privilege {

			private String privilege;

			private String description;

			private String descriptionCn;

			private Boolean enabled;

			public String getPrivilege() {
				return this.privilege;
			}

			public void setPrivilege(String privilege) {
				this.privilege = privilege;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDescriptionCn() {
				return this.descriptionCn;
			}

			public void setDescriptionCn(String descriptionCn) {
				this.descriptionCn = descriptionCn;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}
		}

		public static class NetworkQuotaInfo {

			private String canExceptional;

			private String sequence;

			private String quotaName;

			private String quotaQuantity;

			private String quotaDescription;

			private String instanceQuantity;

			private String quotaDescriptionCn;

			private List<QuotaDetail> quotaDetails;

			public String getCanExceptional() {
				return this.canExceptional;
			}

			public void setCanExceptional(String canExceptional) {
				this.canExceptional = canExceptional;
			}

			public String getSequence() {
				return this.sequence;
			}

			public void setSequence(String sequence) {
				this.sequence = sequence;
			}

			public String getQuotaName() {
				return this.quotaName;
			}

			public void setQuotaName(String quotaName) {
				this.quotaName = quotaName;
			}

			public String getQuotaQuantity() {
				return this.quotaQuantity;
			}

			public void setQuotaQuantity(String quotaQuantity) {
				this.quotaQuantity = quotaQuantity;
			}

			public String getQuotaDescription() {
				return this.quotaDescription;
			}

			public void setQuotaDescription(String quotaDescription) {
				this.quotaDescription = quotaDescription;
			}

			public String getInstanceQuantity() {
				return this.instanceQuantity;
			}

			public void setInstanceQuantity(String instanceQuantity) {
				this.instanceQuantity = instanceQuantity;
			}

			public String getQuotaDescriptionCn() {
				return this.quotaDescriptionCn;
			}

			public void setQuotaDescriptionCn(String quotaDescriptionCn) {
				this.quotaDescriptionCn = quotaDescriptionCn;
			}

			public List<QuotaDetail> getQuotaDetails() {
				return this.quotaDetails;
			}

			public void setQuotaDetails(List<QuotaDetail> quotaDetails) {
				this.quotaDetails = quotaDetails;
			}

			public static class QuotaDetail {

				private Integer top;

				private String childResourceType;

				private String instanceId;

				private Integer quotaQuantity;

				public Integer getTop() {
					return this.top;
				}

				public void setTop(Integer top) {
					this.top = top;
				}

				public String getChildResourceType() {
					return this.childResourceType;
				}

				public void setChildResourceType(String childResourceType) {
					this.childResourceType = childResourceType;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public Integer getQuotaQuantity() {
					return this.quotaQuantity;
				}

				public void setQuotaQuantity(Integer quotaQuantity) {
					this.quotaQuantity = quotaQuantity;
				}
			}
		}
	}

	@Override
	public DescribeNetworkQuotasResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkQuotasResponseUnmarshaller.unmarshall(this, context);
	}
}
