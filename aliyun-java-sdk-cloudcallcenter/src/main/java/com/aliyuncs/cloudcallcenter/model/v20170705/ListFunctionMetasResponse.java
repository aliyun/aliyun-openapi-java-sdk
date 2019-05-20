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
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListFunctionMetasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionMetasResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<FunctionMeta> functionMetas;

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

	public List<FunctionMeta> getFunctionMetas() {
		return this.functionMetas;
	}

	public void setFunctionMetas(List<FunctionMeta> functionMetas) {
		this.functionMetas = functionMetas;
	}

	public static class FunctionMeta {

		private String functionId;

		private String instance;

		private String alipkUserId;

		private String region;

		private String service;

		private String functionName;

		private String role;

		private String description;

		public String getFunctionId() {
			return this.functionId;
		}

		public void setFunctionId(String functionId) {
			this.functionId = functionId;
		}

		public String getInstance() {
			return this.instance;
		}

		public void setInstance(String instance) {
			this.instance = instance;
		}

		public String getAlipkUserId() {
			return this.alipkUserId;
		}

		public void setAlipkUserId(String alipkUserId) {
			this.alipkUserId = alipkUserId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListFunctionMetasResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionMetasResponseUnmarshaller.unmarshall(this, context);
	}
}
