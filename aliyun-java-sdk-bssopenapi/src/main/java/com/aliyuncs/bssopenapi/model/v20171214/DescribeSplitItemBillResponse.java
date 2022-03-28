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
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeSplitItemBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSplitItemBillResponse extends AcsResponse {

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

		private String nextToken;

		private String billingCycle;

		private Integer maxResults;

		private String accountID;

		private Integer totalCount;

		private String accountName;

		private List<Item> items;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public String getBillingCycle() {
			return this.billingCycle;
		}

		public void setBillingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public String getAccountID() {
			return this.accountID;
		}

		public void setAccountID(String accountID) {
			this.accountID = accountID;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

			private String splitAccountID;

			private String billAccountName;

			private String subscriptionType;

			private String instanceSpec;

			private Float deductedByCoupons;

			private String region;

			private Float outstandingAmount;

			private String pipCode;

			private String commodityCode;

			private String nickName;

			private String productDetail;

			private String usage;

			private String intranetIP;

			private String usageUnit;

			private String splitCommodityCode;

			private String billAccountID;

			private String productType;

			private String deductedByResourcePackage;

			private Float paymentAmount;

			private String splitBillingCycle;

			private String servicePeriod;

			private String splitItemName;

			private String listPrice;

			private String zone;

			private Float pretaxGrossAmount;

			private Float cashAmount;

			private String instanceConfig;

			private String billingDate;

			private String internetIP;

			private String item;

			private String splitItemID;

			private String instanceID;

			private String tag;

			private String currency;

			private Float deductedByCashCoupons;

			private String bizType;

			private String billingItem;

			private String billingItemCode;

			private String costUnit;

			private String listPriceUnit;

			private String resourceGroup;

			private Float pretaxAmount;

			private String servicePeriodUnit;

			private String splitBillingDate;

			private String productName;

			private String splitProductDetail;

			private Float adjustAmount;

			private String ownerID;

			private Float deductedByPrepaidCard;

			private Float invoiceDiscount;

			private String splitAccountName;

			private String billingType;

			private String productCode;

			private String itemName;

			public String getSplitAccountID() {
				return this.splitAccountID;
			}

			public void setSplitAccountID(String splitAccountID) {
				this.splitAccountID = splitAccountID;
			}

			public String getBillAccountName() {
				return this.billAccountName;
			}

			public void setBillAccountName(String billAccountName) {
				this.billAccountName = billAccountName;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getInstanceSpec() {
				return this.instanceSpec;
			}

			public void setInstanceSpec(String instanceSpec) {
				this.instanceSpec = instanceSpec;
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

			public String getPipCode() {
				return this.pipCode;
			}

			public void setPipCode(String pipCode) {
				this.pipCode = pipCode;
			}

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getProductDetail() {
				return this.productDetail;
			}

			public void setProductDetail(String productDetail) {
				this.productDetail = productDetail;
			}

			public String getUsage() {
				return this.usage;
			}

			public void setUsage(String usage) {
				this.usage = usage;
			}

			public String getIntranetIP() {
				return this.intranetIP;
			}

			public void setIntranetIP(String intranetIP) {
				this.intranetIP = intranetIP;
			}

			public String getUsageUnit() {
				return this.usageUnit;
			}

			public void setUsageUnit(String usageUnit) {
				this.usageUnit = usageUnit;
			}

			public String getSplitCommodityCode() {
				return this.splitCommodityCode;
			}

			public void setSplitCommodityCode(String splitCommodityCode) {
				this.splitCommodityCode = splitCommodityCode;
			}

			public String getBillAccountID() {
				return this.billAccountID;
			}

			public void setBillAccountID(String billAccountID) {
				this.billAccountID = billAccountID;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getDeductedByResourcePackage() {
				return this.deductedByResourcePackage;
			}

			public void setDeductedByResourcePackage(String deductedByResourcePackage) {
				this.deductedByResourcePackage = deductedByResourcePackage;
			}

			public Float getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(Float paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public String getSplitBillingCycle() {
				return this.splitBillingCycle;
			}

			public void setSplitBillingCycle(String splitBillingCycle) {
				this.splitBillingCycle = splitBillingCycle;
			}

			public String getServicePeriod() {
				return this.servicePeriod;
			}

			public void setServicePeriod(String servicePeriod) {
				this.servicePeriod = servicePeriod;
			}

			public String getSplitItemName() {
				return this.splitItemName;
			}

			public void setSplitItemName(String splitItemName) {
				this.splitItemName = splitItemName;
			}

			public String getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(String listPrice) {
				this.listPrice = listPrice;
			}

			public String getZone() {
				return this.zone;
			}

			public void setZone(String zone) {
				this.zone = zone;
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

			public String getInstanceConfig() {
				return this.instanceConfig;
			}

			public void setInstanceConfig(String instanceConfig) {
				this.instanceConfig = instanceConfig;
			}

			public String getBillingDate() {
				return this.billingDate;
			}

			public void setBillingDate(String billingDate) {
				this.billingDate = billingDate;
			}

			public String getInternetIP() {
				return this.internetIP;
			}

			public void setInternetIP(String internetIP) {
				this.internetIP = internetIP;
			}

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getSplitItemID() {
				return this.splitItemID;
			}

			public void setSplitItemID(String splitItemID) {
				this.splitItemID = splitItemID;
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

			public Float getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(Float deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public String getBillingItem() {
				return this.billingItem;
			}

			public void setBillingItem(String billingItem) {
				this.billingItem = billingItem;
			}

			public String getBillingItemCode() {
				return this.billingItemCode;
			}

			public void setBillingItemCode(String billingItemCode) {
				this.billingItemCode = billingItemCode;
			}

			public String getCostUnit() {
				return this.costUnit;
			}

			public void setCostUnit(String costUnit) {
				this.costUnit = costUnit;
			}

			public String getListPriceUnit() {
				return this.listPriceUnit;
			}

			public void setListPriceUnit(String listPriceUnit) {
				this.listPriceUnit = listPriceUnit;
			}

			public String getResourceGroup() {
				return this.resourceGroup;
			}

			public void setResourceGroup(String resourceGroup) {
				this.resourceGroup = resourceGroup;
			}

			public Float getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Float pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getServicePeriodUnit() {
				return this.servicePeriodUnit;
			}

			public void setServicePeriodUnit(String servicePeriodUnit) {
				this.servicePeriodUnit = servicePeriodUnit;
			}

			public String getSplitBillingDate() {
				return this.splitBillingDate;
			}

			public void setSplitBillingDate(String splitBillingDate) {
				this.splitBillingDate = splitBillingDate;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getSplitProductDetail() {
				return this.splitProductDetail;
			}

			public void setSplitProductDetail(String splitProductDetail) {
				this.splitProductDetail = splitProductDetail;
			}

			public Float getAdjustAmount() {
				return this.adjustAmount;
			}

			public void setAdjustAmount(Float adjustAmount) {
				this.adjustAmount = adjustAmount;
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

			public Float getInvoiceDiscount() {
				return this.invoiceDiscount;
			}

			public void setInvoiceDiscount(Float invoiceDiscount) {
				this.invoiceDiscount = invoiceDiscount;
			}

			public String getSplitAccountName() {
				return this.splitAccountName;
			}

			public void setSplitAccountName(String splitAccountName) {
				this.splitAccountName = splitAccountName;
			}

			public String getBillingType() {
				return this.billingType;
			}

			public void setBillingType(String billingType) {
				this.billingType = billingType;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}
		}
	}

	@Override
	public DescribeSplitItemBillResponse getInstance(UnmarshallerContext context) {
		return	DescribeSplitItemBillResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
