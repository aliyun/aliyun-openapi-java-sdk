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
import com.aliyuncs.cloudcallcenter.transform.v20170705.UpdateTenantResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateTenantResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<UpdateTenantResult> updateTenantResultList;

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

	public List<UpdateTenantResult> getUpdateTenantResultList() {
		return this.updateTenantResultList;
	}

	public void setUpdateTenantResultList(List<UpdateTenantResult> updateTenantResultList) {
		this.updateTenantResultList = updateTenantResultList;
	}

	public static class UpdateTenantResult {

		private String tenantName;

		private String tenantId;

		private Integer tenantStatus;

		private Integer result;

		private String resultMsg;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Integer getTenantStatus() {
			return this.tenantStatus;
		}

		public void setTenantStatus(Integer tenantStatus) {
			this.tenantStatus = tenantStatus;
		}

		public Integer getResult() {
			return this.result;
		}

		public void setResult(Integer result) {
			this.result = result;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}
	}

	@Override
	public UpdateTenantResponse getInstance(UnmarshallerContext context) {
		return	UpdateTenantResponseUnmarshaller.unmarshall(this, context);
	}
}
