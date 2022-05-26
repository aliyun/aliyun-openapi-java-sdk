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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.GetCustomerCategoryDictionaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerCategoryDictionaryResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<EnumConfig> data;

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

	public List<EnumConfig> getData() {
		return this.data;
	}

	public void setData(List<EnumConfig> data) {
		this.data = data;
	}

	public static class EnumConfig {

		private String enumValue;

		private String enumName;

		public String getEnumValue() {
			return this.enumValue;
		}

		public void setEnumValue(String enumValue) {
			this.enumValue = enumValue;
		}

		public String getEnumName() {
			return this.enumName;
		}

		public void setEnumName(String enumName) {
			this.enumName = enumName;
		}
	}

	@Override
	public GetCustomerCategoryDictionaryResponse getInstance(UnmarshallerContext context) {
		return	GetCustomerCategoryDictionaryResponseUnmarshaller.unmarshall(this, context);
	}
}
