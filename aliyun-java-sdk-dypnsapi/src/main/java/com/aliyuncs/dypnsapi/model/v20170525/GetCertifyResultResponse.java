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

package com.aliyuncs.dypnsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.GetCertifyResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCertifyResultResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String verifyResult;

		private String verifyDesc;

		private String identityInfo;

		private String deviceToken;

		private String materialInfo;

		public String getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(String verifyResult) {
			this.verifyResult = verifyResult;
		}

		public String getVerifyDesc() {
			return this.verifyDesc;
		}

		public void setVerifyDesc(String verifyDesc) {
			this.verifyDesc = verifyDesc;
		}

		public String getIdentityInfo() {
			return this.identityInfo;
		}

		public void setIdentityInfo(String identityInfo) {
			this.identityInfo = identityInfo;
		}

		public String getDeviceToken() {
			return this.deviceToken;
		}

		public void setDeviceToken(String deviceToken) {
			this.deviceToken = deviceToken;
		}

		public String getMaterialInfo() {
			return this.materialInfo;
		}

		public void setMaterialInfo(String materialInfo) {
			this.materialInfo = materialInfo;
		}
	}

	@Override
	public GetCertifyResultResponse getInstance(UnmarshallerContext context) {
		return	GetCertifyResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
