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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.QueryContentInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryContentInfoResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String errorMessage;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private Long brandUserId;

		private Long proxyUserId;

		private Integer status;

		private String templateType;

		private String chainValue;

		private Integer openScene;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getBrandUserId() {
			return this.brandUserId;
		}

		public void setBrandUserId(Long brandUserId) {
			this.brandUserId = brandUserId;
		}

		public Long getProxyUserId() {
			return this.proxyUserId;
		}

		public void setProxyUserId(Long proxyUserId) {
			this.proxyUserId = proxyUserId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getChainValue() {
			return this.chainValue;
		}

		public void setChainValue(String chainValue) {
			this.chainValue = chainValue;
		}

		public Integer getOpenScene() {
			return this.openScene;
		}

		public void setOpenScene(Integer openScene) {
			this.openScene = openScene;
		}
	}

	@Override
	public QueryContentInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryContentInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
