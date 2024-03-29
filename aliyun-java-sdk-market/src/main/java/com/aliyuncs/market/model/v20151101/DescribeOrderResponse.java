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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrderResponse extends AcsResponse {

	private String productName;

	private String supplierCompanyName;

	private Float originalPrice;

	private Long aliUid;

	private Float couponPrice;

	private Long accountQuantity;

	private String periodType;

	private String requestId;

	private String payStatus;

	private Float paymentPrice;

	private String orderStatus;

	private String productSkuCode;

	private Long paidOn;

	private Map<Object,Object> components;

	private Long createdOn;

	private String orderType;

	private Float totalPrice;

	private Integer quantity;

	private Long orderId;

	private String productCode;

	private List<String> supplierTelephones;

	private List<String> instanceIds;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierCompanyName() {
		return this.supplierCompanyName;
	}

	public void setSupplierCompanyName(String supplierCompanyName) {
		this.supplierCompanyName = supplierCompanyName;
	}

	public Float getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(Float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public Float getCouponPrice() {
		return this.couponPrice;
	}

	public void setCouponPrice(Float couponPrice) {
		this.couponPrice = couponPrice;
	}

	public Long getAccountQuantity() {
		return this.accountQuantity;
	}

	public void setAccountQuantity(Long accountQuantity) {
		this.accountQuantity = accountQuantity;
	}

	public String getPeriodType() {
		return this.periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Float getPaymentPrice() {
		return this.paymentPrice;
	}

	public void setPaymentPrice(Float paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getProductSkuCode() {
		return this.productSkuCode;
	}

	public void setProductSkuCode(String productSkuCode) {
		this.productSkuCode = productSkuCode;
	}

	public Long getPaidOn() {
		return this.paidOn;
	}

	public void setPaidOn(Long paidOn) {
		this.paidOn = paidOn;
	}

	public Map<Object,Object> getComponents() {
		return this.components;
	}

	public void setComponents(Map<Object,Object> components) {
		this.components = components;
	}

	public Long getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getSupplierTelephones() {
		return this.supplierTelephones;
	}

	public void setSupplierTelephones(List<String> supplierTelephones) {
		this.supplierTelephones = supplierTelephones;
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	@Override
	public DescribeOrderResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
