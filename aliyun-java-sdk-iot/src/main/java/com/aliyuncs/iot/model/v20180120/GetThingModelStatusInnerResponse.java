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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetThingModelStatusInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetThingModelStatusInnerResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private String localizedMsg;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLocalizedMsg() {
		return this.localizedMsg;
	}

	public void setLocalizedMsg(String localizedMsg) {
		this.localizedMsg = localizedMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long modifiedTime;

		private String productKey;

		private String instanceId;

		private String rbacTenantId;

		private Integer status;

		private String info;

		private Long outTime;

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRbacTenantId() {
			return this.rbacTenantId;
		}

		public void setRbacTenantId(String rbacTenantId) {
			this.rbacTenantId = rbacTenantId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getInfo() {
			return this.info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

		public Long getOutTime() {
			return this.outTime;
		}

		public void setOutTime(Long outTime) {
			this.outTime = outTime;
		}
	}

	@Override
	public GetThingModelStatusInnerResponse getInstance(UnmarshallerContext context) {
		return	GetThingModelStatusInnerResponseUnmarshaller.unmarshall(this, context);
	}
}
