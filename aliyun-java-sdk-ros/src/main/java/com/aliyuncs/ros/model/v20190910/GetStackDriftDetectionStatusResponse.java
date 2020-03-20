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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetStackDriftDetectionStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackDriftDetectionStatusResponse extends AcsResponse {

	private String requestId;

	private String driftDetectionId;

	private String driftDetectionTime;

	private String driftDetectionStatus;

	private String driftDetectionStatusReason;

	private String stackDriftStatus;

	private String stackId;

	private Integer driftedStackResourceCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDriftDetectionId() {
		return this.driftDetectionId;
	}

	public void setDriftDetectionId(String driftDetectionId) {
		this.driftDetectionId = driftDetectionId;
	}

	public String getDriftDetectionTime() {
		return this.driftDetectionTime;
	}

	public void setDriftDetectionTime(String driftDetectionTime) {
		this.driftDetectionTime = driftDetectionTime;
	}

	public String getDriftDetectionStatus() {
		return this.driftDetectionStatus;
	}

	public void setDriftDetectionStatus(String driftDetectionStatus) {
		this.driftDetectionStatus = driftDetectionStatus;
	}

	public String getDriftDetectionStatusReason() {
		return this.driftDetectionStatusReason;
	}

	public void setDriftDetectionStatusReason(String driftDetectionStatusReason) {
		this.driftDetectionStatusReason = driftDetectionStatusReason;
	}

	public String getStackDriftStatus() {
		return this.stackDriftStatus;
	}

	public void setStackDriftStatus(String stackDriftStatus) {
		this.stackDriftStatus = stackDriftStatus;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public Integer getDriftedStackResourceCount() {
		return this.driftedStackResourceCount;
	}

	public void setDriftedStackResourceCount(Integer driftedStackResourceCount) {
		this.driftedStackResourceCount = driftedStackResourceCount;
	}

	@Override
	public GetStackDriftDetectionStatusResponse getInstance(UnmarshallerContext context) {
		return	GetStackDriftDetectionStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
