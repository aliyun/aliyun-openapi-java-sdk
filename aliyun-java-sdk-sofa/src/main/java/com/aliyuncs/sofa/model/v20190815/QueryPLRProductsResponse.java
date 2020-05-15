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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryPLRProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPLRProductsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<ProductsItem> products;

	private List<ProductsetsItem> productsets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<ProductsItem> getProducts() {
		return this.products;
	}

	public void setProducts(List<ProductsItem> products) {
		this.products = products;
	}

	public List<ProductsetsItem> getProductsets() {
		return this.productsets;
	}

	public void setProductsets(List<ProductsetsItem> productsets) {
		this.productsets = productsets;
	}

	public static class ProductsItem {

		private String capabilityInfo;

		private String category;

		private String commodityCode;

		private String description;

		private String docLink;

		private Boolean enabled;

		private Boolean isHot;

		private String meritInfo;

		private String name;

		private String payment;

		private String serviceCode;

		private List<String> dependents;

		public String getCapabilityInfo() {
			return this.capabilityInfo;
		}

		public void setCapabilityInfo(String capabilityInfo) {
			this.capabilityInfo = capabilityInfo;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDocLink() {
			return this.docLink;
		}

		public void setDocLink(String docLink) {
			this.docLink = docLink;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Boolean getIsHot() {
			return this.isHot;
		}

		public void setIsHot(Boolean isHot) {
			this.isHot = isHot;
		}

		public String getMeritInfo() {
			return this.meritInfo;
		}

		public void setMeritInfo(String meritInfo) {
			this.meritInfo = meritInfo;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPayment() {
			return this.payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public String getServiceCode() {
			return this.serviceCode;
		}

		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}

		public List<String> getDependents() {
			return this.dependents;
		}

		public void setDependents(List<String> dependents) {
			this.dependents = dependents;
		}
	}

	public static class ProductsetsItem {

		private String description;

		private Boolean hasDiscount;

		private String name;

		private String payment;

		private String planCode;

		private List<String> containingProducts;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getHasDiscount() {
			return this.hasDiscount;
		}

		public void setHasDiscount(Boolean hasDiscount) {
			this.hasDiscount = hasDiscount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPayment() {
			return this.payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public String getPlanCode() {
			return this.planCode;
		}

		public void setPlanCode(String planCode) {
			this.planCode = planCode;
		}

		public List<String> getContainingProducts() {
			return this.containingProducts;
		}

		public void setContainingProducts(List<String> containingProducts) {
			this.containingProducts = containingProducts;
		}
	}

	@Override
	public QueryPLRProductsResponse getInstance(UnmarshallerContext context) {
		return	QueryPLRProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
