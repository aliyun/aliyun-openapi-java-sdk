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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.QueryBlockchainDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBlockchainDataResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String privacyData;

		private String plainData;

		private String privacyRuleId;

		private String algType;

		public String getPrivacyData() {
			return this.privacyData;
		}

		public void setPrivacyData(String privacyData) {
			this.privacyData = privacyData;
		}

		public String getPlainData() {
			return this.plainData;
		}

		public void setPlainData(String plainData) {
			this.plainData = plainData;
		}

		public String getPrivacyRuleId() {
			return this.privacyRuleId;
		}

		public void setPrivacyRuleId(String privacyRuleId) {
			this.privacyRuleId = privacyRuleId;
		}

		public String getAlgType() {
			return this.algType;
		}

		public void setAlgType(String algType) {
			this.algType = algType;
		}
	}

	@Override
	public QueryBlockchainDataResponse getInstance(UnmarshallerContext context) {
		return	QueryBlockchainDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
