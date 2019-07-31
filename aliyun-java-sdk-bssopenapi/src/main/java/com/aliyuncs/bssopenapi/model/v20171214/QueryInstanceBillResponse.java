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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryInstanceBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceBillResponse extends AcsResponse {

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

		private String billingCycle;

		private String accountID;

		private String accountName;

		private Integer totalCount;

		private Integer pageNum;

		private Integer pageSize;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

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

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String instanceID;

			private String billingType;

			private String costUnit;

			private String productCode;

			private String productType;

			private String subscriptionType;

			private String productName;

			private String productDetail;

			private Long ownerID;

			private String billingItem;

			private Float listPrice;

			private String listPriceUnit;

			private Float usage;

			private String usageUnit;

			private Float deductedByResourcePackage;

			private Float pretaxGrossAmount;

			private Float invoiceDiscount;

			private Float deductedByCoupons;

			private Float pretaxAmount;

			private Float deductedByCashCoupons;

			private Float deductedByPrepaidCard;

			private Float paymentAmount;

			private Float outstandingAmount;

			private String currency;

			private String nickName;

			private String resourceGroup;

			private String tag;

			private String instanceConfig;

			private String instanceSpec;

			private String internetIP;

			private String intranetIP;

			private String region;

			private String zone;

			private String item;

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getBillingType() {
				return this.billingType;
			}

			public void setBillingType(String billingType) {
				this.billingType = billingType;
			}

			public String getCostUnit() {
				return this.costUnit;
			}

			public void setCostUnit(String costUnit) {
				this.costUnit = costUnit;
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

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getProductDetail() {
				return this.productDetail;
			}

			public void setProductDetail(String productDetail) {
				this.productDetail = productDetail;
			}

			public Long getOwnerID() {
				return this.ownerID;
			}

			public void setOwnerID(Long ownerID) {
				this.ownerID = ownerID;
			}

			public String getBillingItem() {
				return this.billingItem;
			}

			public void setBillingItem(String billingItem) {
				this.billingItem = billingItem;
			}

			public Float getListPrice() {
				return this.listPrice;
			}

			public void setListPrice(Float listPrice) {
				this.listPrice = listPrice;
			}

			public String getListPriceUnit() {
				return this.listPriceUnit;
			}

			public void setListPriceUnit(String listPriceUnit) {
				this.listPriceUnit = listPriceUnit;
			}

			public Float getUsage() {
				return this.usage;
			}

			public void setUsage(Float usage) {
				this.usage = usage;
			}

			public String getUsageUnit() {
				return this.usageUnit;
			}

			public void setUsageUnit(String usageUnit) {
				this.usageUnit = usageUnit;
			}

			public Float getDeductedByResourcePackage() {
				return this.deductedByResourcePackage;
			}

			public void setDeductedByResourcePackage(Float deductedByResourcePackage) {
				this.deductedByResourcePackage = deductedByResourcePackage;
			}

			public Float getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(Float pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public Float getInvoiceDiscount() {
				return this.invoiceDiscount;
			}

			public void setInvoiceDiscount(Float invoiceDiscount) {
				this.invoiceDiscount = invoiceDiscount;
			}

			public Float getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(Float deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
			}

			public Float getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Float pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
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

			public Float getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(Float paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public Float getOutstandingAmount() {
				return this.outstandingAmount;
			}

			public void setOutstandingAmount(Float outstandingAmount) {
				this.outstandingAmount = outstandingAmount;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getResourceGroup() {
				return this.resourceGroup;
			}

			public void setResourceGroup(String resourceGroup) {
				this.resourceGroup = resourceGroup;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getInstanceConfig() {
				return this.instanceConfig;
			}

			public void setInstanceConfig(String instanceConfig) {
				this.instanceConfig = instanceConfig;
			}

			public String getInstanceSpec() {
				return this.instanceSpec;
			}

			public void setInstanceSpec(String instanceSpec) {
				this.instanceSpec = instanceSpec;
			}

			public String getInternetIP() {
				return this.internetIP;
			}

			public void setInternetIP(String internetIP) {
				this.internetIP = internetIP;
			}

			public String getIntranetIP() {
				return this.intranetIP;
			}

			public void setIntranetIP(String intranetIP) {
				this.intranetIP = intranetIP;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getZone() {
				return this.zone;
			}

			public void setZone(String zone) {
				this.zone = zone;
			}

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}
		}
	}

	@Override
	public QueryInstanceBillResponse getInstance(UnmarshallerContext context) {
		return	QueryInstanceBillResponseUnmarshaller.unmarshall(this, context);
	}
}
