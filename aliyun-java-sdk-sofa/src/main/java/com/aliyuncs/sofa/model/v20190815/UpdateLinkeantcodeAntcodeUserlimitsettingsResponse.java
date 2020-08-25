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
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeantcodeAntcodeUserlimitsettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeUserlimitsettingsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long limitRateKbytesPerSec;

	private Long limitReqPerSec;

	private Long responseStatusCode;

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

	public Long getLimitRateKbytesPerSec() {
		return this.limitRateKbytesPerSec;
	}

	public void setLimitRateKbytesPerSec(Long limitRateKbytesPerSec) {
		this.limitRateKbytesPerSec = limitRateKbytesPerSec;
	}

	public Long getLimitReqPerSec() {
		return this.limitReqPerSec;
	}

	public void setLimitReqPerSec(Long limitReqPerSec) {
		this.limitReqPerSec = limitReqPerSec;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	@Override
	public UpdateLinkeantcodeAntcodeUserlimitsettingsResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeantcodeAntcodeUserlimitsettingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
