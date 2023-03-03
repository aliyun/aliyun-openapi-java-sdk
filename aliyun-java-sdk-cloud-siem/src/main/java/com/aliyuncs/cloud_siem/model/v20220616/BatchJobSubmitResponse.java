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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.BatchJobSubmitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchJobSubmitResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String errCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
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

		private String submitId;

		private Integer taskCount;

		private String configId;

		private List<ConfigListItem> configList;

		public String getSubmitId() {
			return this.submitId;
		}

		public void setSubmitId(String submitId) {
			this.submitId = submitId;
		}

		public Integer getTaskCount() {
			return this.taskCount;
		}

		public void setTaskCount(Integer taskCount) {
			this.taskCount = taskCount;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public List<ConfigListItem> getConfigList() {
			return this.configList;
		}

		public void setConfigList(List<ConfigListItem> configList) {
			this.configList = configList;
		}

		public static class ConfigListItem {

			private Long userId;

			private List<ProductListItem> productList;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public List<ProductListItem> getProductList() {
				return this.productList;
			}

			public void setProductList(List<ProductListItem> productList) {
				this.productList = productList;
			}

			public static class ProductListItem {

				private String productCode;

				private List<LogListItem> logList;

				public String getProductCode() {
					return this.productCode;
				}

				public void setProductCode(String productCode) {
					this.productCode = productCode;
				}

				public List<LogListItem> getLogList() {
					return this.logList;
				}

				public void setLogList(List<LogListItem> logList) {
					this.logList = logList;
				}

				public static class LogListItem {

					private String productCode;

					private String logCode;

					private String regionCode;

					private String projectNamePattern;

					private String logStoreNamePattern;

					private String errorCode;

					public String getProductCode() {
						return this.productCode;
					}

					public void setProductCode(String productCode) {
						this.productCode = productCode;
					}

					public String getLogCode() {
						return this.logCode;
					}

					public void setLogCode(String logCode) {
						this.logCode = logCode;
					}

					public String getRegionCode() {
						return this.regionCode;
					}

					public void setRegionCode(String regionCode) {
						this.regionCode = regionCode;
					}

					public String getProjectNamePattern() {
						return this.projectNamePattern;
					}

					public void setProjectNamePattern(String projectNamePattern) {
						this.projectNamePattern = projectNamePattern;
					}

					public String getLogStoreNamePattern() {
						return this.logStoreNamePattern;
					}

					public void setLogStoreNamePattern(String logStoreNamePattern) {
						this.logStoreNamePattern = logStoreNamePattern;
					}

					public String getErrorCode() {
						return this.errorCode;
					}

					public void setErrorCode(String errorCode) {
						this.errorCode = errorCode;
					}
				}
			}
		}
	}

	@Override
	public BatchJobSubmitResponse getInstance(UnmarshallerContext context) {
		return	BatchJobSubmitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
