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

package com.aliyuncs.market_inner.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market_inner.transform.v20160801.InnerQueryPurchaseImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryPurchaseImagesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Image> imageList;

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

	public List<Image> getImageList() {
		return this.imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public static class Image {

		private String requestImageId;

		private String chargeType;

		private String productCode;

		private String productSKUCode;

		private String imageId;

		private String imageVersion;

		private String imageStatus;

		private String regionId;

		private Long supplierId;

		private String supplierName;

		public String getRequestImageId() {
			return this.requestImageId;
		}

		public void setRequestImageId(String requestImageId) {
			this.requestImageId = requestImageId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductSKUCode() {
			return this.productSKUCode;
		}

		public void setProductSKUCode(String productSKUCode) {
			this.productSKUCode = productSKUCode;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getImageStatus() {
			return this.imageStatus;
		}

		public void setImageStatus(String imageStatus) {
			this.imageStatus = imageStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getSupplierId() {
			return this.supplierId;
		}

		public void setSupplierId(Long supplierId) {
			this.supplierId = supplierId;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
	}

	@Override
	public InnerQueryPurchaseImagesResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryPurchaseImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
