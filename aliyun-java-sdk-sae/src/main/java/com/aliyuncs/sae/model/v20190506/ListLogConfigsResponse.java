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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListLogConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLogConfigsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer currentPage;

		private Integer totalSize;

		private Integer pageSize;

		private List<LogConfig> logConfigs;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<LogConfig> getLogConfigs() {
			return this.logConfigs;
		}

		public void setLogConfigs(List<LogConfig> logConfigs) {
			this.logConfigs = logConfigs;
		}

		public static class LogConfig {

			private String configName;

			private String logDir;

			private String slsLogStore;

			private String createTime;

			private String storeType;

			private String slsProject;

			private String logType;

			private String regionId;

			public String getConfigName() {
				return this.configName;
			}

			public void setConfigName(String configName) {
				this.configName = configName;
			}

			public String getLogDir() {
				return this.logDir;
			}

			public void setLogDir(String logDir) {
				this.logDir = logDir;
			}

			public String getSlsLogStore() {
				return this.slsLogStore;
			}

			public void setSlsLogStore(String slsLogStore) {
				this.slsLogStore = slsLogStore;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getStoreType() {
				return this.storeType;
			}

			public void setStoreType(String storeType) {
				this.storeType = storeType;
			}

			public String getSlsProject() {
				return this.slsProject;
			}

			public void setSlsProject(String slsProject) {
				this.slsProject = slsProject;
			}

			public String getLogType() {
				return this.logType;
			}

			public void setLogType(String logType) {
				this.logType = logType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public ListLogConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListLogConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
