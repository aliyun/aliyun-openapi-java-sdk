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

	private String requestId;

	private Integer totalCount;

	private List<NetworkQuota> networkQuotas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<NetworkQuota> getNetworkQuotas() {
		return this.networkQuotas;
	}

	public void setNetworkQuotas(List<NetworkQuota> networkQuotas) {
		this.networkQuotas = networkQuotas;
	}

	public static class NetworkQuota {

		private String product;

		private String resourceType;

		private List<Privilege> privileges;

		private List<NetworkQuotaInfo> networkQuotaInfos;

		public String getBizProduct() {
			return this.product;
		}

		public void setBizProduct(String product) {
			this.product = product;
		}

		/**
		 * @deprecated use getBizProduct instead of this.
		 */
		@Deprecated
		public String getProduct() {
			return this.product;
		}

		/**
		 * @deprecated use setBizProduct instead of this.
		 */
		@Deprecated
		public void setProduct(String product) {
			this.product = product;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
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

			private Boolean enabled;

			private String descriptionCn;

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

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public String getDescriptionCn() {
				return this.descriptionCn;
			}

			public void setDescriptionCn(String descriptionCn) {
				this.descriptionCn = descriptionCn;
			}
		}

		public static class NetworkQuotaInfo {

			private String quotaName;

			private String quotaDescription;

			private String quotaQuantity;

			private String instanceQuantity;

			private String canExceptional;

			private String quotaDescriptionCn;

			private String sequence;

			public String getQuotaName() {
				return this.quotaName;
			}

			public void setQuotaName(String quotaName) {
				this.quotaName = quotaName;
			}

			public String getQuotaDescription() {
				return this.quotaDescription;
			}

			public void setQuotaDescription(String quotaDescription) {
				this.quotaDescription = quotaDescription;
			}

			public String getQuotaQuantity() {
				return this.quotaQuantity;
			}

			public void setQuotaQuantity(String quotaQuantity) {
				this.quotaQuantity = quotaQuantity;
			}

			public String getInstanceQuantity() {
				return this.instanceQuantity;
			}

			public void setInstanceQuantity(String instanceQuantity) {
				this.instanceQuantity = instanceQuantity;
			}

			public String getCanExceptional() {
				return this.canExceptional;
			}

			public void setCanExceptional(String canExceptional) {
				this.canExceptional = canExceptional;
			}

			public String getQuotaDescriptionCn() {
				return this.quotaDescriptionCn;
			}

			public void setQuotaDescriptionCn(String quotaDescriptionCn) {
				this.quotaDescriptionCn = quotaDescriptionCn;
			}

			public String getSequence() {
				return this.sequence;
			}

			public void setSequence(String sequence) {
				this.sequence = sequence;
			}
		}
	}

	@Override
	public DescribeNetworkQuotasResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkQuotasResponseUnmarshaller.unmarshall(this, context);
	}
}
