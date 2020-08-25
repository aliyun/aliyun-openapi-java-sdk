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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.PushLinkeBahamutWebapireleasesubmitreleasebyenvResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String cloudTenantId;

		private String cloudTenantName;

		private String preEnvReleaseInfo;

		private String prodEnvReleaseInfo;

		public String getCloudTenantId() {
			return this.cloudTenantId;
		}

		public void setCloudTenantId(String cloudTenantId) {
			this.cloudTenantId = cloudTenantId;
		}

		public String getCloudTenantName() {
			return this.cloudTenantName;
		}

		public void setCloudTenantName(String cloudTenantName) {
			this.cloudTenantName = cloudTenantName;
		}

		public String getPreEnvReleaseInfo() {
			return this.preEnvReleaseInfo;
		}

		public void setPreEnvReleaseInfo(String preEnvReleaseInfo) {
			this.preEnvReleaseInfo = preEnvReleaseInfo;
		}

		public String getProdEnvReleaseInfo() {
			return this.prodEnvReleaseInfo;
		}

		public void setProdEnvReleaseInfo(String prodEnvReleaseInfo) {
			this.prodEnvReleaseInfo = prodEnvReleaseInfo;
		}
	}

	@Override
	public PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse getInstance(UnmarshallerContext context) {
		return	PushLinkeBahamutWebapireleasesubmitreleasebyenvResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
