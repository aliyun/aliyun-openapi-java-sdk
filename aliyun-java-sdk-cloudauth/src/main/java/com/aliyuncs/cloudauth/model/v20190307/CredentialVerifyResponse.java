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

package com.aliyuncs.cloudauth.model.v20190307;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.CredentialVerifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CredentialVerifyResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private ResultObject resultObject;

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

	public ResultObject getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(ResultObject resultObject) {
		this.resultObject = resultObject;
	}

	public static class ResultObject {

		private String result;

		private String riskTag;

		private Map<Object,Object> riskScore;

		private String ocrInfo;

		private String verifyResult;

		private String verifyDetail;

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getRiskTag() {
			return this.riskTag;
		}

		public void setRiskTag(String riskTag) {
			this.riskTag = riskTag;
		}

		public Map<Object,Object> getRiskScore() {
			return this.riskScore;
		}

		public void setRiskScore(Map<Object,Object> riskScore) {
			this.riskScore = riskScore;
		}

		public String getOcrInfo() {
			return this.ocrInfo;
		}

		public void setOcrInfo(String ocrInfo) {
			this.ocrInfo = ocrInfo;
		}

		public String getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(String verifyResult) {
			this.verifyResult = verifyResult;
		}

		public String getVerifyDetail() {
			return this.verifyDetail;
		}

		public void setVerifyDetail(String verifyDetail) {
			this.verifyDetail = verifyDetail;
		}
	}

	@Override
	public CredentialVerifyResponse getInstance(UnmarshallerContext context) {
		return	CredentialVerifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
