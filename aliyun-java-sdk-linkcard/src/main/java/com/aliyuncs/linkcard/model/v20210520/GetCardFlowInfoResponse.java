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

package com.aliyuncs.linkcard.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkcard.transform.v20210520.GetCardFlowInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCardFlowInfoResponse extends AcsResponse {

	private String code;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String localizedMessage;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getLocalizedMessage() {
		return this.localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<VendorDetail> listVendorDetail;

		private List<CardMonthFlow> listCardMonthFlow;

		private List<PackageDTO> listPackageDTO;

		public List<VendorDetail> getListVendorDetail() {
			return this.listVendorDetail;
		}

		public void setListVendorDetail(List<VendorDetail> listVendorDetail) {
			this.listVendorDetail = listVendorDetail;
		}

		public List<CardMonthFlow> getListCardMonthFlow() {
			return this.listCardMonthFlow;
		}

		public void setListCardMonthFlow(List<CardMonthFlow> listCardMonthFlow) {
			this.listCardMonthFlow = listCardMonthFlow;
		}

		public List<PackageDTO> getListPackageDTO() {
			return this.listPackageDTO;
		}

		public void setListPackageDTO(List<PackageDTO> listPackageDTO) {
			this.listPackageDTO = listPackageDTO;
		}

		public static class VendorDetail {

			private String netWorkDelay;

			private String signalStrength;

			private String vendor;

			private String usedFlow;

			private String ratio;

			public String getNetWorkDelay() {
				return this.netWorkDelay;
			}

			public void setNetWorkDelay(String netWorkDelay) {
				this.netWorkDelay = netWorkDelay;
			}

			public String getSignalStrength() {
				return this.signalStrength;
			}

			public void setSignalStrength(String signalStrength) {
				this.signalStrength = signalStrength;
			}

			public String getVendor() {
				return this.vendor;
			}

			public void setVendor(String vendor) {
				this.vendor = vendor;
			}

			public String getUsedFlow() {
				return this.usedFlow;
			}

			public void setUsedFlow(String usedFlow) {
				this.usedFlow = usedFlow;
			}

			public String getRatio() {
				return this.ratio;
			}

			public void setRatio(String ratio) {
				this.ratio = ratio;
			}
		}

		public static class CardMonthFlow {

			private String flowCount;

			private String month;

			private List<DayFlowDto> listDayFlow;

			public String getFlowCount() {
				return this.flowCount;
			}

			public void setFlowCount(String flowCount) {
				this.flowCount = flowCount;
			}

			public String getMonth() {
				return this.month;
			}

			public void setMonth(String month) {
				this.month = month;
			}

			public List<DayFlowDto> getListDayFlow() {
				return this.listDayFlow;
			}

			public void setListDayFlow(List<DayFlowDto> listDayFlow) {
				this.listDayFlow = listDayFlow;
			}

			public static class DayFlowDto {

				private String flow;

				private String day;

				public String getFlow() {
					return this.flow;
				}

				public void setFlow(String flow) {
					this.flow = flow;
				}

				public String getDay() {
					return this.day;
				}

				public void setDay(String day) {
					this.day = day;
				}
			}
		}

		public static class PackageDTO {

			private String effectiveTime;

			private String remark;

			private String packageName;

			private String expireTime;

			public String getEffectiveTime() {
				return this.effectiveTime;
			}

			public void setEffectiveTime(String effectiveTime) {
				this.effectiveTime = effectiveTime;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getPackageName() {
				return this.packageName;
			}

			public void setPackageName(String packageName) {
				this.packageName = packageName;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}
		}
	}

	@Override
	public GetCardFlowInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCardFlowInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
