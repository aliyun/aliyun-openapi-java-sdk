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
import com.aliyuncs.digitalstore.transform.v20200107.ListProduceOrderLinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProduceOrderLinesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<ProduceOrderLineModel> produceOrderLines;

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

	public List<ProduceOrderLineModel> getProduceOrderLines() {
		return this.produceOrderLines;
	}

	public void setProduceOrderLines(List<ProduceOrderLineModel> produceOrderLines) {
		this.produceOrderLines = produceOrderLines;
	}

	public static class ProduceOrderLineModel {

		private String productId;

		private String productColorCode;

		private String orderId;

		private String updateDate;

		private String productSizeName;

		private String productName;

		private String productSizeCode;

		private Integer operateQuantity;

		private String createDate;

		private Integer inboundQuantity;

		private Integer boxedNum;

		private Integer quantity;

		private String productColorName;

		private String productCode;

		private Integer businessPrice;

		private String barcodeId;

		private String barcode;

		private String sKUName;

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

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getProductSizeName() {
			return this.productSizeName;
		}

		public void setProductSizeName(String productSizeName) {
			this.productSizeName = productSizeName;
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

		public Integer getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(Integer operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public Integer getInboundQuantity() {
			return this.inboundQuantity;
		}

		public void setInboundQuantity(Integer inboundQuantity) {
			this.inboundQuantity = inboundQuantity;
		}

		public Integer getBoxedNum() {
			return this.boxedNum;
		}

		public void setBoxedNum(Integer boxedNum) {
			this.boxedNum = boxedNum;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getProductColorName() {
			return this.productColorName;
		}

		public void setProductColorName(String productColorName) {
			this.productColorName = productColorName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Integer getBusinessPrice() {
			return this.businessPrice;
		}

		public void setBusinessPrice(Integer businessPrice) {
			this.businessPrice = businessPrice;
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

		public String getSKUName() {
			return this.sKUName;
		}

		public void setSKUName(String sKUName) {
			this.sKUName = sKUName;
		}
	}

	@Override
	public ListProduceOrderLinesResponse getInstance(UnmarshallerContext context) {
		return	ListProduceOrderLinesResponseUnmarshaller.unmarshall(this, context);
	}
}
