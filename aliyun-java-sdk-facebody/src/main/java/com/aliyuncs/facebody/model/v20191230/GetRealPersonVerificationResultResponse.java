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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.GetRealPersonVerificationResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRealPersonVerificationResultResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

		private String materialMatch;

		private Boolean pass;

		private String identityInfo;

		public String getMaterialMatch() {
			return this.materialMatch;
		}

		public void setMaterialMatch(String materialMatch) {
			this.materialMatch = materialMatch;
		}

		public Boolean getPass() {
			return this.pass;
		}

		public void setPass(Boolean pass) {
			this.pass = pass;
		}

		public String getIdentityInfo() {
			return this.identityInfo;
		}

		public void setIdentityInfo(String identityInfo) {
			this.identityInfo = identityInfo;
		}
	}

	@Override
	public GetRealPersonVerificationResultResponse getInstance(UnmarshallerContext context) {
		return	GetRealPersonVerificationResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
