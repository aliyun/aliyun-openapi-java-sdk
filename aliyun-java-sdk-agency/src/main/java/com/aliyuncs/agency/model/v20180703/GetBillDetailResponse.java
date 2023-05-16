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

package com.aliyuncs.agency.model.v20180703;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.GetBillDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBillDetailResponse extends AcsResponse {

	private String code;

	private String message;

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

		private String offering;

		private String billId;

		private String payStatus;

		private String billStartTime;

		private String productCode;

		private String billEndTime;

		private String period;

		private List<RegionInfo> regionInfoList;

		public String getOffering() {
			return this.offering;
		}

		public void setOffering(String offering) {
			this.offering = offering;
		}

		public String getBillId() {
			return this.billId;
		}

		public void setBillId(String billId) {
			this.billId = billId;
		}

		public String getPayStatus() {
			return this.payStatus;
		}

		public void setPayStatus(String payStatus) {
			this.payStatus = payStatus;
		}

		public String getBillStartTime() {
			return this.billStartTime;
		}

		public void setBillStartTime(String billStartTime) {
			this.billStartTime = billStartTime;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getBillEndTime() {
			return this.billEndTime;
		}

		public void setBillEndTime(String billEndTime) {
			this.billEndTime = billEndTime;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public List<RegionInfo> getRegionInfoList() {
			return this.regionInfoList;
		}

		public void setRegionInfoList(List<RegionInfo> regionInfoList) {
			this.regionInfoList = regionInfoList;
		}

		public static class RegionInfo {

			private String totalFee;

			private String regionCode;

			private String youhuiquanPayAmount;

			private String discountFee;

			private String requirePayAmount;

			public String getTotalFee() {
				return this.totalFee;
			}

			public void setTotalFee(String totalFee) {
				this.totalFee = totalFee;
			}

			public String getRegionCode() {
				return this.regionCode;
			}

			public void setRegionCode(String regionCode) {
				this.regionCode = regionCode;
			}

			public String getYouhuiquanPayAmount() {
				return this.youhuiquanPayAmount;
			}

			public void setYouhuiquanPayAmount(String youhuiquanPayAmount) {
				this.youhuiquanPayAmount = youhuiquanPayAmount;
			}

			public String getDiscountFee() {
				return this.discountFee;
			}

			public void setDiscountFee(String discountFee) {
				this.discountFee = discountFee;
			}

			public String getRequirePayAmount() {
				return this.requirePayAmount;
			}

			public void setRequirePayAmount(String requirePayAmount) {
				this.requirePayAmount = requirePayAmount;
			}
		}
	}

	@Override
	public GetBillDetailResponse getInstance(UnmarshallerContext context) {
		return	GetBillDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
