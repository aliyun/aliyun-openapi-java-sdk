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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.GetProduceOrderByTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProduceOrderByTagResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String orderId;

	private String orderCode;

	private String sourceOrderCode;

	private String caseId;

	private String caseCode;

	private String tag;

	private String barcode;

	private String sKUId;

	private String productId;

	private String productCode;

	private String productName;

	private String productColorCode;

	private String productColorId;

	private String productColorName;

	private String productSizeCode;

	private String productSizeId;

	private String productSizeName;

	private String sKUName;

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

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getSourceOrderCode() {
		return this.sourceOrderCode;
	}

	public void setSourceOrderCode(String sourceOrderCode) {
		this.sourceOrderCode = sourceOrderCode;
	}

	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseCode() {
		return this.caseCode;
	}

	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getSKUId() {
		return this.sKUId;
	}

	public void setSKUId(String sKUId) {
		this.sKUId = sKUId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductColorCode() {
		return this.productColorCode;
	}

	public void setProductColorCode(String productColorCode) {
		this.productColorCode = productColorCode;
	}

	public String getProductColorId() {
		return this.productColorId;
	}

	public void setProductColorId(String productColorId) {
		this.productColorId = productColorId;
	}

	public String getProductColorName() {
		return this.productColorName;
	}

	public void setProductColorName(String productColorName) {
		this.productColorName = productColorName;
	}

	public String getProductSizeCode() {
		return this.productSizeCode;
	}

	public void setProductSizeCode(String productSizeCode) {
		this.productSizeCode = productSizeCode;
	}

	public String getProductSizeId() {
		return this.productSizeId;
	}

	public void setProductSizeId(String productSizeId) {
		this.productSizeId = productSizeId;
	}

	public String getProductSizeName() {
		return this.productSizeName;
	}

	public void setProductSizeName(String productSizeName) {
		this.productSizeName = productSizeName;
	}

	public String getSKUName() {
		return this.sKUName;
	}

	public void setSKUName(String sKUName) {
		this.sKUName = sKUName;
	}

	@Override
	public GetProduceOrderByTagResponse getInstance(UnmarshallerContext context) {
		return	GetProduceOrderByTagResponseUnmarshaller.unmarshall(this, context);
	}
}
