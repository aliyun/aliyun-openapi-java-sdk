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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.GetServiceListPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceListPageResponse extends AcsResponse {

	private Boolean success;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Integer code;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String currentPage;

		private String totalSize;

		private String pageNumber;

		private String pageSize;

		private List<MscServiceResponse> result;

		public String getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(String currentPage) {
			this.currentPage = currentPage;
		}

		public String getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(String totalSize) {
			this.totalSize = totalSize;
		}

		public String getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(String pageNumber) {
			this.pageNumber = pageNumber;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public List<MscServiceResponse> getResult() {
			return this.result;
		}

		public void setResult(List<MscServiceResponse> result) {
			this.result = result;
		}

		public static class MscServiceResponse {

			private String edasAppName;

			private String appName;

			private String version;

			private Integer instanceNum;

			private String gmtModifyTime;

			private String edasAppId;

			private String appId;

			private String serviceName;

			private String group;

			private String clusterName;

			public String getEdasAppName() {
				return this.edasAppName;
			}

			public void setEdasAppName(String edasAppName) {
				this.edasAppName = edasAppName;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Integer getInstanceNum() {
				return this.instanceNum;
			}

			public void setInstanceNum(Integer instanceNum) {
				this.instanceNum = instanceNum;
			}

			public String getGmtModifyTime() {
				return this.gmtModifyTime;
			}

			public void setGmtModifyTime(String gmtModifyTime) {
				this.gmtModifyTime = gmtModifyTime;
			}

			public String getEdasAppId() {
				return this.edasAppId;
			}

			public void setEdasAppId(String edasAppId) {
				this.edasAppId = edasAppId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getGroup() {
				return this.group;
			}

			public void setGroup(String group) {
				this.group = group;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}
		}
	}

	@Override
	public GetServiceListPageResponse getInstance(UnmarshallerContext context) {
		return	GetServiceListPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
