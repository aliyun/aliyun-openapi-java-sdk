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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.UpdateEngineNamespaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateEngineNamespaceResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String errorCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private String namespace;

		private String namespaceShowName;

		private String namespaceDesc;

		private Integer quota;

		private Integer configCount;

		private Integer type;

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getNamespaceShowName() {
			return this.namespaceShowName;
		}

		public void setNamespaceShowName(String namespaceShowName) {
			this.namespaceShowName = namespaceShowName;
		}

		public String getNamespaceDesc() {
			return this.namespaceDesc;
		}

		public void setNamespaceDesc(String namespaceDesc) {
			this.namespaceDesc = namespaceDesc;
		}

		public Integer getQuota() {
			return this.quota;
		}

		public void setQuota(Integer quota) {
			this.quota = quota;
		}

		public Integer getConfigCount() {
			return this.configCount;
		}

		public void setConfigCount(Integer configCount) {
			this.configCount = configCount;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}
	}

	@Override
	public UpdateEngineNamespaceResponse getInstance(UnmarshallerContext context) {
		return	UpdateEngineNamespaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
