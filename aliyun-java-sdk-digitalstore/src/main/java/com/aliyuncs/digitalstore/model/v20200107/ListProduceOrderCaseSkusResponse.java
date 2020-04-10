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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListProduceOrderCaseSkusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProduceOrderCaseSkusResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<ProduceOrderCaseSkuModel> productionOrderCaseSkus;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ProduceOrderCaseSkuModel> getProductionOrderCaseSkus() {
		return this.productionOrderCaseSkus;
	}

	public void setProductionOrderCaseSkus(List<ProduceOrderCaseSkuModel> productionOrderCaseSkus) {
		this.productionOrderCaseSkus = productionOrderCaseSkus;
	}

	public static class ProduceOrderCaseSkuModel {

		private String productSizeName;

		private String caseCode;

		private Integer boxQuantity;

		private String productId;

		private String productColorCode;

		private String productName;

		private String productSizeCode;

		private String productCode;

		private String productSizeId;

		private String productColorId;

		private String caseId;

		private String productColorName;

		private Integer bindingQuantity;

		private String barcodeId;

		private String barcode;

		public String getProductSizeName() {
			return this.productSizeName;
		}

		public void setProductSizeName(String productSizeName) {
			this.productSizeName = productSizeName;
		}

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public Integer getBoxQuantity() {
			return this.boxQuantity;
		}

		public void setBoxQuantity(Integer boxQuantity) {
			this.boxQuantity = boxQuantity;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getProductColorCode() {
			return this.productColorCode;
		}

		public void setProductColorCode(String productColorCode) {
			this.productColorCode = productColorCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductSizeCode() {
			return this.productSizeCode;
		}

		public void setProductSizeCode(String productSizeCode) {
			this.productSizeCode = productSizeCode;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductSizeId() {
			return this.productSizeId;
		}

		public void setProductSizeId(String productSizeId) {
			this.productSizeId = productSizeId;
		}

		public String getProductColorId() {
			return this.productColorId;
		}

		public void setProductColorId(String productColorId) {
			this.productColorId = productColorId;
		}

		public String getCaseId() {
			return this.caseId;
		}

		public void setCaseId(String caseId) {
			this.caseId = caseId;
		}

		public String getProductColorName() {
			return this.productColorName;
		}

		public void setProductColorName(String productColorName) {
			this.productColorName = productColorName;
		}

		public Integer getBindingQuantity() {
			return this.bindingQuantity;
		}

		public void setBindingQuantity(Integer bindingQuantity) {
			this.bindingQuantity = bindingQuantity;
		}

		public String getBarcodeId() {
			return this.barcodeId;
		}

		public void setBarcodeId(String barcodeId) {
			this.barcodeId = barcodeId;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
	}

	@Override
	public ListProduceOrderCaseSkusResponse getInstance(UnmarshallerContext context) {
		return	ListProduceOrderCaseSkusResponseUnmarshaller.unmarshall(this, context);
	}
}
