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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryInstanceGaapCostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceGaapCostResponse extends AcsResponse {

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

		private Integer pageSize;

		private Integer totalCount;

		private String hostId;

		private List<Module> modules;

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

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public List<Module> getModules() {
			return this.modules;
		}

		public void setModules(List<Module> modules) {
			this.modules = modules;
		}

		public static class Module {

			private String gaapDeductedByCashCoupons;

			private String subscriptionType;

			private String monthGaapPretaxAmount;

			private String deductedByCoupons;

			private String subOrderId;

			private String region;

			private String orderType;

			private String monthGaapDeductedByPrepaidCard;

			private String unallocatedDeductedByCashCoupons;

			private String pretaxAmountLocal;

			private String billingCycle;

			private String payerAccount;

			private String monthGaapPretaxAmountLocal;

			private String accountingUnit;

			private String gaapPretaxAmountLocal;

			private String unallocatedDeductedByPrepaidCard;

			private String productType;

			private String paymentAmount;

			private String monthGaapPretaxGrossAmount;

			private String billType;

			private String payTime;

			private String pretaxGrossAmount;

			private String orderId;

			private String unallocatedPricingDiscount;

			private String monthGaapDeductedByCashCoupons;

			private String unallocatedPretaxGrossAmount;

			private String instanceID;

			private String tag;

			private String currency;

			private String gaapDeductedByCoupons;

			private String deductedByCashCoupons;

			private String gaapDeductedByPrepaidCard;

			private String gaapPaymentAmount;

			private String unallocatedPretaxAmountLocal;

			private String monthGaapPricingDiscount;

			private String pricingDiscount;

			private String gaapPricingDiscount;

			private String resourceGroup;

			private String unallocatedDeductedByCoupons;

			private String pretaxAmount;

			private String unallocatedPretaxAmount;

			private String gaapPretaxGrossAmount;

			private String unallocatedPaymentAmount;

			private String paymentCurrency;

			private String ownerID;

			private String deductedByPrepaidCard;

			private String gaapPretaxAmount;

			private String monthGaapDeductedByCoupons;

			private String monthGaapPaymentAmount;

			private String usageEndDate;

			private String usageStartDate;

			private String productCode;

			public String getGaapDeductedByCashCoupons() {
				return this.gaapDeductedByCashCoupons;
			}

			public void setGaapDeductedByCashCoupons(String gaapDeductedByCashCoupons) {
				this.gaapDeductedByCashCoupons = gaapDeductedByCashCoupons;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getMonthGaapPretaxAmount() {
				return this.monthGaapPretaxAmount;
			}

			public void setMonthGaapPretaxAmount(String monthGaapPretaxAmount) {
				this.monthGaapPretaxAmount = monthGaapPretaxAmount;
			}

			public String getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(String deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
			}

			public String getSubOrderId() {
				return this.subOrderId;
			}

			public void setSubOrderId(String subOrderId) {
				this.subOrderId = subOrderId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public String getMonthGaapDeductedByPrepaidCard() {
				return this.monthGaapDeductedByPrepaidCard;
			}

			public void setMonthGaapDeductedByPrepaidCard(String monthGaapDeductedByPrepaidCard) {
				this.monthGaapDeductedByPrepaidCard = monthGaapDeductedByPrepaidCard;
			}

			public String getUnallocatedDeductedByCashCoupons() {
				return this.unallocatedDeductedByCashCoupons;
			}

			public void setUnallocatedDeductedByCashCoupons(String unallocatedDeductedByCashCoupons) {
				this.unallocatedDeductedByCashCoupons = unallocatedDeductedByCashCoupons;
			}

			public String getPretaxAmountLocal() {
				return this.pretaxAmountLocal;
			}

			public void setPretaxAmountLocal(String pretaxAmountLocal) {
				this.pretaxAmountLocal = pretaxAmountLocal;
			}

			public String getBillingCycle() {
				return this.billingCycle;
			}

			public void setBillingCycle(String billingCycle) {
				this.billingCycle = billingCycle;
			}

			public String getPayerAccount() {
				return this.payerAccount;
			}

			public void setPayerAccount(String payerAccount) {
				this.payerAccount = payerAccount;
			}

			public String getMonthGaapPretaxAmountLocal() {
				return this.monthGaapPretaxAmountLocal;
			}

			public void setMonthGaapPretaxAmountLocal(String monthGaapPretaxAmountLocal) {
				this.monthGaapPretaxAmountLocal = monthGaapPretaxAmountLocal;
			}

			public String getAccountingUnit() {
				return this.accountingUnit;
			}

			public void setAccountingUnit(String accountingUnit) {
				this.accountingUnit = accountingUnit;
			}

			public String getGaapPretaxAmountLocal() {
				return this.gaapPretaxAmountLocal;
			}

			public void setGaapPretaxAmountLocal(String gaapPretaxAmountLocal) {
				this.gaapPretaxAmountLocal = gaapPretaxAmountLocal;
			}

			public String getUnallocatedDeductedByPrepaidCard() {
				return this.unallocatedDeductedByPrepaidCard;
			}

			public void setUnallocatedDeductedByPrepaidCard(String unallocatedDeductedByPrepaidCard) {
				this.unallocatedDeductedByPrepaidCard = unallocatedDeductedByPrepaidCard;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(String paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public String getMonthGaapPretaxGrossAmount() {
				return this.monthGaapPretaxGrossAmount;
			}

			public void setMonthGaapPretaxGrossAmount(String monthGaapPretaxGrossAmount) {
				this.monthGaapPretaxGrossAmount = monthGaapPretaxGrossAmount;
			}

			public String getBillType() {
				return this.billType;
			}

			public void setBillType(String billType) {
				this.billType = billType;
			}

			public String getPayTime() {
				return this.payTime;
			}

			public void setPayTime(String payTime) {
				this.payTime = payTime;
			}

			public String getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(String pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getUnallocatedPricingDiscount() {
				return this.unallocatedPricingDiscount;
			}

			public void setUnallocatedPricingDiscount(String unallocatedPricingDiscount) {
				this.unallocatedPricingDiscount = unallocatedPricingDiscount;
			}

			public String getMonthGaapDeductedByCashCoupons() {
				return this.monthGaapDeductedByCashCoupons;
			}

			public void setMonthGaapDeductedByCashCoupons(String monthGaapDeductedByCashCoupons) {
				this.monthGaapDeductedByCashCoupons = monthGaapDeductedByCashCoupons;
			}

			public String getUnallocatedPretaxGrossAmount() {
				return this.unallocatedPretaxGrossAmount;
			}

			public void setUnallocatedPretaxGrossAmount(String unallocatedPretaxGrossAmount) {
				this.unallocatedPretaxGrossAmount = unallocatedPretaxGrossAmount;
			}

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getGaapDeductedByCoupons() {
				return this.gaapDeductedByCoupons;
			}

			public void setGaapDeductedByCoupons(String gaapDeductedByCoupons) {
				this.gaapDeductedByCoupons = gaapDeductedByCoupons;
			}

			public String getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(String deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public String getGaapDeductedByPrepaidCard() {
				return this.gaapDeductedByPrepaidCard;
			}

			public void setGaapDeductedByPrepaidCard(String gaapDeductedByPrepaidCard) {
				this.gaapDeductedByPrepaidCard = gaapDeductedByPrepaidCard;
			}

			public String getGaapPaymentAmount() {
				return this.gaapPaymentAmount;
			}

			public void setGaapPaymentAmount(String gaapPaymentAmount) {
				this.gaapPaymentAmount = gaapPaymentAmount;
			}

			public String getUnallocatedPretaxAmountLocal() {
				return this.unallocatedPretaxAmountLocal;
			}

			public void setUnallocatedPretaxAmountLocal(String unallocatedPretaxAmountLocal) {
				this.unallocatedPretaxAmountLocal = unallocatedPretaxAmountLocal;
			}

			public String getMonthGaapPricingDiscount() {
				return this.monthGaapPricingDiscount;
			}

			public void setMonthGaapPricingDiscount(String monthGaapPricingDiscount) {
				this.monthGaapPricingDiscount = monthGaapPricingDiscount;
			}

			public String getPricingDiscount() {
				return this.pricingDiscount;
			}

			public void setPricingDiscount(String pricingDiscount) {
				this.pricingDiscount = pricingDiscount;
			}

			public String getGaapPricingDiscount() {
				return this.gaapPricingDiscount;
			}

			public void setGaapPricingDiscount(String gaapPricingDiscount) {
				this.gaapPricingDiscount = gaapPricingDiscount;
			}

			public String getResourceGroup() {
				return this.resourceGroup;
			}

			public void setResourceGroup(String resourceGroup) {
				this.resourceGroup = resourceGroup;
			}

			public String getUnallocatedDeductedByCoupons() {
				return this.unallocatedDeductedByCoupons;
			}

			public void setUnallocatedDeductedByCoupons(String unallocatedDeductedByCoupons) {
				this.unallocatedDeductedByCoupons = unallocatedDeductedByCoupons;
			}

			public String getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(String pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getUnallocatedPretaxAmount() {
				return this.unallocatedPretaxAmount;
			}

			public void setUnallocatedPretaxAmount(String unallocatedPretaxAmount) {
				this.unallocatedPretaxAmount = unallocatedPretaxAmount;
			}

			public String getGaapPretaxGrossAmount() {
				return this.gaapPretaxGrossAmount;
			}

			public void setGaapPretaxGrossAmount(String gaapPretaxGrossAmount) {
				this.gaapPretaxGrossAmount = gaapPretaxGrossAmount;
			}

			public String getUnallocatedPaymentAmount() {
				return this.unallocatedPaymentAmount;
			}

			public void setUnallocatedPaymentAmount(String unallocatedPaymentAmount) {
				this.unallocatedPaymentAmount = unallocatedPaymentAmount;
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

			public String getDeductedByPrepaidCard() {
				return this.deductedByPrepaidCard;
			}

			public void setDeductedByPrepaidCard(String deductedByPrepaidCard) {
				this.deductedByPrepaidCard = deductedByPrepaidCard;
			}

			public String getGaapPretaxAmount() {
				return this.gaapPretaxAmount;
			}

			public void setGaapPretaxAmount(String gaapPretaxAmount) {
				this.gaapPretaxAmount = gaapPretaxAmount;
			}

			public String getMonthGaapDeductedByCoupons() {
				return this.monthGaapDeductedByCoupons;
			}

			public void setMonthGaapDeductedByCoupons(String monthGaapDeductedByCoupons) {
				this.monthGaapDeductedByCoupons = monthGaapDeductedByCoupons;
			}

			public String getMonthGaapPaymentAmount() {
				return this.monthGaapPaymentAmount;
			}

			public void setMonthGaapPaymentAmount(String monthGaapPaymentAmount) {
				this.monthGaapPaymentAmount = monthGaapPaymentAmount;
			}

			public String getUsageEndDate() {
				return this.usageEndDate;
			}

			public void setUsageEndDate(String usageEndDate) {
				this.usageEndDate = usageEndDate;
			}

			public String getUsageStartDate() {
				return this.usageStartDate;
			}

			public void setUsageStartDate(String usageStartDate) {
				this.usageStartDate = usageStartDate;
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
	public QueryInstanceGaapCostResponse getInstance(UnmarshallerContext context) {
		return	QueryInstanceGaapCostResponseUnmarshaller.unmarshall(this, context);
	}
}
