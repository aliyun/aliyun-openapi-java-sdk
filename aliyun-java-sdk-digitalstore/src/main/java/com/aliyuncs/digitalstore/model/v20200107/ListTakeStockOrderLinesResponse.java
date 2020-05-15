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
import com.aliyuncs.digitalstore.transform.v20200107.ListTakeStockOrderLinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTakeStockOrderLinesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<TakeStockOrderLineModel> takeStockOrderLines;

	private List<SummaryModel> summarys;

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

	public List<TakeStockOrderLineModel> getTakeStockOrderLines() {
		return this.takeStockOrderLines;
	}

	public void setTakeStockOrderLines(List<TakeStockOrderLineModel> takeStockOrderLines) {
		this.takeStockOrderLines = takeStockOrderLines;
	}

	public List<SummaryModel> getSummarys() {
		return this.summarys;
	}

	public void setSummarys(List<SummaryModel> summarys) {
		this.summarys = summarys;
	}

	public static class TakeStockOrderLineModel {

		private Float differenceAmount;

		private String productName;

		private String productSizeCode;

		private Integer operateQuantity;

		private String createDate;

		private String updateDate;

		private Integer confirmQuantity;

		private String productSizeName;

		private Integer snapQuantity;

		private Float confirmAmount;

		private Float skuCurrentPrice;

		private String productColorCode;

		private Integer differenceQuantity;

		private String barcodeId;

		private Float operateAmount;

		private String orderLineId;

		private String barcode;

		private Float skuRetailPrice;

		private Float snapAmount;

		private String productCode;

		private String takeStockOrderId;

		private String productColorName;

		public Float getDifferenceAmount() {
			return this.differenceAmount;
		}

		public void setDifferenceAmount(Float differenceAmount) {
			this.differenceAmount = differenceAmount;
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

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public Integer getConfirmQuantity() {
			return this.confirmQuantity;
		}

		public void setConfirmQuantity(Integer confirmQuantity) {
			this.confirmQuantity = confirmQuantity;
		}

		public String getProductSizeName() {
			return this.productSizeName;
		}

		public void setProductSizeName(String productSizeName) {
			this.productSizeName = productSizeName;
		}

		public Integer getSnapQuantity() {
			return this.snapQuantity;
		}

		public void setSnapQuantity(Integer snapQuantity) {
			this.snapQuantity = snapQuantity;
		}

		public Float getConfirmAmount() {
			return this.confirmAmount;
		}

		public void setConfirmAmount(Float confirmAmount) {
			this.confirmAmount = confirmAmount;
		}

		public Float getSkuCurrentPrice() {
			return this.skuCurrentPrice;
		}

		public void setSkuCurrentPrice(Float skuCurrentPrice) {
			this.skuCurrentPrice = skuCurrentPrice;
		}

		public String getProductColorCode() {
			return this.productColorCode;
		}

		public void setProductColorCode(String productColorCode) {
			this.productColorCode = productColorCode;
		}

		public Integer getDifferenceQuantity() {
			return this.differenceQuantity;
		}

		public void setDifferenceQuantity(Integer differenceQuantity) {
			this.differenceQuantity = differenceQuantity;
		}

		public String getBarcodeId() {
			return this.barcodeId;
		}

		public void setBarcodeId(String barcodeId) {
			this.barcodeId = barcodeId;
		}

		public Float getOperateAmount() {
			return this.operateAmount;
		}

		public void setOperateAmount(Float operateAmount) {
			this.operateAmount = operateAmount;
		}

		public String getOrderLineId() {
			return this.orderLineId;
		}

		public void setOrderLineId(String orderLineId) {
			this.orderLineId = orderLineId;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public Float getSkuRetailPrice() {
			return this.skuRetailPrice;
		}

		public void setSkuRetailPrice(Float skuRetailPrice) {
			this.skuRetailPrice = skuRetailPrice;
		}

		public Float getSnapAmount() {
			return this.snapAmount;
		}

		public void setSnapAmount(Float snapAmount) {
			this.snapAmount = snapAmount;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getTakeStockOrderId() {
			return this.takeStockOrderId;
		}

		public void setTakeStockOrderId(String takeStockOrderId) {
			this.takeStockOrderId = takeStockOrderId;
		}

		public String getProductColorName() {
			return this.productColorName;
		}

		public void setProductColorName(String productColorName) {
			this.productColorName = productColorName;
		}
	}

	public static class SummaryModel {

		private Integer differenceQuantity;

		private Float snapRetailAmount;

		private Integer operateQuantity;

		private Float differenceRetailAmount;

		private Float operateAmount;

		private Integer confirmQuantity;

		private Integer snapQuantity;

		private Float confirmRetailAmount;

		public Integer getDifferenceQuantity() {
			return this.differenceQuantity;
		}

		public void setDifferenceQuantity(Integer differenceQuantity) {
			this.differenceQuantity = differenceQuantity;
		}

		public Float getSnapRetailAmount() {
			return this.snapRetailAmount;
		}

		public void setSnapRetailAmount(Float snapRetailAmount) {
			this.snapRetailAmount = snapRetailAmount;
		}

		public Integer getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(Integer operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public Float getDifferenceRetailAmount() {
			return this.differenceRetailAmount;
		}

		public void setDifferenceRetailAmount(Float differenceRetailAmount) {
			this.differenceRetailAmount = differenceRetailAmount;
		}

		public Float getOperateAmount() {
			return this.operateAmount;
		}

		public void setOperateAmount(Float operateAmount) {
			this.operateAmount = operateAmount;
		}

		public Integer getConfirmQuantity() {
			return this.confirmQuantity;
		}

		public void setConfirmQuantity(Integer confirmQuantity) {
			this.confirmQuantity = confirmQuantity;
		}

		public Integer getSnapQuantity() {
			return this.snapQuantity;
		}

		public void setSnapQuantity(Integer snapQuantity) {
			this.snapQuantity = snapQuantity;
		}

		public Float getConfirmRetailAmount() {
			return this.confirmRetailAmount;
		}

		public void setConfirmRetailAmount(Float confirmRetailAmount) {
			this.confirmRetailAmount = confirmRetailAmount;
		}
	}

	@Override
	public ListTakeStockOrderLinesResponse getInstance(UnmarshallerContext context) {
		return	ListTakeStockOrderLinesResponseUnmarshaller.unmarshall(this, context);
	}
}
