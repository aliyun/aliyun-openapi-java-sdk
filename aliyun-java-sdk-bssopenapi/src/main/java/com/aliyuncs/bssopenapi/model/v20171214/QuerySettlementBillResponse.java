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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QuerySettlementBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySettlementBillResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalCount;

		private String billingCycle;

		private List<Item> items;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
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

		public String getBillingCycle() {
			return this.billingCycle;
		}

		public void setBillingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String recordID;

			private String item;

			private String payerAccount;

			private String ownerID;

			private String createTime;

			private String usageStartTime;

			private String usageEndTime;

			private String suborderID;

			private String orderID;

			private String orderType;

			private String linkedCustomerOrderID;

			private String originalOrderID;

			private String paymentTime;

			private String solutionID;

			private String solutionName;

			private String billID;

			private String productCode;

			private String productType;

			private String subscriptionType;

			private String region;

			private String config;

			private String quantity;

			private Float pretaxGrossAmount;

			private Float chargeDiscount;

			private Float deductedByCoupons;

			private Float accountDiscount;

			private String promotion;

			private Float pretaxAmount;

			private String currency;

			private Float pretaxAmountLocal;

			private Float previousBillingCycleBalance;

			private Float tax;

			private Float afterTaxAmount;

			private String status;

			private String clearedTime;

			private Float outstandingAmount;

			private Float deductedByCashCoupons;

			private Float deductedByPrepaidCard;

			private Float mybankPaymentAmount;

			private Float paymentAmount;

			private String paymentCurrency;

			private String seller;

			private String invoiceNo;

			public String getRecordID() {
				return this.recordID;
			}

			public void setRecordID(String recordID) {
				this.recordID = recordID;
			}

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getPayerAccount() {
				return this.payerAccount;
			}

			public void setPayerAccount(String payerAccount) {
				this.payerAccount = payerAccount;
			}

			public String getOwnerID() {
				return this.ownerID;
			}

			public void setOwnerID(String ownerID) {
				this.ownerID = ownerID;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
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

			public String getSuborderID() {
				return this.suborderID;
			}

			public void setSuborderID(String suborderID) {
				this.suborderID = suborderID;
			}

			public String getOrderID() {
				return this.orderID;
			}

			public void setOrderID(String orderID) {
				this.orderID = orderID;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public String getLinkedCustomerOrderID() {
				return this.linkedCustomerOrderID;
			}

			public void setLinkedCustomerOrderID(String linkedCustomerOrderID) {
				this.linkedCustomerOrderID = linkedCustomerOrderID;
			}

			public String getOriginalOrderID() {
				return this.originalOrderID;
			}

			public void setOriginalOrderID(String originalOrderID) {
				this.originalOrderID = originalOrderID;
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

			public String getSolutionName() {
				return this.solutionName;
			}

			public void setSolutionName(String solutionName) {
				this.solutionName = solutionName;
			}

			public String getBillID() {
				return this.billID;
			}

			public void setBillID(String billID) {
				this.billID = billID;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}

			public String getQuantity() {
				return this.quantity;
			}

			public void setQuantity(String quantity) {
				this.quantity = quantity;
			}

			public Float getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(Float pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public Float getChargeDiscount() {
				return this.chargeDiscount;
			}

			public void setChargeDiscount(Float chargeDiscount) {
				this.chargeDiscount = chargeDiscount;
			}

			public Float getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(Float deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
			}

			public Float getAccountDiscount() {
				return this.accountDiscount;
			}

			public void setAccountDiscount(Float accountDiscount) {
				this.accountDiscount = accountDiscount;
			}

			public String getPromotion() {
				return this.promotion;
			}

			public void setPromotion(String promotion) {
				this.promotion = promotion;
			}

			public Float getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Float pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Float getPretaxAmountLocal() {
				return this.pretaxAmountLocal;
			}

			public void setPretaxAmountLocal(Float pretaxAmountLocal) {
				this.pretaxAmountLocal = pretaxAmountLocal;
			}

			public Float getPreviousBillingCycleBalance() {
				return this.previousBillingCycleBalance;
			}

			public void setPreviousBillingCycleBalance(Float previousBillingCycleBalance) {
				this.previousBillingCycleBalance = previousBillingCycleBalance;
			}

			public Float getTax() {
				return this.tax;
			}

			public void setTax(Float tax) {
				this.tax = tax;
			}

			public Float getAfterTaxAmount() {
				return this.afterTaxAmount;
			}

			public void setAfterTaxAmount(Float afterTaxAmount) {
				this.afterTaxAmount = afterTaxAmount;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getClearedTime() {
				return this.clearedTime;
			}

			public void setClearedTime(String clearedTime) {
				this.clearedTime = clearedTime;
			}

			public Float getOutstandingAmount() {
				return this.outstandingAmount;
			}

			public void setOutstandingAmount(Float outstandingAmount) {
				this.outstandingAmount = outstandingAmount;
			}

			public Float getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(Float deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public Float getDeductedByPrepaidCard() {
				return this.deductedByPrepaidCard;
			}

			public void setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
				this.deductedByPrepaidCard = deductedByPrepaidCard;
			}

			public Float getMybankPaymentAmount() {
				return this.mybankPaymentAmount;
			}

			public void setMybankPaymentAmount(Float mybankPaymentAmount) {
				this.mybankPaymentAmount = mybankPaymentAmount;
			}

			public Float getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(Float paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public String getPaymentCurrency() {
				return this.paymentCurrency;
			}

			public void setPaymentCurrency(String paymentCurrency) {
				this.paymentCurrency = paymentCurrency;
			}

			public String getSeller() {
				return this.seller;
			}

			public void setSeller(String seller) {
				this.seller = seller;
			}

			public String getInvoiceNo() {
				return this.invoiceNo;
			}

			public void setInvoiceNo(String invoiceNo) {
				this.invoiceNo = invoiceNo;
			}
		}
	}

	@Override
	public QuerySettlementBillResponse getInstance(UnmarshallerContext context) {
		return	QuerySettlementBillResponseUnmarshaller.unmarshall(this, context);
	}
}
