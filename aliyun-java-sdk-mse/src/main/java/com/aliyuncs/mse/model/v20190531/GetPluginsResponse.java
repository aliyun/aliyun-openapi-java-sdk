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
import com.aliyuncs.mse.transform.v20190531.GetPluginsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPluginsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String errorCode;

	private Integer httpStatusCode;

	private String message;

	private String dynamicCode;

	private String dynamicMessage;

	private List<DataItem> data;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private String primaryUser;

		private Integer category;

		private String name;

		private String version;

		private String summary;

		private Integer phase;

		private Integer priority;

		private String configCheck;

		private Integer wasmLang;

		private Integer publishState;

		private String wasmFile;

		private String status;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPrimaryUser() {
			return this.primaryUser;
		}

		public void setPrimaryUser(String primaryUser) {
			this.primaryUser = primaryUser;
		}

		public Integer getCategory() {
			return this.category;
		}

		public void setCategory(Integer category) {
			this.category = category;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public Integer getPhase() {
			return this.phase;
		}

		public void setPhase(Integer phase) {
			this.phase = phase;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getConfigCheck() {
			return this.configCheck;
		}

		public void setConfigCheck(String configCheck) {
			this.configCheck = configCheck;
		}

		public Integer getWasmLang() {
			return this.wasmLang;
		}

		public void setWasmLang(Integer wasmLang) {
			this.wasmLang = wasmLang;
		}

		public Integer getPublishState() {
			return this.publishState;
		}

		public void setPublishState(Integer publishState) {
			this.publishState = publishState;
		}

		public String getWasmFile() {
			return this.wasmFile;
		}

		public void setWasmFile(String wasmFile) {
			this.wasmFile = wasmFile;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetPluginsResponse getInstance(UnmarshallerContext context) {
		return	GetPluginsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
