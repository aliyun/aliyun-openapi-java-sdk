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

package com.aliyuncs.savingplan.model.v20200715;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.savingplan.transform.v20200715.QuerySavingPlanInstanceInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySavingPlanInstanceInnerResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String data;

	private Boolean success;

	private Code code;

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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Code getCode() {
		return this.code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public static class Code {

		private Integer totalCount;

		private Integer pageSize;

		private Integer currentPage;

		private List<SpnInstanceDetailDTO> datas;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public List<SpnInstanceDetailDTO> getDatas() {
			return this.datas;
		}

		public void setDatas(List<SpnInstanceDetailDTO> datas) {
			this.datas = datas;
		}

		public static class SpnInstanceDetailDTO {

			private Long spnInstanceId;

			private String spnInstanceCode;

			private String payMode;

			private String spnType;

			private String instanceFamily;

			private String region;

			private String cycle;

			private Long startTime;

			private Long endTime;

			private Float poolValue;

			private Long userId;

			private String site;

			private String currency;

			private String commodityCode;

			private String status;

			public Long getSpnInstanceId() {
				return this.spnInstanceId;
			}

			public void setSpnInstanceId(Long spnInstanceId) {
				this.spnInstanceId = spnInstanceId;
			}

			public String getSpnInstanceCode() {
				return this.spnInstanceCode;
			}

			public void setSpnInstanceCode(String spnInstanceCode) {
				this.spnInstanceCode = spnInstanceCode;
			}

			public String getPayMode() {
				return this.payMode;
			}

			public void setPayMode(String payMode) {
				this.payMode = payMode;
			}

			public String getSpnType() {
				return this.spnType;
			}

			public void setSpnType(String spnType) {
				this.spnType = spnType;
			}

			public String getInstanceFamily() {
				return this.instanceFamily;
			}

			public void setInstanceFamily(String instanceFamily) {
				this.instanceFamily = instanceFamily;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getCycle() {
				return this.cycle;
			}

			public void setCycle(String cycle) {
				this.cycle = cycle;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Float getPoolValue() {
				return this.poolValue;
			}

			public void setPoolValue(Float poolValue) {
				this.poolValue = poolValue;
			}

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getSite() {
				return this.site;
			}

			public void setSite(String site) {
				this.site = site;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public QuerySavingPlanInstanceInnerResponse getInstance(UnmarshallerContext context) {
		return	QuerySavingPlanInstanceInnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
