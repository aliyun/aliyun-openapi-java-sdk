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

package com.aliyuncs.cdt.model.v20210813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdt.transform.v20210813.ListCdtProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCdtProductsResponse extends AcsResponse {

	private String requestId;

	private List<CdtProductsItem> cdtProducts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CdtProductsItem> getCdtProducts() {
		return this.cdtProducts;
	}

	public void setCdtProducts(List<CdtProductsItem> cdtProducts) {
		this.cdtProducts = cdtProducts;
	}

	public static class CdtProductsItem {

		private String product;

		private String businessRegionId;

		private String billingType;

		private Boolean switchedToCdt;

		private String cdtType;

		private Long effectiveTime;

		private Long expireTime;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getBusinessRegionId() {
			return this.businessRegionId;
		}

		public void setBusinessRegionId(String businessRegionId) {
			this.businessRegionId = businessRegionId;
		}

		public String getBillingType() {
			return this.billingType;
		}

		public void setBillingType(String billingType) {
			this.billingType = billingType;
		}

		public Boolean getSwitchedToCdt() {
			return this.switchedToCdt;
		}

		public void setSwitchedToCdt(Boolean switchedToCdt) {
			this.switchedToCdt = switchedToCdt;
		}

		public String getCdtType() {
			return this.cdtType;
		}

		public void setCdtType(String cdtType) {
			this.cdtType = cdtType;
		}

		public Long getEffectiveTime() {
			return this.effectiveTime;
		}

		public void setEffectiveTime(Long effectiveTime) {
			this.effectiveTime = effectiveTime;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}
	}

	@Override
	public ListCdtProductsResponse getInstance(UnmarshallerContext context) {
		return	ListCdtProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
