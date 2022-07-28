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

package com.aliyuncs.eas.model.v20210701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeBenchmarkTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBenchmarkTaskResponse extends AcsResponse {

	private String requestId;

	private String taskName;

	private String taskId;

	private String serviceName;

	private String token;

	private String callerUid;

	private String parentUid;

	private Long desiredAgent;

	private Long availableAgent;

	private String status;

	private String reason;

	private String message;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(String callerUid) {
		this.callerUid = callerUid;
	}

	public String getParentUid() {
		return this.parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public Long getDesiredAgent() {
		return this.desiredAgent;
	}

	public void setDesiredAgent(Long desiredAgent) {
		this.desiredAgent = desiredAgent;
	}

	public Long getAvailableAgent() {
		return this.availableAgent;
	}

	public void setAvailableAgent(Long availableAgent) {
		this.availableAgent = availableAgent;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public DescribeBenchmarkTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeBenchmarkTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
