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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.Get400OrderNumberListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class Get400OrderNumberListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<GetOrderNumberOf400Domain> orders;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<GetOrderNumberOf400Domain> getOrders() {
			return this.orders;
		}

		public void setOrders(List<GetOrderNumberOf400Domain> orders) {
			this.orders = orders;
		}

		public static class GetOrderNumberOf400Domain {

			private String orderId;

			private String managerName;

			private String managerMobilePhone;

			private String number;

			private Long orderTime;

			private String regionNameProvince;

			private String regionNameCity;

			private String corpName;

			private String monthlyPrice;

			private Long realNameInsId;

			private Integer status;

			private String billId;

			private Boolean canCancel;

			private String forbidCancelDesc;

			private String specName;

			private String destroyTime;

			private String wttorderId;

			private String commodityInstanceId;

			private Long numberCommodityStatus;

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getManagerName() {
				return this.managerName;
			}

			public void setManagerName(String managerName) {
				this.managerName = managerName;
			}

			public String getManagerMobilePhone() {
				return this.managerMobilePhone;
			}

			public void setManagerMobilePhone(String managerMobilePhone) {
				this.managerMobilePhone = managerMobilePhone;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public Long getOrderTime() {
				return this.orderTime;
			}

			public void setOrderTime(Long orderTime) {
				this.orderTime = orderTime;
			}

			public String getRegionNameProvince() {
				return this.regionNameProvince;
			}

			public void setRegionNameProvince(String regionNameProvince) {
				this.regionNameProvince = regionNameProvince;
			}

			public String getRegionNameCity() {
				return this.regionNameCity;
			}

			public void setRegionNameCity(String regionNameCity) {
				this.regionNameCity = regionNameCity;
			}

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public String getMonthlyPrice() {
				return this.monthlyPrice;
			}

			public void setMonthlyPrice(String monthlyPrice) {
				this.monthlyPrice = monthlyPrice;
			}

			public Long getRealNameInsId() {
				return this.realNameInsId;
			}

			public void setRealNameInsId(Long realNameInsId) {
				this.realNameInsId = realNameInsId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getBillId() {
				return this.billId;
			}

			public void setBillId(String billId) {
				this.billId = billId;
			}

			public Boolean getCanCancel() {
				return this.canCancel;
			}

			public void setCanCancel(Boolean canCancel) {
				this.canCancel = canCancel;
			}

			public String getForbidCancelDesc() {
				return this.forbidCancelDesc;
			}

			public void setForbidCancelDesc(String forbidCancelDesc) {
				this.forbidCancelDesc = forbidCancelDesc;
			}

			public String getSpecName() {
				return this.specName;
			}

			public void setSpecName(String specName) {
				this.specName = specName;
			}

			public String getDestroyTime() {
				return this.destroyTime;
			}

			public void setDestroyTime(String destroyTime) {
				this.destroyTime = destroyTime;
			}

			public String getWttorderId() {
				return this.wttorderId;
			}

			public void setWttorderId(String wttorderId) {
				this.wttorderId = wttorderId;
			}

			public String getCommodityInstanceId() {
				return this.commodityInstanceId;
			}

			public void setCommodityInstanceId(String commodityInstanceId) {
				this.commodityInstanceId = commodityInstanceId;
			}

			public Long getNumberCommodityStatus() {
				return this.numberCommodityStatus;
			}

			public void setNumberCommodityStatus(Long numberCommodityStatus) {
				this.numberCommodityStatus = numberCommodityStatus;
			}
		}
	}

	@Override
	public Get400OrderNumberListResponse getInstance(UnmarshallerContext context) {
		return	Get400OrderNumberListResponseUnmarshaller.unmarshall(this, context);
	}
}
