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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.RunDiskOpsActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RunDiskOpsActivityResponse extends AcsResponse {

	private String requestId;

	private String clusterType;

	private String currentActivity;

	private String activityState;

	private String errorMessage;

	private Boolean needReboot;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public String getCurrentActivity() {
		return this.currentActivity;
	}

	public void setCurrentActivity(String currentActivity) {
		this.currentActivity = currentActivity;
	}

	public String getActivityState() {
		return this.activityState;
	}

	public void setActivityState(String activityState) {
		this.activityState = activityState;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getNeedReboot() {
		return this.needReboot;
	}

	public void setNeedReboot(Boolean needReboot) {
		this.needReboot = needReboot;
	}

	@Override
	public RunDiskOpsActivityResponse getInstance(UnmarshallerContext context) {
		return	RunDiskOpsActivityResponseUnmarshaller.unmarshall(this, context);
	}
}
