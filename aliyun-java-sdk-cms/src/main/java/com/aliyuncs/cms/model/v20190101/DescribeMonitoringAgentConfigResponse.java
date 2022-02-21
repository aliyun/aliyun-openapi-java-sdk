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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitoringAgentConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitoringAgentConfigResponse extends AcsResponse {

	private String enableActiveAlert;

	private String requestId;

	private Boolean autoInstall;

	private Boolean success;

	private Boolean enableInstallAgentNewECS;

	private String code;

	private String message;

	public String getEnableActiveAlert() {
		return this.enableActiveAlert;
	}

	public void setEnableActiveAlert(String enableActiveAlert) {
		this.enableActiveAlert = enableActiveAlert;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getAutoInstall() {
		return this.autoInstall;
	}

	public void setAutoInstall(Boolean autoInstall) {
		this.autoInstall = autoInstall;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getEnableInstallAgentNewECS() {
		return this.enableInstallAgentNewECS;
	}

	public void setEnableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
		this.enableInstallAgentNewECS = enableInstallAgentNewECS;
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

	@Override
	public DescribeMonitoringAgentConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitoringAgentConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
