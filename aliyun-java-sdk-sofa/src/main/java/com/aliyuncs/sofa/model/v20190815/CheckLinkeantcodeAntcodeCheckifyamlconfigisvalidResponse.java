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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long responseStatusCode;

	private String solution;

	private Boolean syntaxError;

	private String syntaxErrorInfo;

	private String unSupportPluginError;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getSolution() {
		return this.solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Boolean getSyntaxError() {
		return this.syntaxError;
	}

	public void setSyntaxError(Boolean syntaxError) {
		this.syntaxError = syntaxError;
	}

	public String getSyntaxErrorInfo() {
		return this.syntaxErrorInfo;
	}

	public void setSyntaxErrorInfo(String syntaxErrorInfo) {
		this.syntaxErrorInfo = syntaxErrorInfo;
	}

	public String getUnSupportPluginError() {
		return this.unSupportPluginError;
	}

	public void setUnSupportPluginError(String unSupportPluginError) {
		this.unSupportPluginError = unSupportPluginError;
	}

	@Override
	public CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse getInstance(UnmarshallerContext context) {
		return	CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
