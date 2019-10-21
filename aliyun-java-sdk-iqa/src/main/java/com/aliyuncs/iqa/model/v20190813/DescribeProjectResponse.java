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

package com.aliyuncs.iqa.model.v20190813;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iqa.transform.v20190813.DescribeProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProjectResponse extends AcsResponse {

	private String requestId;

	private String projectType;

	private String projectId;

	private String projectName;

	private Long createTime;

	private Long deployTime;

	private String modelId;

	private String modelName;

	private Integer questionCount;

	private String dataStatus;

	private String testServiceStatus;

	private String onlineServiceStatus;

	private String deployAvailable;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
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

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getDeployTime() {
		return this.deployTime;
	}

	public void setDeployTime(Long deployTime) {
		this.deployTime = deployTime;
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getQuestionCount() {
		return this.questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	public String getDataStatus() {
		return this.dataStatus;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getTestServiceStatus() {
		return this.testServiceStatus;
	}

	public void setTestServiceStatus(String testServiceStatus) {
		this.testServiceStatus = testServiceStatus;
	}

	public String getOnlineServiceStatus() {
		return this.onlineServiceStatus;
	}

	public void setOnlineServiceStatus(String onlineServiceStatus) {
		this.onlineServiceStatus = onlineServiceStatus;
	}

	public String getDeployAvailable() {
		return this.deployAvailable;
	}

	public void setDeployAvailable(String deployAvailable) {
		this.deployAvailable = deployAvailable;
	}

	@Override
	public DescribeProjectResponse getInstance(UnmarshallerContext context) {
		return	DescribeProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
