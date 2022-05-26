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

package com.aliyuncs.account_crm.model.v20160606;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryBindsByPkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBindsByPkResponse extends AcsResponse {

	private String code;

	private String message;

	private String httpCode;

	private String requestId;

	private Boolean success;

	private List<BindDto> data;

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

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

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

	public List<BindDto> getData() {
		return this.data;
	}

	public void setData(List<BindDto> data) {
		this.data = data;
	}

	public static class BindDto {

		private String status;

		private String minorOuterId;

		private String outerId;

		private String pk;

		private Map<Object,Object> bindData;

		private String tenantId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMinorOuterId() {
			return this.minorOuterId;
		}

		public void setMinorOuterId(String minorOuterId) {
			this.minorOuterId = minorOuterId;
		}

		public String getOuterId() {
			return this.outerId;
		}

		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public Map<Object,Object> getBindData() {
			return this.bindData;
		}

		public void setBindData(Map<Object,Object> bindData) {
			this.bindData = bindData;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	@Override
	public QueryBindsByPkResponse getInstance(UnmarshallerContext context) {
		return	QueryBindsByPkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
