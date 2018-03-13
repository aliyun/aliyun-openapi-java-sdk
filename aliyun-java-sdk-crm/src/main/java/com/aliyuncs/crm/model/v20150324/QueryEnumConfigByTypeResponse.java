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
package com.aliyuncs.crm.model.v20150324;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.crm.transform.v20150324.QueryEnumConfigByTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEnumConfigByTypeResponse extends AcsResponse {

	private Boolean success;

	private String resultCode;

	private String resultMessage;

	private List<BizCategory> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<BizCategory> getData() {
		return this.data;
	}

	public void setData(List<BizCategory> data) {
		this.data = data;
	}

	public static class BizCategory {

		private String enumName;

		private String enumValue;

		public String getenumName() {
			return this.enumName;
		}

		public void setenumName(String enumName) {
			this.enumName = enumName;
		}

		public String getenumValue() {
			return this.enumValue;
		}

		public void setenumValue(String enumValue) {
			this.enumValue = enumValue;
		}
	}

	@Override
	public QueryEnumConfigByTypeResponse getInstance(UnmarshallerContext context) {
		return	QueryEnumConfigByTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
