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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsUpdateAlarmConfigFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateAlarmConfigFileResponse extends AcsResponse {

	private String status;

	private Boolean finished;

	private String requestId;

	private String errorInfo;

	private String token;

	private Boolean iterationQuery;

	private String approvalUrl;

	private List<String> iterationTokens;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorInfo() {
		return this.errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIterationQuery() {
		return this.iterationQuery;
	}

	public void setIterationQuery(Boolean iterationQuery) {
		this.iterationQuery = iterationQuery;
	}

	public String getApprovalUrl() {
		return this.approvalUrl;
	}

	public void setApprovalUrl(String approvalUrl) {
		this.approvalUrl = approvalUrl;
	}

	public List<String> getIterationTokens() {
		return this.iterationTokens;
	}

	public void setIterationTokens(List<String> iterationTokens) {
		this.iterationTokens = iterationTokens;
	}

	@Override
	public OpsUpdateAlarmConfigFileResponse getInstance(UnmarshallerContext context) {
		return	OpsUpdateAlarmConfigFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
