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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskResponse extends AcsResponse {

	private String requestId;

	private String projectId;

	private String projectName;

	private String type;

	private String objectType;

	private String objectId;

	private String status;

	private String config;

	private String runningConfig;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private String gmtExecutedTime;

	private String gmtFinishedTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getRunningConfig() {
		return this.runningConfig;
	}

	public void setRunningConfig(String runningConfig) {
		this.runningConfig = runningConfig;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public String getGmtExecutedTime() {
		return this.gmtExecutedTime;
	}

	public void setGmtExecutedTime(String gmtExecutedTime) {
		this.gmtExecutedTime = gmtExecutedTime;
	}

	public String getGmtFinishedTime() {
		return this.gmtFinishedTime;
	}

	public void setGmtFinishedTime(String gmtFinishedTime) {
		this.gmtFinishedTime = gmtFinishedTime;
	}

	@Override
	public GetTaskResponse getInstance(UnmarshallerContext context) {
		return	GetTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
