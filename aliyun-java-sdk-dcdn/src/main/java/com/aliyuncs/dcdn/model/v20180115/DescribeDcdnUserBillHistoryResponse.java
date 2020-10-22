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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnUserBillHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnUserBillHistoryResponse extends AcsResponse {

	private String requestId;

	private List<BillHistoryDataItem> billHistoryData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BillHistoryDataItem> getBillHistoryData() {
		return this.billHistoryData;
	}

	public void setBillHistoryData(List<BillHistoryDataItem> billHistoryData) {
		this.billHistoryData = billHistoryData;
	}

	public static class BillHistoryDataItem {

		private String dimension;

		private String billType;

		private String billTime;

		private List<BillingDataItem> billingData;

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public String getBillType() {
			return this.billType;
		}

		public void setBillType(String billType) {
			this.billType = billType;
		}

		public String getBillTime() {
			return this.billTime;
		}

		public void setBillTime(String billTime) {
			this.billTime = billTime;
		}

		public List<BillingDataItem> getBillingData() {
			return this.billingData;
		}

		public void setBillingData(List<BillingDataItem> billingData) {
			this.billingData = billingData;
		}

		public static class BillingDataItem {

			private String chargeType;

			private String cdnRegion;

			private Float bandwidth;

			private Float flow;

			private Float count;

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getCdnRegion() {
				return this.cdnRegion;
			}

			public void setCdnRegion(String cdnRegion) {
				this.cdnRegion = cdnRegion;
			}

			public Float getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Float bandwidth) {
				this.bandwidth = bandwidth;
			}

			public Float getFlow() {
				return this.flow;
			}

			public void setFlow(Float flow) {
				this.flow = flow;
			}

			public Float getCount() {
				return this.count;
			}

			public void setCount(Float count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeDcdnUserBillHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnUserBillHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
