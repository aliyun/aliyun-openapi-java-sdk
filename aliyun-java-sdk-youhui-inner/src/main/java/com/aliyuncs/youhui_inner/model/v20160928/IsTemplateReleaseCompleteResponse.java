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

package com.aliyuncs.youhui_inner.model.v20160928;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.youhui_inner.transform.v20160928.IsTemplateReleaseCompleteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class IsTemplateReleaseCompleteResponse extends AcsResponse {

	private String requestId;

	private String yhRequestId;

	private Boolean success;

	private String code;

	private String message;

	private String resultJson;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getYhRequestId() {
		return this.yhRequestId;
	}

	public void setYhRequestId(String yhRequestId) {
		this.yhRequestId = yhRequestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getResultJson() {
		return this.resultJson;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}

	@Override
	public IsTemplateReleaseCompleteResponse getInstance(UnmarshallerContext context) {
		return	IsTemplateReleaseCompleteResponseUnmarshaller.unmarshall(this, context);
	}
}
