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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.FindServiceStatisticalDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindServiceStatisticalDataResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageNumber;

		private List<ServiceStatisticData> monitorStatisticData;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<ServiceStatisticData> getMonitorStatisticData() {
			return this.monitorStatisticData;
		}

		public void setMonitorStatisticData(List<ServiceStatisticData> monitorStatisticData) {
			this.monitorStatisticData = monitorStatisticData;
		}

		public static class ServiceStatisticData {

			private Float avgRt;

			private Float maxRt;

			private Float minRt;

			private Long requestTime;

			private String serviceName;

			private String userId;

			private Total total;

			public Float getAvgRt() {
				return this.avgRt;
			}

			public void setAvgRt(Float avgRt) {
				this.avgRt = avgRt;
			}

			public Float getMaxRt() {
				return this.maxRt;
			}

			public void setMaxRt(Float maxRt) {
				this.maxRt = maxRt;
			}

			public Float getMinRt() {
				return this.minRt;
			}

			public void setMinRt(Float minRt) {
				this.minRt = minRt;
			}

			public Long getRequestTime() {
				return this.requestTime;
			}

			public void setRequestTime(Long requestTime) {
				this.requestTime = requestTime;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Total getTotal() {
				return this.total;
			}

			public void setTotal(Total total) {
				this.total = total;
			}

			public static class Total {

				private Integer errorNum;

				private Integer total;

				public Integer getErrorNum() {
					return this.errorNum;
				}

				public void setErrorNum(Integer errorNum) {
					this.errorNum = errorNum;
				}

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}
			}
		}
	}

	@Override
	public FindServiceStatisticalDataResponse getInstance(UnmarshallerContext context) {
		return	FindServiceStatisticalDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
