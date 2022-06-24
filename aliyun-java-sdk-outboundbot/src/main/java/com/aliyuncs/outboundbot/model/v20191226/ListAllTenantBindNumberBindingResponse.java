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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListAllTenantBindNumberBindingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAllTenantBindNumberBindingResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

		private List<ListItem> list;

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String bindingId;

			private String number;

			private String trunkName;

			private String serializedParams;

			private String billingType;

			private List<String> instanceNameList;

			public String getBindingId() {
				return this.bindingId;
			}

			public void setBindingId(String bindingId) {
				this.bindingId = bindingId;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getTrunkName() {
				return this.trunkName;
			}

			public void setTrunkName(String trunkName) {
				this.trunkName = trunkName;
			}

			public String getSerializedParams() {
				return this.serializedParams;
			}

			public void setSerializedParams(String serializedParams) {
				this.serializedParams = serializedParams;
			}

			public String getBillingType() {
				return this.billingType;
			}

			public void setBillingType(String billingType) {
				this.billingType = billingType;
			}

			public List<String> getInstanceNameList() {
				return this.instanceNameList;
			}

			public void setInstanceNameList(List<String> instanceNameList) {
				this.instanceNameList = instanceNameList;
			}
		}
	}

	@Override
	public ListAllTenantBindNumberBindingResponse getInstance(UnmarshallerContext context) {
		return	ListAllTenantBindNumberBindingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
