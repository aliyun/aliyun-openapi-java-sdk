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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.FindCredentialStatisticalDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindCredentialStatisticalDataResponse extends AcsResponse {

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

		private Long total;

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

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
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

			private Total total;

			private CredentialInfoData credentialInfoData;

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

			public Total getTotal() {
				return this.total;
			}

			public void setTotal(Total total) {
				this.total = total;
			}

			public CredentialInfoData getCredentialInfoData() {
				return this.credentialInfoData;
			}

			public void setCredentialInfoData(CredentialInfoData credentialInfoData) {
				this.credentialInfoData = credentialInfoData;
			}

			public static class Total {

				private Long total;

				private Long errorNum;

				public Long getTotal() {
					return this.total;
				}

				public void setTotal(Long total) {
					this.total = total;
				}

				public Long getErrorNum() {
					return this.errorNum;
				}

				public void setErrorNum(Long errorNum) {
					this.errorNum = errorNum;
				}
			}

			public static class CredentialInfoData {

				private String currentAk;

				private String credentialName;

				public String getCurrentAk() {
					return this.currentAk;
				}

				public void setCurrentAk(String currentAk) {
					this.currentAk = currentAk;
				}

				public String getCredentialName() {
					return this.credentialName;
				}

				public void setCredentialName(String credentialName) {
					this.credentialName = credentialName;
				}
			}
		}
	}

	@Override
	public FindCredentialStatisticalDataResponse getInstance(UnmarshallerContext context) {
		return	FindCredentialStatisticalDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
