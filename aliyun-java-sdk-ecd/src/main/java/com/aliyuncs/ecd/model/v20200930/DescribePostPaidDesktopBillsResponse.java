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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribePostPaidDesktopBillsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePostPaidDesktopBillsResponse extends AcsResponse {

	private String requestId;

	private Integer postPaidDesktopsCount;

	private Float postPaidDesktopsTotalAmount;

	private String postPaidDesktopsBillsUrl;

	private String nextToken;

	private List<Bill> bills;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPostPaidDesktopsCount() {
		return this.postPaidDesktopsCount;
	}

	public void setPostPaidDesktopsCount(Integer postPaidDesktopsCount) {
		this.postPaidDesktopsCount = postPaidDesktopsCount;
	}

	public Float getPostPaidDesktopsTotalAmount() {
		return this.postPaidDesktopsTotalAmount;
	}

	public void setPostPaidDesktopsTotalAmount(Float postPaidDesktopsTotalAmount) {
		this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
	}

	public String getPostPaidDesktopsBillsUrl() {
		return this.postPaidDesktopsBillsUrl;
	}

	public void setPostPaidDesktopsBillsUrl(String postPaidDesktopsBillsUrl) {
		this.postPaidDesktopsBillsUrl = postPaidDesktopsBillsUrl;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public static class Bill {

		private String billId;

		private String billStartTime;

		private String billEndTime;

		private String billType;

		private String product;

		private String productDetail;

		private String consumeTime;

		private String consumeType;

		private String resourceGroupId;

		private String resourceGroupName;

		private String instanceId;

		private String chargeItem;

		private String price;

		private String priceUnit;

		private String usage;

		private String usageUnit;

		private String originalPrice;

		private String discountPrice;

		private String payment;

		private String cashPayment;

		private String goldNote;

		public String getBillId() {
			return this.billId;
		}

		public void setBillId(String billId) {
			this.billId = billId;
		}

		public String getBillStartTime() {
			return this.billStartTime;
		}

		public void setBillStartTime(String billStartTime) {
			this.billStartTime = billStartTime;
		}

		public String getBillEndTime() {
			return this.billEndTime;
		}

		public void setBillEndTime(String billEndTime) {
			this.billEndTime = billEndTime;
		}

		public String getBillType() {
			return this.billType;
		}

		public void setBillType(String billType) {
			this.billType = billType;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getProductDetail() {
			return this.productDetail;
		}

		public void setProductDetail(String productDetail) {
			this.productDetail = productDetail;
		}

		public String getConsumeTime() {
			return this.consumeTime;
		}

		public void setConsumeTime(String consumeTime) {
			this.consumeTime = consumeTime;
		}

		public String getConsumeType() {
			return this.consumeType;
		}

		public void setConsumeType(String consumeType) {
			this.consumeType = consumeType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getChargeItem() {
			return this.chargeItem;
		}

		public void setChargeItem(String chargeItem) {
			this.chargeItem = chargeItem;
		}

		public String getPrice() {
			return this.price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public String getUsageUnit() {
			return this.usageUnit;
		}

		public void setUsageUnit(String usageUnit) {
			this.usageUnit = usageUnit;
		}

		public String getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(String originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getPayment() {
			return this.payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public String getCashPayment() {
			return this.cashPayment;
		}

		public void setCashPayment(String cashPayment) {
			this.cashPayment = cashPayment;
		}

		public String getGoldNote() {
			return this.goldNote;
		}

		public void setGoldNote(String goldNote) {
			this.goldNote = goldNote;
		}
	}

	@Override
	public DescribePostPaidDesktopBillsResponse getInstance(UnmarshallerContext context) {
		return	DescribePostPaidDesktopBillsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
