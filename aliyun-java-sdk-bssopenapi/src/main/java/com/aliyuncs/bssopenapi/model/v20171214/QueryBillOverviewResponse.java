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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryBillOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBillOverviewResponse extends AcsResponse {

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

		private String billingCycle;

		private String accountID;

		private String accountName;

		private List<Item> items;

		public String getBillingCycle() {
			return this.billingCycle;
		}

		public void setBillingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
		}

		public String getAccountID() {
			return this.accountID;
		}

		public void setAccountID(String accountID) {
			this.accountID = accountID;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String roundDownDiscount;

			private String item;

			private String currency;

			private String subscriptionType;

			private Float deductedByCashCoupons;

			private String billAccountName;

			private String bizType;

			private Float deductedByCoupons;

			private Float outstandingAmount;

			private Float afterTaxAmount;

			private Float pretaxAmountLocal;

			private Float tax;

			private String pipCode;

			private Float pretaxAmount;

			private String productName;

			private String commodityCode;

			private Float adjustAmount;

			private String productDetail;

			private String paymentCurrency;

			private String ownerID;

			private Float deductedByPrepaidCard;

			private String productType;

			private Float invoiceDiscount;

			private Float paymentAmount;

			private String billAccountID;

			private Float pretaxGrossAmount;

			private Float cashAmount;

			private String productCode;

			public String getRoundDownDiscount() {
				return this.roundDownDiscount;
			}

			public void setRoundDownDiscount(String roundDownDiscount) {
				this.roundDownDiscount = roundDownDiscount;
			}

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public Float getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(Float deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public String getBillAccountName() {
				return this.billAccountName;
			}

			public void setBillAccountName(String billAccountName) {
				this.billAccountName = billAccountName;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public Float getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(Float deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
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

			public Float getPretaxAmountLocal() {
				return this.pretaxAmountLocal;
			}

			public void setPretaxAmountLocal(Float pretaxAmountLocal) {
				this.pretaxAmountLocal = pretaxAmountLocal;
			}

			public Float getTax() {
				return this.tax;
			}

			public void setTax(Float tax) {
				this.tax = tax;
			}

			public String getPipCode() {
				return this.pipCode;
			}

			public void setPipCode(String pipCode) {
				this.pipCode = pipCode;
			}

			public Float getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Float pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public Float getAdjustAmount() {
				return this.adjustAmount;
			}

			public void setAdjustAmount(Float adjustAmount) {
				this.adjustAmount = adjustAmount;
			}

			public String getProductDetail() {
				return this.productDetail;
			}

			public void setProductDetail(String productDetail) {
				this.productDetail = productDetail;
			}

			public String getPaymentCurrency() {
				return this.paymentCurrency;
			}

			public void setPaymentCurrency(String paymentCurrency) {
				this.paymentCurrency = paymentCurrency;
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

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public Float getInvoiceDiscount() {
				return this.invoiceDiscount;
			}

			public void setInvoiceDiscount(Float invoiceDiscount) {
				this.invoiceDiscount = invoiceDiscount;
			}

			public Float getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(Float paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public String getBillAccountID() {
				return this.billAccountID;
			}

			public void setBillAccountID(String billAccountID) {
				this.billAccountID = billAccountID;
			}

			public Float getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(Float pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public Float getCashAmount() {
				return this.cashAmount;
			}

			public void setCashAmount(Float cashAmount) {
				this.cashAmount = cashAmount;
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
	public QueryBillOverviewResponse getInstance(UnmarshallerContext context) {
		return	QueryBillOverviewResponseUnmarshaller.unmarshall(this, context);
	}
}
