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
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetConsumedAmountMonthlyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConsumedAmountMonthlyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Consumptions consumptions;

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

	public Consumptions getConsumptions() {
		return this.consumptions;
	}

	public void setConsumptions(Consumptions consumptions) {
		this.consumptions = consumptions;
	}

	public static class Consumptions {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Consumption> list;

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

		public List<Consumption> getList() {
			return this.list;
		}

		public void setList(List<Consumption> list) {
			this.list = list;
		}

		public static class Consumption {

			private Integer incomingAmount;

			private Integer incomingCount;

			private Integer outcomingAmount;

			private Integer outcomingCount;

			private Integer year;

			private Integer month;

			public Integer getIncomingAmount() {
				return this.incomingAmount;
			}

			public void setIncomingAmount(Integer incomingAmount) {
				this.incomingAmount = incomingAmount;
			}

			public Integer getIncomingCount() {
				return this.incomingCount;
			}

			public void setIncomingCount(Integer incomingCount) {
				this.incomingCount = incomingCount;
			}

			public Integer getOutcomingAmount() {
				return this.outcomingAmount;
			}

			public void setOutcomingAmount(Integer outcomingAmount) {
				this.outcomingAmount = outcomingAmount;
			}

			public Integer getOutcomingCount() {
				return this.outcomingCount;
			}

			public void setOutcomingCount(Integer outcomingCount) {
				this.outcomingCount = outcomingCount;
			}

			public Integer getYear() {
				return this.year;
			}

			public void setYear(Integer year) {
				this.year = year;
			}

			public Integer getMonth() {
				return this.month;
			}

			public void setMonth(Integer month) {
				this.month = month;
			}
		}
	}

	@Override
	public GetConsumedAmountMonthlyResponse getInstance(UnmarshallerContext context) {
		return	GetConsumedAmountMonthlyResponseUnmarshaller.unmarshall(this, context);
	}
}
