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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ProductItem> productItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ProductItem> getProductItems() {
		return this.productItems;
	}

	public void setProductItems(List<ProductItem> productItems) {
		this.productItems = productItems;
	}

	public static class ProductItem {

		private String priceInfo;

		private String deliveryWay;

		private String imageUrl;

		private String warrantyDate;

		private String tags;

		private String score;

		private Long supplierId;

		private String operationSystem;

		private String shortDescription;

		private String deliveryDate;

		private String targetUrl;

		private String code;

		private Long categoryId;

		private String name;

		private String suggestedPrice;

		private String supplierName;

		public String getPriceInfo() {
			return this.priceInfo;
		}

		public void setPriceInfo(String priceInfo) {
			this.priceInfo = priceInfo;
		}

		public String getDeliveryWay() {
			return this.deliveryWay;
		}

		public void setDeliveryWay(String deliveryWay) {
			this.deliveryWay = deliveryWay;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getWarrantyDate() {
			return this.warrantyDate;
		}

		public void setWarrantyDate(String warrantyDate) {
			this.warrantyDate = warrantyDate;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public Long getSupplierId() {
			return this.supplierId;
		}

		public void setSupplierId(Long supplierId) {
			this.supplierId = supplierId;
		}

		public String getOperationSystem() {
			return this.operationSystem;
		}

		public void setOperationSystem(String operationSystem) {
			this.operationSystem = operationSystem;
		}

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getDeliveryDate() {
			return this.deliveryDate;
		}

		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}

		public String getTargetUrl() {
			return this.targetUrl;
		}

		public void setTargetUrl(String targetUrl) {
			this.targetUrl = targetUrl;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSuggestedPrice() {
			return this.suggestedPrice;
		}

		public void setSuggestedPrice(String suggestedPrice) {
			this.suggestedPrice = suggestedPrice;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
	}

	@Override
	public DescribeProductsResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductsResponseUnmarshaller.unmarshall(this, context);
	}
}
