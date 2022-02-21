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
import com.aliyuncs.mse.transform.v20190531.DeleteGatewayDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteGatewayDomainResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private String gatewayUniqueId;

		private Long gatewayId;

		private String protocol;

		private Boolean mustHttps;

		private Integer certIdentifier;

		private String gmtCreate;

		private String gmtModified;

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

		public String getGatewayUniqueId() {
			return this.gatewayUniqueId;
		}

		public void setGatewayUniqueId(String gatewayUniqueId) {
			this.gatewayUniqueId = gatewayUniqueId;
		}

		public Long getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(Long gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Boolean getMustHttps() {
			return this.mustHttps;
		}

		public void setMustHttps(Boolean mustHttps) {
			this.mustHttps = mustHttps;
		}

		public Integer getCertIdentifier() {
			return this.certIdentifier;
		}

		public void setCertIdentifier(Integer certIdentifier) {
			this.certIdentifier = certIdentifier;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DeleteGatewayDomainResponse getInstance(UnmarshallerContext context) {
		return	DeleteGatewayDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
