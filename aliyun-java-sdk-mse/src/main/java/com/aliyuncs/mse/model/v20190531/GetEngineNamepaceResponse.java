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
import com.aliyuncs.mse.transform.v20190531.GetEngineNamepaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEngineNamepaceResponse extends AcsResponse {

	private String httpCode;

	private String type;

	private String quota;

	private String requestId;

	private String message;

	private String configCount;

	private String namespaceShowName;

	private String errorCode;

	private Boolean success;

	private String namespaceDesc;

	private String namespace;

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuota() {
		return this.quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

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

	public String getConfigCount() {
		return this.configCount;
	}

	public void setConfigCount(String configCount) {
		this.configCount = configCount;
	}

	public String getNamespaceShowName() {
		return this.namespaceShowName;
	}

	public void setNamespaceShowName(String namespaceShowName) {
		this.namespaceShowName = namespaceShowName;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getNamespaceDesc() {
		return this.namespaceDesc;
	}

	public void setNamespaceDesc(String namespaceDesc) {
		this.namespaceDesc = namespaceDesc;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public GetEngineNamepaceResponse getInstance(UnmarshallerContext context) {
		return	GetEngineNamepaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
