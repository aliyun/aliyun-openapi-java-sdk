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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GetImageJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageJobResponse extends AcsResponse {

	private String requestId;

	private String jobId;

	private String jobType;

	private String parameters;

	private String result;

	private String status;

	private String startTime;

	private String endTime;

	private String errorMessage;

	private String notifyEndpoint;

	private String notifyTopicName;

	private Integer progress;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
	}

	public Integer getProgress() {
		return this.progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	@Override
	public GetImageJobResponse getInstance(UnmarshallerContext context) {
		return	GetImageJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
