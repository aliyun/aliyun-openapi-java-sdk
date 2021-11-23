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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QuerySettlementBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySettlementBillResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private String billingCycle;

		private Integer pageSize;

		private Integer totalCount;

		private List<Item> items;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public String getBillingCycle() {
			return this.billingCycle;
		}

		public void setBillingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
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

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String status;

			private String invoiceNo;

			private String billID;

			private String createTime;

			private String item;

			private String seller;

			private String currency;

			private Float chargeDiscount;

			private Float deductedByCashCoupons;

			private String config;

			private String subscriptionType;

			private String usageStartTime;

			private String usageEndTime;

			private Float deductedByCoupons;

			private String region;

			private Float outstandingAmount;

			private Float afterTaxAmount;

			private String paymentTime;

			private String solutionID;

			private String orderType;

			private String clearedTime;

			private String quantity;

			private Float tax;

			private Float pretaxAmountLocal;

			private Float pretaxAmount;

			private String linkedCustomerOrderID;

			private Float accountDiscount;

			private String recordID;

			private String payerAccount;

			private String promotion;

			private String originalOrderID;

			private Float previousBillingCycleBalance;

			private Float mybankPaymentAmount;

			private String paymentCurrency;

			private String orderID;

			private String ownerID;

			private Float deductedByPrepaidCard;

			private Float paymentAmount;

			private String productType;

			private Float pretaxGrossAmount;

			private String suborderID;

			private String solutionName;

			private String productCode;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getInvoiceNo() {
				return this.invoiceNo;
			}

			public void setInvoiceNo(String invoiceNo) {
				this.invoiceNo = invoiceNo;
			}

			public String getBillID() {
				return this.billID;
			}

			public void setBillID(String billID) {
				this.billID = billID;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getSeller() {
				return this.seller;
			}

			public void setSeller(String seller) {
				this.seller = seller;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Float getChargeDiscount() {
				return this.chargeDiscount;
			}

			public void setChargeDiscount(Float chargeDiscount) {
				this.chargeDiscount = chargeDiscount;
			}

			public Float getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(Float deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getUsageStartTime() {
				return this.usageStartTime;
			}

			public void setUsageStartTime(String usageStartTime) {
				this.usageStartTime = usageStartTime;
			}

			public String getUsageEndTime() {
				return this.usageEndTime;
			}

			public void setUsageEndTime(String usageEndTime) {
				this.usageEndTime = usageEndTime;
			}

			public Float getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(Float deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Float getOutstandingAmount() {
				return this.outstandingAmount;
			}

			public void setOutstandingAmount(Float outstandingAmount) {
				this.outstandingAmount = outstandingAmount;
			}

			public Float getAfterTaxAmount() {
				return this.afterTaxAmount;
			}

			public void setAfterTaxAmount(Float afterTaxAmount) {
				this.afterTaxAmount = afterTaxAmount;
			}

			public String getPaymentTime() {
				return this.paymentTime;
			}

			public void setPaymentTime(String paymentTime) {
				this.paymentTime = paymentTime;
			}

			public String getSolutionID() {
				return this.solutionID;
			}

			public void setSolutionID(String solutionID) {
				this.solutionID = solutionID;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public String getClearedTime() {
				return this.clearedTime;
			}

			public void setClearedTime(String clearedTime) {
				this.clearedTime = clearedTime;
			}

			public String getQuantity() {
				return this.quantity;
			}

			public void setQuantity(String quantity) {
				this.quantity = quantity;
			}

			public Float getTax() {
				return this.tax;
			}

			public void setTax(Float tax) {
				this.tax = tax;
			}

			public Float getPretaxAmountLocal() {
				return this.pretaxAmountLocal;
			}

			public void setPretaxAmountLocal(Float pretaxAmountLocal) {
				this.pretaxAmountLocal = pretaxAmountLocal;
			}

			public Float getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Float pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getLinkedCustomerOrderID() {
				return this.linkedCustomerOrderID;
			}

			public void setLinkedCustomerOrderID(String linkedCustomerOrderID) {
				this.linkedCustomerOrderID = linkedCustomerOrderID;
			}

			public Float getAccountDiscount() {
				return this.accountDiscount;
			}

			public void setAccountDiscount(Float accountDiscount) {
				this.accountDiscount = accountDiscount;
			}

			public String getRecordID() {
				return this.recordID;
			}

			public void setRecordID(String recordID) {
				this.recordID = recordID;
			}

			public String getPayerAccount() {
				return this.payerAccount;
			}

			public void setPayerAccount(String payerAccount) {
				this.payerAccount = payerAccount;
			}

			public String getPromotion() {
				return this.promotion;
			}

			public void setPromotion(String promotion) {
				this.promotion = promotion;
			}

			public String getOriginalOrderID() {
				return this.originalOrderID;
			}

			public void setOriginalOrderID(String originalOrderID) {
				this.originalOrderID = originalOrderID;
			}

			public Float getPreviousBillingCycleBalance() {
				return this.previousBillingCycleBalance;
			}

			public void setPreviousBillingCycleBalance(Float previousBillingCycleBalance) {
				this.previousBillingCycleBalance = previousBillingCycleBalance;
			}

			public Float getMybankPaymentAmount() {
				return this.mybankPaymentAmount;
			}

			public void setMybankPaymentAmount(Float mybankPaymentAmount) {
				this.mybankPaymentAmount = mybankPaymentAmount;
			}

			public String getPaymentCurrency() {
				return this.paymentCurrency;
			}

			public void setPaymentCurrency(String paymentCurrency) {
				this.paymentCurrency = paymentCurrency;
			}

			public String getOrderID() {
				return this.orderID;
			}

			public void setOrderID(String orderID) {
				this.orderID = orderID;
			}

			public String getOwnerID() {
				return this.ownerID;
			}

			public void setOwnerID(String ownerID) {
				this.ownerID = ownerID;
			}

			public Float getDeductedByPrepaidCard() {
				return this.deductedByPrepaidCard;
			}

			public void setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
				this.deductedByPrepaidCard = deductedByPrepaidCard;
			}

			public Float getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(Float paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public Float getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(Float pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public String getSuborderID() {
				return this.suborderID;
			}

			public void setSuborderID(String suborderID) {
				this.suborderID = suborderID;
			}

			public String getSolutionName() {
				return this.solutionName;
			}

			public void setSolutionName(String solutionName) {
				this.solutionName = solutionName;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}
		}
	}

	@Override
	public QuerySettlementBillResponse getInstance(UnmarshallerContext context) {
		return	QuerySettlementBillResponseUnmarshaller.unmarshall(this, context);
	}
}
