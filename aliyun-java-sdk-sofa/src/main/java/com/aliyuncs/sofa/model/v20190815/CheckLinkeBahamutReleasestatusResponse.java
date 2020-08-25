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
import com.aliyuncs.sofa.transform.v20190815.CheckLinkeBahamutReleasestatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckLinkeBahamutReleasestatusResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean ready;

		private Boolean releaseApplied;

		private List<String> appsNotApplied;

		private List<String> unitsNotYetReady;

		public Boolean getReady() {
			return this.ready;
		}

		public void setReady(Boolean ready) {
			this.ready = ready;
		}

		public Boolean getReleaseApplied() {
			return this.releaseApplied;
		}

		public void setReleaseApplied(Boolean releaseApplied) {
			this.releaseApplied = releaseApplied;
		}

		public List<String> getAppsNotApplied() {
			return this.appsNotApplied;
		}

		public void setAppsNotApplied(List<String> appsNotApplied) {
			this.appsNotApplied = appsNotApplied;
		}

		public List<String> getUnitsNotYetReady() {
			return this.unitsNotYetReady;
		}

		public void setUnitsNotYetReady(List<String> unitsNotYetReady) {
			this.unitsNotYetReady = unitsNotYetReady;
		}
	}

	@Override
	public CheckLinkeBahamutReleasestatusResponse getInstance(UnmarshallerContext context) {
		return	CheckLinkeBahamutReleasestatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
